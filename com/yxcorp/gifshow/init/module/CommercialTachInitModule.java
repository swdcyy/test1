package com.yxcorp.gifshow.init.module.CommercialTachInitModule;
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
import nl9.y;
import b76.a;
import com.kuaishou.tk.api.b;
import com.yxcorp.utility.SystemUtil;
import o56.a;
import rx4.i;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import com.yxcorp.gifshow.init.module.d;
import java.lang.Runnable;
import ekd.k1;

public class CommercialTachInitModule extends a	// class@001967
{
    public static final int q;

    public void CommercialTachInitModule(){
       super();
    }
    public int f0(){
       return 6;
    }
    public List g(){
       Class[] obj = PatchProxy.applyWithListener(null, this, CommercialTachInitModule.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{CoreInitModule.class};
       PatchProxy.onMethodExit(CommercialTachInitModule.class, "4");
       return Lists.e(obj);
    }
    public void i0(){
       if (PatchProxy.applyVoidWithListener(null, this, CommercialTachInitModule.class, "2")) {
          return;
       }
       d.a(-304540290).onForeground();
       PatchProxy.onMethodExit(CommercialTachInitModule.class, "2");
       return;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, CommercialTachInitModule.class, "3")) {
          return;
       }
       d.a(-304540290).k();
       PatchProxy.onMethodExit(CommercialTachInitModule.class, "3");
       return;
    }
    public void n(){
       if (PatchProxy.applyVoidWithListener(null, this, CommercialTachInitModule.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoidWithListener(null, this, CommercialTachInitModule.class, "5")) {
          if (b.b().e()) {
             StringBuilder str = null;
             long l = (SystemUtil.K() && a.d())? d.a(0x256720e1).Hq(): str;
             if (l - str > 0) {
                Log.g("CommercialTachInitModule", "delay "+l+" ms to install tk plugin");
                k1.r(d.b, l);
             }else {
                b.b().c();
             }
          }else {
             d.a(-304540290).run();
          }
          PatchProxy.onMethodExit(CommercialTachInitModule.class, "5");
       }
       PatchProxy.onMethodExit(CommercialTachInitModule.class, "1");
       return;
    }
}
