package com.kwai.yoda.function.ui.i;
import com.kwai.yoda.function.c;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import kotlin.jvm.internal.a;
import ez7.d;
import com.kwai.yoda.function.ui.i$a;
import erd.g;
import brd.t;
import crd.b;

public final class i extends c	// class@001240
{

    public void i(){
       super();
    }
    public void a(YodaBaseWebView p0,String p1,String p2,String p3,String p4){
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, oi, "1")) {
             return;
          }
       }
       a.q(p1, "nameSpace");
       a.q(p2, "command");
       a.q(p3, "params");
       a.q(p4, "callbackId");
       this.r(p0, p1, p2, p4, this.q(p0, p3, d.class, new i$a(p0)));
       return;
    }
}
