package com.yxcorp.gifshow.share.init.ForwardInitModule;
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
import kotlin.jvm.internal.a;
import b76.a;
import com.kwai.sharelib.KsShareApi;
import com.kwai.sharelib.InternalShareImageProcessorType;
import java.util.Objects;
import uo7.s;
import hic.b;
import com.yxcorp.gifshow.share.init.ForwardInitModule$a;
import java.lang.Runnable;
import com.kwai.framework.init.e;
import com.yxcorp.gifshow.share.init.ForwardInitModule$b;
import java.util.concurrent.Callable;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.share.init.ForwardInitModule$c;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.kwai.kwaishare.kit.ShareKitConfig;
import wkd.b;
import mhc.y;
import mhc.f2;
import o56.a;
import java.lang.StringBuilder;
import o56.c;
import android.app.Application;
import hic.c;
import hic.a;
import fz6.c;
import com.google.gson.JsonObject;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;
import com.google.gson.JsonElement;
import com.kwai.sharelib.apiservice.KsDefaultMgr;
import com.kwai.sharelib.apiservice.KsDefaultMgr$Companion;

public final class ForwardInitModule extends a	// class@001bc4
{
    public boolean q;

    public void ForwardInitModule(){
       super();
    }
    public boolean C(){
       return true;
    }
    public int f0(){
       return 13;
    }
    public List g(){
       Class[] obj = PatchProxy.apply(null, this, ForwardInitModule.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{CoreInitModule.class};
       ArrayList uArrayList = Lists.e(obj);
       a.o(uArrayList, "Lists.newArrayList\(CoreInitModule::class.java\)");
       return uArrayList;
    }
    public void i0(){
       if (PatchProxy.applyVoid(null, this, ForwardInitModule.class, "4")) {
          return;
       }
       if (this.q != null) {
          this.l0();
       }
       return;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ForwardInitModule.class, "3")) {
          return;
       }
       KsShareApi s = KsShareApi.s;
       InternalShareImageProcessorType fRESCO = InternalShareImageProcessorType.FRESCO;
       Objects.requireNonNull(s);
       if (PatchProxy.applyOneRefs(fRESCO, s, KsShareApi.class, "20") != PatchProxyResult.class) {
       }else {
          a.p(fRESCO, "imageProcessorType");
          KsShareApi.o = fRESCO.toProcessor$kwaisharelib_release();
       }
       Objects.requireNonNull(s);
       KsShareApi.p = new b();
       e.g(new ForwardInitModule$a(this), "ForwardInitModule");
       return;
    }
    public final void l0(){
       if (PatchProxy.applyVoid(null, this, ForwardInitModule.class, "6")) {
          return;
       }
       t.fromCallable(ForwardInitModule$b.b).subscribeOn(d.c).subscribe(new ForwardInitModule$c(this), Functions.d());
       return;
    }
    public void n(){
       Application b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ForwardInitModule.class, "1")) {
          return;
       }
       ShareKitConfig shareKitConf = ShareKitConfig.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (!PatchProxy.applyVoid(objArray, this, ForwardInitModule.class, "2")) {
          int i = 0x91df3e4;
          f2 obj = b.a(i);
          a.o(obj, "Singleton.get\(ForwardService::class.java\)");
          obj = obj.a();
          ShareKitConfig k = ShareKitConfig.k;
          b = a.B;
          String str = "AppEnv.APP";
          a.o(b, str);
          Objects.requireNonNull(k);
          Object obj1 = PatchProxy.applyOneRefs(b, k, shareKitConf, "9");
          if (obj1 != patchProxyRe) {
             k = obj1;
          }else {
             a.p(b, "app");
             ShareKitConfig.a = b;
          }
          String str1 = obj.c();
          a.o(str1, "tencentAppId");
          Objects.requireNonNull(k);
          obj1 = PatchProxy.applyOneRefs(str1, k, shareKitConf, "11");
          String str2 = "appId";
          if (obj1 != patchProxyRe) {
             k = obj1;
          }else {
             a.p(str1, str2);
             ShareKitConfig.c = str1;
          }
          str1 = obj.d();
          a.o(str1, "weiboAppId");
          Objects.requireNonNull(k);
          obj1 = PatchProxy.applyOneRefs(str1, k, shareKitConf, "12");
          if (obj1 != patchProxyRe) {
             k = obj1;
          }else {
             a.p(str1, str2);
             ShareKitConfig.d = str1;
          }
          String str3 = obj.f();
          a.o(str3, "defaultWechatAppId");
          ShareKitConfig shareKitConf1 = k.g(str3);
          c uoc = a.a();
          a.o(uoc, "AppEnv.get\(\)");
          b = uoc.a();
          a.o(b, "AppEnv.get\(\).appContext");
          String str4 = b.getPackageName()+".fileprovider";
          Objects.requireNonNull(shareKitConf1);
          str1 = "15";
          if (PatchProxy.applyOneRefs(str4, shareKitConf1, shareKitConf, str1) != patchProxyRe) {
          }else {
             a.p(str4, "fileProvider");
             ShareKitConfig.h = str4;
          }
          KsShareApi s = KsShareApi.s;
          str3 = a.A;
          a.o(str3, "AppEnv.KPF");
          str4 = a.x;
          a.o(str4, "AppEnv.KPN");
          Application b1 = a.B;
          a.o(b1, str);
          c uoc1 = new c();
          a uoa = new a();
          Objects.requireNonNull(s);
          if (PatchProxy.isSupport(KsShareApi.class)) {
             Object[] objArray1 = new Object[]{str3,str4,b1,uoc1,uoa};
             Object obj2 = PatchProxy.apply(objArray1, s, KsShareApi.class, str1);
             if (obj2 != patchProxyRe) {
                s = obj2;
             label_0139 :
                c uoc2 = a.a();
                a.o(uoc2, "AppEnv.get\(\)");
                s.m(uoc2.c());
                f2 obj3 = b.a(i);
                a.o(obj3, "Singleton.get\(ForwardService::class.java\)");
                obj3 = obj3.a();
                a.o(obj3, "Singleton.get\(ForwardSer¡­::class.java\).shareConfig");
                c.a = obj3.f();
             }
          }
          a.p(str3, "kpf");
          a.p(str4, "kpn");
          a.p(b1, "app");
          a.p(uoc1, "clientParam");
          a.p(uoa, "userInfo");
          KsShareApi.i = str3;
          KsShareApi.j = str4;
          KsShareApi.a = b1;
          KsShareApi.m = uoc1;
          KsShareApi.k = uoa;
          goto label_0139 ;
       }
       return;
    }
    public final void n0(JsonObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ForwardInitModule.class, "8")) {
          return;
       }
       if (p0 != null) {
          Set set = p0.w0();
          if (set != null) {
             Iterator iterator = set.iterator();
             while (iterator.hasNext()) {
                String str = iterator.next();
                JsonElement jsonElement = p0.e0(str);
                if (jsonElement != null) {
                   String str1 = jsonElement.toString();
                   if (str1 != null) {
                      a.o(str1, "it");
                      a.o(str, "subBiz");
                      KsDefaultMgr.c.d(str1, str);
                   }
                }
             }
          }
       }
       return;
    }
}
