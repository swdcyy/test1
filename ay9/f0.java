package ay9.f0;
import erd.g;
import ay9.h0;
import java.lang.Object;
import i8a.g$b;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qp7.x0;
import qp7.b;
import com.kwai.slide.play.detail.information.caption.l;
import android.text.SpannableStringBuilder;
import tyc.s4;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.b;
import java.util.List;
import ay9.q;
import i8a.g;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.ArrayList;
import koc.c;
import b89.a$c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagPackage;
import dkc.b;
import com.kwai.component.photo.detail.core.tag.TagPackageListHelper;
import java.util.Iterator;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.config.ActivityInfo;
import k9a.c;
import e8a.d;
import ay9.j0;
import java.lang.Runnable;
import ekd.k1;
import android.os.SystemClock;
import i8a.a$a;
import i8a.a;
import java.lang.StringBuilder;

public final class f0 implements g	// class@0002f4
{
    public final h0 b;

    public void f0(h0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       Iterator iterator;
       j0 b;
       f0 tb = this.b;
       Objects.requireNonNull(tb);
       h0 oh0 = h0.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, oh0, "3")) {
       }else {
          tb.E().p(p0.b, p0.c);
          if (tb.L.g() != null) {
             tb.L.g().f();
          }
          tb.w0(tb.L.b());
          g w = tb.L.w;
          tb.y = c.c(w, tb.v.getTags());
          a$c uoc = tb.L.f();
          tb.C = uoc;
          if (uoc != null) {
             tb.x.a(b.d(uoc.b()));
          }
          if (w != null) {
             iterator = w.iterator();
             while (iterator.hasNext()) {
                String str = iterator.next();
                ActivityInfo uActivityInf = PatchProxy.applyOneRefs(str, tb, oh0, "5");
                if (uActivityInf != PatchProxyResult.class) {
                }else {
                   h0 l = tb.L;
                   if (l != null) {
                      c uoc1 = l.n();
                      if (uoc1 != null) {
                         uActivityInf = uoc1.a(str);
                      }
                   }
                   uActivityInf = null;
                }
                q x = tb.x;
                ClientContent$TagPackage tagPackage = (uActivityInf != null)? b.k(uActivityInf, tb.v): b.m(str, tb.v);
                x.a(tagPackage);
             }
          }
          g v = tb.L.v;
          if (v != null) {
             tb.x.a(v);
          }
          h0 m = tb.M;
          Objects.requireNonNull(m);
          if (!PatchProxy.applyVoidOneRefs(p0, m, j0.class, "4")) {
             k1.m(m.e);
             m.d = true;
             long l1 = -1;
             if (m.c - null >= 0) {
                l1 = SystemClock.elapsedRealtime() - m.c;
             }
             long l2 = l1;
             if (m.a != null) {
                b = m.b;
                if (b != null) {
                   a$a uoa = new a$a(b.getPhotoId(), m.b.getCaption(), p0.a, m.a.r(), l2, m.a.q());
                   a.d(iterator);
                }
             }
             a.c("CaptionShownChecker", m.b, "enter error,caption = "+m.a);
          }
       }
       return;
    }
}
