package com.kuaishou.merchant.transaction.live.orderconfirmpanel.MerchantLivePurchasePanelContainerFragment;
import ml8.d;
import ni4.b;
import com.kuaishou.merchant.basic.fragment.MerchantInterceptDismissBottomSheetFragment;
import com.yxcorp.gifshow.fragment.ContainerFragment;
import java.lang.String;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.yxcorp.utility.n;
import lnc.a1;
import sk4.c;
import et3.a;
import com.yxcorp.gifshow.fragment.BottomSheetFragment;
import com.kuaishou.merchant.basic.util.h;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.basic.fragment.MerchantBottomSheetFragment;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.MerchantLivePurchasePanelFragment;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.MerchantLivePurchasePanelFragment$b;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.MerchantLivePurchasePanelResponse;
import com.kuaishou.merchant.basic.fragment.MerchantRecycleFragment;
import com.kuaishou.merchant.basic.fragment.f;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import ue4.o;
import androidx.fragment.app.DialogFragment;
import ekd.m1;
import android.widget.FrameLayout;
import com.kuaishou.merchant.basic.drawloggerwidget.WatchDispatchDrawFrameLayout;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.MerchantLivePurchasePanelContainerFragment$a;
import com.yxcorp.gifshow.widget.m;
import brd.t;
import java.lang.Number;
import android.os.Bundle;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import bt3.a;
import java.lang.ref.WeakReference;
import java.util.List;
import tkd.b;
import tkd.d;
import ma4.e;
import ma4.c;
import com.yxcorp.gifshow.util.rx.RxBus;
import gu3.b;
import t45.d;
import brd.z;
import yj4.d;
import erd.g;
import crd.b;
import android.os.Parcelable;
import org.parceler.b;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import java.lang.StringBuilder;
import p74.a;
import o74.a;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext$Builder;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import xm4.a;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import lnc.b9;

public class MerchantLivePurchasePanelContainerFragment extends MerchantInterceptDismissBottomSheetFragment implements d, b	// class@0007e2
{
    public WatchDispatchDrawFrameLayout D;
    public FrameLayout E;
    public String F;
    public LiveMerchantBaseContext G;
    public b H;
    public boolean I;
    public static String J = "MerchantLivePurchasePanelContainerFragment";

    public void MerchantLivePurchasePanelContainerFragment(){
       super();
       this.I = false;
       this.uh(R.style.arg_RES_7f11035d);
    }
    public String C1(){
       return "AUDIENCE_ORDER_CONFIRM_PANEL";
    }
    public String D1(){
       return "∞Î∆¡∂©µ•»∑»œ“≥";
    }
    public void Lh(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantLivePurchasePanelContainerFragment.class, "6")) {
          return;
       }
       if (n.I(this.getActivity())) {
          p0.setBackgroundColor(a1.a(R.color.arg_RES_7f06008c));
       }else {
          p0.setBackgroundResource(R.drawable.arg_RES_7f080250);
       }
       return;
    }
    public void Mh(){
       if (PatchProxy.applyVoid(null, this, MerchantLivePurchasePanelContainerFragment.class, "7")) {
          return;
       }
       float f = c.a.a(this.F, a.a);
       int i = (n.I(this.getActivity()))? 0: a1.d(R.dimen.arg_RES_7f070310);
       h.d(this, f, i);
       return;
    }
    public Fragment Nh(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       MerchantLivePurchasePanelContainerFragment obj = PatchProxy.apply(null, this, MerchantLivePurchasePanelContainerFragment.class, "10");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.G;
       MerchantLivePurchasePanelContainerFragment tF = this.F;
       MerchantBottomSheetFragment tz = this.z;
       MerchantLivePurchasePanelFragment merchantLive = PatchProxy.applyFourRefs(obj, this, tF, tz, null, MerchantLivePurchasePanelFragment.class, "1");
       if (merchantLive != patchProxyRe) {
       }else {
          merchantLive = new MerchantLivePurchasePanelFragment();
          merchantLive.I = obj;
          merchantLive.K = this;
          MerchantLivePurchasePanelFragment j = merchantLive.J;
          j.x = tF;
          j.c = new MerchantLivePurchasePanelResponse();
          merchantLive.J.c.updateLogTag();
          merchantLive.G.i(tz);
          merchantLive.P = o.o();
          merchantLive.Q = o.n();
       }
       return merchantLive;
    }
    public int Pa(){
       return this.r;
    }
    public DialogFragment b(){
       return this;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantLivePurchasePanelContainerFragment.class, "5")) {
          return;
       }
       this.E = m1.f(p0, 0x7f0a0903);
       this.D = m1.f(p0, 0x7f0a08ff);
       m1.b(p0, new MerchantLivePurchasePanelContainerFragment$a(this), R.id.confirm_root);
       return;
    }
    public t getDispatchDrawObservable(){
       MerchantLivePurchasePanelContainerFragment obj = PatchProxy.apply(null, this, MerchantLivePurchasePanelContainerFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.D;
       if (obj != null) {
          return obj.getDispatchDrawObservable();
       }
       return null;
    }
    public int k9(){
       Object obj = PatchProxy.apply(null, this, MerchantLivePurchasePanelContainerFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.E.getMeasuredHeight();
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantLivePurchasePanelContainerFragment.class, "8")) {
          return;
       }
       super.onActivityCreated(p0);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, MerchantLivePurchasePanelContainerFragment.class, "9")) {
          FragmentActivity activity = this.getActivity();
          if (activity != null && !activity.isFinishing()) {
             e uoe = this.getChildFragmentManager().beginTransaction();
             Fragment uFragment = this.Nh();
             if (uFragment instanceof a) {
                this.B.add(new WeakReference(uFragment));
             }
             uoe.f(R.id.confirm_container, uFragment);
             uoe.o();
             c uoc = d.a(-1103669376).k60();
             if (uoc != null) {
                uoc.b("MerchantOrderConfirm");
             }
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, MerchantLivePurchasePanelContainerFragment.class, "11")) {
          this.H = RxBus.f.k(b.class, false).observeOn(d.a).subscribe(new d(this));
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantLivePurchasePanelContainerFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, MerchantLivePurchasePanelContainerFragment.class, "2") && this.getArguments() != null) {
          this.F = this.getArguments().getString("KEY_MERCHANT_ROUTER_URL", "");
          this.G = b.a(this.getArguments().getParcelable("MERCHANT_BASE_CONTEXT"));
          if (!PatchProxy.applyVoid(objArray, this, MerchantLivePurchasePanelContainerFragment.class, "3") && this.G == null) {
             a.g(MerchantTransactionLogBiz.LIVE_PURCHASE_PANEL, MerchantLivePurchasePanelContainerFragment.J, "mLiveMerchantBaseContext null"+this.F);
             this.G = new LiveMerchantBaseContext$Builder().setMerchantSessionId("").build();
          }
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MerchantLivePurchasePanelContainerFragment.class, "4");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.d(p0, R.layout.arg_RES_7f0d04e8, p1, false);
       this.doBindView(view);
       if (n.I(this.getActivity())) {
          this.E.setVisibility(8);
       }
       this.Lh(m1.f(view, R.id.confirm_container));
       this.Mh();
       return view;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, MerchantLivePurchasePanelContainerFragment.class, "13")) {
          return;
       }
       super.onDestroy();
       c uoc = d.a(-1103669376).k60();
       if (uoc != null) {
          uoc.f("MerchantOrderConfirm");
       }
       b9.a(this.H);
       return;
    }
}
