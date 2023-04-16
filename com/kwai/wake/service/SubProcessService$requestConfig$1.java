package com.kwai.wake.service.SubProcessService$requestConfig$1;
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
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
import gx7.k;
import dx7.f;
import ax7.a;
import android.app.Application;
import java.lang.Throwable;
import android.util.Log;
import gx7.b;
import java.util.Objects;
import java.io.File;
import java.nio.charset.Charset;
import kotlin.io.FilesKt__FileReadWriteKt;
import com.kwai.wake.sp.SubProcessSp;
import gx7.j;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import trd.t0;
import java.lang.CharSequence;
import gx7.g;
import android.util.Base64;
import com.middleware.security.MXSec;
import com.middleware.security.wrapper.IKSecurityBase;
import zsd.d;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import com.kwai.wake.pojo.PkgModel;
import java.util.ArrayList;
import nsd.u;
import com.kwai.wake.pojo.Element;
import java.lang.Iterable;
import wsd.m;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.kwai.wake.service.SubProcessService$requestConfig$1$1$2$1$1$1;
import msd.l;
import kotlin.sequences.SequencesKt___SequencesKt;
import java.util.Iterator;
import kotlin.Result;
import com.kwai.middleware.azeroth.Azeroth2;
import com.google.gson.Gson;

public final class SubProcessService$requestConfig$1 extends SuspendLambda implements p	// class@00111f
{
    public final Context $context;
    public final long $current;
    public Object L$0;
    public int label;
    public k0 p$;

    public void SubProcessService$requestConfig$1(Context p0,long p1,c p2){
       this.$context = p0;
       this.$current = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       a.p(p1, "completion");
       SubProcessService$requestConfig$1 orequestConf = new SubProcessService$requestConfig$1(this.$context, this.$current, p1);
       orequestConf.p$ = p0;
       return orequestConf;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       String str;
       a uoa;
       JSONObject jSONObject;
       k a;
       a uoa1;
       l1 a1;
       Application uApplication1;
       String str6;
       String str7;
       SubProcessSp obj3;
       byte[] uobyteArray;
       String str8;
       int i3;
       SubProcessSp$Companion f;
       f uof1;
       long l1;
       boolean b;
       JSONArray jSONArray2;
       String str9;
       int i8;
       JSONArray jSONArray3;
       Application uApplication3;
       Context uContext;
       Application uApplication4;
       Context uContext1;
       SubProcessService$requestConfig$1 orequestConf = this;
       JSONObject obj = b.h();
       SubProcessService$requestConfig$1 label = orequestConf.label;
       int i = 1;
       if (label != null) {
          if (label == i) {
             j0.n(p0);
             str = p0;
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          orequestConf.L$0 = orequestConf.p$;
          orequestConf.label = i;
          str = MatrixRequestApi.b.a(new LinkedHashMap(), orequestConf);
          if (str == obj) {
             return obj;
          }
       }
       String str1 = "failed";
       Charset uCharset = null;
       if (str != null) {
          obj = new JSONObject(str);
          f d = f.d;
          String str2 = "";
          if (d.c()) {
             uoa = f.a(d);
             if (uoa != null) {
                Application uApplication = uoa.a();
                if (uApplication != null) {
                   Objects.requireNonNull(b.a);
                   a.p(uApplication, "context");
                   File externalFile = uApplication.getExternalFilesDir(str2);
                   if (externalFile != null) {
                      File uFile = new File(externalFile.getPath(), "config.json");
                      if (uFile.exists()) {
                         jSONObject = new JSONObject(FilesKt__FileReadWriteKt.z(uFile, uCharset, i, uCharset));
                      label_00a3 :
                         if (jSONObject != null) {
                            obj = jSONObject;
                         }
                      }
                   }
                   jSONObject = uCharset;
                   goto label_00a3 ;
                }
             }
          }
          if (obj != null) {
             int i1 = obj.optInt("code", -1);
             if (i1 != i) {
                a = k.a;
                uoa1 = f.a(f.d);
                if (uoa1 != null) {
                   uCharset = uoa1.a();
                }
                a.d(uCharset, str1, String.valueOf(i1));
             }else {
                g.a(SubProcessSp.f.a(orequestConf.$context).a.edit().putLong("last_request_timestamp", orequestConf.$current));
                Map map = t0.z();
                String str3 = obj.optString("data", str2);
                a.o(str3, "encryptDataStr");
                int i2 = 0;
                f uof = (!str3.length())? 1: null;
                String str4 = "0adf377a-7aae-49ca-9d5b-929e68c588c9";
                String str5 = "Kuaiwake";
                if (uof) {
                   a = k.a;
                   uoa1 = f.a(f.d);
                   uApplication1 = (uoa1 != null)? uoa1.a(): uCharset;
                   a.d(uApplication1, str1, "enc data is null or empty");
                label_018a :
                   str6 = str4;
                   str7 = str5;
                }else if(f.d.c() && obj.optInt("is_plain", i2) > 0){
                   i3 = 1;
                }else {
                   i3 = 0;
                }
                if (!i3) {
                   Objects.requireNonNull(g.a);
                   i3 = (str3 == null || !str3.length())? 1: 0;
                   if (i3) {
                      str3 = uCharset;
                   }else {
                      MXSec mXSec = MXSec.get();
                      a.o(mXSec, "MXSec.get\(\)");
                      uobyteArray = mXSec.getWrapper().atlasDecrypt(str5, str4, i2, Base64.decode(str3, i2));
                      a.o(uobyteArray, "output");
                      str3 = new String(uobyteArray, d.a);
                   }
                }
                a = (str3 == null || !str3.length())? 1: null;
                if (a) {
                   a = k.a;
                   uoa1 = f.a(f.d);
                   uApplication1 = (uoa1 != null)? uoa1.a(): uCharset;
                   a.d(uApplication1, str1, "data is null or empty");
                   goto label_018a ;
                }else {
                   obj = new JSONObject(str3);
                   if (obj != null) {
                      f d1 = f.d;
                      SubProcessService$requestConfig$1 $context = orequestConf.$context;
                      Objects.requireNonNull(d1);
                      JSONObject jSONObject1 = obj.optJSONObject("intervals");
                      if (jSONObject1 != null) {
                         i = jSONObject1.optInt("share_interval_minutes", 10);
                         f = SubProcessSp.f;
                         SubProcessSp subProcessSp = f.a($context);
                         TimeUnit mINUTES = TimeUnit.MINUTES;
                         uof1 = d1;
                         long l = mINUTES.toMillis((long)jSONObject1.optInt("request_interval_minutes", 30));
                         str6 = str4;
                         str7 = str5;
                         obj3 = subProcessSp.b;
                         if (l - obj3 < 0) {
                            l = obj3;
                         }
                         g.a(subProcessSp.a.edit().putLong("request_min_interval", l));
                         SubProcessSp subProcessSp1 = f.a($context);
                         l1 = mINUTES.toMillis((long)i);
                         obj3 = subProcessSp1.d;
                         if (l1 - obj3 < 0) {
                            l1 = obj3;
                         }
                         g.a(subProcessSp1.a.edit().putLong("share_interval", l1));
                      }else {
                         uof1 = d1;
                         str6 = str4;
                         str7 = str5;
                      }
                      JSONArray jSONArray = obj.optJSONArray("pkg_list");
                      if (jSONArray != null) {
                         Objects.requireNonNull(PkgModel.Companion);
                         str = "jsonArray";
                         a.p(jSONArray, str);
                         ArrayList uArrayList = new ArrayList();
                         boolean i4 = jSONArray.length();
                         for (int i5 = 0; i5 < i4; i4 = i8) {
                            JSONObject jSONObject2 = jSONArray.optJSONObject(i5);
                            if (jSONObject2 != null) {
                               Objects.requireNonNull(PkgModel.Companion);
                               PkgModel pkgModel = new PkgModel(null);
                               pkgModel.pkg = jSONObject2.optString("pkg", str2);
                               pkgModel.setTimestamp(jSONObject2.optLong("timestamp", 0));
                               str4 = "enable";
                               b = (jSONObject2.optInt(str4, 0) > 0)? true: false;
                               pkgModel.enable = b;
                               pkgModel.strategy = jSONObject2.optInt("strategy", 2);
                               JSONArray jSONArray1 = jSONObject2.optJSONArray("elements");
                               if (jSONArray1 != null) {
                                  Objects.requireNonNull(Element.Companion);
                                  a.p(jSONArray1, str);
                                  ArrayList uArrayList1 = new ArrayList();
                                  int i6 = jSONArray1.length();
                                  int i7 = 0;
                                  while (i7 < i6) {
                                     jSONArray2 = jSONArray;
                                     obj = jSONArray1.optJSONObject(i7);
                                     if (obj != null) {
                                        Objects.requireNonNull(Element.Companion);
                                        str9 = str;
                                        i8 = i4;
                                        Element uElement = new Element(null);
                                        i4 = 0;
                                        if (obj.optInt(str4, i4) > 0) {
                                           i4 = true;
                                        }
                                        uElement.enable = i4;
                                        jSONArray3 = jSONArray1;
                                        uElement.mode = obj.optInt("mode", 0);
                                        uElement.uri = obj.optString("uri", str2);
                                        uArrayList1.add(uElement);
                                     }else {
                                        str9 = str;
                                        i8 = i4;
                                        jSONArray3 = jSONArray1;
                                     }
                                     i7 = i7 + 1;
                                     str = str9;
                                     jSONArray = jSONArray2;
                                     i4 = i8;
                                     jSONArray1 = jSONArray3;
                                  }
                                  jSONArray2 = jSONArray;
                                  str9 = str;
                                  i8 = i4;
                                  pkgModel.elements = uArrayList1;
                               }else {
                                  jSONArray2 = jSONArray;
                                  str9 = str;
                                  i8 = i4;
                               }
                               uArrayList.add(pkgModel);
                            }else {
                               jSONArray2 = jSONArray;
                               str9 = str;
                               i8 = i4;
                            }
                            i5 = i5 + 1;
                            str = str9;
                            jSONArray = jSONArray2;
                         }
                         a uoa2 = f.a(f.d);
                         if (uoa2 != null) {
                            Application uApplication2 = uoa2.a();
                            if (uApplication2 != null) {
                               str4 = uApplication2.getPackageName();
                            label_0313 :
                               map = new LinkedHashMap();
                               Iterator iterator = SequencesKt___SequencesKt.i0(CollectionsKt___CollectionsKt.l1(uArrayList), new SubProcessService$requestConfig$1$1$2$1$1$1(str4)).iterator();
                               while (iterator.hasNext()) {
                                  Object obj4 = iterator.next();
                                  str8 = obj4.getPkg();
                                  if (str8 == null) {
                                     str8 = str2;
                                  }
                                  map.put(str8, obj4);
                               }
                               if (map.isEmpty()) {
                                  a = k.a;
                                  uoa1 = f.a(f.d);
                                  uApplication3 = (uoa1 != null)? uoa1.a(): null;
                                  a.d(uApplication3, str1, "valid model list is empty");
                               }else {
                                  a = k.a;
                                  uoa1 = f.a(f.d);
                                  uApplication3 = (uoa1 != null)? uoa1.a(): null;
                                  a.d(uApplication3, "success", "success");
                               }
                               a1 = l1.a;
                            }
                         }
                         str4 = null;
                         goto label_0313 ;
                      }else {
                         a = k.a;
                         uoa1 = f.a(uof1);
                         uApplication3 = (uoa1 != null)? uoa1.a(): null;
                         a.d(uApplication3, str1, "model list parse null");
                         a1 = l1.a;
                      }
                      a1 = l1.a;
                   }else {
                      str6 = str4;
                      str7 = str5;
                      a = k.a;
                      uoa1 = f.a(f.d);
                      uApplication3 = (uoa1 != null)? uoa1.a(): null;
                      a.d(uApplication3, str1, "plan data is null or empty");
                      a1 = l1.a;
                   }
                }
                Charset obj1 = SubProcessSp.f.a(orequestConf.$context);
                Objects.requireNonNull(obj1);
                a.p(map, "map");
                MXSec obj2 = Result.constructor-impl(Azeroth2.B.k().q(map));
                obj3 = obj2;
                if (Result.isFailure-impl(obj3)) {
                   obj3 = null;
                }
                Objects.requireNonNull(g.a);
                if (obj3 != null) {
                   obj2 = MXSec.get();
                   a.o(obj2, "MXSec.get\(\)");
                   Charset a2 = d.a;
                   byte[] bytes = obj3.getBytes(a2);
                   a.o(bytes, "\(this as java.lang.String\).getBytes\(charset\)");
                   uobyteArray = Base64.encode(obj2.getWrapper().uEncrypt(str7, str6, 0, bytes), 0);
                   a.o(uobyteArray, "Base64.encode\(output, Base64.DEFAULT\)");
                   str8 = new String(uobyteArray, a2);
                }else {
                   str8 = null;
                }
                if (str8 != null) {
                   g.a(obj1.a.edit().putString("pkg_model_map", str8));
                }
             }
             a1 = l1.a;
          }else {
             a = k.a;
             uoa = f.a(f.d);
             uApplication4 = (uoa != null)? uoa.a(): null;
             a.d(uApplication4, str1, "response json is null");
             a1 = l1.a;
          }
          a1 = l1.a;
       }else {
          a = k.a;
          uoa = f.a(f.d);
          uApplication4 = (uoa != null)? uoa.a(): null;
          a.d(uApplication4, str1, "response str is null");
          a1 = l1.a;
       }
       return l1.a;
    }
}
