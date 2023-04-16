package com.yxcorp.utility.Log$LEVEL;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class Log$LEVEL extends Enum	// class@0013f6
{
    public final int level;
    public final String levelString;
    public static final Log$LEVEL[] $VALUES;
    public static final Log$LEVEL ASSERT;
    public static final Log$LEVEL DEBUG;
    public static final Log$LEVEL ERROR;
    public static final Log$LEVEL INFO;
    public static final Log$LEVEL VERBOSE;
    public static final Log$LEVEL WARN;

    static {
       Log$LEVEL lEVEL = new Log$LEVEL("VERBOSE", 0, 2, "V");
       Log$LEVEL.VERBOSE = lEVEL;
       Log$LEVEL lEVEL1 = new Log$LEVEL("DEBUG", 1, 3, "D");
       Log$LEVEL.DEBUG = lEVEL1;
       Log$LEVEL lEVEL2 = new Log$LEVEL("INFO", 2, 4, "I");
       Log$LEVEL.INFO = lEVEL2;
       Log$LEVEL lEVEL3 = new Log$LEVEL("WARN", 3, 5, "W");
       Log$LEVEL.WARN = lEVEL3;
       Log$LEVEL lEVEL4 = new Log$LEVEL("ERROR", 4, 6, "E");
       Log$LEVEL.ERROR = lEVEL4;
       Log$LEVEL lEVEL5 = new Log$LEVEL("ASSERT", 5, 7, "A");
       Log$LEVEL.ASSERT = lEVEL5;
       Log$LEVEL[] lEVELArray = new Log$LEVEL[]{lEVEL,lEVEL1,lEVEL2,lEVEL3,lEVEL4,lEVEL5};
       Log$LEVEL.$VALUES = lEVELArray;
    }
    public void Log$LEVEL(String p0,int p1,int p2,String p3){
       super(p0, p1);
       this.level = p2;
       this.levelString = p3;
    }
    public static Log$LEVEL valueOf(String p0){
       return Enum.valueOf(Log$LEVEL.class, p0);
    }
    public static Log$LEVEL[] values(){
       return Log$LEVEL.$VALUES.clone();
    }
    public int getLevel(){
       return this.level;
    }
    public String getLevelString(){
       return this.levelString;
    }
}
