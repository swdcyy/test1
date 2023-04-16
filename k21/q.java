package k21.q;
import jv1.a;
import k21.r;
import java.lang.Object;
import android.content.res.Configuration;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import tkd.b;
import tkd.d;
import ym5.a;
import lnc.b5;
import com.yxcorp.utility.j;
import tj3.e;
import d92.f$b;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService$DisableSlidePlayFunction;
import v12.f;
import ekd.i;

public final class q implements a	// class@002c76
{
    public final r a;

    public void q(r p0){
       this.a = p0;
    }
    public final void a(Configuration p0){
       q ta = this.a;
       Objects.requireNonNull(ta);
       r or = r.class;
       if (PatchProxy.applyVoidOneRefs(p0, ta, or, "3")) {
       }else {
          boolean i = 0;
          boolean b = (p0.orientation == 2)? true: false;
          Activity activity = ta.getActivity();
          Object[] objArray = null;
          if (b) {
             i = d.a(0x4c5dd1b8).f2();
             if (!b5.a(activity)) {
                if (!PatchProxy.applyVoid(objArray, ta, or, "4")) {
                   or = ta.p;
                   if (or != null) {
                      or.a();
                   }
                   ta.P8(true, ta.s);
                }
                ta.t.a(i, true);
             }
             ta.q.Q3(LiveSlidePlayService$DisableSlidePlayFunction.LANDSCAPE_PLAY, i);
          }else {
             ta.t.a(true, true);
             if (!PatchProxy.applyVoid(objArray, ta, or, "5")) {
                or = ta.p;
                if (or != null) {
                   or.b();
                }
                ta.P8(i, ta.s);
             }
             if (ta.r == null && activity != null) {
                i.a(activity, i, i);
             }
          }
          if (!b || b5.a(activity)) {
             ta.q.Q3(LiveSlidePlayService$DisableSlidePlayFunction.LANDSCAPE_PLAY, true);
          }
       }
       return;
    }
}
