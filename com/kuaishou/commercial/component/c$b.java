package com.kuaishou.commercial.component.c$b;
import zl9.b;
import com.kuaishou.commercial.component.c;
import java.lang.Object;
import java.lang.String;
import zl9.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.google.gson.Gson;
import com.yxcorp.gifshow.ad.webview.jshandler.dto.JsToastParams;
import com.kuaishou.commercial.component.TransparentBgDialogFragment;
import java.lang.StringBuilder;
import yx.j0;
import java.lang.Exception;
import zl9.a;

public class c$b implements b	// class@001497
{
    public final c a;

    public void c$b(c p0){
       this.a = p0;
       super();
    }
    public void e(String p0,e p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c$b.class, "1")) {
          return;
       }
       try{
          JsToastParams jsToastParam = new Gson().h(p0, JsToastParams.class);
          c a = this.a.a;
          if (a != null) {
             a.dismissAllowingStateLoss();
             this.a.d(jsToastParam);
          }
       }catch(java.lang.Exception e4){
          Object[] objArray = new Object[0];
          j0.c("BridgeHandler", "handleJsCall error: "+e4, objArray);
          p1.onError(-1, e4.getMessage());
       }
       return;
    }
    public Object f(String p0,Class p1,e p2){
       return a.b(this, p0, p1, p2);
    }
    public String getKey(){
       return "toastAndExit";
    }
    public void onDestroy(){
       a.a(this);
    }
}
