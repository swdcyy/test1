package com.kwai.framework.cache.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import java.util.List;
import java.util.Map;
import java.lang.Integer;
import java.util.Arrays;
import java.util.Collection;
import k33.b;
import k33.a;
import qs5.e;
import com.kwai.feature.api.live.plugin.dva.LivePluginManager;
import g26.d;
import g26.c;
import com.kwai.framework.cache.a$a;
import q26.b;
import q26.a;
import c36.b;
import c36.a;
import com.kwai.framework.imagebase.ImageManagerInitModule;
import w66.a;
import d76.b;
import d76.a;
import q86.d;
import q86.c;
import f96.b;
import f96.a;
import com.kwai.framework.network.cronet.i;
import db6.b;
import com.kwai.framework.player.KsMediaPlayerInitModule;
import dc6.d;
import gn6.c;
import gn6.b;
import i4b.g;
import i4b.f;
import hdb.b;
import hdb.a;
import boc.j;
import lxc.b;
import lxc.a;
import myc.s;
import myc.r;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Iterator;
import v56.g;
import java.io.File;
import qkd.b;
import org.json.JSONObject;
import java.lang.Long;
import com.kwai.framework.cache.initmodule.CheckDiskModule;
import x56.d;
import x56.a;
import y56.a;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import wkd.b;
import com.kwai.framework.cache.CacheManager;
import java.lang.Exception;
import j80.c;
import android.app.Application;
import o56.a;
import java.lang.System;
import android.content.Context;
import brd.t;
import v56.a;
import erd.g;
import crd.b;
import ekd.q;
import android.util.Pair;
import v56.e;
import java.util.Comparator;
import java.util.Collections;
import com.kwai.framework.cache.CacheManager$a;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import v56.d;
import v56.c;
import v56.b;

public class a	// class@0014eb
{
    public long a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public Map i;
    public Map j;
    public boolean k;
    public boolean l;
    public static String m = "ÆäËû";
    public static final List n;
    public static final Map o;
    public static final Map p;
    public static final Map q;
    public static final List r;
    public static final AtomicBoolean s;
    public static final a t;

    static {
       a.n = new ArrayList();
       a.o = new HashMap();
       a.p = new HashMap();
       a.q = new HashMap();
       a.r = new CopyOnWriteArrayList();
       a.s = new AtomicBoolean(false);
       a.t = new a();
    }
    public void a(){
       super();
       this.d = 0;
       this.h = 0;
       this.i = new HashMap();
       this.j = new HashMap();
       boolean b = false;
       this.k = b;
       this.l = b;
       if (PatchProxy.applyVoid(null, this, a.class, "24")) {
       }else {
          a.m = a1.p(0x7f1006e0);
          String str = a1.p(R.string.arg_RES_7f100471);
          String str1 = a1.p(R.string.arg_RES_7f100473);
          String str2 = a1.p(R.string.arg_RES_7f10046e);
          a1.p(R.string.arg_RES_7f100474);
          String str3 = a1.p(R.string.arg_RES_7f101ce3);
          String str4 = a1.p(R.string.arg_RES_7f100472);
          a1.p(R.string.arg_RES_7f103492);
          List n = a.n;
          n.add(str1);
          n.add(str2);
          Map p = a.p;
          p.put("HodorSdk_CacheHandler", str1);
          p.put("YodaSdk_CacheHandler", str4);
          p.put("PostWork_CacheHandler", str);
          p.put("KRN", str4);
          p.put("imageCache", str2);
          p.put("KDS", str4);
          p.put("KWApp", a.m);
          p.put("obiwan", a.m);
          p.put("MiniGame_CacheHandler", a.m);
          p.put("MagicFaceResource_CacheHandler", str);
          p.put("Kuaishan_CacheHandler", str);
          p.put("QRCode_CacheHandler", a.m);
          p.put("IMCache_CacheHandler", a.m);
          p.put("AegonSdk_CacheHandler", a.m);
          p.put("giftResource", str3);
          a.o.put(str3, Integer.valueOf(1));
          String[] stringArray = new String[]{a1.p(0x7f10046c),a1.p(0x7f10046b),a1.p(0x7f10046a),a1.p(0x7f100469)};
          a.q.put(str3, new ArrayList(Arrays.asList(stringArray)));
       }
       return;
    }
    public static void a(){
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, null, uoa, "18")) {
          return;
       }
       if (a.s.compareAndSet(false, true) && !PatchProxy.applyVoid(null, null, uoa, "1")) {
          if (!PatchProxy.applyVoid(null, null, b.class, "1")) {
             LivePluginManager.h(false, new a("registerCacheHandler"));
          }
          if (!PatchProxy.applyVoid(null, null, d.class, "1")) {
             a.p(new c());
          }
          if (!PatchProxy.applyVoid(null, null, b.class, "1")) {
             a.p(new a());
          }
          if (!PatchProxy.applyVoid(null, null, b.class, "1")) {
             a.p(new a());
          }
          if (!PatchProxy.applyVoid(null, null, ImageManagerInitModule.class, "4")) {
             a.p(new a());
          }
          if (!PatchProxy.applyVoid(null, null, b.class, "1")) {
             a.p(new a());
          }
          if (!PatchProxy.applyVoid(null, null, d.class, "1")) {
             a.p(new c());
          }
          if (!PatchProxy.applyVoid(null, null, b.class, "1")) {
             a.p(new a());
          }
          if (!PatchProxy.applyVoid(null, null, i.class, "1")) {
             a.p(new b());
          }
          if (!PatchProxy.applyVoid(null, null, KsMediaPlayerInitModule.class, "1")) {
             a.p(new d());
          }
          if (!PatchProxy.applyVoid(null, null, c.class, "1")) {
             a.p(new b());
          }
          if (!PatchProxy.applyVoid(null, null, g.class, "2")) {
             a.p(new f());
          }
          if (!PatchProxy.applyVoid(null, null, b.class, "1")) {
             a.p(new a());
          }
          a.p(new j());
          if (!PatchProxy.applyVoid(null, null, b.class, "1")) {
             a.p(new a());
          }
          if (!PatchProxy.applyVoid(null, null, s.class, "1")) {
             a.p(new r());
          }
       }
    label_0133 :
       return;
    }
    public static String d(String p0,int p1){
       Map obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uoa, "25");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = a.q;
       if (obj.get(p0) == null || p1 >= obj.get(p0).size()) {
          return "";
       }else {
          return obj.get(p0).get(p1);
       }
    }
    public static a f(){
       return a.t;
    }
    public static String g(Map p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, a.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = p0.get(p1);
       if (str == null) {
          str = a.m;
       }
       return str;
    }
    public static void p(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "2")) {
          return;
       }
       a.r.add(p0);
       return;
    }
    public static void q(String p0,boolean p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, uoa, "20")) {
          return;
       }
       if (a.o.get(p0) == null) {
          return;
       }
       Iterator iterator = a.r.iterator();
       while (iterator.hasNext()) {
          a$a uoa1 = iterator.next();
          if ((a.g(a.p, uoa1.name())).equals(p0)) {
             uoa1.h(p1);
          }
       }
       a.r(p0, p1);
       return;
    }
    public static void r(String p0,boolean p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, uoa, "21")) {
          return;
       }
       int i = a.o.get(p0).intValue();
       int i1 = g.d();
       if (p1 && !(i1 & i)) {
          g.g((i | g.d()));
       }else if(!p1 && (i1 & i)){
          g.g((i ^ g.d()));
       }
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, a.class, "13")) {
          return;
       }
       Iterator iterator = this.i().iterator();
       while (iterator.hasNext()) {
          File uFile = iterator.next();
          if (uFile != null && uFile.exists()) {
             b.q(uFile);
          }
       }
       return;
    }
    public final JSONObject c(long p0,long p1,long p2,long p3,long p4,JSONObject p5,JSONObject p6){
       JSONObject obj;
       long l = p1;
       long l1 = p2;
       object oobject = p5;
       object oobject1 = p6;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{Long.valueOf(p0),Long.valueOf(p1),Long.valueOf(p2),Long.valueOf(p3),Long.valueOf(p4),oobject,oobject1};
          obj = PatchProxy.apply(objArray, this, uoa, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }else {
          int i = this;
       }
       obj = new JSONObject();
       obj.put("clear_duration_in_ms", p0);
       obj.put("app_ui_cleanable_size", (double)g.a());
       obj.put("app_actual_clean_size", (l - l1));
       obj.put("app_size_before_clear", l);
       obj.put("app_size_after_clear", l1);
       obj.put("available_disk_size_before_clear", p3);
       obj.put("available_disk_size_after_clear", p4);
       obj.put("biz_cleanable_size_before_clear", oobject);
       obj.put("biz_cleanable_size_after_clear", oobject1);
       d t = CheckDiskModule.t;
       if (t == null) {
          obj.put("auto_clear_more_files", 0);
       }else {
          obj.put("auto_clear_more_files", t.autoClearMoreFiles);
       }
       return obj;
    }
    public a e(int p0){
       a obj;
       Iterator iterator;
       long l1;
       long l3;
       boolean i = p0;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new a();
       long l = 0;
       boolean b = true;
       if (i) {
          if (i == b && !PatchProxy.applyVoidOneRefs(obj, this, uoa, "15")) {
             iterator = this.h().iterator();
             while (iterator.hasNext()) {
                File uFile = iterator.next();
                if (uFile != null && uFile.exists()) {
                   l1 = a.c(uFile);
                   long l2 = l1 >> 20;
                   Log.b("AppCacheManager", uFile.getAbsolutePath()+" cleanableSize"+l2+" MB");
                   l = l + l1;
                }
             }
             obj.a(a.m, l);
          }
       }else if(PatchProxy.applyVoidOneRefs(obj, this, uoa, "11")){
          a.a();
          int i1 = b.a(0x5f2ddeb4).h() ^ b;
          iterator = this.i().iterator();
          while (iterator.hasNext()) {
             File uFile1 = iterator.next();
             if (uFile1 != null && uFile1.exists()) {
                l3 = a.c(uFile1);
                l1 = l3 >> 20;
                Log.b("AppCacheManager", uFile1.getAbsolutePath()+" cleanableSize"+l1+" MB");
                l = l + l3;
             }
             l1 = 1;
          }
          obj.a(a.m, l);
          Iterator iterator1 = a.r.iterator();
          while (iterator1.hasNext()) {
             a$a uoa1 = iterator1.next();
             d t = CheckDiskModule.t;
             if (t != null) {
                t = t.normalmoduleLimits;
                if (t != null && t.containsKey(uoa1.name())) {
                   try{
                      long l4 = uoa1.b(i1);
                      l3 = l4 >> 20;
                      Log.b("AppCacheManager", uoa1.name()+" cleanableSize"+l3+" MB");
                      String str = a.g(a.p, uoa1.name());
                      obj.a(str, l4);
                      if (a.o.containsKey(str) && uoa1.j(i1) != -1) {
                         obj.b(str, uoa1.e(i1));
                         i = (uoa1.j(i1) == 1)? true: false;
                         try{
                            a.r(str, i);
                         }catch(java.lang.Exception e0){
                         }
                         e0.printStackTrace();
                         goto label_00ea ;
                      }
                   }catch(java.lang.Exception e0){
                      t = 1;
                      goto label_015f ;
                   }
                }
             }
          }
       }
       return obj;
    }
    public final List h(){
       ArrayList obj = PatchProxy.apply(null, this, a.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add(b.a(-1504323719).h(".game_apk_cache"));
       return obj;
    }
    public final List i(){
       ArrayList obj = PatchProxy.apply(null, this, a.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add(a.b().getCacheDir());
       obj.add(a.b().getExternalCacheDir());
       obj.add(new File(a.b().getFilesDir().getParentFile(), "exception"));
       return obj;
    }
    public boolean j(){
       return this.l;
    }
    public void k(boolean p0){
       Iterator iterator3;
       Object obj = this;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), obj, uoa, "3")) {
          return;
       }
       long l = System.currentTimeMillis();
       ArrayList uArrayList = new ArrayList();
       boolean b = a.f().j();
       HashMap hashMap = new HashMap();
       Iterator iterator = a.r.iterator();
       while (iterator.hasNext()) {
          a$a uoa1 = iterator.next();
          long l1 = uoa1.d();
          hashMap.put(uoa1.name(), Long.valueOf(l1));
       }
       a.b(a.b()).subscribe(new a(obj));
       HashMap hashMap1 = new HashMap();
       Iterator iterator1 = a.r.iterator();
       Object obj1 = null;
       while (iterator1.hasNext()) {
          a$a uoa2 = iterator1.next();
          long l2 = System.currentTimeMillis();
          boolean b1 = true;
          uoa2.g(b1);
          List list = uoa2.i(b1);
          if (!q.f(list)) {
             uArrayList.addAll(list);
          }
          list = uoa2.c(b1);
          if (list != null) {
             uArrayList.addAll(list);
          }
          list = uoa2.k(b1);
          if (list != null) {
             uArrayList.addAll(list);
          }
          list = uoa2.f(b1);
          if (list != null) {
             Iterator iterator2 = list.iterator();
             while (iterator2.hasNext()) {
                Pair pair = iterator2.next();
                Pair first = pair.first;
                long l3 = pair.second.longValue();
                if (PatchProxy.isSupport(uoa)) {
                   iterator3 = iterator1;
                   if (!PatchProxy.applyVoidTwoRefs(first, Long.valueOf(l3), obj1, uoa, "17")) {
                   label_00d7 :
                      long l4 = 0;
                      if (l3 - l4 >= 0 && first.isDirectory()) {
                         List list1 = Arrays.asList(first.listFiles());
                         Collections.sort(list1, new e());
                         iterator1 = list1.iterator();
                         while (iterator1.hasNext()) {
                            File uFile = iterator1.next();
                            if (l4 - l3 > 0) {
                               b.q(uFile);
                            }else {
                               l4 = l4 + a.c(uFile);
                            }
                         }
                      }
                   }
                }else {
                   iterator3 = iterator1;
                   goto label_00d7 ;
                }
                iterator1 = iterator3;
                first = 1;
             }
          }
          iterator3 = iterator1;
          iterator1 = uArrayList.iterator();
          while (iterator1.hasNext()) {
             b.q(iterator1.next());
          }
          uoa2.a(true, false);
          long l5 = System.currentTimeMillis() - l2;
          hashMap1.put(uoa2.name(), Long.valueOf(l5));
          iterator1 = iterator3;
       }
       b.a(0x5f2ddeb4).k(obj1);
       if (CheckDiskModule.t.autoClearMoreFiles != null) {
          this.b();
       }
       d uod = new d(this, hashMap, hashMap1, b, p0, l);
       a.b(a.b()).delay(20, TimeUnit.SECONDS).subscribeOn(d.c).subscribe(obj1);
       return;
    }
    public void l(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "7")) {
          return;
       }
       this.m(p0, new ArrayList());
       return;
    }
    public void m(int p0,List p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "8")) {
          return;
       }
       if (p0) {
          if (p0 != 1 || (!PatchProxy.applyVoidOneRefs(p1, this, uoa, "14") && !p1.contains(a.m))) {
             Iterator iterator = this.h().iterator();
             while (iterator.hasNext()) {
                b.q(iterator.next());
             }
          }
       }else if(PatchProxy.applyVoidOneRefs(p1, this, uoa, "10")){
          a.a();
          p0 = b.a(0x5f2ddeb4).h() ^ 1;
          if (!p1.contains(a.m)) {
             this.b();
          }
          Iterator iterator1 = a.r.iterator();
          while (iterator1.hasNext()) {
             a$a uoa1 = iterator1.next();
             if (p1.contains(a.g(a.p, uoa1.name()))) {
                continue ;
             }else {
                d t = CheckDiskModule.t;
                if (t != null) {
                   t = t.normalmoduleLimits;
                   if (t != null && t.containsKey(uoa1.name())) {
                      try{
                         Log.b("AppCacheManager", "manualCleanTempCache "+uoa1.name());
                         uoa1.a(p0, 1);
                      }catch(java.lang.Exception e2){
                         e2.printStackTrace();
                         goto label_0072 ;
                      }
                   }
                }
             }
          }
       }
       return;
    }
    public void n(String p0,long p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, uoa, "6")) {
          return;
       }
       a.b(a.b()).delay(5, TimeUnit.SECONDS).subscribeOn(d.c).subscribe(new c(this, p1, p0));
       return;
    }
    public void o(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       a.a();
       a.b(a.b()).subscribe(new b(this));
       return;
    }
    public void s(boolean p0){
       this.l = p0;
    }
}
