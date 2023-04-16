package com.yxcorp.gifshow.plugin.impl.growth.GrowthUserLoginPlugin$LoginShowType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class GrowthUserLoginPlugin$LoginShowType extends Enum	// class@000fc0
{
    public static final GrowthUserLoginPlugin$LoginShowType[] $VALUES;
    public static final GrowthUserLoginPlugin$LoginShowType ONE_DAY;
    public static final GrowthUserLoginPlugin$LoginShowType THREE_DAY;

    static {
       GrowthUserLoginPlugin$LoginShowType loginShowTyp1;
       GrowthUserLoginPlugin$LoginShowType[] loginShowTyp = new GrowthUserLoginPlugin$LoginShowType[]{loginShowTyp1,loginShowTyp1};
       loginShowTyp1 = new GrowthUserLoginPlugin$LoginShowType("ONE_DAY", 0);
       GrowthUserLoginPlugin$LoginShowType.ONE_DAY = loginShowTyp1;
       loginShowTyp1 = new GrowthUserLoginPlugin$LoginShowType("THREE_DAY", 1);
       GrowthUserLoginPlugin$LoginShowType.THREE_DAY = loginShowTyp1;
       GrowthUserLoginPlugin$LoginShowType.$VALUES = loginShowTyp;
    }
    public void GrowthUserLoginPlugin$LoginShowType(String p0,int p1){
       super(p0, p1);
    }
    public static GrowthUserLoginPlugin$LoginShowType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, GrowthUserLoginPlugin$LoginShowType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(GrowthUserLoginPlugin$LoginShowType.class, p0);
    }
    public static GrowthUserLoginPlugin$LoginShowType[] values(){
       Object obj = PatchProxy.apply(null, null, GrowthUserLoginPlugin$LoginShowType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GrowthUserLoginPlugin$LoginShowType.$VALUES.clone();
    }
}
