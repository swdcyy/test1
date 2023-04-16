package com.yxcorp.utility.SystemUtil$LEVEL;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class SystemUtil$LEVEL extends Enum	// class@001400
{
    public int value;
    public static final SystemUtil$LEVEL[] $VALUES;
    public static final SystemUtil$LEVEL BAD;
    public static final SystemUtil$LEVEL BEST;
    public static final SystemUtil$LEVEL HIGH;
    public static final SystemUtil$LEVEL LOW;
    public static final SystemUtil$LEVEL MIDDLE;
    public static final SystemUtil$LEVEL UN_KNOW;

    static {
       SystemUtil$LEVEL lEVEL = new SystemUtil$LEVEL("BEST", 0, 5);
       SystemUtil$LEVEL.BEST = lEVEL;
       SystemUtil$LEVEL lEVEL1 = new SystemUtil$LEVEL("HIGH", 1, 4);
       SystemUtil$LEVEL.HIGH = lEVEL1;
       SystemUtil$LEVEL lEVEL2 = new SystemUtil$LEVEL("MIDDLE", 2, 3);
       SystemUtil$LEVEL.MIDDLE = lEVEL2;
       SystemUtil$LEVEL lEVEL3 = new SystemUtil$LEVEL("LOW", 3, 2);
       SystemUtil$LEVEL.LOW = lEVEL3;
       SystemUtil$LEVEL lEVEL4 = new SystemUtil$LEVEL("BAD", 4, 1);
       SystemUtil$LEVEL.BAD = lEVEL4;
       SystemUtil$LEVEL lEVEL5 = new SystemUtil$LEVEL("UN_KNOW", 5, -1);
       SystemUtil$LEVEL.UN_KNOW = lEVEL5;
       SystemUtil$LEVEL[] lEVELArray = new SystemUtil$LEVEL[]{lEVEL,lEVEL1,lEVEL2,lEVEL3,lEVEL4,lEVEL5};
       SystemUtil$LEVEL.$VALUES = lEVELArray;
    }
    public void SystemUtil$LEVEL(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static SystemUtil$LEVEL valueOf(String p0){
       return Enum.valueOf(SystemUtil$LEVEL.class, p0);
    }
    public static SystemUtil$LEVEL[] values(){
       return SystemUtil$LEVEL.$VALUES.clone();
    }
    public int getValue(){
       return this.value;
    }
}
