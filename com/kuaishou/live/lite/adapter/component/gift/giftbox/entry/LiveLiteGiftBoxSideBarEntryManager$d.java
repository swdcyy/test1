package com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.LiveLiteGiftBoxSideBarEntryManager$d;
import qi1.b;
import com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.LiveLiteGiftBoxSideBarEntryManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qi1.b$a;
import kotlin.jvm.internal.a;
import android.view.View;
import ul1.d;
import yg1.f;
import wh5.c;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import ch1.a;
import com.kuaishou.live.common.core.component.gift.update.UpdatedGiftResponse;
import com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.sidebar.LiveLiteGiftBoxSideBarItem;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.sidebar.LiveLiteGiftBoxSideBarItem$ViewHolder;
import com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.LiveLiteGiftBoxSideBarEntryManager$d$a;
import com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.sidebar.LiveLiteGiftBoxSideBarItem$a;
import ul1.a;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.sort.LiveGiftSortType;
import java.lang.Integer;
import ul1.c;

public final class LiveLiteGiftBoxSideBarEntryManager$d implements b	// class@001dc5
{
    public final LiveLiteGiftBoxSideBarEntryManager b;

    public void LiveLiteGiftBoxSideBarEntryManager$d(LiveLiteGiftBoxSideBarEntryManager p0){
       this.b = p0;
       super();
    }
    public void D0(){
       if (PatchProxy.applyVoid(null, this, LiveLiteGiftBoxSideBarEntryManager$d.class, "18")) {
          return;
       }
       b$a.p(this);
       return;
    }
    public void J0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteGiftBoxSideBarEntryManager$d.class, "5")) {
          return;
       }
       b$a.d(this, p0);
       return;
    }
    public void M(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteGiftBoxSideBarEntryManager$d.class, "4")) {
          return;
       }
       a.p(p0, "count");
       b$a.c(this, p0);
       return;
    }
    public void O1(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteGiftBoxSideBarEntryManager$d.class, "2")) {
          return;
       }
       a.p(p0, "view");
       b$a.a(this, p0);
       return;
    }
    public void P(){
       if (PatchProxy.applyVoid(null, this, LiveLiteGiftBoxSideBarEntryManager$d.class, "23")) {
          return;
       }
       b$a.u(this);
       return;
    }
    public void a(String p0,d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteGiftBoxSideBarEntryManager$d.class, "22")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "tabInfo");
       b$a.t(this, p0, p1);
       return;
    }
    public void b(f p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteGiftBoxSideBarEntryManager$d.class, "1")) {
          return;
       }
       a.p(p0, "result");
       String str = "LiveGiftSideBarManager";
       if (c.b()) {
          b.P(LiveLogTag.GIFT.appendTag(str), "child lock");
          return;
       }else {
          a uoa = p0.c();
          if (uoa != null) {
             UpdatedGiftResponse updatedGiftR = uoa.b();
             if (updatedGiftR != null) {
                int i = 1;
                LiveLogTag liveLogTag = (this.b.b().b != null)? 1: null;
                if (liveLogTag) {
                   b.P(LiveLogTag.GIFT.appendTag(str), "giftSideBarItem.isViewCreated\(\) == true");
                   LiveLiteGiftBoxSideBarEntryManager$d tb = this.b;
                   LiveLiteGiftBoxSideBarItem liveLiteGift = tb.b();
                   Objects.requireNonNull(liveLiteGift);
                   Object obj = PatchProxy.apply(null, liveLiteGift, LiveLiteGiftBoxSideBarItem.class, "10");
                   if (obj != PatchProxyResult.class) {
                      b = obj.booleanValue();
                   }else {
                      liveLiteGift = liveLiteGift.b;
                      if (liveLiteGift == null || liveLiteGift.f() != i) {
                         i = 0;
                      }
                      b = i;
                   }
                   tb.d(updatedGiftR, b);
                }else {
                   b.P(LiveLogTag.GIFT.appendTag(str), "giftSideBarItem.isViewCreated\(\) == false");
                   this.b.b().o(new LiveLiteGiftBoxSideBarEntryManager$d$a(updatedGiftR, this));
                }
             }
          }
          return;
       }
    }
    public void c(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteGiftBoxSideBarEntryManager$d.class, "12")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "giftInfo");
       b$a.i(this, p0, p1);
       return;
    }
    public void d(String p0,d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteGiftBoxSideBarEntryManager$d.class, "19")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "tabInfo");
       b$a.q(this, p0, p1);
       return;
    }
    public void e(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteGiftBoxSideBarEntryManager$d.class, "13")) {
          return;
       }
       a.p(p0, "source");
       b$a.j(this, p0, p1);
       return;
    }
    public void f(String p0,LiveGiftSortType p1,d p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveLiteGiftBoxSideBarEntryManager$d.class, "21")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "sortType");
       a.p(p2, "tabInfo");
       b$a.s(this, p0, p1, p2);
       return;
    }
    public void g(){
       PatchProxy.applyVoid(null, this, LiveLiteGiftBoxSideBarEntryManager$d.class, "7");
    }
    public void g2(int p0,String p1){
       LiveLiteGiftBoxSideBarEntryManager$d uod = LiveLiteGiftBoxSideBarEntryManager$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uod, "8")) {
          return;
       }
       a.p(p1, "message");
       b$a.e(this, p0, p1);
       return;
    }
    public void h(){
       PatchProxy.applyVoid(null, this, LiveLiteGiftBoxSideBarEntryManager$d.class, "6");
    }
    public void h2(){
       if (PatchProxy.applyVoid(null, this, LiveLiteGiftBoxSideBarEntryManager$d.class, "14")) {
          return;
       }
       b$a.k(this);
       return;
    }
    public void i(String p0,d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteGiftBoxSideBarEntryManager$d.class, "20")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "tabInfo");
       b$a.r(this, p0, p1);
       return;
    }
    public void j(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteGiftBoxSideBarEntryManager$d.class, "10")) {
          return;
       }
       a.p(p0, "source");
       b$a.g(this, p0, p1);
       return;
    }
    public void k(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteGiftBoxSideBarEntryManager$d.class, "11")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "giftInfo");
       b$a.h(this, p0, p1);
       return;
    }
    public void l(String p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteGiftBoxSideBarEntryManager$d.class, "15")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "pagerItemInfo");
       b$a.m(this, p0, p1);
       return;
    }
    public void m(String p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteGiftBoxSideBarEntryManager$d.class, "16")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "pagerItemInfo");
       b$a.n(this, p0, p1);
       return;
    }
    public void n(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteGiftBoxSideBarEntryManager$d.class, "9")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "giftInfo");
       b$a.f(this, p0, p1);
       return;
    }
    public void p1(Integer p0,int p1){
       LiveLiteGiftBoxSideBarEntryManager$d uod = LiveLiteGiftBoxSideBarEntryManager$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uod, "3")) {
          return;
       }
       b$a.b(this, p0, p1);
       return;
    }
    public void u0(){
       if (PatchProxy.applyVoid(null, this, LiveLiteGiftBoxSideBarEntryManager$d.class, "17")) {
          return;
       }
       b$a.o(this);
       return;
    }
}
