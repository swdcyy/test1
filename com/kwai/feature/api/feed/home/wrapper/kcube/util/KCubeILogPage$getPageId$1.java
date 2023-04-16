package com.kwai.feature.api.feed.home.wrapper.kcube.util.KCubeILogPage$getPageId$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import lnc.s5;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import java.lang.Integer;

public final class KCubeILogPage$getPageId$1 extends FunctionReferenceImpl implements l	// class@000f2e
{
    public static final KCubeILogPage$getPageId$1 INSTANCE;

    static {
       KCubeILogPage$getPageId$1.INSTANCE = new KCubeILogPage$getPageId$1();
    }
    public void KCubeILogPage$getPageId$1(){
       super(1, s5.class, "getPageId", "getPageId\(\)I", 0);
    }
    public final int invoke(s5 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KCubeILogPage$getPageId$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "p1");
       return p0.f();
    }
    public Object invoke(Object p0){
       return Integer.valueOf(this.invoke(p0));
    }
}
