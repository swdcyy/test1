package com.yxcorp.upgrade.impl.b;
import java.lang.Runnable;
import com.yxcorp.upgrade.impl.a;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bkd.b;
import zjd.d;
import akd.p;
import android.app.Application;
import com.yxcorp.upgrade.impl.g;
import akd.a;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import akd.e;
import android.os.Handler;
import com.yxcorp.upgrade.impl.g$a;
import java.lang.System;
import akd.d;

public final class b implements Runnable	// class@00098f
{
    public final a b;

    public void b(a p0){
       this.b = p0;
    }
    public final void run(){
       Application application;
       a obj;
       b uob;
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, a.class, "13")) {
       }else if(tb.a == null){
          e uoe = 1;
          if (tb.c.o != null) {
             application = p.c().getApplication();
             String str = g.c(tb.c.k);
             b l = tb.c.l;
             int i = 0;
             if (PatchProxy.isSupport(a.class)) {
                obj = PatchProxy.applyThreeRefs(application, str, Integer.valueOf(l), null, a.class, "1");
                if (obj != PatchProxyResult.class) {
                   i = obj.intValue();
                }else {
                   try{
                   label_0056 :
                      String packageName = application.getPackageName();
                      int i1 = 64;
                      PackageInfo packageInfo = application.getPackageManager().getPackageInfo(packageName, i1);
                      PackageInfo packageArchi = application.getPackageManager().getPackageArchiveInfo(str, i1);
                      if (packageArchi == null) {
                         i = 1;
                      }else {
                         packageInfo = packageInfo.signatures;
                         PackageInfo signatures = packageArchi.signatures;
                         packageArchi = packageArchi.versionCode;
                         if (!packageName.equals(packageArchi.packageName)) {
                            i = 2;
                         }else if(packageArchi != l){
                            i = 3;
                         }else if(signatures == null){
                            int len = packageInfo.length;
                            int i2 = 0;
                            while (i2 < len) {
                               object oobject = packageInfo[i2];
                               int len1 = signatures.length;
                               int i3 = 0;
                               while (true) {
                                  if (i3 < len1) {
                                     object oobject1 = signatures[i3];
                                     if (oobject.hashCode() == oobject1.hashCode() && oobject.equals(oobject1)) {
                                        uob = 1;
                                     label_00a9 :
                                        if (uob) {
                                           i2 = i2 + 1;
                                        }
                                     }else {
                                        i3 = i3 + 1;
                                     }
                                  }else {
                                     uob = null;
                                     goto label_00a9 ;
                                  }
                               }
                            }
                         }
                         i = 4;
                      }
                   }catch(java.lang.Exception e0){
                   }
                }
             }else {
                goto label_0056 ;
             }
          }
          obj = tb.c;
          g$a uoa = new g$a(obj.d, obj.e, obj.k, System.currentTimeMillis(), tb.c.l);
          g.g(application);
          if (tb.c.q != uoe) {
             tb.g();
          }
          tb.j.post(new d(tb));
       }
       return;
    }
}
