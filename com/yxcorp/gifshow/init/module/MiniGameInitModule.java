package com.yxcorp.gifshow.init.module.MiniGameInitModule;
import com.kwai.framework.init.TTIInitModule;
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
import java.lang.StringBuilder;
import o56.d;
import qj7.d;
import jd6.g;
import com.kwai.framework.plugin.PluginManager;
import tkd.b;
import tkd.d;
import oib.b;
import android.app.Application;
import o56.a;
import com.yxcorp.gifshow.init.module.h0;
import java.lang.Runnable;
import am8.d;
import android.content.Intent;
import o56.c;
import java.lang.Exception;

public class MiniGameInitModule extends TTIInitModule	// class@00198c
{
    public static final int q;

    public void MiniGameInitModule(){
       super();
    }
    public boolean C(){
       return true;
    }
    public int f0(){
       return 8;
    }
    public List g(){
       Class[] obj = PatchProxy.applyWithListener(null, this, MiniGameInitModule.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{CoreInitModule.class};
       PatchProxy.onMethodExit(MiniGameInitModule.class, "3");
       return Lists.e(obj);
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, MiniGameInitModule.class, "2")) {
          return;
       }
       Object[] objArray = null;
       String str = "1";
       if (!PatchProxy.applyVoidWithListener(objArray, this, MiniGameInitModule.class, str)) {
          d.c("MiniGame intercept page: execute."+d.i);
          if (!d.i) {
             PatchProxy.onMethodExit(MiniGameInitModule.class, str);
          }else if(PatchProxy.applyVoidWithListener(objArray, this, MiniGameInitModule.class, "4")){
             String str1 = "minigame";
             boolean b = g.d(str1);
             d.c("MiniGame intercept page: registerPluginLink MiniGameIsPlugin->"+b);
             if (b) {
                PluginManager.H.P(str1, 1);
             }
             PatchProxy.onMethodExit(MiniGameInitModule.class, "4");
          }
          b uob = d.a(0x173837f0);
          if (uob != null && uob.isAvailable()) {
             uob.initialize(a.b());
          }
          PatchProxy.onMethodExit(MiniGameInitModule.class, str);
       }
       d.d(h0.b, "gzone_report_game_download_complete", 2);
       if (!d.i) {
          PatchProxy.onMethodExit(MiniGameInitModule.class, "2");
          return;
       }else {
          try{
             Intent intent = new Intent("action_broadcast_main_process_restart");
             intent.setPackage(a.a().a().getPackageName());
             a.a().a().sendBroadcast(intent);
          }catch(java.lang.Exception e7){
             d.c("MiniGame MiniGameInitModule sendBroadcast "+e7.getMessage());
          }
          PatchProxy.onMethodExit(MiniGameInitModule.class, "2");
          return;
       }
    }
}
