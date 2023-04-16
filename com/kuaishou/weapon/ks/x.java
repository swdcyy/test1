package com.kuaishou.weapon.ks.x;
import android.content.Context;
import java.lang.Object;
import android.os.HandlerThread;
import java.lang.String;
import java.util.Hashtable;
import org.json.JSONArray;
import com.kuaishou.weapon.ks.d;
import com.kuaishou.weapon.ks.ah;
import com.kuaishou.weapon.ks.aa;
import java.io.File;
import com.kuaishou.weapon.ks.b;
import org.json.JSONObject;
import android.os.Handler;
import com.kuaishou.weapon.ks.x$2;
import java.lang.Runnable;
import com.kuaishou.weapon.i.WeaponCB;
import java.lang.Class;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Integer;
import com.kuaishou.weapon.ks.r;
import com.kuaishou.weapon.ks.x$9;
import com.kuaishou.weapon.ks.bs;
import com.kuaishou.weapon.ks.bd;
import java.lang.System;
import com.kuaishou.weapon.i.WeaponHI;
import android.os.Looper;
import com.kuaishou.weapon.ks.x$4;
import java.util.HashMap;
import java.lang.Throwable;
import java.util.Map;
import com.kuaishou.weapon.ks.x$8;
import java.lang.StringBuilder;
import java.util.List;
import java.util.Iterator;
import com.kuaishou.weapon.ks.z;
import com.kuaishou.weapon.ks.y;
import java.lang.ClassLoader;
import java.lang.reflect.Method;
import com.kuaishou.weapon.i.WeaponI;
import java.util.concurrent.ThreadPoolExecutor;
import java.lang.Boolean;
import com.kuaishou.weapon.ks.bf;
import com.kuaishou.weapon.ks.an;
import com.kuaishou.weapon.ks.az;
import android.content.pm.PackageInfo;
import com.kuaishou.weapon.ks.ba;
import com.kuaishou.weapon.ks.be;
import t38.a;
import com.kuaishou.weapon.ks.x$3;
import com.kuaishou.weapon.ks.x$1;
import com.kuaishou.weapon.ks.x$5;
import com.kuaishou.weapon.ks.x$6;
import com.kuaishou.weapon.ks.x$7;
import java.util.Comparator;
import java.util.Collections;
import com.kuaishou.weapon.ks.ay;

public class x	// class@00123b
{
    public int A;
    public int B;
    public int C;
    public Handler D;
    public String h;
    public Map i;
    public JSONArray j;
    public boolean l;
    public boolean m;
    public d n;
    public Context o;
    public ah q;
    public Handler r;
    public HandlerThread s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;
    public static x k;
    public static int p;

    public void x(Context p0){
       super();
       this.l = false;
       this.m = false;
       this.s = new HandlerThread("pluginFKHandlerThread");
       this.t = 0;
       this.u = -1;
       this.v = -1;
       this.w = -1;
       this.x = -1;
       this.y = -1;
       this.z = -1;
       this.A = -1;
       this.B = -1;
       this.C = -1;
       this.i = new Hashtable();
       this.j = new JSONArray();
       this.o = p0;
       this.n = d.a(p0);
       this.q = ah.a(p0);
    }
    public static int a(x p0,int p1){
       p0.u = p1;
       return p1;
    }
    public static d a(x p0){
       return p0.n;
    }
    public static x a(){
       return x.k;
    }
    public static synchronized x a(Context p0){
       _monitor_enter(x.class);
       try{
          if (x.k == null) {
             x.k = new x(p0);
          }
          _monitor_exit(x.class);
          return x.k;
       }catch(java.lang.Exception e0){
          _monitor_exit(e0);
          return null;
       }
    }
    public static void a(x p0,int p1,int p2){
       p0.a(p1, p2);
    }
    public static int b(x p0){
       return p0.u;
    }
    public static int b(x p0,int p1){
       p0.v = p1;
       return p1;
    }
    public static void b(int p0){
       x.p = p0;
    }
    public static int c(x p0,int p1){
       p0.w = p1;
       return p1;
    }
    public static Context c(x p0){
       return p0.o;
    }
    public static int d(x p0){
       return p0.v;
    }
    public static int d(x p0,int p1){
       p0.x = p1;
       return p1;
    }
    public static int e(x p0){
       return p0.w;
    }
    public static int e(x p0,int p1){
       p0.y = p1;
       return p1;
    }
    public static int f(x p0){
       return p0.x;
    }
    public static int f(x p0,int p1){
       p0.z = p1;
       return p1;
    }
    public static int g(x p0){
       return p0.y;
    }
    public static int g(x p0,int p1){
       p0.A = p1;
       return p1;
    }
    public static int h(x p0){
       return p0.z;
    }
    public static int h(x p0,int p1){
       p0.B = p1;
       return p1;
    }
    public static int i(x p0){
       return p0.A;
    }
    public static int i(x p0,int p1){
       p0.C = p1;
       return p1;
    }
    public static int j(x p0){
       return p0.B;
    }
    public static void j(x p0,int p1){
       p0.d(p1);
    }
    public static int k(x p0){
       return p0.C;
    }
    public static int l(x p0){
       x t = p0.t;
       p0.t = t + 1;
       return t;
    }
    public static ah m(x p0){
       return p0.q;
    }
    public static boolean n(x p0){
       return p0.l;
    }
    public void a(int p0){
       aa uoaa = this.q.a(p0);
       if (uoaa == null) {
          return;
       }
       this.q.f(p0);
       File uFile = new File(uoaa.e);
       if (!uFile.exists()) {
          return;
       }
       b.a(uFile);
       uFile.delete();
       return;
    }
    public final void a(int p0,int p1){
       if (this.D != null && this.j.length() < 50) {
          JSONObject jSONObject = new JSONObject();
          jSONObject.put("1", p1);
          jSONObject.put("2", p0);
          this.j.put(jSONObject);
          this.D.removeCallbacksAndMessages(null);
          this.D.postDelayed(new x$2(this), 5000);
       }
       return;
    }
    public void a(int p0,String p1,WeaponCB p2){
       Object[] objArray = new Object[0];
       this.a(p0, p1, p2, null, objArray);
    }
    public void a(int p0,String p1,WeaponCB p2,Class[] p3,Object[] p4){
       if (TextUtils.isEmpty(p1)) {
          if (p2 != null) {
             Object[] objArray = new Object[]{Integer.valueOf(1)};
             p2.onHappenError(objArray);
          }
          return;
       }else {
          x$9 u9 = new x$9(this, p0, p2, p1, p3, p4);
          r.a().a(v8);
          return;
       }
    }
    public synchronized void a(WeaponCB p0){
       String[] stringArray = bs.a(this.o);
       if (stringArray != null && stringArray.length == 2) {
          int i = 0;
          if (!TextUtils.isEmpty(stringArray[i])) {
             int i1 = 1;
             if (!TextUtils.isEmpty(stringArray[i1])) {
                if (this.l != null) {
                   if (p0 != null) {
                      Object[] objArray = new Object[i];
                      p0.onEndTask(objArray);
                   }
                   return;
                }else {
                   this.l = i1;
                   this.n.a("wwv", "5.9.2", i);
                   this.h = bs.e(this.o);
                   if (this.d()) {
                      new bd(this.o).a(i);
                      this.b(this.o);
                   }else {
                      this.b(this.o);
                      new bd(this.o).a(i);
                   }
                   WeaponHI.t2 = System.currentTimeMillis();
                   x ts = this.s;
                   if (ts != null) {
                      ts.start();
                      this.r = new Handler(this.s.getLooper());
                   }
                   this.r.removeCallbacksAndMessages(null);
                   this.r.postDelayed(new x$4(this, p0), 5000);
                   return;
                }
             }
          }
       }
       return;
    }
    public void a(String p0){
       r.a().a(new x$8(this, p0));
    }
    public void a(String p0,aa p1){
       this.q.a(p0);
       File uFile = new File(p1.e);
       if (uFile.exists()) {
          b.a(uFile);
          uFile.delete();
       }
       bs.c(this.o.getFilesDir().getCanonicalPath()+"/."+p1.a);
       return;
    }
    public void a(String p0,String p1){
       if (!TextUtils.isEmpty(p0) && !TextUtils.isEmpty(p1)) {
          bs.c(p0, p1);
          this.n.b(p0, p1);
       }
       return;
    }
    public synchronized void a(String p0,String p1,String p2,String p3,String p4){
       if (!d.a(this.o).a("a1_n_i_v", 0) && (!p0.equals("5") && (!p0.equals("28") && (!p0.equals("29") && (p0.equals("30") || p0.equals("31")))))) {
          return;
       }
       Iterator iterator = this.q.b().iterator();
       while (iterator.hasNext()) {
          aa uoaa = iterator.next();
          z oz = z.a();
          aa uoaa1 = null;
          if (oz != null) {
             uoaa1 = oz.d(uoaa.c);
          }
          if (uoaa1 != null && (TextUtils.isEmpty(uoaa1.c) || !(uoaa1.c).contains("p0"))) {
             continue ;
          }
          Class uClass = uoaa1.g.loadClass(uoaa1.c+".WeaponExt");
          Class[] uClassArray = new Class[]{Context.class};
          Object[] objArray = new Object[]{this.o};
          uClass.getDeclaredMethod("getInstance", uClassArray).invoke(uClass, objArray).b(p0, p1, p2, p3, p4);
       }
       return;
    }
    public synchronized void a(boolean p0,WeaponCB p1){
       try{
          if (this.m != null && p0) {
             return;
          }
          WeaponHI.t3 = System.currentTimeMillis();
          boolean b = true;
          this.m = b;
          r.a().b().setCorePoolSize(3);
          r.a().b().setMaximumPoolSize(6);
          if (p0) {
             Iterator iterator = this.q.b().iterator();
             while (iterator.hasNext()) {
                aa uoaa = iterator.next();
                String canonicalPat = this.o.getFilesDir().getCanonicalPath();
                if (canonicalPat == null) {
                   continue ;
                }
                uoaa.m = canonicalPat+"/."+uoaa.a;
                bs.c(uoaa.m+"/lib");
                bs.c(uoaa.m);
             }
          }
          this.q.c();
          if (!this.n.f("wiipaot")) {
             this.n.a("wiipaot", Boolean.TRUE, b);
          }else {
             this.q.d();
          }
          r.a().a(new bf(this.o, b, false));
          if (p1 != null) {
             Object[] objArray = new Object[false];
             p1.onEndTask(objArray);
          }
          if (p0) {
             new an(this.o).a(false);
             new az(this.o).a(false);
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public synchronized boolean a(int p0,String p1,PackageInfo p2){
       return this.a(p0, p1, null, false, p2);
    }
    public synchronized final boolean a(int p0,String p1,String p2,boolean p3,PackageInfo p4){
       HashMap hashMap;
       String str2;
       object oobject;
       object oobject1;
       x ox = this;
       int i = p0;
       String obj = p1;
       PackageInfo packageInfo = p4;
       String str = String.class;
       StringBuilder str1 = 1;
       if (p3 && ox.q.c(i) != str1) {
          return false;
       }
       aa uoaa = ox.q.a(i);
       int i1 = -1;
       if (uoaa == null) {
          ox.q.c(i, i1);
          hashMap = new HashMap();
          hashMap.put("pk", i+"");
          hashMap.put("pv", obj);
          hashMap.put("e", ba.r);
          hashMap.put("l", "CBH00");
          str2 = "n";
          obj = (d.a(ox.o).f("a1_p_s_p_s"))? "0": "1";
          hashMap.put(str2, obj);
          bs.a(ox.o, "1002001", hashMap);
          return false;
       }else {
          File uFile = new File(uoaa.e);
          if (!bs.a(uFile)) {
             ox.q.c(i, i1);
             hashMap = new HashMap();
             hashMap.put("pk", i+"");
             hashMap.put("pv", obj);
             hashMap.put("e", ba.s);
             hashMap.put("l", "CBH");
             hashMap.put("p", uoaa.e);
             str2 = "x";
             obj = (bs.a(uFile))? "1": "0";
             hashMap.put(str2, obj);
             str2 = "n";
             obj = (d.a(ox.o).f("a1_p_s_p_s"))? "0": "1";
             hashMap.put(str2, obj);
             bs.a(ox.o, "1002001", hashMap);
             return false;
          }else if(packageInfo){
             uoaa.s = packageInfo;
          }
          z oz = z.a(ox.o.getApplicationContext(), str1);
          if (!oz.a(uoaa, false)) {
             ox.q.c(i, i1);
             oz.a(uoaa.e);
             hashMap = new HashMap();
             hashMap.put("pk", i+"");
             hashMap.put("pv", obj);
             hashMap.put("e", ba.t);
             hashMap.put("l", "CBH");
             str2 = "n";
             obj = (d.a(ox.o).f("a1_p_s_p_s"))? "0": "1";
             hashMap.put(str2, obj);
             bs.a(ox.o, "1002001", hashMap);
             x.k.f();
             return false;
          }else {
             String[] stringArray = bs.a(ox.o);
             String str3 = 2;
             if (stringArray != null && (stringArray.length == str3 && (!TextUtils.isEmpty(stringArray[0]) && !TextUtils.isEmpty(stringArray[str1])))) {
                oobject = stringArray[0];
                oobject1 = stringArray[str1];
             }else {
                oobject = "16";
                oobject1 = "62c80c436b7547a68a12774c67519836";
             }
             uoaa = oz.c(uoaa.e);
             aa g = uoaa.g;
             if (!(uoaa.c).endsWith("v7") && !(uoaa.c).endsWith("v8")) {
                Class uClass = g.a(uoaa.c+".WeaponEngineImpl");
                if (uClass == null) {
                   g.a("java.lang.String");
                   ox.q.c(i, i1);
                   hashMap = new HashMap();
                   hashMap.put("pk", i+"");
                   hashMap.put("pv", obj);
                   hashMap.put("e", ba.u);
                   hashMap.put("l", "CBH");
                   str = "n";
                   str3 = (d.a(ox.o).f("a1_p_s_p_s"))? "0": "1";
                   hashMap.put(str, str3);
                   bs.a(ox.o, "1002001", hashMap);
                   return false;
                }else {
                   Class[] uClassArray = new Class[str1];
                   uClassArray[0] = Context.class;
                   Object[] objArray = new Object[str1];
                   objArray[0] = ox.o;
                   Object obj1 = uClass.getDeclaredMethod("getInstance", uClassArray).invoke(uClass, objArray);
                   Class[] uClassArray1 = new Class[]{str,str,str,str,str};
                   Object[] objArray1 = new Object[]{oobject,oobject1,"5.9.2",bs.e(ox.o),bs.a()};
                   bs.a(obj1, "setWeaponSecurityVerifyInfo", uClassArray1, objArray1);
                   Class[] uClassArray2 = new Class[]{Integer.TYPE,Boolean.TYPE,Object.class};
                   objArray1 = new Object[]{Integer.valueOf(uoaa.x),Boolean.valueOf(ox.n.f("whcs")),null};
                   if (!bs.a(obj1, "init", uClassArray2, objArray1).booleanValue()) {
                      ox.q.c(i, -1);
                      oz.a(uoaa.e);
                      return false;
                   }
                }
             }
             uoaa.b = str1;
             uoaa.p = str1;
             ox.q.a(uoaa);
             return str1;
          }
       }
    }
    public boolean a(aa p0,String p1,String p2){
       HashMap hashMap;
       int i1;
       object oobject1;
       object oobject2;
       x ox = this;
       aa uoaa = p0;
       String str = "v8";
       String str1 = "v7";
       String str2 = String.class;
       String str3 = "0";
       String str4 = "1";
       String str5 = "n";
       String str6 = "l";
       String str7 = "e";
       boolean b = false;
       if (!uoaa) {
          hashMap = new HashMap();
          hashMap.put(str7, ba.y);
          hashMap.put(str6, "CBH22");
          if (!d.a(ox.o).f("a1_p_s_p_s")) {
          label_0039 :
             str3 = str4;
          }
       }else {
          File uFile = new File(uoaa.e);
          if (!bs.a(uFile)) {
             hashMap = new HashMap();
             hashMap.put(str7, ba.A);
             hashMap.put(str6, "CBH11");
             if (!d.a(ox.o).f("a1_p_s_p_s")) {
             }
          }else {
             object oobject = null;
             if (!ox.q.b(uoaa.a)) {
                ox.q.a(uoaa);
             }
             z oz = z.a(ox.o.getApplicationContext(), true);
             String str8 = str7;
             String str9 = str6;
             int i = 1;
             ox.q.b(uoaa.a, i);
             ox.b(uoaa.c);
             if (!oz.a(uoaa, i)) {
                b.a(uFile);
                uFile.delete();
                p1 = str3;
                str3 = str5;
                this.a(uoaa.a, uoaa.d, null, 1, 0);
                ox.q.b(uoaa.a, 0);
                hashMap = new HashMap();
                hashMap.put(str8, ba.B);
                hashMap.put(str9, "CBH");
                hashMap.put("apk1", p0.toString());
                String str10 = (d.a(ox.o).f("a1_p_s_p_s"))? p1: str4;
                hashMap.put(str3, str10);
                bs.a(ox.o, "1002001", hashMap);
                return 0;
             }else {
                File uFile1 = uFile;
                p1 = str3;
                String str11 = str8;
                str7 = str9;
                str3 = str5;
                String[] stringArray = bs.a(ox.o);
                aa uoaa1 = 2;
                if (stringArray != null && (stringArray.length == uoaa1 && !TextUtils.isEmpty(stringArray[0]))) {
                   i1 = 1;
                   if (!TextUtils.isEmpty(stringArray[i1])) {
                      oobject1 = stringArray[0];
                      oobject2 = stringArray[i1];
                   label_0160 :
                      aa uoaa2 = oz.c(uoaa.e);
                      if (uoaa2 == null) {
                         ox.q.b(uoaa2.a, 0);
                         hashMap = new HashMap();
                         hashMap.put(str11, ba.z);
                         hashMap.put(str7, "CBH");
                         str6 = (d.a(ox.o).f("a1_p_s_p_s"))? p1: str4;
                         hashMap.put(str3, str6);
                         bs.a(ox.o, "1002001", hashMap);
                         return false;
                      }else if(!(uoaa2.c).endsWith(str1) && !(uoaa2.c).endsWith(str)){
                         Class uClass = uoaa2.g.a(uoaa2.c+".WeaponEngineImpl");
                         if (uClass == null) {
                            b.a(uFile1);
                            uFile1.delete();
                            ox.q.b(uoaa2.a, 0);
                            hashMap = new HashMap();
                            hashMap.put(str11, ba.C);
                            hashMap.put(str7, "CBH");
                            hashMap.put("apk2", uoaa2.toString());
                            str6 = (d.a(ox.o).f("a1_p_s_p_s"))? p1: str4;
                            hashMap.put(str3, str6);
                            bs.a(ox.o, "1002001", hashMap);
                            return false;
                         }else {
                            str8 = str4;
                            Class[] uClassArray = new Class[i1];
                            int i2 = 0;
                            uClassArray[i2] = Context.class;
                            Object[] objArray = new Object[i1];
                            objArray[i2] = ox.o;
                            String obj = uClass.getDeclaredMethod("getInstance", uClassArray).invoke(uClass, objArray);
                            if (obj == null) {
                               hashMap = new HashMap();
                               hashMap.put(str11, ba.D);
                               hashMap.put(str7, "CBH");
                               hashMap.put("apk3", uoaa2.toString());
                               obj = (d.a(ox.o).f("a1_p_s_p_s"))? p1: str8;
                               hashMap.put(str3, obj);
                               bs.a(ox.o, "1002001", hashMap);
                               return false;
                            }else {
                               Class[] uClassArray1 = new Class[]{str2,str2,str2,str2,str2};
                               Object[] objArray1 = new Object[]{oobject1,oobject2,"5.9.2",bs.e(ox.o),bs.a()};
                               bs.a(obj, "setWeaponSecurityVerifyInfo", uClassArray1, objArray1);
                               Class[] uClassArray2 = new Class[]{Integer.TYPE,Boolean.TYPE,Object.class};
                               Object[] objArray2 = new Object[]{Integer.valueOf(uoaa2.x),Boolean.FALSE,oobject};
                               if (!bs.a(obj, "init", uClassArray2, objArray2).booleanValue()) {
                                  b.a(uFile1);
                                  ox.b(uoaa2.c);
                                  uFile1.delete();
                                  ox.q.b(uoaa2.a, 0);
                                  hashMap = new HashMap();
                                  hashMap.put(str11, ba.E);
                                  hashMap.put(str7, "CBH");
                                  hashMap.put("apk5", uoaa2.toString());
                                  obj = (d.a(ox.o).f("a1_p_s_p_s"))? p1: str8;
                                  hashMap.put(str3, obj);
                                  bs.a(ox.o, "1002001", hashMap);
                                  return false;
                               }
                            }
                         }
                      }
                      aa uoaa3 = ox.q.a(uoaa2.a);
                      if (uoaa3 != null && !(uoaa3.d).equals(uoaa2.d)) {
                         oobject = new File(uoaa3.e);
                      }
                      uoaa2.b = 1;
                      uoaa2.p = 1;
                      if (ox.q.a(uoaa2) > 0 && (oobject != null && oobject.exists())) {
                         b.a(oobject);
                         oobject.delete();
                      }
                   label_0411 :
                      ox.q.b(uoaa2.a, 0);
                      return true;
                   }
                }else {
                   i1 = 1;
                }
                oobject1 = "16";
                oobject2 = "62c80c436b7547a68a12774c67519836";
                goto label_0160 ;
             }
          }
       }
       hashMap.put(str5, str3);
       bs.a(ox.o, "1002001", hashMap);
       return b;
    }
    public void b(){
       this.a(null);
    }
    public final void b(Context p0){
       d uod = d.a(p0);
       long l = uod.j();
       long l1 = (System.currentTimeMillis() - l) - ((long)uod.a("plc001_pd_pti_s", 12) * 0x36ee80);
       if (l - 1 < 0 || l1 - null > 0) {
          r.a().a(new be(p0));
       }
       return;
    }
    public void b(String p0){
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       z oz = z.a();
       if (oz == null) {
          return;
       }
       aa uoaa = oz.d(p0);
       if (uoaa == null) {
          return;
       }
       aa g = uoaa.g;
       if (g == null) {
          return;
       }
       Class uClass = g.a(uoaa.c+".WeaponEngineImpl");
       if (uClass == null) {
          return;
       }
       Class[] uClassArray = new Class[]{Context.class};
       Object[] objArray = new Object[]{this.o};
       Object obj = uClass.getDeclaredMethod("getInstance", uClassArray).invoke(uClass, objArray);
       if (obj == null) {
          return;
       }
       Object[] objArray1 = new Object[0];
       bs.a(obj, "unload", null, objArray1);
       oz.b(p0);
       return;
    }
    public void c(){
       if (this.D == null) {
          this.D = new Handler(Looper.getMainLooper());
       }
       a.c().b = new x$3(this);
       return;
    }
    public synchronized void c(int p0){
       Iterator iterator = this.q.b().iterator();
       while (iterator.hasNext()) {
          aa uoaa = iterator.next();
          z oz = z.a();
          aa uoaa1 = null;
          if (oz != null) {
             uoaa1 = oz.d(uoaa.c);
          }
          if (uoaa1 != null && (TextUtils.isEmpty(uoaa1.c) || !(uoaa1.c).contains("p0"))) {
             continue ;
          }
          Class uClass = uoaa1.g.loadClass(uoaa1.c+".WeaponExt");
          Class[] uClassArray = new Class[]{Context.class};
          Object[] objArray = new Object[]{this.o};
          uClass.getDeclaredMethod("getInstance", uClassArray).invoke(uClass, objArray).e(p0);
       }
       return;
    }
    public final void d(int p0){
       int i = 1;
       if (this.i.containsKey(Integer.valueOf(p0))) {
          this.i.put(Integer.valueOf(p0), Integer.valueOf((this.i.get(Integer.valueOf(p0)).intValue() + i)));
       }else {
          this.i.put(Integer.valueOf(p0), Integer.valueOf(i));
       }
       x tD = this.D;
       if (tD != null) {
          tD.removeCallbacksAndMessages(null);
          this.D.postDelayed(new x$1(this), 5000);
       }
       return;
    }
    public boolean d(){
       boolean b = (!WeaponHI.ps && d.a(this.o).i() <= 0)? true: false;
       return b;
    }
    public void e(){
       x tr = this.r;
       if (tr == null) {
          return;
       }
       tr.removeCallbacksAndMessages(null);
       this.r.post(new x$5(this));
       return;
    }
    public void f(){
       try{
          if (this.n.a("plc001_pd_pti_ps", 0) != 1) {
             return;
          }
          int i = this.n.a("plc001_pd_pti_pc", 3);
          int i1 = this.n.a("plc001_pd_pti_pi", 15);
          x tr = this.r;
          if (tr == null) {
             return;
          }
          if (this.t >= i) {
             tr.removeCallbacksAndMessages(null);
             return;
          }else {
             tr.removeCallbacksAndMessages(null);
             this.r.postDelayed(new x$6(this), ((long)i1 * 0xea60));
             return;
          }
       }catch(java.lang.Exception e0){
       }
    }
    public void g(){
       List list = this.q.b();
       List list1 = this.n.c();
       List list2 = this.n.d();
       int i = 0;
       while (i < list1.size()) {
          if (!list2.contains(list1.get(i))) {
             list2.add(list1.get(i));
          }
          i = i + 1;
       }
       Collections.sort(list, new x$7(this, list2));
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          aa uoaa = iterator.next();
          z oz = z.a();
          aa uoaa1 = (oz != null)? oz.d(uoaa.c): null;
          if (uoaa1 != null) {
             continue ;
          }else if(this.n.e()){
             File uFile = new File(this.o.getFilesDir(), ".bud");
             if (!uFile.exists()) {
                uFile.mkdir();
             }
             File uFile1 = new File(uoaa.e);
             File uFile2 = new File(uFile, uoaa.a+"-"+uoaa.d);
             if (!bs.a(uFile2)) {
                bs.a(uFile1, uFile2);
             }
             b.a(uFile1, uFile2);
          }
          this.a(uoaa.a, uoaa.d, null);
       }
       return;
    }
    public synchronized void h(){
       z oz = z.a();
       if (oz == null) {
          return;
       }
       Iterator iterator = oz.b().iterator();
       while (iterator.hasNext()) {
          aa uoaa = oz.d(iterator.next().c);
          if (uoaa != null && (TextUtils.isEmpty(uoaa.c) || !(uoaa.c).contains("p0"))) {
             continue ;
          }else {
             Class uClass = uoaa.g.loadClass("com.kuaishou.weapon.p0.receiver.WeaponReceiver");
             Class[] uClassArray = new Class[0];
             Object[] objArray = new Object[0];
             uClass.getDeclaredMethod("doEnv", uClassArray).invoke(uClass, objArray);
          }
       }
       return;
    }
    public synchronized void i(){
       new ay(this.o).a();
       int i = 103;
       new bd(this.o).a(i);
       new an(this.o).a(i);
       z oz = z.a();
       if (oz == null) {
          return;
       }
       Iterator iterator = oz.b().iterator();
       while (iterator.hasNext()) {
          aa uoaa = oz.d(iterator.next().c);
          if (uoaa != null && (TextUtils.isEmpty(uoaa.c) || !(uoaa.c).contains("p0"))) {
             continue ;
          }else {
             Class uClass = uoaa.g.loadClass(uoaa.c+".WeaponExt");
             int i1 = 1;
             Class[] uClassArray = new Class[i1];
             uClassArray[0] = Context.class;
             Object[] objArray = new Object[i1];
             objArray[0] = this.o;
             WeaponI weaponI = uClass.getDeclaredMethod("getInstance", uClassArray).invoke(uClass, objArray);
             this.n.a("a1_n_d_i", bs.e(this.o), i1);
             String str = bs.f();
             if (!TextUtils.isEmpty(str)) {
                this.n.a("plc001_lss_ck_d", str, i1);
             }
             weaponI.a();
          }
       }
       return;
    }
}
