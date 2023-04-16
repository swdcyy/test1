package com.kwai.component.uiconfig.browsestyle.BrowseSettingsInitModule;
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
import com.yxcorp.gifshow.util.rx.RxBus;
import zca.r;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import uh5.c;
import erd.g;
import crd.b;
import zh5.b;
import uh5.d;
import eda.n;
import uh5.b;
import eda.l;
import uh5.a;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import qe6.b;
import zh5.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import yb6.d;
import java.lang.Long;
import java.lang.Number;
import java.lang.System;
import com.google.gson.JsonElement;
import com.yxcorp.gifshow.log.n;
import com.kwai.framework.logger.config.b;
import com.kwai.component.uiconfig.browsestyle.a;
import java.lang.Runnable;
import t45.c;

public class BrowseSettingsInitModule extends a	// class@000bd2
{
    public static final int q;

    public void BrowseSettingsInitModule(){
       super();
    }
    public int f0(){
       return 5;
    }
    public List g(){
       Class[] obj = PatchProxy.apply(null, this, BrowseSettingsInitModule.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{CoreInitModule.class};
       return Lists.e(obj);
    }
    public void n(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, BrowseSettingsInitModule.class, "1")) {
          return;
       }
       RxBus f = RxBus.f;
       RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
       f.h(r.class, mAIN, Integer.MAX_VALUE).subscribe(new c(this));
       f.h(b.class, mAIN, Integer.MAX_VALUE).subscribe(new d(this));
       f.h(n.class, mAIN, Integer.MAX_VALUE).subscribe(new b(this));
       f.h(l.class, mAIN, Integer.MAX_VALUE).subscribe(new a(this));
       if (!PatchProxy.applyVoid(objArray, objArray, VisitorModeManager.class, "3")) {
          String str = (b.a())? "AUTHORIZED": "INITIALIZATION";
          VisitorModeManager.i(str, true);
          if (!PatchProxy.applyVoid(objArray, objArray, c.class, "2")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "PERMISSION_POPUP_ISSUE_RESULT";
             JsonObject jsonObject = new JsonObject();
             jsonObject.a0("server_time", Long.valueOf(d.a()));
             jsonObject.a0("client_time", Long.valueOf(System.currentTimeMillis()));
             jsonObject.c0("app_session_id", VisitorModeManager.h.d());
             jsonObject.c0("status", VisitorModeManager.e());
             uElementPack.params = jsonObject.toString();
             c.a.a(uElementPack);
          }
          VisitorModeManager.h.b();
       }
       if (n.L instanceof b) {
          c.a(a.b);
       }
       return;
    }
}
