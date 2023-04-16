package com.yxcorp.gifshow.init.module.GiftStoreInitModule;
import com.kwai.framework.init.TTIInitModule;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import tkd.b;
import tkd.d;
import os5.l;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.init.CoreInitModule;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import android.app.Activity;
import b76.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.yxcorp.gifshow.tti.module.ResourceDownloadInitModule$c;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import sxa.m;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.tti.module.ResourceDownloadInitModule$a;
import sxa.n;
import java.lang.Runnable;
import com.kwai.framework.init.c;
import com.yxcorp.gifshow.tti.module.MagicEmojiInitModule;

public class GiftStoreInitModule extends TTIInitModule	// class@001982
{
    public static boolean q;
    public static boolean r;

    public void GiftStoreInitModule(){
       super();
    }
    public static void n0(RequestTiming p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, null, GiftStoreInitModule.class, "5")) {
          return;
       }
       if (QCurrentUser.ME.isLogined()) {
          d.a(-1492894991).na(p0);
       }
       PatchProxy.onMethodExit(GiftStoreInitModule.class, "5");
       return;
    }
    public int f0(){
       return 3;
    }
    public List g(){
       Class[] obj = PatchProxy.applyWithListener(null, this, GiftStoreInitModule.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{CoreInitModule.class};
       PatchProxy.onMethodExit(GiftStoreInitModule.class, "7");
       return Lists.e(obj);
    }
    public void j0(Activity p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, GiftStoreInitModule.class, "2")) {
          return;
       }
       GiftStoreInitModule.r = true;
       PatchProxy.onMethodExit(GiftStoreInitModule.class, "2");
       return;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, GiftStoreInitModule.class, "1")) {
          return;
       }
       RxBus.f.g(ResourceDownloadInitModule$c.class, RxBus$ThreadMode.MAIN).subscribe(new m(this));
       PatchProxy.onMethodExit(GiftStoreInitModule.class, "1");
       return;
    }
    public void onResourceConfigEvent(ResourceDownloadInitModule$c p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, GiftStoreInitModule.class, "4")) {
          return;
       }
       if (GiftStoreInitModule.r) {
          PatchProxy.onMethodExit(GiftStoreInitModule.class, "4");
          return;
       }else {
          ResourceDownloadInitModule$a a = p0.a.a;
          GiftStoreInitModule.q = a;
          if (a == null) {
             PatchProxy.onMethodExit(GiftStoreInitModule.class, "4");
             return;
          }else {
             c.b(new n(p0));
             MagicEmojiInitModule.onResourceConfigEvent(p0);
             PatchProxy.onMethodExit(GiftStoreInitModule.class, "4");
             return;
          }
       }
    }
}
