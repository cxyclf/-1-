# **软件工程实训任务一交付简介**

## **完成内容**

* 对给出的command，command Word,Room类进行代码注释
* 对Game类进行一些代码优化
* 几个类的UML图表示

### 代码优化部分

```java
if (commandWord.equals("help")) {
    printHelp();
}
else if (commandWord.equals("go")) {
    goRoom(command);
}
else if (commandWord.equals("quit")) {
    wantToQuit = quit(command);
}
```

> 这里的if，else重复过多可以用一个switch语句进行替换

```java
switch(commandWord) {
    case "help":printHelp();break;
    case "go": goRoom(command);break;
    case "quit":wantToQuit = quit(command);break;
    default: ;break;
}
```

> 尝试过在default语句中把以下语句添加进去

```java
if(command.isUnknown()) {
    System.out.println("I don't know what you mean...");
    return false;
}
```

> 但是运行的结果总是出错的，想不到更好的方法把这个bool类型加入进去

### UML图



！[UML图](/UML.png)

