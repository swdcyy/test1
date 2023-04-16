package com.yxcorp.gifshow.v3.editor.relay.KuaiYingVideoRelayInterface$materials$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.io.File;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class KuaiYingVideoRelayInterface$materials$2 extends Lambda implements l	// class@0011a0
{
    public static final KuaiYingVideoRelayInterface$materials$2 INSTANCE;

    static {
       KuaiYingVideoRelayInterface$materials$2.INSTANCE = new KuaiYingVideoRelayInterface$materials$2();
    }
    public void KuaiYingVideoRelayInterface$materials$2(){
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(File p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KuaiYingVideoRelayInterface$materials$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "it");
       return p0.isFile();
    }
}
