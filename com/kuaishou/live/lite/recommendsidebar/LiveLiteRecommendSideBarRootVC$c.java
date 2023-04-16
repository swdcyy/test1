package com.kuaishou.live.lite.recommendsidebar.LiveLiteRecommendSideBarRootVC$c;
import xc3.d;
import com.kuaishou.live.lite.recommendsidebar.LiveLiteRecommendSideBarRootVC;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.recommendsidebar.b;
import qvb.i;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import xc3.c;
import java.util.Objects;
import yw6.g;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.lang.Integer;
import yw6.j;
import java.util.List;
import xc3.b;
import ok.o;
import xw6.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.live.model.d;
import yc3.x;
import com.kuaishou.live.lite.recommendsidebar.LiveLiteRecommendSideBarRootVC$a;

public final class LiveLiteRecommendSideBarRootVC$c implements d	// class@000ae2
{
    public final LiveLiteRecommendSideBarRootVC a;

    public void LiveLiteRecommendSideBarRootVC$c(LiveLiteRecommendSideBarRootVC p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LiveLiteRecommendSideBarRootVC$c.class, "3")) {
          return;
       }
       this.a.a3().k();
       return;
    }
    public void b(i p0,QPhoto p1,boolean p2){
       c b;
       boolean b1;
       if (PatchProxy.isSupport(LiveLiteRecommendSideBarRootVC$c.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, LiveLiteRecommendSideBarRootVC$c.class, "5")) {
          return;
       }
       String str = "pageList";
       a.p(p0, str);
       String str1 = "targetPhoto";
       a.p(p1, str1);
       c uoc = this.a.W2();
       Objects.requireNonNull(uoc);
       if (!PatchProxy.isSupport(c.class) || !PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.FALSE, uoc, c.class, "2")) {
          a.p(p0, str);
          a.p(p1, str1);
          if (uoc.e == null) {
             b = uoc.b;
             if (b == null) {
                a.S("slidePlayViewModel");
             }
             a.m(b);
             uoc.e = b.O0();
             b = uoc.b;
             if (b == null) {
                a.S("slidePlayViewModel");
             }
             a.m(b);
             uoc.f = b.getCurrentPhoto();
             b = uoc.b;
             if (b == null) {
                a.S("slidePlayViewModel");
             }
             a.m(b);
             uoc.g = Integer.valueOf(b.a0());
             b1 = false;
          }else {
             b1 = true;
          }
          uoc.d = new j(p0.getItems(), p0, b.b);
          c b2 = uoc.b;
          if (b2 == null) {
             a.S("slidePlayViewModel");
          }
          a.m(b2);
          c d = uoc.d;
          a.m(d);
          b2.N0().w(d, p1, b1, 0, "DetailLiveSlideDataSourceReplace");
          uoc.c = true;
       }
       this.a.n.S1(false);
       return;
    }
    public void c(QPhoto p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteRecommendSideBarRootVC$c.class, "1")) {
          return;
       }
       a.p(p0, "photo");
       a.p(p1, "reason");
       if (p1.hashCode() == -748576386 && p1.equals("BACK_ORIGIN")) {
          d.o(p0.getEntity(), 329);
       }else {
          d.o(p0.getEntity(), 328);
       }
       if (x.d()) {
          this.a.X2().o(p0, true, p1);
       }else {
          int i = this.a.X2().p(p0);
          if (i >= 0) {
             this.a.X2().k(i, true);
          }
       }
       return;
    }
    public void d(boolean p0,int p1){
       LiveLiteRecommendSideBarRootVC$c uoc = LiveLiteRecommendSideBarRootVC$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, uoc, "4")) {
          return;
       }
       this.a.X2().d(p0, p1);
       return;
    }
    public void e(QPhoto p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteRecommendSideBarRootVC$c.class, "2")) {
          return;
       }
       a.p(p0, "originalFeed");
       if (p1 == null || (p1.hashCode() == -748576386 && p1.equals("BACK_ORIGIN"))) {
          d.o(p0.getEntity(), 329);
       }else {
          d.o(p0.getEntity(), 328);
       }
       this.a.W2().a(p0, true);
       return;
    }
}
