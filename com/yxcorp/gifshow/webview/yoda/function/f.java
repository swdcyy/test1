package com.yxcorp.gifshow.webview.yoda.function.f;
import com.kwai.yoda.function.c;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import com.kwai.yoda.bridge.YodaException;
import java.lang.Exception;

public abstract class f extends c	// class@0017ba
{

    public void f(){
       super();
    }
    public void a(YodaBaseWebView p0,String p1,String p2,String p3,String p4){
       if (PatchProxy.isSupport(f.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, f.class, "1")) {
             return;
          }
       }
       try{
          this.s(p3);
          return;
       }catch(java.lang.Exception e4){
          throw new YodaException(0x1e84a, e4.getMessage());
       }
    }
    public abstract void s(String p0);
}
