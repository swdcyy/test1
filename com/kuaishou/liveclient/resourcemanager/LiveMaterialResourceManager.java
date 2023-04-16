package com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceManager;
import ftd.k0;
import com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceManager$a;
import nsd.u;
import kotlin.LazyThreadSafetyMode;
import com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceManager$Companion$instance$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import com.kuaishou.liveclient.resourcemanager.apiservices.model.MaterialDetailExtraInfo;
import java.io.File;
import hr3.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import hr3.b;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import gr3.a;
import gr3.a$a;
import com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceLocalFileManager;
import com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceLocalFileManager$a;
import com.kuaishou.liveclient.resourcemanager.cache.LiveMaterialResourceInfoRepo;
import com.kuaishou.liveclient.resourcemanager.cache.LiveMaterialResourceInfoRepo$a;
import com.kuaishou.liveclient.resourcemanager.apiservices.model.MaterialDetailInfoItem;
import java.lang.Integer;
import zq3.b;
import zq3.a;
import java.util.Map;
import com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceManager$loadResourceById$1;
import asd.c;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import ftd.z1;
import kotlinx.coroutines.a;
import fr3.a;
import fr3.b;
import java.util.Objects;
import com.kuaishou.liveclient.resourcemanager.keymanage.LiveMaterialResKeyInfo;
import er3.a;
import java.util.HashMap;
import java.lang.Boolean;
import android.content.SharedPreferences;
import java.lang.Throwable;
import com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceManager$c;
import java.lang.Runnable;
import ekd.k1;
import com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceManager$d;
import com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceManager$preloadResource$1;
import kotlinx.coroutines.CoroutineDispatcher;
import ftd.z0;
import com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceManager$b;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlin.coroutines.CoroutineContext$b;
import asd.a;

public final class LiveMaterialResourceManager implements k0	// class@001054
{
    public ConcurrentHashMap b;
    public static final p c;
    public static final LiveMaterialResourceManager$a d;

    static {
       LiveMaterialResourceManager.d = new LiveMaterialResourceManager$a(null);
       LiveMaterialResourceManager.c = s.b(LazyThreadSafetyMode.SYNCHRONIZED, LiveMaterialResourceManager$Companion$instance$2.INSTANCE);
    }
    public void LiveMaterialResourceManager(){
       super();
       this.b = new ConcurrentHashMap();
    }
    public void LiveMaterialResourceManager(u p0){
       super();
       this.b = new ConcurrentHashMap();
    }
    public final a a(MaterialDetailExtraInfo p0,File p1){
       String absolutePath;
       b uob;
       a obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveMaterialResourceManager.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       if (p0 == null) {
          return obj;
       }
       File[] uFileArray = p1.listFiles();
       String separator = File.separator;
       File uFile = new File(p1.getAbsolutePath()+separator+p0.a());
       if (p1.exists() && p1.isDirectory()) {
          int i = 0;
          if (uFileArray != null) {
             boolean b = (!uFileArray.length)? true: false;
             if (!b) {
             label_0051 :
                if (!i && uFile.exists()) {
                   if (p0.fileType == 1) {
                      absolutePath = p1.getAbsolutePath();
                      a.o(absolutePath, "folderFile.absolutePath");
                      uob = new b(p1.getAbsolutePath()+separator+p0.a(), absolutePath);
                   }else {
                      String absolutePath1 = uFile.getAbsolutePath();
                      a.o(absolutePath1, "targetFile.absolutePath");
                      uob = new a(absolutePath1);
                   }
                }
             }
          }
          i = 1;
          goto label_0051 ;
       }
    label_0095 :
       return obj;
    }
    public final a b(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveMaterialResourceManager liveMaterial = LiveMaterialResourceManager.class;
       LiveMaterialResourceLocalFileManager$a obj = PatchProxy.applyOneRefs(p0, this, liveMaterial, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "resourceId");
       int i = 1;
       int i1 = 0;
       obj = (!p0.length())? 1: null;
       int i2 = 2;
       a uoa = null;
       if (obj) {
          a.a.e(p0, i2);
          return uoa;
       }else {
          File uFile = new File(LiveMaterialResourceLocalFileManager.d.a().b(p0));
          MaterialDetailInfoItem materialDeta = LiveMaterialResourceInfoRepo.i.a().d(p0);
          MaterialDetailExtraInfo extParams = (materialDeta != null)? materialDeta.getExtParams(): uoa;
          a uoa1 = this.a(extParams, uFile);
          if (uoa1 != null) {
             a.a.e(p0, i1);
          }else {
             a.a.e(p0, i2);
             if (PatchProxy.isSupport(liveMaterial) && PatchProxy.applyThreeRefs(p0, null, Integer.valueOf(i), this, LiveMaterialResourceManager.class, "7") != patchProxyRe) {
             }else {
                b uob = new b(uoa);
                this.b.put(uob.c(), uob);
                LiveMaterialResourceManager liveMaterial1 = this;
                super(liveMaterial1, p0, uob, 1, null);
                a.f(liveMaterial1, 0, 0, this, 3, 0);
             }
          }
          return uoa1;
       }
    }
    public final a c(String p0){
       LiveMaterialResKeyInfo mResId;
       boolean b;
       a uoa = a.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a obj = PatchProxy.applyOneRefs(p0, this, LiveMaterialResourceManager.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "resourceKey");
       Object[] objArray = null;
       obj = PatchProxy.apply(objArray, objArray, uoa, "1");
       if (obj != patchProxyRe) {
       }else if(a.c == null){
          _monitor_enter(uoa);
          if (a.c == null) {
             obj = new a();
             a.c = obj;
             b.a(obj);
          }
          _monitor_exit(uoa);
       }
       obj = a.c;
       Objects.requireNonNull(obj);
       String str = "2";
       SharedPreferences obj1 = PatchProxy.applyOneRefs(p0, obj, uoa, str);
       if (obj1 != patchProxyRe) {
          objArray = obj1;
       }else if(a.b()){
          objArray = obj.a.get(p0);
       }else {
          obj1 = PatchProxy.apply(objArray, objArray, a.class, str);
          b = false;
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else {
             obj1 = a.a;
             if (obj1 != null) {
                b = obj1.getBoolean("enable_test", b);
             }
          }
          if (!b) {
             objArray = obj.b.get(p0);
          }
       }
       if (objArray != null) {
          mResId = objArray.mResId;
          if (mResId != null) {
          label_0089 :
             return this.b(mResId);
          }
       }
       mResId = "";
       goto label_0089 ;
    }
    public final void d(b p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveMaterialResourceManager.class, "9")) {
          return;
       }
       k1.o(new LiveMaterialResourceManager$c(this, p0, p1, p2));
       return;
    }
    public final void e(b p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveMaterialResourceManager.class, "8")) {
          return;
       }
       k1.o(new LiveMaterialResourceManager$d(this, p0, p1));
       return;
    }
    public final void f(int p0){
       LiveMaterialResourceManager liveMaterial = LiveMaterialResourceManager.class;
       if (PatchProxy.isSupport(liveMaterial) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, liveMaterial, "10")) {
          return;
       }
       a.f(this, null, null, new LiveMaterialResourceManager$preloadResource$1(p0, null), 3, null);
       return;
    }
    public final void g(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMaterialResourceManager.class, "11")) {
          return;
       }
       a.p(p0, "listenerId");
       b uob = this.b.get(p0);
       if (uob != null) {
          uob.b = null;
       }
       this.b.remove(p0);
       return;
    }
    public CoroutineContext getCoroutineContext(){
       Object obj = PatchProxy.apply(null, this, LiveMaterialResourceManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return z0.f().plus(new LiveMaterialResourceManager$b(CoroutineExceptionHandler.u0));
    }
}
