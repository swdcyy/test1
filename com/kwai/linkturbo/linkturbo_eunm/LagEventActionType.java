package com.kwai.linkturbo.linkturbo_eunm.LagEventActionType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LagEventActionType extends Enum	// class@000ae8
{
    public final int value;
    public static final LagEventActionType[] $VALUES;
    public static final LagEventActionType APPROACHING_LAGS_FENCE;
    public static final LagEventActionType ENTERING_LAGS_FENCE;
    public static final LagEventActionType OUT_OF_LAGS_FENCE;

    static {
       LagEventActionType lagEventActi1;
       LagEventActionType[] lagEventActi = new LagEventActionType[]{lagEventActi1,lagEventActi1,lagEventActi1};
       lagEventActi1 = new LagEventActionType("OUT_OF_LAGS_FENCE", 0, 0);
       LagEventActionType.OUT_OF_LAGS_FENCE = lagEventActi1;
       lagEventActi1 = new LagEventActionType("APPROACHING_LAGS_FENCE", 1, 1);
       LagEventActionType.APPROACHING_LAGS_FENCE = lagEventActi1;
       lagEventActi1 = new LagEventActionType("ENTERING_LAGS_FENCE", 2, 2);
       LagEventActionType.ENTERING_LAGS_FENCE = lagEventActi1;
       LagEventActionType.$VALUES = lagEventActi;
    }
    public void LagEventActionType(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static LagEventActionType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LagEventActionType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LagEventActionType.class, p0);
    }
    public static LagEventActionType[] values(){
       Object obj = PatchProxy.apply(null, null, LagEventActionType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LagEventActionType.$VALUES.clone();
    }
    public final int getValue(){
       return this.value;
    }
}
