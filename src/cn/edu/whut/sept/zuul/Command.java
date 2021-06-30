package cn.edu.whut.sept.zuul;

public class Command {
    /**第一个命令字段.*/
    private String commandWord;
    /**第二个命令字段.*/
    private String secondWord;

    /**将键盘输入的命令赋予给字段.
     * @param firstWord 键盘输入的第一个命令
     *@param secondWord 键盘输入的第二个命令*/
    public Command(String firstWord, String secondWord) {
        commandWord = firstWord;
        this.secondWord = secondWord;
    }

    /**@return 用return方法暴露commandWord.*/
    public String getCommandWord() {
        return commandWord;
    }

    /**@return 用return方法暴露secondWord.*/
    public String getSecondWord() {
        return secondWord;
    }

    /**用一个布尔型判断commandWord是否为空.
     * @return 返回commandWord==null的结果，若相等返回ture，不相等返回false.*/
    public boolean isUnknown() {
        return (commandWord == null);
    }

    /**用一个布尔型判断commandWord是否为空.
     * @return 返回commandWord==null的结果，若相等返回ture，不相等返回false*/
    public boolean hasSecondWord() {
        return (secondWord != null);
    }

}
