# Java
## Install
```
sudo apt update
sudo apt install openjdk-21-jdk
```
## Setting JAVA_HOME
```
sudo vim ~/.bashrc
```
```
export JAVA_HOME=/usr/lib/jvm/java-21-openjdk-amd64
```

## Check
```
java -version
javac -version
```

# NOTE
Installation using apt does not control scala versions.
scala install using SDKMAN! 

# SDKMAN! 
## Install 
```
sudo apt install unzip
curl -s "https://get.sdkman.io" | bash
source "$HOME/.sdkman/bin/sdkman-init.sh"
```

## Install Scala
```
sdk version
```

# Scala
## Install 
```
sdk install scala 2.12.18
```

## Check
```
scala -version
```
