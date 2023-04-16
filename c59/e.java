package c59.e;
import com.yxcorp.gifshow.ad.tachikoma.page.AdtkHalfFrameLayout;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.widget.FrameLayout;
import yx.j0;

public final class e	// class@0004e5
{
    public final AdtkHalfFrameLayout a;
    public final float b;

    public void e(AdtkHalfFrameLayout p0,float p1){
       a.p(p0, "containerView");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean a(){
       Object obj = PatchProxy.apply(null, this, e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.a.getTranslationY() - this.b <= 0)? true: false;
       return b;
    }
    public final void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "7")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.a("AdtkAutoTranslator", p0, objArray);
       return;
    }
}
