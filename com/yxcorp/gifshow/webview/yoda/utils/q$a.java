package com.yxcorp.gifshow.webview.yoda.utils.q$a;
import gy7.b;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import ji7.a;
import java.lang.ClassLoader;
import java.lang.Throwable;
import yz7.r;

public class q$a extends b	// class@0017d9
{

    public void q$a(){
       super();
    }
    public Class a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, q$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return Class.forName(p0);
       }catch(java.lang.Exception e0){
          if (a.t().d("yoda_use_dva_loader", false)) {
             boolean b = true;
             try{
                return Class.forName(p0, b, a.b);
             }catch(java.lang.Exception e4){
                r.f(e4);
             }
             return null;
          }else {
             goto label_002d ;
          }
       }
    }
}
