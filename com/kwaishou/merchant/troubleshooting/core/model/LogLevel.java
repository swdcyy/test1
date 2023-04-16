package com.kwaishou.merchant.troubleshooting.core.model.LogLevel;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class LogLevel extends Enum	// class@001350
{
    public int level;
    public static final LogLevel[] $VALUES;
    public static final LogLevel HIGH;
    public static final LogLevel LOW;
    public static final LogLevel NORMAL;

    public static final LogLevel[] $values(){
       LogLevel[] logLevelArra = new LogLevel[]{LogLevel.LOW,LogLevel.NORMAL,LogLevel.HIGH};
       return logLevelArra;
    }
    static {
       LogLevel.LOW = new LogLevel("LOW", 0, 5);
       LogLevel.NORMAL = new LogLevel("NORMAL", 1, 10);
       LogLevel.HIGH = new LogLevel("HIGH", 2, 20);
       LogLevel.$VALUES = LogLevel.$values();
    }
    public void LogLevel(String p0,int p1,int p2){
       super(p0, p1);
       this.level = p2;
    }
    public static LogLevel valueOf(String p0){
       return Enum.valueOf(LogLevel.class, p0);
    }
    public static LogLevel[] values(){
       return LogLevel.$VALUES.clone();
    }
    public final int getLevel(){
       return this.level;
    }
    public final void setLevel(int p0){
       this.level = p0;
    }
}
