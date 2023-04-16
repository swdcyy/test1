package com.yxcorp.gifshow.ad.webview.jshandler.AdNeoH5VideoActionHandler;
import zl9.b;
import com.yxcorp.gifshow.ad.webview.jshandler.AdNeoH5VideoActionHandler$b;
import nsd.u;
import p59.t;
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.ad.webview.jshandler.AdNeoH5VideoActionHandler$mIClickProcessor$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.ad.webview.jshandler.AdNeoH5VideoActionHandler$a;
import p59.t$a;
import zl9.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import yx.j0;
import fg6.a;
import com.yxcorp.gifshow.ad.webview.jshandler.dto.AdNeoH5VideoData;
import com.google.gson.Gson;
import java.util.Map;
import nsd.s0;
import k59.t0;
import java.lang.NullPointerException;
import com.yxcorp.gifshow.ad.webview.jshandler.AdNeoH5VideoActionHandler$c;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Throwable;
import zl9.a;

public final class AdNeoH5VideoActionHandler implements b	// class@0018dd
{
    public final p a;
    public a b;
    public final t c;
    public final HashMap d;
    public static final AdNeoH5VideoActionHandler$b e;

    static {
       AdNeoH5VideoActionHandler.e = new AdNeoH5VideoActionHandler$b(null);
    }
    public void AdNeoH5VideoActionHandler(t p0,HashMap p1){
       a.p(p0, "mJsBridgeContext");
       a.p(p1, "mAdSessionMap");
       super();
       this.c = p0;
       this.d = p1;
       this.a = s.c(AdNeoH5VideoActionHandler$mIClickProcessor$2.INSTANCE);
       p0.a(new AdNeoH5VideoActionHandler$a(this));
    }
    public void e(String p0,e p1){
       int action;
       Object[] objArray1;
       String str = "check AdInfo data error";
       String str1 = "action is illegal";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AdNeoH5VideoActionHandler.class, "2")) {
          return;
       }
       a.p(p1, "function");
       Object[] objArray = new Object[0];
       j0.f("adNeoH5VideoAction", "data:"+p0, objArray);
       AdNeoH5VideoData uAdNeoH5Vide = a.a.h(p0, AdNeoH5VideoData.class);
       action = uAdNeoH5Vide.getAction();
       if (action != 1) {
          if (action != 2) {
             objArray1 = new Object[0];
             j0.c("adNeoH5VideoAction", str1, objArray1);
             p1.onError(-1, str1);
          }else {
             AdNeoH5VideoActionHandler td = this.d;
             uAdNeoH5Vide = uAdNeoH5Vide.getSessionId();
             if (td != null) {
                t0 ot0 = s0.k(td).remove(uAdNeoH5Vide);
                if (ot0 != null) {
                   ot0.b();
                }
             }else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
             }
          }
       }else if(uAdNeoH5Vide.checkAdInfo() == true){
          k1.p(new AdNeoH5VideoActionHandler$c(this, uAdNeoH5Vide, p1), this);
       }else {
          objArray1 = new Object[0];
          j0.c("adNeoH5VideoAction", str, objArray1);
          p1.onError(-1, str);
       }
       return;
    }
    public Object f(String p0,Class p1,e p2){
       return a.b(this, p0, p1, p2);
    }
    public String getKey(){
       return "adNeoH5VideoAction";
    }
    public void onDestroy(){
       a.a(this);
    }
}
