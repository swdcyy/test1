package f5b.f;
import ub.a;
import f5b.c;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import bd.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.View;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import java.util.Objects;
import f5b.e;
import java.lang.Runnable;
import com.kwai.library.widget.popup.common.f;
import bd.b;
import com.facebook.imagepipeline.image.a;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.model.CDNUrl;
import w36.b;
import android.app.Activity;
import s5b.b;
import q87.c;
import f5b.d;
import v36.a$a;
import v36.a;

public final class f extends a	// class@0028a9
{
    public final c b;
    public final KwaiImageView c;

    public void f(c p0,KwaiImageView p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       c t;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, f.class, "1")) {
       }else {
          a.p(p0, "id");
          f tb = this.b;
          c v = tb.v;
          if (v != null) {
             t = tb.t;
             if (t != null) {
                t.removeView(v);
             }
          }
          tb = this.b;
          v = tb.w;
          if (v != null) {
             t = tb.t;
             if (t != null) {
                t.removeView(v);
             }
          }
          ViewGroup$LayoutParams layoutParams = this.c.getLayoutParams();
          Objects.requireNonNull(c.G);
          layoutParams.width = c.E;
          layoutParams.height = c.F;
          this.c.setLayoutParams(layoutParams);
          t = this.b.t;
          if (t != null) {
             f.F(t, new e(t, this));
          }
          if (p1 instanceof b && !p1.isClosed()) {
             t.x = p1.g();
          }
          tb = this.b;
          f tc = this.c;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(tc, tb, c.class, "5")) {
             p1 = tb.r;
             p1 = (p1 != null)? p1.a(): null;
             if (p1 != null && tb.x != null) {
                p1 = tb.s;
                if (p1 != null && p1.isFinishing() != true) {
                   Object[] objArray = new Object[0];
                   b.D().s("MagicEmojiTab", "bindWebpIfNeed", objArray);
                   c z = tb.z;
                   if (z != null) {
                      c r = tb.r;
                      a.m(r);
                      c x = tb.x;
                      a.m(x);
                      z.a(tc, r, true, new d(tb), x);
                   }
                }
             }
          }
       }
    label_00be :
       return;
    }
}
