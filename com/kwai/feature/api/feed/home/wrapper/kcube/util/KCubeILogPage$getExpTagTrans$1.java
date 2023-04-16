package com.kwai.feature.api.feed.home.wrapper.kcube.util.KCubeILogPage$getExpTagTrans$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import k2b.e0;
import java.lang.Class;
import java.lang.String;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class KCubeILogPage$getExpTagTrans$1 extends FunctionReferenceImpl implements l	// class@000f28
{
    public static final KCubeILogPage$getExpTagTrans$1 INSTANCE;

    static {
       KCubeILogPage$getExpTagTrans$1.INSTANCE = new KCubeILogPage$getExpTagTrans$1();
    }
    public void KCubeILogPage$getExpTagTrans$1(){
       super(1, e0.class, "getExpTagTrans", "getExpTagTrans\(\)Lcom/kuaishou/client/log/event/packages/nano/ClientEvent$ExpTagTrans;", 0);
    }
    public final ClientEvent$ExpTagTrans invoke(e0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KCubeILogPage$getExpTagTrans$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "p1");
       return p0.I1();
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
