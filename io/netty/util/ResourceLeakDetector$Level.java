package io.netty.util.ResourceLeakDetector$Level;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ResourceLeakDetector$Level extends Enum	// class@0010e9
{
    public static final ResourceLeakDetector$Level[] $VALUES;
    public static final ResourceLeakDetector$Level ADVANCED;
    public static final ResourceLeakDetector$Level DISABLED;
    public static final ResourceLeakDetector$Level PARANOID;
    public static final ResourceLeakDetector$Level SIMPLE;

    static {
       ResourceLeakDetector$Level level = new ResourceLeakDetector$Level("DISABLED", 0);
       ResourceLeakDetector$Level.DISABLED = level;
       ResourceLeakDetector$Level level1 = new ResourceLeakDetector$Level("SIMPLE", 1);
       ResourceLeakDetector$Level.SIMPLE = level1;
       ResourceLeakDetector$Level level2 = new ResourceLeakDetector$Level("ADVANCED", 2);
       ResourceLeakDetector$Level.ADVANCED = level2;
       ResourceLeakDetector$Level level3 = new ResourceLeakDetector$Level("PARANOID", 3);
       ResourceLeakDetector$Level.PARANOID = level3;
       ResourceLeakDetector$Level[] levelArray = new ResourceLeakDetector$Level[]{level,level1,level2,level3};
       ResourceLeakDetector$Level.$VALUES = levelArray;
    }
    public void ResourceLeakDetector$Level(String p0,int p1){
       super(p0, p1);
    }
    public static ResourceLeakDetector$Level valueOf(String p0){
       return Enum.valueOf(ResourceLeakDetector$Level.class, p0);
    }
    public static ResourceLeakDetector$Level[] values(){
       return ResourceLeakDetector$Level.$VALUES.clone();
    }
}
