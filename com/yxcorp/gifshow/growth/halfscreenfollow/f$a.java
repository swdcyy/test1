package com.yxcorp.gifshow.growth.halfscreenfollow.f$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.growth.halfscreenfollow.GrowthFollowDialogConfig;
import tna.a;
import com.yxcorp.gifshow.webview.yoda.g;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView;
import myc.k;
import vxc.e;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.webview.helper.event.JsNativeEventCommunication;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import com.kuaishou.webkit.WebView;
import com.yxcorp.gifshow.webview.view.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.yoda.model.LaunchModel$a;
import com.kwai.yoda.model.LaunchModel;
import rx7.s;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import tna.e;
import erd.g;
import crd.b;
import byc.c;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.growth.halfscreenfollow.widget.NestedScrollWebView;
import com.yxcorp.gifshow.widget.NestedParentConstraintLayout;
import tna.c;
import android.view.View$OnClickListener;
import tna.d;
import com.yxcorp.gifshow.widget.NestedParentConstraintLayout$b;
import com.kwai.library.widget.popup.common.c;

public class f$a extends PresenterV2	// class@00138a
{
    public c p;
    public NestedScrollWebView q;
    public String r;
    public b s;

    public void f$a(){
       super();
    }
    public void E8(){
       f$a uoa = f$a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "4")) {
          return;
       }
       if (this.q == null) {
          return;
       }
       if (!this.getActivity() instanceof GifshowActivity) {
          return;
       }
       GrowthFollowDialogConfig growthFollow = a.b();
       f$a tq = this.q;
       tq.setYodaWebViewClient(new g(tq));
       tq = this.q;
       tq.setYodaChromeClient(new k(tq));
       e jsInjectKwai = this.q.getJsInjectKwai();
       GifshowActivity activity = this.getActivity();
       JsNativeEventCommunication jsNativeEven = PatchProxy.applyOneRefs(activity, this, uoa, "5");
       if (jsNativeEven != PatchProxyResult.class) {
       }else {
          jsNativeEven = new JsNativeEventCommunication(activity, activity.getLifecycle(), this.q, false);
       }
       if (jsInjectKwai != null) {
          jsInjectKwai.d(this.getActivity(), this.q, objArray, jsNativeEven);
          this.q.addJavascriptInterface(jsInjectKwai, "Kwai");
       }
       if (!TextUtils.x(growthFollow.pageUrl)) {
          s.c(this.q, new LaunchModel$a(TextUtils.d(growthFollow.pageUrl, this.r)).e(true).f(true).g(true).a());
          this.s = this.getActivity().m().subscribe(new e(this));
          this.q.setLifeEventCallback(jsNativeEven.e());
       }
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, f$a.class, "6")) {
          return;
       }
       f$a ts = this.s;
       if (ts != null && !ts.isDisposed()) {
          this.s.dispose();
       }
       try{
          ts = this.q;
          if (ts != null) {
             ts.destroy();
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a122f);
       m1.a(p0, new c(this), R.id.half_screen_follow_close_btn);
       m1.f(p0, R.id.half_screen_follow_dialog_container).setOnDragListener(new d(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f$a.class, "1")) {
          return;
       }
       this.p = this.r8("HALF_SCREEN_FOLLOW_DIALOG");
       this.r = this.r8("PAGE_PARAMS");
       return;
    }
}
