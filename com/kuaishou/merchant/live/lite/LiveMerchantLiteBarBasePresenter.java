package com.kuaishou.merchant.live.lite.LiveMerchantLiteBarBasePresenter;
import b93.d;
import m24.c2;
import com.kuaishou.merchant.live.bottombar.view.LiveMerchantAudienceBottomBarView$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCShopOpened;
import brd.t;
import ks3.k0;
import h64.f;
import h64.m;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCShopClosed;
import h64.e;
import h64.n;
import com.kuaishou.livestream.message.nano.SCSandeagoOpened;
import h64.g;
import h64.b;
import com.kuaishou.livestream.message.nano.SCSandeagoClosed;
import h64.h;
import h64.j;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCShopThirdControl;
import h64.i;
import h64.k;
import tkd.b;
import tkd.d;
import fs5.a;
import cc3.a;
import h64.c;
import com.kuaishou.merchant.live.bottombar.view.LiveMerchantAudienceBottomBarView;
import c93.b;
import or5.d;
import xp5.i;
import d93.a;
import ks3.b;
import la3.a;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import xm4.a;
import lnc.a1;
import java.util.Objects;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import j64.a;
import h64.a;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import or5.b;
import com.kuaishou.android.model.mix.LiveMerchantFeedData;
import u14.b;
import u14.a;
import xp5.g;
import cjd.e;
import erd.o;
import h64.d;
import h64.l;

public class LiveMerchantLiteBarBasePresenter extends d	// class@001a27
{
    public i A;
    public a B;
    public String C;
    public boolean D;
    public LiveLiteBottomBarService E;
    public a F;
    public LiveMerchantAudienceBottomBarView G;
    public final c2 H;
    public final LiveMerchantAudienceBottomBarView$b I;
    public String v;
    public d w;
    public k0 x;
    public b y;
    public a z;

    public void LiveMerchantLiteBarBasePresenter(){
       super();
       this.v = "LiveMerchantLiteBarBasePresenter";
       this.H = new c2();
       this.I = new LiveMerchantAudienceBottomBarView$b();
    }
    public void F8(){
       LiveMerchantLiteBarBasePresenter liveMerchant = LiveMerchantLiteBarBasePresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveMerchant, "3")) {
          return;
       }
       super.F8();
       this.e9();
       if (!PatchProxy.applyVoid(objArray, this, liveMerchant, "5")) {
          this.X7(this.x.b(360, LiveStreamMessages$SCShopOpened.class).subscribe(new f(this), new m(this)));
          this.X7(this.x.b(361, LiveStreamMessages$SCShopClosed.class).subscribe(new e(this), new n(this)));
          this.X7(this.x.b(550, SCSandeagoOpened.class).subscribe(new g(this), new b(this)));
          this.X7(this.x.b(551, SCSandeagoClosed.class).subscribe(new h(this), new j(this)));
          this.X7(this.x.b(1077, LiveStreamMessages$SCShopThirdControl.class).subscribe(new i(this), new k(this)));
       }
       if (!PatchProxy.applyVoid(objArray, this, liveMerchant, "7")) {
          int i = -1397441499;
          if (!d.a(i).mf() || !d.a(i).a70()) {
             this.X7(this.z.d().subscribe(new c(this)));
          }
       }
       this.I.c(R.raw.arg_RES_7f0f003b);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantLiteBarBasePresenter.class, "4")) {
          return;
       }
       LiveMerchantLiteBarBasePresenter tG = this.G;
       if (tG != null) {
          tG.d();
          this.G = null;
       }
       return;
    }
    public void X8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantLiteBarBasePresenter.class, "1")) {
          return;
       }
       this.w = p0.a(d.class);
       this.A = p0.a(i.class);
       return;
    }
    public void Y8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMerchantLiteBarBasePresenter.class, "2")) {
          return;
       }
       this.x = p0.a(k0.class);
       this.y = p0.a(b.class);
       this.z = p0.a(a.class);
       this.B = p0.a(a.class);
       this.E = p0.a(LiveLiteBottomBarService.class);
       return;
    }
    public void c9(){
       ViewGroup$LayoutParams layoutParams;
       if (PatchProxy.applyVoid(null, this, LiveMerchantLiteBarBasePresenter.class, "9")) {
          return;
       }
       LiveMerchantAudienceBottomBarView liveMerchant = a.a(this.getActivity(), R.layout.arg_RES_7f0d07f8);
       this.G = liveMerchant;
       liveMerchant.setShopIconBackgroundColor(R.color.arg_RES_7f060610);
       LiveMerchantLiteBarBasePresenter tG = this.G;
       int i = a1.e(40.00f);
       int i1 = a1.e(40.00f);
       Objects.requireNonNull(tG);
       if (!PatchProxy.isSupport(LiveMerchantAudienceBottomBarView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), Integer.valueOf(i1), tG, LiveMerchantAudienceBottomBarView.class, "4")) {
          layoutParams = tG.c.getLayoutParams();
          layoutParams.width = i;
          layoutParams.height = i1;
          tG.c.setLayoutParams(layoutParams);
       }
       tG = this.G;
       i = a1.e(67.00f);
       i1 = a1.e(67.00f);
       Objects.requireNonNull(tG);
       if (!PatchProxy.isSupport(LiveMerchantAudienceBottomBarView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), Integer.valueOf(i1), tG, LiveMerchantAudienceBottomBarView.class, "5")) {
          layoutParams = tG.b.getLayoutParams();
          layoutParams.width = i;
          layoutParams.height = i1;
          tG.b.setLayoutParams(layoutParams);
       }
       this.F = new a(this.G);
       this.G.a(this.I, false, false);
       this.G.setOnClickListener(new a(this));
       return;
    }
    public void d9(String p0){
    }
    public final void e9(){
       if (PatchProxy.applyVoid(null, this, LiveMerchantLiteBarBasePresenter.class, "6")) {
          return;
       }
       LiveMerchantFeedData merchantData = this.w.r5().getMerchantData();
       if (merchantData != null && merchantData.isShopLive()) {
          this.X7(a.a().b(this.w.getLiveStreamId(), this.w.d(), 3).map(new e()).subscribe(new d(this), new l(this)));
       }
       return;
    }
}
