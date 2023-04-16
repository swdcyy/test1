package ao.b;
import rn.a;
import qn.j;
import ao.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.System;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qn.h;
import qn.j$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Integer;
import android.os.SystemClock;
import com.kuaishou.activity.kwaibubble.log.KwaiPopLog;
import xn.a$a;
import qn.m;
import rn.b;
import xn.a;
import java.lang.Boolean;
import java.lang.Long;
import android.app.Activity;
import o56.f;
import com.kwai.framework.activitycontext.ActivityContext;
import com.yxcorp.gifshow.activity.GifshowActivity;
import xn.a$b;
import java.lang.StringBuilder;
import java.util.Objects;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import com.trello.rxlifecycle3.android.ActivityEvent;
import gr8.b;
import brd.x;
import ao.b$a;
import erd.r;
import ao.b$b;
import ao.b$c;
import erd.g;
import crd.b;
import ao.d;
import io.reactivex.g;
import ao.c;
import ao.b$d;
import brd.w;
import erd.c;
import t45.d;
import brd.z;
import ao.b$e;
import ao.b$f;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import ao.a;
import ag6.a;
import java.lang.ref.WeakReference;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView;
import android.widget.FrameLayout;
import android.widget.AbsoluteLayout;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.graphics.Color;
import com.kuaishou.webkit.WebView;
import com.yxcorp.gifshow.webview.yoda.g;
import com.kwai.yoda.bridge.YodaBaseWebView;
import myc.k;
import vxc.e;
import com.yxcorp.gifshow.webview.helper.event.JsNativeEventCommunication;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import com.yxcorp.gifshow.webview.view.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.yoda.model.LaunchModel$a;
import com.kwai.yoda.model.LaunchModel;
import rx7.s;
import rn.c;
import ao.b$g;
import qn.l;

public final class b implements a, j	// class@000205
{
    public WeakReference a;
    public long b;
    public h c;
    public b d;
    public b e;
    public PresenterV2 f;
    public Activity g;
    public final e h;

    public void b(e p0){
       a.p(p0, "builder");
       super();
       this.h = p0;
       this.b = System.currentTimeMillis();
    }
    public View I(){
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj != null) {
          objArray = obj.c();
       }
       return objArray;
    }
    public void a(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "8")) {
          return;
       }
       a.p(p0, "bubble");
       j$a.a(this, p0);
       b tf = this.f;
       if (tf != null) {
          tf.destroy();
       }
       return;
    }
    public void b(Integer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "4")) {
          return;
       }
       b tc = this.c;
       if (tc == null) {
          this.release();
       }else if(tc != null){
          tc.b(p0);
       }
       return;
    }
    public a build(){
       Activity uActivity;
       Activity activity;
       String simpleName;
       long l = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       Object[] objArray = null;
       KwaiPopLog obj = PatchProxy.apply(objArray, l, uob, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       l.b = SystemClock.uptimeMillis();
       obj = KwaiPopLog.e;
       KwaiPopLog.G(obj, this.e().l(), a$a.b, null, null, null, null, null, null, this.e().b(), null, 764, null);
       if (this.e().q != null) {
          uActivity = f.a();
       }else {
          ActivityContext uActivityCon = ActivityContext.g();
          a.o(uActivityCon, "ActivityContext.getInstance\(\)");
          uActivity = uActivityCon.e();
       }
       l.g = uActivity;
       uActivity = this.getActivity();
       if (uActivity == null || (uActivity.isFinishing() == true || !this.getActivity() instanceof GifshowActivity)) {
          if (this.getActivity() != null) {
             activity = this.getActivity();
             a.m(activity);
             simpleName = activity.getClass().getSimpleName();
          }else {
             simpleName = "null";
          }
          KwaiPopLog.G(obj, this.e().l(), a$b.b, null, null, Long.valueOf(l.b), null, null, null, this.e().b(), simpleName+" || finishing", 236, null);
          return l;
       }else {
          Activity activity1 = this.getActivity();
          Objects.requireNonNull(activity1, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
          Activity activity2 = this.getActivity();
          Objects.requireNonNull(activity2, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
          activity1.m().compose(activity2.E2(ActivityEvent.DESTROY)).filter(new b$a(l)).subscribe(new b$b(l), b$c.b);
          t ot = PatchProxy.apply(objArray, l, uob, "11");
          if (ot != patchProxyRe) {
          }else {
             ot = t.create(d.b);
          }
          t ot1 = PatchProxy.apply(objArray, l, uob, "12");
          if (ot1 != patchProxyRe) {
          }else {
             ot1 = t.create(c.b);
          }
          l.e = t.zip(ot, ot1, b$d.a).subscribeOn(d.c).observeOn(d.a).subscribe(new b$e(l), new b$f(l));
          return l;
       }
    }
    public View c(h p0,LayoutInflater p1,ViewGroup p2,Bundle p3){
       p3 = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, b.class, "7");
       if (p3 != PatchProxyResult.class) {
          return p3;
       }
       a.p(p0, "bubble");
       a.p(p1, "inflater");
       a.p(p2, "container");
       PresenterV2 presenterV2 = new PresenterV2();
       this.f = presenterV2;
       presenterV2.U7(new a());
       View view = a.c(p1, R.layout.arg_RES_7f0d0742, p2, false);
       a.o(view, "inflater.inflate\(R.layou¡­dialog, container, false\)");
       b ta = this.a;
       if (ta != null) {
          KwaiYodaWebView kwaiYodaWebV = ta.get();
          if (kwaiYodaWebV != null) {
             kwaiYodaWebV.setTag(R.id.ug_kwai_bubble_popup_tag, p0);
             view.findViewById(R.id.kem_kwai_bubble_web_view_container).addView(kwaiYodaWebV, new LinearLayout$LayoutParams(-1, -1));
             b tf = this.f;
             if (tf != null) {
                tf.f(view);
             }
             tf = this.f;
             if (tf != null) {
                Object[] objArray = new Object[false];
                tf.i(objArray);
             }
          }
       }
       return view;
    }
    public final void d(KwaiYodaWebView p0,long p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, uob, "5")) {
          return;
       }
       p0.setTag(R.id.ug_kwai_bubble_web_create_time, Long.valueOf(p1));
       p0.setTag(R.id.ug_kwai_bubble_id, this.e().r);
       p0.setTag(R.id.ug_kwai_bubble_url, this.e().l());
       Activity activity = this.getActivity();
       Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       String str = this.e().l();
       if (!PatchProxy.applyVoidThreeRefs(p0, activity, str, this, b.class, "10")) {
          p0.setId(R.id.kem_kwai_bubble_web_view);
          p0.setBackgroundColor(Color.parseColor("#B3000000"));
          p0.setYodaWebViewClient(new g(p0));
          p0.setYodaChromeClient(new k(p0));
          e jsInjectKwai = p0.getJsInjectKwai();
          JsNativeEventCommunication jsNativeEven = new JsNativeEventCommunication(activity, activity.getLifecycle(), p0, false);
          if (jsInjectKwai != null) {
             jsInjectKwai.d(activity, p0, null, jsNativeEven);
             p0.addJavascriptInterface(jsInjectKwai, "Kwai");
          }
          if (!TextUtils.x(str)) {
             s.c(p0, new LaunchModel$a(str).e(true).f(false).g(false).a());
          }
       }
       p0.setTag(R.id.ug_kwai_bubble_popup_builder, p0);
       return;
    }
    public e e(){
       return this.h;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, b.class, "6")) {
          return;
       }
       if (!c.c.b()) {
          Object[] objArray = new Object[0];
          KwaiPopLog.e.D("web kswitch is close", objArray);
          this.release();
          return;
       }else {
          b tc = this.c;
          if (tc != null) {
             tc.d(new b$g(this));
          }
          return;
       }
    }
    public Activity getActivity(){
       return this.g;
    }
    public b getBuilder(){
       return this.e();
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       if (this.c == null) {
          l ol = this.e().d();
          if (ol != null) {
             ol.d(this);
          }
       }
       b te = this.e;
       if (te != null) {
          te.dispose();
       }
       te = this.d;
       if (te != null) {
          te.dispose();
       }
       this.d = null;
       this.e = null;
       te = this.a;
       if (te != null) {
          KwaiYodaWebView kwaiYodaWebV = te.get();
          if (kwaiYodaWebV != null) {
             kwaiYodaWebV.destroy();
          }
       }
       te = this.a;
       if (te != null) {
          te.clear();
       }
       return;
    }
    public boolean show(){
       Object obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!c.c.b()) {
          Object[] objArray = new Object[0];
          KwaiPopLog.e.D("web kswitch is close", objArray);
          this.release();
          return 0;
       }else if(this.e == null){
          this.build();
       }
       return true;
    }
}
