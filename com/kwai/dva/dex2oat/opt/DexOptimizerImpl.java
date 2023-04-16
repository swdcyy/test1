package com.kwai.dva.dex2oat.opt.DexOptimizerImpl;
import aj5.b;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.HashMap;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.os.IBinder;
import android.content.pm.PackageManager;
import java.io.File;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.dva.dex2oat.util.Dex2OatFilesUtil;
import java.lang.ClassLoader;
import asd.c;
import com.kwai.robust.PatchProxyResult;
import com.kwai.dva.dex2oat.opt.DexOptimizerImpl$triggerDex2Oat$1;
import csd.b;
import ptd.e;
import qrd.j0;
import java.lang.IllegalStateException;
import kotlinx.coroutines.sync.SemaphoreKt;
import java.util.Map;
import aj5.b$a;
import com.kwai.dva.dex2oat.opt.DexOptimizerImpl$blockWaitUntilFileExist$1;
import java.lang.StringBuilder;
import qj7.d;
import java.lang.Boolean;
import dsd.a;
import kotlinx.coroutines.c;
import dalvik.system.PathClassLoader;
import dalvik.system.BaseDexClassLoader;
import java.lang.Throwable;
import java.util.Arrays;
import android.os.Binder;
import android.os.Parcel;
import java.io.FileDescriptor;
import com.kwai.plugin.dva.util.b;
import java.lang.reflect.InvocationTargetException;
import com.kwai.dva.dex2oat.opt.DexOptimizerImpl$innerDex2Oat$1;
import java.lang.System;
import nsd.u;
import android.os.Build$VERSION;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import java.util.Objects;
import qrd.i;
import qrd.l1;
import aj5.a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import android.content.ContextWrapper;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.NullPointerException;

public final class DexOptimizerImpl implements b	// class@000d19
{
    public final Context a;
    public final String b;
    public final HashMap c;
    public final Handler d;
    public final ResultReceiver e;
    public final IBinder[] f;
    public final PackageManager[] g;

    public void DexOptimizerImpl(Context p0){
       a.p(p0, "mContext");
       super();
       this.a = p0;
       this.b = "Dex2OatManager";
       this.c = new HashMap();
       Handler handler = new Handler(Looper.getMainLooper());
       this.d = handler;
       this.e = new ResultReceiver(handler);
       int i = 1;
       IBinder[] iBinderArray = new IBinder[i];
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          iBinderArray[i1] = null;
       }
       this.f = iBinderArray;
       PackageManager[] packageManag = new PackageManager[i];
       packageManag[0] = null;
       this.g = packageManag;
       return;
    }
    public void a(String p0,File p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DexOptimizerImpl.class, "1")) {
          return;
       }
       a.p(p0, "apkPath");
       if (p1 == null || (!p1.exists() && !Dex2OatFilesUtil.a.b())) {
          return;
       }
       File uFile = new File(Dex2OatFilesUtil.a.c(new File(p0), p1));
       if (uFile.exists() && uFile.isDirectory()) {
          File[] uFileArray = uFile.listFiles();
          if (uFileArray != null) {
             int len = uFileArray.length;
             for (int i = 0; i < len; i = i + 1) {
                uFileArray[i].delete();
             }
          }
       }
       return;
    }
    public Object b(String p0,File p1,String p2,ClassLoader p3,c p4){
       object obj1;
       DexOptimizerImpl$triggerDex2Oat$1 l$0;
       DexOptimizerImpl$triggerDex2Oat$1 l$1;
       DexOptimizerImpl$triggerDex2Oat$1 otriggerDex2;
       DexOptimizerImpl$triggerDex2Oat$1 otriggerDex21;
       DexOptimizerImpl$triggerDex2Oat$1 otriggerDex22;
       Object obj = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       object oobject4 = p4;
       DexOptimizerImpl uDexOptimize = DexOptimizerImpl.class;
       int i = 0;
       int i1 = 1;
       if (PatchProxy.isSupport(uDexOptimize)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,oobject3,oobject4};
          obj1 = PatchProxy.apply(objArray, obj, uDexOptimize, "2");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       if (oobject4 instanceof DexOptimizerImpl$triggerDex2Oat$1) {
          obj1 = oobject4;
          DexOptimizerImpl$triggerDex2Oat$1 label = obj1.label;
          int i2 = Integer.MIN_VALUE;
          if (label & i2) {
             obj1.label = label - i2;
          label_0049 :
             DexOptimizerImpl$triggerDex2Oat$1 result = obj1.result;
             Object obj2 = b.h();
             DexOptimizerImpl$triggerDex2Oat$1 label1 = obj1.label;
             Object obj3 = null;
             if (label1 != null) {
                if (label1 != i1) {
                   if (label1 == 2) {
                      l$0 = obj1.L$0;
                      j0.n(result);
                   label_00e7 :
                      l$0.release();
                      return result;
                   }else {
                      throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                   }
                }else {
                   l$0 = obj1.L$5;
                   l$1 = obj1.L$1;
                   j0.n(result);
                   otriggerDex2 = obj1.L$4;
                   otriggerDex21 = obj1.L$3;
                   otriggerDex22 = obj1.L$2;
                   label1 = obj1.L$0;
                }
             }else {
                j0.n(result);
                DexOptimizerImpl c = obj.c;
                _monitor_enter(c);
                if (obj.c.get(oobject) == null) {
                   obj.c.put(oobject, SemaphoreKt.g(i1, i, 2, obj3));
                }
                object obj4 = obj.c.get(oobject);
                a.m(obj4);
                _monitor_exit(c);
                a.o(obj4, "synchronized\(mDex2OatLoc¡­ocks[apkPath]!!\n        }");
                obj1.L$0 = obj;
                obj1.L$1 = oobject;
                obj1.L$2 = oobject1;
                obj1.L$3 = oobject2;
                obj1.L$4 = oobject3;
                obj1.L$5 = obj4;
                obj1.label = i1;
                if (obj4.a(obj1) == obj2) {
                   return obj2;
                }else {
                   label1 = obj;
                   otriggerDex22 = oobject1;
                   otriggerDex21 = oobject2;
                   otriggerDex2 = oobject3;
                   obj4 = oobject;
                   l$0 = obj4;
                }
             }
             obj1.L$0 = l$0;
             obj1.L$1 = obj3;
             obj1.L$2 = obj3;
             obj1.L$3 = obj3;
             obj1.L$4 = obj3;
             obj1.L$5 = obj3;
             obj1.label = 2;
             result = label1.h(l$1, otriggerDex22, otriggerDex21, otriggerDex2, obj1);
             if (result == obj2) {
                return obj2;
             }else {
                goto label_00e7 ;
             }
          }
       }
       DexOptimizerImpl$triggerDex2Oat$1 otriggerDex23 = new DexOptimizerImpl$triggerDex2Oat$1(obj, oobject4);
       goto label_0049 ;
    }
    public final Object c(long[] p0,File p1,c p2){
       int this;
       DexOptimizerImpl$blockWaitUntilFileExist$1 i$0;
       DexOptimizerImpl$blockWaitUntilFileExist$1 l$2;
       DexOptimizerImpl$blockWaitUntilFileExist$1 l$0;
       int i2;
       DexOptimizerImpl$blockWaitUntilFileExist$1 obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, DexOptimizerImpl.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p2 instanceof DexOptimizerImpl$blockWaitUntilFileExist$1) {
          obj = p2;
          DexOptimizerImpl$blockWaitUntilFileExist$1 label = obj.label;
          int i = Integer.MIN_VALUE;
          this = label & i;
          if (this) {
             int i1 = label - i;
             obj.label = i1;
          label_0029 :
             DexOptimizerImpl$blockWaitUntilFileExist$1 result = obj.result;
             Object obj1 = b.h();
             DexOptimizerImpl$blockWaitUntilFileExist$1 label1 = obj.label;
             if (label1 != null) {
                if (label1 == true) {
                   i$0 = obj.I$0;
                   l$2 = obj.L$2;
                   label1 = obj.L$1;
                   l$0 = obj.L$0;
                   j0.n(result);
                label_0098 :
                   i2 = i$0 + 1;
                   i$0 = label1;
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                i2 = 0;
                l$0 = this;
             }
             String str = ", blockWaitUntilFileExist=true, file=";
             if (i2 < i$0.length) {
                if (l$2.exists()) {
                   d.c("waitIndex="+i2+str+l$2.getAbsolutePath());
                   return a.a(true);
                }else {
                   obj.L$0 = l$0;
                   obj.L$1 = i$0;
                   obj.L$2 = l$2;
                   obj.I$0 = i2;
                   obj.label = 1;
                   if (c.a(i$0[i2], obj) == obj1) {
                      return obj1;
                   }else {
                      label1 = i$0;
                      i$0 = i2;
                      goto label_0098 ;
                   }
                }
             }else if(l$2.exists()){
                d.c(l$0.b+" waitIndex="+i2+str+l$2.getAbsolutePath());
             }else {
                d.c(l$0.b+" blockWaitUntilFileExist=false, file="+l$2.getAbsolutePath());
             }
             return a.a(l$2.exists());
          }
       }
       obj = new DexOptimizerImpl$blockWaitUntilFileExist$1(this, p2);
       goto label_0029 ;
    }
    public final void d(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DexOptimizerImpl.class, "8")) {
          return;
       }
       String[] stringArray = new String[]{"compile","-f","--secondary-dex","-m","speed-profile",p0.getPackageName()};
       this.f(stringArray);
       return;
    }
    public final void e(String p0,File p1,String p2,ClassLoader p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, DexOptimizerImpl.class, "4")) {
          return;
       }
       if (p1 == null) {
          PathClassLoader pathClassLoa = new PathClassLoader(p0, p2, p3);
       }else {
          BaseDexClassLoader uBaseDexClas = new BaseDexClassLoader(p0, p1, p2, p3);
       }
       return;
    }
    public final void f(String[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DexOptimizerImpl.class, "9")) {
          return;
       }
       String str = Arrays.toString(p0);
       a.o(str, "java.util.Arrays.toString\(this\)");
       d.c(this.b+" executePMSShellCommand, args="+str);
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeFileDescriptor(FileDescriptor.in);
       parcel.writeFileDescriptor(FileDescriptor.out);
       parcel.writeFileDescriptor(FileDescriptor.err);
       parcel.writeStringArray(p0);
       parcel.writeStrongBinder(null);
       this.e.writeToParcel(parcel, 0);
       a.m(parcel);
       this.g().transact(0x5f434d44, parcel, parcel1, 0);
       parcel1.readException();
       d.c(a.C(this.b, " executePMSShellCommand done."));
       parcel1.recycle();
       parcel.recycle();
       Binder.restoreCallingIdentity(Binder.clearCallingIdentity());
       return;
    }
    public final IBinder g(){
       DexOptimizerImpl obj = PatchProxy.apply(null, this, DexOptimizerImpl.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f;
       _monitor_enter(obj);
       int i = 0;
       object oobject = this.f[i];
       if (oobject == null || !oobject.isBinderAlive()) {
          Object[] objArray = new Object[]{"package"};
          oobject = b.b("android.os.ServiceManager", "getService", objArray);
          this.f[i] = oobject;
          a.o(oobject, "try {\n                Ja¡­          }\n            }");
       }
       _monitor_exit(obj);
       return oobject;
    }
    public final Object h(String p0,File p1,String p2,ClassLoader p3,c p4){
       object obj1;
       DexOptimizerImpl$innerDex2Oat$1 l$0;
       DexOptimizerImpl$innerDex2Oat$1 j$0;
       DexOptimizerImpl$innerDex2Oat$1 l$3;
       DexOptimizerImpl$innerDex2Oat$1 l$2;
       DexOptimizerImpl$innerDex2Oat$1 l$01;
       int b;
       DexOptimizerImpl$innerDex2Oat$1 oinnerDex2Oa;
       DexOptimizerImpl$innerDex2Oat$1 l$02;
       DexOptimizerImpl$innerDex2Oat$1 oinnerDex2Oa1;
       String str;
       Object obj = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p4;
       DexOptimizerImpl uDexOptimize = DexOptimizerImpl.class;
       int i = 3;
       int i1 = 2;
       int i2 = 1;
       int i3 = 0;
       if (PatchProxy.isSupport(uDexOptimize)) {
          Object[] objArray = new Object[]{oobject,oobject1,p2,p3,oobject2};
          obj1 = PatchProxy.apply(objArray, obj, uDexOptimize, "3");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       if (oobject2 instanceof DexOptimizerImpl$innerDex2Oat$1) {
          obj1 = oobject2;
          DexOptimizerImpl$innerDex2Oat$1 label = obj1.label;
          int i4 = Integer.MIN_VALUE;
          if (label & i4) {
             obj1.label = label - i4;
          label_0045 :
             DexOptimizerImpl$innerDex2Oat$1 result = obj1.result;
             Object obj2 = b.h();
             DexOptimizerImpl$innerDex2Oat$1 label1 = obj1.label;
             if (label1 != null) {
                if (label1 != i2) {
                   if (label1 != i1) {
                      if (label1 == i) {
                         l$0 = obj1.L$0;
                         j0.n(result);
                      label_0282 :
                         if (!result.booleanValue()) {
                            return new b$a(false, a.C("wait dex2oat\(odex\) timeout, ", l$0));
                         }else {
                         label_0295 :
                            return new b$a(true, "success");
                         }
                      }else {
                         throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                      }
                   }else {
                      j$0 = obj1.J$0;
                      l$0 = obj1.I$0;
                      l$3 = obj1.L$3;
                      l$2 = obj1.L$2;
                      label1 = obj1.L$1;
                      l$01 = obj1.L$0;
                      j0.n(result);
                   label_0226 :
                      b = result.booleanValue();
                      d.c(l$01.b+" wait vdex "+b+", spent="+(System.currentTimeMillis() - j$0)+"ms");
                      if (!b) {
                         return new b$a(b, a.C("wait dex2oat\(vdex\) timeout, ", l$3));
                      }else {
                         oinnerDex2Oa = l$0;
                      label_0263 :
                         l$0 = label1;
                         if (oinnerDex2Oa == null) {
                            obj1.L$0 = l$0;
                            obj1.L$1 = 0;
                            obj1.L$2 = 0;
                            obj1.L$3 = 0;
                            obj1.L$4 = 0;
                            obj1.L$5 = 0;
                            obj1.label = 3;
                            result = l$01.c(l$2, new File(l$0), obj1);
                            if (result == obj2) {
                               return obj2;
                            }else {
                               goto label_0282 ;
                            }
                         }else {
                            goto label_0295 ;
                         }
                      }
                   }
                }else {
                   l$01 = obj1.J$0;
                   j$0 = obj1.L$4;
                   l$2 = obj1.L$3;
                   l$02 = obj1.L$0;
                   j0.n(result);
                   oinnerDex2Oa = obj1.I$0;
                   l$0 = obj1.L$1;
                   result = obj1.L$5;
                   l$3 = obj1.L$2;
                   oinnerDex2Oa1 = result;
                }
             }else {
                j0.n(result);
                this.e(p0, p1, p2, p3);
                d.c(obj.b+" create class loader for "+oobject+", spent="+(System.currentTimeMillis() - System.currentTimeMillis())+"ms");
                if (oobject1 == null && !Dex2OatFilesUtil.a.b()) {
                   return new b$a(true, null, 2, null);
                }else {
                   String str2 = Dex2OatFilesUtil.a.d(new File(oobject), oobject1);
                   long[] olongArray = new long[7]{1000,2000,3000,6000,9000,0x2ee0,0x4650};
                   b = Build$VERSION.SDK_INT;
                   if (b >= 29 && b <= 31) {
                      long l = System.currentTimeMillis();
                      str = obj.j(oobject, str2);
                      if (str == null) {
                         obj1.L$0 = obj;
                         obj1.L$1 = oobject;
                         obj1.L$2 = oobject1;
                         obj1.L$3 = str2;
                         obj1.L$4 = olongArray;
                         obj1.L$5 = str;
                         i2 = 1;
                         obj1.I$0 = i2;
                         obj1.J$0 = l;
                         obj1.label = i2;
                         oinnerDex2Oa1 = obj.c(olongArray, new File(str2), obj1);
                         if (oinnerDex2Oa1 == obj2) {
                            return obj2;
                         }else {
                            l$02 = obj;
                            oinnerDex2Oa = 1;
                         }
                      }else {
                         this.a(p0, p1);
                         return new b$a(false, str);
                      }
                   }else {
                      l$01 = obj;
                      String str3 = str2;
                      oinnerDex2Oa = null;
                   label_01a8 :
                      l$2 = j$0;
                      int sDK_INT = Build$VERSION.SDK_INT;
                      str = 30;
                      int i5 = (26 <= sDK_INT && sDK_INT <= str)? 1: 0;
                      if (i5 || (sDK_INT == 25 && (Build$VERSION.PREVIEW_SDK_INT && (sDK_INT != str || !Build$VERSION.PREVIEW_SDK_INT)))) {
                         j$0 = System.currentTimeMillis();
                         Objects.requireNonNull(label1, "null cannot be cast to non-null type java.lang.String");
                         String str1 = label1.substring(0, StringsKt__StringsKt.w3(label1, ".odex", 0, false, 6, null));
                         a.o(str1, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
                         str1 = a.C(str1, ".vdex");
                         obj1.L$0 = l$01;
                         obj1.L$1 = label1;
                         obj1.L$2 = l$2;
                         obj1.L$3 = str1;
                         obj1.L$4 = 0;
                         obj1.L$5 = 0;
                         obj1.I$0 = 1;
                         obj1.J$0 = j$0;
                         obj1.label = 2;
                         result = l$01.c(new long[7]{1000,2000,3000,6000,9000,0x2ee0,0x4650}, new File(str1), obj1);
                         if (result == obj2) {
                            return obj2;
                         }else {
                            b$a uoa = 1;
                            goto label_0226 ;
                         }
                      }else {
                         goto label_0263 ;
                      }
                   }
                }
             }
             if (!oinnerDex2Oa1.booleanValue()) {
                return new b$a(false, a.C("wait dex2oat\(odex\) timeout, ", l$2));
             }else if(!Dex2OatFilesUtil.a.a(l$2)){
                l$02.a(l$0, l$3);
                d.c(l$02.b+" is not elf format, "+l$2);
                return new b$a(false, a.C("odex file isn\'t elf format, ", l$2));
             }else {
                d.c(l$02.b+" trigger dex2oat "+result+", spent="+(System.currentTimeMillis() - l$01)+"ms");
                label1 = l$2;
                l$01 = l$02;
                goto label_01a8 ;
             }
          }
       }
       DexOptimizerImpl$innerDex2Oat$1 oinnerDex2Oa2 = new DexOptimizerImpl$innerDex2Oat$1(obj, oobject2);
       goto label_0045 ;
    }
    public final void i(String p0){
       Class[] uClassArray;
       object oobject2;
       DexOptimizerImpl uDexOptimize = DexOptimizerImpl.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uDexOptimize, "7")) {
          return;
       }
       DexOptimizerImpl ta = this.a;
       object oobject = PatchProxy.applyOneRefs(ta, this, uDexOptimize, "11");
       if (oobject != PatchProxyResult.class) {
       }else {
          uDexOptimize = this.g;
          _monitor_enter(uDexOptimize);
          try{
             if (this.g[0] != null) {
                DexOptimizerImpl tf = this.f;
                _monitor_enter(tf);
                DexOptimizerImpl tf1 = this.f;
                if (tf1[0] != null) {
                   object oobject1 = tf1[0];
                   uClassArray = (oobject1 != null && oobject1.isBinderAlive() == true)? 1: null;
                   if (uClassArray) {
                      oobject2 = this.g[0];
                      a.m(oobject2);
                      _monitor_exit(tf);
                      _monitor_exit(uDexOptimize);
                   label_0049 :
                      oobject = oobject2;
                   }
                }
                _monitor_exit(tf);
             }
             IBinder iBinder = this.g();
             Object obj = Proxy.newProxyInstance(ta.getClassLoader(), iBinder.getClass().getInterfaces(), new a(iBinder));
             if (obj != null) {
                Object[] objArray1 = new Object[]{obj};
                obj = b.b("android.content.pm.IPackageManager$Stub", "asInterface", objArray1);
                while (ta instanceof ContextWrapper) {
                   ta = ta.getBaseContext();
                   a.o(ta, "contextImpl.baseContext");
                }
                Class[] uClassArray1 = new Class[]{ta.getClass(),Class.forName("android.content.pm.IPackageManager")};
                Object[] objArray2 = new Object[]{ta,obj};
                oobject2 = b.c(Class.forName("android.app.ApplicationPackageManager"), uClassArray1).newInstance(objArray2);
                if (oobject2 != null) {
                   this.g[0] = oobject2;
                   _monitor_exit(uDexOptimize);
                   goto label_0049 ;
                }else {
                   throw new NullPointerException("null cannot be cast to non-null type android.content.pm.PackageManager");
                }
             }else {
                throw new NullPointerException("null cannot be cast to non-null type android.os.IBinder");
             }
          }catch(java.lang.reflect.InvocationTargetException e10){
             throw new IllegalStateException(e10.getTargetException());
          }
       }
       try{
          uClassArray = new Class[]{String.class,Class.forName("android.content.pm.PackageManager$DexModuleRegisterCallback")};
          Object[] objArray = new Object[]{p0,null};
          b.f(oobject.getClass(), "registerDexModule", uClassArray).invoke(oobject, objArray);
          return;
       }catch(java.lang.reflect.InvocationTargetException e10){
          throw new IllegalStateException(e10.getTargetException());
       }
    }
    public final String j(String p0,String p1){
       DexOptimizerImpl uDexOptimize = DexOptimizerImpl.class;
       File obj = PatchProxy.applyTwoRefs(p0, p1, this, uDexOptimize, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new File(p1);
       if (obj.isDirectory()) {
          d.c(this.b+" optimizedFile is dir, "+obj.getAbsolutePath());
          return a.C("optimizedFile is dir, ", obj.getAbsolutePath());
       }else if(obj.exists()){
          d.c(this.b+" optimizedFile exist, just skip, "+obj.getAbsolutePath());
          return null;
       }else {
          DexOptimizerImpl ta = this.a;
          if (!PatchProxy.applyVoidOneRefs(ta, this, uDexOptimize, "6")) {
             String[] stringArray = new String[]{"reconcile-secondary-dex-files",ta.getPackageName()};
             this.f(stringArray);
          }
          this.i(p0);
          if (obj.exists()) {
             d.c(this.b+" after registerDexModule, optimizedFile exist, "+obj.getAbsolutePath());
             return null;
          }else {
             this.d(this.a);
             return null;
          }
       }
    }
}
