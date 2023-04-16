package com.kwai.kxb.storage.clean.KxbDiskManager;
import com.kwai.kxb.storage.clean.KxbDiskManager$mSharedPreference$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.kxb.storage.clean.LowDiskExpConfig;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Boolean;
import ru6.o;
import com.kwai.kxb.service.BaseServiceProviderKt;
import java.lang.Throwable;
import ru6.o$b;
import com.kwai.kxb.KxbManager;
import gu6.k;
import ru6.m;
import android.content.SharedPreferences;
import java.lang.System;
import java.lang.Number;
import java.util.Map;
import java.util.LinkedHashMap;
import com.kwai.kxb.PlatformType;
import tu6.k;
import com.kwai.kxb.storage.KxbBundleDao;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import tu6.d;
import java.lang.Long;
import trd.t;
import java.lang.StringBuilder;
import ru6.q;
import java.util.Collection;
import bv6.a;
import zu6.a;
import kotlin.jvm.internal.a;
import ku6.a;
import java.lang.CharSequence;
import zsd.u;
import java.io.File;
import y56.a;

public final class KxbDiskManager	// class@0007f6
{
    public static boolean a;
    public static final p b;
    public static final KxbDiskManager c;

    static {
       boolean b;
       boolean b1;
       KxbDiskManager kxbDiskManag = new KxbDiskManager();
       KxbDiskManager.c = kxbDiskManag;
       KxbDiskManager.b = s.c(KxbDiskManager$mSharedPreference$2.INSTANCE);
       LowDiskExpConfig lowDiskExpCo = LowDiskExpConfig.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       KxbDiskManager kxbDiskManag1 = KxbDiskManager.class;
       if (PatchProxy.applyVoid(null, kxbDiskManag, kxbDiskManag1, "2")) {
       }else {
          LowDiskExpConfig i = LowDiskExpConfig.i;
          Objects.requireNonNull(i);
          String str = "4";
          Boolean uBoolean = PatchProxy.apply(null, i, lowDiskExpCo, str);
          if (uBoolean == patchProxyRe) {
             uBoolean = LowDiskExpConfig.d.getValue();
          }
          if (!uBoolean.booleanValue()) {
             o$b.d(BaseServiceProviderKt.a(), "low disk mode disabled by switch", null, 2, null);
          }else {
             m obj = PatchProxy.apply(null, kxbDiskManag, kxbDiskManag1, "3");
             int i1 = 0;
             if (obj != patchProxyRe) {
                b = obj.booleanValue();
             }else {
                obj = KxbManager.g.d().a();
                b = (obj != null)? obj.a(): false;
             }
             if (b) {
                o$b.d(BaseServiceProviderKt.a(), "app in low disk mode, enter kxb low disk mode", null, 2, null);
                KxbDiskManager.a = true;
             }else {
                Object obj1 = PatchProxy.apply(null, kxbDiskManag, kxbDiskManag1, str);
                if (obj1 != patchProxyRe) {
                   b1 = obj1.booleanValue();
                }else {
                   long l = System.currentTimeMillis() - kxbDiskManag.d().getLong("last_enter_low_disk_time", -1);
                   Number number = PatchProxy.apply(null, i, lowDiskExpCo, "5");
                   if (number == patchProxyRe) {
                      number = LowDiskExpConfig.e.getValue();
                   }
                   if (l - number.longValue() < 0) {
                      i1 = 1;
                   }
                   b1 = i1;
                }
                if (b1) {
                   o$b.d(BaseServiceProviderKt.a(), "low disk duration not expired, enter kxb low disk mode", null, 2, null);
                   KxbDiskManager.a = true;
                }else {
                   o$b.d(BaseServiceProviderKt.a(), "enter kxb normal disk mode", null, 2, null);
                }
             }
          }
       }
    }
    public void KxbDiskManager(){
       super();
    }
    public final boolean a(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LowDiskExpConfig obj = PatchProxy.apply(null, this, KxbDiskManager.class, "7");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       long l = System.currentTimeMillis() - this.d().getLong("last_low_disk_clean_time", -1);
       obj = LowDiskExpConfig.i;
       Objects.requireNonNull(obj);
       Number number = PatchProxy.apply(null, obj, LowDiskExpConfig.class, "6");
       if (number == patchProxyRe) {
          number = LowDiskExpConfig.f.getValue();
       }
       if (l - number.longValue() < 0) {
          o$b.d(BaseServiceProviderKt.a(), "low disk clean duration not expired, skip", null, 2, null);
          return false;
       }else {
          return true;
       }
    }
    public final Map b(){
       String str1;
       KxbDiskManager kxbDiskManag;
       Object obj2;
       ArrayList uArrayList1;
       object oobject1;
       ArrayList this;
       int this1;
       boolean b1;
       Throwable throwable;
       Throwable throwable1;
       List list;
       Object[] objArray = null;
       LinkedHashMap obj = PatchProxy.apply(objArray, this, KxbDiskManager.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LinkedHashMap();
       long l = System.currentTimeMillis();
       PlatformType[] platformType = PlatformType.values();
       int len = platformType.length;
       int i = 0;
       while (i < len) {
          object oobject = platformType[i];
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = k.b.a(oobject).e().iterator();
          while (iterator.hasNext()) {
             String obj1 = iterator.next();
             KxbDiskManager c = KxbDiskManager.c;
             String str = obj1.a();
             Objects.requireNonNull(c);
             boolean b = true;
             if (PatchProxy.isSupport(KxbDiskManager.class)) {
                str1 = str;
                kxbDiskManag = c;
                obj2 = obj1;
                uArrayList1 = uArrayList;
                oobject1 = oobject;
                List obj3 = PatchProxy.applyThreeRefs(oobject, str1, Long.valueOf(l), kxbDiskManag, KxbDiskManager.class, "13");
                if (obj3 != PatchProxyResult.class) {
                   b = obj3.booleanValue();
                   oobject = null;
                }else {
                label_0088 :
                   obj1 = str1;
                   c = kxbDiskManag;
                   obj3 = PatchProxy.applyTwoRefs(oobject1, obj1, c, KxbDiskManager.class, "14");
                   if (obj3 != PatchProxyResult.class) {
                      b1 = obj3.booleanValue();
                   }else {
                      LowDiskExpConfig i1 = LowDiskExpConfig.i;
                      Objects.requireNonNull(i1);
                      Map map = PatchProxy.apply(null, i1, LowDiskExpConfig.class, "8");
                      if (map == PatchProxyResult.class) {
                         map = LowDiskExpConfig.h.getValue();
                      }
                      list = map.get(oobject1);
                      str = "*";
                      if (list == null) {
                         list = t.k(str);
                      }
                      if (list.contains(str) || list.contains(obj1)) {
                         b1 = true;
                      }else {
                         b1 = false;
                      }
                   }
                   this1 = 2;
                   String str2 = " of ";
                   if (b1) {
                      throwable = null;
                      o$b.d(BaseServiceProviderKt.a(), obj1+str2+oobject1+"  is not cleanable, because it is in low disk white list", throwable, this1, throwable);
                   }else {
                      obj3 = PatchProxy.applyTwoRefs(oobject1, obj1, c, KxbDiskManager.class, "15");
                      if (obj3 != PatchProxyResult.class) {
                         b1 = obj3.booleanValue();
                      }else {
                         obj3 = KxbManager.g.d().e().a(oobject1);
                         if (!obj3 instanceof Collection || !obj3.isEmpty()) {
                            Iterator iterator1 = obj3.iterator();
                            while (true) {
                               if (iterator1.hasNext()) {
                                  if (a.g(iterator1.next().a(), obj1)) {
                                     b1 = true;
                                     break ;
                                  }
                               }
                            }
                         }
                         b1 = false;
                      }
                      if (b1) {
                         throwable = null;
                         o$b.d(BaseServiceProviderKt.a(), obj1+str2+oobject1+" is not cleanable, because it has preset bundle", throwable, this1, throwable);
                      }else if(a.a.b(oobject1, obj1, l)){
                         throwable1 = null;
                         o$b.d(BaseServiceProviderKt.a(), obj1+str2+oobject1+" is not cleanable, because it was loaded recently", throwable1, this1, throwable1);
                      label_00f8 :
                         b = false;
                      }else {
                         throwable1 = null;
                         o$b.d(BaseServiceProviderKt.a(), obj1+str2+oobject1+" is cleanable", throwable1, this1, throwable1);
                      }
                   }
                   throwable1 = throwable;
                   goto label_00f8 ;
                }
             }else {
                str1 = str;
                kxbDiskManag = c;
                obj2 = obj1;
                uArrayList1 = uArrayList;
                oobject1 = oobject;
                goto label_0088 ;
             }
             if (b) {
                this = uArrayList1;
                this.add(obj2);
                uArrayList = this;
                this1 = this;
             }else {
                uArrayList = uArrayList1;
             }
             oobject = oobject1;
             objArray = oobject;
          }
          obj.put(oobject, uArrayList);
          i = i + 1;
          objArray = objArray;
       }
       return obj;
    }
    public final long c(String p0){
       File obj = PatchProxy.applyOneRefs(p0, this, KxbDiskManager.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = (p0 == null || u.S1(p0))? 1: null;
       if (obj) {
          return 0;
       }else {
          long l = a.c(new File(p0));
          if (l < 0) {
             return 0;
          }else {
             return l;
          }
       }
    }
    public final SharedPreferences d(){
       Object obj = PatchProxy.apply(null, this, KxbDiskManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KxbDiskManager.b.getValue();
    }
    public final boolean e(){
       return KxbDiskManager.a;
    }
}
