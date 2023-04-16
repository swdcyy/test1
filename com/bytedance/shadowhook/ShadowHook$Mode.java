package com.bytedance.shadowhook.ShadowHook$Mode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ShadowHook$Mode extends Enum	// class@000f15
{
    public final int value;
    public static final ShadowHook$Mode[] $VALUES;
    public static final ShadowHook$Mode SHARED;
    public static final ShadowHook$Mode UNIQUE;

    static {
       ShadowHook$Mode mode = new ShadowHook$Mode("SHARED", 0, 0);
       ShadowHook$Mode.SHARED = mode;
       ShadowHook$Mode mode1 = new ShadowHook$Mode("UNIQUE", 1, 1);
       ShadowHook$Mode.UNIQUE = mode1;
       ShadowHook$Mode[] modeArray = new ShadowHook$Mode[]{mode,mode1};
       ShadowHook$Mode.$VALUES = modeArray;
    }
    public void ShadowHook$Mode(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static ShadowHook$Mode valueOf(String p0){
       return Enum.valueOf(ShadowHook$Mode.class, p0);
    }
    public static ShadowHook$Mode[] values(){
       return ShadowHook$Mode.$VALUES.clone();
    }
    public int getValue(){
       return this.value;
    }
}
