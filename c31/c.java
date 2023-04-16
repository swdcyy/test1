package c31.c;
import oq5.c;
import c31.d;
import java.lang.Object;
import android.content.res.Configuration;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import dk2.b;
import com.kwai.robust.PatchProxyResult;
import dk2.a$a;
import c31.a;
import wkd.b;
import dk2.a;
import gq5.c;
import c31.b;
import t02.a0;
import gq5.f;

public final class c implements c	// class@00045e
{
    public final d b;

    public void c(d p0){
       this.b = p0;
    }
    public final void onConfigurationChanged(Configuration p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, uod, "4")) {
       }else {
          boolean b = true;
          d uod1 = null;
          d uod2 = (p0.orientation == 2)? 1: null;
          if (uod2) {
             tb.q.a(tb.m8());
             tb.q.d();
             tb.q.c(b);
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             if (!PatchProxy.applyVoid(null, tb, uod, "5")) {
                if (tb.r == null) {
                   a uoa = PatchProxy.apply(null, tb, uod, "8");
                   if (uoa != patchProxyRe) {
                   }else {
                      uoa = new a(tb);
                   }
                   tb.r = uoa;
                }
                b.a(0x4bf3ccd7).d(tb.r);
                if (tb.s == null) {
                   b uob = PatchProxy.apply(null, tb, uod, "7");
                   if (uob != patchProxyRe) {
                   }else {
                      uob = new b(tb);
                   }
                   tb.s = uob;
                }
                tb.p.g2.k(tb.s);
             }
          }else {
             tb.q.c(uod1);
             tb.P8();
          }
       }
       return;
    }
}
