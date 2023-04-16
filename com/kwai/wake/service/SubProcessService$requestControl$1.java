package com.kwai.wake.service.SubProcessService$requestControl$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import android.content.Context;
import asd.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ftd.k0;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import com.kwai.wake.net.MatrixRequestApi;
import dx7.f;
import java.util.Objects;
import com.kwai.wake.sp.SubProcessSp;
import gx7.j;
import kotlin.Result;
import android.content.SharedPreferences;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kwai.middleware.azeroth.Azeroth2;
import com.google.gson.Gson;
import ex7.a;
import java.lang.reflect.Type;
import el.a;
import java.lang.Throwable;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import android.app.Application;
import ax7.a;
import com.google.gson.JsonElement;
import java.util.LinkedHashMap;
import java.util.Map;
import cx7.a;
import com.kwai.wake.pojo.ControlData;
import java.lang.CharSequence;
import com.kwai.wake.strategy.BackgroundWake;
import android.text.TextUtils;
import gx7.g;
import fx7.a;
import java.util.UUID;
import java.lang.System;
import qrd.p;
import com.kwai.wake.pojo.PkgModel;
import gx7.k;
import dx7.a;
import zw7.b;
import zw7.b$a;
import com.kwai.wake.pojo.Element;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import java.util.HashMap;
import gx7.a;
import fx7.c;
import java.lang.Runnable;
import f97.d;
import fx7.b;
import java.lang.StringBuilder;
import java.lang.Boolean;
import dsd.a;
import java.util.Collection;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class SubProcessService$requestControl$1 extends SuspendLambda implements p	// class@001120
{
    public final Context $context;
    public final long $current;
    public Object L$0;
    public int label;
    public k0 p$;

    public void SubProcessService$requestControl$1(Context p0,long p1,c p2){
       this.$context = p0;
       this.$current = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       a.p(p1, "completion");
       SubProcessService$requestControl$1 orequestCont = new SubProcessService$requestControl$1(this.$context, this.$current, p1);
       orequestCont.p$ = p0;
       return orequestCont;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       int i1;
       String packageName;
       boolean b;
       a a;
       String packageName1;
       JsonObject jsonObject;
       String str5;
       String str6;
       String str7;
       String pkg;
       String str8;
       String str9;
       ControlData uControlData1;
       boolean i2;
       ControlData uControlData2;
       ArrayList uArrayList;
       Iterator iterator;
       int i3;
       SharedPreferences$Editor uEditor;
       SubProcessSp c1;
       SubProcessSp subProcessSp1;
       k a3;
       a uoa1;
       Application uApplication2;
       JsonObject jsonObject2;
       a c3;
       JsonObject jsonObject3;
       List elements;
       int i4;
       HashMap hashMap;
       int i5;
       Object obj2;
       HashMap hashMap1;
       int i6;
       long l;
       BackgroundWake uBackgroundW1;
       PkgModel pkgModel1;
       JsonObject jsonObject4;
       String str13;
       HashMap hashMap2;
       b uob;
       int i7;
       long l1;
       c uoc;
       a a5;
       int mode;
       Context uContext;
       List list;
       Iterator obj5;
       SubProcessService$requestControl$1 orequestCont = this;
       String obj = b.h();
       SubProcessService$requestControl$1 label = orequestCont.label;
       String str = "pkgs_to_collect";
       String str1 = "";
       int i = 1;
       if (label != null) {
          if (label == i) {
             j0.n(p0);
             i1 = p0;
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          SubProcessService$requestControl$1 p$ = orequestCont.p$;
          MatrixRequestApi b1 = MatrixRequestApi.b;
          Objects.requireNonNull(f.d);
          SubProcessSp subProcessSp = SubProcessSp.f.a(orequestCont.$context);
          Objects.requireNonNull(subProcessSp);
          str6 = subProcessSp.a.getString(str, str1);
          Throwable throwable = (str6 == null || !str6.length())? 1: null;
          if (throwable) {
             list = CollectionsKt__CollectionsKt.E();
          }else {
             list = Azeroth2.B.k().i(str6, new a().getType());
             a.o(list, "Azeroth2.gson.fromJson\(j¡­<List<String>>\(\) {}.type\)");
          }
          list = Result.constructor-impl(list);
          if (Result.exceptionOrNull-impl(list) != null) {
             list = CollectionsKt__CollectionsKt.E();
          }
          String str14 = "{}";
          if (list.isEmpty()) {
             jsonObject = new JsonObject();
             ArrayList uArrayList1 = new ArrayList();
             Iterator iterator1 = f.c.iterator();
             while (iterator1.hasNext()) {
                Object obj4 = iterator1.next();
                Object obj3 = obj4;
                a a6 = f.a;
                if (a6 != null) {
                   Application uApplication3 = a6.a();
                   if (uApplication3 != null) {
                      str5 = uApplication3.getPackageName();
                   label_00c4 :
                      int i8 = a.g(obj3, str5) ^ i;
                      if (i8) {
                         uArrayList1.add(obj4);
                      }
                   }
                }
                str5 = null;
                goto label_00c4 ;
             }
             if (uArrayList1.isEmpty() ^ i) {
                a a7 = f.a;
                if (a7 != null) {
                   Application uApplication4 = a7.a();
                   if (uApplication4 != null) {
                      Iterator iterator2 = uArrayList1.iterator();
                      while (iterator2.hasNext()) {
                         packageName1 = iterator2.next();
                         jsonObject.G(packageName1, f.d.b(uApplication4, packageName1));
                      }
                   }
                }
             }
             obj5 = Result.constructor-impl(jsonObject.toString());
             if (Result.exceptionOrNull-impl(obj5) == null) {
                str14 = obj5;
             }
          }else {
             JsonObject jsonObject5 = new JsonObject();
             a a4 = f.a;
             if (a4 != null) {
                Application uApplication5 = a4.a();
                if (uApplication5 != null) {
                   obj5 = list.iterator();
                   while (obj5.hasNext()) {
                      packageName1 = obj5.next();
                      jsonObject5.G(packageName1, f.d.b(uApplication5, packageName1));
                   }
                }
             }
             Object obj6 = Result.constructor-impl(jsonObject5.toString());
             if (Result.exceptionOrNull-impl(obj6) == null) {
                str14 = obj6;
             }
             a.o(str14, "kotlin.runCatching {\n   ¡­Else { defaultPkgStatus }");
          }
          orequestCont.L$0 = p$;
          orequestCont.label = i;
          obj5 = b1.b(str14, new LinkedHashMap(), orequestCont);
          if (obj5 == obj) {
             return obj;
          }
       }
       obj = i1;
       if (obj != null && i == obj.result) {
          ControlData uControlData = obj.a();
          if (uControlData != null) {
             f d = f.d;
             a uoa = f.a(d);
             if (uoa != null) {
                Application uApplication = uoa.a();
                if (uApplication != null) {
                   packageName = uApplication.getPackageName();
                label_019a :
                   String str2 = uControlData.a();
                   if (str2 != null) {
                      b = (str2.length() > 0)? true: false;
                      if (b || (a.g(str2, packageName) ^ i)) {
                         Objects.requireNonNull(d);
                         a = f.a;
                         if (a != null) {
                            Application uApplication1 = a.a();
                            if (uApplication1 != null) {
                               BackgroundWake uBackgroundW = BackgroundWake.g.a(uApplication1);
                               Objects.requireNonNull(uBackgroundW);
                               String str3 = "pkg";
                               a.p(str2, str3);
                               if (TextUtils.isEmpty(uBackgroundW.e)) {
                                  Objects.requireNonNull(d);
                                  a a1 = f.a;
                                  if (a1 != null) {
                                     a1 = a1.b;
                                     if (a1 != null) {
                                     label_01e4 :
                                        uBackgroundW.e = a1;
                                     }
                                  }
                                  str6 = str1;
                                  goto label_01e4 ;
                               }
                               packageName1 = uBackgroundW.g().getPackageName();
                               String str4 = "appContext.packageName";
                               a.o(packageName1, str4);
                               BackgroundWake e = uBackgroundW.e;
                               Objects.requireNonNull(g.a);
                               a.p(packageName1, str3);
                               jsonObject = new JsonObject();
                               jsonObject.c0(str3, packageName1);
                               packageName1 = (e == null || !e.length())? 1: null;
                               if (packageName1) {
                                  e = str1;
                               }
                               jsonObject.c0("did", e);
                               jsonObject.c0("uuid", UUID.randomUUID().toString());
                               str5 = "timestamp";
                               jsonObject.c0(str5, String.valueOf(System.currentTimeMillis()));
                               str6 = jsonObject.toString();
                               a.o(str6, "JsonObject\(\).apply {\n   ¡­llis\(\)\)\)\n    }.toString\(\)");
                               PkgModel pkgModel = uBackgroundW.f.getValue().get(str2);
                               if (pkgModel != null) {
                                  packageName1 = "sessionId";
                                  a.p(str6, packageName1);
                                  str7 = "pkgModel";
                                  a.p(pkgModel, str7);
                                  k a2 = k.a;
                                  a c = uBackgroundW.c;
                                  Objects.requireNonNull(a2);
                                  a.p(str6, packageName1);
                                  JsonObject jsonObject1 = new JsonObject();
                                  pkg = pkgModel.getPkg();
                                  p0 = obj;
                                  obj = (pkg != null)? pkg: "unknown";
                                  jsonObject1.c0(str3, obj);
                                  obj = "session_id";
                                  jsonObject1.c0(obj, str6);
                                  str8 = str;
                                  str = "sdk_version_code";
                                  str9 = packageName;
                                  packageName = "20002";
                                  jsonObject1.c0(str, packageName);
                                  uControlData1 = uControlData;
                                  String str10 = "sdk_version_name";
                                  String str11 = "2.0.2";
                                  jsonObject1.c0(str10, str11);
                                  String str12 = str4;
                                  jsonObject1.c0(str5, String.valueOf(System.currentTimeMillis()));
                                  b$a.a(a.b.a(), c, "MATRIX_DO_START_V2", jsonObject1, 0, 8, null);
                                  if (!pkgModel.getEnable()) {
                                     a2.b(uBackgroundW.c, str6, null, pkgModel, null, "app not enabled", "app not enabled");
                                  label_0534 :
                                     i2 = 0;
                                  }else {
                                     a c2 = uBackgroundW.c;
                                     String obj1 = pkgModel.getPkg();
                                     if (obj1 == null || str1.equals(obj1)) {
                                        i2 = false;
                                     }else {
                                        try{
                                           c2.getPackageManager().getPackageInfo(obj1, 0);
                                           i2 = true;
                                        }catch(android.content.pm.PackageManager$NameNotFoundException e0){
                                        }catch(java.lang.RuntimeException e0){
                                        }
                                     }
                                  }
                               }
                            }
                         }
                      }
                   }
                label_052c :
                   p0 = obj;
                   str8 = str;
                   uControlData1 = uControlData;
                   str9 = packageName;
                   goto label_0534 ;
                }
             }
             packageName = null;
             goto label_019a ;
          }else {
             p0 = obj;
          }
          g.a(SubProcessSp.f.a(orequestCont.$context).a.edit().putLong("last_request_control_timestamp", orequestCont.$current));
          a3 = k.a;
          uoa1 = f.a(f.d);
          uApplication2 = (uoa1 != null)? uoa1.a(): null;
          ControlData toCollectPkg = p0.a();
          str7 = (toCollectPkg != null)? toCollectPkg.a(): null;
          a3.e(uApplication2, "success", str7);
       }else {
          p0 = obj;
          a3 = k.a;
          uoa1 = f.a(f.d);
          uApplication2 = (uoa1 != null)? uoa1.a(): null;
          a errMsg = (p0 != null)? p0.errMsg: null;
          a3.e(uApplication2, "failed", errMsg);
       }
       return l1.a;
    }
}
