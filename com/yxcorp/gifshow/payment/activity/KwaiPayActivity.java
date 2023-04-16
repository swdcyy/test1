package com.yxcorp.gifshow.payment.activity.KwaiPayActivity;
import ml8.d;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import android.widget.TextView;
import ewb.a;
import android.view.View$OnClickListener;
import ewb.b;
import ewb.c;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import android.view.Window;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import wkd.b;
import fwb.b;
import com.yxcorp.gifshow.model.response.KwaiTradeResponse;
import brd.t;
import cjd.e;
import erd.o;
import ewb.e;
import erd.a;
import ewb.f;
import com.yxcorp.gifshow.payment.activity.c;
import erd.g;
import crd.b;
import java.lang.Integer;
import com.kwai.framework.model.user.QCurrentUser;
import tkd.b;
import tkd.d;
import ou5.b;
import android.content.Context;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;
import android.content.Intent;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.response.KwaiPayResponse;
import java.lang.Exception;
import ad5.a;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import brd.w;
import com.yxcorp.gifshow.payment.activity.b;
import erd.r;
import com.yxcorp.gifshow.payment.activity.a;
import ewb.d;
import ewb.g;
import com.yxcorp.gifshow.payment.activity.KwaiPayActivity$a;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;

public class KwaiPayActivity extends GifshowActivity implements d	// class@000e3b
{
    public TextView A;
    public boolean B;
    public boolean C;
    public KwaiTradeResponse D;
    public View y;
    public TextView z;
    public static final int E;

    public void KwaiPayActivity(){
       super();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiPayActivity.class, "1")) {
          return;
       }
       this.y = m1.f(p0, 0x7f0a16a0);
       this.z = m1.f(p0, 0x7f0a1693);
       this.A = m1.f(p0, 0x7f0a2f1a);
       m1.a(p0, new a(this), R.id.pay_btn);
       m1.a(p0, new b(this), R.id.close_btn);
       m1.a(p0, new c(this), R.id.root_view);
       return;
    }
    public void f3(){
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, KwaiPayActivity.class, "4")) {
          return;
       }
       this.i = 0x7f01004c;
       super.finish();
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, KwaiPayActivity.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "ks://kwaiPay";
    }
    public void onCloseBtnClicked(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiPayActivity.class, "5")) {
          return;
       }
       this.onPayFinish(3);
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiPayActivity.class, "2")) {
          return;
       }
       super.onCreate(p0);
       this.setContentView(R.layout.arg_RES_7f0d0030);
       this.doBindView(this.getWindow().getDecorView());
       this.setResult(3);
       return;
    }
    public void onPayBtnClicked(View p0){
       KwaiPayActivity kwaiPayActiv = KwaiPayActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, kwaiPayActiv, "6")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, kwaiPayActiv, "8")) {
          KwaiPayActivity tD = this.D;
          b.a(-840798238).h(tD.mBizType, tD.mKsTradeId).map(new e()).doFinally(new e(this.v3())).subscribe(new f(this), new c(this));
       }
       return;
    }
    public void onPayFinish(int p0){
       KwaiPayActivity kwaiPayActiv = KwaiPayActivity.class;
       if (PatchProxy.isSupport(kwaiPayActiv) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, kwaiPayActiv, "10")) {
          return;
       }
       this.setResult(p0);
       this.finish();
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, KwaiPayActivity.class, "3")) {
          return;
       }
       super.onResume();
       if (this.B != null) {
          this.B = false;
          if (!QCurrentUser.ME.isLogined()) {
             this.onPayFinish(3);
          }else {
             this.u3();
          }
       }else if(this.C == null){
          if (!QCurrentUser.ME.isLogined()) {
             this.B = true;
             d.a(-1712118428).ne(this, "ks://kwaiPay", "ks://kwaiPay", 50, "", null, null, null, null).h();
          }else {
             this.u3();
          }
       }
       return;
    }
    public final void u3(){
       KwaiPayResponse kwaiPayRespo;
       if (PatchProxy.applyVoid(null, this, KwaiPayActivity.class, "7")) {
          return;
       }
       this.C = true;
       String stringExtra = this.getIntent().getStringExtra("kwai_trade");
       try{
          kwaiPayRespo = new Gson().h(stringExtra, KwaiPayResponse.class);
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       if (kwaiPayRespo == null) {
          this.onPayFinish(2);
          return;
       }else {
          t.merge(b.a(0x4c90014d).A(RequestTiming.DEFAULT), b.a(-840798238).d(kwaiPayRespo.mBizType, kwaiPayRespo.mTimestamp, kwaiPayRespo.mBizContent, kwaiPayRespo.mSign).map(new e())).filter(b.b).map(a.b).doFinally(new d(this.v3())).subscribe(new g(this), new KwaiPayActivity$a(this));
          return;
       }
    }
    public final ProgressFragment v3(){
       ProgressFragment obj = PatchProxy.apply(null, this, KwaiPayActivity.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ProgressFragment();
       obj.Ih(R.string.arg_RES_7f103667);
       obj.show(this.getSupportFragmentManager(), null);
       return obj;
    }
}
