package com.kuaishou.live.audience.component.pendant.carousel.LiveCarouselPendantViewController;
import lv1.d;
import com.kuaishou.live.audience.component.pendant.carousel.LiveCarouselPendantViewController$a;
import nsd.u;
import t02.a0;
import android.content.Context;
import androidx.viewpager.widget.ViewPager;
import android.widget.LinearLayout;
import java.util.List;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import lv1.f;
import com.kuaishou.live.audience.component.pendant.carousel.LiveCarouselPendantViewController$mPendantViewLoopTask$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.audience.component.pendant.carousel.LiveCarouselPendantViewController$b;
import h3.a;
import java.util.HashSet;
import androidx.viewpager.widget.ViewPager$i;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import java.lang.Integer;
import java.util.Collection;
import com.kwai.imsdk.internal.util.b;
import m21.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import m21.a;
import l12.c;
import java.util.Objects;
import m21.b$a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.lang.Boolean;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Runnable;
import e93.f;

public final class LiveCarouselPendantViewController extends d	// class@000bbe
{
    public a0 g;
    public f h;
    public long i;
    public boolean j;
    public boolean k;
    public Set l;
    public final p m;
    public final ViewPager$i n;
    public static final LiveCarouselPendantViewController$a o;

    static {
       LiveCarouselPendantViewController.o = new LiveCarouselPendantViewController$a(null);
    }
    public void LiveCarouselPendantViewController(a0 p0,Context p1,ViewPager p2,LinearLayout p3,List p4,View p5,long p6){
       a.p(p0, "livePlayCallerContext");
       a.p(p1, "context");
       a.p(p2, "viewPager");
       a.p(p3, "indicatorLayout");
       a.p(p4, "pendantViewItemList");
       a.p(p5, "pendantLayout");
       super(p1, p2, p3, p4, p5);
       this.g = p0;
       this.h = new f(p4);
       this.i = p6;
       boolean b = true;
       this.j = b;
       this.m = s.c(new LiveCarouselPendantViewController$mPendantViewLoopTask$2(this));
       LiveCarouselPendantViewController$b uob = new LiveCarouselPendantViewController$b(this);
       this.n = uob;
       p2.setAdapter(this.h);
       this.l = new HashSet();
       this.c.addOnPageChangeListener(uob);
       d tc = this.c;
       a.o(tc, "mLivePendantViewPager");
       if (!this.d.size()) {
       }else {
          b = this.d.size();
       }
       tc.setCurrentItem((b * 100));
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, LiveCarouselPendantViewController.class, "6")) {
          return;
       }
       super.b();
       d tc = this.c;
       a.o(tc, "mLivePendantViewPager");
       tc.setAdapter(null);
       this.l.clear();
       this.h();
       return;
    }
    public final void e(int p0){
       LiveCarouselPendantViewController liveCarousel = LiveCarouselPendantViewController.class;
       if (PatchProxy.isSupport(liveCarousel) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, liveCarousel, "2")) {
          return;
       }
       if (!b.c(this.d) && this.j != null) {
          p0 = p0 % this.d.size();
          if (!this.l.contains(Integer.valueOf(p0))) {
             this.l.add(Integer.valueOf(p0));
             b$a a = b.a;
             a0 z2 = this.g.Z2;
             a.o(z2, "mLivePlayCallerContext.mLiveBasicContext");
             ClientContent$LiveStreamPackage liveStreamPa = z2.a();
             a.o(liveStreamPa, "mLivePlayCallerContext.m¡­Context.liveStreamPackage");
             String str = this.d.get(p0).b.a();
             Objects.requireNonNull(a);
             if (!PatchProxy.isSupport(b$a.class) || !PatchProxy.applyVoidThreeRefs(liveStreamPa, str, Integer.valueOf(p0), a, b$a.class, "1")) {
                a.p(liveStreamPa, "liveStreamPackage");
                a.p(str, "bizId");
                ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                showEvent.elementPackage = uElementPack;
                uElementPack.action2 = "ROTATION_ACTIVITY_PENDANT";
                i3 oi3 = i3.f();
                oi3.c("index", Integer.valueOf(p0));
                oi3.d("biz_id", str);
                uElementPack.params = oi3.e();
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                showEvent.contentPackage = uContentPack;
                uContentPack.liveStreamPackage = liveStreamPa;
                u1.g0(showEvent);
             }
          }
       }
       return;
    }
    public final void f(boolean p0){
       LiveCarouselPendantViewController liveCarousel = LiveCarouselPendantViewController.class;
       if (PatchProxy.isSupport(liveCarousel) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveCarousel, "7")) {
          return;
       }
       this.j = p0;
       if (p0) {
          if (this.d.size() > 0) {
             this.g();
             d tc = this.c;
             a.o(tc, "mLivePendantViewPager");
             this.e(tc.getCurrentItem());
          }
       }else {
          this.h();
       }
       return;
    }
    public final void g(){
       LiveCarouselPendantViewController liveCarousel = LiveCarouselPendantViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveCarousel, "4")) {
          return;
       }
       LiveCarouselPendantViewController ti = this.i;
       if (!PatchProxy.isSupport(liveCarousel) || !PatchProxy.applyVoidOneRefs(Long.valueOf(ti), this, liveCarousel, "5")) {
          this.h();
          this.i = ti;
          boolean b = true;
          if (this.d.size() > b) {
             this.k = b;
             Runnable runnable = PatchProxy.apply(objArray, this, liveCarousel, "1");
             if (runnable == PatchProxyResult.class) {
                runnable = this.m.getValue();
             }
             f.k("mPendantViewLoopTask", runnable, this, this.i);
          }
       }
       return;
    }
    public final void h(){
       if (PatchProxy.applyVoid(null, this, LiveCarouselPendantViewController.class, "3")) {
          return;
       }
       this.k = false;
       f.g(this);
       return;
    }
}
