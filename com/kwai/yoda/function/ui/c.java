package com.kwai.yoda.function.ui.c;
import com.kwai.yoda.function.c;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import com.kwai.yoda.model.ButtonParams;
import ey7.e;
import erd.g;
import brd.t;
import crd.b;

public class c extends c	// class@001238
{

    public void c(){
       super();
    }
    public void a(YodaBaseWebView p0,String p1,String p2,String p3,String p4){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uoc, "1")) {
             return;
          }
       }
       this.r(p0, p1, p2, p4, this.q(p0, p3, ButtonParams.class, new e(p0)));
       return;
    }
}
