package com.yxcorp.gifshow.webview.yoda.function.e;
import com.kwai.yoda.function.c;
import com.kwai.yoda.bridge.YodaBaseWebView;
import android.app.Activity;
import java.lang.ref.WeakReference;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import wkd.b;
import kka.h;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import brd.t;
import oyc.f;
import oyc.e;
import erd.g;
import crd.b;

public class e extends c	// class@0017b9
{
    public WeakReference f;

    public void e(YodaBaseWebView p0,Activity p1){
       super();
       this.f = new WeakReference(p1);
    }
    public void a(YodaBaseWebView p0,String p1,String p2,String p3,String p4){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uoe, "1")) {
             return;
          }
       }
       if (this.f.get() == null || this.f.get().isFinishing()) {
          this.o(p0, p1, p2, 0x1e84a, "current page is finished", p4);
          return;
       }else {
          e uoe1 = this;
          YodaBaseWebView yodaBaseWebV = p0;
          f uof = new f(uoe1, yodaBaseWebV, p4, p1, p2);
          uoe = new e(uoe1, yodaBaseWebV, p1, p2, p4);
          b.a(-1592356291).g(RequestTiming.DEFAULT).subscribe(v7, v8);
          return;
       }
    }
}
