package com.kwai.yoda.function.ui.k;
import com.kwai.yoda.function.c;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import com.kwai.yoda.model.ToastParams;
import ey7.j;
import erd.g;
import brd.t;
import crd.b;

public class k extends c	// class@001242
{

    public void k(){
       super();
    }
    public void a(YodaBaseWebView p0,String p1,String p2,String p3,String p4){
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, ok, "1")) {
             return;
          }
       }
       this.r(p0, p1, p2, p4, this.q(p0, p3, ToastParams.class, new j(p0)));
       return;
    }
}
