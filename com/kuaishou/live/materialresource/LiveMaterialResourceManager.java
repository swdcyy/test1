package com.kuaishou.live.materialresource.LiveMaterialResourceManager;
import rf3.a;
import com.kuaishou.live.materialresource.LiveMaterialResourceManager$resRepo$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import o56.c;
import o56.a;
import kotlin.jvm.internal.a;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.Enum;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import com.kuaishou.live.materialresource.ResourceIdMap;
import java.util.HashMap;
import java.lang.Throwable;
import java.io.File;
import k80.c;
import android.content.Context;
import c0d.a;
import rf3.e;
import jb7.a;
import crd.b;
import rf3.f;
import io.reactivex.g;
import brd.t;
import brd.z;
import lrd.b;
import io.reactivex.android.schedulers.a;
import rf3.g;
import rf3.h;
import rf3.i;
import erd.g;
import erd.a;
import java.lang.Boolean;
import com.kwai.middleware.resourcemanager.cache.type.CachePolicy;
import jb7.b;
import com.kwai.middleware.resourcemanager.cache.BaseResourceCacheRepo;
import rf3.b;
import rf3.c;

public final class LiveMaterialResourceManager	// class@000c91
{
    public static boolean a;
    public static b b;
    public static final a c;
    public static final p d;
    public static e e;
    public static File f;
    public static ResourceIdMap g;
    public static final LiveMaterialResourceManager h;

    static {
       LiveMaterialResourceManager.h = new LiveMaterialResourceManager();
       LiveMaterialResourceManager.c = new a();
       LiveMaterialResourceManager.d = s.c(LiveMaterialResourceManager$resRepo$2.INSTANCE);
    }
    public void LiveMaterialResourceManager(){
       super();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, LiveMaterialResourceManager.class, "15")) {
          return;
       }
       if (!LiveMaterialResourceManager.a) {
          LiveLogTag lIVE_MATERIA = LiveLogTag.LIVE_MATERIAL_RES;
          b.B(lIVE_MATERIA, "need initialized");
          c uoc = a.a();
          a.o(uoc, "AppEnv.get\(\)");
          if (uoc.c()) {
             throw new IllegalStateException(lIVE_MATERIA.name()+" is not initialized");
          }
       }
       return;
    }
    public final String b(String p0,String p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveLogTag obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveMaterialResourceManager.class, "7");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "packId");
       a.p(p1, "resName");
       obj = LiveLogTag.LIVE_MATERIAL_RES;
       b.Z(obj, "fetch: "+p0+' '+p1);
       this.a();
       ResourceIdMap g = LiveMaterialResourceManager.g;
       if (g == null) {
          a.S("resIdMap");
       }
       Objects.requireNonNull(g);
       Object obj1 = PatchProxy.applyOneRefs(p0, g, ResourceIdMap.class, "3");
       if (obj1 != patchProxyRe) {
       }else {
          a.p(p0, "id");
          obj1 = g.a.get(p0);
       }
       Object obj2 = obj1;
       if (obj2 == null) {
          b.G(obj, "fetch res failed: id not found", "resId", p0, "resName", p1, null);
          return null;
       }else {
          File uFile = new File(obj2, p1);
          if (!uFile.isFile()) {
             b.G(obj, "fetch res failed: file not exists", "resId", p0, "resName", p1, null);
             uFile = new File(obj2);
             if (uFile.isDirectory() && c.a(uFile)) {
                b.G(obj, "fold is empty", "resId", p0, "resName", p1, null);
             }
             return null;
          }else {
             return uFile.getAbsolutePath();
          }
       }
    }
    public final void c(Context p0,a p1){
       ResourceIdMap b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveMaterialResourceManager.class, "2")) {
          return;
       }
       a.p(p0, "context");
       if (LiveMaterialResourceManager.a) {
          return;
       }
       LiveLogTag lIVE_MATERIA = LiveLogTag.LIVE_MATERIAL_RES;
       b.Z(lIVE_MATERIA, "initialize");
       Context applicationC = p0.getApplicationContext();
       a.o(applicationC, "context.applicationContext");
       LiveMaterialResourceManager.e = new e(applicationC, LiveMaterialResourceManager.c.c(), p1);
       File dir = p0.getDir("live_rich_text", 0);
       a.o(dir, "context.getDir\(CACHE_DIR, Context.MODE_PRIVATE\)");
       LiveMaterialResourceManager.f = dir;
       String str = "cacheDir";
       if (dir == null) {
          a.S(str);
       }
       LiveMaterialResourceManager.g = new ResourceIdMap(dir);
       StringBuilder str1 = "cacheDir: ";
       File f = LiveMaterialResourceManager.f;
       if (f == null) {
          a.S(str);
       }
       b.Z(lIVE_MATERIA, str1+f);
       ResourceIdMap g = LiveMaterialResourceManager.g;
       if (g == null) {
          a.S("resIdMap");
       }
       Objects.requireNonNull(g);
       if (!PatchProxy.applyVoid(null, g, ResourceIdMap.class, "5") && g.a().isFile()) {
          b = g.b;
          if (b != null) {
             b.dispose();
          }
          g.b = t.create(new f(g)).subscribeOn(b.c()).observeOn(a.c()).subscribe(new g(g), h.b, i.b);
       }
       LiveMaterialResourceManager.a = true;
       return;
    }
    public final void d(a p0){
       b b;
       LiveMaterialResourceManager liveMaterial = LiveMaterialResourceManager.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, liveMaterial, "5")) {
          return;
       }
       if (p0 != null && !p0.invoke().booleanValue()) {
          return;
       }
       this.a();
       CachePolicy nETWORK_ONLY = CachePolicy.NETWORK_ONLY;
       if (!PatchProxy.applyVoidOneRefs(nETWORK_ONLY, this, liveMaterial, "8")) {
          b.Z(LiveLogTag.LIVE_MATERIAL_RES, "doUpdate: "+nETWORK_ONLY);
          b = LiveMaterialResourceManager.b;
          if (b != null) {
             b.dispose();
          }
          b uob = PatchProxy.apply(null, this, liveMaterial, "1");
          if (uob == PatchProxyResult.class) {
             uob = LiveMaterialResourceManager.d.getValue();
          }
          LiveMaterialResourceManager.b = uob.a(nETWORK_ONLY).observeOn(b.c()).subscribe(b.b, c.b);
       }
       return;
    }
}
