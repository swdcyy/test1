package com.yxcorp.gifshow.init.module.MiniAppMiniInitModule;
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
import b76.a;
import tkd.b;
import tkd.d;
import ju5.g;
import android.app.Application;
import o56.a;
import k98.b;
import l98.i0;
import com.mini.host.base.a;
import com.mini.host.KsWebViewInitProxyImpl;
import com.mini.host.base.a$a;
import l88.c;
import am8.a;
import am8.d;
import l98.h0;
import java.lang.Runnable;
import jd6.g;
import java.lang.StringBuilder;
import qj7.d;
import com.kwai.framework.plugin.PluginManager;

public class MiniAppMiniInitModule extends a	// class@00198b
{

    public void MiniAppMiniInitModule(){
       super();
    }
    public int f0(){
       return 0;
    }
    public List g(){
       Class[] obj = PatchProxy.applyWithListener(null, this, MiniAppMiniInitModule.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{CoreInitModule.class};
       PatchProxy.onMethodExit(MiniAppMiniInitModule.class, "1");
       return Lists.e(obj);
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, MiniAppMiniInitModule.class, "3")) {
          return;
       }
       d.a(0x6ea0c3d0).kg();
       PatchProxy.onMethodExit(MiniAppMiniInitModule.class, "3");
       return;
    }
    public void n(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, MiniAppMiniInitModule.class, "2")) {
          return;
       }
       Application uApplication = a.b();
       if (b.a(uApplication) && !PatchProxy.applyVoidOneRefs(uApplication, objArray, i0.class, "1")) {
          c.f = new a(new KsWebViewInitProxyImpl());
          d.b("ks-mp-mini-init", 1).execute(new h0(uApplication));
       }
       if (!PatchProxy.applyVoidWithListener(objArray, this, MiniAppMiniInitModule.class, "4")) {
          String str = "miniapp";
          b = g.d(str);
          d.c("miniapp intercept page: registerPluginLink MiniAppIsPlugin->"+b);
          if (b) {
             PluginManager.H.P(str, 3);
          }
          PatchProxy.onMethodExit(MiniAppMiniInitModule.class, "4");
       }
       d.a(0x6ea0c3d0).qO();
       PatchProxy.onMethodExit(MiniAppMiniInitModule.class, "2");
       return;
    }
}
