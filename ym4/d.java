package ym4.d;
import com.yxcorp.gifshow.webview.yoda.g;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import com.kwai.sdk.switchconfig.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.System;
import android.view.View;
import android.graphics.Bitmap;
import j74.f;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import p74.a;
import o74.a;
import ym4.c;
import java.lang.Runnable;
import t45.c;
import java.lang.Boolean;
import java.lang.Long;
import org.json.JSONObject;
import org.json.JSONException;
import java.lang.Float;
import lnc.i3;
import java.lang.Number;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import k2b.u1;
import com.kuaishou.webkit.WebView;

public abstract class d extends g	// class@0038ff
{
    public int j;
    public String k;
    public boolean l;
    public final YodaBaseWebView m;
    public final String n;

    public void d(YodaBaseWebView p0,String p1){
       super(p0);
       this.m = p0;
       this.n = p1;
       this.k = p1;
       this.j = a.t().a("merchantTrilateralWhiteScreenMonitor", 0);
    }
    public abstract String C();
    public final String D(){
       return this.n;
    }
    public final void E(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "4")) {
          return;
       }
       if (this.j <= null) {
          return;
       }
       if (this.l != null) {
          return;
       }
       boolean b = true;
       this.l = b;
       if (p0 == b) {
          this.G(false, 0, p0);
       }else {
          d tm = this.m;
          if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidTwoRefs(tm, Integer.valueOf(p0), this, uod, "6")) {
             Bitmap uBitmap = f.a(tm, this.j);
             long l = System.currentTimeMillis() - System.currentTimeMillis();
             if (uBitmap == null) {
                a.s(MerchantCommonLogBiz.WEB, "MerchantYodaWebViewClient", "tryMonitorWhiteScreenAndLog-capturedBmp is null");
             }else {
                c uoc = new c(this, uBitmap, l, p0);
                c.a(uod);
             }
          }
       }
       return;
    }
    public void F(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       if (this.j > null) {
          this.E(3);
       }
       return;
    }
    public final void G(boolean p0,long p1,int p2){
       JSONObject jSONObject;
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Long.valueOf(p1), Integer.valueOf(p2), this, d.class, "5")) {
          return;
       }
       int i = 1;
       int i1 = (p0)? 2: 1;
       try{
          jSONObject = new JSONObject();
          jSONObject.put("container", this.C());
          jSONObject.put("containerType", i);
          jSONObject.put("loadUrl", this.n);
          jSONObject.put("openUrl", this.k);
          jSONObject.put("logFrom", p2);
       }catch(org.json.JSONException e13){
          e13.printStackTrace();
       }
       String str = jSONObject.toString();
       f uof = f.class;
       if (!PatchProxy.isSupport(uof) || (!PatchProxy.applyVoidThreeRefs(Long.valueOf(p1), Integer.valueOf(i1), str, null, f.class, "7") && (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidFourRefs(Long.valueOf(p1), Integer.valueOf(i1), str, Float.valueOf(0), null, f.class, "8")))) {
          i3 oi3 = i3.f();
          oi3.d("screenShotTime", String.valueOf(p1));
          oi3.c("whiteScreen", Integer.valueOf(i1));
          oi3.c("whiteScreenPixelRate", Float.valueOf(0x3f733333));
          if (!TextUtils.x(str)) {
             oi3.d("extra", str);
          }
          u1.R("Merchant_Screen_Shot_White_Screen", oi3.toString(), 7);
       }
       return;
    }
    public void k(long p0){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, d.class, "1")) {
          return;
       }
       this.E(1);
       return;
    }
    public void onPageFinished(WebView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "2")) {
          return;
       }
       super.onPageFinished(p0, p1);
       this.k = p1;
       return;
    }
}
