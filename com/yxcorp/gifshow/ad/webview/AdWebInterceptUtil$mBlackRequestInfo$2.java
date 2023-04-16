package com.yxcorp.gifshow.ad.webview.AdWebInterceptUtil$mBlackRequestInfo$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import p59.n;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.ad.webview.AdWebInterceptUtil;
import java.util.Objects;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;
import yx.j0;

public final class AdWebInterceptUtil$mBlackRequestInfo$2 extends Lambda implements a	// class@001895
{
    public static final AdWebInterceptUtil$mBlackRequestInfo$2 INSTANCE;

    static {
       AdWebInterceptUtil$mBlackRequestInfo$2.INSTANCE = new AdWebInterceptUtil$mBlackRequestInfo$2();
    }
    public void AdWebInterceptUtil$mBlackRequestInfo$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final n invoke(){
       Object[] objArray1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       AdWebInterceptUtil obj = PatchProxy.apply(objArray, this, AdWebInterceptUtil$mBlackRequestInfo$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       try{
          obj = AdWebInterceptUtil.c;
          Objects.requireNonNull(obj);
          objArray1 = PatchProxy.apply(objArray, obj, AdWebInterceptUtil.class, "5");
          if (objArray1 != patchProxyRe) {
          }else {
             n value = a.t().getValue("AdH5BlackRequestUrlInfo", n.class, new n());
             String str = "AdWebInterceptUtil";
             String str1 = (value != null)? value.toString(): objArray;
             Object[] objArray2 = new Object[0];
             j0.f(str, str1, objArray2);
             objArray = value;
             objArray1 = objArray;
          }
       }catch(java.lang.Exception e0){
       }
       return objArray1;
    }
}
