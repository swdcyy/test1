package com.kwai.chat.kwailink.adapter.KlinkAdapter;
import com.kwai.chat.kwailink.i;
import java.lang.Object;
import com.kwai.link.Klink;
import android.content.Context;
import com.kwai.chat.kwailink.base.b;
import com.kwai.chat.kwailink.adapter.KlinkHost;
import com.kwai.chat.kwailink.adapter.KlinkConfig;
import com.kwai.link.IKlinkHost;
import com.kwai.link.IKlinkConfig;
import com.kwai.link.KlinkExtension;
import com.kwai.chat.kwailink.adapter.q;
import com.kwai.chat.kwailink.adapter.KlinkAdapter$1;
import com.kwai.link.IKlinkOnlineListener;
import com.kwai.link.IKlinkPushDelegate;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.util.concurrent.ScheduledExecutorService;
import com.kwai.chat.kwailink.adapter.v;
import java.lang.Runnable;
import com.kwai.chat.kwailink.adapter.t;
import com.kwai.chat.kwailink.adapter.x;
import com.kwai.chat.kwailink.adapter.w;
import com.kwai.chat.kwailink.adapter.u;
import g85.a;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import com.kwai.chat.kwailink.utils.ConvertUtils;
import java.lang.StringBuilder;
import com.kwai.chat.kwailink.log.a;
import com.kwai.chat.kwailink.config.KwaiLinkDefaultServerInfo;
import q75.c;
import java.util.List;
import n75.b;
import com.kwai.chat.kwailink.data.PassThroughRequest;
import com.kwai.chat.kwailink.e;
import com.kwai.link.extensions.PassThroughTransaction;
import com.kwai.chat.kwailink.data.PassThroughRequestMsg;
import com.kwai.chat.kwailink.data.PassThroughInstance;
import l75.h;
import bv7.a;
import android.os.IBinder;
import com.kwai.chat.kwailink.d;
import d85.d;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import com.kwai.chat.kwailink.data.ClientAppInfo;
import com.kwai.chat.kwailink.adapter.p;
import android.os.Debug;
import java.lang.Exception;
import com.kwai.chat.kwailink.data.HttpRequest;
import com.kwai.chat.kwailink.a;
import com.kwai.link.extensions.HttpTransaction;
import java.lang.Enum;
import com.kwai.link.extensions.HttpTransaction$Method;
import s75.a;
import l75.g;
import com.kwai.chat.kwailink.data.PacketData;
import com.kwai.chat.kwailink.h;
import com.kwai.link.Transaction;
import com.kwai.link.TransactionBase;
import l75.i;
import com.kwai.chat.kwailink.c;
import com.kwai.chat.kwailink.g;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.chat.kwailink.f;
import android.os.Process;
import com.kwai.chat.kwailink.b;

public class KlinkAdapter implements i	// class@000a04
{
    public long a;
    public final Klink b;
    public final KlinkExtension c;
    public ScheduledExecutorService d;
    public final IKlinkPushDelegate e;
    public final IKlinkOnlineListener f;
    public int g;
    public String h;
    public Long i;
    public Long j;

    public void KlinkAdapter(){
       super();
       Klink klink = new Klink(b.b(), new KlinkHost(), new KlinkConfig());
       this.b = klink;
       this.c = new KlinkExtension(klink);
       q a = q.a;
       this.e = a;
       KlinkAdapter$1 u1 = new KlinkAdapter$1(this);
       this.f = u1;
       this.g = 0;
       this.h = "";
       this.i = null;
       this.j = null;
       klink.registerOnlineListener(u1);
       klink.registerPushDelegate(a);
       klink.startup();
    }
    public int H(){
       Object obj = PatchProxy.apply(null, this, KlinkAdapter.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.getLastConnectState();
    }
    public boolean K(){
       Object obj = PatchProxy.apply(null, this, KlinkAdapter.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.hasServiceTokenAndSessionKey();
    }
    public void K1(int p0){
       if (PatchProxy.isSupport(KlinkAdapter.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, KlinkAdapter.class, "35")) {
          return;
       }
       KlinkConfig.sTotalRaceCountLimit = p0;
       this.b.setTotalRaceCountLimit(p0);
       return;
    }
    public final void L1(long p0){
       if (PatchProxy.isSupport(KlinkAdapter.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, KlinkAdapter.class, "12")) {
          return;
       }
       this.R1().execute(new v(p0));
       return;
    }
    public int M(){
       return this.g;
    }
    public void M1(int p0){
       if (PatchProxy.isSupport(KlinkAdapter.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, KlinkAdapter.class, "2")) {
          return;
       }
       this.R1().execute(new t(p0));
       return;
    }
    public final void N1(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KlinkAdapter.class, "7")) {
          return;
       }
       this.R1().execute(new x(p0));
       return;
    }
    public void O1(int p0){
       if (PatchProxy.isSupport(KlinkAdapter.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, KlinkAdapter.class, "3")) {
          return;
       }
       KlinkAdapter tg = this.g;
       if (tg != p0) {
          this.g = p0;
          this.P1(tg);
       }
       return;
    }
    public final void P1(int p0){
       if (PatchProxy.isSupport(KlinkAdapter.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, KlinkAdapter.class, "4")) {
          return;
       }
       this.R1().execute(new w(this, p0));
       return;
    }
    public final void Q1(long p0){
       if (PatchProxy.isSupport(KlinkAdapter.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, KlinkAdapter.class, "10")) {
          return;
       }
       this.R1().execute(new u(p0));
       return;
    }
    public final ScheduledExecutorService R1(){
       Object obj = PatchProxy.apply(null, this, KlinkAdapter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.d == null) {
          _monitor_enter(this);
          if (this.d == null) {
             this.d = Executors.newSingleThreadScheduledExecutor(new a("KlinkAdapter"));
          }
          _monitor_exit(this);
       }
       return this.d;
    }
    public void S(boolean p0,String p1,String p2,String p3){
       if (PatchProxy.isSupport(KlinkAdapter.class) && PatchProxy.applyVoidFourRefs(Boolean.valueOf(p0), p1, p2, p3, this, KlinkAdapter.class, "14")) {
          return;
       }
       long l = 0;
       long longx = ConvertUtils.getLong(p1, l);
       if (p0) {
          this.b.loginAnonymous(longx);
       }else if(!longx - l){
          return;
       }else {
          this.b.login(longx, p2, p3);
       }
       a.e("KlinkAdapter", "login, anonymous="+p0+", appUserId="+p1);
       return;
    }
    public void U(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KlinkAdapter.class, "36")) {
          return;
       }
       this.b.setTraceConfig(p0);
       return;
    }
    public String W(){
       Object obj = PatchProxy.apply(null, this, KlinkAdapter.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getIp()+":"+this.b.getPort();
    }
    public void Z(String p0,KwaiLinkDefaultServerInfo p1){
       b b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KlinkAdapter.class, "29")) {
          return;
       }
       try{
          if (!c.b().c(p0) && (p1.c().size() > 0 || p1.d().size() > 0)) {
             this.o();
             if (!PatchProxy.applyVoidOneRefs(p0, null, b.class, "12")) {
                b = b.b;
                if (b != null) {
                   b.e = p0;
                }
             }
             c.b().d(p0);
             c.b().e(p1);
          }
       label_004e :
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void a1(PassThroughRequest p0,int p1,int p2,e p3,boolean p4){
       Object obj = this;
       object oobject = p0;
       object oobject1 = p3;
       int i = 0;
       if (PatchProxy.isSupport(KlinkAdapter.class)) {
          Object[] objArray = new Object[]{oobject,Integer.valueOf(p1),Integer.valueOf(p2),oobject1,Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, obj, KlinkAdapter.class, "19")) {
             return;
          }
       }
       PassThroughRequest b = oobject.b;
       PassThroughTransaction passThroughT = obj.c.constructPassThroughTransaction("Global.Klink.PassThrough");
       int len = b.length;
       for (; i < len; i = i + 1) {
          object oobject2 = b[i];
          PassThroughRequestMsg b1 = oobject2.b;
          passThroughT.addRequestMessage(b1.b, b1.c, b1.d, b1.e, oobject2.c, oobject2.d);
       }
       passThroughT.setOnComplete(new h(oobject1));
       obj.c.passThrough(passThroughT);
       return;
    }
    public IBinder asBinder(){
       return null;
    }
    public void b1(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KlinkAdapter.class, "15")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, null, d.class, "3")) {
          if (p0 != null) {
             RemoteCallbackList c = d.c;
             _monitor_enter(c);
             c.register(p0);
             _monitor_exit(c);
             d.c(0);
             a.e("KwaiLinkPacketDispatcher", "register packet callback. count="+c.getRegisteredCallbackCount());
          }else {
             a.e("KwaiLinkPacketDispatcher", "register packet callback, but callback is null");
          }
       }
       return;
    }
    public void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KlinkAdapter.class, "30")) {
          return;
       }
       this.b.setLaneId(p0);
       return;
    }
    public void d0(ClientAppInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KlinkAdapter.class, "32")) {
          return;
       }
       if (p0 == null) {
          a.g("KlinkAdapter", "setClientAppInfo fail, appInfo is null!");
          return;
       }else {
          b.l(p0);
          this.b.notifyApplicationInfoUpdated();
          a.e("KlinkAdapter", "setClientAppInfo Success, appInfo="+p0);
          return;
       }
    }
    public void f1(int p0){
       if (PatchProxy.isSupport(KlinkAdapter.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, KlinkAdapter.class, "22")) {
          return;
       }
       boolean b = (p0 == 3)? true: false;
       p.c = b;
       if (p0 == 2) {
          this.b.enterBackground();
       }else if(p0 == 1){
          this.b.enterForeground();
       }else if(p0 == 3){
          this.b.enterOrphan();
       }
       return;
    }
    public int getAppId(){
       Object obj = PatchProxy.apply(null, this, KlinkAdapter.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.getAppId();
    }
    public String getUserId(){
       Object obj = PatchProxy.apply(null, this, KlinkAdapter.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Long.toString(this.b.getUserId());
    }
    public void h0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KlinkAdapter.class, "27")) {
          return;
       }
       try{
          Debug.dumpHprofData(p0);
       }catch(java.lang.Exception e3){
          a.g("KlinkAdapter", e3.toString());
       }
       return;
    }
    public void i0(HttpRequest p0,int p1,int p2,a p3,boolean p4){
       int i = 0;
       if (PatchProxy.isSupport(KlinkAdapter.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),p3,Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, KlinkAdapter.class, "20")) {
             return;
          }
       }
       HttpTransaction httpTransact = this.c.constructHttpTransaction(p0.b);
       httpTransact.setUrl(p0.c);
       httpTransact.setMethod(HttpTransaction$Method.fromValue(p0.d.ordinal()));
       HttpRequest e = p0.e;
       int len = e.length;
       for (; i < len; i = i + 1) {
          object oobject = e[i];
          httpTransact.addRequestHeader(oobject.a, oobject.b);
       }
       httpTransact.setRequestBody(p0.f);
       httpTransact.setOnComplete(new g(p3));
       this.c.http(httpTransact);
       return;
    }
    public void l1(PacketData p0,int p1,int p2,h p3,boolean p4){
       if (PatchProxy.isSupport(KlinkAdapter.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),p3,Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, KlinkAdapter.class, "21")) {
             return;
          }
       }
       Transaction transaction = this.b.constructTransaction(p0.a());
       transaction.setSubBiz(p0.k());
       transaction.setRequestData(p0.b());
       long l = 0;
       if (p0.f() - l) {
          transaction.setHashId(p0.f());
       }
       if (p4) {
          l = (long)p2;
       }
       transaction.setCacheTimeout(l);
       transaction.setTransferTimeout((long)p1);
       if (p0.m() != null) {
          transaction.startTrace(p0.m());
       }
       if (p0.h() != null) {
          transaction.setLogParam(p0.h());
       }
       transaction.setOnComplete(new i(this, p3));
       this.b.send(transaction);
       return;
    }
    public void o(){
       if (PatchProxy.applyVoid(null, this, KlinkAdapter.class, "28")) {
          return;
       }
       this.b.logout();
       this.b.clearPersistentInfo();
       return;
    }
    public void o0(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KlinkAdapter.class, "25")) {
          return;
       }
       KlinkAdapter tb = this.b;
       try{
          tb.logout();
          a.e("KlinkAdapter", "Callback of logoff");
          if (p0 != null) {
             p0.onComplete();
          }
       }catch(android.os.RemoteException e4){
          a.g("KlinkAdapter", "Got RemoteException when callback of logoff:"+e4);
       }catch(java.lang.Exception e4){
          a.b("KlinkAdapter", e4.toString());
       }
       return;
    }
    public void p1(){
       if (PatchProxy.applyVoid(null, this, KlinkAdapter.class, "26")) {
          return;
       }
       this.b.mayRaceImmediately();
       return;
    }
    public String q(){
       Object obj = PatchProxy.apply(null, this, KlinkAdapter.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getLastConnectMessage();
    }
    public void s0(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KlinkAdapter.class, "17")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, null, p.class, "2")) {
          RemoteCallbackList b = p.b;
          _monitor_enter(b);
          b.register(p0);
          _monitor_exit(b);
       }
       if (!TextUtils.isEmpty(this.h)) {
          this.N1(this.h);
       }
       KlinkAdapter ti = this.i;
       if (ti != null) {
          this.Q1(ti.longValue());
       }
       ti = this.j;
       if (ti != null) {
          this.L1(ti.longValue());
       }
       return;
    }
    public void s1(f p0){
       RemoteCallbackList d;
       if (PatchProxy.applyVoidOneRefs(p0, this, KlinkAdapter.class, "18")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, null, d.class, "4")) {
          if (p0 != null) {
             d = d.d;
             _monitor_enter(d);
             d.register(p0);
             _monitor_exit(d);
             a.e("KwaiLinkPacketDispatcher", "register push notifier callback. count="+d.getRegisteredCallbackCount());
          }else {
             a.e("KwaiLinkPacketDispatcher", "register push notifier packet callback, but callback is null");
          }
       }
       return;
    }
    public long t(){
       Object obj = PatchProxy.apply(null, this, KlinkAdapter.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.b.getInstanceId();
    }
    public void t1(PacketData p0){
    }
    public int u(){
       Object obj = PatchProxy.apply(null, this, KlinkAdapter.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return Process.myPid();
    }
    public void z0(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KlinkAdapter.class, "16")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, null, p.class, "1")) {
          RemoteCallbackList a = p.a;
          _monitor_enter(a);
          a.register(p0);
          _monitor_exit(a);
       }
       this.P1(-1);
       return;
    }
}
