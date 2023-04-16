package com.facebook.common.memory.MemoryTrimType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class MemoryTrimType extends Enum	// class@00105f
{
    public double mSuggestedTrimRatio;
    public static final MemoryTrimType[] $VALUES;
    public static final MemoryTrimType OnAppBackgrounded;
    public static final MemoryTrimType OnCloseToDalvikHeapLimit;
    public static final MemoryTrimType OnSystemLowMemoryWhileAppInBackground;
    public static final MemoryTrimType OnSystemLowMemoryWhileAppInForeground;
    public static final MemoryTrimType OnSystemMemoryCriticallyLowWhileAppInForeground;

    static {
       MemoryTrimType memoryTrimTy = new MemoryTrimType("OnCloseToDalvikHeapLimit", 0, 0x3fe0000000000000);
       MemoryTrimType.OnCloseToDalvikHeapLimit = memoryTrimTy;
       MemoryTrimType memoryTrimTy1 = new MemoryTrimType("OnSystemMemoryCriticallyLowWhileAppInForeground", 1, 0x3ff0000000000000);
       MemoryTrimType.OnSystemMemoryCriticallyLowWhileAppInForeground = memoryTrimTy1;
       MemoryTrimType memoryTrimTy2 = new MemoryTrimType("OnSystemLowMemoryWhileAppInForeground", 2, 0x3fe0000000000000);
       MemoryTrimType.OnSystemLowMemoryWhileAppInForeground = memoryTrimTy2;
       MemoryTrimType memoryTrimTy3 = new MemoryTrimType("OnSystemLowMemoryWhileAppInBackground", 3, 0x3ff0000000000000);
       MemoryTrimType.OnSystemLowMemoryWhileAppInBackground = memoryTrimTy3;
       MemoryTrimType memoryTrimTy4 = new MemoryTrimType("OnAppBackgrounded", 4, 0x3ff0000000000000);
       MemoryTrimType.OnAppBackgrounded = memoryTrimTy4;
       MemoryTrimType[] memoryTrimTy5 = new MemoryTrimType[]{memoryTrimTy,memoryTrimTy1,memoryTrimTy2,memoryTrimTy3,memoryTrimTy4};
       MemoryTrimType.$VALUES = memoryTrimTy5;
    }
    public void MemoryTrimType(String p0,int p1,double p2){
       super(p0, p1);
       this.mSuggestedTrimRatio = p2;
    }
    public static MemoryTrimType valueOf(String p0){
       return Enum.valueOf(MemoryTrimType.class, p0);
    }
    public static MemoryTrimType[] values(){
       return MemoryTrimType.$VALUES.clone();
    }
    public double getSuggestedTrimRatio(){
       return this.mSuggestedTrimRatio;
    }
}
