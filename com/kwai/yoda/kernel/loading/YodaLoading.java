package com.kwai.yoda.kernel.loading.YodaLoading;
import com.kwai.yoda.kernel.loading.YodaLoading$mStore$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.String;
import am8.a;
import am8.d;
import java.util.concurrent.Executor;
import brd.z;
import lrd.b;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import crd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import wy7.j;
import java.util.concurrent.Callable;
import brd.t;
import wy7.k;
import wy7.l;
import erd.g;
import crd.b;
import java.io.File;
import com.kwai.robust.PatchProxyResult;
import com.kwai.middleware.azeroth.Azeroth2;
import android.content.Context;
import wy7.a;
import com.kwai.yoda.kernel.loading.YodaLoading$a;
import com.kwai.yoda.kernel.loading.YodaLoading$b;
import com.kwai.yoda.kernel.loading.YodaLoading$c;
import java.lang.CharSequence;
import java.util.Iterator;
import java.lang.Iterable;
import tb7.j;
import zy7.a;
import zy7.d;
import yy7.a;
import java.util.Map;

public final class YodaLoading	// class@0012aa
{
    public static final p a;
    public static z b;
    public static final ConcurrentHashMap c;
    public static final ConcurrentHashMap d;
    public static final CopyOnWriteArrayList e;
    public static a f;
    public static final YodaLoading g;

    static {
       YodaLoading yodaLoading = new YodaLoading();
       YodaLoading.g = yodaLoading;
       YodaLoading.a = s.c(YodaLoading$mStore$2.INSTANCE);
       z oz = b.b(d.b("yoda_loading", 0));
       a.h(oz, "Schedulers.from\(\n    Ela¡­ORITY_IMMEDIATE\n    \)\n  \)");
       YodaLoading.b = oz;
       YodaLoading.c = new ConcurrentHashMap();
       YodaLoading.d = new ConcurrentHashMap();
       YodaLoading.e = new CopyOnWriteArrayList();
       YodaLoading.f = new a();
       if (PatchProxy.applyVoid(null, yodaLoading, YodaLoading.class, "13")) {
       }else {
          yodaLoading.d(t.fromCallable(j.b).subscribeOn(YodaLoading.b).subscribe(k.b, l.b));
       }
    }
    public void YodaLoading(){
       super();
    }
    public static final ConcurrentHashMap a(YodaLoading p0){
       return YodaLoading.c;
    }
    public static final ConcurrentHashMap b(YodaLoading p0){
       return YodaLoading.d;
    }
    public static final File h(String p0){
       File obj = PatchProxy.applyOneRefs(p0, null, YodaLoading.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.q(p0, "filename");
       obj = new File(YodaLoading.l(), p0);
       if (!obj.exists()) {
          obj.mkdirs();
       }
       return obj;
    }
    public static final File j(){
       File obj = PatchProxy.apply(null, null, YodaLoading.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new File(YodaLoading.l(), "zip");
       if (!obj.exists()) {
          obj.mkdirs();
       }
       return obj;
    }
    public static final File l(){
       File obj = PatchProxy.apply(null, null, YodaLoading.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new File(Azeroth2.B.d().getFilesDir(), "yoda_loading_cache");
       if (!obj.exists()) {
          obj.mkdirs();
       }
       return obj;
    }
    public final void c(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaLoading.class, "6")) {
          return;
       }
       a.q(p0, "provider");
       CopyOnWriteArrayList e = YodaLoading.e;
       if (e.contains(p0)) {
          return;
       }
       e.add(p0);
       return;
    }
    public final void d(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaLoading.class, "26")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (YodaLoading.f.isDisposed()) {
          YodaLoading.f = new a();
       }
       YodaLoading.f.c(p0);
       return;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, YodaLoading.class, "12")) {
          return;
       }
       this.d(t.fromCallable(YodaLoading$a.b).subscribeOn(YodaLoading.b).subscribe(YodaLoading$b.b, YodaLoading$c.b));
       return;
    }
    public final a f(String p0){
       object oobject;
       Object obj = PatchProxy.applyOneRefs(p0, this, YodaLoading.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       CopyOnWriteArrayList uCopyOnWrite = (p0 == null || !p0.length())? 1: null;
       if (uCopyOnWrite) {
          return null;
       }else {
          Iterator iterator = YodaLoading.e.iterator();
          while (true) {
             if (!iterator.hasNext()) {
                return null;
             }
             a uoa = iterator.next();
             String[] stringArray = uoa.b();
             int len = stringArray.length;
             int i = 0;
             while (true) {
                if (i < len) {
                   oobject = stringArray[i];
                   if (j.a(oobject, p0)) {
                   label_0047 :
                      if (oobject != null) {
                         break ;
                      }else {
                         continue ;
                      }
                   }else {
                      i = i + 1;
                   }
                }else {
                   oobject = null;
                   goto label_0047 ;
                }
             }
             return uoa;
          }
       }
    }
    public final a g(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, YodaLoading.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.q(p0, "layoutType");
       return YodaLoading.c.get(p0);
    }
    public final d i(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, YodaLoading.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.q(p0, "md5");
       return YodaLoading.d.get(p0);
    }
    public final a k(){
       Object obj = PatchProxy.apply(null, this, YodaLoading.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return YodaLoading.a.getValue();
    }
    public final void m(){
       if (PatchProxy.applyVoid(null, this, YodaLoading.class, "22")) {
          return;
       }
       YodaLoading.c.clear();
       a uoa = this.k();
       if (uoa != null) {
          uoa.c();
       }
       return;
    }
    public final void n(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaLoading.class, "21")) {
          return;
       }
       YodaLoading.d.remove(p0);
       a uoa = this.k();
       if (uoa != null) {
          uoa.e(p0);
       }
       return;
    }
    public final void o(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaLoading.class, "24")) {
          return;
       }
       YodaLoading.d.put(p0.md5, p0);
       a uoa = this.k();
       if (uoa != null) {
          uoa.h(p0);
       }
       return;
    }
}
