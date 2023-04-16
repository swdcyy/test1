package com.kuaishou.live.lite.adapter.component.gift.giftguide.entry.a;
import com.kuaishou.live.lite.sidebar.e;
import t73.b;
import z1.k;
import com.kuaishou.live.lite.adapter.component.gift.giftguide.entry.LiveLiteGiftGuideType;
import com.kuaishou.live.lite.adapter.component.gift.giftguide.entry.a$a;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import t73.c;
import z1.a;
import w73.s;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import w73.s$b;
import w73.a;
import com.kuaishou.live.lite.adapter.component.gift.giftguide.entry.bottombar.a;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$BottomBarType;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$a;
import com.kuaishou.live.lite.adapter.component.gift.giftguide.entry.sidebar.b;
import com.kuaishou.live.lite.sidebar.e$a;
import crd.b;
import lnc.b9;
import java.lang.Boolean;

public class a	// class@001ddc
{
    public final e a;
    public final b b;
    public final LiveLiteGiftGuideType c;
    public final a$a d;
    public b e;
    public a f;
    public s g;
    public boolean h;
    public final k i;
    public final k j;
    public final k k;
    public final AtomicBoolean l;
    public long m;
    public b n;
    public b o;

    public void a(e p0,b p1,k p2,k p3,k p4,LiveLiteGiftGuideType p5,a$a p6){
       super();
       this.l = new AtomicBoolean(false);
       this.a = p0;
       this.b = p1;
       this.d = p6;
       p0.e(new c(this));
       this.i = p2;
       this.j = p3;
       this.k = p4;
       this.c = p5;
    }
    public final void a(s p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "9")) {
          return;
       }
       b.S(LiveGiftTag.LIVE_GIFT_GUIDE.appendTag("GiftGuideSideBarHandler"), "addGiftGuideBottomBarItem", "liveLiteGiftGuideStatus", p0);
       a uoa = null;
       if (p0 instanceof s$b) {
          uoa = p0.a();
       }
       a uoa1 = uoa;
       a tf = this.f;
       if (tf == null) {
          a uoa2 = new a(this.b, uoa1, this.i, this.j, this.k, this.c.mBottomBarType, this.l);
          this.f = tf;
          this.d.a(tf);
       }else {
          tf.e(uoa1);
       }
       return;
    }
    public void b(s p0){
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "2")) {
          return;
       }
       LiveGiftTag lIVE_GIFT_GU = LiveGiftTag.LIVE_GIFT_GUIDE;
       String str = "GiftGuideSideBarHandler";
       lIVE_GIFT_GU.appendTag(str);
       String str1 = "liveLiteGiftGuideStatus";
       b.S(lIVE_GIFT_GU, "addGiftGuideEntryItem", str1, p0);
       this.h = true;
       this.g = p0;
       if (!PatchProxy.applyVoidOneRefs(p0, this, uoa, "10")) {
          lIVE_GIFT_GU.appendTag(str);
          b.S(lIVE_GIFT_GU, "addGiftGuideSideBarItem", str1, p0);
          this.g = p0;
          uoa = this.e;
          if (uoa == null) {
             a tc = this.c;
             b uob = new b(this.b, p0, this.i, this.j, this.k, tc.mSideBarItemType, tc.mSideBarLogName, "https://static.yximgs.com/udata/pkg/kwai-client-image/live_lite_attach/live_lite_quick_gift_effect.webp");
             this.e = uoa;
             this.d.b(uoa);
          }else {
             uoa.l(p0);
          }
       }
       if (this.a.j()) {
          this.a(p0);
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       b9.a(this.n);
       b9.a(this.o);
       this.h = false;
       this.g = null;
       a te = this.e;
       if (te != null) {
          te.o();
       }
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, a.class, "8")) {
          return;
       }
       b.P(LiveGiftTag.LIVE_GIFT_GUIDE.appendTag("GiftGuideSideBarHandler"), "removeGiftGuideBottomBarItem");
       a tf = this.f;
       if (tf == null) {
          return;
       }
       this.d.c(tf);
       this.f = null;
       return;
    }
    public void e(){
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, uoa, "3")) {
          return;
       }
       this.h = false;
       if (!PatchProxy.applyVoid(null, this, uoa, "7")) {
          b.P(LiveGiftTag.LIVE_GIFT_GUIDE.appendTag("GiftGuideSideBarHandler"), "removeGiftGuideSideBarItem");
          uoa = this.e;
          if (uoa != null) {
             this.d.d(uoa);
             this.e = null;
          }
       }
       this.d();
       return;
    }
    public void f(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "4")) {
          return;
       }
       if (this.e != null && !this.a.j()) {
          this.e.p(p0);
       }
       if (this.f != null && this.a.j()) {
          this.f.k(p0);
       }
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       if (this.e != null && !this.a.j()) {
          this.e.q();
       }
       if (this.f != null && this.a.j()) {
          this.f.l();
       }
       return;
    }
}
