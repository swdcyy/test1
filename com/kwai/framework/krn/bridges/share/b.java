package com.kwai.framework.krn.bridges.share.b;
import mhc.n1;
import com.kwai.sharelib.jsshare.StartShareParam$JsShareParam;
import com.kwai.framework.krn.bridges.share.b$a;
import uo7.k;
import rq4.d;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelElement;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Throwable;
import java.lang.Integer;
import com.kwai.framework.krn.bridges.share.JsKsShareResult;
import android.util.Log;
import com.kwai.sharelib.model.ShareAnyResponse;
import java.lang.Exception;

public class b extends n1	// class@0015da
{
    public final StartShareParam$JsShareParam b;
    public final b$a c;

    public void b(StartShareParam$JsShareParam p0,b$a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void f(k p0,d p1){
    }
    public void l(k p0,ShareInitResponse$SharePanelElement p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "7")) {
          return;
       }
       this.q(p0, null, 0);
       return;
    }
    public void m(k p0,ShareInitResponse$SharePanelElement p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "5")) {
          return;
       }
       this.q(p0, p2, -1);
       return;
    }
    public void p(k p0,ShareInitResponse$SharePanelElement p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "6")) {
          return;
       }
       this.q(p0, null, 1);
       return;
    }
    public final void q(k p0,Throwable p1,int p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, b.class, "8")) {
          return;
       }
       if (this.c == null) {
          return;
       }
       JsKsShareResult jsKsShareRes = new JsKsShareResult();
       jsKsShareRes.mResult = p2;
       jsKsShareRes.mErrorMsg = (p1 != null)? Log.getStackTraceString(p1): "";
       if (p0 != null && p0.r() != null) {
          jsKsShareRes.mResponse = p0.r();
       }
       try{
          this.c.b(jsKsShareRes);
       }catch(java.lang.Exception e8){
          e8.printStackTrace();
       }
       return;
    }
}
