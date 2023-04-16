package com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerService$startScanAppList$1;
import io.reactivex.g;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerService;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerService$startScanAppList$1$1;
import java.util.Objects;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerHelper;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import fna.j$h;
import msd.l;
import android.content.pm.PackageManager;
import android.content.Context;
import tk7.j;
import java.lang.Integer;
import java.util.List;
import wk7.a;
import java.lang.Boolean;
import wk7.c;
import wk7.j;
import android.os.Parcelable;
import wk7.b;
import android.content.pm.PackageInfo;
import java.lang.Exception;
import com.kwai.middleware.azeroth.Azeroth2;
import fna.b;
import kotlin.Pair;
import java.io.File;
import android.os.Environment;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerService$scanAppList$$inlined$repeat$lambda$1;
import crd.b;
import fna.l;
import brd.t;
import t45.d;
import brd.z;
import fna.m;
import msd.p;
import fna.n;
import fna.o;
import erd.g;
import erd.a;
import crd.a;
import qrd.l1;
import java.util.Map;
import java.util.LinkedHashMap;
import com.google.gson.c;
import o56.a;
import android.content.res.AssetManager;
import android.app.Application;
import java.io.InputStream;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import isd.a;
import zsd.d;
import java.nio.charset.Charset;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Set;
import java.lang.Iterable;
import com.yxcorp.gifshow.growth.cleaner.impl.CleanerConfigurationWrapper;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Collection;
import kotlin.collections.ArraysKt___ArraysKt;
import zsd.u;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import fna.j$g;
import fna.a;
import cra.c0;
import java.lang.Long;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerTag;
import java.lang.Number;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.StringBuilder;
import fna.v;
import fna.j$e;

public final class GrowthCleanerService$startScanAppList$1 implements g	// class@00133e
{
    public final GrowthCleanerService b;

    public void GrowthCleanerService$startScanAppList$1(GrowthCleanerService p0){
       this.b = p0;
       super();
    }
    public final void subscribe(v p0){
       ArrayList uArrayList1;
       j oj2;
       Pair obj2;
       CountDownLatch uCountDownLa;
       PackageManager packageManag1;
       n on;
       int i1;
       ArrayList uArrayList2;
       z c;
       Iterator obj5;
       String str2;
       Object obj8;
       GrowthCleanerService$startScanAppList$1$1 ostartScanAp1;
       PatchProxyResult patchProxyRe1;
       String obj9;
       String obj10;
       File uFile;
       a uoa;
       GrowthCleanerHelper growthCleane2;
       String str3;
       String str4;
       PatchProxyResult patchProxyRe2;
       Iterator iterator;
       PatchProxyResult patchProxyRe3;
       long l;
       String str5;
       String str6;
       Set set;
       Iterator iterator1;
       String obj11;
       c0 obj12;
       a d;
       List obj13;
       Iterator iterator3;
       int i4;
       int i5;
       GrowthCleanerService$startScanAppList$1$1 ostartScanAp3;
       Object obj14;
       b uob2;
       File uFile1;
       List list4;
       l1 a;
       b uob3;
       int i6;
       Object obj15;
       Application uApplication;
       File externalCach;
       File parentFile;
       ArrayList uArrayList4;
       ArrayList uArrayList6;
       Iterator iterator4;
       a obj16;
       Iterator iterator5;
       List obj17;
       Iterator iterator6;
       Boolean obj19;
       ArrayList uArrayList8;
       PackageInfo obj20;
       j$g og2;
       ArrayList uArrayList9;
       JsonElement obj21;
       Object obj23;
       boolean b1;
       LinkedHashMap linkedHashMa;
       j oj3;
       String obj25;
       boolean b2;
       Object[] obj26;
       Object obj27;
       String obj = this;
       ArrayList obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, GrowthCleanerService$startScanAppList$1.class, "1")) {
          return;
       }
       a.p(obj1, "emitter");
       GrowthCleanerService$startScanAppList$1 b = obj.b;
       GrowthCleanerService$startScanAppList$1$1 ostartScanAp = new GrowthCleanerService$startScanAppList$1$1(obj1);
       Objects.requireNonNull(b);
       GrowthCleanerHelper growthCleane = GrowthCleanerHelper.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       obj1 = PatchProxy.applyTwoRefs(b, ostartScanAp, b, GrowthCleanerService.class, "6");
       if (obj1 != patchProxyRe) {
       }else {
          ostartScanAp.invoke(new j$h(b));
          ArrayList uArrayList = new ArrayList();
          PackageManager packageManag = b.getPackageManager();
          j oj = j.g();
          String str = "user_growth";
          String str1 = "spaceclean";
          Objects.requireNonNull(oj);
          j oj1 = j.class;
          int i = 0;
          if (PatchProxy.isSupport(oj1)) {
             uArrayList1 = null;
             oj2 = oj1;
             obj = str1;
             obj2 = PatchProxy.applyFourRefs(Integer.valueOf(i), str, str1, null, oj, j.class, "24");
             if (obj2 != patchProxyRe) {
                uCountDownLa = null;
             label_00af :
                Iterator obj3 = obj2;
                uArrayList1 = uArrayList;
                packageManag1 = packageManag;
                on = null;
             label_01b7 :
                i1 = obj3.size();
                b uob = new b();
                obj2 = PatchProxy.apply(null, null, growthCleane, "2");
                if (obj2 != patchProxyRe) {
                }else {
                   uArrayList2 = new ArrayList();
                   uArrayList8 = new ArrayList();
                   externalCach = Environment.getExternalStorageDirectory();
                   if (externalCach != null) {
                      GrowthCleanerHelper.b(externalCach, uArrayList2, uArrayList8);
                      uArrayList4 = new ArrayList();
                      iterator6 = uArrayList8.iterator();
                      while (iterator6.hasNext()) {
                         GrowthCleanerHelper.b(iterator6.next(), uArrayList2, uArrayList4);
                      }
                      obj2 = new Pair(uArrayList2, uArrayList4);
                   }else {
                      obj2 = new Pair(uArrayList2, uArrayList8);
                   }
                }
                ArrayList obj4 = obj2.component1();
                uArrayList2 = obj2.component2();
                int i2 = 3;
                uCountDownLa = new CountDownLatch(i2);
                i = 0;
                while (i < i2) {
                   GrowthCleanerService$scanAppList$$inlined$repeat$lambda$1 oscanAppList = new GrowthCleanerService$scanAppList$$inlined$repeat$lambda$1(b, uArrayList2, obj4, uCountDownLa);
                   b uob1 = PatchProxy.applyTwoRefs(uArrayList2, oscanAppList, null, growthCleane, "3");
                   if (uob1 != patchProxyRe) {
                   }else {
                      a.p(uArrayList2, "notSearchFiles");
                      a.p(oscanAppList, "findApkFiles");
                      c = d.c;
                      t ot = t.create(new l(uArrayList2)).subscribeOn(c).observeOn(c);
                      uob1 = ot.subscribe(new m(oscanAppList), new n(oscanAppList), new o(oscanAppList));
                      a.o(uob1, "Observable.create<ArrayL¡­yList\(\), true\)\n        }\)");
                   }
                   b.b.c(uob1);
                   i = i + 1;
                   i2 = 3;
                   on = null;
                }
                try{
                   obj5 = PatchProxy.apply(null, null, growthCleane, "14");
                   if (obj5 != patchProxyRe) {
                   }else {
                      linkedHashMa = new LinkedHashMap();
                      uApplication = a.B;
                      a.o(uApplication, "AppEnv.APP");
                      InputStream inputStream = SplitAssetHelper.open(uApplication.getAssets(), "top_app.json");
                      a.o(inputStream, "AppEnv.APP.assets.open\(\"top_app.json\"\)");
                      JsonObject jsonObject = new c().a(new String(a.p(inputStream), d.a)).r();
                      set = jsonObject.w0();
                      a.o(set, "it.keySet\(\)");
                      iterator1 = set.iterator();
                      while (iterator1.hasNext()) {
                         str4 = iterator1.next();
                         obj21 = jsonObject.e0(str4);
                         if (obj21 != null) {
                            str5 = obj21.w();
                            if (str5 != null) {
                               a.o(str4, "keyAppName");
                               linkedHashMa.put(str5, str4);
                            }
                         }
                      }
                   }
                }catch(java.lang.Exception e0){
                   linkedHashMa.clear();
                }
                GrowthCleanerService$startScanAppList$1$1 obj6 = obj5;
                str2 = "installedPackages";
                a.o(obj3, str2);
                ArrayList uArrayList3 = b.a().a();
                List list = CollectionsKt___CollectionsKt.G5(obj6.keySet());
                List list1 = list;
                GrowthCleanerHelper growthCleane1 = growthCleane;
                List list2 = list;
                CountDownLatch uCountDownLa1 = uCountDownLa;
                Object obj7 = obj4;
                uArrayList2 = PatchProxy.applyFourRefs(b, obj3, uArrayList3, list1, null, GrowthCleanerHelper.class, "7");
                str1 = ".";
                if (uArrayList2 != patchProxyRe) {
                   obj8 = obj3;
                   ostartScanAp1 = ostartScanAp;
                   patchProxyRe1 = patchProxyRe;
                   obj9 = obj6;
                }else {
                   a.p(b, "context");
                   a.p(obj3, str2);
                   uArrayList2 = new ArrayList();
                   uArrayList8 = new ArrayList();
                   iterator1 = obj3.iterator();
                   while (iterator1.hasNext()) {
                      obj20 = iterator1.next().packageName;
                      if (obj20 == null) {
                         obj20 = null;
                      }
                      if (obj20 != null) {
                         uArrayList8.add(obj20);
                      }
                   }
                   list4 = CollectionsKt___CollectionsKt.J5(uArrayList8);
                   if (uArrayList3 != null) {
                      uArrayList9 = (uArrayList3.isEmpty() ^ 1)? uArrayList3: null;
                      if (uArrayList9 != null) {
                         list4.addAll(uArrayList9);
                      }
                   }
                   externalCach = b.getExternalCacheDir();
                   if (externalCach != null) {
                      externalCach = externalCach.getParentFile();
                      if (externalCach != null) {
                         parentFile = externalCach.getParentFile();
                      label_0378 :
                         if (parentFile != null) {
                            File[] uFileArray2 = parentFile.listFiles();
                            if (uFileArray2 != null) {
                               obj13 = ArraysKt___ArraysKt.qa(uFileArray2);
                               if (obj13 != null) {
                                  uArrayList9 = new ArrayList();
                                  iterator1 = obj13.iterator();
                                  while (iterator1.hasNext()) {
                                     obj21 = iterator1.next();
                                     Object obj22 = obj21;
                                     str2 = GrowthCleanerHelper.e(obj22);
                                     if (obj22.isDirectory()) {
                                        iterator3 = iterator1;
                                        str3 = obj22.getName();
                                        obj8 = obj3;
                                        obj11 = "it.name";
                                        a.o(str3, obj11);
                                        ostartScanAp1 = ostartScanAp;
                                        patchProxyRe1 = patchProxyRe;
                                        obj23 = obj6;
                                        Object obj24 = null;
                                        i6 = 2;
                                        b1 = false;
                                        if (!u.q2(str3, str1, b1, i6, obj24)) {
                                           str3 = obj22.getName();
                                           a.o(str3, obj11);
                                           if (StringsKt__StringsKt.O2(str3, str1, b1, i6, obj24) && !list4.contains(str2)) {
                                              iterator1 = 1;
                                           label_03e2 :
                                              if (iterator1) {
                                                 uArrayList9.add(obj21);
                                              }
                                              iterator1 = iterator3;
                                              obj3 = obj8;
                                              patchProxyRe = patchProxyRe1;
                                              obj15 = obj23;
                                              ostartScanAp = ostartScanAp1;
                                           }
                                        }
                                     }else {
                                        obj8 = obj3;
                                        iterator3 = iterator1;
                                        ostartScanAp1 = ostartScanAp;
                                        patchProxyRe1 = patchProxyRe;
                                        obj23 = obj6;
                                     }
                                     iterator1 = null;
                                     goto label_03e2 ;
                                  }
                                  obj8 = obj3;
                                  ostartScanAp1 = ostartScanAp;
                                  patchProxyRe1 = patchProxyRe;
                                  obj23 = obj6;
                                  uArrayList2.addAll(uArrayList9);
                               label_0406 :
                                  parentFile = Environment.getExternalStorageDirectory();
                                  if (parentFile == null) {
                                     parentFile = null;
                                  }
                                  GrowthCleanerHelper.i(parentFile, list4, list2, uArrayList2);
                                  obj3 = GrowthCleanerHelper.h().iterator();
                                  while (obj3.hasNext()) {
                                     GrowthCleanerHelper.i(obj3.next(), list4, list2, uArrayList2);
                                  }
                               }
                            }
                         }
                         obj8 = obj3;
                         ostartScanAp1 = ostartScanAp;
                         patchProxyRe1 = patchProxyRe;
                         obj23 = obj6;
                         goto label_0406 ;
                      }
                   }
                   parentFile = null;
                   goto label_0378 ;
                }
                obj1 = new ArrayList();
                obj5 = uArrayList2.iterator();
                while (obj5.hasNext()) {
                   obj10 = obj5.next();
                   i = b.a().d(obj10) ^ 1;
                   if (i) {
                      obj1.add(obj10);
                   }
                }
                i1 = i1 + obj1.size();
                boolean i3 = -1;
                j$g og = new j$g(b, i3, i1, uob, null);
                GrowthCleanerService$startScanAppList$1$1 ostartScanAp2 = ostartScanAp1;
                ostartScanAp2.invoke(ostartScanAp);
                obj3 = obj1.iterator();
                while (obj3.hasNext()) {
                   uFile = obj3.next();
                   uoa = new a();
                   obj10 = GrowthCleanerHelper.e(uFile);
                   uoa.a = 1;
                   growthCleane2 = growthCleane1;
                   obj6 = obj9;
                   str3 = PatchProxy.applyTwoRefs(uFile, obj6, null, growthCleane2, "16");
                   str4 = "filePackage";
                   patchProxyRe2 = patchProxyRe1;
                   if (str3 != patchProxyRe2) {
                      iterator = obj3;
                      obj9 = str1;
                      patchProxyRe3 = patchProxyRe2;
                   }else {
                      a.p(uFile, "appFile");
                      a.p(obj6, "topAppMap");
                      str3 = uFile.getName();
                      str5 = GrowthCleanerHelper.e(uFile);
                      if (obj6.containsKey(str5)) {
                         str6 = obj6.get(str5);
                         if (str6 != null) {
                            set = 1;
                         label_04c1 :
                            if (!set) {
                               iterator1 = obj6.keySet().iterator();
                               while (iterator1.hasNext()) {
                                  iterator = obj3;
                                  obj11 = iterator1.next();
                                  a.o(str5, str4);
                                  Iterator iterator2 = iterator1;
                                  obj9 = str1;
                                  patchProxyRe3 = patchProxyRe2;
                                  if (u.q2(str5, obj11, false, 2, null)) {
                                     obj11 = obj6.get(obj11);
                                     if (obj11 != null) {
                                        str6 = obj11;
                                     }
                                  }
                                  iterator1 = iterator2;
                                  obj3 = iterator;
                                  str1 = obj9;
                                  patchProxyRe2 = patchProxyRe3;
                               }
                            }
                            iterator = obj3;
                            obj9 = str1;
                            patchProxyRe3 = patchProxyRe2;
                            str3 = str6;
                            a.o(str3, "appName");
                         }
                      }
                      str6 = str3;
                      set = null;
                      goto label_04c1 ;
                   }
                   uoa.b = str3;
                   a.o(obj10, str4);
                   uoa.d = obj10;
                   uoa.k = new c0(uFile, Long.valueOf(GrowthCleanerHelper.d(uFile, null, 2, null)), Boolean.FALSE, GrowthCleanerTag.ADVISE);
                   uArrayList1.add(uoa);
                   l = uob.b + uoa.k.f().longValue();
                   uob.b = l;
                   i3 = i3 + 1;
                   og = new j$g(b, i3, i1, uob, uoa);
                   ostartScanAp2.invoke(obj3);
                   growthCleane1 = growthCleane2;
                   obj3 = iterator;
                   str1 = obj9;
                   patchProxyRe1 = patchProxyRe3;
                   obj9 = obj6;
                }
                growthCleane2 = growthCleane1;
                patchProxyRe3 = patchProxyRe1;
                obj6 = obj9;
                obj9 = str1;
                obj4 = uArrayList1;
                obj1 = new ArrayList();
                obj5 = obj8.iterator();
                while (obj5.hasNext()) {
                   obj12 = obj5.next();
                   i = b.a().a().contains(obj12.packageName) ^ 1;
                   if (i) {
                      obj1.add(obj12);
                   }
                }
                obj3 = obj1.iterator();
                while (obj3.hasNext()) {
                   uoa = new a();
                   uoa.a = 0;
                   uoa.a(obj3.next());
                   d = uoa.d;
                   obj13 = null;
                   obj12 = PatchProxy.applyOneRefs(d, obj13, growthCleane2, "9");
                   patchProxyRe2 = patchProxyRe3;
                   if (obj12 != patchProxyRe2) {
                      iterator3 = obj3;
                      i4 = i1;
                      growthCleane1 = growthCleane2;
                      i5 = i3;
                      ostartScanAp3 = ostartScanAp2;
                      obj14 = obj6;
                      patchProxyRe1 = patchProxyRe2;
                      uob2 = uob;
                      obj = obj9;
                      growthCleane2 = null;
                   }else {
                      a.p(d, "packageName");
                      obj12 = new c0(obj13, obj13, obj13, obj13);
                      uApplication = a.b();
                      a.o(uApplication, "AppEnv.getAppContext\(\)");
                      externalCach = uApplication.getExternalCacheDir();
                      if (externalCach != null) {
                         externalCach = externalCach.getParentFile();
                         if (externalCach != null) {
                            parentFile = externalCach.getParentFile();
                         label_05f8 :
                            uArrayList4 = new ArrayList();
                            ArrayList uArrayList5 = new ArrayList();
                            if (parentFile != null) {
                               iterator3 = obj3;
                               uFile1 = new File(parentFile, d);
                               patchProxyRe1 = patchProxyRe2;
                               parentFile = new File(uFile1, "cache");
                               File[] uFileArray = uFile1.listFiles();
                               if (uFileArray != null) {
                                  List list5 = ArraysKt___ArraysKt.qa(uFileArray);
                                  if (list5 != null) {
                                     growthCleane1 = growthCleane2;
                                     uArrayList6 = new ArrayList();
                                     iterator4 = list5.iterator();
                                     while (iterator4.hasNext()) {
                                        obj14 = obj6;
                                        obj15 = iterator4.next();
                                        obj16 = obj15;
                                        if (obj16.isDirectory()) {
                                           iterator5 = iterator4;
                                           str2 = obj16.getName();
                                           ostartScanAp3 = ostartScanAp2;
                                           String str7 = "file.name";
                                           a.o(str2, str7);
                                           i4 = i1;
                                           obj = "null cannot be cast to non-null type java.lang.String";
                                           Objects.requireNonNull(str2, obj);
                                           str2 = str2.toLowerCase();
                                           i5 = i3;
                                           String str8 = "\(this as java.lang.String\).toLowerCase\(\)";
                                           a.o(str2, str8);
                                           uob2 = uob;
                                           if (!a.g(str2, "download")) {
                                              str2 = obj16.getName();
                                              a.o(str2, str7);
                                              Objects.requireNonNull(str2, obj);
                                              obj = str2.toLowerCase();
                                              a.o(obj, str8);
                                              if (!a.g(obj, "downloads")) {
                                              label_068f :
                                                 i1 = 0;
                                              label_0690 :
                                                 if (i1) {
                                                    uArrayList6.add(obj15);
                                                 }
                                                 obj15 = obj14;
                                                 iterator4 = iterator5;
                                                 ostartScanAp2 = ostartScanAp3;
                                                 i1 = i4;
                                                 i3 = i5;
                                                 uob = uob2;
                                              }
                                           }
                                           i1 = 1;
                                           goto label_0690 ;
                                        }else {
                                           i4 = i1;
                                           i5 = i3;
                                           ostartScanAp3 = ostartScanAp2;
                                           iterator5 = iterator4;
                                           uob2 = uob;
                                           goto label_068f ;
                                        }
                                     }
                                     i4 = i1;
                                     i5 = i3;
                                     ostartScanAp3 = ostartScanAp2;
                                     obj14 = obj6;
                                     uob2 = uob;
                                  label_06bd :
                                     obj12.a = parentFile;
                                     obj12.i(uArrayList6);
                                     File[] uFileArray1 = uFile1.listFiles();
                                     if (uFileArray1 != null) {
                                        List list6 = ArraysKt___ArraysKt.qa(uFileArray1);
                                        if (list6 != null) {
                                           obj3 = list6.iterator();
                                           while (obj3.hasNext()) {
                                              obj17 = obj3.next();
                                              Object obj18 = obj17;
                                              i6 = a.g(obj18, parentFile);
                                              i3 = uArrayList6.contains(obj18);
                                              obj18 = (!i6 && !i3)? 1: null;
                                              if (obj18) {
                                                 uArrayList4.add(obj17);
                                              }
                                           }
                                        }
                                     }
                                     obj12.h(uArrayList4);
                                  }
                               }
                               i4 = i1;
                               growthCleane1 = growthCleane2;
                               i5 = i3;
                               ostartScanAp3 = ostartScanAp2;
                               obj14 = obj6;
                               uob2 = uob;
                               uArrayList6 = CollectionsKt__CollectionsKt.E();
                               goto label_06bd ;
                            }else {
                               iterator3 = obj3;
                               i4 = i1;
                               growthCleane1 = growthCleane2;
                               i5 = i3;
                               ostartScanAp3 = ostartScanAp2;
                               obj14 = obj6;
                               patchProxyRe1 = patchProxyRe2;
                               uob2 = uob;
                            }
                            uFile1 = Environment.getExternalStorageDirectory();
                            obj = obj9;
                            if (StringsKt__StringsKt.O2(d, obj, false, 2, null)) {
                               parentFile = new File(uFile1, d);
                               if (!parentFile.exists()) {
                                  parentFile = null;
                               }
                               if (parentFile != null) {
                                  uArrayList5.add(parentFile);
                               }
                               parentFile = new File(uFile1, '.'+d);
                               if (!parentFile.exists()) {
                                  parentFile = null;
                               }
                               if (parentFile != null) {
                                  uArrayList5.add(parentFile);
                               }
                            }
                            obj3 = GrowthCleanerHelper.h().iterator();
                            while (obj3.hasNext()) {
                               parentFile = new File(obj3.next(), d);
                               if (!parentFile.exists()) {
                                  parentFile = null;
                               }
                               if (parentFile != null) {
                                  uArrayList5.add(parentFile);
                               }
                            }
                            obj12.d = uArrayList5;
                         }
                      }
                      parentFile = null;
                      goto label_05f8 ;
                   }
                   uFile1 = obj12.a();
                   List list3 = obj12.b();
                   obj13 = obj12.c();
                   list4 = obj12.d();
                   j$g og1 = null;
                   long l1 = (b.a().d(uFile1))? og1: GrowthCleanerHelper.d(uFile1, null, 2, null);
                   uoa.l = new c0(uFile1, Long.valueOf(l1), Boolean.TRUE, GrowthCleanerTag.RELIEVED);
                   if (list3 != null) {
                      obj3 = list3.iterator();
                      while (obj3.hasNext()) {
                         uFile = obj3.next();
                         l1 = (b.a().d(uFile))? og1: GrowthCleanerHelper.d(uFile, null, 2, null);
                         uoa.m.add(new c0(uFile, Long.valueOf(l1), Boolean.FALSE, GrowthCleanerTag.CAUTIOUS));
                      }
                      a = l1.a;
                   }
                   if (obj13 != null) {
                      obj3 = obj13.iterator();
                      while (obj3.hasNext()) {
                         uFile = obj3.next();
                         l1 = (b.a().d(uFile))? og1: GrowthCleanerHelper.d(uFile, null, 2, null);
                         uoa.n.add(new c0(uFile, Long.valueOf(l1), Boolean.FALSE, GrowthCleanerTag.ADVISE));
                      }
                      a = l1.a;
                   }
                   if (list4 != null) {
                      obj3 = list4.iterator();
                      while (obj3.hasNext()) {
                         uFile = obj3.next();
                         long l2 = (b.a().d(uFile))? og1: GrowthCleanerHelper.d(uFile, null, 2, null);
                         uoa.o.add(new c0(uFile, Long.valueOf(l2), Boolean.FALSE, GrowthCleanerTag.ADVISE));
                      }
                      a = l1.a;
                   }
                   obj4.add(uoa);
                   uob3 = uob2;
                   l = uob3.c + uoa.l.f().longValue();
                   uob3.c = l;
                   l = uob3.d + v.e(uoa.m);
                   uob3.d = l;
                   l = uob3.e + v.e(uoa.n);
                   uob3.e = l;
                   l = uob3.f + v.e(uoa.o);
                   uob3.f = l;
                   i6 = i5 + 1;
                   og = new j$g(b, i6, i4, uob3, uoa);
                   obj6 = ostartScanAp3;
                   obj6.invoke(og1);
                   uob = uob3;
                   obj9 = obj;
                   i3 = i6;
                   ostartScanAp2 = obj6;
                   obj3 = iterator3;
                   growthCleane2 = growthCleane1;
                   patchProxyRe3 = patchProxyRe1;
                   obj15 = obj14;
                   i1 = i4;
                }
                i4 = i1;
                growthCleane1 = growthCleane2;
                obj14 = obj6;
                uob3 = uob;
                patchProxyRe1 = patchProxyRe3;
                obj6 = ostartScanAp2;
                try{
                   uCountDownLa1.await();
                }catch(java.lang.Exception e0){
                }
                obj17 = CollectionsKt___CollectionsKt.G5(obj14.keySet());
                uArrayList2 = PatchProxy.applyOneRefs(obj17, null, growthCleane1, "5");
                if (uArrayList2 != patchProxyRe1) {
                }else {
                   uArrayList2 = new ArrayList();
                   list4 = CollectionsKt__CollectionsKt.E();
                   parentFile = Environment.getExternalStorageDirectory();
                   if (parentFile == null) {
                      parentFile = null;
                   }
                   GrowthCleanerHelper.i(parentFile, list4, obj17, uArrayList2);
                   iterator1 = GrowthCleanerHelper.h().iterator();
                   while (iterator1.hasNext()) {
                      GrowthCleanerHelper.i(iterator1.next(), list4, obj17, uArrayList2);
                   }
                }
                ArrayList uArrayList7 = new ArrayList();
                iterator6 = obj7.iterator();
                while (iterator6.hasNext()) {
                   obj19 = iterator6.next();
                   int i7 = b.a().d(obj19) ^ 1;
                   if (i7) {
                      uArrayList7.add(obj19);
                   }
                }
                uArrayList8 = new ArrayList();
                Iterator iterator7 = uArrayList7.iterator();
                while (iterator7.hasNext()) {
                   obj19 = iterator7.next();
                   obj20 = obj19;
                   Iterator iterator8 = uArrayList2.iterator();
                   uoa = 1;
                   while (iterator8.hasNext()) {
                      if (GrowthCleanerHelper.f(obj20, iterator8.next())) {
                         uoa = null;
                      }
                   }
                   if (uoa) {
                      uArrayList8.add(obj19);
                   }
                }
                iterator7 = uArrayList8.iterator();
                while (iterator7.hasNext()) {
                   uFile = iterator7.next();
                   PackageManager packageManag2 = packageManag1;
                   PackageInfo packageArchi = packageManag2.getPackageArchiveInfo(uFile.getAbsolutePath(), 128);
                   if (packageArchi != null) {
                      uoa = new a();
                      uoa.a = 2;
                      uoa.a(packageArchi);
                      iterator6 = obj8.iterator();
                      while (true) {
                         if (iterator6.hasNext()) {
                            obj20 = iterator6.next();
                            obj19 = obj20;
                            i = (a.g(uoa.d, obj19.packageName) && a.g(uoa.e, obj19.versionName))? true: false;
                            if (!i) {
                               continue ;
                            }
                         }else {
                            obj20 = null;
                         }
                         i = (obj20 != null)? true: false;
                         uoa.h = i;
                         Long longx = Long.valueOf(GrowthCleanerHelper.d(uFile, null, 2, null));
                         obj19 = Boolean.valueOf(uoa.h);
                         GrowthCleanerTag aPK_INSTALLE = (uoa.h != null)? GrowthCleanerTag.APK_INSTALLED: GrowthCleanerTag.APK_UNINSTALLED;
                         uoa.j = new c0(uFile, longx, obj19, aPK_INSTALLE);
                         obj4.add(uoa);
                         l = e0.a + uoa.j.f().longValue();
                         e0.a = l;
                         i = i4 - 1;
                         og = aPK_INSTALLE;
                         og2 = aPK_INSTALLE;
                         og = new j$g(b, i, i4, e0, uoa);
                         obj6.invoke(og2);
                      }
                   }else {
                      p op = null;
                   }
                   packageManag1 = packageManag2;
                   og2 = null;
                }
                obj6.invoke(new j$e(b, i4, e0, obj4));
                obj1 = obj4;
             }
          }else {
             oj2 = oj1;
             obj = str1;
             uArrayList1 = 0;
          }
          a uoa1 = a.class;
          if (PatchProxy.isSupport(oj2)) {
             Object[] objArray = new Object[]{Integer.valueOf(uArrayList1),str,obj,Boolean.TRUE,null};
             oj3 = oj2;
             obj2 = PatchProxy.apply(objArray, oj, oj3, "25");
             if (obj2 != patchProxyRe) {
                goto label_00af ;
             }
          }else {
             oj3 = oj2;
             uCountDownLa = null;
          }
          obj10 = "appList";
          if (PatchProxy.isSupport(oj3)) {
             packageManag1 = packageManag;
             str2 = obj10;
             uArrayList1 = uArrayList;
             b1 = true;
             obj16 = uoa1;
             obj25 = PatchProxy.applyFourRefs(obj10, str, obj, Boolean.TRUE, oj, j.class, "30");
             if (obj25 != patchProxyRe) {
                b2 = obj25.booleanValue();
             }else if(j.i() && (oj.j(str2, str) && (c.b(str2) && oj.b(str, obj, str2, b1)))){
                b2 = true;
             }else {
                b2 = false;
             }
          }else {
             obj16 = uoa1;
             uArrayList1 = uArrayList;
             packageManag1 = packageManag;
             b1 = true;
             str2 = obj10;
             goto label_00f6 ;
          }
          obj25 = "appList";
          obj13 = (oj.n(obj25, str, obj, b1) && b2)? 1: null;
          j.c("appList", "get_installed_packages_force", str, null, obj, obj13, b2, 0);
          obj = "installedPackagesInCache-%s";
          if (!obj13) {
             obj26 = PatchProxy.apply(null, null, obj16, "8");
             if (obj26 != patchProxyRe) {
                obj27 = obj26;
                on = null;
             label_0197 :
                obj26 = obj27;
                goto label_01b7 ;
             }else {
                try{
                   uArrayList8 = new ArrayList();
                   obj26 = new Object[b1];
                   try{
                      iterator4 = 0;
                      obj26[iterator4] = obj25;
                      Parcelable[] parcelableAr = b.a(String.format(obj, obj26));
                      if (parcelableAr != null) {
                         i1 = parcelableAr.length;
                         for (i = 0; i < i1; i = i + 1) {
                            uArrayList8.add(parcelableAr[i]);
                         }
                      }
                   }catch(java.lang.Exception e0){
                   }
                   e0.printStackTrace();
                }catch(java.lang.Exception e0){
                   on = null;
                   goto label_016f ;
                }
             }
          }else {
             a uoa2 = obj16;
             int i8 = 0;
             oj.a(obj25);
             Context uContext = Azeroth2.B.d();
             if (PatchProxy.isSupport(uoa2)) {
                Object obj28 = PatchProxy.applyTwoRefs(uContext, Integer.valueOf(i8), null, uoa2, "7");
                if (obj28 != patchProxyRe) {
                   obj27 = obj28;
                   goto label_0197 ;
                }
             }
             list4 = uContext.getPackageManager().getInstalledPackages(i8);
             if (list4 != null) {
                try{
                   obj26 = new Object[b1];
                   obj26[i8] = obj25;
                   b.b(String.format(obj, obj26), PackageInfo.class, list4);
                }catch(java.lang.Exception e0){
                   e0.printStackTrace();
                }
             }
          }
       }
       this.b.c = obj1;
       return;
    }
}
