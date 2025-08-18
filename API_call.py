import os
import requests

# ✅ Define variables globally
TOKEN = os.getenv("GITHUB_TOKEN")
REPO = "AjayKumar9375/ci-cd_demo"
URL = f"https://api.github.com/repos/{REPO}/pulls?state=open"

def get_pull_requests():
    headers = {
        "Authorization": f"Bearer {TOKEN}",
        "Accept": "application/vnd.github.v3+json"
    }

    response = requests.get(URL, headers=headers)
    if response.status_code != 200:
        print(f"❌ Failed to fetch PRs: {response.status_code} - {response.text}")
        return

    prs = response.json()
    if not prs:
        print("No open PRs found.")
        return

    for pr in prs:
        print(f"🔹 PR Number: {pr['number']}")
        print(f"   Title: {pr['title']}")
        print(f"   Author: {pr['user']['login']}")
        print(f"   Source Branch: {pr['head']['ref']}")
        print(f"   Target Branch: {pr['base']['ref']}")
        print("")

if __name__ == "__main__":
    get_pull_requests()

