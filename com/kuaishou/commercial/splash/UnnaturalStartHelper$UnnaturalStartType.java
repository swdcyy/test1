package com.kuaishou.commercial.splash.UnnaturalStartHelper$UnnaturalStartType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class UnnaturalStartHelper$UnnaturalStartType extends Enum	// class@00159e
{
    public final int bit;
    public static final UnnaturalStartHelper$UnnaturalStartType[] $VALUES;
    public static final UnnaturalStartHelper$UnnaturalStartType APP_START;
    public static final UnnaturalStartHelper$UnnaturalStartType THREE_TOUCH_COLD_START;
    public static final UnnaturalStartHelper$UnnaturalStartType THREE_TOUCH_HOT_START;
    public static final UnnaturalStartHelper$UnnaturalStartType THREE_TOUCH_WARM_START;
    public static final UnnaturalStartHelper$UnnaturalStartType URI_COLD_START;
    public static final UnnaturalStartHelper$UnnaturalStartType URI_HOT_START;
    public static final UnnaturalStartHelper$UnnaturalStartType URI_WARM_START;

    static {
       UnnaturalStartHelper$UnnaturalStartType unnaturalSta1;
       UnnaturalStartHelper$UnnaturalStartType[] unnaturalSta = new UnnaturalStartHelper$UnnaturalStartType[]{unnaturalSta1,unnaturalSta1,unnaturalSta1,unnaturalSta1,unnaturalSta1,unnaturalSta1,unnaturalSta1};
       unnaturalSta1 = new UnnaturalStartHelper$UnnaturalStartType("URI_COLD_START", 0, 1);
       UnnaturalStartHelper$UnnaturalStartType.URI_COLD_START = unnaturalSta1;
       unnaturalSta1 = new UnnaturalStartHelper$UnnaturalStartType("URI_WARM_START", 1, 2);
       UnnaturalStartHelper$UnnaturalStartType.URI_WARM_START = unnaturalSta1;
       unnaturalSta1 = new UnnaturalStartHelper$UnnaturalStartType("URI_HOT_START", 2, 4);
       UnnaturalStartHelper$UnnaturalStartType.URI_HOT_START = unnaturalSta1;
       unnaturalSta1 = new UnnaturalStartHelper$UnnaturalStartType("APP_START", 3, 8);
       UnnaturalStartHelper$UnnaturalStartType.APP_START = unnaturalSta1;
       unnaturalSta1 = new UnnaturalStartHelper$UnnaturalStartType("THREE_TOUCH_COLD_START", 4, 16);
       UnnaturalStartHelper$UnnaturalStartType.THREE_TOUCH_COLD_START = unnaturalSta1;
       unnaturalSta1 = new UnnaturalStartHelper$UnnaturalStartType("THREE_TOUCH_WARM_START", 5, 32);
       UnnaturalStartHelper$UnnaturalStartType.THREE_TOUCH_WARM_START = unnaturalSta1;
       unnaturalSta1 = new UnnaturalStartHelper$UnnaturalStartType("THREE_TOUCH_HOT_START", 6, 64);
       UnnaturalStartHelper$UnnaturalStartType.THREE_TOUCH_HOT_START = unnaturalSta1;
       UnnaturalStartHelper$UnnaturalStartType.$VALUES = unnaturalSta;
    }
    public void UnnaturalStartHelper$UnnaturalStartType(String p0,int p1,int p2){
       super(p0, p1);
       this.bit = p2;
    }
    public static UnnaturalStartHelper$UnnaturalStartType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, UnnaturalStartHelper$UnnaturalStartType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(UnnaturalStartHelper$UnnaturalStartType.class, p0);
    }
    public static UnnaturalStartHelper$UnnaturalStartType[] values(){
       Object obj = PatchProxy.apply(null, null, UnnaturalStartHelper$UnnaturalStartType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return UnnaturalStartHelper$UnnaturalStartType.$VALUES.clone();
    }
    public final int getBit(){
       return this.bit;
    }
}
