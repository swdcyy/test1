package com.yxcorp.gifshow.post.growth.GrowthGuideConfigCacheHelper;
import com.yxcorp.gifshow.post.growth.GrowthGuideConfigCacheHelper$STRING_LIST_TYPE$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.post.growth.GrowthGuideConfigCacheHelper$defaultScene$2;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.lang.Object;
import java.util.List;
import com.google.gson.JsonObject;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import fg6.a;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.Gson;
import lnc.p3;
import q87.c;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import java.lang.Long;
import com.kwai.feature.post.api.model.GrowthGuideConfig;
import wkd.b;
import kotlin.jvm.internal.a;
import com.kwai.framework.network.sntp.a;
import java.lang.System;
import lnc.d7;
import com.google.gson.JsonArray;
import msd.l;
import java.util.Iterator;
import java.lang.StringBuilder;
import lnc.s6;
import com.yxcorp.gifshow.post.growth.GrowthGuideConfigCacheHelper$preloadGuideConfig$guideCfgList$1;
import java.util.Collection;
import java.lang.Iterable;
import o16.a;
import qrd.l1;

public final class GrowthGuideConfigCacheHelper	// class@000ff7
{
    public static final p a;
    public static final p b;
    public static final List c;
    public static final CopyOnWriteArrayList d;
    public static final GrowthGuideConfigCacheHelper e;

    static {
       GrowthGuideConfigCacheHelper.e = new GrowthGuideConfigCacheHelper();
       GrowthGuideConfigCacheHelper.a = s.c(GrowthGuideConfigCacheHelper$STRING_LIST_TYPE$2.INSTANCE);
       GrowthGuideConfigCacheHelper.b = s.c(GrowthGuideConfigCacheHelper$defaultScene$2.INSTANCE);
       GrowthGuideConfigCacheHelper.c = new ArrayList();
       GrowthGuideConfigCacheHelper.d = new CopyOnWriteArrayList();
    }
    public void GrowthGuideConfigCacheHelper(){
       super();
    }
    public final List a(){
       return GrowthGuideConfigCacheHelper.c;
    }
    public final boolean b(JsonObject p0,Integer p1,String p2){
       List list;
       Long longx;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, GrowthGuideConfigCacheHelper.class, "10");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = null;
       try{
          Gson a = a.a;
          JsonElement jsonElement = p0.e0("scenes");
          Object obj1 = PatchProxy.apply(obj, this, GrowthGuideConfigCacheHelper.class, "1");
          if (obj1 != patchProxyRe) {
          }else {
             obj1 = GrowthGuideConfigCacheHelper.a.getValue();
          }
          list = a.d(jsonElement, obj1);
       }catch(java.lang.Exception e0){
          Object[] objArray = new Object[0];
          p3.D().w("PostGrowth", "sConfigMatched_json_supportScene_failure", objArray);
          PostUtils.D("GrowthGuideConfigManager", "isConfigMatched_json_supportScene_failure", e0);
          list = obj;
       }
       JsonElement jsonElement1 = p0.e0("taskType");
       Integer integer = (jsonElement1 != null)? Integer.valueOf(jsonElement1.p()): obj;
       jsonElement1 = p0.e0("unlock");
       Boolean uBoolean = (jsonElement1 != null)? Boolean.valueOf(jsonElement1.d()): obj;
       JsonElement jsonElement2 = p0.e0("expireTime");
       if (jsonElement2 != null) {
          longx = Long.valueOf(jsonElement2.t());
       }
       return this.d(integer, list, uBoolean, longx, p1, p2);
    }
    public final boolean c(GrowthGuideConfig p0,Integer p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, GrowthGuideConfigCacheHelper.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.d(Integer.valueOf(p0.getTaskType()), p0.getSupportScenes(), Boolean.valueOf(p0.getUnlockable()), Long.valueOf(p0.getExpireTime()), p1, p2);
    }
    public final boolean d(Integer p0,List p1,Boolean p2,Long p3,Integer p4,String p5){
       List list;
       boolean b1;
       Object obj = this;
       object oobject = p5;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       GrowthGuideConfigCacheHelper growthGuideC = GrowthGuideConfigCacheHelper.class;
       int i = 1;
       if (PatchProxy.isSupport(growthGuideC)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,oobject};
          Object obj1 = PatchProxy.apply(objArray, obj, growthGuideC, "9");
          if (obj1 != patchProxyRe) {
             return obj1.booleanValue();
          }
       }
       int i1 = (p0 != null)? p0.intValue(): Integer.MIN_VALUE;
       if (p1 != null) {
          list = p1;
       }else {
          list = PatchProxy.apply(null, obj, growthGuideC, "2");
          if (list == patchProxyRe) {
             list = GrowthGuideConfigCacheHelper.b.getValue();
          }
       }
       boolean b = (p2 != null)? p2.booleanValue(): false;
       int i2 = 0;
       long l = (p3 != null)? p3.longValue(): i2;
       if (PatchProxy.isSupport(growthGuideC)) {
          Object obj2 = PatchProxy.applyOneRefs(Long.valueOf(l), obj, growthGuideC, "12");
          if (obj2 != patchProxyRe) {
             b1 = obj2.booleanValue();
          }else {
          label_007f :
             Long obj3 = b.a(0x3b1f7b44);
             a.o(obj3, "Singleton.get\(HttpSntpClient::class.java\)");
             obj3 = obj3.a();
             if (obj3 == null) {
                obj3 = Long.valueOf(System.currentTimeMillis());
             }
             a.o(obj3, "Singleton.get\(HttpSntpCl¡­ystem.currentTimeMillis\(\)");
             long l1 = obj3.longValue();
             if (l - i2 && l - l1 <= 0) {
                b1 = true;
             }else {
                b1 = false;
             }
          }
       }else {
          goto label_007f ;
       }
       if (b1 || (i1 == Integer.MIN_VALUE || (p4 == null || (p4.intValue() != i1 && (!b || (!obj.e(d7.a.d(), list) || !obj.e(oobject, list))))))) {
          i = false;
       }
       return i;
    }
    public final boolean e(String p0,List p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, GrowthGuideConfigCacheHelper.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 == null || p1.contains(p0))? true: false;
       return b;
    }
    public final List f(JsonArray p0,l p1){
       ArrayList obj = PatchProxy.applyTwoRefs(p0, p1, this, GrowthGuideConfigCacheHelper.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       if (p0 != null) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             JsonElement jsonElement = iterator.next();
             try{
                Object[] objArray = new Object[0];
                p3.D().w("PostGrowth", "GrowthGuideConfigManager guide info element "+jsonElement, objArray);
                a.o(jsonElement, "element");
                if (jsonElement.E()) {
                   JsonObject jsonObject = jsonElement.r();
                   a.o(jsonObject, "element.asJsonObject");
                   if (p1.invoke(jsonObject).booleanValue()) {
                      GrowthGuideConfig growthGuideC = a.a.c(jsonElement, GrowthGuideConfig.class);
                      a.o(growthGuideC, "guideConfig");
                      obj.add(growthGuideC);
                   }
                }
             }catch(java.lang.Exception e1){
                PostUtils.D("GrowthGuideConfigManager", "loadGuideConfig_json_failure", e1);
                goto label_001a ;
             }
          }
       }
       return obj;
    }
    public final void g(JsonArray p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthGuideConfigCacheHelper.class, "15")) {
          return;
       }
       if (!s6.G()) {
          return;
       }
       List list = this.f(p0, GrowthGuideConfigCacheHelper$preloadGuideConfig$guideCfgList$1.INSTANCE);
       _monitor_enter(this);
       CopyOnWriteArrayList d = GrowthGuideConfigCacheHelper.d;
       d.clear();
       if (list.isEmpty() ^ 0x01) {
          d.addAll(list);
       }
       Iterator iterator = d.iterator();
       while (iterator.hasNext()) {
          iterator.next().getGuideItemCfgs(a.b.a());
       }
       _monitor_exit(this);
       return;
    }
}
