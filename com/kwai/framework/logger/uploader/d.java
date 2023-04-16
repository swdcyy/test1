package com.kwai.framework.logger.uploader.d;
import er.j;
import java.lang.String;
import okhttp3.MediaType;
import o56.c;
import o56.a;
import android.content.Context;
import com.kuaishou.android.vader.Channel;
import java.lang.Object;
import fg6.a;
import java.lang.StringBuilder;
import java.lang.Class;
import java.lang.Enum;
import okhttp3.Request$Builder;
import okhttp3.HttpUrl;
import com.kwai.robust.PatchProxyResult;
import com.kwai.robust.PatchProxy;
import fjd.b;
import jb6.d;
import com.yxcorp.retrofit.idc.models.Host;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.net.Uri;
import ekd.w0;
import okhttp3.HttpUrl$Builder;
import android.app.Application;
import com.yxcorp.utility.SystemUtil;
import aa6.c;
import w96.l;
import java.lang.Boolean;
import xf6.h;
import com.kwai.framework.model.router.RouteType;
import java.util.List;
import java.lang.Iterable;
import xj8.a;
import xj8.c;
import com.kuaishou.android.vader.persistent.LogRecord;
import com.google.protobuf.nano.MessageNano;
import wj8.a;
import wj8.d;
import er.k;
import com.kuaishou.android.vader.config.LogResponse;
import com.kwai.framework.logger.uploader.d$c;
import y96.k;
import ok.x;
import java.util.HashMap;
import w96.d;
import q87.c;
import okhttp3.Request;
import okhttp3.OkHttpClient;
import okhttp3.Call;
import okhttp3.Response;
import okhttp3.ResponseBody;
import com.kwai.framework.logger.uploader.d$a;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import njd.a;
import java.io.IOException;
import java.lang.Throwable;
import java.lang.Exception;
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
import android.util.Pair;
import wkd.b;
import ia0.g;
import com.yxcorp.retrofit.f;
import wnc.a;
import xf6.l;
import okhttp3.RequestBody;
import ob6.p;
import ob6.h;
import com.yxcorp.retrofit.model.LocationConfigModel;
import com.kwai.framework.network.keyconfig.BaseConfig;
import ujd.c;
import ta6.a;
import com.kwai.framework.network.monitor.IPv6AddressMonitor;
import wj8.e;
import oe6.a;
import com.yxcorp.utility.TextUtils;
import com.kwai.sdk.switchconfig.a;
import com.kwai.framework.logger.uploader.ClientLogEncodingConfig;
import jg6.a;
import com.yxcorp.zcompress.Zstd;
import java.lang.RuntimeException;
import ekd.a0;
import com.kwai.framework.logger.uploader.g;
import t45.d;
import brd.z;
import com.kwai.framework.logger.uploader.d$b;
import aa6.a;
import ekd.s;

public class d implements j	// class@000b9c
{
    public final Channel a;
    public final String b;
    public final String c;
    public final Gson d;
    public int e;
    public OkHttpClient f;
    public String g;
    public ClientLogEncodingConfig h;
    public static final MediaType i;
    public static final boolean j;

    static {
       d.i = MediaType.parse("application/octet-stream");
       d.j = a.a().c();
    }
    public void d(Context p0,String p1,Channel p2){
       super();
       this.b = p1;
       this.d = a.a;
       this.a = p2;
       this.c = d.class.getSimpleName()+"_"+p2.name();
    }
    public final HttpUrl a(Request$Builder p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       p0 = PatchProxy.applyOneRefs(p0, this, uod, "6");
       if (p0 != patchProxyRe) {
          return p0;
       }
       Host host = d.a().c("ulog");
       if (host == null || TextUtils.isEmpty(host.mHost)) {
          return null;
       }
       Uri uri = w0.f(this.b);
       HttpUrl$Builder uBuilder = new HttpUrl$Builder();
       if (!SystemUtil.L(a.b())) {
          c uoc = l.a();
          if (uoc != null) {
             this.j(uoc.mHost);
          }else {
             this.j(null);
          }
       }
       d tg = this.g;
       if (TextUtils.isEmpty(tg)) {
          Object obj = PatchProxy.apply(null, this, uod, "7");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(h.p()){
             b = false;
          }else {
             b = RouteType.ULOG.mIsHttps;
          }
          String str = (b != null)? "https": "http";
          uBuilder.scheme(str).host(host.mHost).encodedPath(uri.getEncodedPath());
       }else {
          uBuilder = HttpUrl.parse(tg).newBuilder().addPathSegments(TextUtils.join("/", uri.getPathSegments()));
       }
       return uBuilder.build();
    }
    public final a b(List p0){
       int i1;
       a obj = PatchProxy.applyOneRefs(p0, this, d.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a();
       c[] uocArray = new c[p0.size()];
       obj.a = uocArray;
       for (int i = 0; i < p0.size(); i = i + 1) {
          LogRecord logRecord = p0.get(i);
          try{
             obj.a[i] = MessageNano.mergeFrom(new c(), logRecord.payload());
          }catch(com.google.protobuf.nano.InvalidProtocolBufferNanoException e0){
             e0.a[i] = new c();
          }
          e0.a[i].b = (long)logRecord.seqId();
          e0.a[i].a = logRecord.clientTimestamp();
          a uoa = new a();
          Channel uChannel = logRecord.channelType();
          if (uChannel == Channel.REAL_TIME) {
             i1 = 1;
          }else if(uChannel == Channel.HIGH_FREQ){
             i1 = 2;
          }else if(uChannel == Channel.NORMAL){
             i1 = 3;
          }else {
             i1 = 0;
          }
          uoa.a = i1;
          uoa.b = (long)logRecord.channelSeqId();
          uoa.c = logRecord.customType();
          uoa.d = (long)logRecord.customSeqId();
          e0.a[i].d.g = uoa;
       }
       return obj;
    }
    public LogResponse c(List p0,k p1){
       Object[] objArray;
       Object[] objArray1;
       LogResponse obj = PatchProxy.applyTwoRefs(p0, p1, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       try{
          a uoa = this.b(p0);
          if (!uoa.a.length) {
             return obj;
          }else {
             d$c uoc = this.f(uoa, p1);
             Request$Builder uBuilder = this.e(uoc);
             HttpUrl httpUrl = this.a(uBuilder);
             int i = 0;
             int i1 = 1;
             if (httpUrl == null) {
                if (k.a.get().booleanValue()) {
                   HashMap hashMap = new HashMap(4);
                   hashMap.put("host", d.a().c("ulog").mHost);
                   hashMap.put("path", this.b);
                   objArray = new Object[i1];
                   objArray[i] = hashMap;
                   d.C().w(this.c, "ÂñµãSDK network: httpUrl is null now.", objArray);
                }
                return obj;
             }else {
                String str = httpUrl.toString();
                uBuilder.url(str);
                StringBuilder str1 = str;
                uBuilder.url(str1+"?"+this.d(uoc, uBuilder));
                x a = k.a;
                if (a.get().booleanValue()) {
                   objArray1 = new Object[i1];
                   objArray1[i] = uBuilder.build().toString();
                   d.C().w(this.c, "start_to_send_client_log: ", objArray1);
                }
                Response response = this.g().newCall(uBuilder.build()).execute();
                if (response.isSuccessful()) {
                   if (d.j || a.get().booleanValue()) {
                      objArray1 = new Object[i];
                      d.C().w(this.c, "Request is successful.", objArray1);
                   }
                   str = response.body().string();
                   this.i(response.request(), str);
                   a uoa1 = this.d.i(str, new d$a(this).getType());
                   Object obj1 = (uoa1 != null && uoa1.b() == i1)? 1: null;
                   if (obj1 && uoa1.a() != null) {
                      if (a.get().booleanValue()) {
                         objArray = new Object[i1];
                         objArray[i] = str;
                         d.C().w(this.c, "Request is successful. result is  ", objArray);
                      }
                      return uoa1.a();
                   }else {
                      d.C().e(this.c, "send_client_log_failed", new IOException("Result: "+str));
                   }
                }else if(response.code() > 400 && response.code() < 600){
                   this.h(new IOException("Response code is : "+response.code()));
                }
             }
          }
       }catch(java.io.IOException e9){
          this.h(e9);
       }catch(java.lang.Exception e0){
       }
       return obj;
    }
    public final String d(d$c p0,Request$Builder p1){
       ArrayList obj = PatchProxy.applyTwoRefs(p0, p1, this, d.class, "9");
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
    public final Request$Builder e(d$c p0){
       Request$Builder obj = PatchProxy.applyOneRefs(p0, this, d.class, "5");
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
       obj.post(RequestBody.create(d.i, p0.c));
       return obj;
    }
    public final d$c f(a p0,k p1){
       String str2;
       b$a c;
       String str = "zstd";
       d$c obj = PatchProxy.applyTwoRefs(p0, p1, this, d.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new d$c();
       d$c a = obj.a;
       String str1 = (p1.b())? "2": "1";
       a.put("priorityType", str1);
       if (e.h().e()) {
          obj.a.putAll(b.c.a().d());
       }else {
          b.a(-1961311520).e().d(obj.a);
       }
       h oh = b.a(0x36463d96).f();
       if (oh != null) {
          oh = oh.mBaseConfig;
          if (oh != null) {
             c.b(obj.a, "/rest/mina/log/collect", oh.d());
          }
       }
       if (a.d()) {
          str2 = b.a(-1554820802).b();
          str1 = b.a(-1554820802).a();
          if (!TextUtils.isEmpty(str2)) {
             obj.a.put("ks_ipv6_wlan", str2);
          }
          if (!TextUtils.isEmpty(str1)) {
             obj.a.put("ks_ipv6_cellular", str1);
          }
       }
       obj.a.put("os", "android");
       obj.a.put("client_key", "3c2cd3f3");
       obj.c = MessageNano.toByteArray(p0);
       p0 = p0.a;
       int len = p0.length;
       int i = 0;
       while (i < len) {
          object oobject = p0[i];
          if (TextUtils.isEmpty(oobject.d.a.d)) {
             oobject.d.a.d = TextUtils.I(a.j());
          }
          i = i + 1;
       }
       if (this.h == null) {
          this.h = a.t().getValue("clientLogEncoding", ClientLogEncodingConfig.class, null);
       }
       if (this.h != null && !SystemUtil.L(a.b())) {
          p0.encoding = "gzip";
       }
       try{
          d th = this.h;
          if (th != null && str.equals(th.encoding)) {
             ClientLogEncodingConfig level = this.h.level;
             if (level > null && (level <= 6 && a.b())) {
                try{
                   obj.c = Zstd.compress(obj.c, this.h.level);
                   obj.a.put("encoding", str);
                }catch(com.yxcorp.zcompress.ZstdException e7){
                   this.k(obj);
                   Object[] objArray = new Object[null];
                   d.C().u("send_client_log_failed", e7, objArray);
                   e7.printStackTrace();
                }
             }else {
             label_0152 :
                this.k(obj);
             }
          }else {
             goto label_0152 ;
          }
       }catch(java.lang.Exception e7){
          this.k(obj);
          e7.printStackTrace();
       }
       obj.a.put("bodyMd5", a0.d(obj.c));
       c = b.c;
       if (!TextUtils.isEmpty(c.a().e().a())) {
          obj.b.put("token", c.a().e().a());
       }
       if (!TextUtils.isEmpty(c.a().e().G())) {
          obj.b.put("kuaishou.api_st", c.a().e().G());
       }
       Iterator iterator = obj.a.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          str2 = uEntry.getKey();
          obj.b.put(str2, uEntry.getValue());
       }
       return obj;
    }
    public final OkHttpClient g(){
       Object obj = PatchProxy.apply(null, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.f == null) {
          this.f = new g(RouteType.ULOG, d.b).buildClient();
       }
       return this.f;
    }
    public final void h(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "3")) {
          return;
       }
       this.e = this.e + 1;
       Object[] objArray = new Object[0];
       d.C().u("send_client_log_failed", p0, objArray);
       if (this.e >= 2) {
          d.a().f("ulog", d.a().c("ulog"));
          this.e = 0;
       }
       return;
    }
    public final void i(Request p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "4")) {
          return;
       }
       d tg = this.g;
       if (TextUtils.isEmpty(tg)) {
          return;
       }
       p0.url().toString();
       if ((p0.url().toString()).startsWith(tg)) {
          a uoa = this.d.i(p1, new d$b(this).getType());
          if (d.j) {
             a mConnected = uoa.a().mConnected;
          }
          if (uoa.a().mConnected == null) {
             this.g = null;
             l.b(null, null);
          }
       }
       return;
    }
    public void j(String p0){
       this.g = p0;
    }
    public final void k(d$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "11")) {
          return;
       }
       p0.c = s.b(p0.c);
       p0.a.put("encoding", "gzip");
       return;
    }
}
