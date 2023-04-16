package com.kwai.feature.api.feed.home.wrapper.kcube.util.KCubeILogPage$getContentWrapper$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import k2b.e0;
import java.lang.Class;
import java.lang.String;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class KCubeILogPage$getContentWrapper$1 extends FunctionReferenceImpl implements l	// class@000f25
{
    public static final KCubeILogPage$getContentWrapper$1 INSTANCE;

    static {
       KCubeILogPage$getContentWrapper$1.INSTANCE = new KCubeILogPage$getContentWrapper$1();
    }
    public void KCubeILogPage$getContentWrapper$1(){
       super(1, e0.class, "getContentWrapper", "getContentWrapper\(\)Lcom/kuaishou/client/log/content/packages/nano/ClientContentWrapper$ContentWrapper;", 0);
    }
    public final ClientContentWrapper$ContentWrapper invoke(e0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KCubeILogPage$getContentWrapper$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "p1");
       return p0.ye();
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
