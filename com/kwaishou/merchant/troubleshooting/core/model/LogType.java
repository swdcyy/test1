package com.kwaishou.merchant.troubleshooting.core.model.LogType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class LogType extends Enum	// class@001352
{
    public static final LogType[] $VALUES;
    public static final LogType DETAIL;
    public static final LogType ERROR;
    public static final LogType KEY;
    public static final LogType WARNING;

    public static final LogType[] $values(){
       LogType[] logTypeArray = new LogType[]{LogType.DETAIL,LogType.KEY,LogType.WARNING,LogType.ERROR};
       return logTypeArray;
    }
    static {
       LogType.DETAIL = new LogType("DETAIL", 0);
       LogType.KEY = new LogType("KEY", 1);
       LogType.WARNING = new LogType("WARNING", 2);
       LogType.ERROR = new LogType("ERROR", 3);
       LogType.$VALUES = LogType.$values();
    }
    public void LogType(String p0,int p1){
       super(p0, p1);
    }
    public static LogType valueOf(String p0){
       return Enum.valueOf(LogType.class, p0);
    }
    public static LogType[] values(){
       return LogType.$VALUES.clone();
    }
}
