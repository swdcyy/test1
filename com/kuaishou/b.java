package com.kuaishou.b;
import java.lang.Object;
import java.io.File;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.System;
import qkd.b;
import gq.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Boolean;
import o56.c;
import o56.a;
import xf6.g;
import crd.b;
import pn.a;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.PostDir;
import com.kuaishou.PostDiskManagerConfig;
import java.lang.reflect.Type;
import com.yxcorp.gifshow.util.PostUtils;
import com.kwai.sdk.switchconfig.a;
import lnc.p3;
import java.util.List;
import java.lang.Integer;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import pn.c;
import erd.g;
import lrd.b;
import pn.d;
import erd.o;
import pn.b;
import com.kuaishou.a;

public class b	// class@001142
{
    public b a;
    public boolean b;
    public int c;
    public static final b d;

    static {
       b.d = new b();
    }
    public void b(){
       super();
       this.b = false;
       this.c = 0;
    }
    public static b b(){
       return b.d;
    }
    public final long a(File p0){
       Object[] obj = PatchProxy.applyOneRefs(p0, this, b.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long l = 0;
       int i = 0;
       if (p0 == null || !p0.isDirectory()) {
          Object[] objArray = new Object[i];
          a.D().A("PostDiskManager", "no dir "+p0, objArray);
          return l;
       }else {
          long l1 = System.currentTimeMillis();
          long l2 = b.n0(p0);
          if (l2 - l > 0) {
             l2 = l2 >> 20;
          }
          obj = new Object[i];
          a.D().w("PostDiskManager", "sizeOf\n"+p0.getAbsolutePath()+"\nis"+l2+"MB, cost "+(System.currentTimeMillis() - l1)+"ms", obj);
          return l2;
       }
    }
    public boolean c(){
       boolean b;
       Object obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = (a.a().c() && g.i1())? true: false;
       return b;
    }
    public final void d(boolean p0){
       this.b = p0;
    }
    public final void e(){
       List a;
       Iterator iterator;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "6")) {
          return;
       }
       b ta = this.a;
       if (ta != null && !ta.isDisposed()) {
          int i = 0;
          Object[] objArray1 = new Object[i];
          a.D().w("PostDiskManager", "stopTimer\(\) ", objArray1);
          this.a.dispose();
          this.a = objArray;
          a c = a.c;
          Objects.requireNonNull(c);
          a uoa = a.class;
          if (!PatchProxy.applyVoid(objArray, c, uoa, "3")) {
             Object[] objArray2 = new Object[i];
             a.D().w("PostDirsManager", "stopWatching\(\): ", objArray2);
             if (c.a()) {
                if (!PatchProxy.applyVoid(objArray, c, uoa, "5") && (c.a() && a.b)) {
                   Object[] objArray3 = new Object[i];
                   a.D().w("PostDirsManager", "deleteTempFiles\(\):", objArray3);
                   a = a.a;
                   if (a != null) {
                      ArrayList uArrayList = new ArrayList();
                      iterator = a.iterator();
                      while (iterator.hasNext()) {
                         Object obj = iterator.next();
                         int i1 = obj.mIsResource ^ 0x01;
                         if (i1) {
                            uArrayList.add(obj);
                         }
                      }
                      iterator = uArrayList.iterator();
                      while (iterator.hasNext()) {
                         iterator.next().deleteUnusedCacheFile();
                      }
                   }
                }
                a = a.a;
                a.a = objArray;
                if (a != null) {
                   iterator = a.iterator();
                   while (iterator.hasNext()) {
                      iterator.next().stopWatch();
                   }
                }
             }
          }
       }
       return;
    }
    public void f(){
       z a;
       b uob = b.class;
       Object[] objArray = null;
       String str = "2";
       if (PatchProxy.applyVoid(objArray, this, uob, str)) {
          return;
       }
       b ta = this.a;
       String str1 = "PostDiskManager";
       int i = 0;
       if (ta != null && !ta.isDisposed()) {
          objArray = new Object[i];
          a.D().w(str1, "triggerLowDiskMonitor: is running ignore", objArray);
          return;
       }else {
          PostDiskManagerConfig postDiskMana = PatchProxy.apply(objArray, this, uob, "3");
          if (postDiskMana != PatchProxyResult.class) {
          }else if(this.c()){
             postDiskMana = PostUtils.C(new File("/sdcard/disk.json"), PostDiskManagerConfig.class);
          }else {
             postDiskMana = objArray;
          }
          if (postDiskMana == null) {
             postDiskMana = a.t().getValue("PostDiskManagerConfig", PostDiskManagerConfig.class, new PostDiskManagerConfig());
          }
          if (postDiskMana == null || postDiskMana.isEmpty()) {
             objArray = new Object[i];
             a.D().w(str1, "triggerLowDiskMonitor: no config ignore", objArray);
             return;
          }else {
             PostDiskManagerConfig mAutoDownloa = postDiskMana.mAutoDownloadNeedMinSpace;
             Object[] objArray1 = new Object[i];
             p3.D().w("PostUtils", "setAutoDownloadNeedMinSpace : minSpace="+mAutoDownloa, objArray1);
             PostUtils.a = mAutoDownloa;
             a c = a.c;
             PostDiskManagerConfig mPostDirs = postDiskMana.mPostDirs;
             PostDiskManagerConfig mCleanPostCa = postDiskMana.mCleanPostCacheAfterExit;
             Objects.requireNonNull(c);
             a uoa = a.class;
             if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(mPostDirs, Boolean.valueOf(mCleanPostCa), c, uoa, str)) {
                a uoa1 = a.D();
                StringBuilder str2 = "startWatching: started="+c.b()+' '+" clean tmp="+mCleanPostCa+' '+"toWatchDirs=";
                if (mPostDirs != null) {
                   objArray = Integer.valueOf(mPostDirs.size());
                }
                objArray1 = new Object[i];
                uoa1.w("PostDirsManager", str2+objArray+" ab="+c.a(), objArray1);
                if (c.a()) {
                   if (mPostDirs == null || mPostDirs.isEmpty()) {
                      i = 1;
                   }
                   if (!i && !c.b()) {
                      a.b = mCleanPostCa;
                      a.a = mPostDirs;
                      List a1 = a.a;
                      if (a1 != null) {
                         Iterator iterator = a1.iterator();
                         while (iterator.hasNext()) {
                            iterator.next().startWatch();
                         }
                      }
                   }
                }
             }
          label_012a :
             a = d.a;
             t ot = t.interval(0, (long)postDiskMana.mCheckInterval, TimeUnit.SECONDS).observeOn(a).doOnNext(new c(this)).observeOn(b.e()).map(new d(this, postDiskMana)).observeOn(a);
             this.a = ot.subscribe(new b(this), a.b);
             return;
          }
       }
    }
}
