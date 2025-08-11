from setuptools import setup, find_packages

setup(
    name="my_app",
    version="1.0.0",
    packages=find_packages(),
    install_requires=[
        # Add your dependencies here
        "requests"
    ],
    entry_points={
        "console_scripts": [
            "my_app = my_app.main:main"
        ]
    }
)
