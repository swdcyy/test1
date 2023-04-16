package com.kwai.chat.kwailink.service.a;
import com.kwai.chat.kwailink.i$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.chat.kwailink.adapter.KlinkAdapter;
import java.lang.StringBuilder;
import com.kwai.chat.kwailink.log.a;
import java.lang.Boolean;
import java.lang.Integer;
import com.kwai.chat.kwailink.base.b;
import n75.b;
import com.kwai.chat.kwailink.config.KwaiLinkDefaultServerInfo;
import com.kwai.chat.kwailink.data.PassThroughRequest;
import com.kwai.chat.kwailink.e;
import q75.b;
import com.kwai.chat.kwailink.d;
import com.kwai.chat.kwailink.data.ClientAppInfo;
import n75.c;
import com.kwai.chat.kwailink.utils.EventReporter;
import com.kwai.chat.kwailink.data.HttpRequest;
import com.kwai.chat.kwailink.a;
import com.kwai.chat.kwailink.data.PacketData;
import com.kwai.chat.kwailink.h;
import com.kwai.chat.kwailink.c;
import com.kwai.chat.kwailink.g;
import com.kwai.chat.kwailink.f;
import java.util.Objects;
import android.os.Process;
import com.kwai.chat.kwailink.b;

public class a extends i$a	// class@000a6b
{
    public static KlinkAdapter b;
    public static int c;
    public static a d;

    public void a(){
       super();
    }
    public static a N1(){
       a obj = PatchProxy.apply(null, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a.d == null) {
          obj = a.class;
          _monitor_enter(obj);
          if (a.d == null) {
             a.d = new a();
          }
          _monitor_exit(obj);
       }
       return a.d;
    }
    public static boolean O1(){
       boolean b = true;
       if (a.c == b) {
       }else {
          b = false;
       }
       return b;
    }
    public int H(){
       Object obj = PatchProxy.apply(null, this, a.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.M1().H();
       a.e("KwaiLinkServiceBinder", "getLastConnectState, state="+i);
       return i;
    }
    public boolean K(){
       Object obj = PatchProxy.apply(null, this, a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = this.M1().K();
       a.e("KwaiLinkServiceBinder", "hasServiceTokeAndSessionKey, hasTokenAndKey="+b);
       return b;
    }
    public void K1(int p0){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, a.class, "26")) {
          return;
       }
       a.e("KwaiLinkServiceBinder", "setRunHorseServerIpLimitCount, count="+p0);
       this.M1().K1(p0);
       return;
    }
    public int M(){
       Object obj = PatchProxy.apply(null, this, a.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.M1().M();
       a.e("KwaiLinkServiceBinder", "getKwaiLinkConnectState, state="+i);
       return i;
    }
    public KlinkAdapter M1(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a.b == null) {
          _monitor_enter(this);
          if (a.b == null) {
             a.b = new KlinkAdapter();
          }
          _monitor_exit(this);
       }
       return a.b;
    }
    public void S(boolean p0,String p1,String p2,String p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(Boolean.valueOf(p0), p1, p2, p3, this, a.class, "3")) {
          return;
       }
       a.e("KwaiLinkServiceBinder", "login, anonymous="+p0+", appUserId="+p1+", serverToken="+p2+", sSecurity="+p3);
       this.M1().S(p0, p1, p2, p3);
       return;
    }
    public void U(String p0){
       b b;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "27")) {
          return;
       }
       a.e("KwaiLinkServiceBinder", "setTraceConfig, config="+p0);
       if (!PatchProxy.applyVoidOneRefs(p0, null, b.class, "11")) {
          b = b.b;
          if (b != null) {
             b.e(p0);
          }
       }
       this.M1().U(p0);
       return;
    }
    public String W(){
       String obj = PatchProxy.apply(null, this, a.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.M1().W();
       a.e("KwaiLinkServiceBinder", "getMasterSessionServerAddress, address="+obj);
       return obj;
    }
    public void Z(String p0,KwaiLinkDefaultServerInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "20")) {
          return;
       }
       a.e("KwaiLinkServiceBinder", "setCountryCode, countryCode="+p0);
       this.M1().Z(p0, p1);
       return;
    }
    public void a1(PassThroughRequest p0,int p1,int p2,e p3,boolean p4){
       if (PatchProxy.isSupport(a.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),p3,Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, a.class, "8")) {
             return;
          }
       }
       a.e("KwaiLinkServiceBinder", "passThrough, callback="+p3);
       KlinkAdapter klinkAdapter = this.M1();
       if (p1 <= 0) {
          p1 = b.e();
       }
       int i = p1;
       int i1 = (p2 > 0)? p2: 4000;
       klinkAdapter.a1(p0, i, i1, p3, p4);
       return;
    }
    public void b1(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       a.e("KwaiLinkServiceBinder", "setPacketReceiveCallBack, pCallback="+p0);
       this.M1().b1(p0);
       return;
    }
    public void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "21")) {
          return;
       }
       a.e("KwaiLinkServiceBinder", "setLaneId, laneId="+p0);
       this.M1().c(p0);
       return;
    }
    public void d0(ClientAppInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "23")) {
          return;
       }
       a.e("KwaiLinkServiceBinder", "setClientAppInfo");
       this.M1().d0(p0);
       return;
    }
    public void f1(int p0){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, a.class, "11")) {
          return;
       }
       a.e("KwaiLinkServiceBinder", "syncRuntimeState, state="+c.a(p0));
       a.c = p0;
       EventReporter.syncRuntime(p0);
       this.M1().f1(p0);
       return;
    }
    public int getAppId(){
       Object obj = PatchProxy.apply(null, this, a.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int appId = this.M1().getAppId();
       a.e("KwaiLinkServiceBinder", "getAppId, appId="+appId);
       return appId;
    }
    public String getUserId(){
       String obj = PatchProxy.apply(null, this, a.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.M1().getUserId();
       a.e("KwaiLinkServiceBinder", "getUserId, userId="+obj);
       return obj;
    }
    public void h0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "17")) {
          return;
       }
       a.e("KwaiLinkServiceBinder", "dumpLinkHeap, filePath="+p0);
       this.M1().h0(p0);
       return;
    }
    public void i0(HttpRequest p0,int p1,int p2,a p3,boolean p4){
       if (PatchProxy.isSupport(a.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),p3,Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, a.class, "9")) {
             return;
          }
       }
       a.e("KwaiLinkServiceBinder", "http, callback="+p3);
       KlinkAdapter klinkAdapter = this.M1();
       if (p1 <= 0) {
          p1 = b.e();
       }
       int i = p1;
       int i1 = (p2 > 0)? p2: 4000;
       klinkAdapter.i0(p0, i, i1, p3, p4);
       return;
    }
    public void l1(PacketData p0,int p1,int p2,h p3,boolean p4){
       if (PatchProxy.isSupport(a.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),p3,Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, a.class, "10")) {
             return;
          }
       }
       a.e("KwaiLinkServiceBinder", "send, command="+p0.a()+", callback="+p3+", traceContext="+p0.m());
       KlinkAdapter klinkAdapter = this.M1();
       if (p1 <= 0) {
          p1 = b.e();
       }
       int i = p1;
       int i1 = (p2 > 0)? p2: 4000;
       klinkAdapter.l1(p0, i, i1, p3, p4);
       return;
    }
    public void o(){
       if (PatchProxy.applyVoid(null, this, a.class, "18")) {
          return;
       }
       a.e("KwaiLinkServiceBinder", "resetKwaiLink");
       this.M1().o();
       return;
    }
    public void o0(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "15")) {
          return;
       }
       a.e("KwaiLinkServiceBinder", "logoff, callback="+p0);
       this.M1().o0(p0);
       return;
    }
    public void p1(){
       if (PatchProxy.applyVoid(null, this, a.class, "16")) {
          return;
       }
       a.e("KwaiLinkServiceBinder", "forceReconnet");
       this.M1().p1();
       return;
    }
    public String q(){
       String obj = PatchProxy.apply(null, this, a.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.M1().q();
       a.e("KwaiLinkServiceBinder", "getLastConnectMessage, msg="+obj);
       return obj;
    }
    public void s0(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "6")) {
          return;
       }
       a.e("KwaiLinkServiceBinder", "setSelfCallBack, sCallback="+p0);
       this.M1().s0(p0);
       return;
    }
    public void s1(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "7")) {
          return;
       }
       a.e("KwaiLinkServiceBinder", "setPushNotifierCallBack, callback="+p0);
       this.M1().s1(p0);
       return;
    }
    public long t(){
       Object obj = PatchProxy.apply(null, this, a.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long l = this.M1().t();
       a.e("KwaiLinkServiceBinder", "getInstanceId, instanceId="+l);
       return l;
    }
    public void t1(PacketData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "19")) {
          return;
       }
       a.e("KwaiLinkServiceBinder", "cancelSend, command="+p0.a());
       Objects.requireNonNull(this.M1());
       return;
    }
    public int u(){
       Object obj = PatchProxy.apply(null, this, a.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = Process.myPid();
       a.e("KwaiLinkServiceBinder", "getPid, pid="+i);
       return i;
    }
    public void z0(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "5")) {
          return;
       }
       a.e("KwaiLinkServiceBinder", "setLinkEventCallBack, eCallback="+p0);
       this.M1().z0(p0);
       return;
    }
}
