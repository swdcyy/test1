package com.kwai.component.uiconfig.visitor.VisitorModeManager;
import java.util.concurrent.CopyOnWriteArrayList;
import com.kwai.component.uiconfig.visitor.VisitorModeManager$appSessionId$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import com.kwai.component.uiconfig.visitor.VisitorModeManager$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.util.rx.RxBus;
import zh5.b;
import nsd.u;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import zh5.a;
import kotlin.jvm.internal.a;
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
import com.kwai.component.uiconfig.visitor.VisitorModeManager$b;
import k2b.o0;
import java.lang.Runnable;
import t45.c;

public final class VisitorModeManager	// class@000ab3
{
    public static final CopyOnWriteArrayList a;
    public static final p b;
    public static String c;
    public static int d;
    public static boolean e;
    public static boolean f;
    public static Boolean g;
    public static final VisitorModeManager h;

    static {
       VisitorModeManager.h = new VisitorModeManager();
       VisitorModeManager.a = new CopyOnWriteArrayList();
       VisitorModeManager.b = s.c(VisitorModeManager$appSessionId$2.INSTANCE);
       VisitorModeManager.c = "INITIALIZATION";
    }
    public void VisitorModeManager(){
       super();
    }
    public static final void a(VisitorModeManager$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, VisitorModeManager.class, "11")) {
          return;
       }
       if (p0 != null) {
          VisitorModeManager.a.addIfAbsent(p0);
       }
       return;
    }
    public static final void c(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, objArray, VisitorModeManager.class, "8")) {
          return;
       }
       int i = 0;
       VisitorModeManager.d = i;
       VisitorModeManager.e = true;
       VisitorModeManager.j("INITIALIZATION", i, 2, objArray);
       Iterator iterator = VisitorModeManager.a.iterator();
       while (iterator.hasNext()) {
          VisitorModeManager$a uoa = iterator.next();
          if (uoa != null) {
             uoa.b("VISITOR", VisitorModeManager.c);
          }
       }
       VisitorModeManager.h.b();
       RxBus.f.b(new b(i, i, 2, objArray));
       Iterator iterator1 = VisitorModeManager.a.iterator();
       while (iterator1.hasNext()) {
          VisitorModeManager$a uoa1 = iterator1.next();
          if (uoa1 != null) {
             uoa1.a("VISITOR", VisitorModeManager.c);
          }
       }
       return;
    }
    public static final String e(){
       return VisitorModeManager.c;
    }
    public static final boolean f(){
       boolean b = (VisitorModeManager.d)? true: false;
       return b;
    }
    public static final boolean g(int p0){
       a obj;
       VisitorModeManager visitorModeM = VisitorModeManager.class;
       if (PatchProxy.isSupport(visitorModeM)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, visitorModeM, "10");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (VisitorModeManager.f()) {
          obj = new a();
          obj.a(p0);
          RxBus.f.b(obj);
          return true;
       }else {
          return false;
       }
    }
    public static final void h(VisitorModeManager$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, VisitorModeManager.class, "12")) {
          return;
       }
       if (p0 != null) {
          CopyOnWriteArrayList a = VisitorModeManager.a;
          while (a.contains(p0)) {
             a.remove(p0);
          }
       }
       return;
    }
    public static final void i(String p0,boolean p1){
       VisitorModeManager visitorModeM = VisitorModeManager.class;
       JsonObject obj = null;
       if (PatchProxy.isSupport(visitorModeM) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), obj, visitorModeM, "6")) {
          return;
       }
       if (a.g(VisitorModeManager.c, "AUTHORIZED")) {
          return;
       }
       if (a.g(VisitorModeManager.c, p0) ^ 0x01) {
          if (!p1) {
             String c = VisitorModeManager.c;
             if (!PatchProxy.applyVoidTwoRefs(c, p0, obj, c.class, "3")) {
                a.p(c, "lastStatus");
                a.p(p0, "status");
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "PERMISSION_POPUP_CHANGE_RESULT";
                obj = new JsonObject();
                obj.a0("server_time", Long.valueOf(d.a()));
                obj.a0("client_time", Long.valueOf(System.currentTimeMillis()));
                obj.c0("app_session_id", VisitorModeManager.h.d());
                obj.c0("last_status", c);
                obj.c0("status", p0);
                uElementPack.params = obj.toString();
                c.a.a(uElementPack);
             }
          }
          VisitorModeManager.c = p0;
       }
       return;
    }
    public static void j(String p0,boolean p1,int p2,Object p3){
       if (p2 & 0x02) {
          p1 = false;
       }
       VisitorModeManager.i(p0, p1);
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, VisitorModeManager.class, "5")) {
          return;
       }
       o0 l = n.L;
       if (l instanceof b) {
          c.a(new VisitorModeManager$b(l));
       }
       return;
    }
    public final String d(){
       Object obj = PatchProxy.apply(null, this, VisitorModeManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return VisitorModeManager.b.getValue();
    }
}
