package old.soloader.SoLoader;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.HashSet;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collections;
import java.lang.Object;
import java.lang.String;
import android.os.StrictMode$ThreadPolicy;
import java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock;
import android.os.StrictMode;
import java.lang.StringBuilder;
import eud.a;
import old.soloader.g;
import old.soloader.i;
import java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock;
import old.soloader.b;
import java.lang.UnsatisfiedLinkError;
import java.lang.Throwable;
import java.lang.reflect.Method;
import android.os.Build$VERSION;
import java.lang.Runtime;
import java.lang.Class;
import java.lang.ClassLoader;
import eud.b;
import old.soloader.SoLoader$b;
import java.util.ArrayList;
import java.lang.CharSequence;
import java.lang.Iterable;
import android.text.TextUtils;
import old.soloader.SoLoader$a;
import android.content.Context;
import java.lang.System;
import java.io.File;
import old.soloader.c;
import old.soloader.d;
import android.content.pm.ApplicationInfo;
import old.soloader.a;
import java.util.Collection;
import java.lang.RuntimeException;
import eud.c;
import old.soloader.SoLoader$WrongAbiError;

public class SoLoader	// class@002007
{
    public static final boolean a;
    public static b b;
    public static final ReentrantReadWriteLock c;
    public static g[] d;
    public static int e;
    public static i[] f;
    public static b g;
    public static final HashSet h;
    public static final Map i;
    public static final Set j;
    public static c k;
    public static int l;
    public static boolean m;

    static {
       SoLoader.c = new ReentrantReadWriteLock();
       SoLoader.d = null;
       SoLoader.e = 0;
       SoLoader.h = new HashSet();
       SoLoader.i = new HashMap();
       SoLoader.j = Collections.newSetFromMap(new ConcurrentHashMap());
       SoLoader.k = null;
       SoLoader.a = true;
    }
    public void SoLoader(){
       super();
    }
    public static void a(String p0,int p1,StrictMode$ThreadPolicy p2){
       int i;
       ReentrantReadWriteLock reentrantRea;
       ReentrantReadWriteLock c = SoLoader.c;
       c.readLock().lock();
       if (SoLoader.d == null) {
          throw new UnsatisfiedLinkError("couldn\'t find DSO to load: "+p0);
       }
       c.readLock().unlock();
       if (p2 == null) {
          p2 = StrictMode.allowThreadDiskReads();
          i = 1;
       }else {
          i = 0;
       }
       if (SoLoader.a) {
          a.a("SoLoader.loadLibrary["+p0+"]");
       }
       int i1 = 0;
       do {
          SoLoader.c.readLock().lock();
          int e = SoLoader.e;
          int i2 = 0;
          int i3 = 2;
          while (!i1) {
             g[] d = SoLoader.d;
             if (i2 < d.length) {
                i1 = d[i2].a(p0, p1, p2);
                if (i1 == 3 && SoLoader.f != null) {
                   i[] f = SoLoader.f;
                   int len = f.length;
                   int i4 = 0;
                   while (i4 < len) {
                      object oobject = f[i4];
                      _monitor_enter(oobject);
                      Object obj = oobject.h(p0);
                      _monitor_enter(obj);
                      oobject.d = p0;
                      oobject.b(i3);
                      _monitor_exit(obj);
                      _monitor_exit(oobject);
                      int i5 = oobject.a(p0, p1, p2);
                      if (i5 == 1) {
                         i1 = i5;
                         break ;
                      }
                      i4 = i4 + 1;
                   }
                label_0093 :
                   ReentrantReadWriteLock c1 = SoLoader.c;
                   c1.readLock().unlock();
                   len = p1 & 0x02;
                   if (len == i3 && !i1) {
                      c1.writeLock().lock();
                      b g = SoLoader.g;
                      if (g != null && g.d()) {
                         i3 = SoLoader.e + 1;
                         SoLoader.e = i3;
                      }
                      reentrantRea = (SoLoader.e != e)? 1: null;
                      c1.writeLock().unlock();
                   }else {
                      reentrantRea = null;
                   }
                   if (!reentrantRea) {
                   }
                }
             }else {
                goto label_0093 ;
             }
             i2 = i2 + 1;
          }
       } while (!reentrantRea);
       if (SoLoader.a) {
          a.b();
       }
       if (i) {
          StrictMode.setThreadPolicy(p2);
       }
       if (i1 && i1 != 3) {
          return;
       }else {
          throw new UnsatisfiedLinkError("couldn\'t find DSO to load: "+p0);
       }
    }
    public static Method b(){
       String str = String.class;
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT < 23 || sDK_INT > 27) {
          return null;
       }
       try{
          Class[] uClassArray = new Class[]{str,ClassLoader.class,str};
          Method declaredMeth = Runtime.class.getDeclaredMethod("nativeLoad", uClassArray);
          declaredMeth.setAccessible(1);
          return declaredMeth;
       }catch(java.lang.NoSuchMethodException e0){
       }catch(java.lang.SecurityException e0){
       }
    }
    public static synchronized void c(b p0){
       String str2;
       _monitor_enter(SoLoader.class);
       if (p0 != null) {
          SoLoader.b = p0;
          _monitor_exit(SoLoader.class);
          return;
       }else {
          Runtime runtime = Runtime.getRuntime();
          Method method = SoLoader.b();
          SoLoader$a uoa = null;
          boolean b = (method != null)? true: false;
          String str = null;
          String str1 = (b)? SoLoader$b.a(): str;
          if (str1 == null) {
             str2 = str;
          }else {
             str = ":";
             String[] stringArray = str1.split(str);
             ArrayList uArrayList = new ArrayList(stringArray.length);
             int len = stringArray.length;
             while (uoa < len) {
                object oobject = stringArray[uoa];
                if (!oobject.contains("!")) {
                   uArrayList.add(oobject);
                }
                uoa++;
             }
             str2 = TextUtils.join(str, uArrayList);
          }
          SoLoader$a uoa1 = new SoLoader$a(b, str1, str2, runtime, method);
          SoLoader.b = uoa;
          _monitor_exit(SoLoader.class);
          return;
       }
    }
    public static void d(Context p0,int p1,b p2){
       SoLoader.c.writeLock().lock();
       if (SoLoader.d == null) {
          SoLoader.l = p1;
          ArrayList uArrayList = new ArrayList();
          String env = System.getenv("LD_LIBRARY_PATH");
          if (env == null) {
             env = "/vendor/lib:/system/lib";
          }
          String[] stringArray = env.split(":");
          int i = 0;
          for (int i1 = 0; i1 < stringArray.length; i1 = i1 + 1) {
             uArrayList.add(new c(new File(stringArray[i1]), 2));
          }
          if (p0 != null) {
             String str = "lib-main";
             i[] oiArray = null;
             if (p1 & 1) {
                SoLoader.f = oiArray;
                uArrayList.add(i, new d(p0, str));
             }else if(SoLoader.m){
                p1 = 0;
             }else {
                b uob = new b(p0, i);
                SoLoader.g = uob;
                uob.toString();
                uArrayList.add(i, SoLoader.g);
                uob = 1;
             }
             if (SoLoader.l & 0x08) {
                SoLoader.f = oiArray;
             }else {
                ArrayList uArrayList1 = new ArrayList();
                a uoa = new a(p0, new File(p0.getApplicationInfo().sourceDir), str, p1);
                uArrayList1.add(uoa);
                uoa.toString();
                if (p0.getApplicationInfo().splitSourceDirs != null) {
                   ApplicationInfo splitSourceD = p0.getApplicationInfo().splitSourceDirs;
                   int len1 = splitSourceD.length;
                   int i2 = 0;
                   int i3 = 0;
                   while (i2 < len1) {
                      int i4 = i3 + 1;
                      a uoa1 = new a(p0, new File(splitSourceD[i2]), "lib-"+i3, p1);
                      uoa1.toString();
                      uArrayList1.add(uoa1);
                      i2 = i2 + 1;
                      i3 = i4;
                   }
                }
                i[] oiArray1 = new i[uArrayList1.size()];
                SoLoader.f = uArrayList1.toArray(oiArray1);
                uArrayList.addAll(i, uArrayList1);
             }
          }
          g[] ogArray = new g[uArrayList.size()];
          ogArray = uArrayList.toArray(ogArray);
          p1 = SoLoader.g();
          int len = ogArray.length;
          i = len - 1;
          while (len > 0) {
             StringBuilder str1 = "Preparing SO source: "+ogArray[i];
             ogArray[i].b(p1);
             len = i;
          }
          SoLoader.d = ogArray;
          SoLoader.e = SoLoader.e + 1;
       }
       SoLoader.c.writeLock().unlock();
       return;
    }
    public static boolean e(String p0){
       ReentrantReadWriteLock c = SoLoader.c;
       c.readLock().lock();
       boolean b = true;
       if (SoLoader.d == null) {
          if (("http://www.android.com/").equals(System.getProperty("java.vendor.url"))) {
             c.readLock().lock();
             if (SoLoader.d != null) {
                c.readLock().unlock();
             label_0065 :
                c.readLock().unlock();
                if (SoLoader.m) {
                   c k = SoLoader.k;
                   if (k != null) {
                      k.loadLibrary(p0);
                   }
                }
                b = SoLoader.f(System.mapLibraryName(p0), p0, null, 2, null);
             }else {
                throw new RuntimeException("SoLoader.init\(\) not yet called");
             }
          }else {
             _monitor_enter(SoLoader.class);
             b = b ^ SoLoader.h.contains(p0);
             if (b) {
                c k1 = SoLoader.k;
                if (k1 != null) {
                   k1.loadLibrary(p0);
                }else {
                   System.loadLibrary(p0);
                }
             }
             _monitor_exit(SoLoader.class);
             c.readLock().unlock();
          }
       }else {
          goto label_0065 ;
       }
       return b;
    }
    public static boolean f(String p0,String p1,String p2,int p3,StrictMode$ThreadPolicy p4){
       Object obj;
       if (!TextUtils.isEmpty(p1) && SoLoader.j.contains(p1)) {
          return false;
       }
       _monitor_enter(SoLoader.class);
       HashSet h = SoLoader.h;
       if (h.contains(p0)) {
          _monitor_exit(SoLoader.class);
          return false;
       }else {
          Map i = SoLoader.i;
          if (i.containsKey(p0)) {
             obj = i.get(p0);
          }else {
             Object obj1 = new Object();
             i.put(p0, obj1);
             obj = obj1;
          }
          _monitor_exit(SoLoader.class);
          _monitor_enter(obj);
          _monitor_enter(SoLoader.class);
          if (h.contains(p0)) {
             _monitor_exit(SoLoader.class);
             _monitor_exit(obj);
             return false;
          }else {
             _monitor_exit(SoLoader.class);
             try{
                SoLoader.a(p0, p3, p4);
                _monitor_enter(SoLoader.class);
                h.add(p0);
                _monitor_exit(SoLoader.class);
                if (!TextUtils.isEmpty(p1)) {
                   boolean b = SoLoader.j.contains(p1);
                }
                _monitor_exit(obj);
                return true;
             }catch(java.io.IOException e4){
                throw new RuntimeException(e4);
             }catch(java.lang.UnsatisfiedLinkError e4){
                p1 = e4.getMessage();
                if (p1 != null && p1.contains("unexpected e_machine:")) {
                   throw new SoLoader$WrongAbiError(e4);
                }else {
                   throw e4;
                }
             }
          }
       }
    }
    public static int g(){
       ReentrantReadWriteLock c = SoLoader.c;
       c.writeLock().lock();
       int i = (SoLoader.l & 0x02)? 1: 0;
       c.writeLock().unlock();
       return i;
    }
}
