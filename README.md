## Getting Started

1. pull ts  
2. once in the working directory, get the JUnit java archive (Testing -> enable java tests)

## Set Up git
- By default, the origin of your local repository is set to THIS current repository, which is public and read-only. 
- To push your changes to your own GitHub repository, you need to change the origin to your own repository. Your local repository should have two remotes: 
  - `origin`: your own repository (read and write)
  - `upstream`: this repository (read-only)
- To do so, follow these steps:
  1. Create a new repository on your GitHub account (do not initialize it with a README, .gitignore, or license).
  2. In your local repository, run the following commands:
     ```
     git remote rename origin upstream
     git remote add origin <your-repo-url>
     ```
  3. Verify that the new origin is set correctly by running:
     ```
     git remote -v
     ```
  4. Now you can push your changes to your own repository using:
     ```
      git push origin main # or master, depending on your branch name
      ```
  5. To pull updates from this repository, use:
      ```
      git pull upstream master # or master, depending on the branch name of this repo
      ```

## Folder Structure

The workspace contains two folders, where:

- `src/solutions`: the folder to maintain your source code. Note that this should be the only directory you edit.
  - To prevent version control issues, STRICTLY follow the instructions in each problemset's instruction file.
- `src/tests`: the folder for all test cases 
