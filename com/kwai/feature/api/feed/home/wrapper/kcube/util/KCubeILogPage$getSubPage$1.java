package com.kwai.feature.api.feed.home.wrapper.kcube.util.KCubeILogPage$getSubPage$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import k2b.e0;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import java.lang.Integer;

public final class KCubeILogPage$getSubPage$1 extends FunctionReferenceImpl implements l	// class@000f31
{
    public static final KCubeILogPage$getSubPage$1 INSTANCE;

    static {
       KCubeILogPage$getSubPage$1.INSTANCE = new KCubeILogPage$getSubPage$1();
    }
    public void KCubeILogPage$getSubPage$1(){
       super(1, e0.class, "getSubPage", "getSubPage\(\)I", 0);
    }
    public final int invoke(e0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KCubeILogPage$getSubPage$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "p1");
       return p0.Lb();
    }
    public Object invoke(Object p0){
       return Integer.valueOf(this.invoke(p0));
    }
}
