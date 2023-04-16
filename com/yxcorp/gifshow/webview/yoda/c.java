package com.yxcorp.gifshow.webview.yoda.c;
import my7.o;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import android.view.View;
import dz7.q;
import qyc.d;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import com.kwai.yoda.bridge.YodaBaseWebView;
import myc.c;
import android.view.View$OnClickListener;
import ekd.m1;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.webview.yoda.a;
import com.yxcorp.gifshow.webview.yoda.b;
import erd.g;
import crd.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Integer;
import ez7.a;
import com.kuaishou.webkit.ValueCallback;
import android.app.Activity;
import rx7.s;
import ca7.u;
import u07.t$a;
import java.lang.CharSequence;
import myc.d;
import com.kwai.library.widget.popup.common.PopupInterface$d;
import com.kwai.library.widget.popup.common.c$b;
import android.graphics.drawable.Drawable;
import myc.e;
import u07.u;
import myc.f;
import u07.f;
import myc.g;
import w07.l;
import com.yxcorp.gifshow.webview.yoda.c$a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import ez7.b;
import com.kwai.yoda.model.ToastParams;
import e17.i;
import ez7.d;
import com.kwai.yoda.model.LaunchModel;
import android.widget.LinearLayout;
import com.kwai.yoda.kernel.loading.YodaLoadingView;
import android.text.TextUtils;

public class c implements o	// class@0017aa
{
    public final KwaiLoadingView a;
    public KwaiYodaWebViewFragment b;
    public q c;
    public d d;
    public YodaBaseWebView e;
    public View f;
    public b g;

    public void c(KwaiYodaWebViewFragment p0,View p1,q p2,d p3){
       super();
       this.b = p0;
       this.f = p0.getView();
       this.c = p2;
       this.d = p3;
       this.e = this.b.Ch();
       m1.a(p1, new c(this), R.id.right_btn);
       this.m();
       this.a = p1.findViewById(0x7f0a45fc);
       this.g = t.timer(10, TimeUnit.SECONDS).subscribeOn(d.c).observeOn(d.a).subscribe(a.b, b.b);
    }
    public int a(){
       Object obj = PatchProxy.apply(null, this, c.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.c.a();
    }
    public void b(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "8")) {
          return;
       }
       this.d.c(p0);
       this.l();
       return;
    }
    public int c(){
       Object obj = PatchProxy.apply(null, this, c.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.c.c();
    }
    public void d(a p0,ValueCallback p1){
       int i;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "15")) {
          return;
       }
       Activity uActivity = s.b(this.e);
       if (uActivity == null || uActivity.isFinishing()) {
          p1.onReceiveValue(this.j("cancel"));
          return;
       }else {
          String str = u.a(p0.mAlign);
          if (!str.equals("left")) {
             i = (!str.equals("right"))? 1: 5;
          }else {
             i = 3;
          }
          t$a uoa = new t$a(uActivity);
          uoa.X0(p0.mTitle);
          uoa.z0(p0.mContent);
          uoa.x0(i);
          uoa.J(new d(this, p1));
          uoa.A(p0.mDimCancelable);
          uoa.v(true);
          uoa.z(p0.mBackCancelable);
          if (p0.mHaveDim == null) {
             uoa.w(null);
          }
          if (p0.mShowPositiveButton != null) {
             uoa.T0(p0.mPositiveText);
             uoa.u0(new e(this, p1));
          }
          if (p0.mShowNegativeButton != null) {
             uoa.R0(p0.mNegativeText);
             uoa.t0(new f(this, p1));
          }
          t$a uoa1 = f.e(uoa);
          uoa1.a0(new g(p0));
          uoa1.Y(new c$a(this, p1));
          return;
       }
    }
    public void e(ToastParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "14")) {
          return;
       }
       if (("success").equals(p0.mType)) {
          i.d(R.style.arg_RES_7f110669, p0.mText);
       }else if(("error").equals(p0.mType)){
          i.d(R.style.arg_RES_7f110668, p0.mText);
       }else {
          i.d(R.style.arg_RES_7f11066a, p0.mText);
       }
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, c.class, "5")) {
          return;
       }
       this.d.d();
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, c.class, "6")) {
          return;
       }
       this.l();
       return;
    }
    public void h(d p0){
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "17")) {
          return;
       }
       c ta = this.a;
       if (ta != null) {
          p0 = (p0 != null)? p0.mText: "";
          ta.setLoadingText(p0);
          this.a.setVisibility(0);
          this.a.h();
       }
       return;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, c.class, "7")) {
          return;
       }
       this.l();
       return;
    }
    public b j(String p0){
       b obj = PatchProxy.applyOneRefs(p0, this, c.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new b();
       obj.mTarget = p0;
       return obj;
    }
    public void k(String p0,LaunchModel p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "10")) {
          return;
       }
       View view = this.b.getView();
       view = (view != null)? view.findViewById(R.id.loading_view): null;
       if (view != null && (view instanceof LinearLayout || view instanceof YodaLoadingView)) {
          this.c.b(p0, p1);
       }
       return;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, c.class, "13")) {
          return;
       }
       this.a();
       this.d.b();
       c tb = this.b;
       if (tb != null) {
          tb.Nh(true);
          this.b.Mh(false);
       }
       return;
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, c.class, "9")) {
          return;
       }
       c te = this.e;
       if (te != null && te.getLaunchModel() != null) {
          LaunchModel launchModel = this.e.getLaunchModel();
          String loadingType = launchModel.getLoadingType();
          if (TextUtils.isEmpty(loadingType)) {
             if (launchModel.isEnableLoading()) {
                this.k("none", launchModel);
             }
          }else {
             this.k(loadingType, launchModel);
          }
       }
       return;
    }
    public void x(){
       if (PatchProxy.applyVoid(null, this, c.class, "18")) {
          return;
       }
       c ta = this.a;
       if (ta != null) {
          ta.i();
          this.a.setVisibility(8);
       }
       return;
    }
}
