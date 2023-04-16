package iq1.f;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multiline.anim.LiveMultiLineAnimationViewController;
import java.lang.Object;
import iq1.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import iq1.c;
import com.kuaishou.live.common.core.component.multiline.anim.LiveMultiLineImageAnimationView;
import ls1.h;
import com.yxcorp.gifshow.image.KwaiImageView;
import iq1.e;
import pu1.d;
import hc.b;

public final class f implements Observer	// class@002980
{
    public final LiveMultiLineAnimationViewController b;

    public void f(LiveMultiLineAnimationViewController p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
       }else if(p0 != null){
          f tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, LiveMultiLineAnimationViewController.class, "5")) {
             LiveMultiLineAnimationViewController k = tb.k;
             if (k == null) {
                a.S("imageAnimationView");
             }
             k.setVisibility(0);
             k = tb.k;
             if (k == null) {
                a.S("imageAnimationView");
             }
             k.setLayoutInfo(p0.b);
             h b = h.b;
             k = tb.k;
             if (k == null) {
                a.S("imageAnimationView");
             }
             b.a(k.getAnimationView(), p0.a, true, null, new e(tb, p0));
          }
       }
       return;
    }
}
