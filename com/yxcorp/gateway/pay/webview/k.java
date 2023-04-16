package com.yxcorp.gateway.pay.webview.k;
import com.kuaishou.webkit.WebChromeClient;
import com.yxcorp.gateway.pay.activity.PayWebViewActivity;
import java.lang.String;
import com.kuaishou.webkit.ValueCallback;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.Intent;
import com.kwai.robust.PatchProxyResult;
import fv8.a;
import rv8.l;
import com.yxcorp.gateway.pay.activity.BaseActivity;
import android.content.ActivityNotFoundException;
import com.kuaishou.webkit.WebView;
import com.kuaishou.webkit.WebChromeClient$FileChooserParams;

public class k extends WebChromeClient	// class@0012a2
{
    public final PayWebViewActivity a;

    public void k(PayWebViewActivity p0){
       this.a = p0;
    }
    public final void d(String p0,boolean p1,ValueCallback p2,ValueCallback p3){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), p2, p3, this, k.class, "3")) {
          return;
       }
       if (!TextUtils.isEmpty(p0)) {
          try{
             p0 = p0.toLowerCase();
             if (!PatchProxy.applyVoidThreeRefs(p2, p3, p0, this, k.class, "4")) {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.setType(p0);
                p0 = "android.intent.category.OPENABLE";
                intent.addCategory(p0);
                k ta = this.a;
                intent = Intent.createChooser(intent, "");
                l ol = PatchProxy.applyTwoRefs(p2, p3, this, ok, "6");
                if (ol != PatchProxyResult.class) {
                }else {
                   ol = new l(p2, p3);
                }
                ta.startActivityForCallback(intent, 4, ol);
             }
          }catch(android.content.ActivityNotFoundException e10){
             e10.printStackTrace();
          }
       }
    }
    public boolean onShowFileChooser(WebView p0,ValueCallback p1,WebChromeClient$FileChooserParams p2){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, k.class, "2");
       if (p0 != patchProxyRe) {
          return p0.booleanValue();
       }
       String[] acceptTypes = p2.getAcceptTypes();
       object oobject = PatchProxy.applyOneRefs(acceptTypes, this, k.class, "5");
       if (oobject != patchProxyRe) {
       }else if(acceptTypes == null || !acceptTypes.length){
          int len = acceptTypes.length;
          int i = 0;
          while (true) {
             if (i < len) {
                object oobject1 = acceptTypes[i];
                if (!TextUtils.isEmpty(oobject1)) {
                   oobject = oobject1;
                   break ;
                }else {
                   i = i + 1;
                }
             }
          }
       }
       oobject = "*/*";
       this.d(oobject, p2.isCaptureEnabled(), p1, null);
       return true;
    }
    public void openFileChooser(ValueCallback p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, k.class, "1")) {
          return;
       }
       this.d(p1, TextUtils.equals("camera", p2), null, p0);
       return;
    }
}
