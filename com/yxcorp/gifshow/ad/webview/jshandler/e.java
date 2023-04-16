package com.yxcorp.gifshow.ad.webview.jshandler.e;
import zl9.b;
import p59.t;
import com.yxcorp.gifshow.ad.webview.jshandler.e$a;
import java.lang.Object;
import java.lang.String;
import zl9.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.google.gson.Gson;
import com.yxcorp.gifshow.ad.webview.jshandler.e$b;
import com.kwai.framework.model.feed.BaseFeed;
import yx.j0;
import mxb.j0;
import mxb.i0;
import p59.w;
import erd.g;
import java.lang.Exception;
import zl9.a;

public class e implements b	// class@001908
{
    public final t a;
    public e$a b;

    public void e(t p0,e$a p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void e(String p0,e p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "1")) {
          return;
       }
       int i = -1;
       try{
          if (this.a.d == null) {
             p1.onError(i, "native photo is null");
             return;
          }else {
             e$b uob = new Gson().h(p0, e$b.class);
             e tb = this.b;
             if (tb != null && tb.a(this.a.d, uob)) {
                Object[] objArray = new Object[0];
                j0.f("BridgeHandler", " log consumed by interceptor", objArray);
                return;
             }else {
                i0.a().e(uob.mActionType, this.a.d).d(new w(uob)).a();
                p1.onSuccess(null);
             }
          }
       }catch(java.lang.Exception e5){
          p1.onError(i, e5.getMessage());
       }
       return;
    }
    public Object f(String p0,Class p1,e p2){
       return a.b(this, p0, p1, p2);
    }
    public String getKey(){
       return "log";
    }
    public void onDestroy(){
       a.a(this);
    }
}
