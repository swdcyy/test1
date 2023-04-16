package com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.g;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.app.Application$ActivityLifecycleCallbacks;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.app.Activity;
import oi4.a;
import oi4.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.g$a;
import android.view.View$OnClickListener;
import kk4.e;
import ekd.j;
import java.lang.CharSequence;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import brd.t;
import com.kuaishou.merchant.basic.util.d;
import nk4.w;
import erd.g;
import crd.b;
import java.util.Collection;
import ekd.q;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.presenter.g$b;
import android.view.ViewTreeObserver;
import android.app.Application;
import o56.a;
import com.kwai.library.widget.popup.common.c;
import ekd.m1;
import java.lang.Boolean;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.MerchantLivePurchasePanelFragment;
import android.os.Bundle;
import com.kuaishou.merchant.transaction.base.purchasepanel.b;

public class g extends PresenterV2 implements ViewTreeObserver$OnGlobalLayoutListener, Application$ActivityLifecycleCallbacks	// class@000823
{
    public boolean p;
    public MerchantLivePurchasePanelFragment q;
    public LiveMerchantBaseContext r;
    public MerchantLivePurchasePanelResponse s;
    public e t;
    public View u;
    public TextView v;
    public View w;
    public b x;

    public void g(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, g.class, "3")) {
          return;
       }
       int i = 8;
       int i1 = 0;
       if (this.p != null) {
          this.u.setVisibility(i);
       }else {
          this.u.setVisibility(i1);
          b.a(this.getActivity()).t(this.r.getLiveStreamPackage(), this.s);
       }
       this.u.setOnClickListener(new g$a(this));
       if (j.h(this.t.d)) {
          this.v.setText(this.t.b);
       }else {
          this.X7(d.e(j.a(this.t.d)).subscribe(new w(this)));
       }
       if (q.f(this.t.c)) {
          this.w.setVisibility(i);
       }else {
          this.w.setVisibility(i1);
          b.a(this.getActivity()).B(this.r.getLiveStreamPackage(), this.s);
       }
       this.w.setOnClickListener(new g$b(this));
       this.w.getViewTreeObserver().addOnGlobalLayoutListener(this);
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, g.class, "6")) {
          return;
       }
       a.b().registerActivityLifecycleCallbacks(this);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, g.class, "7")) {
          return;
       }
       a.b().unregisterActivityLifecycleCallbacks(this);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, g.class, "5")) {
          return;
       }
       g tx = this.x;
       if (tx != null) {
          tx.o();
          this.x = null;
       }
       this.w.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       this.u = m1.f(p0, 0x7f0a1997);
       this.v = m1.f(p0, 0x7f0a199a);
       this.w = m1.f(p0, 0x7f0a1999);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_AUDIENCE_ORDER_CONFIRM_HIDE_BACK_ICON").booleanValue();
       this.q = this.r8("LIVE_AUDIENCE_ORDER_CONFIRM_PANEL_FRAGMENT");
       this.r = this.r8("LIVE_BASE_CONTEXT");
       this.s = this.q8(MerchantLivePurchasePanelResponse.class);
       this.t = this.q8(e.class);
       return;
    }
    public void onActivityCreated(Activity p0,Bundle p1){
    }
    public void onActivityDestroyed(Activity p0){
    }
    public void onActivityPaused(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "9")) {
          return;
       }
       g tx = this.x;
       if (tx != null && tx.K()) {
          this.x.o();
       }
       return;
    }
    public void onActivityResumed(Activity p0){
    }
    public void onActivitySaveInstanceState(Activity p0,Bundle p1){
    }
    public void onActivityStarted(Activity p0){
    }
    public void onActivityStopped(Activity p0){
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, g.class, "8")) {
          return;
       }
       g tx = this.x;
       if (tx != null && tx.K()) {
          this.x.b0();
       }
       return;
    }
}
