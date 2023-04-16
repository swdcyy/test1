package com.kuaishou.live.common.core.component.newpendant.top.tempplay.flipper.c;
import ks5.m;
import android.content.Context;
import lp3.e;
import z1.a;
import java.lang.Object;
import com.kuaishou.live.common.core.component.newpendant.top.tempplay.flipper.c$a;
import com.kuaishou.live.common.core.component.newpendant.top.tempplay.flipper.LiveTopPendantViewFlipper;
import xp5.i;
import java.lang.Class;
import lp3.c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import android.view.ViewGroup$LayoutParams;
import android.widget.ViewFlipper;
import android.widget.FrameLayout;
import android.view.View;
import android.view.ViewGroup;
import ks5.l;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ks5.i;
import ks5.h;
import java.util.Objects;
import java.util.Iterator;
import java.util.ArrayList;
import ev1.a;
import ekd.k1;
import java.lang.Runnable;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.feature.api.live.merchant.top.LiveTopPendantTempPlayService$LiveTempPlayRightPendantLayoutOrder;
import java.lang.Enum;
import lnc.a1;
import com.kwai.feature.api.live.merchant.top.LiveTopPendantTempPlayService$LiveTempPlayPendantBizPriority;
import ev1.c;
import ev1.d;

public class c implements m	// class@0016d2
{
    public final LiveTopPendantViewFlipper a;
    public final ViewGroup b;
    public final e c;
    public final h d;
    public final a e;
    public Runnable f;
    public Runnable g;

    public void c(Context p0,e p1,a p2){
       super();
       this.d = new c$a(this);
       this.c = p1;
       LiveTopPendantViewFlipper liveTopPenda = new LiveTopPendantViewFlipper(p0);
       this.a = liveTopPenda;
       liveTopPenda.setLiveStreamPackage(p1.a(i.class).a());
       liveTopPenda.setLayoutParams(new ViewGroup$LayoutParams(-2, -2));
       FrameLayout uFrameLayout = new FrameLayout(p0);
       this.b = uFrameLayout;
       uFrameLayout.addView(liveTopPenda);
       this.e = p2;
    }
    public View b(ViewGroup p0){
       return this.b;
    }
    public boolean c(){
       return l.d(this);
    }
    public void d(ViewGroup p0){
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "3")) {
          return;
       }
       l.e(this, p0);
       if (!PatchProxy.applyVoid(null, this, uoc, "10")) {
          this.c.a(i.class).Ld(this.d);
       }
       c ta = this.a;
       uoc = this.e;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(uoc, ta, LiveTopPendantViewFlipper.class, "2") && ta.h == null) {
          ta.h = true;
          ta.e();
          ta.d();
          Iterator iterator = ta.g.iterator();
          while (iterator.hasNext()) {
             uoc.accept(iterator.next());
          }
          a.b(ta.i, ta.g.size());
       }
       return;
    }
    public void e(ViewGroup p0){
       c uoc = c.class;
       String str = "4";
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, str)) {
          return;
       }
       l.f(this, p0);
       c ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, LiveTopPendantViewFlipper.class, str)) {
          ta.h = false;
          ta.g.clear();
          ta.removeAllViews();
          ta.stopFlipping();
          k1.n(ta);
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, uoc, "11")) {
          this.c.a(i.class).Ld(objArray);
       }
       this.b.removeCallbacks(this.f);
       this.b.removeCallbacks(this.g);
       return;
    }
    public String getId(){
       return "";
    }
    public int getLayoutOrder(){
       Object obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return LiveTopPendantTempPlayService$LiveTempPlayRightPendantLayoutOrder.FLIPPER.ordinal();
    }
    public String h(){
       return l.c(this);
    }
    public int l(){
       Object obj = PatchProxy.apply(null, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.e(40.00f);
    }
    public int m(){
       return 2;
    }
    public int n(){
       return 2;
    }
    public int o(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return LiveTopPendantTempPlayService$LiveTempPlayPendantBizPriority.FLIPPER.ordinal();
    }
    public int[] q(){
       return l.a(this);
    }
    public void t(m p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "7")) {
          return;
       }
       c uoc = new c(this, p0);
       this.f = uoc;
       this.b.post(uoc);
       return;
    }
    public void u(m p0,a p1,a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c.class, "8")) {
          return;
       }
       d uod = new d(this, p0, p1, p2);
       this.g = uod;
       this.b.post(uod);
       return;
    }
}
