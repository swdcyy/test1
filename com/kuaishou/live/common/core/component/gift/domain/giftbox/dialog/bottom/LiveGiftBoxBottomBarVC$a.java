package com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.bottom.LiveGiftBoxBottomBarVC$a;
import tl1.a;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.dialog.bottom.LiveGiftBoxBottomBarVC;
import java.lang.Object;
import java.lang.String;
import ul1.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import tl1.a$a;
import ul1.a;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.sort.LiveGiftSortType;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Iterator;
import java.util.List;
import th1.a;
import ch1.c;
import rm1.f;
import com.yxcorp.gifshow.models.Gift;
import ul1.c;

public final class LiveGiftBoxBottomBarVC$a implements a	// class@0011f9
{
    public final LiveGiftBoxBottomBarVC b;

    public void LiveGiftBoxBottomBarVC$a(LiveGiftBoxBottomBarVC p0){
       this.b = p0;
       super();
    }
    public void a(String p0,d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGiftBoxBottomBarVC$a.class, "5")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "tabInfo");
       a$a.j(this, p0, p1);
       return;
    }
    public void c(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGiftBoxBottomBarVC$a.class, "10")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "giftInfo");
       a$a.c(this, p0, p1);
       return;
    }
    public void d(String p0,d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGiftBoxBottomBarVC$a.class, "3")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "tabInfo");
       a$a.g(this, p0, p1);
       return;
    }
    public void e(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGiftBoxBottomBarVC$a.class, "11")) {
          return;
       }
       a.p(p0, "source");
       a$a.d(this, p0, p1);
       return;
    }
    public void f(String p0,LiveGiftSortType p1,d p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGiftBoxBottomBarVC$a.class, "4")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "sortType");
       a.p(p2, "tabInfo");
       a$a.i(this, p0, p1, p2);
       return;
    }
    public void i(String p0,d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGiftBoxBottomBarVC$a.class, "2")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "tabInfo");
       a$a.h(this, p0, p1);
       return;
    }
    public void j(String p0,a p1){
       LiveGiftBoxBottomBarVC$a uoa;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGiftBoxBottomBarVC$a.class, "1")) {
          return;
       }
       a.p(p0, "source");
       if (p1 == null) {
          b.Z(LiveGiftTag.GIFT_BOX, "[LiveGiftBoxBottomBarVC][onGiftSelected]giftInfo is null");
          this.b.X2();
          return;
       }else {
          Iterator iterator = this.b.r.iterator();
          while (true) {
             if (iterator.hasNext()) {
                if (iterator.next().a()) {
                   uoa = null;
                }
             }else {
                uoa = 1;
             }
             if (uoa) {
                this.b.a3();
                this.b.Z2(f.h(p1.b()));
                Gift gift = p1.b().b();
                if (gift != null) {
                   LiveGiftBoxBottomBarVC$a tb = this.b;
                   if (gift.mId == tb.o && tb.p <= p1.b().b().mMaxBatchCount) {
                      uoa = this.b;
                      uoa.Y2(uoa.p);
                      uoa.o = -1;
                      break ;
                   }
                }
                this.b.Y2(1);
                break ;
             }else {
                b.Z(LiveGiftTag.GIFT_BOX, "[LiveGiftBoxBottomBarVC][onGiftSelected]canShowHandleButton = false");
                break ;
             }
          }
          return;
       }
    }
    public void k(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGiftBoxBottomBarVC$a.class, "8")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "giftInfo");
       a$a.b(this, p0, p1);
       return;
    }
    public void l(String p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGiftBoxBottomBarVC$a.class, "6")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "pagerItemInfo");
       a$a.e(this, p0, p1);
       return;
    }
    public void m(String p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGiftBoxBottomBarVC$a.class, "7")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "pagerItemInfo");
       a$a.f(this, p0, p1);
       return;
    }
    public void n(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGiftBoxBottomBarVC$a.class, "9")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "giftInfo");
       a$a.a(this, p0, p1);
       return;
    }
}
