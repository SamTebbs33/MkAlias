# MkAlias
A java app that makes bash aliases for you!

Please note that it will only work on UNIX based systems, or perhaps programs that emulate one (not tested).

# Contents
* <a href="#Features">Features</a>
* <a href="#Installation">Installation</a>
* <a href="#Usage">Usage</a>

<a id="Features">Features
==========================
* Automatically creates a new alias for you
* The aliases can be stored in a file of your choice (soon!)
* List all previously created aliases (soon!)

<a id="Installation">Installation
==========================
Please note that this app only works on unix based systems! (It may work with unix shell emulators however)
* Download the a jar file from the **Releases** tab and place in any directory
* Enter the following command, replacing _dir_ with the path to the current directory

```
$ alias mkalias='java -jar dir/MkAlias.jar'
```

<a id="Usage">Usage
==========================
* Enter the following command, replacing _name_ with the alias name and _command_ with the command it should execute (You'll have to surround it with speech marks if the command contains spaces).
```
$ mkalias name command
```

* Now start a new bash session or reload your *.bash_profile* file. You will now be able to use the alias!

