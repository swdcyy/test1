package com.kwai.feature.api.tuna.canary.TunaCanaryFeatureTag;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class TunaCanaryFeatureTag extends Enum	// class@0011cb
{
    public static final TunaCanaryFeatureTag[] $VALUES;
    public static final TunaCanaryFeatureTag TUNA_TAB;

    static {
       TunaCanaryFeatureTag tunaCanaryFe1;
       TunaCanaryFeatureTag[] tunaCanaryFe = new TunaCanaryFeatureTag[]{tunaCanaryFe1};
       tunaCanaryFe1 = new TunaCanaryFeatureTag("TUNA_TAB", 0);
       TunaCanaryFeatureTag.TUNA_TAB = tunaCanaryFe1;
       TunaCanaryFeatureTag.$VALUES = tunaCanaryFe;
    }
    public void TunaCanaryFeatureTag(String p0,int p1){
       super(p0, p1);
    }
    public static TunaCanaryFeatureTag valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, TunaCanaryFeatureTag.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(TunaCanaryFeatureTag.class, p0);
    }
    public static TunaCanaryFeatureTag[] values(){
       Object obj = PatchProxy.apply(null, null, TunaCanaryFeatureTag.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TunaCanaryFeatureTag.$VALUES.clone();
    }
}
