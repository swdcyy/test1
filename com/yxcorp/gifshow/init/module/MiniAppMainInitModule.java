package com.yxcorp.gifshow.init.module.MiniAppMainInitModule;
import com.kwai.framework.init.HomeCreateInitModule;
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
import ju5.g;
import java.lang.System;
import sxa.u;
import java.lang.Runnable;
import com.kwai.framework.init.e;
import b76.a;
import com.yxcorp.gifshow.init.module.g0;
import com.kwai.sdk.switchconfig.a;
import com.google.gson.JsonObject;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import sxa.v;
import android.app.Activity;
import android.os.Bundle;
import jd6.g;
import java.lang.StringBuilder;
import qj7.d;
import com.kwai.framework.plugin.PluginManager;

public class MiniAppMainInitModule extends HomeCreateInitModule	// class@00198a
{
    public boolean q;
    public boolean r;
    public static final int s;

    public void MiniAppMainInitModule(){
       super();
       this.q = false;
       this.r = false;
    }
    public boolean C(){
       return true;
    }
    public int f0(){
       return 0;
    }
    public List g(){
       Class[] obj = PatchProxy.applyWithListener(null, this, MiniAppMainInitModule.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{CoreInitModule.class};
       PatchProxy.onMethodExit(MiniAppMainInitModule.class, "7");
       return Lists.e(obj);
    }
    public void i0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, MiniAppMainInitModule.class, "2")) {
          return;
       }
       if (!d.a(0x6ea0c3d0).gl()) {
          PatchProxy.onMethodExit(MiniAppMainInitModule.class, "2");
          return;
       }else if(this.q == null){
          if (!PatchProxy.applyVoidWithListener(objArray, this, MiniAppMainInitModule.class, "4")) {
             e.h(new u(System.currentTimeMillis()), "downloadMiniSo", false);
             PatchProxy.onMethodExit(MiniAppMainInitModule.class, "4");
          }
          this.q = true;
       }
       PatchProxy.onMethodExit(MiniAppMainInitModule.class, "2");
       return;
    }
    public void k0(a p0){
       String str = "enabled";
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, MiniAppMainInitModule.class, "6")) {
          return;
       }
       int i = 0x6ea0c3d0;
       if (!d.a(i).gl()) {
          PatchProxy.onMethodExit(MiniAppMainInitModule.class, "6");
          return;
       }else {
          g og = d.a(i);
          if (og == null) {
             PatchProxy.onMethodExit(MiniAppMainInitModule.class, "6");
             return;
          }else {
             og.onLaunchFinish(System.currentTimeMillis());
             e.d(new g0(this, og), "MiniMainInitModule");
             if (this.r == null) {
                try{
                   Object obj = null;
                   JsonObject value = a.t().getValue("mini_use_j2v8_info", JsonObject.class, obj);
                   MiniAppMainInitModule miniAppMainI = (value != null && (value.s0(str) && value.e0(str).d()))? 1: null;
                   if (miniAppMainI && !PatchProxy.applyVoidWithListener(obj, this, MiniAppMainInitModule.class, "3")) {
                      e.h(new v(System.currentTimeMillis()), "downloadMiniSo", false);
                      PatchProxy.onMethodExit(MiniAppMainInitModule.class, "3");
                   }
                label_008b :
                   this.r = true;
                }catch(java.lang.Exception e0){
                }
             }
          }
       }
    }
    public void l0(Activity p0,Bundle p1){
    }
    public void n(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, MiniAppMainInitModule.class, "5")) {
          return;
       }
       g og = d.a(0x6ea0c3d0);
       if (!PatchProxy.applyVoidWithListener(objArray, this, MiniAppMainInitModule.class, "8")) {
          String str = "miniapp";
          boolean b = g.d(str);
          d.c("miniapp intercept page: registerPluginLink MiniAppIsPlugin->"+b);
          if (b) {
             PluginManager.H.P(str, 1);
          }
          PatchProxy.onMethodExit(MiniAppMainInitModule.class, "8");
       }
       if (!og.gl()) {
          PatchProxy.onMethodExit(MiniAppMainInitModule.class, "5");
          return;
       }else {
          og.E40();
          PatchProxy.onMethodExit(MiniAppMainInitModule.class, "5");
          return;
       }
    }
    public int priority(){
       return 100;
    }
}
