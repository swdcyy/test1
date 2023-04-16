package com.yxcorp.gifshow.webview.bridge.a;
import vxc.h;
import vxc.e;
import java.lang.Object;
import r97.f0;
import com.yxcorp.gifshow.webview.api.WebViewFragment$c;
import uxc.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.webkit.WebView;
import com.yxcorp.gifshow.webview.view.c;
import com.yxcorp.gifshow.webview.helper.event.JsNativeEventCommunication;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView;
import iyc.d;
import wxc.a;
import vxc.b;
import iyc.b;
import iyc.c;
import com.yxcorp.gifshow.webview.bridge.a$k;
import android.app.Activity;
import vxc.z;
import erd.g;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import com.kwai.robust.PatchProxyResult;
import vxc.i;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.gifshow.webview.bridge.a$q;
import java.util.Map;
import com.yxcorp.gifshow.webview.bridge.a$i;
import com.yxcorp.gifshow.webview.bridge.a$e;
import txc.c;
import q87.c;
import com.yxcorp.gifshow.webview.bridge.a$h;
import com.yxcorp.gifshow.webview.bridge.a$p;
import com.yxcorp.gifshow.webview.yoda.h;
import vxc.y;
import com.yxcorp.gifshow.webview.bridge.a$o;
import com.yxcorp.gifshow.webview.bridge.a$j;
import com.yxcorp.gifshow.webview.bridge.a$c;
import com.yxcorp.gifshow.webview.bridge.a$m;
import com.yxcorp.gifshow.webview.bridge.a$g;
import com.yxcorp.gifshow.webview.bridge.a$a;
import com.yxcorp.gifshow.webview.bridge.a$b;
import com.yxcorp.gifshow.webview.bridge.a$f;
import com.yxcorp.gifshow.webview.bridge.a$d;
import com.yxcorp.gifshow.webview.bridge.a$l;
import com.yxcorp.gifshow.webview.bridge.a$n;

public final class a implements h, e	// class@00171e
{
    public GifshowActivity a;
    public WebView b;
    public ProgressFragment c;
    public c d;
    public JsNativeEventCommunication e;
    public b f;
    public Map g;
    public WebViewFragment$c h;
    public final y i;
    public y j;
    public static String k;
    public static WeakReference l;
    public static WeakReference m;

    public void a(){
       super();
       this.i = new f0(true);
    }
    public WebViewFragment$c a(){
       return this.h;
    }
    public void b(WebViewFragment$c p0){
       this.h = p0;
    }
    public void c(b p0){
       this.f = p0;
    }
    public void d(GifshowActivity p0,WebView p1,c p2,JsNativeEventCommunication p3){
       if (PatchProxy.applyVoidFourRefsWithListener(p0, p1, p2, p3, this, a.class, "1")) {
          return;
       }
       this.a = p0;
       this.b = p1;
       this.d = p2;
       this.e = p3;
       if (p1 instanceof KwaiYodaWebView) {
          p3 = null;
          if (!PatchProxy.applyVoidTwoRefs(p1, p1, p3, d.class, "1") && !PatchProxy.applyVoidTwoRefs(p1, p1, p3, a.class, "1")) {
             p1.a(b.class, new a(p1));
          }
       }
       PatchProxy.onMethodExit(a.class, "1");
       return;
    }
    public void decryptContactsName(String p0){
       new a$k(this, this.a, this.b).f(p0);
    }
    public ProgressFragment e(g p0){
       ProgressFragment obj = PatchProxy.applyOneRefs(p0, this, a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.c == null) {
          obj = new ProgressFragment();
          this.c = obj;
          obj.k0(new i(this));
       }
       a tc = this.c;
       if (tc.isAdded()) {
          return null;
       }else if(p0 != null){
          p0.accept(tc);
       }
       e0.show(this.a.getSupportFragmentManager(), "runner");
       return e0;
    }
    public void emitFreeTrafficUpdate(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "10")) {
          return;
       }
       new a$q(this, this.a, this.b).f(p0);
       return;
    }
    public Map f(){
       return this.g;
    }
    public void g(Map p0){
       this.g = p0;
    }
    public void getABTest(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "19")) {
          return;
       }
       new a$i(this, this.a, this.b, p0).f(p0);
       return;
    }
    public void getLocation(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "15")) {
          return;
       }
       new a$e(this, this.a, this.b).f(p0);
       return;
    }
    public b h(){
       return this.f;
    }
    public void httpRequest(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "18")) {
          return;
       }
       Object[] objArray = new Object[0];
       c.C().s("JsInjectKwai", p0, objArray);
       new a$h(this, this.a, this.b).f(p0);
       return;
    }
    public JsNativeEventCommunication i(){
       return this.e;
    }
    public void injectCookie(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "9")) {
          return;
       }
       new a$p(this, this.a, this.b).f(p0);
       return;
    }
    public c j(){
       return this.d;
    }
    public h k(Object p0,String p1){
       y oy = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "20");
       if (oy != PatchProxyResult.class) {
       }else {
          oy = new y(p0, p1);
          this.j = oy;
       }
       return oy;
    }
    public void openTransparentWebView(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "7")) {
          return;
       }
       new a$o(this, this.a, this.b).f(p0);
       return;
    }
    public void renderImage(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "21")) {
          return;
       }
       new a$j(this, this.a, this.b).f(p0);
       return;
    }
    public void requestLocationPermission(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "13")) {
          return;
       }
       new a$c(this, this.a, this.b).f(p0);
       return;
    }
    public void selectScreenshot(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       new a$m(this, this.a, this.b).f(p0);
       return;
    }
    public void shareGame(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "17")) {
          return;
       }
       new a$g(this, this.a, this.b).f(p0);
       return;
    }
    public void showDialog(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       new a$a(this, this.a, this.b).f(p0);
       return;
    }
    public void startPlayLongVideo(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "12")) {
          return;
       }
       new a$b(this, this.a, this.b).f(p0);
       return;
    }
    public void startVibrate(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "16")) {
          return;
       }
       new a$f(this, this.a, this.b).f(p0);
       return;
    }
    public void syncLocation(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "14")) {
          return;
       }
       new a$d(this, this.a, this.b).f(p0);
       return;
    }
    public void uploadContacts(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       new a$l(this, this.a, this.b).f(p0);
       return;
    }
    public void verifyRealNameInfo(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "6")) {
          return;
       }
       new a$n(this, this.a, this.b).f(p0);
       return;
    }
}
