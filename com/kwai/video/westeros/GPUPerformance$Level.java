package com.kwai.video.westeros.GPUPerformance$Level;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class GPUPerformance$Level extends Enum	// class@000e5d
{
    public static final GPUPerformance$Level[] $VALUES;
    public static final GPUPerformance$Level bad;
    public static final GPUPerformance$Level best;
    public static final GPUPerformance$Level high;
    public static final GPUPerformance$Level low;
    public static final GPUPerformance$Level medium;
    public static final GPUPerformance$Level unknown;

    static {
       GPUPerformance$Level level = new GPUPerformance$Level("unknown", 0);
       GPUPerformance$Level.unknown = level;
       GPUPerformance$Level level1 = new GPUPerformance$Level("bad", 1);
       GPUPerformance$Level.bad = level1;
       GPUPerformance$Level level2 = new GPUPerformance$Level("low", 2);
       GPUPerformance$Level.low = level2;
       GPUPerformance$Level level3 = new GPUPerformance$Level("medium", 3);
       GPUPerformance$Level.medium = level3;
       GPUPerformance$Level level4 = new GPUPerformance$Level("high", 4);
       GPUPerformance$Level.high = level4;
       GPUPerformance$Level level5 = new GPUPerformance$Level("best", 5);
       GPUPerformance$Level.best = level5;
       GPUPerformance$Level[] levelArray = new GPUPerformance$Level[]{level,level1,level2,level3,level4,level5};
       GPUPerformance$Level.$VALUES = levelArray;
    }
    public void GPUPerformance$Level(String p0,int p1){
       super(p0, p1);
    }
    public static GPUPerformance$Level valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, GPUPerformance$Level.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(GPUPerformance$Level.class, p0);
    }
    public static GPUPerformance$Level[] values(){
       Object obj = PatchProxy.apply(null, null, GPUPerformance$Level.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GPUPerformance$Level.$VALUES.clone();
    }
}
