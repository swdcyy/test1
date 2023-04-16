package com.yxcorp.gifshow.widget.popup.KwaiBubbleOption$Level;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class KwaiBubbleOption$Level extends Enum	// class@00199e
{
    public static final KwaiBubbleOption$Level[] $VALUES;
    public static final KwaiBubbleOption$Level LEVEL_1;
    public static final KwaiBubbleOption$Level LEVEL_2;
    public static final KwaiBubbleOption$Level LEVEL_3;
    public static final KwaiBubbleOption$Level LEVEL_S;

    static {
       KwaiBubbleOption$Level level = new KwaiBubbleOption$Level("LEVEL_S", 0);
       KwaiBubbleOption$Level.LEVEL_S = level;
       KwaiBubbleOption$Level level1 = new KwaiBubbleOption$Level("LEVEL_1", 1);
       KwaiBubbleOption$Level.LEVEL_1 = level1;
       KwaiBubbleOption$Level level2 = new KwaiBubbleOption$Level("LEVEL_2", 2);
       KwaiBubbleOption$Level.LEVEL_2 = level2;
       KwaiBubbleOption$Level level3 = new KwaiBubbleOption$Level("LEVEL_3", 3);
       KwaiBubbleOption$Level.LEVEL_3 = level3;
       KwaiBubbleOption$Level[] levelArray = new KwaiBubbleOption$Level[]{level,level1,level2,level3};
       KwaiBubbleOption$Level.$VALUES = levelArray;
    }
    public void KwaiBubbleOption$Level(String p0,int p1){
       super(p0, p1);
    }
    public static KwaiBubbleOption$Level valueOf(String p0){
       return Enum.valueOf(KwaiBubbleOption$Level.class, p0);
    }
    public static KwaiBubbleOption$Level[] values(){
       return KwaiBubbleOption$Level.$VALUES.clone();
    }
}
