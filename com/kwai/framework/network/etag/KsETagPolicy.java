package com.kwai.framework.network.etag.KsETagPolicy;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KsETagPolicy extends Enum	// class@000c08
{
    public static final KsETagPolicy[] $VALUES;
    public static final KsETagPolicy Disable;
    public static final KsETagPolicy Enable;

    static {
       KsETagPolicy ksETagPolicy = new KsETagPolicy("Enable", 0);
       KsETagPolicy.Enable = ksETagPolicy;
       KsETagPolicy ksETagPolicy1 = new KsETagPolicy("Disable", 1);
       KsETagPolicy.Disable = ksETagPolicy1;
       KsETagPolicy[] ksETagPolicy2 = new KsETagPolicy[]{ksETagPolicy,ksETagPolicy1};
       KsETagPolicy.$VALUES = ksETagPolicy2;
    }
    public void KsETagPolicy(String p0,int p1){
       super(p0, p1);
    }
    public static KsETagPolicy valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, KsETagPolicy.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(KsETagPolicy.class, p0);
    }
    public static KsETagPolicy[] values(){
       Object obj = PatchProxy.apply(null, null, KsETagPolicy.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KsETagPolicy.$VALUES.clone();
    }
}
