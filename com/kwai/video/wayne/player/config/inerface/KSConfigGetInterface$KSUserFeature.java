package com.kwai.video.wayne.player.config.inerface.KSConfigGetInterface$KSUserFeature;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KSConfigGetInterface$KSUserFeature extends Enum	// class@000cdf
{
    public static final KSConfigGetInterface$KSUserFeature[] $VALUES;
    public static final KSConfigGetInterface$KSUserFeature KSUserFeature_NewReflux;
    public static final KSConfigGetInterface$KSUserFeature KSUserFeature_normal;

    static {
       KSConfigGetInterface$KSUserFeature kSUserFeatur = new KSConfigGetInterface$KSUserFeature("KSUserFeature_normal", 0);
       KSConfigGetInterface$KSUserFeature.KSUserFeature_normal = kSUserFeatur;
       KSConfigGetInterface$KSUserFeature kSUserFeatur1 = new KSConfigGetInterface$KSUserFeature("KSUserFeature_NewReflux", 1);
       KSConfigGetInterface$KSUserFeature.KSUserFeature_NewReflux = kSUserFeatur1;
       KSConfigGetInterface$KSUserFeature[] kSUserFeatur2 = new KSConfigGetInterface$KSUserFeature[]{kSUserFeatur,kSUserFeatur1};
       KSConfigGetInterface$KSUserFeature.$VALUES = kSUserFeatur2;
    }
    public void KSConfigGetInterface$KSUserFeature(String p0,int p1){
       super(p0, p1);
    }
    public static KSConfigGetInterface$KSUserFeature valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KSConfigGetInterface$KSUserFeature.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KSConfigGetInterface$KSUserFeature.class, p0);
    }
    public static KSConfigGetInterface$KSUserFeature[] values(){
       Object obj = PatchProxy.apply(null, null, KSConfigGetInterface$KSUserFeature.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KSConfigGetInterface$KSUserFeature.$VALUES.clone();
    }
}
