package a.a.a.a.b.a.a;
import java.lang.Object;
import a.a.a.a.b.a.a$b;
import java.lang.String;
import android.util.Pair;
import a.a.a.a.b.a.b;
import com.kuaishou.security.kste.logic.base.InitCommonKSTEParams;
import android.content.Context;
import java.io.File;
import java.lang.StringBuilder;
import a.a.a.a.b.f.a;
import java.lang.System;
import java.lang.Boolean;
import org.json.JSONArray;
import java.util.ArrayList;
import org.json.JSONObject;
import a.a.a.a.b.a.c;
import f.k;
import a.a.a.a.b.f.a$a;
import java.util.Map;
import f.l;
import d.c;
import com.middleware.security.MXSec;
import com.middleware.security.wrapper.IKSecurityBase;
import com.kuaishou.security.kste.logic.base.KSTEContext;
import okhttp3.Request$Builder;
import okhttp3.FormBody$Builder;
import android.util.Base64;
import okhttp3.FormBody;
import okhttp3.RequestBody;
import okhttp3.Request;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import java.lang.Thread;
import a.a.a.a.b.e.b$b;
import java.lang.Throwable;
import java.lang.StackTraceElement;
import java.util.Arrays;
import a.a.a.a.b.e.b;
import okhttp3.ResponseBody;
import a.a.a.a.b.e.c;
import a.a.a.a.b.e.c$b;
import java.util.List;
import java.lang.StringBuffer;
import java.util.Iterator;
import f.i;
import a.a.a.a.b.a.c$a;
import java.lang.Long;
import java.lang.Integer;
import java.util.HashSet;
import f.b$b;
import java.util.Objects;
import f.h;
import java.util.Set;
import f.n$b;
import f.n;
import f.n$a$a;
import f.n$a;
import f.n$c$a;
import f.n$c;
import a.a.a.a.b.e.a;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.kuaishou.security.kste.export.IKSTECallback;
import com.kuaishou.security.kste.logic.event.KSTEException;
import java.util.concurrent.CountDownLatch;
import a.a.a.a.b.a.a$a;
import java.lang.Runnable;
import java.util.concurrent.ExecutorService;
import java.lang.InterruptedException;
import org.json.JSONException;

public class a	// class@000009
{

    public void a(){
       super();
    }
    public static a a(){
       return a$b.a;
    }
    public Pair b(String p0,String p1,String p2,String p3){
       String str = b.b().l().context().getFilesDir().getAbsolutePath()+File.separator+"sec_kste/";
       String str1 = str+"/temp/"+a.b()+"/"+System.currentTimeMillis()+".so";
       File uFile = new File(str1);
       uFile.getParentFile().mkdirs();
       p1 = "";
       if (m$f.f(p0, p1, uFile, p2)) {
          m$c.b("download file  "+str1+"oncomplete");
          if ((m$f.h(uFile)).equals(p2)) {
             p1 = "/official/";
             p0 = str+p1+a.b()+"/"+p3+"/libkste.so";
             File uFile1 = new File(p0);
             uFile1.getParentFile().mkdirs();
             uFile1.delete();
             m$f.d(uFile, uFile1);
             uFile.delete();
             if (uFile1.exists()) {
                String[] stringArray = new File(str+p1+a.b()+"/").list();
                int len = stringArray.length;
                int i = 0;
                while (i < len) {
                   object oobject = stringArray[i];
                   if (!oobject.equals(p3)) {
                      m$c.b("will delete file "+oobject);
                      m$f.c(new File(str+p1+a.b()+"/"+oobject));
                   }
                   i = i + 1;
                }
             }
             m$c.b("start to load "+p0);
             return new Pair(Boolean.TRUE, p0);
          }else {
             m$c.d("download file md5 wrong");
             if (uFile.exists()) {
                uFile.delete();
             }
             return new Pair(Boolean.FALSE, p1);
          }
       }else {
          m$c.d("http download interpreter so error");
          if (uFile.exists()) {
             uFile.delete();
          }
          return new Pair(Boolean.FALSE, p1);
       }
    }
    public Pair c(String p0,JSONArray p1){
       boolean b;
       b$b a;
       ArrayList uArrayList = new ArrayList();
       StringBuilder str = "https://kste.ksapisrv.com/rest/kste/bcupdate";
       int i = 0;
       JSONObject jSONObject = new JSONObject();
       jSONObject.put(c.a, b.b().l().appVer());
       jSONObject.put(c.b, b.b().l().did());
       jSONObject.put(c.d, b.b().l().userId());
       jSONObject.put(c.c, "1.0.0.107.3722af76");
       jSONObject.put(c.e, c.T);
       String str1 = "";
       if (b.b().q().a.containsKey(a.a())) {
          str1 = b.b().q().a.get(a.a()).a;
       }
       jSONObject.put(c.f, str1);
       jSONObject.put(c.g, b.b().l().appkey());
       jSONObject.put(c.h, a.b());
       int[] ointArray = c.b();
       JSONArray jSONArray = new JSONArray();
       for (int i1 = 0; i1 < ointArray.length; i1 = i1 + 1) {
          jSONArray.put(ointArray[i1]);
       }
       jSONObject.put(c.i, jSONArray);
       jSONObject.put(c.j, b.b().l().appKPN());
       jSONObject.put(c.k, "32");
       m$c.b(p1.toString());
       jSONObject.put(c.l, p1);
       m$c.b("Start fetch bitcode tasktag: "+p0+jSONObject);
       Request request = new Request$Builder().url(str).tag(p0).post(new FormBody$Builder().add(c.s0, Base64.encodeToString(MXSec.get().getWrapper().atlasEncrypt(KSTEContext.SDKNAME, KSTEContext.SDKID, i, (jSONObject.toString()).getBytes()), 2)).add(c.t0, MXSec.get().getWrapper().atlasSign(KSTEContext.SDKNAME, KSTEContext.SDKID, i, jSONObject.toString())).build()).build();
       Call uCall = m$f.a.newCall(request);
       Call uCall1 = m$f.b.newCall(request).clone();
       Response response = uCall.execute();
       if (response.isSuccessful() && (response.code() >= 200 && (response.code() < 300 && response.body() != null))) {
          m$c.b("fetch bitcode https://kste.ksapisrv.com/rest/kste/bcupdate success");
          response.body().contentLength();
          JSONObject jSONObject1 = new JSONObject(response.body().string());
          b = true;
          if (jSONObject1.optInt("code") == b) {
             byte[] uobyteArray = MXSec.get().getWrapper().atlasDecrypt(KSTEContext.SDKNAME, KSTEContext.SDKID, i, Base64.decode(jSONObject1.optString("data"), i));
             if (!uobyteArray.length) {
                m$c.d("resp data decryption failed");
                b.a(b$b.a, "SEC_ERROR_BC_NETWORK_RESP_DECRYPT_ERROR encData="+response.body().string(), 206);
             }else {
                m$c.b("resp bitcode "+new String(uobyteArray));
                JSONObject jSONObject2 = new JSONObject(new String(uobyteArray));
                if (jSONObject2.optInt(c.v) == b) {
                   jSONObject2 = jSONObject2.optJSONArray(c.y);
                   if (jSONObject2 != null && jSONObject2.length() > 0) {
                      b.b().l().recorder().b.d = System.currentTimeMillis();
                      uArrayList = this.g(p0, jSONObject2);
                      c uoc = b.b().l().recorder();
                      jSONObject2.d = System.currentTimeMillis() - uoc.b.d;
                   }
                   i = uArrayList.isEmpty();
                   List list = b.b().p();
                   _monitor_enter(list);
                   jSONObject2 = new JSONArray();
                   StringBuffer str2 = "";
                   Iterator iterator = b.b().p().iterator();
                   while (iterator.hasNext()) {
                      i oi = iterator.next();
                      if (oi == null || str2.indexOf(oi.k()) != -1) {
                         continue ;
                      }
                      str2 = str2+oi.k();
                      JSONObject jSONObject3 = new JSONObject();
                      jSONObject3.put(c.k0, oi.k());
                      jSONObject3.put(c.l0, oi.b);
                      jSONObject3.put(c.m0, oi.c);
                      jSONObject3.put(c.n0, oi.d);
                      jSONObject3.put(c.o0, oi.e);
                      jSONObject3.put(c.p0, oi.g);
                      jSONObject3.put(c.q0, oi.h);
                      jSONObject3.put(c.r0, oi.m.a());
                      jSONObject2.put(jSONObject3);
                   }
                   m$c.b("MSP_BCVERS_HISTORY size is "+jSONObject2.length());
                   KSTEContext.mkv.c(c.j0, jSONObject2.toString());
                   b.b().c = jSONObject2.toString();
                   _monitor_exit(list);
                }else {
                   b.a(b$b.a, "SEC_ERROR_FETCHBITCODE_RESP_ERROR  resp: "+new String(uobyteArray), 110);
                }
             }
          }else {
             a = b$b.a;
             str = "SEC_ERROR_BC_NETWORK_RESP_RESULT_0 resp code="+response.code()+"body:";
             Long longx = (response.body() != null)? Long.valueOf(response.body().contentLength()): "empty";
             b.a(a, str+longx, 205);
          }
       }else {
          m$c.d("fetch bitcode http error "+Integer.valueOf(response.code()));
          b.a(b$b.a, "SEC_ERROR_FETCHBC_NETWORK_REQUESTERROR resp "+Integer.valueOf(response.code())+" httpcode:"+Integer.valueOf(response.code())+"respbody "+response.body(), 109);
       }
       m$c.b("fetch bitcode finish");
       return new Pair(Boolean.valueOf(i), uArrayList);
    }
    public final void d(List p0,JSONObject p1,String p2){
       JSONArray jSONArray;
       HashSet hashSet;
       int i1;
       boolean b;
       Object[] objArray2;
       JSONObject jSONObject = p1;
       String str = jSONObject.optString(c.J);
       int i = 0;
       if ((jSONObject.optString(c.L)).equals(c.M)) {
          m$c.b(str+" in offline mode");
          Iterator iterator = b.b().p().iterator();
          File uFile = null;
          while (iterator.hasNext()) {
             i oi = iterator.next();
             if (oi != null && (oi.k()).equals(str)) {
                new File(oi.h).delete();
                oi.m = c$a.b;
                uFile = 1;
             }
          }
          if (uFile == null) {
             jSONArray = jSONObject.optJSONArray(c.K);
             hashSet = new HashSet();
             if (jSONArray != null) {
                for (i1 = 0; i1 < jSONArray.length(); i1 = i1 + 1) {
                   hashSet.add(jSONArray.getString(i1));
                }
             }
             str = jSONObject.optString(c.H, "");
             if (!str.isEmpty()) {
                hashSet.add(str);
             }
             i oi1 = new i();
             oi1.h(jSONObject.optString(c.J));
             oi1.f(jSONObject.optInt(c.G));
             oi1.d(i);
             oi1.a(KSTEContext.BCBits);
             oi1.c(str);
             oi1.f = hashSet;
             oi1.e(jSONObject.optString(c.I, ""));
             oi1.g("");
             oi1.b(c$a.b);
             b.b().p().add(oi1);
          }
          return;
       }else {
          jSONArray = jSONObject.optJSONArray(c.K);
          hashSet = new HashSet();
          if (jSONArray != null) {
             for (int i2 = 0; i2 < jSONArray.length(); i2 = i2 + 1) {
                hashSet.add(jSONArray.getString(i2));
             }
          }
          str = jSONObject.optString(c.H);
          if (!str.isEmpty()) {
             hashSet.add(str);
          }
          b$b uob = new b$b();
          uob.a = Integer.valueOf(jSONObject.optInt(c.G));
          uob.b = str;
          str = jSONObject.optString(c.I);
          Objects.requireNonNull(str, "Null bcMd5");
          uob.c = str;
          str = jSONObject.optString(c.J);
          Objects.requireNonNull(str, "Null vmBizId");
          uob.e = str;
          uob.d = hashSet;
          h oh = uob.d();
          h oh1 = uob.d();
          String str1 = String.valueOf(KSTEContext.BCBits);
          _monitor_enter(this);
          Pair pair = new Pair(Boolean.FALSE, "");
          String str2 = b.b().l().context().getFilesDir().getAbsolutePath()+File.separator+"sec_kste/";
          String str3 = str2+"/temp/"+a.b()+"/"+str1+"/"+oh1.e()+"/"+System.currentTimeMillis()+".b";
          File uFile1 = new File(str3);
          uFile1.getParentFile().mkdirs();
          Iterator iterator1 = oh1.b().iterator();
          while (true) {
             if (iterator1.hasNext()) {
                String str4 = iterator1.next();
                if (m$f.f(p2, str4, uFile1, oh1.c())) {
                   m$c.b("download file "+str3+" oncomplete "+uFile1.length()+"\)");
                   File uFile2 = new File(str3);
                   String str5 = m$f.h(uFile2);
                   i1 = 4;
                   if (str5.equals(oh1.c())) {
                      Object[] objArray = new Object[i1];
                      objArray[i] = str2;
                      objArray[1] = str1;
                      objArray[2] = oh1.e();
                      objArray[3] = Integer.valueOf(oh1.d());
                      String str6 = String.format("%s/official/bc/%s/%s/%s/b_raw.b", objArray);
                      File uFile3 = new File(str6);
                      uFile3.getParentFile().mkdirs();
                      uFile3.delete();
                      m$f.d(uFile1, uFile3);
                      uFile1.delete();
                      if (uFile3.exists()) {
                         Object[] objArray1 = new Object[]{str2,str1,oh1.e()};
                         str1 = String.format("%s/official/bc/%s/%s/", objArray1);
                         String[] stringArray = new File(str1).list();
                         int len = stringArray.length;
                         int i3 = 0;
                         while (i3 < len) {
                            object oobject = stringArray[i3];
                            if (!oobject.equals(String.valueOf(oh1.d()))) {
                               m$c.b("will delete bitcode file "+oobject);
                               m$f.c(new File(str1+"/"+oobject+"/"));
                            }
                            i3 = i3 + 1;
                         }
                      }
                      m$c.b("download file move to  "+str6);
                      m$c.b("update bitcode sp success");
                      pair = new Pair(Boolean.TRUE, str6);
                   label_0343 :
                      _monitor_exit(this);
                      if (pair.first.booleanValue()) {
                         List list = b.b().p();
                         _monitor_enter(list);
                         Iterator iterator2 = b.b().p().iterator();
                         i1 = 0;
                         while (iterator2.hasNext()) {
                            i oi2 = iterator2.next();
                            if (oi2 != null && (oi2.k()).equals(oh.e())) {
                               oi2.d = KSTEContext.BCBits;
                               oi2.e = oh.a();
                               oi2.g = oh.c();
                               oi2.c = oi2.b;
                               oi2.b = oh.d();
                               oi2.h = pair.second;
                               oi2.m = c$a.c;
                               i1 = 1;
                            }else {
                               continue ;
                            }
                         }
                         if (!i1) {
                            i oi3 = new i();
                            oi3.h(oh.e());
                            oi3.f(oh.d());
                            oi3.d(0);
                            oi3.a(KSTEContext.BCBits);
                            oi3.c(oh.a());
                            oi3.e(oh.c());
                            oi3.g(pair.second);
                            oi3.b(c$a.c);
                            b.b().p().add(oi3);
                         }
                         _monitor_exit(list);
                      }else {
                         p0.add(p1);
                         b.a(b$b.a, "SEC_ERROR_BC_PROCESSBCDOWNLOAD_PER_FAIL bizid:"+oh.e()+" cdb:"+oh.a()+" md5:"+oh.c(), 207);
                         break ;
                      }
                      break ;
                   }else {
                      m$c.d("download file md5 not match");
                      if (!uFile1.exists()) {
                         b = false;
                      }else {
                         uFile1.delete();
                         b = true;
                      }
                      objArray2 = new Object[]{oh1.e(),str4,oh1.c(),str5,Long.valueOf(uFile2.length()),Boolean.valueOf(b)};
                      b.a(b$b.a, String.format("SEC_ERROR_DOWNLOADFILE_FILE_MD5ERROR[%s]=[%s]=[%s]=md5[%s] fileLen:%d fileexists:%b", objArray2), 111);
                   }
                }else {
                   objArray2 = new Object[]{oh1.e(),str4};
                   b.a(b$b.a, String.format("SEC_ERROR_DOWNLOADFILE_FILE_DOWNLOAD_REQ_FAIL[%s]=[%s]", objArray2), 112);
                }
                i = 0;
             }else {
                goto label_0343 ;
             }
          }
          return;
       }
    }
    public boolean e(String p0){
       int i1;
       StringBuilder str3;
       b$b a1;
       String str4;
       Integer integer1;
       String str = "https://kste.ksapisrv.com/rest/kste/startupconfig";
       int i = 0;
       JSONObject jSONObject = new JSONObject();
       jSONObject.put(c.a, b.b().l().appVer());
       jSONObject.put(c.b, b.b().l().did());
       jSONObject.put(c.d, b.b().l().userId());
       jSONObject.put(c.c, "1.0.0.107.3722af76");
       jSONObject.put(c.e, c.T);
       StringBuilder str1 = "";
       l a = (b.b().q().a.containsKey(a.a()))? b.b().q().a.get(a.a()).a: str1;
       jSONObject.put(c.f, a);
       jSONObject.put(c.g, b.b().l().appkey());
       jSONObject.put(c.h, a.b());
       jSONObject.put(c.j, b.b().l().appKPN());
       m$c.b("fetch config begin "+jSONObject);
       Request request = new Request$Builder().url(str).post(new FormBody$Builder().add(c.s0, Base64.encodeToString(MXSec.get().getWrapper().atlasEncrypt(KSTEContext.SDKNAME, KSTEContext.SDKID, i, (jSONObject.toString()).getBytes()), 2)).add(c.t0, MXSec.get().getWrapper().atlasSign(KSTEContext.SDKNAME, KSTEContext.SDKID, i, jSONObject.toString())).build()).build();
       Call uCall = m$f.b.newCall(request);
       Call uCall1 = uCall.clone();
       Call uCall2 = uCall.clone();
       Response response = m$f.a.newCall(request).execute();
    label_02d1 :
       String str2 = "empty";
       if (response != null && (response.isSuccessful() && (response.code() >= 200 && (response.code() < 300 && response.body() != null)))) {
          m$c.b("fetch config https://kste.ksapisrv.com/rest/kste/startupconfig success");
          response.body().contentLength();
          JSONObject jSONObject1 = new JSONObject(response.body().string());
          if (jSONObject1.optInt("code") == 1) {
             byte[] uobyteArray = MXSec.get().getWrapper().atlasDecrypt(KSTEContext.SDKNAME, KSTEContext.SDKID, i, Base64.decode(jSONObject1.optString("data"), i));
             if (!uobyteArray.length) {
                m$c.d("resp data decrypt error");
                b.a(b$b.a, "SEC_ERROR_STAERUPCONFIG_NETWORK_RESP_DECRYPT_ERROR encData="+response.body().string(), 118);
                i1 = this;
             }else {
                m$c.b("resp "+new String(uobyteArray));
                JSONObject jSONObject2 = new JSONObject(new String(uobyteArray));
                if (jSONObject2.optInt(c.v) == 1) {
                   jSONObject2 = jSONObject2.optJSONObject(c.y);
                   n$b uob = n.b();
                   str3 = jSONObject2.optString(c.x, str1);
                   if (!str3.isEmpty()) {
                      KSTEContext.mkv.c(c.h0, str3);
                      b.b().q().b = str3;
                   }
                   uob.c(str3);
                   n$a$a uoa$a = n$a.a();
                   uoa$a.a(jSONObject2.optJSONObject(c.F).optInt(c.A));
                   n$a uoa = uoa$a.b();
                   uob.a(uoa);
                   KSTEContext.mkv.b(c.i0, uoa.b());
                   b.b().q().c = uoa.b();
                   jSONObject2 = jSONObject2.optJSONObject(c.z);
                   JSONArray jSONArray = jSONObject2.optJSONArray(c.E);
                   HashSet hashSet = new HashSet();
                   if (jSONArray != null) {
                      for (int i2 = 0; i2 < jSONArray.length(); i2 = i2 + 1) {
                         hashSet.add(jSONArray.getString(i2));
                      }
                   }
                   str3 = jSONObject2.optString(c.C, str1);
                   if (!str3.isEmpty()) {
                      hashSet.add(str3);
                   }
                   n$c$a uoc$a = n$c.a();
                   uoc$a.b(str3);
                   uoc$a.e(jSONObject2.optString(c.D, str1));
                   uoc$a.f(jSONObject2.optString(c.B, str1));
                   uoc$a.c(hashSet);
                   uoc$a.a(jSONObject2.optInt(c.A));
                   uob.b(uoc$a.d());
                   n on = uob.d();
                   if (on.d().f() == 1) {
                      a.c(b.b().l().recorder());
                      Iterator iterator = hashSet.iterator();
                      while (true) {
                         if (iterator.hasNext()) {
                            i = this.f(p0, on, iterator.next());
                            m$c.b("interp download status "+i);
                            if (!i) {
                               continue ;
                            }
                         }else {
                            i1 = this;
                         }
                         a.d(b.b().l().recorder());
                         if (!i) {
                            a.i(b.b().l().recorder());
                            b.a(b$b.a, "needupdate:"+on.d().f()+"c:"+on.d().b()+"cl:"+on.d().c().toString(), 208);
                         }
                      }
                      return i;
                   }else if(a.isEmpty()){
                      b.a(b$b.a, "SEC_ERROR_CURRENT_INTERP_EMPTY needupdate:"+on.d().f()+"cdn:"+on.d().b(), 116);
                   }
                }else {
                   b.a(b$b.a, "SEC_ERROR_STAERUPCONFIG_RESP_ERROR resp="+jSONObject2, 107);
                }
             }
          }else {
             a1 = b$b.a;
             str4 = "SEC_ERROR_STAERUPCONFIG_NETWORK_RESP_RESULT_0 resp code="+response.code()+"body:";
             if (response.body() != null) {
                str2 = Long.valueOf(response.body().contentLength());
             }
             b.a(a1, str4+str2, 117);
          }
       }else {
          str3 = "fetch config http error ";
          str4 = " response is null";
          Integer integer = (response != null)? Integer.valueOf(response.code()): str4;
          m$c.d(str3+integer);
          a1 = b$b.a;
          str1 = "SEC_ERROR_STAERUPCONFIG_NETWORK_REQUESTERROR resp code=";
          if (response != null) {
             integer1 = Integer.valueOf(response.code());
          }
          str1 = str1+integer1+" body:";
          if (response != null && response.body() != null) {
             str2 = response.body().contentLength()+"netavail:"+m$f.g(b.b().r().context())+" nettype:"+m$f.a(b.b().l().context());
          }
          b.a(a1, str1+str2, 108);
       }
       m$c.b("fetch config finish");
       goto label_066e ;
    }
    public synchronized boolean f(String p0,n p1,String p2){
       Pair pair = this.b(p0, p2, p1.d().d(), p1.d().e());
       boolean b = false;
       if (pair.first.booleanValue()) {
          boolean b1 = true;
          if (new File(pair.second).exists()) {
             p2.c = System.currentTimeMillis();
             System.load(pair.second);
             c uoc = b.b().l().recorder();
             uoc.b.c = System.currentTimeMillis() - uoc.b.c;
             KSTEContext.bInterpLoadStatus = b1;
             KSTEContext.mkv.c(c.V, a.b());
             m$b mkv = KSTEContext.mkv;
             a$a b2 = a$a.b;
             String a0 = (a.a() == b2)? c.a0: c.b0;
             mkv.c(a0, p1.d().b());
             mkv = KSTEContext.mkv;
             a0 = (a.a() == b2)? c.c0: c.d0;
             mkv.c(a0, p1.d().c().toString());
             mkv = KSTEContext.mkv;
             a0 = (a.a() == b2)? c.Y: c.Z;
             mkv.c(a0, p1.d().d());
             mkv = KSTEContext.mkv;
             a0 = (a.a() == b2)? c.W: c.X;
             mkv.c(a0, p1.d().e());
             mkv = KSTEContext.mkv;
             a0 = c.g0;
             boolean b3 = (p1.d().f() == b1)? true: false;
             mkv.b.putBoolean(a0, b3);
             g.b(mkv.b);
             mkv = KSTEContext.mkv;
             a0 = (a.a() == b2)? c.e0: c.f0;
             mkv.c(a0, pair.second);
             m$c.b("update interp config in sp");
             k ok = b.b().q();
             ok.c = p1.a().b();
             ok.b = p1.c();
             l ol = ok.a.get(a.a());
             if (ol == null) {
                l ol1 = new l("", "", "", "", "");
                ok.a.put(a.a(), ol);
             }
             ol.c = p1.d().b();
             ol.e = p1.d().c().toString();
             ol.b = p1.d().d();
             ol.d = pair.second;
             ol.a = p1.d().e();
             if (p1.d().f() == b1) {
                b = true;
             }
             ok.d = b;
             b = true;
          }else {
             b.a(b$b.a, "SEC_ERROR_STAERUPCONFIG_NETWORK_RESP_DOWNLOADINTERP_FILE_NOT_EXISTS needupdate: "+p1.d().f()+"cdn:"+p1.d().b()+" file:"+pair.second, 120);
          }
          m$c.b("load new library success."+pair.second);
       }else {
          b.a(b$b.a, "SEC_ERROR_STAERUPCONFIG_NETWORK_RESP_DOWNLOADINTERP_FAIL needupdate:"+p1.d().f()+" cdn:"+p1.d().b(), 119);
       }
       return b;
    }
    public final List g(String p0,JSONArray p1){
       String str;
       ArrayList uArrayList = new ArrayList();
       int i = 0;
       if (p1.length() > KSTEContext.BCUpdateThreadThreshold) {
          m$c.b("Begin download bitcode through thread");
          CountDownLatch uCountDownLa = new CountDownLatch(p1.length());
          for (int i1 = 0; i1 < p1.length(); i1 = i1 + 1) {
             a$a uoa = new a$a(this, i1, uArrayList, p1, p0, uCountDownLa);
             KSTEContext.ksteThreadPool.execute(v11);
          }
          try{
             uCountDownLa.await();
          }catch(java.lang.InterruptedException e13){
             e13.printStackTrace();
          }
          p0 = "Thread download "+p1.length();
          str = " bitcode complete ";
       }else {
          m$c.b("Start to serial downloading bitcode");
          try{
             for (; i < p1.length(); i = i + 1) {
                m$c.b("serial downloading bitcode["+p1.getJSONObject(i)+"] begin");
                this.d(uArrayList, p1.getJSONObject(i), p0);
             }
          }catch(org.json.JSONException e13){
             e13.printStackTrace();
          }
          p0 = "serial downloa "+p1.length();
          str = " bitcode complete";
       }
       m$c.b(p0+str);
       return uArrayList;
    }
}
