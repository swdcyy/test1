package com.yxcorp.upgrade.impl.e;
import zjd.a;
import java.lang.Object;
import android.os.Handler;
import android.os.Looper;
import bkd.b;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import zjd.c;
import zjd.d;
import akd.p;
import android.app.Activity;
import android.content.res.Resources;
import android.content.Context;
import java.lang.CharSequence;
import android.widget.Toast;
import zjd.g;
import bkd.a;
import android.text.TextUtils;
import android.content.SharedPreferences;
import akd.b0;
import java.lang.System;
import android.content.SharedPreferences$Editor;
import oe6.g;
import android.os.Environment;
import java.io.File;
import ckd.d;
import ckd.c;
import com.yxcorp.upgrade.impl.d;
import ckd.e;
import com.yxcorp.upgrade.impl.a;
import com.yxcorp.upgrade.impl.g$a;
import com.yxcorp.upgrade.impl.g;
import java.lang.Integer;
import java.lang.StringBuilder;
import zjd.h;
import akd.o;
import com.yxcorp.upgrade.impl.c;
import android.app.Application;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.yxcorp.upgrade.impl.UpgradeLoadingDialog;
import akd.r;
import java.lang.Runnable;
import akd.q;
import java.util.List;
import java.util.Iterator;
import com.yxcorp.upgrade.impl.e$a;
import android.app.Application$ActivityLifecycleCallbacks;
import java.util.Objects;
import akd.f;

public class e implements a	// class@000996
{
    public SharedPreferences a;
    public a b;
    public b c;
    public o d;
    public h e;
    public g f;
    public c g;
    public Handler h;
    public Application$ActivityLifecycleCallbacks i;
    public boolean j;
    public a k;
    public boolean l;

    public void e(){
       super();
       this.h = new Handler(Looper.getMainLooper());
       this.j = false;
    }
    public void a(b p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "6")) {
          return;
       }
       this.b(p0, true);
       return;
    }
    public final void b(b p0,boolean p1){
       File obj1;
       a uoa;
       boolean b;
       e c;
       b g;
       a c2;
       g$a uoa2;
       b n;
       c a;
       b uob = this;
       Activity obj = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(obj, Boolean.valueOf(p1), uob, uoe, "7")) {
          return;
       }
       if (uob.j == null) {
          return;
       }
       int i = 2;
       int i1 = 0;
       if (obj == null) {
          if (uob.g.f != null) {
             obj = p.c().c();
             if (obj != null) {
                Toast.makeText(obj, obj.getResources().getString(R.string.arg_RES_7f104f8c), i1).show();
             }
          }
          uob.e(i);
          return;
       }else {
          e f = uob.f;
          if (f != null) {
             f.k(obj);
          }
          uob.c = obj;
          int i2 = 3;
          if (obj.a == null) {
             if (uob.g.f != null) {
                obj = p.c().c();
                if (obj != null) {
                   Toast.makeText(obj, obj.getResources().getString(R.string.arg_RES_7f103980), i1).show();
                }
             }
             uob.e(i2);
             return;
          }else {
             b l = obj.l;
             if (l <= null || l < uob.b.g) {
                uob.e(14);
                return;
             }else if(obj.c == null && TextUtils.isEmpty(obj.i)){
                uob.e(i);
                return;
             }else {
                uob.a = b0.a();
                int i3 = 4;
                Object[] objArray = null;
                d uod = 1;
                if (uob.c.b == null && p1) {
                   obj1 = PatchProxy.apply(objArray, uob, uoe, "9");
                   uoa = null;
                   if (obj1 != patchProxyRe) {
                      b = obj1.booleanValue();
                   }else {
                      n = uob.c.p;
                      if (n - uoa < 0) {
                         a = uob.g.a;
                      }
                      if ((System.currentTimeMillis() - uob.a.getLong("last_show_upgrade_time", uoa)) - a > 0) {
                         b = true;
                      }else {
                         b = false;
                      }
                   }
                   if (!b) {
                      uob.e(i3);
                      return;
                   }else {
                      obj1 = PatchProxy.apply(objArray, uob, uoe, "8");
                      if (obj1 != patchProxyRe) {
                         b = obj1.booleanValue();
                      }else {
                         n = uob.c.n;
                         v1 = n - uoa;
                         if (obj1 >= 0) {
                            if (!obj1) {
                               n = uob.g.b;
                            }
                            long l1 = System.currentTimeMillis();
                            c c3 = uob.g.c;
                            String str = "first_install_time";
                            if (!c3 - uoa) {
                               c3 = uob.a.getLong(str, uoa);
                            }
                            if (!c3 - uoa) {
                               c3 = System.currentTimeMillis();
                               SharedPreferences$Editor uEditor = uob.a.edit();
                               uEditor.putLong(str, c3);
                               g.a(uEditor);
                            }
                            if ((l1 - c3) - n <= 0) {
                               b = false;
                            }
                         }
                         b = true;
                      }
                      if (!b) {
                         uob.e(13);
                         return;
                      }
                   }
                }
             label_0139 :
                if (uob.c.q != uod) {
                   if (!PatchProxy.applyVoid(objArray, uob, uoe, "11")) {
                      if (uob.l == null) {
                         obj1 = PatchProxy.apply(objArray, uob, uoe, "12");
                         if (obj1 != patchProxyRe) {
                            i1 = obj1.booleanValue();
                         }else {
                            c = uob.c;
                            g = c.g;
                            if (g == uod || (g == i && !TextUtils.isEmpty(c.f))) {
                               i1 = true;
                            }
                         }
                         if (i1) {
                            if (!PatchProxy.applyVoid(objArray, uob, uoe, "13")) {
                               obj1 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                               p.b().getInstance().a(uob.c.f, obj1.getAbsolutePath(), uob.c(uob.c.g), false, false, new d(uob, obj1));
                            }
                         }
                      }
                      this.g();
                   }
                }else if(PatchProxy.applyVoid(objArray, uob, uoe, "10") || uob.j == null){
                   c = uob.f;
                   if (c != null) {
                      c.b();
                   }
                   a uoa1 = new a();
                   uob.k = uoa1;
                   e c1 = uob.c;
                   uoe = uob.f;
                   f = uob.e;
                   e d = uob.d;
                   e g1 = uob.g;
                   uoa = a.class;
                   if (PatchProxy.isSupport(uoa)) {
                      Object[] objArray1 = new Object[]{c1,uoe,f,d,g1};
                      if (!PatchProxy.applyVoid(objArray1, uoa1, uoa, "2")) {
                      }
                   }else {
                   }
                }
             label_0222 :
                return;
             }
          }
       }
    }
    public String c(int p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoe, "19");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 == 1) {
          return this.c.k+".png";
       }else {
          return this.c.k+".mp4";
       }
    }
    public final boolean d(c p0,a p1,g p2,h p3,o p4){
       boolean b;
       if (PatchProxy.isSupport(e.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          Object obj = PatchProxy.apply(objArray, this, e.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       this.g = p0;
       this.b = p1;
       this.f = p2;
       this.e = p3;
       this.d = p4;
       if (p3 == null) {
          this.e = new c();
          this.l = false;
       }else {
          this.l = true;
       }
       if (p0.e != null) {
          try{
             p0 = PatchProxy.apply(null, this, e.class, "20");
             if (p0 != PatchProxyResult.class) {
                b = p0.booleanValue();
             }else {
                ConnectivityManager systemServic = p.c().getApplication().getSystemService("connectivity");
                if (systemServic != null) {
                   NetworkInfo networkInfo = systemServic.getNetworkInfo(1);
                   if (networkInfo != null && networkInfo.isConnected()) {
                      b = true;
                   }
                }
                b = false;
             }
          }catch(java.lang.Exception e0){
          }
          if (!b) {
             this.e(1);
             return 0;
          }
       }
       this.j = true;
       this.c = null;
       g.a = this.g.i;
       return 1;
    }
    public final void e(int p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoe, "17")) {
          return;
       }
       if (this.g.f != null) {
          UpgradeLoadingDialog.Vg();
       }
       this.f();
       if (this.f != null) {
          this.h.post(new r(this, p0));
       }
       return;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, e.class, "18")) {
          return;
       }
       if (this.d != null) {
          this.h.post(new q(this));
       }
       return;
    }
    public void g(){
       SharedPreferences$Editor obj;
       boolean b;
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "15")) {
          return;
       }
       if (this.j == null) {
          return;
       }
       if (this.g.f != null) {
          UpgradeLoadingDialog.Vg();
       }
       int i = 0;
       if (this.c.b == null) {
          obj = PatchProxy.apply(objArray, this, uoe, "16");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             c d = this.g.d;
             if (d != null && d.size()) {
                if (p.c().c() != null) {
                   String name = p.c().c().getClass().getName();
                   Iterator iterator = this.g.d.iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         if (!(iterator.next()).equals(name)) {
                            continue ;
                         }
                      }
                   }
                }
                b = false;
             }
          label_0077 :
             b = true;
          }
          if (!b) {
             if (this.i == null) {
                this.i = new e$a(this);
                p.c().getApplication().registerActivityLifecycleCallbacks(this.i);
             }
             return;
          }
       }
       if (this.i != null) {
          p.c().getApplication().unregisterActivityLifecycleCallbacks(this.i);
          this.i = objArray;
       }
       obj = this.a.edit();
       obj.putLong("last_show_upgrade_time", System.currentTimeMillis());
       g.a(obj);
       uoe = this.f;
       if (uoe != null) {
          uoe.f();
       }
       a uoa = new a();
       this.k = uoa;
       e tc = this.c;
       e tf = this.f;
       e te = this.e;
       e td = this.d;
       e tg = this.g;
       Objects.requireNonNull(uoa);
       if (PatchProxy.isSupport(a.class)) {
          Object[] objArray1 = new Object[]{tc,tf,te,td,tg};
          if (PatchProxy.applyVoid(objArray1, uoa, a.class, "1")) {
          label_0125 :
             return;
          }
       }
       uoa.c = tc;
       uoa.e = tf;
       uoa.d = te;
       uoa.f = td;
       uoa.g = tg;
       uoa.h = p.b().getInstance();
       uoa.a = true;
       if (uoa.l == null) {
          uoa.l = new f(uoa);
          p.c().getApplication().registerActivityLifecycleCallbacks(uoa.l);
       }
       uoa.l();
       goto label_0125 ;
    }
}
