package com.kuaishou.krn.bundle.preload.KrnReactRootPreloadManager;
import java.util.concurrent.CopyOnWriteArraySet;
import java.lang.Object;
import java.lang.String;
import gj0.d;
import fk0.a;
import com.kuaishou.krn.instance.BaseJsExecutorType$Type;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.krn.c;
import android.content.Context;
import java.io.File;
import wj0.a;
import com.facebook.react.bridge.JavaScriptExecutor$Type;
import wj0.a$a;
import java.lang.Enum;
import com.facebook.react.modules.diskcache.MetaDiskCache;
import java.lang.Boolean;
import com.facebook.base.cityhash.CityHash;
import ta.d;
import java.lang.StringBuilder;
import com.facebook.cache.common.CacheEventListener;
import com.facebook.cache.common.CacheErrorLogger;
import ua.a$b;
import ua.a;
import com.facebook.react.modules.diskcache.e;
import java.util.Objects;
import com.facebook.cache.common.CacheKey;
import ne.a;
import ne.k;
import cb.a;
import com.facebook.cache.disk.f;
import com.facebook.cache.common.CacheErrorLogger$CacheErrorCategory;
import java.lang.Throwable;
import com.kuaishou.krn.instance.JsExecutorConfig;
import kotlin.jvm.internal.a;
import java.util.HashMap;
import bk0.j;

public class KrnReactRootPreloadManager	// class@00083f
{
    public static final CopyOnWriteArraySet a;

    static {
       KrnReactRootPreloadManager.a = new CopyOnWriteArraySet();
    }
    public void KrnReactRootPreloadManager(){
       super();
    }
    public static void a(String p0,d p1,a p2,BaseJsExecutorType$Type p3,List p4){
       boolean b;
       d uod1;
       JsExecutorConfig jsExecutorCo;
       HashMap hashMap;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       object oobject4 = p4;
       d uod = d.class;
       KrnReactRootPreloadManager krnReactRoot = KrnReactRootPreloadManager.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       int i = 0;
       int i1 = 2;
       if (PatchProxy.isSupport(krnReactRoot)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,oobject3,oobject4};
          if (PatchProxy.applyVoid(objArray, null, krnReactRoot, "4")) {
             return;
          }
       }
       Context uContext = c.b().d();
       String absolutePath = oobject2.a.getAbsolutePath();
       String str = "2";
       JavaScriptExecutor$Type type = PatchProxy.applyOneRefs(oobject3, null, a.class, str);
       if (type != patchProxyRe) {
       }else {
          int i2 = a$a.a[p3.ordinal()];
          if (i2 != 1) {
             type = (i2 != i1)? JavaScriptExecutor$Type.UNKNOWN: JavaScriptExecutor$Type.V8_LITE;
          }else {
             type = JavaScriptExecutor$Type.V8;
          }
       }
       String obj = type;
       String str1 = str;
       d obj1 = PatchProxy.applyThreeRefs(uContext, absolutePath, obj, null, MetaDiskCache.class, "3");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          obj1 = new d(CityHash.jniCityHash32(absolutePath)+"_"+obj.toString());
          String absolutePath1 = uContext.getFilesDir().getAbsolutePath();
          MetaDiskCache metaDiskCach = MetaDiskCache.c(MetaDiskCache.a(absolutePath1, null, null).a(), absolutePath1, null);
          Objects.requireNonNull(metaDiskCach);
          MetaDiskCache metaDiskCach1 = MetaDiskCache.class;
          obj = PatchProxy.applyOneRefs(obj1, metaDiskCach, metaDiskCach1, "10");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(metaDiskCach.b(obj1)){
             a obj2 = PatchProxy.applyOneRefs(obj1, metaDiskCach, metaDiskCach1, "15");
             if (obj2 != patchProxyRe) {
                b = obj2.booleanValue();
             }else {
                obj2 = metaDiskCach.e.a(obj1);
                if (obj2 != null) {
                   obj2.close();
                   a.n(MetaDiskCache.k, "Found entry for %s in staging area", obj1.a());
                }else {
                   Class k = MetaDiskCache.k;
                   obj = obj1.a();
                   try{
                      a.n(k, "Did not find entry for %s in staging area", obj);
                      b = metaDiskCach.a.j(obj1);
                   }catch(java.lang.Exception e0){
                      metaDiskCach.i.a(CacheErrorLogger$CacheErrorCategory.GENERIC_IO, MetaDiskCache.k, "checkInStagingAreaAndFileCache", e0);
                      b = false;
                   }
                }
             }
          }
          b = true;
       }
    }
}
