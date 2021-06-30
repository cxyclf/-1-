package cn.edu.whut.sept.zuul;

public class CommandWords {
    /**用户能选择的命令.*/
    private static final String[] validCommands = {
            "go", "quit", "help"
    };

    /**空构造函数.*/
    public CommandWords() {
        // nothing to do at the moment...
    }

    /**
     * 用布尔型判断输入的命令是否是有效命令.
     * @return 当输入的命令长度等于有效命令长度时返回true,否则返回false.
     * @param aString 键盘输入的命令*/
    public boolean isCommand(String aString) {
        for (int i = 0; i < validCommands.length; i++) {
            if (validCommands[i].equals(aString)) {
                return true;
            }
        }
        return false;
    }

    /**输出所输入的命令.*/
    public void showAll() {
        for (String command: validCommands) {
            System.out.print(command + "  ");
        }
        System.out.println();
    }
}
