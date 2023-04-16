package com.kuaishou.merchant.live.lite.sidebar.LiveMerchantLiteSideBarPresenter;
import com.kuaishou.merchant.live.lite.LiveMerchantLiteBarBasePresenter;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import m24.c2;
import l64.d;
import z1.a;
import com.kuaishou.live.lite.sidebar.e;
import d93.a;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import or5.b;
import com.kuaishou.android.model.mix.LiveMerchantFeedData;
import com.kuaishou.merchant.live.MerchantLiveLogBiz;
import java.lang.StringBuilder;
import p74.a;
import o74.a;
import com.kuaishou.merchant.live.lite.sidebar.a;
import l64.c;
import com.kuaishou.merchant.live.lite.sidebar.a$a;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import la3.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import k2b.e0;
import h64.o;
import com.kuaishou.live.lite.sidebar.e$a;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService$a;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService;

public class LiveMerchantLiteSideBarPresenter extends LiveMerchantLiteBarBasePresenter	// class@001a31
{
    public String J;
    public e K;
    public a L;
    public boolean M;

    public void LiveMerchantLiteSideBarPresenter(){
       super();
       this.J = "LiveMerchantLiteSideBarPresenter";
       this.M = false;
    }
    public static void h9(LiveMerchantLiteSideBarPresenter p0,boolean p1){
       Objects.requireNonNull(p0);
       LiveMerchantLiteSideBarPresenter liveMerchant = LiveMerchantLiteSideBarPresenter.class;
       if (!PatchProxy.isSupport(liveMerchant) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p1), p0, liveMerchant, "7")) {
          p1 = (p1 && p0.H.a())? true: false;
          p0.k9(p1);
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantLiteSideBarPresenter.class, "2")) {
          return;
       }
       super.F8();
       this.K.e(new d(this));
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantLiteSideBarPresenter.class, "3")) {
          return;
       }
       super.H8();
       this.K.c(new d(this));
       return;
    }
    public void Y8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantLiteSideBarPresenter.class, "1")) {
          return;
       }
       super.Y8(p0);
       this.K = p0.a(e.class);
       return;
    }
    public void d9(String p0){
       LiveMerchantLiteSideBarPresenter liveMerchant = LiveMerchantLiteSideBarPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, liveMerchant, "4")) {
          return;
       }
       if (this.w.j0() != null && (this.w.j0().mMerchantData == null || !this.w.j0().mMerchantData.isShopLive())) {
          a.s(MerchantLiveLogBiz.BOTTOM_BAR, this.J, "非挂车直播间，不展示侧边栏入口");
          return;
       }else {
          MerchantLiveLogBiz bOTTOM_BAR = MerchantLiveLogBiz.BOTTOM_BAR;
          a.s(bOTTOM_BAR, this.J, "refreshSideBarItem show type: "+p0);
          Object[] objArray = null;
          if (this.L == null && !PatchProxy.applyVoid(objArray, this, liveMerchant, "6")) {
             a uoa = new a();
             this.L = uoa;
             c uoc = new c(this);
             if (!PatchProxy.applyVoidOneRefs(uoc, uoa, a.class, "1")) {
                uoa.b = uoc;
                uoa = uoa.a;
                if (uoa != null) {
                   uoa.a.setOnClickListener(uoc);
                }
             }
          }
          if (this.H.a()) {
             if (this.D != null) {
                a.s(bOTTOM_BAR, this.J, "lite side bar already show");
                return;
             }else {
                this.D = true;
                this.B.a(281, objArray);
                o.b(this.A.a(), this.A.getPage());
                a.s(bOTTOM_BAR, this.J, "lite side bar show");
                this.j9(true);
             }
          }else {
             this.D = false;
             a.s(bOTTOM_BAR, this.J, "lite side bar hide");
             this.j9(false);
          }
          return;
       }
    }
    public final void j9(boolean p0){
       LiveMerchantLiteSideBarPresenter liveMerchant = LiveMerchantLiteSideBarPresenter.class;
       if (PatchProxy.isSupport(liveMerchant) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveMerchant, "5")) {
          return;
       }
       boolean b = this.K.j();
       if (p0) {
          if (b) {
             this.k9(true);
          }
          this.K.f(3, this.L, false);
       }else if(b){
          this.k9(false);
       }
       this.K.h(3, this.L, false);
       return;
    }
    public final void k9(boolean p0){
       LiveMerchantLiteSideBarPresenter liveMerchant = LiveMerchantLiteSideBarPresenter.class;
       if (PatchProxy.isSupport(liveMerchant) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveMerchant, "8")) {
          return;
       }
       if (p0) {
          if (this.F == null) {
             this.c9();
          }
          if (this.M == null) {
             this.E.a(this.F);
             this.M = true;
          }
       }else {
          this.M = false;
          LiveMerchantLiteBarBasePresenter tF = this.F;
          if (tF != null) {
             this.E.c(tF);
          }
       }
       return;
    }
}
