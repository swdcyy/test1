package com.kwai.feature.api.feed.home.wrapper.kcube.util.KCubeILogPage$getUrl$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ta9.b;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class KCubeILogPage$getUrl$1 extends FunctionReferenceImpl implements l	// class@000f34
{
    public static final KCubeILogPage$getUrl$1 INSTANCE;

    static {
       KCubeILogPage$getUrl$1.INSTANCE = new KCubeILogPage$getUrl$1();
    }
    public void KCubeILogPage$getUrl$1(){
       super(1, b.class, "getUrl", "getUrl\(\)Ljava/lang/String;", 0);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final String invoke(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KCubeILogPage$getUrl$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "p1");
       return p0.getUrl();
    }
}
