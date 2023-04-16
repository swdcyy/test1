package com.kwai.framework.network.cronet.k;
import bo.m;
import java.util.Random;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import com.google.common.util.concurrent.AtomicDouble;
import com.kwai.sdk.switchconfig.a;
import ta6.c;
import java.lang.String;
import q87.c;
import com.google.gson.JsonObject;
import java.lang.reflect.Type;
import java.lang.Double;
import db6.g;
import io7.a;
import db6.h;
import com.kuaishou.aegon.AegonRequestFinishedInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.net.URL;
import java.net.MalformedURLException;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$AegonRequestStatEvent;
import org.json.JSONObject;
import org.json.JSONException;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$AegonConnectionStatEvent;
import java.lang.StringBuilder;
import com.google.gson.JsonElement;
import java.util.Set;
import java.util.Iterator;
import java.lang.Exception;

public class k implements m	// class@000bfc
{
    public ConcurrentHashMap a;
    public ConcurrentHashMap b;
    public ConcurrentHashMap c;
    public AtomicDouble d;
    public AtomicDouble e;
    public static final Random f;

    static {
       k.f = new Random();
    }
    public void k(){
       super();
       this.a = new ConcurrentHashMap();
       this.b = new ConcurrentHashMap();
       this.c = new ConcurrentHashMap();
       this.d = new AtomicDouble(0);
       this.e = new AtomicDouble(0);
       a uoa = a.t();
       Object[] objArray = new Object[0];
       c.C().w("AegonCronetManager", "set upload ratio of request and connection data on init.", objArray);
       this.c(uoa.getValue("cronetLogUploadRatioDetailed", JsonObject.class, null));
       this.e.getAndSet(uoa.getValue("cronetConnectionDataUploadRatio", Double.class, Double.valueOf(0)).doubleValue());
       uoa.p("cronetLogUploadRatioDetailed", new g(this));
       uoa.p("cronetConnectionDataUploadRatio", new h(this));
    }
    public void a(AegonRequestFinishedInfo p0){
       double d;
       String host;
       Double uDouble;
       k ok = k.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ok, "2")) {
          return;
       }
       AegonRequestFinishedInfo url = p0.url;
       AegonRequestFinishedInfo consumer = p0.consumer;
       URL obj = PatchProxy.applyTwoRefs(url, consumer, this, ok, "5");
       if (obj != PatchProxyResult.class) {
          d = obj.doubleValue();
       }else {
          try{
             obj = new URL(url);
             host = obj.getHost();
             try{
                String path = obj.getPath();
             label_0045 :
                if (!host.isEmpty() && this.a.containsKey(host)) {
                   uDouble = this.a.get(host);
                   if (uDouble != null) {
                      d = uDouble.doubleValue();
                   }
                }
                if (!"".isEmpty() && this.b.containsKey("")) {
                   uDouble = this.b.get("");
                   if (uDouble != null) {
                      d = uDouble.doubleValue();
                   }
                }
                if (!consumer.isEmpty() && this.c.containsKey(consumer)) {
                   uDouble = this.c.get(consumer);
                   if (uDouble != null) {
                      d = uDouble.doubleValue();
                   }
                }
                d = this.d.get();
             }catch(java.net.MalformedURLException e0){
             }
             Object[] objArray1 = new Object[0];
             c.C().w("AegonCronetManager", e0.toString(), objArray1);
             goto label_0045 ;
          }catch(java.net.MalformedURLException e0){
             host = "";
             goto label_0038 ;
          }
       }
       if (k.f.nextDouble() - d >= 0) {
          return;
       }else {
          ClientStat$StatPackage statPackage = new ClientStat$StatPackage();
          ClientStat$AegonRequestStatEvent uAegonReques = new ClientStat$AegonRequestStatEvent();
          uAegonReques.errorCode = p0.errCode;
          uAegonReques.url = p0.url;
          uAegonReques.method = p0.method;
          uAegonReques.nettype = p0.netType;
          uAegonReques.ipv6Reachable = p0.ipv6Reachable;
          uAegonReques.consumer = p0.consumer;
          uAegonReques.aegonVersion = p0.aegonVersion;
          uAegonReques.cached = p0.cached;
          uAegonReques.httpCode = p0.httpCode;
          uAegonReques.protocol = p0.protocol;
          uAegonReques.receivedBytes = p0.receivedBytes;
          uAegonReques.sentBytes = p0.sentBytes;
          uAegonReques.viaProxy = p0.viaProxy;
          uAegonReques.contentEncoding = p0.contentEncoding;
          uAegonReques.viaIpv6 = p0.viaIpv6;
          uAegonReques.socketReused = p0.socketReused;
          uAegonReques.sslHandshakeType = p0.sslHandshakeType;
          uAegonReques.quicBroken = p0.quicBroken;
          uAegonReques.quicBrokenError = p0.quicBrokenError;
          uAegonReques.clientHellos = p0.clientHellos;
          uAegonReques.dnsCostMs = p0.dnsCostMs;
          uAegonReques.tcpCostMs = p0.tcpCostMs;
          uAegonReques.sslCostMs = p0.sslCostMs;
          uAegonReques.connectionCostMs = p0.connectionCostMs;
          uAegonReques.requestSendCostMs = p0.requestSendCostMs;
          uAegonReques.waitingCostMs = p0.waitingCostMs;
          uAegonReques.headerRecvCostMs = p0.headerRecvCostMs;
          uAegonReques.redirectCostMs = p0.redirectCostMs;
          uAegonReques.bodyRecvCostMs = p0.bodyRecvCostMs;
          AegonRequestFinishedInfo totalCostMs = p0.totalCostMs;
          try{
             uAegonReques.totalCostMs = totalCostMs;
             JSONObject jSONObject = new JSONObject(p0.extraInfo);
             jSONObject.put("ratio", d);
             uAegonReques.extraInfo = jSONObject.toString();
          }catch(org.json.JSONException e10){
             Object[] objArray = new Object[0];
             c.C().w("AegonCronetManager", e10.toString(), objArray);
          }
          statPackage.aegonRequestStatEvent = uAegonReques;
          b.a(0x4b316083).j(statPackage);
          return;
       }
    }
    public void b(String p0){
       JSONObject obj = this;
       JSONObject obj1 = p0;
       String str = "ingress_mtu";
       String str1 = "egress_mtu";
       String str2 = "cipher_suite";
       String str3 = "num_migrations";
       String str4 = "extra_info";
       if (PatchProxy.applyVoidOneRefs(obj1, obj, k.class, "1")) {
          return;
       }
       if (k.f.nextDouble() - obj.e.get() >= 0) {
          return;
       }
       try{
          ClientStat$StatPackage statPackage = new ClientStat$StatPackage();
          ClientStat$AegonConnectionStatEvent uAegonConnec = new ClientStat$AegonConnectionStatEvent();
          JSONObject jSONObject = new JSONObject(obj1);
          obj1 = jSONObject.getJSONObject("connect_timing");
          JSONObject jSONObject1 = jSONObject.getJSONObject("connection_stats");
          JSONObject jSONObject2 = jSONObject.getJSONObject("packet_manager_stats");
          JSONObject jSONObject3 = jSONObject.getJSONObject("quic_session_stats");
          obj = jSONObject.getJSONObject("quic_stats");
          JSONObject jSONObject4 = (jSONObject.has(str4))? jSONObject.getJSONObject(str4): new JSONObject();
          ClientStat$StatPackage statPackage1 = statPackage;
          uAegonConnec.host = jSONObject.getString("host");
          uAegonConnec.nettype = jSONObject.getInt("nettype");
          uAegonConnec.remoteEndpoint = jSONObject.getString("remote_endpoint");
          uAegonConnec.clientHellos = jSONObject.getInt("client_hellos");
          uAegonConnec.connectionId = jSONObject.getString("connection_id");
          uAegonConnec.protocol = jSONObject.getString("protocol");
          uAegonConnec.consecutiveRtoCnt = jSONObject2.getInt("consecutive_rto_cnt");
          uAegonConnec.consecutiveTlpCnt = jSONObject2.getInt("consecutive_tlp_cnt");
          uAegonConnec.hasInFlightPackets = jSONObject2.getBoolean("has_in_flight_packets");
          uAegonConnec.closedByServer = jSONObject3.getBoolean("closed_by_server");
          uAegonConnec.handshakeConfirmed = jSONObject3.getBoolean("handshake_confirmed");
          uAegonConnec.numActiveStreams = jSONObject3.getInt("num_active_streams");
          uAegonConnec.numTotalStreams = jSONObject3.getInt("num_total_streams");
          uAegonConnec.pathDegradingDetected = jSONObject3.getBoolean("path_degrading_detected");
          uAegonConnec.quicErrorCode = jSONObject3.getString("quic_error_code");
          if (jSONObject3.has(str3)) {
             uAegonConnec.numMigrations = jSONObject3.getInt(str3);
          }
          if (jSONObject1.has(str2)) {
             uAegonConnec.cipherSuite = jSONObject1.getInt(str2);
          }
          jSONObject4.put(str1, jSONObject1.getLong(str1));
          jSONObject4.put(str, jSONObject1.getLong(str));
          uAegonConnec.dnsCostMs = obj1.getLong("dns");
          uAegonConnec.sslCostMs = obj1.getLong("ssl");
          uAegonConnec.connectedDurationMs = jSONObject1.getLong("connected_ms");
          uAegonConnec.bytesReceived = obj.getLong("bytes_received");
          uAegonConnec.bytesRetransmitted = obj.getLong("bytes_retransmitted");
          uAegonConnec.bytesSent = obj.getLong("bytes_sent");
          uAegonConnec.estimatedBandwidthKbps = obj.getLong("estimated_bandwidth_kbps");
          uAegonConnec.srttUs = obj.getLong("srtt_us");
          uAegonConnec.rxPacketsLost = obj.getLong("rx_packets_lost");
          uAegonConnec.packetsDropped = obj.getLong("packets_dropped");
          uAegonConnec.packetsLost = obj.getLong("packets_lost");
          uAegonConnec.packetsReceived = obj.getLong("packets_received");
          uAegonConnec.packetsReordered = obj.getLong("packets_reordered");
          uAegonConnec.packetsRetransmitted = obj.getLong("packets_retransmitted");
          uAegonConnec.packetsSent = obj.getLong("packets_sent");
          if (jSONObject.has("rej_length")) {
             jSONObject4.put("rej_length", jSONObject.getInt("rej_length"));
             jSONObject4.put("has_proof", jSONObject.getBoolean("has_proof"));
          }
          if (jSONObject.has("write_error")) {
             jSONObject4.put("write_error", jSONObject.getString("write_error"));
          }
          uAegonConnec.extraInfo = jSONObject4.toString();
          ClientStat$StatPackage statPackage2 = statPackage1;
          statPackage2.aegonConnectionStatEvent = uAegonConnec;
          b.a(0x4b316083).j(statPackage2);
       }catch(org.json.JSONException e0){
          Object[] objArray = new Object[0];
          c.C().w("AegonCronetManager", e0.toString(), objArray);
       }
       return;
    }
    public final void c(JsonObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "3")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       c uoc = c.C();
       String str = "set upload ratio of request with config: "+p0.toString();
       Object[] objArray = new Object[0];
       try{
          uoc.w("AegonCronetManager", str, objArray);
          Iterator iterator = p0.w0().iterator();
          while (iterator.hasNext()) {
             str = iterator.next();
             k ok = -1;
             switch (str.hashCode()){
                 case 0xe6e7fb3d:
                   if (str.equals("consumers")) {
                      ok = 3;
                   }
                   break;
                 case 0x5edbfcb:
                   if (str.equals("hosts")) {
                      ok = 1;
                   }
                   break;
                 case 0x65820ee:
                   if (str.equals("paths")) {
                      ok = 2;
                   }
                   break;
                 case 0x5c13d641:
                   if (str.equals("default")) {
                      ok = null;
                   }
                   break;
                 default:
             }
          label_0076 :
             if (ok) {
                if (ok != 1) {
                   if (ok != 2) {
                      if (ok != 3) {
                         continue ;
                      }else {
                         this.d(p0.e0(str).r(), this.c);
                      }
                   }else {
                      this.d(p0.e0(str).r(), this.b);
                   }
                }else {
                   this.d(p0.e0(str).r(), this.a);
                }
             }else {
                this.d.getAndSet(p0.e0(str).m());
             }
          }
       }catch(java.lang.Exception e10){
          Object[] objArray1 = new Object[0];
          c.C().w("AegonCronetManager", e10.toString(), objArray1);
       }
       return;
    }
    public final void d(JsonObject p0,ConcurrentHashMap p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k.class, "4")) {
          return;
       }
       if (p1 != null) {
          Iterator iterator = p0.w0().iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             p1.put(str, Double.valueOf(p0.e0(str).m()));
          }
       }
       return;
    }
}
