package com.kwai.link.Klink;
import android.content.Context;
import com.kwai.link.IKlinkHost;
import com.kwai.link.IKlinkConfig;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;
import java.io.File;
import com.kwai.link.Klink$1;
import com.kuaishou.aegon.Aegon$b;
import com.kuaishou.aegon.Aegon;
import aegon.chrome.net.d;
import z27.d0;
import bv7.b;
import com.kwai.link.JniCaller;
import java.lang.Long;
import com.kwai.link.Klink$KlinkOnlineListenerWrapper;
import com.kwai.link.PushTokenInfo;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.link.Klink$KlinkPushDelegateWrapper;
import com.kwai.link.Transaction;
import com.kwai.link.TransactionBase;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ekd.v0;
import java.lang.StringBuilder;
import com.kwai.chat.kwailink.log.a;
import z27.y;
import java.lang.Runnable;
import z27.r;
import z27.k;
import com.kwai.robust.PatchProxyResult;
import z27.c;
import z27.e;
import z27.j;
import z27.l;
import java.lang.Number;
import z27.b;
import z27.x;
import z27.c0;
import z27.m;
import z27.b0;
import z27.a0;
import z27.z;
import z27.e0;
import z27.s;
import z27.q;
import z27.f;
import z27.d;
import z27.h;
import z27.o;
import com.kwai.link.IKlinkOnlineListener;
import java.util.Map;
import z27.t;
import com.kwai.link.IKlinkPushDelegate;
import z27.u;
import z27.i;
import z27.f0;
import z27.v;
import z27.p;
import z27.w;
import z27.g;
import z27.n;

public class Klink	// class@000adb
{
    public IKlinkConfig mConfig;
    public IKlinkHost mHost;
    public long mNativeContext;
    public final Map mOnlineListeners;
    public final Map mPushDelegates;

    public void Klink(Context p0,IKlinkHost p1,IKlinkConfig p2){
       super();
       this.mNativeContext = 0;
       this.mConfig = null;
       this.mHost = null;
       this.mOnlineListeners = new HashMap();
       this.mPushDelegates = new HashMap();
       Klink.safelyLoadLibrary("c++_shared");
       Klink.safelyLoadLibrary("protobuf-lite");
       Klink.safelyLoadLibrary("ktrace");
       if (p2.isQuicEnabled()) {
          Aegon.d(p0, "{}", p0.getDir("aegon", 0).getAbsolutePath(), new Klink$1(this));
          Aegon.c();
       }
       Klink.safelyLoadLibrary("klink");
       this.mHost = p1;
       this.mConfig = p2;
       this.mNativeContext = JniCaller.objectCall(new d0(this)).longValue();
       return;
    }
    public static void A(Klink p0){
       p0.lambda$enterForeground$9();
    }
    public static void B(Klink p0){
       p0.lambda$clearPersistentInfo$27();
    }
    public static void C(Klink p0){
       p0.lambda$enterOrphan$11();
    }
    public static void D(Klink p0){
       p0.lambda$startup$4();
    }
    public static void E(Klink p0){
       p0.lambda$notifyNetworkChanged$12();
    }
    public static void a(Klink p0,String p1){
       p0.lambda$setLaneId$28(p1);
    }
    public static void b(Klink p0,long p1){
       p0.lambda$loginAnonymous$6(p1);
    }
    public static void c(Klink p0){
       p0.lambda$mayRaceImmediately$14();
    }
    public static Object d(Klink p0){
       return p0.lambda$getAppId$21();
    }
    public static Object e(Klink p0){
       return p0.lambda$getLastConnectMessage$25();
    }
    public static void f(Klink p0,Klink$KlinkOnlineListenerWrapper p1){
       p0.lambda$registerOnlineListener$2(p1);
    }
    public static void g(Klink p0,long p1){
       p0.lambda$cancelSend$17(p1);
    }
    public static void h(Klink p0,PushTokenInfo[] p1){
       p0.lambda$addPushTokenList$26(p1);
    }
    public static void i(Klink p0){
       p0.lambda$enterBackground$10();
    }
    public static Object j(Klink p0){
       return p0.lambda$getInstanceId$20();
    }
    public static void k(Klink p0){
       p0.lambda$logout$8();
    }
    public static void l(Klink p0,int p1){
       p0.lambda$setTotalRaceCountLimit$30(p1);
    }
    private void lambda$addPushTokenList$26(PushTokenInfo[] p0){
       this.addPushTokenList(this.mNativeContext, p0);
    }
    private void lambda$cancelSend$17(long p0){
       this.cancelSend(this.mNativeContext, p0);
    }
    private void lambda$clearPersistentInfo$27(){
       this.clearPersistentInfo(this.mNativeContext);
    }
    private Object lambda$constructTransaction$15(String p0){
       return Long.valueOf(this.createTransaction(this.mNativeContext, p0));
    }
    private void lambda$enterBackground$10(){
       this.enterBackground(this.mNativeContext);
    }
    private void lambda$enterForeground$9(){
       this.enterForeground(this.mNativeContext);
    }
    private void lambda$enterOrphan$11(){
       this.enterOrphan(this.mNativeContext);
    }
    private Object lambda$getAppId$21(){
       return Integer.valueOf(this.getAppId(this.mNativeContext));
    }
    private Object lambda$getInstanceId$20(){
       return Long.valueOf(this.getInstanceId(this.mNativeContext));
    }
    private Object lambda$getIp$22(){
       return this.getIp(this.mNativeContext);
    }
    private Object lambda$getLastConnectMessage$25(){
       return this.getLastConnectMessage(this.mNativeContext);
    }
    private Object lambda$getLastConnectState$24(){
       return Integer.valueOf(this.getLastConnectState(this.mNativeContext));
    }
    private Object lambda$getPort$23(){
       return Integer.valueOf(this.getPort(this.mNativeContext));
    }
    private Object lambda$getUserId$18(){
       return Long.valueOf(this.getUserId(this.mNativeContext));
    }
    private Object lambda$hasServiceTokenAndSessionKey$19(){
       return Boolean.valueOf(this.hasServiceTokenAndSessionKey(this.mNativeContext));
    }
    private void lambda$login$7(long p0,String p1,String p2){
       this.login(this.mNativeContext, p0, p1, p2);
    }
    private void lambda$loginAnonymous$6(long p0){
       this.loginAnonymous(this.mNativeContext, p0);
    }
    private void lambda$logout$8(){
       this.logout(this.mNativeContext);
    }
    private void lambda$mayRaceImmediately$14(){
       this.mayRaceImmediately(this.mNativeContext);
    }
    private Object lambda$new$0(){
       return Long.valueOf(this.construct());
    }
    private void lambda$notifyApplicationInfoUpdated$13(){
       this.notifyApplicationInfoUpdated(this.mNativeContext);
    }
    private void lambda$notifyNetworkChanged$12(){
       this.notifyNetworkChanged(this.mNativeContext);
    }
    private void lambda$registerOnlineListener$2(Klink$KlinkOnlineListenerWrapper p0){
       this.registerOnlineListener(this.mNativeContext, (long)p0.getID(), p0);
    }
    private void lambda$registerPushDelegate$3(Klink$KlinkPushDelegateWrapper p0){
       this.registerPushDelegate(this.mNativeContext, (long)p0.getID(), p0);
    }
    private void lambda$release$1(){
       this.destruct(this.mNativeContext);
    }
    private Object lambda$send$16(Transaction p0){
       return Long.valueOf(this.sendAndRelease(this.mNativeContext, p0.moveNativeResource()));
    }
    private void lambda$setLaneId$28(String p0){
       this.setLaneId(this.mNativeContext, p0);
    }
    private void lambda$setTotalRaceCountLimit$30(int p0){
       this.setTotalRaceCountLimit(this.mNativeContext, p0);
    }
    private void lambda$setTraceConfig$29(String p0){
       this.setTraceConfig(this.mNativeContext, p0);
    }
    private void lambda$shutdown$5(){
       this.shutdown(this.mNativeContext);
    }
    private void lambda$startup$4(){
       this.startup(this.mNativeContext);
    }
    public static void m(Klink p0){
       p0.lambda$shutdown$5();
    }
    public static Object n(Klink p0){
       return p0.lambda$getUserId$18();
    }
    public static Object o(Klink p0){
       return p0.lambda$getPort$23();
    }
    public static Object p(Klink p0){
       return p0.lambda$getLastConnectState$24();
    }
    public static Object q(Klink p0){
       return p0.lambda$getIp$22();
    }
    public static Object r(Klink p0){
       return p0.lambda$new$0();
    }
    public static void s(Klink p0,long p1,String p2,String p3){
       p0.lambda$login$7(p1, p2, p3);
    }
    public static void safelyLoadLibrary(String p0){
       boolean b = PatchProxy.applyVoidOneRefs(p0, null, Klink.class, "1");
       if (b) {
          return;
       }
       b.b(p0);
       return;
    }
    public static void t(Klink p0){
       p0.lambda$notifyApplicationInfoUpdated$13();
    }
    public static void u(Klink p0){
       p0.lambda$release$1();
    }
    public static void v(Klink p0,String p1){
       p0.lambda$setTraceConfig$29(p1);
    }
    public static Object w(Klink p0,Transaction p1){
       return p0.lambda$send$16(p1);
    }
    public static void x(Klink p0,Klink$KlinkPushDelegateWrapper p1){
       p0.lambda$registerPushDelegate$3(p1);
    }
    public static Object y(Klink p0){
       return p0.lambda$hasServiceTokenAndSessionKey$19();
    }
    public static Object z(Klink p0,String p1){
       return p0.lambda$constructTransaction$15(p1);
    }
    public native final void addPushTokenList(long p0,PushTokenInfo[] p1);
    public void addPushTokenList(PushTokenInfo[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Klink.class, "28")) {
          return;
       }
       JniCaller.voidCall(new y(this, p0));
       return;
    }
    public void cancelSend(long p0){
       Klink klink = Klink.class;
       if (PatchProxy.isSupport(klink) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, klink, "19")) {
          return;
       }
       JniCaller.voidCall(new r(this, p0));
       return;
    }
    public native final void cancelSend(long p0,long p1);
    public void clearPersistentInfo(){
       if (PatchProxy.applyVoid(null, this, Klink.class, "29")) {
          return;
       }
       JniCaller.voidCall(new k(this));
       return;
    }
    public native final void clearPersistentInfo(long p0);
    public native final long construct();
    public Transaction constructTransaction(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Klink.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Transaction(JniCaller.objectCall(new c(this, p0)).longValue());
    }
    public native final long createTransaction(long p0,String p1);
    public native final void destruct(long p0);
    public void enterBackground(){
       if (PatchProxy.applyVoid(null, this, Klink.class, "12")) {
          return;
       }
       JniCaller.voidCall(new e(this));
       return;
    }
    public native final void enterBackground(long p0);
    public void enterForeground(){
       if (PatchProxy.applyVoid(null, this, Klink.class, "11")) {
          return;
       }
       JniCaller.voidCall(new j(this));
       return;
    }
    public native final void enterForeground(long p0);
    public void enterOrphan(){
       if (PatchProxy.applyVoid(null, this, Klink.class, "13")) {
          return;
       }
       JniCaller.voidCall(new l(this));
       return;
    }
    public native final void enterOrphan(long p0);
    public void finalize(){
       if (PatchProxy.applyVoid(null, this, Klink.class, "3")) {
          return;
       }
       this.release();
       return;
    }
    public int getAppId(){
       Object obj = PatchProxy.apply(null, this, Klink.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return JniCaller.objectCall(new b(this)).intValue();
    }
    public native final int getAppId(long p0);
    public long getInstanceId(){
       Object obj = PatchProxy.apply(null, this, Klink.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return JniCaller.objectCall(new x(this)).longValue();
    }
    public native final long getInstanceId(long p0);
    public String getIp(){
       Object obj = PatchProxy.apply(null, this, Klink.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return JniCaller.objectCall(new c0(this));
    }
    public native final String getIp(long p0);
    public String getLastConnectMessage(){
       Object obj = PatchProxy.apply(null, this, Klink.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return JniCaller.objectCall(new m(this));
    }
    public native final String getLastConnectMessage(long p0);
    public int getLastConnectState(){
       Object obj = PatchProxy.apply(null, this, Klink.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return JniCaller.objectCall(new b0(this)).intValue();
    }
    public native final int getLastConnectState(long p0);
    public int getPort(){
       Object obj = PatchProxy.apply(null, this, Klink.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return JniCaller.objectCall(new a0(this)).intValue();
    }
    public native final int getPort(long p0);
    public long getUserId(){
       Object obj = PatchProxy.apply(null, this, Klink.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return JniCaller.objectCall(new z(this)).longValue();
    }
    public native final long getUserId(long p0);
    public boolean hasServiceTokenAndSessionKey(){
       Object obj = PatchProxy.apply(null, this, Klink.class, "21");
       if (obj == PatchProxyResult.class) {
          obj = JniCaller.objectCall(new e0(this));
       }
       return obj.booleanValue();
    }
    public native final boolean hasServiceTokenAndSessionKey(long p0);
    public native final void login(long p0,long p1,String p2,String p3);
    public void login(long p0,String p1,String p2){
       if (PatchProxy.isSupport(Klink.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), p1, p2, this, Klink.class, "9")) {
          return;
       }
       s os = new s(this, p0, p1, p2);
       JniCaller.voidCall(v0);
       return;
    }
    public void loginAnonymous(long p0){
       Klink klink = Klink.class;
       if (PatchProxy.isSupport(klink) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, klink, "8")) {
          return;
       }
       JniCaller.voidCall(new q(this, p0));
       return;
    }
    public native final void loginAnonymous(long p0,long p1);
    public void logout(){
       if (PatchProxy.applyVoid(null, this, Klink.class, "10")) {
          return;
       }
       JniCaller.voidCall(new f(this));
       return;
    }
    public native final void logout(long p0);
    public void mayRaceImmediately(){
       if (PatchProxy.applyVoid(null, this, Klink.class, "16")) {
          return;
       }
       JniCaller.voidCall(new d(this));
       return;
    }
    public native final void mayRaceImmediately(long p0);
    public void notifyApplicationInfoUpdated(){
       if (PatchProxy.applyVoid(null, this, Klink.class, "15")) {
          return;
       }
       JniCaller.voidCall(new h(this));
       return;
    }
    public native final void notifyApplicationInfoUpdated(long p0);
    public void notifyNetworkChanged(){
       if (PatchProxy.applyVoid(null, this, Klink.class, "14")) {
          return;
       }
       JniCaller.voidCall(new o(this));
       return;
    }
    public native final void notifyNetworkChanged(long p0);
    public native final void registerOnlineListener(long p0,long p1,Klink$KlinkOnlineListenerWrapper p2);
    public void registerOnlineListener(IKlinkOnlineListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Klink.class, "4")) {
          return;
       }
       if (this.mOnlineListeners.containsKey(p0)) {
          return;
       }
       Klink$KlinkOnlineListenerWrapper klinkOnlineL = new Klink$KlinkOnlineListenerWrapper(p0);
       this.mOnlineListeners.put(p0, klinkOnlineL);
       JniCaller.voidCall(new t(this, klinkOnlineL));
       return;
    }
    public native final void registerPushDelegate(long p0,long p1,Klink$KlinkPushDelegateWrapper p2);
    public void registerPushDelegate(IKlinkPushDelegate p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Klink.class, "5")) {
          return;
       }
       if (this.mPushDelegates.containsKey(p0)) {
          return;
       }
       Klink$KlinkPushDelegateWrapper klinkPushDel = new Klink$KlinkPushDelegateWrapper(p0);
       this.mPushDelegates.put(p0, klinkPushDel);
       JniCaller.voidCall(new u(this, klinkPushDel));
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, Klink.class, "2")) {
          return;
       }
       if (this.mNativeContext) {
          JniCaller.voidCall(new i(this));
          this.mNativeContext = 0;
       }
       return;
    }
    public long send(Transaction p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, Klink.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return JniCaller.objectCall(new f0(this, p0)).longValue();
    }
    public native final long sendAndRelease(long p0,long p1);
    public native final void setLaneId(long p0,String p1);
    public void setLaneId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Klink.class, "30")) {
          return;
       }
       JniCaller.voidCall(new v(this, p0));
       return;
    }
    public void setTotalRaceCountLimit(int p0){
       Klink klink = Klink.class;
       if (PatchProxy.isSupport(klink) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, klink, "32")) {
          return;
       }
       JniCaller.voidCall(new p(this, p0));
       return;
    }
    public native final void setTotalRaceCountLimit(long p0,int p1);
    public native final void setTraceConfig(long p0,String p1);
    public void setTraceConfig(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Klink.class, "31")) {
          return;
       }
       JniCaller.voidCall(new w(this, p0));
       return;
    }
    public void shutdown(){
       if (PatchProxy.applyVoid(null, this, Klink.class, "7")) {
          return;
       }
       JniCaller.voidCall(new g(this));
       return;
    }
    public native final void shutdown(long p0);
    public void startup(){
       if (PatchProxy.applyVoid(null, this, Klink.class, "6")) {
          return;
       }
       JniCaller.voidCall(new n(this));
       return;
    }
    public native final void startup(long p0);
}
