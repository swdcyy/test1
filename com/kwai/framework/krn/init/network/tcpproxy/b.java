package com.kwai.framework.krn.init.network.tcpproxy.b;
import java.lang.String;
import java.lang.Object;
import km8.b;
import android.content.SharedPreferences;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import z86.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.switchconfig.a;
import z86.c;
import io7.a;
import p86.b;
import c96.a;
import java.lang.StringBuilder;
import q87.c;
import z86.d;
import com.kwai.framework.krn.init.network.tcpproxy.b$a;
import com.kwai.framework.krn.init.network.tcpproxy.b$b;
import com.kwai.framework.krn.init.network.tcpproxy.KLinkHttp$KlinkHttpPayload;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.google.protobuf.ByteString;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.ArrayList;
import java.util.HashMap;
import fg6.a;
import com.google.gson.Gson;
import k2b.u1;
import okhttp3.Request;
import com.kwai.chat.kwailink.data.PacketData;
import okhttp3.Response;
import okhttp3.Response$Builder;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.ResponseBody;
import com.kwai.framework.krn.init.preload.a;
import okhttp3.HttpUrl;
import java.net.URL;
import java.lang.Throwable;
import java.lang.Exception;
import com.kwai.framework.krn.init.network.tcpproxy.KLinkHttp$KlinkHttpPayload$a;
import java.util.Map;
import com.kwai.framework.krn.init.network.tcpproxy.KLinkHttp$KlinkHttpPayload$Method;
import okhttp3.Headers;
import okhttp3.RequestBody;
import okio.b;
import okio.c;
import java.util.Objects;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.AbstractMessageLite;
import jk0.b;
import jk0.c;
import com.kuaishou.krn.model.LaunchModel;
import ekd.q;
import com.kuaishou.krn.c;
import java.lang.Long;
import y86.s;
import y86.c;
import android.os.SystemClock;
import okhttp3.Interceptor$Chain;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.EventListener;
import okhttp3.Call;
import io7.f;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import el.a;
import java.util.Collections;
import java.util.TimerTask;
import com.kwai.chat.sdk.signal.f;
import com.kwai.chat.kwailink.client.c0;

public class b	// class@0015f8
{
    public boolean a;
    public long b;
    public final Timer c;
    public int d;
    public ConcurrentHashMap e;
    public MediaType f;
    public LaunchModel g;
    public e h;
    public e i;
    public static final SharedPreferences j;

    static {
       b.j = b.b("DefaultPreferenceHelper");
    }
    public void b(){
       SharedPreferences a;
       super();
       boolean b = false;
       this.a = b;
       long l = 0;
       this.b = l;
       this.c = new Timer();
       this.d = b;
       this.e = new ConcurrentHashMap();
       this.f = null;
       this.g = null;
       this.h = null;
       this.i = new e();
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
       }else {
          this.j();
          a.t().p("KDS_klink_proxy", new c(this));
          a = b.a;
          this.a = a.getBoolean("KDS_klink_proxy_disable", b);
          this.b = a.getLong("KDS_klink_proxy_disable_time", l);
          this.l();
          Object[] objArray = new Object[b];
          a.D().w("KrnNetwork", "KdsKlinkProxy parseConfig finished：mPreferenceDisable="+this.a+"， mDisableTimestamp="+this.b, objArray);
          a.t().p("KDSKlinkProxyResponseObjectCheckKey", new d(this));
       }
       return;
    }
    public void b(b$a p0){
       SharedPreferences a;
       super();
       boolean b = false;
       this.a = b;
       long l = 0;
       this.b = l;
       this.c = new Timer();
       this.d = b;
       this.e = new ConcurrentHashMap();
       this.f = null;
       this.g = null;
       this.h = null;
       this.i = new e();
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
       }else {
          this.j();
          a.t().p("KDS_klink_proxy", new c(this));
          a = b.a;
          this.a = a.getBoolean("KDS_klink_proxy_disable", b);
          this.b = a.getLong("KDS_klink_proxy_disable_time", l);
          this.l();
          Object[] objArray = new Object[b];
          a.D().w("KrnNetwork", "KdsKlinkProxy parseConfig finished：mPreferenceDisable="+this.a+"， mDisableTimestamp="+this.b, objArray);
          a.t().p("KDSKlinkProxyResponseObjectCheckKey", new d(this));
       }
       return;
    }
    public static b e(){
       return b$b.a;
    }
    public final boolean a(KLinkHttp$KlinkHttpPayload p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       String obj = PatchProxy.applyOneRefs(p0, this, uob, "13");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = new String(p0.getHttpBody().toByteArray());
       String httpUrl = p0.getHttpUrl();
       Map$Entry obj1 = PatchProxy.applyTwoRefs(obj, httpUrl, this, uob, "14");
       b = false;
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(TextUtils.isEmpty(obj)){
          Iterator iterator = this.e.entrySet().iterator();
          while (true) {
             if (iterator.hasNext()) {
                obj1 = iterator.next();
                if (httpUrl.contains(obj1.getKey())) {
                   iterator = obj1.getValue().iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         if (!obj.contains(iterator.next())) {
                            continue ;
                         }
                      }else {
                         HashMap hashMap = new HashMap();
                         hashMap.put("url", httpUrl);
                         hashMap.put("errorMsg", obj);
                         httpUrl = a.a.q(hashMap);
                         u1.Y("kds_klink_proxy_result_error_event", httpUrl, 20);
                         Object[] objArray = new Object[b];
                         a.D().t("KrnNetwork", obj1.getKey()+":"+obj1.getValue()+",data="+obj, objArray);
                         break ;
                      }
                   }
                }
             }
          }
       }
       b = true;
       return b;
    }
    public final Response b(Request p0,PacketData p1,HashMap p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          if (p1 == null) {
             int i = -2;
             p2.put("resultCode", String.valueOf(i));
             p2.put("errorMsg", "null == respPacket");
             return null;
          }else {
             super();
             KLinkHttp$KlinkHttpPayload klinkHttpPay = KLinkHttp$KlinkHttpPayload.parseFrom(p1.b());
             if (klinkHttpPay == null) {
                p2.put("resultCode", String.valueOf(-3));
                p2.put("errorMsg", "null == payload");
                return null;
             }else if(200 != klinkHttpPay.getHttpCode()){
                p2.put("resultCode", String.valueOf(klinkHttpPay.getHttpCode()));
                String str = " payload.getHttpCode\(\)="+klinkHttpPay.getHttpCode()+",";
                if (klinkHttpPay.getHttpBody() != null) {
                   str = str+klinkHttpPay.getHttpBody().toStringUtf8();
                }
                p2.put("errorMsg", str);
                return null;
             }else {
                int i1 = 0;
                while (i1 < klinkHttpPay.getHttpHeaderKeysCount()) {
                   if (!((klinkHttpPay.getHttpHeaderKeys(i1)).toLowerCase()).startsWith("http/") && !((klinkHttpPay.getHttpHeaderKeys(i1)).toLowerCase()).startsWith("QUIC/")) {
                      this.addHeader(klinkHttpPay.getHttpHeaderKeys(i1), klinkHttpPay.getHttpHeaderValues(i1));
                      if (("content-type").equalsIgnoreCase(klinkHttpPay.getHttpHeaderKeys(i1))) {
                         this.f = MediaType.parse(klinkHttpPay.getHttpHeaderValues(i1));
                      }
                   }
                   i1 = i1 + 1;
                }
                this.message("OK");
                Response response = this.request(p0).protocol(Protocol.HTTP_1_1).code(klinkHttpPay.getHttpCode()).body(ResponseBody.create(this.f, klinkHttpPay.getHttpBody().toByteArray())).build();
                if (!this.a(klinkHttpPay)) {
                   a.M().Z("回包数据检测为不合格，URL是:\n"+this.g(p0.url().url().toString()));
                   p2.put("resultCode", String.valueOf(-4));
                   p2.put("errorMsg", "CheckResponse error");
                   return null;
                }else {
                   a.M().Z("回包数据检测合格，URL是:\n"+this.g(p0.url().url().toString()));
                   return response;
                }
             }
          }
       }catch(java.lang.Exception e8){
          a.D().C("KrnNetwork", e8);
          p2.put(v2, String.valueOf(-5));
          p2.put(v1, e8.toString());
          return obj;
       }
    }
    public final PacketData c(Request p0){
       String str2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       KLinkHttp$KlinkHttpPayload$a obj = PatchProxy.applyOneRefs(p0, this, b.class, "8");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = KLinkHttp$KlinkHttpPayload.newBuilder();
       String str = p0.url().toString();
       String str1 = "";
       if (this.f() != null && this.f().whiteList != null) {
          Iterator iterator = this.f().whiteList.keySet().iterator();
          while (iterator.hasNext()) {
             str2 = iterator.next();
             if (str.startsWith(str2) && !TextUtils.isEmpty(this.f().whiteList.get(str2))) {
                str1 = str.replace(str2, this.f().whiteList.get(str2));
             }
          }
       }
       if (TextUtils.isEmpty(str1)) {
          obj.c(str);
       }else {
          obj.c(str1);
       }
       if (("GET").equalsIgnoreCase(p0.method())) {
          obj.d(KLinkHttp$KlinkHttpPayload$Method.kGet);
       }else if(("POST").equalsIgnoreCase(p0.method())){
          obj.d(KLinkHttp$KlinkHttpPayload$Method.kPost);
       }else {
          Object[] objArray = new Object[0];
          a.D().t("KrnNetwork", "error!暂时只支持两种请求类型:"+p0.method(), objArray);
          a.M().F("Klink长连接错误! 暂时只支持GET、POST两种请求类型");
          return null;
       }
       Iterator iterator1 = p0.headers().names().iterator();
       while (iterator1.hasNext()) {
          str2 = iterator1.next();
          obj.a(str2);
          obj.b(p0.header(str2));
       }
       try{
          PacketData packetData = new PacketData();
          if (p0.body() != null) {
             b uob = new b();
             p0.body().writeTo(uob);
             ByteString uByteString = ByteString.copyFrom(uob.readByteArray());
             Objects.requireNonNull(obj);
             if (PatchProxy.applyOneRefs(uByteString, obj, KLinkHttp$KlinkHttpPayload$a.class, "25") != patchProxyRe) {
             }else {
                obj.copyOnWrite();
                obj.instance.setHttpBody(uByteString);
             }
             MediaType mediaType = p0.body().contentType();
             if (mediaType != null && !TextUtils.isEmpty(mediaType.toString())) {
                obj.a("content-type");
                obj.b(mediaType.toString());
             }
          }
       label_011d :
          packetData.t("KlinkHttp.KDS");
          packetData.w(obj.build().toByteArray());
          return packetData;
       }catch(java.lang.Exception e9){
          a.D().C("KrnNetwork", e9);
          HashMap hashMap = new HashMap();
          hashMap.put("resultCode", String.valueOf(-6));
          hashMap.put("errorMsg", e9.toString());
          this.k(hashMap);
          return null;
       }
    }
    public final boolean d(Request p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uob, "6");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       b = false;
       if (p0 == null || (p0.url() == null || (p0.url().url() != null && !TextUtils.isEmpty(p0.url().url().toString())))) {
          if (!c.a().G()) {
             a.M().F("摇一摇中已关闭klink代理");
             return b;
          }else {
             String str = p0.url().url().toString();
             Object obj1 = PatchProxy.applyOneRefs(str, this, uob, "7");
             if (obj1 != patchProxyRe) {
                b = obj1.booleanValue();
             }else if(this.f() == null || (this.f() == null || (this.f().isUseKlinkProxy != null && (this.a != null || TextUtils.isEmpty(str))))){
                if (this.f() == null) {
                   a.M().Y("getKlinkProxyConfig\(\) == null ");
                }else {
                   a.M().Y("mPreferenceDisable="+this.a+"--getKlinkProxyConfig\(\).isUseKlinkProxy="+this.f().isUseKlinkProxy);
                }
             }else if(this.f().whiteList != null){
                Iterator iterator = this.f().whiteList.keySet().iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      if (str.startsWith(iterator.next())) {
                         b = true;
                         break ;
                      }
                   }
                }
             }
             a.M().Y("klink whiteList no match ");
          }
       }
       return b;
    }
    public final e f(){
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.h;
       if (obj != null) {
          return obj;
       }
       if (a.M().V(this.g)) {
          obj = this.i;
          a.M().F("检测到需要优先使用KSwtich的klink配置");
          if (!q.h(obj.whiteList)) {
             a.M().F("\x27\x02 \x5d\x02\x4f\x02\x75\x02KSwtich\x76\x02klink\x91\x02\x7f\x02\x00");
          }else {
             a.M().E("\x27\x02 KSwtich\x6c\x02\x67\x02klink\x91\x02\x7f\x02\x00");
          }
       }else {
          a uoa = a.M();
          _monitor_enter(uoa);
          a g = uoa.g;
          _monitor_exit(uoa);
          if (g != null && !a.M().T(g.b, g.a)) {
             return objArray;
          }else if(c.b().k()){
             a.M().F("尝试使用optimize.config.json文件中的klink长连接配置");
          }else {
             a.M().F("尝试使用bundle中的klink长连接配置");
          }
          if (g != null && !q.h(g.whiteList)) {
             obj = this.i;
             g.isUseKlinkProxy = obj.isUseKlinkProxy;
             g.maxErrorCount = obj.maxErrorCount;
             a.M().F("klink配置已生效，需要确保已申请好内网域名！ 配置如下: \n "+g.whiteList);
             if (c.b().k()) {
                a.M().F("\x27\x02 \x5d\x02\x4f\x02\x75\x02optimize.config.json\x65\x02\x4e\x02\x4e\x02\x76\x02klink\x95\x02\x8f\x02\x63\x02\x91\x02\x7f\x02\x00");
             }else {
                a.M().F("\x27\x02 \x5d\x02\x4f\x02\x75\x02bundle\x4e\x02\x76\x02klink\x95\x02\x8f\x02\x63\x02\x91\x02\x7f\x02\x00");
             }
          }else if(c.b().k()){
             a.M().E("\x27\x02 optimize.config.json\x65\x02\x4e\x02\x4e\x02\x6c\x02\x67\x02klink\x95\x02\x8f\x02\x63\x02\x91\x02\x7f\x02\x00");
          }else {
             a.M().E("\x27\x02 bundle\x4e\x02\x6c\x02\x67\x02klink\x95\x02\x8f\x02\x63\x02\x91\x02\x7f\x02\x00");
          }
          uoa = g;
       }
       this.h = obj;
       return obj;
    }
    public final String g(String p0){
       String obj = PatchProxy.applyOneRefs(p0, this, b.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.isEmpty(p0)) {
          obj = "?";
          if (p0.indexOf(obj) >= 0) {
             p0 = p0.substring(0, p0.indexOf(obj));
          }
       }
       return p0;
    }
    public final void h(Request p0,KLinkHttp$KlinkHttpPayload p1,HashMap p2,long p3){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(p0, null, p2, Long.valueOf(p3), this, b.class, "15")) {
          return;
       }
       this.d = this.d + 1;
       c uoc = s.e(s.f(p0));
       if (uoc != null) {
          uoc.isUseKlinkProxy = 1;
          uoc.klinkTimeCost = p3;
       }
       if (this.d > this.f().maxErrorCount && !c.b().k()) {
          this.a = true;
          this.b = SystemClock.elapsedRealtime() + 0x5265c00;
          b.a(this.a);
          b.b(this.b);
          this.l();
          a.M().Y("已触发klink容错机制，容错机制是指当连续失败超过maxErrorCount时会禁止24小时内再次使用klink");
       }
       Object[] objArray = new Object[0];
       a.D().t("KrnNetwork", "handleKlinkError:"+p2.toString(), objArray);
       this.k(p2);
       return;
    }
    public final Request i(Request p0,long p1,Response p2,Interceptor$Chain p3){
       c obj;
       if (PatchProxy.isSupport(b.class)) {
          obj = PatchProxy.applyFourRefs(p0, Long.valueOf(p1), p2, p3, this, b.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.d = 0;
       p0 = s.f(p0);
       obj = s.e(p0);
       if (obj != null) {
          obj.isUseKlinkProxy = 1;
          obj.klinkTimeCost = p1;
       }
       if (p3 instanceof RealInterceptorChain) {
          EventListener uEventListen = p3.eventListener();
          if (uEventListen != null) {
             uEventListen.responseHeadersEnd(p3.call(), p2);
          }
       }
       return p0;
    }
    public final void j(){
       String str = "KrnNetwork";
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       try{
          f uof = a.t().f("KDS_klink_proxy");
          String str1 = "";
          String str2 = (uof != null && uof.c() != null)? String.valueOf(uof.c()): str1;
          int i = 0;
          Object[] objArray = new Object[i];
          a.D().w(str, "KdsKlinkProxy parseConfig："+str2, objArray);
          this.i = (str2.equals(str1))? new e(): a.a.h(str2, e.class);
          Type[] typeArray = new Type[]{String.class,ArrayList.class};
          this.e.clear();
          this.e.putAll(a.t().getValue("KDSKlinkProxyResponseObjectCheckKey", a.getParameterized(Map.class, typeArray).getType(), Collections.emptyMap()));
       }catch(java.lang.Exception e1){
          a.D().C(str, e1);
          this.i = new e();
       }
       return;
    }
    public final void k(HashMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "16")) {
          return;
       }
       String str = "url";
       String str1 = String.valueOf(p0.get(str));
       if (!TextUtils.isEmpty(str1)) {
          String str2 = "?";
          if (str1.indexOf(str2) >= 0) {
             p0.put(str, str1.substring(0, str1.indexOf(str2)));
          }
       }
       u1.Y("kds_klink_proxy_error_event", p0.toString(), 20);
       return;
    }
    public final void l(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       if (this.a != null && 0 - (SystemClock.elapsedRealtime() - this.b) < 0) {
          this.c.schedule(new b$a(this), 0, this.b);
       }
       return;
    }
    public Response m(Request p0,Interceptor$Chain p1){
       Response obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       try{
          if (!this.d(p0)) {
             a.M().Z("没有使用klink长连接代理，URL是\n"+this.g(p0.url().url().toString()));
             return obj;
          }else {
             a.M().Z("\x27\x02 \x4f\x02\x75\x02klink\x95\x02\x8f\x02\x63\x02\x4e\x02\x74\x02\x53\x02\x8d\x02\x8b\x02\x6c\x02\xff\x02URL\x66\x02: \n\x00"+this.g(p0.url().url().toString()));
             PacketData packetData = this.c(p0);
             if (packetData == null) {
                return obj;
             }
             packetData = f.e().g().v(packetData, 0x2710);
             long l = SystemClock.elapsedRealtime() - SystemClock.elapsedRealtime();
             HashMap hashMap1 = new HashMap();
             Response response = this.b(p0, packetData, hashMap1);
             if (packetData != null && response != null) {
                return response.newBuilder().request(this.i(p0, l, response, p1)).build();
             }
             hashMap1.put("url", p0.url().url().toString());
             this.h(p0, null, hashMap1, l);
             return obj;
          }
       }catch(java.lang.Exception e15){
          Request request = p0;
          Object[] objArray = new Object[0];
          a.D().t("KrnNetwork", "syncSendMessage2Klink Exception: "+e15.toString(), objArray);
          HashMap hashMap = new HashMap();
          hashMap.put("url", request.url().url().toString());
          String str = e15.toString();
          hashMap.put("errorMsg", str);
          this.h(request, null, hashMap, -1);
          return obj;
       }
    }
}
