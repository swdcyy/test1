package com.kwai.plugin.dva.feature.core.receiver.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import android.content.Context;
import qj7.h;
import qj7.g;
import com.kwai.plugin.dva.feature.core.receiver.a$b;
import com.kwai.plugin.dva.feature.core.receiver.a$a;
import java.lang.Long;
import java.lang.StringBuilder;
import qj7.d;
import java.util.Map;
import java.util.Objects;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import xi7.b;
import android.os.Handler;
import java.lang.Runnable;
import qrd.l1;
import android.content.Intent;
import xi7.a;
import android.os.Looper;
import java.lang.Throwable;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.install.b;
import com.kwai.plugin.dva.work.c;
import com.kwai.plugin.dva.feature.core.receiver.a$c;
import com.kwai.plugin.dva.work.c$c;

public final class a	// class@000e74
{
    public static final a a;
    public static Context b;
    public static Map c;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final boolean a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.g(this.b(), p0);
    }
    public final String b(){
       Object[] objArray = null;
       Context obj = PatchProxy.apply(objArray, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.b;
       if (obj == null) {
          a.S("sApp");
       }else {
          objArray = obj;
       }
       String str = g.a(h.a(objArray));
       a.o(str, "trimProcessName\(fullProcessName\)");
       return str;
    }
    public final void c(Context p0,String p1,String p2,a$b p3,long p4){
       a$a a;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       a$a uoa = a$a.class;
       a uoa1 = a.class;
       if (PatchProxy.isSupport(uoa1)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,oobject3,Long.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uoa1, "4")) {
             return;
          }
       }
       a.p(p0, "context");
       a.p(oobject1, "feature");
       a.p(oobject2, "targetProcess");
       a.p(oobject3, "callback");
       d.a("cur process="+this.b()+", sendBroadcastToInstallFeature, f="+oobject1+" p="+oobject2);
       Map c = a.c;
       Map map = null;
       if (c == null) {
          a.S("sProcessToReceiverMap");
          c = map;
       }
       Class uClass = c.get(oobject2);
       Map c1 = a.c;
       if (c1 == null) {
          a.S("sProcessToReceiverMap");
          c1 = map;
       }
       Class uClass1 = c1.get(this.b());
       if (uClass == null || uClass1 == null) {
          a uoa2 = new a(oobject3);
          if (!PatchProxy.applyVoidOneRefs(uoa2, this, uoa1, "11")) {
             if (a.g(Looper.myLooper(), Looper.getMainLooper())) {
                uoa2.run();
             }else {
                a$a.a.a().post(uoa2);
             }
          }
          StringBuilder str = "cur receiver=";
          String str1 = (uClass1 == null)? "null": uClass1;
          str = str+str1+", target receiver=";
          if (uClass1 == null) {
             uClass1 = "null";
          }
          d.c(str+uClass1);
          return;
       }else {
          a = a$a.a;
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoidTwoRefs(oobject1, oobject3, a, uoa, "3")) {
             a.p(oobject1, "feature");
             a.p(oobject3, "callback");
             HashMap c4 = a$a.c;
             _monitor_enter(c4);
             if (c4.get(oobject1) == null) {
                c4.put(oobject1, new ArrayList());
             }
             Object obj1 = c4.get(oobject1);
             a.m(obj1);
             obj1.add(oobject3);
             _monitor_exit(c4);
          }
          b uob = new b(oobject3);
          a.a().postDelayed(uob, p4);
          if (!PatchProxy.applyVoidTwoRefs(oobject3, uob, a, uoa, "1")) {
             a.p(oobject3, "callback");
             a.p(uob, "task");
             HashMap c3 = a$a.c;
             _monitor_enter(c3);
             a$a.d.put(oobject3, uob);
             _monitor_exit(c3);
          }
          if (!PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "5")) {
             Map c2 = a.c;
             if (c2 == null) {
                a.S("sProcessToReceiverMap");
             }else {
                map = c2;
             }
             String obj = map.get(oobject2);
             a.m(obj);
             Intent intent = new Intent(p0, obj);
             intent.putExtra("broadcast_type", 1);
             intent.putExtra("feature_name", oobject1);
             obj = this.b();
             intent.putExtra("sender_process", obj);
             intent.putExtra("receiver_process", oobject2);
             if (a.g(obj, oobject2)) {
                this.e(intent);
             }else {
                p0.sendBroadcast(intent);
             }
          }
          return;
       }
    }
    public final void d(String p0,String p1,boolean p2,String p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), p3, this, a.class, "8")) {
          return;
       }
       a.p(p0, "feature");
       a.p(p1, "targetProcess");
       a.p(p3, "errorMsg");
       d.a("receiver\("+this.b()+"\): sendInstallationResultBroadcast, f="+p0+" result="+p2);
       Context b = a.b;
       Context uContext = null;
       if (b == null) {
          a.S("sApp");
          b = uContext;
       }
       Map c = a.c;
       if (c == null) {
          a.S("sProcessToReceiverMap");
          c = uContext;
       }
       Intent intent = new Intent(b, c.get(p1));
       intent.putExtra("broadcast_type", 2);
       intent.putExtra("feature_name", p0);
       intent.putExtra("sender_process", this.b());
       intent.putExtra("receiver_process", p1);
       intent.putExtra("install_feature_success", p2);
       intent.putExtra("installation_error_msg", p3);
       Context b1 = a.b;
       if (b1 == null) {
          a.S("sApp");
       }else {
          uContext = b1;
       }
       uContext.sendBroadcast(intent);
       return;
    }
    public final void e(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "7")) {
          return;
       }
       a.p(p0, "intent");
       String str = "receiver\(";
       d.a(str+this.b()+"\): startInstallFeature");
       String stringExtra = p0.getStringExtra("receiver_process");
       if (!this.a(stringExtra)) {
          d.c(str+this.b()+"\), but receive process="+stringExtra);
          return;
       }else {
          stringExtra = p0.getStringExtra("feature_name");
          a.m(stringExtra);
          a.o(stringExtra, "intent.getStringExtra\(FEATURE_NAME_EXTRA\)!!");
          String stringExtra1 = p0.getStringExtra("sender_process");
          if (stringExtra1 == null) {
             stringExtra1 = "";
          }
          d.a(str+this.b()+"\), start install feature, f="+stringExtra);
          Dva.instance().getPluginInstallManager().j(stringExtra).a(new a$c(stringExtra, stringExtra1));
          return;
       }
    }
}
