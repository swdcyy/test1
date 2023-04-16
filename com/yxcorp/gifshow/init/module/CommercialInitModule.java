package com.yxcorp.gifshow.init.module.CommercialInitModule;
import com.kwai.framework.init.a;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.init.CoreInitModule;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import tkd.b;
import tkd.d;
import nl9.h0;
import nl9.p;
import b76.a;
import android.app.Application;
import o56.a;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import sxa.c;
import java.lang.Runnable;
import t45.c;

public class CommercialInitModule extends a	// class@001966
{
    public static final int q;

    public void CommercialInitModule(){
       super();
    }
    public int f0(){
       return 6;
    }
    public List g(){
       Class[] obj = PatchProxy.applyWithListener(null, this, CommercialInitModule.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{CoreInitModule.class};
       PatchProxy.onMethodExit(CommercialInitModule.class, "4");
       return Lists.e(obj);
    }
    public void h0(){
       if (PatchProxy.applyVoidWithListener(null, this, CommercialInitModule.class, "6")) {
          return;
       }
       d.a(-536296199).onBackground();
       PatchProxy.onMethodExit(CommercialInitModule.class, "6");
       return;
    }
    public void i0(){
       if (PatchProxy.applyVoidWithListener(null, this, CommercialInitModule.class, "1")) {
          return;
       }
       d.a(0x449d30cc).onForeground();
       PatchProxy.onMethodExit(CommercialInitModule.class, "1");
       return;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, CommercialInitModule.class, "5")) {
          return;
       }
       d.a(0x449d30cc).k();
       PatchProxy.onMethodExit(CommercialInitModule.class, "5");
       return;
    }
    public void n(){
       if (PatchProxy.applyVoidWithListener(null, this, CommercialInitModule.class, "2")) {
          return;
       }
       int i = 0x449d30cc;
       d.a(i).Lm(a.b());
       RequestTiming cOLD_START = RequestTiming.COLD_START;
       if (!PatchProxy.applyVoidOneRefsWithListener(cOLD_START, this, CommercialInitModule.class, "3")) {
          c.a(new c(cOLD_START));
          PatchProxy.onMethodExit(CommercialInitModule.class, "3");
       }
       d.a(i).v5();
       PatchProxy.onMethodExit(CommercialInitModule.class, "2");
       return;
    }
}
