
# Maven
IT is build tool which is used to manage project dependencies, create a built copy, used for deployment, used for packaging

- Maven is a poerfull project management tool that is based on POM (Project object Model)
- It is used for projet build, dependency and documenentation
- it simplifies the build process like ANT, but it is more advance then ANY

Apache Maven helps to manage
- build
- documentation
- release
- distribution


# What is a built tool?
A built tool take care of everything for building a process
- generate source code
- generate documentation from source code
- compile source code
- packages compile code into JAR file
- install the packaged code in local repository, server repositiry and central repo


# Meven repository
it refer to the directories of packaged JAR file that contain metadata, the metadata refere to the POM file relavent to each
other project. this metadata is what allow meven to download dependencies

There are 3 type of repository
1. local respository - your PC
2. Remote repository - any server
3. Central repository - internet

# Basic concept of Maven

1. POM (Project Object Model)
- it refer to the XML file that have all the information regarding project and configuration details
- it has the description of the peoject detail regarding the versioning and configuraton management of the project
- the xml file is in the project home directory. maven search for POM in the currenbt directory when any task id to be executed

> Dependencies - refer to the java libraries that are needed for the project
> repository - refer to the directories of packaged JAR file

if the dependencies are not present in your local repository then maven download them from the central repository and store
then in your local repo


# Maven Archirecture
Maven ---> POM.xml------> maven repostory

1. read POM.xml file
2. download dependencies define in POM.xml into local repo from central repo
3. create and generate a report accroding to the requirement and execute life cycle, phase, goal, plugin etc


# Maven build life cycle
- maven life cyclke is a collection of steps that are to be followed to build a project
there are three build-in buld life cycle
1. default - handles project deployment
2. clean - handles project cleaning
3. site - handles the creation of project site documentation


compile -> test-compile -> test -> package -> integration-test -> verify - > install -> deploy


> mvn install
> mvn clean
> mvn --version



# Git

- Git is a distributed version control or source code management system
- Git is free software distributed under GNU license

# Version Control System (VCS)
it is a software that helps software develoiper to work togther and maintain a complete history of their work
- Allow developers to work simultenosly
- prevent overwirting each other changes
- maintain a hostory of every versuion

# Type of version control system
- centralized version control system
- distributed / decentralized version control sytem

# Centralized version control system
it used a central server to store all file and folder and enable team collaborate. but the major drawback of CVCS is its single
point of failure. in that case if the central server goes down for an hour then during that time no one can collaborate with each other
if that server get corrupt or broken the you will lose the entire history of the project

# Distributed version control system we not only checkout latest snapshot of the directory but we take full mirrar image of the repo
if the server goes down then the rep from any client can be copied back to the server



# Advantages of Git
1. free and open source
2. fast
3. implicit backup
4. security
5. no powerfull hardware
6. branch


# Git vs GitHub



> untracked file
> stagged
> tracked file

# Git Command

> git --version

> git config --list
> git config --global user.name
> git config --global user.email
> git config --global user.name "<name>"
> git config --global user.name "<email>"

> git init
> git status
> git add <file_name>
> git add .  // all files
> git rm --cache <file_name>
> git commit -m "<commit message>"

> git remote -v
> git remote add origin <github _url>

> git push origin master


> git init -> git add -> git commit -> git push


> git branch <new_feature>



# Git branch

> git branch     // list of branch
> git branch <branch_name>
> git checkout <branch_name>
> git merge <branch_name>   // make sure to first checkout in the branch in which you want to merge
> git branch -d <branch_name>

> git clone <git_url>

Exercise
1. clone repository
2. create branch by your name
3. checkout in your branch
4. create your_name.text
5. add
6. commit
7. push your branch into github



























































