package q90.s;
import ub.a;
import q90.q;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import bd.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import bd.b;
import com.facebook.imagepipeline.image.a;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.model.CDNUrl;
import w36.b;
import android.app.Activity;
import u80.e;
import q87.c;
import q90.r;
import v36.a$a;
import v36.a;

public final class s extends a	// class@00299f
{
    public final q b;
    public final KwaiImageView c;

    public void s(q p0,KwaiImageView p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       q s;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, s.class, "1")) {
       }else {
          a.p(p0, "id");
          Objects.requireNonNull(q.z);
          ViewGroup$LayoutParams layoutParams = this.c.getLayoutParams();
          layoutParams.width = q.x;
          layoutParams.height = q.y;
          this.c.setLayoutParams(layoutParams);
          q p = this.b.p;
          if (p != null) {
             p.setVisibility(8);
          }
          if (p1 instanceof b && !p1.isClosed()) {
             p.s = p1.g();
          }
          s tb = this.b;
          s tc = this.c;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(tc, tb, q.class, "6")) {
             p1 = tb.r;
             p1 = (p1 != null)? p1.a(): null;
             if (p1 != null && tb.s != null) {
                p1 = tb.n;
                if (p1 != null && p1.isFinishing() != true) {
                   Object[] objArray = new Object[0];
                   e.D().s("KSFeedTab", "bindWebpIfNeed", objArray);
                   q u = tb.u;
                   if (u != null) {
                      q r = tb.r;
                      a.m(r);
                      s = tb.s;
                      a.m(s);
                      u.a(tc, r, true, new r(tb), s);
                   }
                }
             }
          }
       }
    label_00a1 :
       return;
    }
}
