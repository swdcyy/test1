package com.yxcorp.gifshow.tti.module.MiniSetInitModule$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.tti.module.MiniSetInitModule;
import java.lang.Object;
import sjc.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.sdk.switchconfig.a;
import wkd.b;
import com.yxcorp.gifshow.w;
import cc6.b;
import java.util.Iterator;
import java.lang.Iterable;
import com.google.gson.JsonObject;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExceptionEvent;
import com.google.gson.JsonElement;
import kotlin.jvm.internal.a;
import o56.a;
import k2b.u1;
import java.lang.Exception;
import c76.b;
import c76.a;
import io7.a;

public final class MiniSetInitModule$a implements Runnable	// class@001dbf
{
    public final MiniSetInitModule b;

    public void MiniSetInitModule$a(MiniSetInitModule p0){
       this.b = p0;
       super();
    }
    public final void run(){
       String str2;
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MiniSetInitModule$a.class, "1")) {
          return;
       }
       MiniSetInitModule$a tb = this.b;
       Objects.requireNonNull(tb);
       boolean b = -1343064608;
       if (!PatchProxy.applyVoid(objArray, tb, MiniSetInitModule.class, "2")) {
          str2 = "minisetflag";
          if (a.t().d("launchOptimizeMiniSetAttachBaseContext", false)) {
             b.a(b).o(str2);
          }else {
             b.a(b).K(str2);
          }
       }
       tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, MiniSetInitModule.class, "4")) {
          str2 = "keyconfig";
          if (a.t().d("KeyconfigStagOptimize", false)) {
             b.a(b).o(str2);
          }else {
             b.a(b).K(str2);
          }
       }
       tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, MiniSetInitModule.class, "8")) {
          str2 = "feedstagflag";
          if (a.t().d("FeedStagOptimize", false)) {
             b.a(b).o(str2);
          }else {
             b.a(b).K(str2);
          }
       }
       tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, MiniSetInitModule.class, "5")) {
          b.a(b).o("universal_receiver");
       }
       tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, MiniSetInitModule.class, "6")) {
          str2 = "async_universal_receiver";
          if (a.t().d("isAsyncUniversalReceiver", false)) {
             b.a(b).o(str2);
          }else {
             b.a(b).K(str2);
          }
       }
       tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, MiniSetInitModule.class, "3")) {
          str2 = "preloadsp";
          if (a.t().d("LaunchOptPreloadMMKV", false)) {
             b.a(b).o(str2);
          }else {
             b.a(b).K(str2);
          }
       }
       tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, MiniSetInitModule.class, "7")) {
          str2 = "async_elastic_fixed_thread";
          if (!b.a && a.t().d("isEnableElasticFixedThread", true)) {
             b.a(b).o(str2);
          }else {
             b.a(b).K(str2);
          }
       }
       tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, MiniSetInitModule.class, "9")) {
          b.a(b).o("disable_class_verify");
       }
       tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, MiniSetInitModule.class, "10")) {
          str2 = "smart_analysis";
          if (a.t().d("SmartAnalysis", false)) {
             b.a(b).o(str2);
          }else {
             b.a(b).K(str2);
          }
       }
       tb = this.b;
       Objects.requireNonNull(tb);
       String str = "11";
       if (!PatchProxy.applyVoid(objArray, tb, MiniSetInitModule.class, str)) {
          str2 = "useDeviceBenchmarkLowPhone";
          if (a.t().d("UseDeviceBenchmarkLowPhone", false)) {
             b.a(b).o(str2);
          }else {
             b.a(b).K(str2);
          }
       }
       d b1 = d.b;
       Objects.requireNonNull(b1);
       if (!PatchProxy.applyVoid(objArray, b1, uod, "3")) {
          b1.h("so_preload_close");
          b1.h("so_aemon_preload");
       }
       try{
          Objects.requireNonNull(b1);
          if (!PatchProxy.applyVoid(objArray, b1, uod, str)) {
             Iterator iterator = d.a.iterator();
             while (iterator.hasNext()) {
                JsonObject jsonObject = iterator.next();
                ClientEvent$ExceptionEvent uExceptionEv = new ClientEvent$ExceptionEvent();
                uExceptionEv.flag = "so_preload";
                JsonElement jsonElement = jsonObject.e0("type");
                a.o(jsonElement, "it[\"type\"]");
                uExceptionEv.message = jsonElement.w();
                JsonElement jsonElement1 = jsonObject.e0("value");
                String str1 = (jsonElement1 != null)? jsonElement1.w(): objArray;
                uExceptionEv.extraMessage = str1;
                uExceptionEv.type = 2;
                str1 = a.r;
                str2 = "";
                if (str1 == null) {
                   str1 = str2;
                }
                uExceptionEv.androidPatchBaseVersion = str1;
                str1 = a.o;
                if (str1 != null) {
                   str2 = str1;
                }
                uExceptionEv.androidPatchVersion = str2;
                u1.P(uExceptionEv);
             }
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       b c = b.c;
       Objects.requireNonNull(c);
       b uob = b.class;
       if (!PatchProxy.applyVoid(objArray, c, uob, "2") && !PatchProxy.applyVoidOneRefs("dynamicPreInit", c, uob, "3")) {
          c.c("dynamicPreInit", a.t().d("dynamicPreInit", false));
          a.t().p("dynamicPreInit", new a("dynamicPreInit"));
       }
       return;
    }
}
