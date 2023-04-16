package com.kuaishou.commercial.component.f$a;
import zl9.b;
import com.kuaishou.commercial.component.f;
import java.lang.Object;
import java.lang.String;
import zl9.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.google.gson.Gson;
import com.yxcorp.gifshow.ad.webview.jshandler.dto.PageStatus;
import java.lang.StringBuilder;
import yx.j0;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Exception;
import zl9.a;

public class f$a implements b	// class@00149c
{
    public final f a;

    public void f$a(f p0){
       this.a = p0;
       super();
    }
    public void e(String p0,e p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f$a.class, "1")) {
          return;
       }
       int i = 0;
       try{
          f$a ta = this.a;
          PageStatus mStatus = new Gson().h(p0, PageStatus.class).mStatus;
          if (ta.e == mStatus) {
             Object[] objArray1 = new Object[i];
             j0.l("BridgeHandler", "front end call duplicate status, mPageStatus: "+this.a.e, objArray1);
             p1.onSuccess(null);
             return;
          }else {
             ta.e = mStatus;
             k1.o(ta.m);
             p1.onSuccess(null);
          }
       }catch(java.lang.Exception e6){
          Object[] objArray = new Object[i];
          j0.c("BridgeHandler", "handleJsCall error: "+e6, objArray);
          p1.onError(-1, e6.getMessage());
       }
       return;
    }
    public Object f(String p0,Class p1,e p2){
       return a.b(this, p0, p1, p2);
    }
    public String getKey(){
       return "pageStatus";
    }
    public void onDestroy(){
       a.a(this);
    }
}
