package com.kwai.yoda.function.ui.g;
import com.kwai.yoda.function.c;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kwai.yoda.model.BehaviorParams;
import com.kwai.yoda.function.ui.g$a;
import erd.g;
import brd.t;
import crd.b;

public final class g extends c	// class@00123d
{

    public void g(){
       super();
    }
    public void a(YodaBaseWebView p0,String p1,String p2,String p3,String p4){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, og, "1")) {
             return;
          }
       }
       a.q(p1, "nameSpace");
       a.q(p2, "command");
       a.q(p3, "params");
       a.q(p4, "callbackId");
       this.r(p0, p1, p2, p4, this.q(p0, p3, BehaviorParams.class, new g$a(p0)));
       return;
    }
}
