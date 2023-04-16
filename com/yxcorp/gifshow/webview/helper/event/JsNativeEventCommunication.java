package com.yxcorp.gifshow.webview.helper.event.JsNativeEventCommunication;
import androidx.lifecycle.LifecycleObserver;
import uxc.e$a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.Lifecycle;
import com.kuaishou.webkit.WebView;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.ArrayList;
import java.util.HashMap;
import androidx.activity.ComponentActivity;
import org.greenrobot.eventbus.a;
import crd.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.yxcorp.gifshow.model.ShakeEvent;
import java.lang.Class;
import brd.t;
import t45.d;
import brd.z;
import byc.b;
import com.yxcorp.gifshow.webview.helper.event.a;
import erd.g;
import crd.b;
import byc.d;
import byc.a;
import com.yxcorp.gifshow.webview.helper.event.b;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import uv8.g1;
import java.lang.StringBuilder;
import q87.c;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.webview.helper.event.JsEventParameter;
import com.yxcorp.gifshow.webview.helper.e;
import java.lang.Throwable;
import com.yxcorp.gifshow.webview.jsmodel.JsEmitParameter;
import yz7.r;
import byc.c;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.webview.helper.event.JsNativeEventCommunication$a;
import com.yxcorp.gifshow.webview.helper.event.JsNativeEventCommunication$b;
import java.util.Map;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import lkd.b;
import java.util.Collection;
import com.kwai.framework.network.monitor.NetworkTypeMonitor$a;
import com.kwai.framework.network.monitor.NetworkTypeMonitor$c;
import com.kwai.framework.network.monitor.NetworkTypeMonitor$d;
import byc.e;
import io.reactivex.subjects.PublishSubject;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kwai.yoda.event.d;

public class JsNativeEventCommunication implements LifecycleObserver, e$a	// class@001360
{
    public final List b;
    public final List c;
    public final GifshowActivity d;
    public final WebView e;
    public boolean f;
    public Map g;
    public h h;
    public a i;
    public b j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;

    public void JsNativeEventCommunication(GifshowActivity p0,Lifecycle p1,WebView p2,boolean p3){
       z a;
       super();
       this.b = new CopyOnWriteArrayList();
       this.c = new ArrayList();
       boolean b = true;
       this.f = b;
       this.g = new HashMap();
       this.n = b;
       this.e = p2;
       this.d = p0;
       if (p1 != null) {
          p1.addObserver(this);
       }else {
          p0.getLifecycle().addObserver(this);
       }
       this.m = p3;
       a.d().p(this);
       a uoa = new a();
       this.i = uoa;
       RxBus f = RxBus.f;
       a = d.a;
       uoa.c(f.f(ShakeEvent.class).observeOn(a).subscribe(new b(this), a.b));
       t ot = f.f(d.class).observeOn(a);
       this.i.c(ot.subscribe(new a(this), b.b));
       return;
    }
    public void JsNativeEventCommunication(GifshowActivity p0,WebView p1){
       super(p0, p0.getLifecycle(), p1, false);
    }
    public void a(int p0){
       JsNativeEventCommunication jsNativeEven = JsNativeEventCommunication.class;
       if (PatchProxy.isSupport(jsNativeEven) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, jsNativeEven, "38")) {
          return;
       }
       this.b("native_web_view_display_mode_changed", String.valueOf(p0));
       return;
    }
    public void b(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, JsNativeEventCommunication.class, "30")) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       Object[] objArray = new Object[0];
       g1.C().w("JsNativeEventCommunication", "callJs with :"+p0, objArray);
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          JsEventParameter jsEventParam = iterator.next();
          if (p0.equals(jsEventParam.mType)) {
             try{
                e.a(this.e, jsEventParam.mHandler, p1);
             }catch(java.lang.Exception e1){
                Object[] objArray1 = new Object[0];
                g1.C().u("JsNativeEventCommunication", e1, objArray1);
                goto label_0035 ;
             }
          }
       }
       return;
    }
    public void c(JsEmitParameter p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, JsNativeEventCommunication.class, "5")) {
          return;
       }
       this.b(p0.mType, p0.mData);
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, JsNativeEventCommunication.class, "15")) {
          return;
       }
       r.h("JsNativeEventCommunication", "--- clearJsEventListener");
       this.b.clear();
       return;
    }
    public c e(){
       Object obj = PatchProxy.apply(null, this, JsNativeEventCommunication.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new JsNativeEventCommunication$a(this);
    }
    public JsNativeEventCommunication$b f(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, JsNativeEventCommunication.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.g.get(p0);
    }
    public WebView g(){
       return this.e;
    }
    public boolean h(){
       boolean b = (this.m == null || this.k != null)? true: false;
       return b;
    }
    public boolean i(){
       return this.m;
    }
    public boolean j(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       JsNativeEventCommunication jsNativeEven = JsNativeEventCommunication.class;
       Object obj = PatchProxy.apply(null, this, jsNativeEven, "28");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.j == null) {
          return b;
       }
       Object obj1 = PatchProxy.apply(null, this, jsNativeEven, "29");
       boolean b1 = (obj1 != patchProxyRe)? obj1.booleanValue(): a.t().d("yoda_reentry_check_really_select", b);
       if (!b1) {
          return b;
       }else {
          Boolean uBoolean = this.j.get();
          if (uBoolean != null) {
             b = uBoolean.booleanValue();
          }
          return b;
       }
    }
    public boolean k(){
       return this.m;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, JsNativeEventCommunication.class, "9")) {
          return;
       }
       this.r(false);
       this.b("native_leave", null);
       return;
    }
    public void m(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, JsNativeEventCommunication.class, "13")) {
          return;
       }
       this.b("native_networkChanged", p0);
       return;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, JsNativeEventCommunication.class, "25")) {
          return;
       }
       this.l = false;
       if (this.h() && this.j()) {
          r.h("JsNativeEventCommunication", "onPageResume, current select");
          this.e.onPause();
       }else {
          r.h("JsNativeEventCommunication", "onPageResume, current not-select");
       }
       return;
    }
    public void o(){
       if (PatchProxy.applyVoid(null, this, JsNativeEventCommunication.class, "24")) {
          return;
       }
       this.l = true;
       if (this.h() && this.j()) {
          r.h("JsNativeEventCommunication", "onPageResume, current select");
          this.e.onResume();
       }else {
          r.h("JsNativeEventCommunication", "onPageResume, current not-select");
       }
       return;
    }
    public void onDestroy(){
       JsNativeEventCommunication jsNativeEven = JsNativeEventCommunication.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, jsNativeEven, "3")) {
          return;
       }
       if (this.m != null) {
          this.l();
       }
       this.d();
       if (!PatchProxy.applyVoid(objArray, this, jsNativeEven, "19")) {
          this.c.clear();
       }
       a.d().t(this);
       jsNativeEven = this.i;
       if (jsNativeEven != null) {
          jsNativeEven.dispose();
          this.i = objArray;
       }
       Iterator iterator = this.g.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().onDestroy();
       }
       return;
    }
    public void onEventMainThread(NetworkTypeMonitor$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, JsNativeEventCommunication.class, "33")) {
          return;
       }
       this.m("1");
       return;
    }
    public void onEventMainThread(NetworkTypeMonitor$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, JsNativeEventCommunication.class, "35")) {
          return;
       }
       this.m("0");
       return;
    }
    public void onEventMainThread(NetworkTypeMonitor$d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, JsNativeEventCommunication.class, "34")) {
          return;
       }
       this.m("2");
       return;
    }
    public void onEventMainThread(JsEmitParameter p0){
       JsNativeEventCommunication jsNativeEven = JsNativeEventCommunication.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, jsNativeEven, "4")) {
          return;
       }
       this.b(p0.mType, p0.mData);
       JsEmitParameter mType = p0.mType;
       p0 = p0.mData;
       if (!PatchProxy.applyVoidTwoRefs(mType, p0, this, jsNativeEven, "31") && !TextUtils.x(mType)) {
          Iterator iterator = this.c.iterator();
          while (iterator.hasNext()) {
             e uoe = iterator.next();
             if (mType.equals(uoe.a)) {
                uoe.b.onNext(p0);
             }
          }
       }
       return;
    }
    public void onNativeCallJsEvent(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, JsNativeEventCommunication.class, "37")) {
          return;
       }
       WebView webView = this.g();
       d uod = (!(v1 = webView instanceof YodaBaseWebView) || webView.isShowing())? 1: null;
       if (!uod && ("user_capture_screen").equals(p0.a)) {
          return;
       }else {
          this.b(p0.a, p0.b);
          if (v1) {
             d.f().c(webView, p0.a, String.valueOf(p0.b));
          }
          return;
       }
    }
    public void onShareDialogEvent(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, JsNativeEventCommunication.class, "39")) {
          return;
       }
       this.b("native_share_dialog_event", p0);
       return;
    }
    public void p(){
       if (PatchProxy.applyVoid(null, this, JsNativeEventCommunication.class, "22")) {
          return;
       }
       r.h("JsNativeEventCommunication", "onPageSelected, current pageResumed: "+this.l);
       this.k = true;
       if (this.l != null) {
          this.e.onResume();
       }
       Iterator iterator = this.g.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().A();
       }
       return;
    }
    public void q(){
       if (PatchProxy.applyVoid(null, this, JsNativeEventCommunication.class, "23")) {
          return;
       }
       r.h("JsNativeEventCommunication", "onPageUnselected, current pageResumed: "+this.l);
       this.k = false;
       Iterator iterator = this.g.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().C();
       }
       if (this.l != null) {
          this.e.onPause();
       }
       return;
    }
    public void r(boolean p0){
       JsNativeEventCommunication jsNativeEven = JsNativeEventCommunication.class;
       if (PatchProxy.isSupport(jsNativeEven) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, jsNativeEven, "11")) {
          return;
       }
       if (this.o == p0) {
          return;
       }
       this.o = p0;
       Object[] objArray = new Object[0];
       g1.C().w("JsNativeEventCommunication", "onVisibleChange with :"+p0, objArray);
       this.b("native_visible", "{\"visible\":"+p0+"}");
       return;
    }
    public void s(boolean p0){
       this.n = p0;
    }
}
