package com.kwai.feature.api.feed.home.wrapper.kcube.util.KCubeILogPage$getTopPageSuffix$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import k2b.e0;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class KCubeILogPage$getTopPageSuffix$1 extends FunctionReferenceImpl implements l	// class@000f33
{
    public static final KCubeILogPage$getTopPageSuffix$1 INSTANCE;

    static {
       KCubeILogPage$getTopPageSuffix$1.INSTANCE = new KCubeILogPage$getTopPageSuffix$1();
    }
    public void KCubeILogPage$getTopPageSuffix$1(){
       super(1, e0.class, "getTopPageSuffix", "getTopPageSuffix\(\)Ljava/lang/String;", 0);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final String invoke(e0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KCubeILogPage$getTopPageSuffix$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "p1");
       return p0.pg();
    }
}