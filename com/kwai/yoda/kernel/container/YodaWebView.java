package com.kwai.yoda.kernel.container.YodaWebView;
import com.kuaishou.webkit.WebView;
import com.kwai.yoda.kernel.container.YodaWebView$a;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import java.util.UUID;
import crd.a;
import com.kuaishou.webkit.ValueCallback;
import crd.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ty7.j;
import android.net.Uri;
import java.lang.CharSequence;
import android.net.Uri$Builder;
import sy7.b;
import java.lang.Throwable;
import qy7.a;
import java.util.Objects;
import java.util.Map;
import ty7.a;
import com.kwai.yoda.kernel.container.YodaWebView$c;
import com.kwai.yoda.kernel.container.YodaWebView$evaluateJavascript$2;
import msd.a;
import tb7.b;
import java.util.List;
import java.lang.ref.WeakReference;
import com.kwai.yoda.kernel.dev.DevToolClientEvent$EventParam;
import com.kwai.yoda.kernel.container.YodaWebView$b;
import com.kwai.yoda.kernel.dev.TargetInfo;
import trd.t;
import com.kwai.yoda.kernel.dev.DevToolClientEvent;

public class YodaWebView extends WebView	// class@00128f
{
    public boolean isActive;
    public a mCompositeDisposable;
    public String mRealUrl;
    public final String webViewId;
    public static final YodaWebView$a Companion;

    static {
       YodaWebView.Companion = new YodaWebView$a(null);
    }
    public void YodaWebView(Context p0){
       a.q(p0, "context");
       super(p0, null);
    }
    public void YodaWebView(Context p0,AttributeSet p1){
       a.q(p0, "context");
       super(p0, p1, 0);
    }
    public void YodaWebView(Context p0,AttributeSet p1,int p2){
       a.q(p0, "context");
       super(p0, p1, p2);
       String str = UUID.randomUUID().toString();
       a.h(str, "UUID.randomUUID\(\).toString\(\)");
       this.webViewId = str;
       this.mCompositeDisposable = new a();
       this.initContainer(p0);
    }
    public static final void access$evaluateJavascript$s-1567828378(YodaWebView p0,String p1,ValueCallback p2){
       super.evaluateJavascript(p1, p2);
    }
    public final void autoDispose(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaWebView.class, "14")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (this.mCompositeDisposable.isDisposed()) {
          this.mCompositeDisposable = new a();
       }
       this.mCompositeDisposable.c(p0);
       return;
    }
    public final String buildRealUrl(String p0){
       String str = "webviewId";
       Uri obj = PatchProxy.applyOneRefs(p0, this, YodaWebView.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (j.c.c()) {
          try{
             obj = Uri.parse(p0);
             String queryParamet = obj.getQueryParameter(str);
             YodaWebView yodaWebView = (queryParamet == null || !queryParamet.length())? 1: null;
             if (yodaWebView) {
                Uri$Builder uBuilder = obj.buildUpon();
                uBuilder.appendQueryParameter(str, this.webViewId);
                p0 = uBuilder.build().toString();
             }
          }catch(java.lang.Exception e0){
             b.b.f(e0);
          }
       }
    }
    public void compositeWith(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaWebView.class, "9")) {
          return;
       }
       a.q(p0, "disposable");
       this.autoDispose(p0);
       return;
    }
    public void destroy(){
       if (PatchProxy.applyVoid(null, this, YodaWebView.class, "8")) {
          return;
       }
       this.isActive = false;
       a b = a.b;
       YodaWebView twebViewId = this.webViewId;
       Objects.requireNonNull(b);
       if (!PatchProxy.applyVoidOneRefs(twebViewId, b, a.class, "2")) {
          a.q(twebViewId, "webViewId");
          a.a.remove(twebViewId);
       }
       j c = j.c;
       twebViewId = this.webViewId;
       Objects.requireNonNull(c);
       if (!PatchProxy.applyVoidOneRefs(twebViewId, c, j.class, "11")) {
          a.q(twebViewId, "webViewId");
          b = j.a;
          if (b != null) {
             b.t(twebViewId);
          }
       }
       super.destroy();
       this.sendWebViewDestroyEvent();
       return;
    }
    public final void dispose(){
       if (PatchProxy.applyVoid(null, this, YodaWebView.class, "13")) {
          return;
       }
       if (!this.mCompositeDisposable.isDisposed()) {
          this.mCompositeDisposable.dispose();
       }
       return;
    }
    public void evaluateJavascript(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaWebView.class, "6")) {
          return;
       }
       this.evaluateJavascript(p0, YodaWebView$c.a);
       return;
    }
    public void evaluateJavascript(String p0,ValueCallback p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, YodaWebView.class, "7")) {
          return;
       }
       b.j(new YodaWebView$evaluateJavascript$2(this, p0, p1));
       return;
    }
    public long getFmp(){
       return -1;
    }
    public List getHitOfflineInfo(){
       return null;
    }
    public String getLaunchParams(){
       return "";
    }
    public List getMatchedOfflineInfo(){
       return null;
    }
    public List getRequestOfflineInfo(){
       return null;
    }
    public final String getWebViewId(){
       return this.webViewId;
    }
    public final void initContainer(Context p0){
       Map a;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaWebView.class, str)) {
          return;
       }
       this.isActive = true;
       a b = a.b;
       YodaWebView twebViewId = this.webViewId;
       Objects.requireNonNull(b);
       if (!PatchProxy.applyVoidTwoRefs(twebViewId, this, b, a.class, str)) {
          a.q(twebViewId, "webViewId");
          a.q(this, "webView");
          a = a.a;
          if (!a.containsKey(twebViewId)) {
             a.put(twebViewId, new WeakReference(this));
          }
       }
       this.sendWebViewCreatedEvent();
       return;
    }
    public final boolean isActive(){
       return this.isActive;
    }
    public void loadDataWithBaseURL(String p0,String p1,String p2,String p3,String p4){
       if (PatchProxy.isSupport(YodaWebView.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, YodaWebView.class, "4")) {
             return;
          }
       }
       String str = this.buildRealUrl(p0);
       this.mRealUrl = str;
       super.loadDataWithBaseURL(str, p1, p2, p3, str);
       return;
    }
    public void loadUrl(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaWebView.class, "2")) {
          return;
       }
       p0 = this.buildRealUrl(p0);
       this.mRealUrl = p0;
       super.loadUrl(p0);
       return;
    }
    public void loadUrl(String p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, YodaWebView.class, "3")) {
          return;
       }
       p0 = this.buildRealUrl(p0);
       this.mRealUrl = p0;
       super.loadUrl(p0, p1);
       return;
    }
    public final void sendUrlChangeEvent(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaWebView.class, "12")) {
          return;
       }
       j c = j.c;
       if (!c.c()) {
          return;
       }
       DevToolClientEvent$EventParam uEventParam = new DevToolClientEvent$EventParam();
       uEventParam.eventName = "urlChange";
       uEventParam.eventInfo = new YodaWebView$b(p0);
       TargetInfo targetInfo = new TargetInfo();
       targetInfo.webviewId = this.webViewId;
       targetInfo.group = t.k("yodaDevtool");
       DevToolClientEvent uDevToolClie = new DevToolClientEvent();
       uDevToolClie.target = targetInfo;
       uDevToolClie.param = uEventParam;
       c.d(uDevToolClie);
       return;
    }
    public final void sendWebViewCreatedEvent(){
       if (PatchProxy.applyVoid(null, this, YodaWebView.class, "10")) {
          return;
       }
       j c = j.c;
       if (!c.c()) {
          return;
       }
       DevToolClientEvent$EventParam uEventParam = new DevToolClientEvent$EventParam();
       uEventParam.eventName = "openWebview";
       TargetInfo targetInfo = new TargetInfo();
       targetInfo.webviewId = this.webViewId;
       targetInfo.group = t.k("yodaDevtool");
       DevToolClientEvent uDevToolClie = new DevToolClientEvent();
       uDevToolClie.target = targetInfo;
       uDevToolClie.param = uEventParam;
       c.d(uDevToolClie);
       return;
    }
    public final void sendWebViewDestroyEvent(){
       if (PatchProxy.applyVoid(null, this, YodaWebView.class, "11")) {
          return;
       }
       j c = j.c;
       if (!c.c()) {
          return;
       }
       DevToolClientEvent$EventParam uEventParam = new DevToolClientEvent$EventParam();
       uEventParam.eventName = "closeWebview";
       TargetInfo targetInfo = new TargetInfo();
       targetInfo.webviewId = this.webViewId;
       targetInfo.group = t.k("yodaDevtool");
       DevToolClientEvent uDevToolClie = new DevToolClientEvent();
       uDevToolClie.target = targetInfo;
       uDevToolClie.param = uEventParam;
       c.d(uDevToolClie);
       return;
    }
    public final void setActive(boolean p0){
       this.isActive = p0;
    }
}
