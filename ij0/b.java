package ij0.b;
import nu6.b;
import com.kuaishou.krn.instance.JsFramework;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import iu6.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import ek0.d;
import com.kuaishou.krn.bundle.preload.KrnReactRootPreloadManager$SceneType;
import java.lang.Enum;
import com.kuaishou.krn.bundle.preload.a;

public final class b implements b	// class@0028ff
{
    public final JsFramework a;

    public void b(JsFramework p0){
       a.p(p0, "mJsFramework");
       super();
       this.a = p0;
    }
    public void a(a p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "1")) {
          return;
       }
       d.e("onBundleInfoUpdate£¬oldInfo="+p0+"£¬newInfo="+p1);
       if (p1 != null) {
          a.b(KrnReactRootPreloadManager$SceneType.BUNDLE_INFO_UPDATED.name(), p1);
       }
       return;
    }
}
