package com.kuaishou.merchant.web.yoda.function.SelectIdCardFunction;
import com.kwai.yoda.function.c;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import p74.a;
import o74.a;
import java.lang.StringBuilder;
import com.kuaishou.merchant.web.yoda.function.b;
import com.kuaishou.webkit.WebView;
import vxc.z;
import java.lang.Throwable;
import com.kwai.yoda.bridge.YodaException;
import java.lang.Exception;

public class SelectIdCardFunction extends c	// class@0009e2
{

    public void SelectIdCardFunction(){
       super();
    }
    public void a(YodaBaseWebView p0,String p1,String p2,String p3,String p4){
       Object[] objArray;
       object oobject = p3;
       SelectIdCardFunction selectIdCard = SelectIdCardFunction.class;
       int i = 4;
       int i1 = 3;
       int i2 = 2;
       int i3 = 1;
       int i4 = 0;
       int i5 = 5;
       if (PatchProxy.isSupport(selectIdCard)) {
          objArray = new Object[i5];
          objArray[i4] = p0;
          objArray[i3] = p1;
          objArray[i2] = p2;
          objArray[i1] = oobject;
          objArray[i] = p4;
          if (PatchProxy.applyVoid(objArray, this, selectIdCard, "1")) {
             return;
          }
       }
       try{
          if (p0 == null) {
             a.s(MerchantCommonLogBiz.WEBVIEW, "SelectIdCardFunction", "YodaBaseWebView is null");
             return;
          }else {
             a.s(MerchantCommonLogBiz.WEBVIEW, "SelectIdCardFunction", "params:"+oobject);
             if (PatchProxy.isSupport(selectIdCard)) {
                objArray = new Object[i5];
                objArray[i4] = p0;
                objArray[i3] = p1;
                objArray[i2] = p2;
                objArray[i1] = oobject;
                objArray[i] = p4;
                if (PatchProxy.applyVoid(objArray, this, selectIdCard, "2")) {
                label_0074 :
                   return;
                }
             }
             b uob = new b(this, p0, p0, p1, p2, p4);
             i5.f(oobject);
             goto label_0074 ;
          }
       }catch(java.lang.Exception e0){
          a.l(MerchantCommonLogBiz.WEBVIEW, v10, "handler: ", e0);
          throw new YodaException(0x1e84a, e0.getMessage());
       }
    }
}
