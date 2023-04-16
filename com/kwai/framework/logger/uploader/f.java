package com.kwai.framework.logger.uploader.f;
import er.j;
import o56.c;
import o56.a;
import android.content.Context;
import java.lang.String;
import com.kuaishou.android.vader.Channel;
import java.lang.Object;
import fg6.a;
import java.lang.StringBuilder;
import java.lang.Class;
import java.lang.Enum;
import android.os.HandlerThread;
import okhttp3.HttpUrl;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fjd.b;
import jb6.d;
import com.yxcorp.retrofit.idc.models.Host;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.net.Uri;
import ekd.w0;
import okhttp3.HttpUrl$Builder;
import w96.d;
import q87.c;
import java.util.List;
import java.lang.Iterable;
import com.kuaishou.log.realshow.nano.ClickLogs$ClickLog;
import com.kuaishou.log.realshow.nano.ClickLogs$ClickFeed;
import com.kuaishou.android.vader.persistent.LogRecord;
import com.google.protobuf.nano.MessageNano;
import org.json.JSONObject;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import er.k;
import com.kuaishou.android.vader.config.LogResponse;
import com.kuaishou.log.realshow.nano.RealShowLogs$RealShowLog;
import java.util.HashMap;
import java.util.Iterator;
import com.kuaishou.log.realshow.nano.RealShowLogs$RealShowPage;
import java.lang.Long;
import java.util.ArrayList;
import com.kuaishou.log.realshow.nano.RealShowLogs$RealShowFeed;
import java.util.Set;
import java.util.Map$Entry;
import com.kwai.framework.logger.uploader.f$e;
import okhttp3.Request$Builder;
import okhttp3.Request;
import java.util.Map;
import ta6.r;
import java.net.URLEncoder;
import ta6.e;
import okhttp3.FormBody;
import okhttp3.FormBody$Builder;
import okhttp3.RequestBody;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.utility.TextUtils;
import s00.b$b;
import s00.b;
import ekd.s;
import h30.a;
import com.google.common.collect.ImmutableMap;
import com.kwai.framework.logger.uploader.f$c;
import com.yxcorp.retrofit.e;
import ua6.b;
import ua6.b$a;
import ia0.g;
import com.yxcorp.retrofit.f;
import ob6.p;
import ob6.h;
import com.yxcorp.retrofit.model.LocationConfigModel;
import com.kwai.framework.network.keyconfig.BaseConfig;
import ujd.c;
import ta6.a;
import com.kwai.framework.network.monitor.IPv6AddressMonitor;
import android.app.Application;
import vk7.g0;
import qe6.b;
import com.yxcorp.utility.SystemUtil;
import ekd.a0;
import com.google.gson.Gson;
import com.kwai.framework.security.LogEncryptor;
import android.util.Base64;
import okhttp3.OkHttpClient;
import com.kwai.framework.logger.uploader.e;
import com.kwai.framework.model.router.RouteType;
import t45.d;
import brd.z;
import com.kwai.framework.logger.uploader.f$d;
import com.kwai.framework.logger.uploader.f$a;
import java.lang.Exception;
import java.lang.Boolean;
import xf6.h;
import java.lang.Throwable;
import y96.k;
import ok.x;
import okhttp3.Call;
import okhttp3.Response;
import okhttp3.ResponseBody;
import java.lang.reflect.Type;
import el.a;
import njd.a;
import java.io.IOException;
import com.kwai.framework.logger.uploader.f$b;
import aa6.a;
import aa6.c;
import w96.l;

public class f implements j	// class@000ba3
{
    public final Channel a;
    public final String b;
    public final String c;
    public final Gson d;
    public int e;
    public OkHttpClient f;
    public String g;
    public ImmutableMap h;
    public static final boolean i;

    static {
       f.i = a.a().c();
    }
    public void f(Context p0,String p1,Channel p2){
       super();
       this.b = p1;
       this.d = a.a;
       this.a = p2;
       this.c = f.class.getSimpleName()+"_"+p2.name();
       new HandlerThread(f.class.getName(), 10).start();
    }
    public final HttpUrl a(){
       Object[] objArray = null;
       Host obj = PatchProxy.apply(objArray, this, f.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = d.a().c("api");
       if (obj == null || TextUtils.isEmpty(obj.mHost)) {
          return objArray;
       }
       Uri uri = w0.f(this.b);
       HttpUrl$Builder uBuilder = new HttpUrl$Builder();
       f tg = this.g;
       int i = 0;
       if (TextUtils.isEmpty(tg)) {
          if (f.i) {
             Object[] objArray1 = new Object[i];
             d.C().s(this.c, "Normal mode.", objArray1);
          }
          String str = (this.k())? "https": "http";
          uBuilder.scheme(str).host(obj.mHost).encodedPath(uri.getEncodedPath());
       }else if(f.i){
          Object[] objArray2 = new Object[i];
          d.C().s(this.c, "Debug mode.", objArray2);
       }
       uBuilder = HttpUrl.parse(tg).newBuilder().addPathSegments(TextUtils.join("/", uri.getPathSegments()));
       return uBuilder.build();
    }
    public final ClickLogs$ClickLog b(List p0){
       ClickLogs$ClickLog obj = PatchProxy.applyOneRefs(p0, this, f.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClickLogs$ClickLog();
       ClickLogs$ClickFeed[] uClickFeedAr = new ClickLogs$ClickFeed[p0.size()];
       obj.feed = uClickFeedAr;
       int i = 0;
       while (i < p0.size()) {
          LogRecord logRecord = p0.get(i);
          try{
             ClickLogs$ClickLog uClickLog = obj.feed;
             uClickLog[i] = MessageNano.mergeFrom(new ClickLogs$ClickLog(), logRecord.payload()).feed[0];
             uClickLog[i].actionLogId = "unmerge_api";
             uClickLog[i].clientIncrementId = (long)logRecord.customSeqId();
             obj.feed[i].clientTimestamp = logRecord.clientTimestamp();
          }catch(java.lang.Exception e0){
             obj.feed[i] = new ClickLogs$ClickFeed();
             ClickLogs$ClickLog uClickLog1 = obj.feed;
             uClickLog1[i].actionLogId = e0;
             uClickLog1[i].clientIncrementId = (long)logRecord.customSeqId();
             obj.feed[i].clientTimestamp = logRecord.clientTimestamp();
             JSONObject jSONObject = new JSONObject();
             jSONObject.put("type", "Exception");
             jSONObject.put("reason", "ClickFeed pb反序列化失败");
             b.a(0x4b316083).f1("v2_upload_parse_e", jSONObject.toString(), 1);
          }
          i = i + 1;
       }
       return obj;
    }
    public LogResponse c(List p0,k p1){
       LogResponse obj = PatchProxy.applyTwoRefs(p0, p1, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       try{
          obj = this.m(p0, p1);
       }catch(java.lang.Exception e4){
          Object[] objArray = new Object[0];
          d.C().t("RealLogUploader", "upload Exception e="+e4, objArray);
       }
       return obj;
    }
    public final RealShowLogs$RealShowLog d(List p0){
       RealShowLogs$RealShowFeed realShowFeed;
       String str = "unmerge_api";
       HashMap obj = PatchProxy.applyOneRefs(p0, this, f.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       Iterator iterator = p0.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          LogRecord logRecord = iterator.next();
          try{
             RealShowLogs$RealShowPage realShowPage = MessageNano.mergeFrom(new RealShowLogs$RealShowPage(), logRecord.payload());
             List list = obj.get(Long.valueOf(realShowPage.llsid));
             if (list == null) {
                list = new ArrayList();
                obj.put(Long.valueOf(realShowPage.llsid), list);
             }
             realShowFeed = MessageNano.mergeFrom(new RealShowLogs$RealShowFeed(), MessageNano.toByteArray(realShowPage.feed[i]));
             realShowFeed.actionLogId = str;
             realShowFeed.clientIncrementId = (long)logRecord.customSeqId();
             realShowFeed.clientTimestamp = logRecord.clientTimestamp();
             list.add(realShowFeed);
          }catch(java.lang.Exception e0){
             realShowFeed = new RealShowLogs$RealShowFeed();
             realShowFeed.actionLogId = e0;
             realShowFeed.clientIncrementId = (long)logRecord.customSeqId();
             realShowFeed.clientTimestamp = logRecord.clientTimestamp();
             JSONObject jSONObject = new JSONObject();
             jSONObject.put("type", "Exception");
             jSONObject.put("reason", "RealShowFeed pb反序列化失败");
             b.a(0x4b316083).f1("v2_upload_parse_e", jSONObject.toString(), 1);
             goto label_001a ;
          }
       }
       RealShowLogs$RealShowLog realShowLog = new RealShowLogs$RealShowLog();
       RealShowLogs$RealShowPage[] realShowPage1 = new RealShowLogs$RealShowPage[obj.size()];
       realShowLog.page = realShowPage1;
       Iterator iterator1 = obj.entrySet().iterator();
       while (iterator1.hasNext()) {
          Map$Entry uEntry = iterator1.next();
          RealShowLogs$RealShowPage realShowPage2 = new RealShowLogs$RealShowPage();
          int i1 = i + 1;
          realShowLog.page[i] = realShowPage2;
          realShowPage2.llsid = uEntry.getKey().longValue();
          List value = uEntry.getValue();
          RealShowLogs$RealShowFeed[] realShowFeed1 = new RealShowLogs$RealShowFeed[uEntry.getValue().size()];
          realShowPage2.feed = value.toArray(realShowFeed1);
          i = i1;
       }
       return realShowLog;
    }
    public final String e(f$e p0,Request$Builder p1){
       ArrayList obj = PatchProxy.applyTwoRefs(p0, p1, this, f.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       r.a(p1.build(), p0.a);
       Iterator iterator = p0.a.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          StringBuilder str = uEntry.getKey()+"=";
          String str1 = (uEntry.getValue() == null)? "": URLEncoder.encode(uEntry.getValue(), "UTF-8");
          obj.add(str+str1);
       }
       return TextUtils.join("&", obj);
    }
    public final Request$Builder f(f$e p0){
       Request$Builder obj = PatchProxy.applyOneRefs(p0, this, f.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Request$Builder();
       Iterator iterator = new e().a().entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (!TextUtils.isEmpty(uEntry.getKey()) && uEntry.getValue() != null) {
             obj.addHeader(uEntry.getKey(), uEntry.getValue());
          }
       }
       obj.post(p0.b.build());
       return obj;
    }
    public final f$e g(MessageNano p0,k p1){
       String str4;
       f$e a1;
       String str5;
       String str = "";
       String str1 = "gzip";
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f uof = f.class;
       f$e obj = PatchProxy.applyTwoRefs(p0, p1, this, uof, "15");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new f$e();
       f$e a = obj.a;
       String str2 = "2";
       String str3 = (p1.b())? str2: "1";
       a.put("priorityType", str3);
       try{
          str3 = 0;
          str4 = PatchProxy.apply(str3, this, uof, "3");
          if (str4 != patchProxyRe) {
          }else {
             str4 = a.t().c("recoLogEncoding", str);
          }
          if (TextUtils.n(str1, str4)) {
             obj.b.add("encoding", str1);
          }
          byte[] uobyteArray = MessageNano.toByteArray(p0);
          str5 = (TextUtils.n(str1, str4))? b.b().a(s.b(uobyteArray)): b.b().a(uobyteArray);
          if (this.a == Channel.COVER_SHOW) {
             obj.b.add("oaid", TextUtils.k(a.d()));
             ImmutableMap immutableMap = this.h();
             if (immutableMap != null) {
                Iterator iterator = immutableMap.entrySet().iterator();
                while (iterator.hasNext()) {
                   Map$Entry uEntry = iterator.next();
                   String key = uEntry.getKey();
                   obj.b.add(key, uEntry.getValue());
                }
             }
          }
          a1 = obj.b;
          str4 = PatchProxy.apply(str3, this, uof, "16");
          if (str4 != patchProxyRe) {
          }else if(f$c.a[this.a.ordinal()] != 2){
             str4 = "log";
          }else {
             str4 = "clickLog";
          }
          a1.add(str4, str5);
       }catch(java.lang.Exception e0){
       }
       if (e.h().e()) {
          obj.a.putAll(b.c.a().d());
       }else {
          b.a(-1961311520).e().d(obj.a);
       }
       h oh = b.a(0x36463d96).f();
       if (oh != null && oh.mBaseConfig != null) {
          a1 = obj.a;
          HttpUrl$Builder obj1 = PatchProxy.apply(str3, this, uof, str2);
          if (obj1 != patchProxyRe) {
             str3 = obj1;
          }else {
             Host host = d.a().c("api");
             if (host != null && !TextUtils.isEmpty(host.mHost)) {
                Uri uri = w0.f(this.b);
                obj1 = new HttpUrl$Builder();
                if (f.i) {
                   Object[] objArray = new Object[0];
                   d.C().s(this.c, "Normal mode.", objArray);
                }
                str4 = (this.k())? "https": "http";
                obj1.scheme(str4).host(host.mHost).encodedPath(uri.getEncodedPath());
                HttpUrl httpUrl = obj1.build();
                if (httpUrl != null) {
                   str = httpUrl.toString();
                }
                str3 = str;
             }
          }
          c.b(a1, str3, oh.mBaseConfig.d());
       }
       if (a.d()) {
          str3 = b.a(-1554820802).b();
          str5 = b.a(-1554820802).a();
          if (!TextUtils.isEmpty(str3)) {
             obj.a.put("ks_ipv6_wlan", str3);
          }
          if (!TextUtils.isEmpty(str5)) {
             obj.a.put("ks_ipv6_cellular", str5);
          }
       }
       return obj;
    }
    public final ImmutableMap h(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f uof = f.class;
       Object[] objArray = null;
       c obj = PatchProxy.apply(objArray, this, uof, "17");
       if (obj != patchProxyRe) {
          return obj;
       }
       _monitor_enter(this);
       if (this.h == null) {
          obj = (!g0.a(a.a().a(), "android.permission.READ_PHONE_STATE"))? 1: null;
          boolean b = b.a();
          if (obj && b) {
             String str = TextUtils.k(a0.c(TextUtils.L(SystemUtil.m(a.a().a()))));
             Application uApplication = a.a().a();
             String str1 = PatchProxy.applyOneRefs(uApplication, objArray, uof, "18");
             if (str1 != patchProxyRe) {
             }else {
                str1 = Base64.encodeToString(LogEncryptor.c.a((a.a.q(SystemUtil.j(uApplication))).getBytes()), 2);
             }
             this.h = ImmutableMap.of("muid", str, "imeis", str1);
          }
       }
    label_007e :
       _monitor_exit(this);
       return this.h;
    }
    public final OkHttpClient i(){
       Object obj = PatchProxy.apply(null, this, f.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.f == null) {
          this.f = new e(RouteType.API, d.b).buildClient();
       }
       return this.f;
    }
    public final f$d j(List p0){
       ClickLogs$ClickLog uClickLog;
       RealShowLogs$RealShowLog realShowLog;
       f$d obj = PatchProxy.applyOneRefs(p0, this, f.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new f$d(null);
       int i = f$c.a[this.a.ordinal()];
       if (i != 1) {
          if (i == 2) {
             try{
                uClickLog = this.b(p0);
             }catch(java.lang.Exception e5){
                e5.printStackTrace();
             }
             obj.a = uClickLog;
             if (uClickLog != null) {
                ClickLogs$ClickLog uClickLog1 = uClickLog.feed;
                if (uClickLog1 != null) {
                   obj.b = uClickLog1.length;
                }
             }
          }
       }else {
          try{
             realShowLog = this.d(p0);
          }catch(java.lang.Exception e5){
             e5.printStackTrace();
          }
          obj.a = realShowLog;
          if (realShowLog != null) {
             RealShowLogs$RealShowLog page = realShowLog.page;
             if (page != null) {
                obj.b = page.length;
             }
          }
       }
       return obj;
    }
    public final boolean k(){
       Object obj = PatchProxy.apply(null, this, f.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (h.p()) {
          return false;
       }
       return RouteType.API.mIsHttps;
    }
    public final void l(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "9")) {
          return;
       }
       this.e = this.e + 1;
       Object[] objArray = new Object[0];
       d.C().u("send_client_log_failed", p0, objArray);
       if (this.e >= 2) {
          d.a().f("api", d.a().c("api"));
          this.e = 0;
       }
       return;
    }
    public final LogResponse m(List p0,k p1){
       HttpUrl httpUrl;
       Object[] objArray;
       Object[] objArray1;
       LogResponse obj = PatchProxy.applyTwoRefs(p0, p1, this, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       try{
          f$d uod = this.j(p0);
          int i = 1;
          int i1 = 0;
          if (uod.b == null) {
             httpUrl = 1;
          label_001d :
             if (httpUrl) {
                return obj;
             }else {
                f$e uoe = this.g(uod.a, p1);
                Request$Builder uBuilder = this.f(uoe);
                httpUrl = this.a();
                if (httpUrl == null) {
                   if (k.a.get().booleanValue()) {
                      HashMap hashMap = new HashMap(4);
                      hashMap.put("host", d.a().c("ulog").mHost);
                      hashMap.put("path", this.b);
                      objArray = new Object[i];
                      objArray[i1] = hashMap;
                      d.C().w(this.c, "埋点SDK network: httpUrl is null now.", objArray);
                   }
                   return obj;
                }else {
                   String str = httpUrl.toString();
                   uBuilder.url(str);
                   StringBuilder str1 = str;
                   uBuilder.url(str1+"?"+this.e(uoe, uBuilder));
                   x a = k.a;
                   if (a.get().booleanValue()) {
                      objArray1 = new Object[i];
                      objArray1[i1] = uBuilder.build().toString();
                      d.C().w(this.c, "start_to_send_client_log: ", objArray1);
                   }
                   Response response = this.i().newCall(uBuilder.build()).execute();
                   if (response.isSuccessful()) {
                      if (f.i || a.get().booleanValue()) {
                         objArray1 = new Object[i1];
                         d.C().s(this.c, "Request is successful.", objArray1);
                      }
                      str = response.body().string();
                      this.n(response.request(), str);
                      a uoa = this.d.i(str, new f$a(this).getType());
                      Object obj1 = (uoa != null && uoa.b() == i)? 1: null;
                      if (obj1 && uoa.a() != null) {
                         if (a.get().booleanValue()) {
                            objArray = new Object[i];
                            objArray[i1] = str;
                            d.C().s(this.c, "Request is successful. result is  ", objArray);
                         }
                         return uoa.a();
                      }else {
                         d.C().e(this.c, "send_client_log_failed", new IOException("Result: "+str));
                      }
                   }else if(response.code() > 400 && response.code() < 600){
                      this.l(new IOException("Response code is : "+response.code()));
                   }
                }
             }
          }else {
             httpUrl = null;
             goto label_001d ;
          }
       }catch(java.io.IOException e9){
          this.l(e9);
       }catch(java.lang.Exception e9){
          d.C().r(this.c, "exception", e9);
       }
       return obj;
    }
    public final void n(Request p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "10")) {
          return;
       }
       f tg = this.g;
       if (TextUtils.isEmpty(tg)) {
          return;
       }
       Object[] objArray = new Object[0];
       d.C().s(this.c, "request url: "+p0.url().toString(), objArray);
       objArray = new Object[0];
       d.C().s(this.c, "debugUrl: "+tg, objArray);
       if ((p0.url().toString()).startsWith(tg)) {
          Object[] objArray1 = new Object[0];
          d.C().s(this.c, "isSameUrl", objArray1);
          a uoa = this.d.i(p1, new f$b(this).getType());
          if (f.i) {
             Object[] objArray2 = new Object[0];
             d.C().s(this.c, "Config.connected: "+uoa.a().mConnected, objArray2);
          }
          if (uoa.a().mConnected == null) {
             this.g = null;
             l.b(null, null);
          }
       }
       return;
    }
    public void o(String p0){
       this.g = p0;
    }
}
