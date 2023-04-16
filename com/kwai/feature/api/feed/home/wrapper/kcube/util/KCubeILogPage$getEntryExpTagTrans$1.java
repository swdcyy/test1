package com.kwai.feature.api.feed.home.wrapper.kcube.util.KCubeILogPage$getEntryExpTagTrans$1;
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

public final class KCubeILogPage$getEntryExpTagTrans$1 extends FunctionReferenceImpl implements l	// class@000f27
{
    public static final KCubeILogPage$getEntryExpTagTrans$1 INSTANCE;

    static {
       KCubeILogPage$getEntryExpTagTrans$1.INSTANCE = new KCubeILogPage$getEntryExpTagTrans$1();
    }
    public void KCubeILogPage$getEntryExpTagTrans$1(){
       super(1, e0.class, "getEntryExpTagTrans", "getEntryExpTagTrans\(\)Lcom/kuaishou/client/log/event/packages/nano/ClientEvent$ExpTagTrans;", 0);
    }
    public final ClientEvent$ExpTagTrans invoke(e0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KCubeILogPage$getEntryExpTagTrans$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "p1");
       return p0.K5();
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
