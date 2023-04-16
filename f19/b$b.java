package f19.b$b;
import jta.e;
import f19.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.view.View;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import le5.f;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import rf5.u;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import tw.l;
import bf5.q;
import xe5.p;
import xe5.s;

public final class b$b implements e	// class@00227f
{
    public final b a;

    public void b$b(b p0){
       this.a = p0;
       super();
    }
    public final void b(int p0,int p1){
       b w;
       b v;
       float f1;
       int i1;
       b uob = b.class;
       b$b uob1 = b$b.class;
       if (PatchProxy.isSupport(uob1) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uob1, "1")) {
          return;
       }
       View view = this.a.R8();
       float f = 0;
       if (view != null) {
          view.setTranslationX(f);
       }
       view = this.a.R8();
       if (view != null) {
          view.setTranslationY(f);
       }
       if (p0 && p1) {
          uob1 = this.a;
          uob1.D = p0;
          Objects.requireNonNull(uob1);
          String str = "mSwipeToProfileFeedMovement";
          if (PatchProxy.isSupport(uob)) {
             b$b obj = PatchProxy.applyOneRefs(Integer.valueOf(p1), uob1, uob, "13");
             if (obj != PatchProxyResult.class) {
                obj = obj.intValue();
             label_00af :
                uob1.E = obj;
                obj = this.a;
                Objects.requireNonNull(obj);
                if (!PatchProxy.applyVoid(null, obj, uob, "10")) {
                   b u = obj.u;
                   if (u == null) {
                      a.S("mPhoto");
                   }
                   if (!l.j(u.mEntity)) {
                      u = obj.F;
                      if (u == null) {
                         a.S("mTextureViewSizeHelper");
                      }
                      uob = obj.D;
                      b e = obj.E;
                      w = obj.w;
                      if (w == null) {
                         a.S(str);
                      }
                      f = w.q();
                      v = obj.v;
                      if (v == null) {
                         a.S("mProfileSideEventBus");
                      }
                      u.c(uob, e, f, v.h);
                   }
                }
             }
          }
          if (!f.r() && f.o()) {
             v = uob1.A;
             w = uob1.x;
             String str1 = "mNasaBizParam";
             if (w == null) {
                a.S(str1);
             }
             int i = 1;
             if (v > w.getNasaSlideParam().BOTTOM_BAR_HEIGHT) {
                f1 = (float)i;
                w = uob1.w;
                if (w == null) {
                   a.S(str);
                }
                f1 = f1 - w.q();
                w = uob1.A;
                b x = uob1.x;
                if (x == null) {
                   a.S(str1);
                }
                i1 = w - x.getNasaSlideParam().BOTTOM_BAR_HEIGHT;
             }else {
                f1 = (float)i;
                w = uob1.w;
                if (w == null) {
                   a.S(str);
                }
                f1 = f1 - w.q();
                i1 = uob1.A;
             }
             p1 = p1 - (int)(f1 * (float)i1);
          }
          f1 = p1;
          goto label_00af ;
       }
    label_00f8 :
       return;
    }
}
