package cn.edu.whut.sept.zuul;

import java.util.Set;
import java.util.HashMap;

/**  */

public class Room {
    /**描述信息变量.*/
    private String description;
    /**定义哈希Map.*/
    private HashMap<String, Room> exits;

    /**根据提供的description根据Hashmap构建新场景.
     *@param description 参数描述信息 .*/
    public Room(String description) {
        this.description = description;
        exits = new HashMap<>();
    }

    /**根据description确认当前room的邻接room.
     * @param direction 参数方位.
     * @param neighbor room的相邻room*/
    public void setExit(String direction, Room neighbor) {
        exits.put(direction, neighbor);
    }

    /**@return 将私有变量description暴露.*/
    public String getShortDescription() {
        return description;
    }

    /**@return 返回玩家当前所在位置.*/
    public String getLongDescription() {
        return "You are " + description + ".\n" + getExitString();
    }

    /**@return 返回所有方位出口信息.*/
    private String getExitString() {
        String returnString = "Exits:";
        Set<String> keys = exits.keySet();
        for (String exit : keys) {
            returnString += " " + exit;
        }
        return returnString;
    }

    /**@return 返回一下出口方位.
     *@param direction 参数方位 .*/
    public Room getExit(String direction) {
        return exits.get(direction);
    }
}


