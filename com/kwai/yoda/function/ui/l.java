package com.kwai.yoda.function.ui.l;
import com.kwai.yoda.function.c;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import com.kwai.yoda.model.PageStyleParams;
import ey7.k;
import erd.g;
import brd.t;
import crd.b;

public class l extends c	// class@001243
{

    public void l(){
       super();
    }
    public void a(YodaBaseWebView p0,String p1,String p2,String p3,String p4){
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, ol, "1")) {
             return;
          }
       }
       this.r(p0, p1, p2, p4, this.q(p0, p3, PageStyleParams.class, new k(p0)));
       return;
    }
}
