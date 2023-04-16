package com.kwai.feed.player.ui.d;
import c56.b$b;
import com.kwai.feed.player.ui.KwaiXfControlPanel;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import d56.a;
import java.util.Iterator;
import java.util.Set;
import com.kwai.feed.player.ui.KwaiXfControlPanel$a;
import java.lang.Float;
import android.view.View;
import d56.b;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.FrameLayout$LayoutParams;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import java.lang.Integer;
import java.lang.AssertionError;
import com.yxcorp.utility.Log;

public class d implements b$b	// class@0014bc
{
    public boolean a;
    public a b;
    public final KwaiXfControlPanel c;

    public void d(KwaiXfControlPanel p0){
       this.c = p0;
       super();
       this.a = false;
    }
    public void a(boolean p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "2")) {
          return;
       }
       if (this.a != null) {
          d tb = this.b;
          Objects.requireNonNull(tb);
          boolean b = false;
          if (!PatchProxy.applyVoid(null, tb, a.class, "4")) {
             tb.e = b;
             tb.c();
          }
          this.b = null;
          this.a = b;
          tb = this.c;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(null, tb, KwaiXfControlPanel.class, "109")) {
             tb.n("onAdjustmentEnd");
             KwaiXfControlPanel j = tb.J;
             if (j != null) {
                Iterator iterator = j.iterator();
                while (iterator.hasNext()) {
                   iterator.next().a();
                }
             }
          }
       }
       return;
    }
    public void b(float p0,float p1,float p2,float p3){
       d tc;
       a uoa = a.class;
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidFourRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), Float.valueOf(p3), this, d.class, "1")) {
          return;
       }
       if (this.a == null) {
          boolean b = true;
          this.a = b;
          boolean b1 = 2;
          int i = (p0 - ((float)this.c.F.getWidth() / 2.00f) < 0)? 2: 1;
          KwaiXfControlPanel c1 = (i == b1)? this.c.C1: this.c.D1;
          this.b = c1;
          Objects.requireNonNull(c1);
          if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Float.valueOf(p1), c1, uoa, "1")) {
             c1.c = p1;
             if (!PatchProxy.applyVoid(null, c1, uoa, "5")) {
                if (c1.b.a().getParent() != null) {
                   if (c1.b.a().getParent() != c1.a) {
                      c1.c();
                   }
                }
                if (c1.a instanceof FrameLayout) {
                   FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-2, -2);
                   layoutParams.gravity = b;
                   layoutParams.topMargin = a1.e(42.00f);
                   c1.a.addView(c1.b.a(), layoutParams);
                   c1.b.a().bringToFront();
                }else {
                   throw new AssertionError("目前仅支持显示在 FrameLayout 中间");
                }
             }
             c1.e = b;
             c1.d = c1.b();
          }
          tc = this.c;
          Objects.requireNonNull(tc);
          if (!PatchProxy.isSupport(KwaiXfControlPanel.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), tc, KwaiXfControlPanel.class, "108")) {
             tc.n("onAdjustmentStart");
             KwaiXfControlPanel j = tc.J;
             if (j != null) {
                Iterator iterator = j.iterator();
                while (iterator.hasNext()) {
                   iterator.next().b(i);
                }
             }
          }
       }
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Float.valueOf(p3), tb, uoa, "2")) {
          if (tb.e != null) {
             tc = (((tb.c - p3) / (float)tb.a.getHeight()) * 0x3fd55555) + tb.d;
             a f = tb.f;
             if (tc - f <= 0) {
                f = tb.g;
                if (tc - f >= 0) {
                   f = tc;
                }
             }
             tb.a(f);
             tb.b.b(f);
             if (tc - f) {
                tb.c = p3;
                tb.d = f;
             }
          }else {
             Log.d(a.h, "adjust should call begin before adjust");
          }
       }
       return;
    }
}
