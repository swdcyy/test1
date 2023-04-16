package k21.o;
import oq5.c;
import k21.p;
import java.lang.Object;
import android.content.res.Configuration;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import u32.k;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup;
import tkd.b;
import tkd.d;
import ym5.a;
import t02.a0;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService$DisableSlidePlayFunction;
import v12.f;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;

public final class o implements c	// class@002c74
{
    public final p b;

    public void o(p p0){
       this.b = p0;
    }
    public final void onConfigurationChanged(Configuration p0){
       o tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, p.class, "6")) {
       }else {
          LiveSlidePlayService$DisableSlidePlayFunction uDisableSlid = null;
          p op = (p0.orientation == 2)? 1: null;
          p q = tb.q;
          int i = 8;
          if (q != null) {
             int i1 = (op)? 8: 0;
             q.setVisibility(i1);
          }
          tb.p.g();
          if (op) {
             op.bottomMargin = tb.t.getHeight();
             op = tb.r;
             if (op != null) {
                op.setVisibility(4);
             }
             tb.v.L2.Q3(LiveSlidePlayService$DisableSlidePlayFunction.LANDSCAPE_PLAY, d.a(0x4c5dd1b8).f2());
          }else {
             op = tb.u;
             if (!tb.v.c.isGRPRCustomizedLive()) {
                i = 0;
             }
             op.setVisibility(i);
             op.bottomMargin = uDisableSlid;
             op = tb.r;
             if (op != null) {
                op.setVisibility(uDisableSlid);
             }
          }
          op = tb.p;
          if (op != null) {
             op.k();
          }
       }
       return;
    }
}
