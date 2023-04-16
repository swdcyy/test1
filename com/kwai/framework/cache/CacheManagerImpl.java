package com.kwai.framework.cache.CacheManagerImpl;
import com.kwai.framework.cache.CacheManager;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qkd.b;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.os.Looper;
import com.yxcorp.utility.SystemUtil;
import java.lang.reflect.Type;
import gkd.a$c;
import gkd.a;
import fg6.a;
import com.google.gson.Gson;
import com.kwai.framework.cache.CacheManagerImpl$CacheEntry;
import java.util.Map;
import java.lang.Exception;
import java.lang.Number;
import java.lang.Math;
import android.os.SystemClock;
import com.kwai.framework.cache.b;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.framework.cache.CacheManagerImpl$AdjustLruSizeResult;
import k2b.u1;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import gkd.a$e;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.System;
import java.lang.Throwable;
import o56.c;
import o56.a;
import xf6.l;
import com.kwai.framework.cache.initmodule.CheckDiskModule;
import x56.d;
import com.kwai.framework.cache.CacheManager$a;
import wkd.b;
import j80.c;
import android.app.Application;
import android.content.Context;
import com.kwai.framework.cache.CacheManagerImpl$a;
import t45.c;
import com.kwai.framework.cache.CacheManagerImpl$b;
import com.kwai.framework.cache.CacheManagerImpl$CacheInitResult;
import android.os.Environment;

public class CacheManagerImpl implements CacheManager	// class@000b1c
{
    public a a;
    public Map b;
    public long c;
    public long d;
    public long e;
    public static final int f = 1;
    public static long g;
    public static long h;

    public void CacheManagerImpl(){
       super();
       this.b = new ConcurrentHashMap();
       this.c = 0;
       this.d = 0;
       this.e = 0;
       this.p();
    }
    public static void s(File p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, CacheManagerImpl.class, "21")) {
          return;
       }
       if (b.L(p0) || b.N(p0)) {
          Log.b("ks://lrucachemanager", "deleteMedia "+p0.getAbsolutePath());
       }
       return;
    }
    public boolean a(long p0){
       CacheManagerImpl uCacheManage = CacheManagerImpl.class;
       if (PatchProxy.isSupport(uCacheManage)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, uCacheManage, "20");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       long g = CacheManagerImpl.g;
       if (Looper.getMainLooper() != Looper.myLooper() || g <= 0) {
          CacheManagerImpl.g = SystemUtil.u();
          g = CacheManagerImpl.g;
       }
       boolean b = (g - p0 > 0)? true: false;
       return b;
    }
    public long b(){
       return this.e;
    }
    public void c(String p0,Object p1,Type p2,long p3){
       if (PatchProxy.isSupport(CacheManagerImpl.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Long.valueOf(p3), this, CacheManagerImpl.class, "5")) {
          return;
       }
       if (this.n()) {
          try{
             a$c uoc = this.a.g(p0);
             uoc.f(0, new Gson().r(new CacheManagerImpl$CacheEntry(a.a.r(p1, p2), p3), CacheManagerImpl$CacheEntry.class));
             uoc.b();
             this.b.put(p0, Boolean.TRUE);
          }catch(java.io.IOException e0){
          }
       }else {
          this.q(0, 0, this.o(), null, "putCacheFailed");
       }
       return;
    }
    public long d(){
       return this.d;
    }
    public long e(){
       CacheManagerImpl obj = PatchProxy.apply(null, this, CacheManagerImpl.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.a;
       long l = 0;
       if (obj != null) {
          a c = obj.c;
          if (c != null) {
             l = c.length();
          }
       }
       return l;
    }
    public synchronized void f(boolean p0){
       CacheManagerImpl uCacheManage = CacheManagerImpl.class;
       if (PatchProxy.isSupport(uCacheManage) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uCacheManage, "17")) {
          return;
       }
       if (this.r() && !this.p()) {
          return;
       }
       long l = Math.max(0, b.a(this.o().getAbsolutePath()));
       long l1 = 0x1400000;
       if ((this.a.x() + l) - l1 < 0) {
          if ((SystemClock.elapsedRealtime() - CacheManagerImpl.h) - 0xea60 > 0 && p0) {
             CacheManagerImpl.h = SystemClock.elapsedRealtime();
             k1.o(b.b);
          }
          if (l - 0x500000 <= 0) {
             CacheManagerImpl$AdjustLruSizeResult uAdjustLruSi = new CacheManagerImpl$AdjustLruSizeResult(this);
             CacheManagerImpl ta = this.a;
             _monitor_enter(ta);
             _monitor_exit(ta);
             uAdjustLruSi.maxSize = ta.g;
             uAdjustLruSi.cachedFilesSize = this.a.x();
             String str = new Gson().q(uAdjustLruSi);
             String str1 = "OutOfDiskSpace";
             try{
                u1.Q(str1, str);
                this.a.c();
             }catch(java.io.IOException e0){
             }
          }
       }
       l = Math.max(Math.min((e0 + this.a.x()), 0x5000000), l1);
       CacheManagerImpl ta1 = this.a;
       _monitor_enter(ta1);
       if (ta1.g - l) {
          ta1.g = l;
          ta1.n.submit(ta1.o);
       }
       _monitor_exit(ta1);
       return;
    }
    public Object g(String p0,Type p1){
       a$e uoe;
       String obj = PatchProxy.applyTwoRefs(p0, p1, this, CacheManagerImpl.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          if (this.n()) {
             try{
                uoe = this.a.h(p0);
                if (uoe == null) {
                   if (uoe != null) {
                      uoe.close();
                   }
                   return null;
                }else {
                   obj = uoe.getString(0);
                   if (TextUtils.isEmpty(obj)) {
                      uoe.close();
                      return null;
                   }else {
                      CacheManagerImpl$CacheEntry uCacheEntry = new Gson().h(obj, CacheManagerImpl$CacheEntry.class);
                      if (System.currentTimeMillis() - uCacheEntry.mExpireDate > 0) {
                         uoe.close();
                         return null;
                      }else {
                         try{
                            p1 = a.a.i(uCacheEntry.mJson, p1);
                            uoe.close();
                            return p1;
                         }catch(com.google.gson.JsonSyntaxException e0){
                            uoe.close();
                         }catch(java.lang.NumberFormatException e0){
                         }catch(java.util.ConcurrentModificationException e0){
                         }
                      label_0079 :
                         return null;
                      }
                   }
                }
             }catch(java.io.IOException e0){
             }catch(com.google.gson.JsonSyntaxException e0){
                uoe.close();
                return null;
             }catch(java.util.ConcurrentModificationException e0){
             }
          }else {
             this.q(0, 0, this.o(), null, "getCacheFailed");
             goto label_0079 ;
          }
       }catch(java.io.IOException e0){
       }
    }
    public synchronized File get(String p0){
       a$e obj = PatchProxy.applyOneRefs(p0, this, CacheManagerImpl.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.n()) {
          try{
             obj = this.a.h(p0);
             if (obj == null) {
                File uFile = new File(this.o(), p0);
                if (obj != null) {
                   obj.close();
                }
                return uFile;
             }else {
                obj.close();
                return obj.a(0);
             }
          }catch(java.io.IOException e0){
             return new File(this.o(), p0);
          }
       }else {
          this.q(0, 0, this.o(), null, "getFileFailed");
          return super(this.o(), p0);
       }
    }
    public boolean h(){
       d obj = PatchProxy.apply(null, this, CacheManagerImpl.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       obj = (a.a().c() && l.c("key_force_low_disk", b))? 1: null;
       if (obj) {
          return b;
       }else if(CheckDiskModule.t != null){
          Log.b("CacheManagerImpl", "get lowDiskFreeSizeLimit from LowDiskModeConfigModel");
          return this.a(CheckDiskModule.t.lowDiskFreeSizeLimit);
       }else {
          return this.a(0x25800000);
       }
    }
    public long i(){
       return this.c;
    }
    public synchronized boolean j(String p0){
       a$e obj = PatchProxy.applyOneRefs(p0, this, CacheManagerImpl.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.b.get(p0) != null) {
          return b;
       }
       if (this.n()) {
          try{
             obj = this.a.h(p0);
             if (obj == null) {
                if (obj != null) {
                   obj.close();
                }
                return false;
             }else if(obj.a(false) != null){
                b = false;
             }
             if (b) {
                this.b.put(p0, this);
             }
             obj.close();
             return b;
          }catch(java.io.IOException e0){
             return false;
          }
       }else {
          this.q(0, 0, this.o(), null, "getFileFailed");
          return false;
       }
    }
    public synchronized int k(CacheManager$a p0){
       File[] obj = PatchProxy.applyOneRefs(p0, this, CacheManagerImpl.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.o().listFiles();
       int i = 0;
       if (obj != null) {
          int i1 = 0;
          while (i < obj.length) {
             object oobject = obj[i];
             if (!(oobject.getName()).contains("journal")) {
                CacheManagerImpl ta = this.a;
                if (ta != null) {
                   try{
                      if (ta.u(oobject.getName())) {
                         i1 = i1 + 1;
                      }
                   }catch(java.io.IOException e0){
                   }
                }else {
                   i1 = i1 + this.m(oobject);
                }
             }
          label_0055 :
             i = i + 1;
          }
          try{
             i = i1;
             if (PatchProxy.applyVoid(null, this, e0, "11")) {
             }else if(this.n()){
                this.a.flush();
             }
          }catch(java.io.IOException e0){
          }
       }
    }
    public final void l(){
       if (PatchProxy.applyVoid(null, this, CacheManagerImpl.class, "16")) {
          return;
       }
       File[] uFileArray = b.a(-1504323719).o().listFiles();
       if (uFileArray != null) {
          int len = uFileArray.length;
          for (int i = 0; i < len; i = i + 1) {
             object oobject = uFileArray[i];
             if (oobject.isDirectory()) {
                File[] uFileArray1 = oobject.listFiles();
                if (uFileArray1 != null) {
                   int len1 = uFileArray1.length;
                   for (int i1 = 0; i1 < len1; i1 = i1 + 1) {
                      uFileArray1[i1].delete();
                      CacheManagerImpl.s(oobject);
                   }
                }
             }
             oobject.delete();
             CacheManagerImpl.s(oobject);
          }
       }
       return;
    }
    public int m(File p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CacheManagerImpl.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       int i1 = 1;
       try{
          if (p0.isDirectory()) {
             File[] uFileArray = p0.listFiles();
             if (uFileArray != null) {
                int len = uFileArray.length;
                int i2 = 0;
                while (true) {
                   if (i < len) {
                      try{
                         object oobject = uFileArray[i];
                         if (oobject.isDirectory()) {
                            i2 = i2 + this.m(oobject);
                            oobject.delete();
                            CacheManagerImpl.s(oobject);
                         }else if(oobject.exists()){
                            oobject.delete();
                            CacheManagerImpl.s(oobject);
                         }else {
                         label_0046 :
                            i = i + 1;
                         }
                         i2 = i2 + i1;
                         goto label_0046 ;
                      }catch(java.lang.Exception e0){
                         i = i2;
                         break ;
                      }
                   }else {
                      goto label_0049 ;
                   }
                }
             }
          }else {
             try{
                p0.delete();
                i = 1;
             }catch(java.lang.Exception e0){
             }
          }
       }catch(java.lang.Exception e0){
       }
    }
    public synchronized final boolean n(){
       Object obj = PatchProxy.apply(null, this, CacheManagerImpl.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.r()) {
          return this.p();
       }
       boolean b = (this.a != null)? true: false;
       return b;
    }
    public final File o(){
       Object obj = PatchProxy.apply(null, this, CacheManagerImpl.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(-1504323719).l();
    }
    public synchronized final boolean p(){
       Object[] objArray = null;
       File obj = PatchProxy.apply(objArray, this, CacheManagerImpl.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!SystemUtil.L(a.a().a())) {
          return false;
       }
       obj = this.o();
       try{
          CacheManagerImpl ta = this.a;
          if (ta != null) {
             try{
                ta.e(true);
             }catch(java.io.IOException e9){
                this.q(0, 0, obj, e9, "DiskLruCacheDeleteFailed");
             }
             this.a = objArray;
          }
          long l = 0x5000000;
          try{
             a uoa = a.l(obj, true, true, l);
             this.a = uoa;
             c.k(new CacheManagerImpl$a(uoa));
             c.k(new CacheManagerImpl$b());
             CacheManagerImpl.g = SystemUtil.u();
             return true;
          }catch(java.io.IOException e2){
             this.q(0, 0, obj, e2, "DiskLruCacheOpenFailed");
             return v1;
          }catch(java.lang.IllegalArgumentException e2){
             this.q(0, 0, obj, e2, "IllegalArgumentError");
             return false;
          }
       }catch(java.lang.IllegalArgumentException e2){
       }
    }
    public final void q(long p0,long p1,File p2,Exception p3,String p4){
       if (PatchProxy.isSupport(CacheManagerImpl.class)) {
          Object[] objArray = new Object[]{Long.valueOf(p0),Long.valueOf(p1),p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, CacheManagerImpl.class, "3")) {
             return;
          }
       }
       CacheManagerImpl$CacheInitResult uCacheInitRe = new CacheManagerImpl$CacheInitResult(this);
       uCacheInitRe.availableSpace = p0;
       uCacheInitRe.cachedFilesSize = p1;
       uCacheInitRe.isCacheDirExist = p2.exists();
       Object obj = PatchProxy.apply(null, this, CacheManagerImpl.class, "4");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): (Environment.getExternalStorageState()).equals("mounted");
       uCacheInitRe.isInMemMounted = b;
       uCacheInitRe.cacheDirPath = p2.getAbsolutePath();
       uCacheInitRe.exceptionMes = (p3 == null)? "": Log.f(p3);
       u1.Q(p4, new Gson().q(uCacheInitRe));
       return;
    }
    public synchronized final boolean r(){
       CacheManagerImpl obj = PatchProxy.apply(null, this, CacheManagerImpl.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a;
       boolean b = (obj == null || !(obj.j().getAbsolutePath()).equals(this.o().getAbsolutePath()))? true: false;
       return b;
    }
    public synchronized void remove(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CacheManagerImpl.class, "10")) {
          return;
       }
       try{
          if (this.n()) {
             this.a.u(p0);
             this.b.remove(p0);
          }
          return;
       }catch(java.io.IOException e0){
       }
    }
}
