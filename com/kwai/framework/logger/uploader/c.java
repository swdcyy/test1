package com.kwai.framework.logger.uploader.c;
import er.j;
import java.lang.String;
import okhttp3.MediaType;
import o56.c;
import o56.a;
import java.lang.StringBuilder;
import android.os.Build;
import android.content.Context;
import com.kuaishou.android.vader.Channel;
import java.lang.Object;
import fg6.a;
import java.lang.Class;
import java.lang.Enum;
import okhttp3.Request$Builder;
import okhttp3.HttpUrl;
import com.kwai.robust.PatchProxyResult;
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
import com.yxcorp.utility.SystemUtil;
import aa6.c;
import w96.l;
import w96.d;
import q87.c;
import xf6.h;
import com.kwai.framework.model.router.RouteType;
import com.kuaishou.client.log.packages.nano.ClientLog$BatchReportEvent;
import java.util.Date;
import java.util.Calendar;
import com.kuaishou.client.log.packages.nano.ClientLog$ReportEvent;
import com.kuaishou.android.vader.persistent.LogRecord;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.client.log.packages.nano.ClientCommon$CommonPackage;
import com.kuaishou.client.log.packages.nano.ClientBase$DevicePackage;
import com.kuaishou.client.log.packages.nano.ClientBase$IdentityPackage;
import oe6.a;
import com.yxcorp.utility.TextUtils;
import org.json.JSONObject;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import java.lang.Long;
import java.lang.System;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$HeartBeatEvent;
import com.kuaishou.client.log.packages.nano.ClientCommon$AdditionalSeqIdPackage;
import er.k;
import com.kuaishou.android.vader.config.LogResponse;
import com.kwai.framework.logger.uploader.c$c;
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
import com.kuaishou.client.log.stat.packages.nano.ClientStat$WiFiStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$BaseStationStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$OpenedAppStatEvent;
import com.kwai.sdk.switchconfig.a;
import com.kwai.framework.logger.uploader.ClientLogEncodingConfig;
import java.lang.reflect.Type;
import jg6.a;
import com.yxcorp.zcompress.Zstd;
import com.kwai.framework.network.util.SafeModeLogEncryptor;
import java.lang.Throwable;
import java.lang.RuntimeException;
import java.lang.Exception;
import ekd.a0;
import okhttp3.OkHttpClient;
import com.kwai.framework.logger.uploader.g;
import t45.d;
import brd.z;
import y96.k;
import ok.x;
import okhttp3.Call;
import okhttp3.Response;
import okhttp3.ResponseBody;
import com.kwai.framework.logger.uploader.c$a;
import el.a;
import com.google.gson.Gson;
import njd.a;
import java.io.IOException;
import org.json.JSONException;
import com.kwai.framework.logger.uploader.c$b;
import aa6.a;
import ekd.s;

public class c implements j	// class@000b98
{
    public final Channel a;
    public final String b;
    public final String c;
    public final Gson d;
    public int e;
    public OkHttpClient f;
    public String g;
    public ClientLogEncodingConfig h;
    public String i;
    public static final MediaType j;
    public static final boolean k;
    public static final String l;

    static {
       c.j = MediaType.parse("application/octet-stream");
       c.k = a.a().c();
       c.l = Build.MANUFACTURER+"\("+Build.MODEL+"\)";
    }
    public void c(Context p0,String p1,Channel p2){
       super();
       this.b = p1;
       this.d = a.a;
       this.a = p2;
       this.c = c.class.getSimpleName()+"_"+p2.name();
    }
    public final HttpUrl a(Request$Builder p0,boolean p1){
       c uoc1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          p0 = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uoc, "8");
          if (p0 != patchProxyRe) {
             return p0;
          }
       }
       Host host = d.a().c("ulog");
       HttpUrl httpUrl = null;
       if (host == null || TextUtils.isEmpty(host.mHost)) {
          return httpUrl;
       }else {
          Uri uri = w0.f(this.b);
          HttpUrl$Builder uBuilder = new HttpUrl$Builder();
          String str = "/";
          if (p1) {
             uBuilder = HttpUrl.parse(this.i).newBuilder().addPathSegments(TextUtils.join(str, uri.getPathSegments()));
          }else {
             int i = 0;
             if (!SystemUtil.L(a.b())) {
                uoc1 = l.a();
                if (uoc1 != null) {
                   Object[] objArray = new Object[i];
                   d.C().s("buildHttpUrl", "url="+uoc1.mHost, objArray);
                   this.k(uoc1.mHost);
                }else {
                   this.k(httpUrl);
                }
             }
             uoc1 = this.g;
             if (TextUtils.isEmpty(uoc1)) {
                if (c.k) {
                   Object[] objArray1 = new Object[i];
                   d.C().s(this.c, "Normal mode.", objArray1);
                }
                String obj = PatchProxy.apply(httpUrl, this, uoc, "9");
                if (obj != patchProxyRe) {
                   i = obj.booleanValue();
                }else if(h.p()){
                   i = RouteType.ULOG.mIsHttps;
                }
                obj = (i != null)? "https": "http";
                uBuilder.scheme(obj).host(host.mHost).encodedPath(uri.getEncodedPath());
             }else if(c.k){
                Object[] objArray2 = new Object[i];
                d.C().s(this.c, "Debug mode.", objArray2);
             }
             uBuilder = HttpUrl.parse(uoc1).newBuilder().addPathSegments(TextUtils.join(str, uri.getPathSegments()));
          }
          return uBuilder.build();
       }
    }
    public final ClientLog$BatchReportEvent b(List p0){
       int i3;
       String str1;
       object oobject1;
       int c;
       Object obj = this;
       Object obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Date obj2 = PatchProxy.applyOneRefs(obj1, obj, c.class, "10");
       if (obj2 != patchProxyRe) {
          return obj2;
       }
       obj2 = PatchProxy.apply(null, obj, c.class, "16");
       int i = 0;
       if (obj2 != patchProxyRe) {
       }else {
          Calendar instance = Calendar.getInstance();
          instance.set(11, i);
          instance.set(12, i);
          instance.set(13, i);
          instance.set(14, i);
          obj2 = instance.getTime();
       }
       long time = obj2.getTime();
       ClientLog$BatchReportEvent uBatchReport = new ClientLog$BatchReportEvent();
       ClientLog$ReportEvent[] reportEventA = new ClientLog$ReportEvent[p0.size()];
       uBatchReport.event = reportEventA;
       int i1 = 0;
       while (i1 < p0.size()) {
          Object obj3 = obj1.get(i1);
          int i2 = 2;
          try{
             i3 = 1;
             uBatchReport.event[i1] = MessageNano.mergeFrom(new ClientLog$ReportEvent(), obj3.payload());
             ClientLog$BatchReportEvent event = uBatchReport.event;
             if (event[i1].commonPackage != null && (event[i1].commonPackage.identityPackage != null && (event[i1].commonPackage.devicePackage.model).equals(c.l))) {
                if (TextUtils.isEmpty(uBatchReport.event[i1].commonPackage.identityPackage.globalId)) {
                   uBatchReport.event[i1].commonPackage.identityPackage.globalId = TextUtils.I(a.j());
                }
                if (TextUtils.isEmpty(uBatchReport.event[i1].commonPackage.identityPackage.cloudDeviceIdTag) || ("0").equals(uBatchReport.event[i1].commonPackage.identityPackage.cloudDeviceIdTag)) {
                   c = a.c;
                   if (c == i2) {
                      uBatchReport.event[i1].commonPackage.identityPackage.cloudDeviceIdTag = String.valueOf(c);
                      uBatchReport.event[i1].commonPackage.identityPackage.deviceId = a.a;
                   }
                }
             }
          }catch(com.google.protobuf.nano.InvalidProtocolBufferNanoException e0){
             uBatchReport.event[i1] = new ClientLog$ReportEvent();
             JSONObject jSONObject = new JSONObject();
             jSONObject.put("type", "Exception");
             jSONObject.put("reason", "pb反序列化失败");
             b.a(0x4b316083).f1("v2_upload_parse_e", jSONObject.toString(), i3);
          }
       label_0121 :
          object oobject = uBatchReport.event[i1];
          long l = obj3.clientTimestamp();
          String str = obj3.customType();
          if (PatchProxy.isSupport(c.class)) {
             str1 = str;
             oobject1 = oobject;
             obj = 1;
             if (!PatchProxy.applyVoidFourRefs(oobject, Long.valueOf(l), Long.valueOf(time), str, this, c.class, "17")) {
             label_0159 :
                if (l - time < 0) {
                   long l1 = 0x1d4c0 + time;
                   if (System.currentTimeMillis() - l1 > 0) {
                      String str2 = str1;
                      if (("heartBeatEvent").equals(str2)) {
                         ClientLog$ReportEvent statPackage = oobject1.statPackage;
                         if (statPackage != null) {
                            ClientStat$StatPackage heartBeatEve = statPackage.heartBeatEvent;
                            if (heartBeatEve != null && heartBeatEve.type == obj) {
                            label_018f :
                               b.a(0x4b316083).W(19, oobject1);
                            }
                         }
                      }
                      if (("showEvent").equals(str2) || ("launchEvent").equals(str2)) {
                         goto label_018f ;
                      }
                   }
                }
             }
          }else {
             str1 = str;
             oobject1 = oobject;
             obj = 1;
             c uoc = 2;
             goto label_0159 ;
          }
          uBatchReport.event[i1].clientIncrementId = (long)obj3.seqId();
          uBatchReport.event[i1].clientTimestamp = obj3.clientTimestamp();
          if (uBatchReport.event[i1].commonPackage != null) {
             ClientCommon$AdditionalSeqIdPackage uAdditionalS = new ClientCommon$AdditionalSeqIdPackage();
             Channel uChannel = obj3.channelType();
             if (uChannel == Channel.REAL_TIME) {
                i2 = 1;
             }else if(uChannel == Channel.HIGH_FREQ){
                i2 = 2;
             }else if(uChannel == Channel.NORMAL){
                i2 = 3;
             }else {
                i2 = 0;
             }
             uAdditionalS.channel = i2;
             uAdditionalS.channelSeqId = (long)obj3.channelSeqId();
             uAdditionalS.customType = obj3.customType();
             uAdditionalS.customSeqId = (long)obj3.customSeqId();
             uBatchReport.event[i1].commonPackage.additionalSeqIdPackage = uAdditionalS;
          }
          i1 = i1 + 1;
          oobject1 = null;
       }
       return uBatchReport;
    }
    public LogResponse c(List p0,k p1){
       LogResponse obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       try{
          if (a.a().c() && !TextUtils.isEmpty(this.i)) {
             Object[] objArray1 = new Object[i];
             d.C().w(this.c, "mKeepLogUploader upload", objArray1);
             this.i(p0, p1, true);
          }
          obj = this.i(p0, p1, i);
       }catch(java.lang.Exception e7){
          Object[] objArray = new Object[i];
          d.C().t("KuaiShouLogUploader", "upload Exception e="+e7, objArray);
       }
       return null;
    }
    public final String d(c$c p0,Request$Builder p1){
       ArrayList obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "11");
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
    public final Request$Builder e(c$c p0){
       b$a c;
       Request$Builder obj = PatchProxy.applyOneRefs(p0, this, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       c = b.c;
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
       obj.post(RequestBody.create(c.j, p0.c));
       return obj;
    }
    public final c$c f(ClientLog$BatchReportEvent p0,k p1,boolean p2){
       c$c obj;
       String this;
       String str2;
       boolean b;
       boolean b1;
       b$a c;
       Object[] len1;
       ClientLogEncodingConfig uClientLogEn = this;
       String str = "zstd";
       if (PatchProxy.isSupport(c.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, c.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new c$c();
       c$c a = obj.a;
       this = "2";
       String str1 = (p1.b())? this: "1";
       a.put("priorityType", str1);
       if (e.h().e()) {
          obj.a.putAll(b.c.a().d());
       }else {
          b.a(-1961311520).e().d(obj.a);
       }
       h oh = b.a(0x36463d96).f();
       Object[] objArray = null;
       if (oh != null && oh.mBaseConfig != null) {
          c$c a1 = obj.a;
          this = PatchProxy.apply(objArray, uClientLogEn, c.class, this);
          if (this != PatchProxyResult.class) {
          }else {
             String str4 = "/rest/n/log/client/collect";
             if (!(uClientLogEn.b).contains(str4)) {
                str4 = "/rest/n/log/client/realtime/collect";
                if (!(uClientLogEn.b).contains(str4)) {
                   str4 = "/rest/n/log/client/hp/collect";
                   if (!(uClientLogEn.b).contains(str4)) {
                      len1 = objArray;
                   }
                }
             }
             this = str4;
          }
          c.b(a1, this, oh.mBaseConfig.d());
       }
       if (a.d()) {
          this = b.a(-1554820802).b();
          str2 = b.a(-1554820802).a();
          if (!TextUtils.isEmpty(this)) {
             obj.a.put("ks_ipv6_wlan", this);
          }
          if (!TextUtils.isEmpty(str2)) {
             obj.a.put("ks_ipv6_cellular", str2);
          }
       }
       obj.a.put("os", "android");
       obj.a.put("client_key", "3c2cd3f3");
       obj.c = MessageNano.toByteArray(p0);
       ClientLog$BatchReportEvent event = p0.event;
       int len = event.length;
       int i = 0;
       while (true) {
          b = true;
          if (i < len) {
             object oobject = event[i];
             ClientLog$ReportEvent obj1 = PatchProxy.applyOneRefs(oobject, uClientLogEn, c.class, "14");
             if (obj1 != PatchProxyResult.class) {
                b1 = obj1.booleanValue();
             }else if(oobject != null){
                obj1 = oobject.commonPackage;
                String str3 = (obj1 != null && obj1.needEncrypt != null)? 1: null;
                if (!str3) {
                   ClientStat$StatPackage obj2 = PatchProxy.applyOneRefs(oobject, uClientLogEn, c.class, "15");
                   if (obj2 != PatchProxyResult.class) {
                      b1 = obj2.booleanValue();
                   }else {
                      ClientLog$ReportEvent statPackage = oobject.statPackage;
                      if (statPackage != null) {
                         obj2 = statPackage.wifiStatEvent;
                         if (obj2 != null) {
                            ClientStat$WiFiStatEvent wifi = obj2.wifi;
                            if (wifi != null && wifi.length > 0) {
                               obj2 = 1;
                            label_014f :
                               if (!obj2) {
                                  obj2 = statPackage.baseStationStatEvent;
                                  if (obj2 != null) {
                                     ClientStat$BaseStationStatEvent baseStation = obj2.baseStation;
                                     if (baseStation != null && baseStation.length > 0) {
                                        obj2 = 1;
                                     label_015f :
                                        if (!obj2) {
                                           obj2 = statPackage.openedAppStatEvent;
                                           obj2 = (obj2 != null && (obj2.firstOpenedApp != null && obj2.enterBackgroundTimestamp))? 1: null;
                                           if (!obj2) {
                                              str3 = (statPackage.localMusicStatEvent != null)? 1: null;
                                              if (!str3) {
                                                 statPackage = (statPackage.applicationStatEvent != null)? 1: 0;
                                                 if (!statPackage) {
                                                 label_018a :
                                                    b1 = false;
                                                 }
                                              }
                                           }
                                        }
                                     }
                                  }
                                  obj2 = null;
                                  goto label_015f ;
                               }
                            label_0188 :
                               b1 = true;
                            }
                         }
                         obj2 = null;
                         goto label_014f ;
                      }else {
                         goto label_018a ;
                      }
                   }
                   if (!b1) {
                   label_018f :
                      b1 = false;
                   }
                }
                b1 = true;
             }else {
                goto label_018f ;
             }
             if (b1) {
             label_0198 :
                if (uClientLogEn.h == null) {
                   uClientLogEn.h = a.t().getValue("clientLogEncoding", ClientLogEncodingConfig.class, objArray);
                }
                if (uClientLogEn.h != null && !SystemUtil.L(a.b())) {
                   uClientLogEn.h.encoding = "gzip";
                }
                try{
                   c h = uClientLogEn.h;
                   if (h != null && str.equals(h.encoding)) {
                      ClientLogEncodingConfig level = uClientLogEn.h.level;
                      if (level > null && (level <= 6 && a.b())) {
                         try{
                            obj.c = Zstd.compress(obj.c, uClientLogEn.h.level);
                            str2 = "encoding";
                            if (!b) {
                               obj.a.put(str2, str);
                            }else {
                               obj.a.put(str2, "zstd2");
                               obj.c = SafeModeLogEncryptor.b.a(obj.c);
                            }
                         }catch(com.yxcorp.zcompress.ZstdException e0){
                            uClientLogEn.l(obj, b);
                            len1 = new Object[0];
                            d.C().u("send_client_log_failed", e0, len1);
                            e0.printStackTrace();
                         }catch(java.lang.Exception e0){
                            uClientLogEn.l(obj, b);
                            e0.printStackTrace();
                         }
                      }else {
                      label_0216 :
                         uClientLogEn.l(obj, b);
                      }
                   }else {
                      goto label_0216 ;
                   }
                }catch(java.lang.Exception e0){
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
                   this = uEntry.getKey();
                   obj.b.put(this, uEntry.getValue());
                }
                return obj;
             }else {
                i = i + 1;
             }
          }else {
             b = false;
             goto label_0198 ;
          }
       }
    }
    public final OkHttpClient g(){
       Object obj = PatchProxy.apply(null, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.f == null) {
          this.f = new g(RouteType.ULOG, d.b).buildClient();
       }
       return this.f;
    }
    public final void h(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "5")) {
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
    public final LogResponse i(List p0,k p1,boolean p2){
       LogResponse obj;
       Object[] objArray;
       Object[] objArray1;
       if (PatchProxy.isSupport(c.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, c.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = null;
       try{
          ClientLog$BatchReportEvent uBatchReport = this.b(p0);
          if (!uBatchReport.event.length) {
             return obj;
          }else {
             c$c uoc = this.f(uBatchReport, p1, p2);
             Request$Builder uBuilder = this.e(uoc);
             HttpUrl httpUrl = this.a(uBuilder, p2);
             int i = 0;
             int i1 = 1;
             if (httpUrl == null) {
                if (k.a.get().booleanValue()) {
                   HashMap hashMap = new HashMap(4);
                   hashMap.put("host", d.a().c("ulog").mHost);
                   hashMap.put("path", this.b);
                   objArray = new Object[i1];
                   objArray[i] = hashMap;
                   d.C().w(this.c, "埋点SDK network: httpUrl is null now.", objArray);
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
                   if (c.k || a.get().booleanValue()) {
                      objArray1 = new Object[i];
                      d.C().w(this.c, "Request is successful.", objArray1);
                   }
                   str = response.body().string();
                   this.j(response.request(), str);
                   a uoa = this.d.i(str, new c$a(this).getType());
                   Object obj1 = (uoa != null && uoa.b() == i1)? 1: null;
                   if (obj1 && uoa.a() != null) {
                      if (a.get().booleanValue()) {
                         objArray = new Object[i1];
                         objArray[i] = str;
                         d.C().w(this.c, "Request is successful. result is  ", objArray);
                      }
                      return uoa.a();
                   }else {
                      d.C().e(this.c, "send_client_log_failed", new IOException("Result: "+str));
                   }
                }else if(response.code() > 400 && response.code() < 600){
                   this.h(new IOException("Response code is : "+response.code()));
                }
             }
          }
       }catch(java.io.IOException e8){
          this.h(e8);
       }catch(org.json.JSONException e8){
          e8.printStackTrace();
       }catch(java.lang.Exception e8){
          d.C().r(this.c, "exception", e8);
       }
       return obj;
    }
    public final void j(Request p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "6")) {
          return;
       }
       c tg = this.g;
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
          a uoa = this.d.i(p1, new c$b(this).getType());
          if (c.k) {
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
    public void k(String p0){
       this.g = p0;
    }
    public final void l(c$c p0,boolean p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoc, "13")) {
          return;
       }
       p0.c = s.b(p0.c);
       String str = "encoding";
       if (!p1) {
          p0.a.put(str, "gzip");
       }else {
          p0.a.put(str, "gzip2");
          p0.c = SafeModeLogEncryptor.b.a(p0.c);
       }
       return;
    }
}
