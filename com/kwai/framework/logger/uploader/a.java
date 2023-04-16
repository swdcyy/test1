package com.kwai.framework.logger.uploader.a;
import java.lang.String;
import okhttp3.MediaType;
import o56.c;
import o56.a;
import com.kuaishou.android.vader.Channel;
import java.lang.Object;
import fg6.a;
import java.lang.StringBuilder;
import java.lang.Enum;
import okhttp3.HttpUrl;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import fjd.b;
import jb6.d;
import com.yxcorp.retrofit.idc.models.Host;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.net.Uri;
import ekd.w0;
import okhttp3.HttpUrl$Builder;
import java.util.List;
import java.lang.Iterable;
import android.app.Application;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import aa6.c;
import w96.l;
import w96.d;
import q87.c;
import xf6.h;
import com.kwai.framework.model.router.RouteType;
import com.kwai.framework.logger.uploader.c$c;
import okhttp3.Request$Builder;
import java.util.ArrayList;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import java.net.URLEncoder;
import com.yxcorp.retrofit.e;
import ua6.b;
import ua6.b$a;
import ia0.c;
import com.yxcorp.retrofit.c$b;
import okhttp3.Request;
import java.util.HashMap;
import android.util.Pair;
import wkd.b;
import ia0.g;
import com.yxcorp.retrofit.f;
import wnc.a;
import xf6.l;
import okhttp3.RequestBody;
import com.google.protobuf.nano.MessageNano;
import er.k;
import ob6.p;
import ob6.h;
import com.yxcorp.retrofit.model.LocationConfigModel;
import com.kwai.framework.network.keyconfig.BaseConfig;
import ujd.c;
import ta6.a;
import com.kwai.framework.network.monitor.IPv6AddressMonitor;
import com.kwai.sdk.switchconfig.a;
import com.kwai.framework.logger.uploader.ClientLogEncodingConfig;
import java.lang.reflect.Type;
import jg6.a;
import com.yxcorp.zcompress.Zstd;
import java.lang.Throwable;
import java.lang.RuntimeException;
import java.lang.Exception;
import ekd.a0;
import com.kuaishou.android.vader.config.LogResponse;
import y96.k;
import ok.x;
import okhttp3.OkHttpClient;
import com.kwai.framework.logger.uploader.g;
import t45.d;
import brd.z;
import okhttp3.Call;
import okhttp3.Response;
import okhttp3.ResponseBody;
import com.kwai.framework.logger.uploader.a$a;
import el.a;
import com.google.gson.Gson;
import njd.a;
import java.io.IOException;
import com.kwai.framework.logger.uploader.a$b;
import aa6.a;
import ekd.s;

public abstract class a	// class@00166f
{
    public final Channel a;
    public final String b;
    public final Gson c;
    public int d;
    public OkHttpClient e;
    public String f;
    public ClientLogEncodingConfig g;
    public String h;
    public static final MediaType i;
    public static final boolean j;

    static {
       a.i = MediaType.parse("application/octet-stream");
       a.j = a.a().c();
    }
    public void a(String p0,Channel p1){
       super();
       this.c = a.a;
       this.a = p1;
       this.b = p0+"_"+p1.name();
    }
    public HttpUrl d(boolean p0,String p1){
       Host obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, this, uoa, "10");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = d.a().c("ulog");
       HttpUrl httpUrl = null;
       if (obj == null || TextUtils.isEmpty(obj.mHost)) {
          return httpUrl;
       }else {
          Uri uri = w0.f(p1);
          HttpUrl$Builder uBuilder = new HttpUrl$Builder();
          String str = "/";
          if (p0) {
             uBuilder = HttpUrl.parse(this.h).newBuilder().addPathSegments(TextUtils.join(str, uri.getPathSegments()));
          }else {
             int i = 0;
             if (!SystemUtil.L(a.b())) {
                c uoc = l.a();
                if (uoc != null) {
                   Object[] objArray = new Object[i];
                   d.C().s("buildHttpUrl", "url="+uoc.mHost, objArray);
                   this.k(uoc.mHost);
                }else {
                   this.k(httpUrl);
                }
             }
             a tf = this.f;
             if (TextUtils.isEmpty(tf)) {
                if (a.j) {
                   Object[] objArray1 = new Object[i];
                   d.C().s(this.b, "Normal mode.", objArray1);
                }
                String obj1 = PatchProxy.apply(httpUrl, this, uoa, "11");
                if (obj1 != patchProxyRe) {
                   i = obj1.booleanValue();
                }else if(h.p()){
                   i = RouteType.ULOG.mIsHttps;
                }
                obj1 = (i != null)? "https": "http";
                uBuilder.scheme(obj1).host(obj.mHost).encodedPath(uri.getEncodedPath());
             }else if(a.j){
                Object[] objArray2 = new Object[i];
                d.C().s(this.b, "Debug mode.", objArray2);
             }
             uBuilder = HttpUrl.parse(tf).newBuilder().addPathSegments(TextUtils.join(str, uri.getPathSegments()));
          }
          return uBuilder.build();
       }
    }
    public String e(c$c p0,Request$Builder p1){
       ArrayList obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = p0.a.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          StringBuilder str = uEntry.getKey()+"=";
          String str1 = (uEntry.getValue() == null)? "": URLEncoder.encode(uEntry.getValue(), "utf-8");
          obj.add(str+str1);
       }
       String str2 = TextUtils.join("&", obj);
       Pair second = (e.h().e())? b.c.a().e().m().a(p1.build(), p0.b, new HashMap(), null).second: b.a(-1961311520).m().a(p1.build(), p0.b, new HashMap(), null).second;
       return str2+"&sig2="+second;
    }
    public Request$Builder f(c$c p0){
       Request$Builder obj = PatchProxy.applyOneRefs(p0, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b$a c = b.c;
       obj = new Request$Builder().addHeader("Connection", "keep-alive").addHeader("User-Agent", "kwai-android").addHeader("X-REQUESTID", f.f()).addHeader("Accept-Language", c.a().e().o());
       HashMap hashMap = new HashMap();
       if (!TextUtils.isEmpty(c.a().e().a())) {
          hashMap.put("token", c.a().e().a());
       }
       if (!TextUtils.isEmpty(c.a().e().G())) {
          hashMap.put("kuaishou.api_st", c.a().e().G());
       }
       String str = a.b(hashMap);
       if (!TextUtils.isEmpty(str)) {
          obj.addHeader("Cookie", str);
       }
       if (a.a().c()) {
          str = "trace-context";
          String str1 = l.g(str, "");
          if (!TextUtils.isEmpty(str1)) {
             obj.addHeader(str, str1);
          }
       }
       obj.post(RequestBody.create(a.i, p0.c));
       return obj;
    }
    public c$c g(MessageNano p0,String p1,k p2){
       c$c a;
       String str2;
       b$a c;
       String str = "zstd";
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "9");
       if (p2 != patchProxyRe) {
          return p2;
       }
       c$c uoc = new c$c();
       uoc.a.put("priorityType", "1");
       if (e.h().e()) {
          uoc.a.putAll(b.c.a().d());
       }else {
          b.a(-1961311520).e().d(uoc.a);
       }
       h oh = b.a(0x36463d96).f();
       if (oh != null && oh.mBaseConfig != null) {
          a = uoc.a;
          String str1 = PatchProxy.applyOneRefs(p1, this, a.class, "4");
          if (str1 != patchProxyRe) {
          }else {
             str1 = "/rest/n/log/client/collect";
             if (!p1.contains(str1)) {
                str1 = "/rest/n/log/client/realtime/collect";
                if (!p1.contains(str1)) {
                   str1 = "/rest/n/log/client/hp/collect";
                   if (!p1.contains(str1)) {
                      str1 = "/rest/n/log/client/usertrack/collect";
                      if (!p1.contains(str1)) {
                         str1 = null;
                      }
                   }
                }
             }
          }
          c.b(a, str1, oh.mBaseConfig.d());
       }
       if (a.d()) {
          str2 = b.a(-1554820802).b();
          p1 = b.a(-1554820802).a();
          if (!TextUtils.isEmpty(str2)) {
             uoc.a.put("ks_ipv6_wlan", str2);
          }
          if (!TextUtils.isEmpty(p1)) {
             uoc.a.put("ks_ipv6_cellular", p1);
          }
       }
       uoc.a.put("os", "android");
       uoc.a.put("client_key", "3c2cd3f3");
       uoc.c = MessageNano.toByteArray(p0);
       if (this.g == null) {
          this.g = a.t().getValue("clientLogEncoding", ClientLogEncodingConfig.class, null);
       }
       if (this.g != null && !SystemUtil.L(a.b())) {
          p0.encoding = "gzip";
       }
       try{
          a tg = this.g;
          if (tg != null && str.equals(tg.encoding)) {
             ClientLogEncodingConfig level = this.g.level;
             if (level > null && (level <= 6 && a.b())) {
                try{
                   uoc.c = Zstd.compress(uoc.c, this.g.level);
                   uoc.a.put("encoding", str);
                }catch(com.yxcorp.zcompress.ZstdException e9){
                   this.l(uoc);
                   Object[] objArray = new Object[0];
                   d.C().u("send_client_log_failed", e9, objArray);
                   e9.printStackTrace();
                }
             }else {
             label_015a :
                this.l(uoc);
             }
          }else {
             goto label_015a ;
          }
       }catch(java.lang.Exception e9){
          this.l(uoc);
          e9.printStackTrace();
       }
       uoc.a.put("bodyMd5", a0.d(uoc.c));
       c = b.c;
       if (!TextUtils.isEmpty(c.a().e().a())) {
          uoc.b.put("token", c.a().e().a());
       }
       if (!TextUtils.isEmpty(c.a().e().G())) {
          uoc.b.put("kuaishou.api_st", c.a().e().G());
       }
       Iterator iterator = uoc.a.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          str2 = uEntry.getKey();
          uoc.b.put(str2, uEntry.getValue());
       }
       return uoc;
    }
    public void h(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       this.d = this.d + 1;
       Object[] objArray = new Object[0];
       d.C().u("send_client_log_failed", p0, objArray);
       if (this.d >= 2) {
          d.a().f("ulog", d.a().c("ulog"));
          this.d = 0;
       }
       return;
    }
    public LogResponse i(MessageNano p0,String p1,boolean p2,k p3){
       LogResponse obj;
       x a;
       Object[] objArray2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Boolean.valueOf(p2), p3, this, a.class, "2");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = null;
       try{
          c$c uoc = this.g(p0, p1, p3);
          Request$Builder uBuilder = this.f(uoc);
          HttpUrl httpUrl = this.d(p2, p1);
          int i = 1;
          if (httpUrl == null) {
             if (k.a.get().booleanValue()) {
                HashMap hashMap = new HashMap(4);
                hashMap.put("host", d.a().c("ulog").mHost);
                hashMap.put("path", p1);
                Object[] objArray = new Object[i];
                objArray[0] = hashMap;
                d.C().w(this.b, "ÂñµãSDK network: httpUrl is null now.", objArray);
             }
             return obj;
          }else {
             p1 = httpUrl.toString();
             uBuilder.url(p1);
             String str = p1;
             uBuilder.url(str+"?"+this.e(uoc, uBuilder));
             a = k.a;
             if (a.get().booleanValue()) {
                Object[] objArray1 = new Object[i];
                objArray1[0] = uBuilder.build().toString();
                d.C().w(this.b, "start_to_send_client_log: ", objArray1);
             }
             a uoa1 = PatchProxy.apply(obj, this, uoa, "1");
             if (uoa1 != patchProxyRe) {
             }else if(this.e == null){
                this.e = new g(RouteType.ULOG, d.b).buildClient();
             }
             uoa1 = this.e;
             Response response = uoa1.newCall(uBuilder.build()).execute();
             if (response.isSuccessful()) {
                if (a.j || a.get().booleanValue()) {
                   objArray2 = new Object[0];
                   d.C().w(this.b, "Request is successful.", objArray2);
                }
                str = response.body().string();
                this.j(response.request(), str);
                uoa1 = this.c.i(str, new a$a(this).getType());
                uBuilder = (uoa1 != null && uoa1.b() == i)? 1: null;
                if (uBuilder && uoa1.a() != null) {
                   if (a.get().booleanValue()) {
                      objArray2 = new Object[i];
                      objArray2[0] = str;
                      d.C().w(this.b, "Request is successful. result is  ", objArray2);
                   }
                   return uoa1.a();
                }else {
                   d.C().e(this.b, "send_client_log_failed", new IOException("Result: "+str));
                }
             }else if(response.code() > 400 && response.code() < 600){
                this.h(new IOException("Response code is : "+response.code()));
             }
          }
       }catch(java.lang.Exception e11){
          d.C().r(this.b, "exception", e11);
          this.h(e11);
       }
       return obj;
    }
    public void j(Request p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "5")) {
          return;
       }
       a tf = this.f;
       if (TextUtils.isEmpty(tf)) {
          return;
       }
       Object[] objArray = new Object[0];
       d.C().s(this.b, "request url: "+p0.url().toString(), objArray);
       objArray = new Object[0];
       d.C().s(this.b, "debugUrl: "+tf, objArray);
       if ((p0.url().toString()).startsWith(tf)) {
          Object[] objArray1 = new Object[0];
          d.C().s(this.b, "isSameUrl", objArray1);
          a uoa = this.c.i(p1, new a$b(this).getType());
          if (a.j) {
             Object[] objArray2 = new Object[0];
             d.C().s(this.b, "Config.connected: "+uoa.a().mConnected, objArray2);
          }
          if (uoa.a().mConnected == null) {
             this.f = null;
             l.b(null, null);
          }
       }
       return;
    }
    public void k(String p0){
       this.f = p0;
    }
    public void l(c$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "8")) {
          return;
       }
       p0.c = s.b(p0.c);
       p0.a.put("encoding", "gzip");
       return;
    }
}
