package com.kuaishou.webkit.ConsoleMessage$MessageLevel;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ConsoleMessage$MessageLevel extends Enum	// class@001245
{
    public static final ConsoleMessage$MessageLevel[] $VALUES;
    public static final ConsoleMessage$MessageLevel DEBUG;
    public static final ConsoleMessage$MessageLevel ERROR;
    public static final ConsoleMessage$MessageLevel LOG;
    public static final ConsoleMessage$MessageLevel TIP;
    public static final ConsoleMessage$MessageLevel WARNING;

    static {
       ConsoleMessage$MessageLevel messageLevel = new ConsoleMessage$MessageLevel("TIP", 0);
       ConsoleMessage$MessageLevel.TIP = messageLevel;
       ConsoleMessage$MessageLevel messageLevel1 = new ConsoleMessage$MessageLevel("LOG", 1);
       ConsoleMessage$MessageLevel.LOG = messageLevel1;
       ConsoleMessage$MessageLevel messageLevel2 = new ConsoleMessage$MessageLevel("WARNING", 2);
       ConsoleMessage$MessageLevel.WARNING = messageLevel2;
       ConsoleMessage$MessageLevel messageLevel3 = new ConsoleMessage$MessageLevel("ERROR", 3);
       ConsoleMessage$MessageLevel.ERROR = messageLevel3;
       ConsoleMessage$MessageLevel messageLevel4 = new ConsoleMessage$MessageLevel("DEBUG", 4);
       ConsoleMessage$MessageLevel.DEBUG = messageLevel4;
       ConsoleMessage$MessageLevel[] messageLevel5 = new ConsoleMessage$MessageLevel[]{messageLevel,messageLevel1,messageLevel2,messageLevel3,messageLevel4};
       ConsoleMessage$MessageLevel.$VALUES = messageLevel5;
    }
    public void ConsoleMessage$MessageLevel(String p0,int p1){
       super(p0, p1);
    }
    public static ConsoleMessage$MessageLevel valueOf(String p0){
       return Enum.valueOf(ConsoleMessage$MessageLevel.class, p0);
    }
    public static ConsoleMessage$MessageLevel[] values(){
       return ConsoleMessage$MessageLevel.$VALUES.clone();
    }
}
