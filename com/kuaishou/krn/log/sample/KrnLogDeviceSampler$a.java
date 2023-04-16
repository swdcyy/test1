package com.kuaishou.krn.log.sample.KrnLogDeviceSampler$a;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class KrnLogDeviceSampler$a	// class@0008f5
{
    public final String bundleId;
    public final String customEventKey;
    public final String sampleKswitch;

    public void KrnLogDeviceSampler$a(String p0,String p1,String p2,int p3,u p4){
       a.p(p0, "customEventKey");
       a.p(p1, "sampleKswitch");
       super();
       this.customEventKey = p0;
       this.sampleKswitch = p1;
       this.bundleId = null;
    }
    public final String a(){
       return this.bundleId;
    }
}
