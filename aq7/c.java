package aq7.c;
import androidx.lifecycle.Observer;
import aq7.e;
import java.lang.Object;
import aq7.g$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import cs7.c;
import kotlin.jvm.internal.a;
import java.util.Objects;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import lnc.a1;
import aq7.a;
import com.facebook.imagepipeline.request.ImageRequest;
import ub.b;
import pb.d;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import ac.a;
import com.yxcorp.gifshow.image.KwaiImageView;

public final class c implements Observer	// class@00033f
{
    public final e b;

    public void c(e p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, str)) {
       }else {
          c tb = this.b;
          g$a a = p0.a;
          Object[] objArray = null;
          g$a uoa = PatchProxy.apply(objArray, p0, g$a.class, str);
          if (uoa != PatchProxyResult.class) {
          }else {
             uoa = p0.b;
             if (uoa == null) {
                a.S("size");
             }
          }
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidTwoRefs(a, uoa, tb, e.class, "3")) {
             p0 = tb.m;
             if (p0 == null) {
                a.S("mIconView");
             }
             p0 = p0.getLayoutParams();
             if (p0 != null) {
                int i = 0x7f070295;
                int i1 = 0x7f0819b9;
                int i2 = 0x7f0702da;
                if (a != null) {
                   e uoe = (!a.length)? 1: null;
                   if (!uoe) {
                      uoe = tb.m;
                      if (uoe == null) {
                         a.S("mIconView");
                      }
                      uoe.setPlaceHolderImage(new ColorDrawable(0));
                      uoe = tb.m;
                      if (uoe == null) {
                         a.S("mIconView");
                      }
                      uoe.setFailureImage(i1);
                      p0.height = a1.d(i);
                      if (uoa == null) {
                         i = a1.d(i2);
                      }else if(uoa.b() > 0 && uoa.a() > 0){
                         i = (int)(((float)uoa.b() / (float)uoa.a()) * (float)p0.height);
                      }else {
                         i = a1.d(i2);
                      }
                      p0.width = i;
                      e m2 = tb.m;
                      if (m2 == null) {
                         a.S("mIconView");
                      }
                      e m3 = tb.m;
                      if (m3 == null) {
                         a.S("mIconView");
                      }
                      d uod = m3.g0(new a(tb, a, uoa), objArray, a);
                      if (uod != null) {
                         objArray = uod.e();
                      }
                      m2.setController(objArray);
                   label_00dd :
                      e m1 = tb.m;
                      if (m1 == null) {
                         a.S("mIconView");
                      }
                      m1.setLayoutParams(p0);
                   }
                }
                e m = tb.m;
                if (m == null) {
                   a.S("mIconView");
                }
                m.setImageResource(i1);
                p0.height = a1.d(i);
                p0.width = a1.d(i2);
                goto label_00dd ;
             }
          }
       }
       return;
    }
}
