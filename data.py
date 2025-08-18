import json

data = {Name: "Ajay Kumar", Role: "DevOps Engineer", Experience: "3 years", City: "Pune"}
with open('data.json', 'w') as file:
    json.dump(data, file, indent=4)


with open('data.json', 'r') as read_file:
    data = json.load(read_file)
    print(f"Json Content: ", data)


with open('note.txt', 'w') as note:
    note.write("This is a sample note file.\n")
    note.write("You can add any text here.\n")

with open('note.txt', 'r') as note:
    content = note.read()
    print(f"Note Content: \n{content}")
