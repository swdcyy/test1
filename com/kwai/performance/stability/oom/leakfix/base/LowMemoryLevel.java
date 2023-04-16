package com.kwai.performance.stability.oom.leakfix.base.LowMemoryLevel;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class LowMemoryLevel extends Enum	// class@00123e
{
    public static final LowMemoryLevel[] $VALUES;
    public static final LowMemoryLevel LEVEL1;
    public static final LowMemoryLevel LEVEL2;
    public static final LowMemoryLevel LEVEL3;
    public static final LowMemoryLevel LEVEL4;
    public static final LowMemoryLevel LEVEL5;

    static {
       LowMemoryLevel lowMemoryLev = new LowMemoryLevel("LEVEL1", 0);
       LowMemoryLevel.LEVEL1 = lowMemoryLev;
       LowMemoryLevel lowMemoryLev1 = new LowMemoryLevel("LEVEL2", 1);
       LowMemoryLevel.LEVEL2 = lowMemoryLev1;
       LowMemoryLevel lowMemoryLev2 = new LowMemoryLevel("LEVEL3", 2);
       LowMemoryLevel.LEVEL3 = lowMemoryLev2;
       LowMemoryLevel lowMemoryLev3 = new LowMemoryLevel("LEVEL4", 3);
       LowMemoryLevel.LEVEL4 = lowMemoryLev3;
       LowMemoryLevel lowMemoryLev4 = new LowMemoryLevel("LEVEL5", 4);
       LowMemoryLevel.LEVEL5 = lowMemoryLev4;
       LowMemoryLevel[] lowMemoryLev5 = new LowMemoryLevel[]{lowMemoryLev,lowMemoryLev1,lowMemoryLev2,lowMemoryLev3,lowMemoryLev4};
       LowMemoryLevel.$VALUES = lowMemoryLev5;
    }
    public void LowMemoryLevel(String p0,int p1){
       super(p0, p1);
    }
    public static LowMemoryLevel valueOf(String p0){
       return Enum.valueOf(LowMemoryLevel.class, p0);
    }
    public static LowMemoryLevel[] values(){
       return LowMemoryLevel.$VALUES.clone();
    }
}
