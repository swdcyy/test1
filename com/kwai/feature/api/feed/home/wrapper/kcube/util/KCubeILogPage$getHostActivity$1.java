package com.kwai.feature.api.feed.home.wrapper.kcube.util.KCubeILogPage$getHostActivity$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import k2b.e0;
import java.lang.Class;
import java.lang.String;
import android.app.Activity;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class KCubeILogPage$getHostActivity$1 extends FunctionReferenceImpl implements l	// class@000f2a
{
    public static final KCubeILogPage$getHostActivity$1 INSTANCE;

    static {
       KCubeILogPage$getHostActivity$1.INSTANCE = new KCubeILogPage$getHostActivity$1();
    }
    public void KCubeILogPage$getHostActivity$1(){
       super(1, e0.class, "getHostActivity", "getHostActivity\(\)Landroid/app/Activity;", 0);
    }
    public final Activity invoke(e0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KCubeILogPage$getHostActivity$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "p1");
       return p0.cd();
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
