package com.kuaishou.android.security.internal.common.KSecurityContext$Feature;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KSecurityContext$Feature extends Enum	// class@0006c7
{
    public final int value;
    public static final KSecurityContext$Feature[] $VALUES;
    public static final KSecurityContext$Feature ALL;
    public static final KSecurityContext$Feature DFP;
    public static final KSecurityContext$Feature GUARD;

    static {
       KSecurityContext$Feature uFeature = new KSecurityContext$Feature("GUARD", 0, 0);
       KSecurityContext$Feature.GUARD = uFeature;
       KSecurityContext$Feature uFeature1 = new KSecurityContext$Feature("DFP", 1, 1);
       KSecurityContext$Feature.DFP = uFeature1;
       KSecurityContext$Feature uFeature2 = new KSecurityContext$Feature("ALL", 2, 3);
       KSecurityContext$Feature.ALL = uFeature2;
       KSecurityContext$Feature[] uFeatureArra = new KSecurityContext$Feature[]{uFeature,uFeature1,uFeature2};
       KSecurityContext$Feature.$VALUES = uFeatureArra;
    }
    public void KSecurityContext$Feature(String p0,int p1,int p2){
       this.value = p2;
    }
    public static KSecurityContext$Feature valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KSecurityContext$Feature.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KSecurityContext$Feature.class, p0);
    }
    public static KSecurityContext$Feature[] values(){
       Object obj = PatchProxy.apply(null, null, KSecurityContext$Feature.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KSecurityContext$Feature.$VALUES.clone();
    }
    public int getIntValue(){
       return this.value;
    }
}
