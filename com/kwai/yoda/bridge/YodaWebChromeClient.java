package com.kwai.yoda.bridge.YodaWebChromeClient;
import com.kuaishou.webkit.WebChromeClient;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import com.kuaishou.webkit.ValueCallback;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Boolean;
import px7.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import ca7.u;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.app.Activity;
import rx7.s;
import android.view.Window;
import android.view.View;
import android.widget.FrameLayout;
import com.kuaishou.webkit.WebChromeClient$CustomViewCallback;
import java.lang.Integer;
import yz7.n;
import com.kwai.yoda.model.LaunchModel;
import com.kwai.yoda.model.ButtonParams;
import px7.c;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.webkit.WebChromeClient$FileChooserParams;

public class YodaWebChromeClient extends WebChromeClient	// class@001187
{
    public YodaBaseWebView a;
    public View b;
    public WebChromeClient$CustomViewCallback c;
    public int d;
    public int e;

    public void YodaWebChromeClient(YodaBaseWebView p0){
       super();
       this.a = p0;
    }
    public final void d(WebView p0,String p1,boolean p2,ValueCallback p3,ValueCallback p4){
       YodaWebChromeClient yodaWebChrom = YodaWebChromeClient.class;
       if (PatchProxy.isSupport(yodaWebChrom)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),p3,p4};
          if (PatchProxy.applyVoid(objArray, this, yodaWebChrom, "5")) {
             return;
          }
       }
       if (p0 instanceof YodaBaseWebView) {
          b.b(p0, p1, p2, p3, p4);
       }
       return;
    }
    public final String e(String[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, YodaWebChromeClient.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null && p0.length) {
          int len = p0.length;
          int i = 0;
          while (i < len) {
             object oobject = p0[i];
             if (!u.c(oobject)) {
                return oobject;
             }
             i = i + 1;
          }
       }
       return "*/*";
    }
    public Bitmap getDefaultVideoPoster(){
       Object obj = PatchProxy.apply(null, this, YodaWebChromeClient.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int[] ointArray = new int[]{0};
       return Bitmap.createBitmap(ointArray, 1, 1, Bitmap$Config.ARGB_8888);
    }
    public void onHideCustomView(){
       if (PatchProxy.applyVoid(null, this, YodaWebChromeClient.class, "8")) {
          return;
       }
       Activity uActivity = s.b(this.a);
       if (uActivity != null && !uActivity.isFinishing()) {
          if (this.b != null) {
             uActivity.getWindow().getDecorView().removeView(this.b);
             this.b = null;
             uActivity.getWindow().getDecorView().setSystemUiVisibility(this.d);
             uActivity.setRequestedOrientation(this.e);
          }
          YodaWebChromeClient tc = this.c;
          if (tc != null) {
             tc.onCustomViewHidden();
             this.c = null;
          }
       }
    label_004a :
       return;
    }
    public void onProgressChanged(WebView p0,int p1){
       YodaWebChromeClient yodaWebChrom = YodaWebChromeClient.class;
       if (PatchProxy.isSupport(yodaWebChrom) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, yodaWebChrom, "7")) {
          return;
       }
       super.onProgressChanged(p0, p1);
       if (!n.f(p0) && !n.a(p0)) {
          p0.setProgress(p1);
       }
       return;
    }
    public void onReceivedTitle(WebView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, YodaWebChromeClient.class, "1")) {
          return;
       }
       super.onReceivedTitle(p0, p1);
       if (n.a(p0) || (!n.f(p0) && (u.c(p0.mLaunchModel.getTitle()) && !p1.equals("about:blank")))) {
          ButtonParams uButtonParam = new ButtonParams();
          uButtonParam.mTitle = p1;
          c.c(p0, uButtonParam);
       }
    label_003b :
       return;
    }
    public void onShowCustomView(View p0,WebChromeClient$CustomViewCallback p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, YodaWebChromeClient.class, "9")) {
          return;
       }
       if (this.b != null) {
          this.onHideCustomView();
          return;
       }else {
          Activity uActivity = s.b(this.a);
          if (uActivity != null && !uActivity.isFinishing()) {
             this.b = p0;
             this.d = uActivity.getWindow().getDecorView().getSystemUiVisibility();
             this.c = p1;
             uActivity.getWindow().getDecorView().addView(this.b, new FrameLayout$LayoutParams(-1, -1));
             this.e = uActivity.getRequestedOrientation();
             if (this.a.getPendingVideoFullScreenOrientation() != Integer.MIN_VALUE) {
                uActivity.setRequestedOrientation(this.a.getPendingVideoFullScreenOrientation());
             }
             uActivity.getWindow().getDecorView().setSystemUiVisibility(2310);
          }
          return;
       }
    }
    public boolean onShowFileChooser(WebView p0,ValueCallback p1,WebChromeClient$FileChooserParams p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, YodaWebChromeClient.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.d(p0, this.e(p2.getAcceptTypes()), p2.isCaptureEnabled(), p1, null);
       return true;
    }
    public void openFileChooser(ValueCallback p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaWebChromeClient.class, "4")) {
          return;
       }
       this.d(this.a, this.e(null), false, null, p0);
       return;
    }
    public void openFileChooser(ValueCallback p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, YodaWebChromeClient.class, "2")) {
          return;
       }
       this.d(this.a, p1, u.b("camera", p2), null, p0);
       return;
    }
}
