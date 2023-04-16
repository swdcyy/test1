package com.yxcorp.gifshow.im_rtc.core.IMRTCCenter;
import zwa.b;
import java.lang.Enum;
import java.lang.String;
import java.util.concurrent.ExecutorService;
import t45.c;
import java.util.concurrent.Executor;
import brd.z;
import lrd.b;
import com.kwai.sdk.switchconfig.a;
import dxa.g;
import java.util.concurrent.CopyOnWriteArrayList;
import fxa.d;
import zwa.c;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.im_rtc.core.IMRTCCenter$a;
import brd.e0;
import sq6.d;
import dxa.f;
import brd.c0;
import java.lang.Boolean;
import mw5.c;
import dxa.b;
import sq6.c;
import java.lang.Throwable;
import dc5.c;
import com.yxcorp.gifshow.im.exception.KwaiIMException;
import lnc.a1;
import brd.a0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Object;
import com.yxcorp.gifshow.im_rtc.wrapper.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import yv4.d;
import wv4.b;
import com.kwai.framework.model.user.QCurrentUser;
import hxa.a;
import qq6.q0;
import com.yxcorp.gifshow.im_rtc.core.IMRTCCenter$h;
import java.util.Objects;
import qq6.j1;
import brd.t;
import qq6.t0;
import erd.o;
import qq6.v0;
import qq6.e1;
import qo6.k1;
import fxa.a;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.im_rtc.core.IMRTCCenter$f;
import com.yxcorp.gifshow.im_rtc.core.IMRTCCenter$d;
import qq6.c1;
import qq6.x0;
import com.yxcorp.gifshow.im_rtc.core.IMRTCCenter$c;
import qq6.b1;
import qq6.y0;
import java.util.List;
import com.yxcorp.gifshow.im_rtc.core.IMRTCCenter$i;
import qq6.u0;
import qq6.a1;
import qq6.z0;
import com.kwai.robust.PatchProxyResult;
import gxa.c;
import xp6.m;
import zwa.s;
import erd.g;
import com.yxcorp.gifshow.im_rtc.core.a;
import zwa.f;
import crd.b;
import crd.a;
import zwa.r;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.gifshow.im_rtc.core.b;
import zwa.e;
import mw5.e;
import hxa.g;
import zwa.d;
import mw5.a;
import dxa.c;
import zwa.h;
import zwa.g;
import zwa.m;
import io.reactivex.i;
import zwa.p;
import w4d.a;
import km8.b;
import android.content.SharedPreferences;
import ixa.e;
import xf6.h;
import o56.a;
import l85.b;
import qq6.o0;
import qq6.s1;
import java.util.Set;
import com.yxcorp.gifshow.im_rtc.core.IMRTCCenter$b;
import wkd.b;
import com.yxcorp.gifshow.im_rtc.media.a;
import com.yxcorp.gifshow.im_rtc.core.c;
import erd.r;
import java.util.concurrent.TimeUnit;
import zwa.q;
import zwa.l;
import java.lang.Integer;
import hxa.d;
import java.util.Iterator;
import zwa.v;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.kwai.social.startup.reminder.util.IMConfigUtil;
import com.kwai.social.startup.reminder.model.IMConfigInfo;
import brd.y;
import zwa.i;
import java.lang.Runnable;
import zwa.j;
import zwa.n;
import com.yxcorp.gifshow.im_rtc.core.IMRTCCenter$g;
import zwa.k;
import hxa.c;
import mw5.d;
import com.yxcorp.gifshow.im_rtc.core.IMRTCCenter$e;
import qq6.d1;
import qq6.r0;
import qq6.h;
import java.util.Collection;
import com.kwai.chat.sdk.signal.BizDispatcher;
import rq6.c;
import qq6.x1;
import com.kwai.chat.sdk.signal.KwaiSignalDispatcher;
import com.kwai.chat.sdk.signal.f;
import j85.e;
import qq6.b2;
import qq6.g;
import qq6.h1;
import android.os.Looper;
import android.os.Handler;
import fxa.b;
import dxa.h;
import zwa.o;

public final class IMRTCCenter extends Enum implements b	// class@00192b
{
    public final boolean elastic_task_opt_enable;
    public final g mDeviceState;
    public a mDisposables;
    public boolean mHasInit;
    public final g mIMRtcListener;
    public final List mListeners;
    public a mRtcClient;
    public final c mStateCalibrateSubject;
    public final d mStateMachine;
    public a mVideoPipe;
    public g mVideoWrapper;
    public final c mVoiceCallEventHandler;
    public static final IMRTCCenter[] $VALUES;
    public static final z mInitScheduler;
    public static final IMRTCCenter sInstance;

    static {
       IMRTCCenter iMRTCCenter = new IMRTCCenter("sInstance", 0);
       IMRTCCenter.sInstance = iMRTCCenter;
       IMRTCCenter[] iMRTCCenterA = new IMRTCCenter[]{iMRTCCenter};
       IMRTCCenter.$VALUES = iMRTCCenterA;
       IMRTCCenter.mInitScheduler = b.b(c.f("im-rtc-init-thread"));
    }
    public void IMRTCCenter(String p0,int p1){
       super(p0, p1);
       this.elastic_task_opt_enable = a.t().d("kswitch_key_elastic_task_opt_enable", true);
       this.mHasInit = false;
       this.mDeviceState = new g();
       this.mListeners = new CopyOnWriteArrayList();
       d uod = new d();
       this.mStateMachine = uod;
       this.mVoiceCallEventHandler = new c(this, uod);
       this.mStateCalibrateSubject = PublishSubject.g();
       this.mIMRtcListener = new IMRTCCenter$a(this);
    }
    public static e0 a(IMRTCCenter p0,String p1,boolean p2,boolean p3,boolean p4,String p5){
       return p0.lambda$acceptRTCCall$8(p1, p2, p3, p4, p5);
    }
    public static void b(IMRTCCenter p0,d p1,f p2,c0 p3){
       p0.lambda$realCreateRTCCall$6(p1, p2, p3);
    }
    public static void c(IMRTCCenter p0,Boolean p1){
       p0.lambda$init$1(p1);
    }
    public static void d(IMRTCCenter p0,c p1){
       p0.lambda$createVideoWrapperIfNeed$2(p1);
    }
    public static e0 e(IMRTCCenter p0,f p1,String p2){
       return p0.lambda$createRTCCall$5(p1, p2);
    }
    public static void f(IMRTCCenter p0,String p1,b p2){
       p0.lambda$calibrateRTCState$3(p1, p2);
    }
    public static void g(IMRTCCenter p0,b p1){
       p0.lambda$fetchRTCCallAndReenterIfNeed$11(p1);
    }
    public static void h(IMRTCCenter p0,String p1,c p2,c0 p3){
       p0.lambda$realAcceptRTCCall$9(p1, p2, p3);
    }
    public static void i(IMRTCCenter p0,String p1,c0 p2){
       p0.lambda$interruptRTCCallWithSubscribe$10(p1, p2);
    }
    public static Boolean j(IMRTCCenter p0,boolean p1,Throwable p2){
       return p0.lambda$enableCamera$15(p1, p2);
    }
    public static void k(IMRTCCenter p0,String p1,c p2,c0 p3){
       p0.lambda$updateRTCCallDetail$13(p1, p2, p3);
    }
    public static void l(IMRTCCenter p0,String p1,c0 p2){
       p0.lambda$fetchRTCCall$12(p1, p2);
    }
    public static e0 lambda$acceptRTCCall$7(Throwable p0){
       c.d("IMRTCCenter", "acceptRTCCall get token failed", p0);
       return a0.s(new KwaiIMException(0x7ffffffd, a1.p(0x7f1018f2)));
    }
    private e0 lambda$acceptRTCCall$8(String p0,boolean p1,boolean p2,boolean p3,String p4){
       return this.realAcceptRTCCall(p0, p1, p2, p3);
    }
    private void lambda$calibrateRTCState$3(String p0,b p1){
       b curRTCCallDe = this.getCurRTCCallDetail();
       if (curRTCCallDe != null && TextUtils.n(p1.f(), curRTCCallDe.f())) {
          if (p1.b() == curRTCCallDe.b()) {
             return;
          }else {
             this.interruptRTCCall(p0);
          }
       }
       return;
    }
    public static e0 lambda$createRTCCall$4(Throwable p0){
       c.d("IMRTCCenter", "createRTCCall get token failed", p0);
       return a0.s(new KwaiIMException(0x7ffffffd, a1.p(0x7f1018f2)));
    }
    private e0 lambda$createRTCCall$5(f p0,String p1){
       return this.realCreateRTCCall(p0);
    }
    private void lambda$createVideoWrapperIfNeed$2(c p0){
       a a;
       IMRTCCenter tmRtcClient = this.mRtcClient;
       if (tmRtcClient == null || (("CALLING").equals(this.getCurState()) && !PatchProxy.applyVoidOneRefs(p0, tmRtcClient, a.class, "23"))) {
          a = tmRtcClient.a;
          if (a != null && p0 != null) {
             a.d1(p0);
          }
       }
    label_0024 :
       tmRtcClient = this.mVideoPipe;
       if (tmRtcClient != null) {
          tmRtcClient.a(QCurrentUser.me().getId(), p0);
       }
       return;
    }
    public static Boolean lambda$enableCamera$14(boolean p0,String p1){
       return Boolean.valueOf(p0);
    }
    private Boolean lambda$enableCamera$15(boolean p0,Throwable p1){
       c.c("IMRTCCenter", "updateRTCCallDetail failed, revoke camera");
       this.enableDeviceCamera(p0);
       return Boolean.valueOf(p0);
    }
    private void lambda$fetchRTCCall$12(String p0,c0 p1){
       q0 oq0 = q0.U();
       q0 a = oq0.a;
       Objects.requireNonNull(a);
       oq0.V(j1.a().b().flatMap(new t0(p0)).flatMap(new v0(a)), new IMRTCCenter$h(this, p1));
    }
    private void lambda$fetchRTCCallAndReenterIfNeed$11(b p0){
       if (!this.isIMRTCCallBusy() && (this.getCurRTCCallDetail() == null && (p0.b() == 1 && !TextUtils.n(p0.e(), QCurrentUser.ME.getId())))) {
          this.mStateMachine.d(new a(2, p0));
       }
    label_002e :
       return;
    }
    public static boolean lambda$init$0(Boolean p0){
       return p0.booleanValue();
    }
    private void lambda$init$1(Boolean p0){
       this.calibrateRTCState();
    }
    private void lambda$interruptRTCCallWithSubscribe$10(String p0,c0 p1){
       c.g("IMRTCCenter", "interruptRTCCallWithSubscribe roomId="+p0);
       this.mStateMachine.d(new a(15, p0));
       q0.U().T(p0, 5, null, new IMRTCCenter$f(this, p1));
    }
    private void lambda$realAcceptRTCCall$9(String p0,c p1,c0 p2){
       q0 oq0 = q0.U();
       q0 a = oq0.a;
       Objects.requireNonNull(a);
       oq0.V(j1.a().b().flatMap(new c1(p0)).flatMap(new x0(a, p1)), new IMRTCCenter$d(this, p0, p2));
    }
    private void lambda$realCreateRTCCall$6(d p0,f p1,c0 p2){
       q0 oq0 = q0.U();
       q0 a = oq0.a;
       Objects.requireNonNull(a);
       y0 oy0 = new y0(a, p0, p1.c, p1.d, p1.k, p1.h, p1.i, p1.j);
       oq0.V(j1.a().b().flatMap(new b1(p0)).flatMap(v10), new IMRTCCenter$c(this, p2));
    }
    private void lambda$updateRTCCallDetail$13(String p0,c p1,c0 p2){
       q0 oq0 = q0.U();
       q0 a = oq0.a;
       Objects.requireNonNull(a);
       oq0.V(j1.a().b().flatMap(new u0(p0)).flatMap(new a1(p1)).flatMap(new z0(a, p0, p1)), new IMRTCCenter$i(this, p2, p0));
    }
    public static IMRTCCenter valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, IMRTCCenter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(IMRTCCenter.class, p0);
    }
    public static IMRTCCenter[] values(){
       Object obj = PatchProxy.apply(null, null, IMRTCCenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return IMRTCCenter.$VALUES.clone();
    }
    public a0 acceptRTCCall(String p0,boolean p1,boolean p2,boolean p3){
       IMRTCCenter obj;
       if (PatchProxy.isSupport(IMRTCCenter.class)) {
          obj = PatchProxy.applyFourRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), Boolean.valueOf(p3), this, IMRTCCenter.class, "22");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.mRtcClient;
       if (this.mHasInit == null || obj == null) {
          c.c("IMRTCCenter", "acceptRTCCall has not init");
          return a0.s(new KwaiIMException(0x7ffffffe, a1.p(0x7f1018f2)));
       }else {
          f uof = new f(this, p0, p1, p2, p3);
          return c.a(false).G(m.a).r(new s(obj)).H(a.b).u(v7);
       }
    }
    public final void addToAutoDisposables(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMRTCCenter.class, "7")) {
          return;
       }
       IMRTCCenter tmDisposable = this.mDisposables;
       if (tmDisposable == null || tmDisposable.isDisposed()) {
          this.mDisposables = new a();
       }
       this.mDisposables.c(p0);
       return;
    }
    public final void calibrateRTCState(){
       if (PatchProxy.applyVoid(null, this, IMRTCCenter.class, "13")) {
          return;
       }
       if (this.isIMRTCCallBusy() && this.getCurRTCCallDetail() != null) {
          String str = this.getCurRTCCallDetail().f();
          a0 uoa0 = this.fetchRTCCall(str);
          r or = new r(this, str);
          this.addToAutoDisposables(uoa0.R(or, Functions.d()));
       }
       return;
    }
    public void cancelRTCDial(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMRTCCenter.class, "25")) {
          return;
       }
       c.g("IMRTCCenter", "cancelRTCDial roomId="+p0);
       this.mStateMachine.d(new a(7, p0));
       this.realCloseRTCCall(p0, 2, null);
       return;
    }
    public void closeRTCCall(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMRTCCenter.class, "27")) {
          return;
       }
       c.g("IMRTCCenter", "closeRTCCall roomId="+p0);
       this.mStateMachine.d(new a(5, p0));
       this.realCloseRTCCall(p0, 4, null);
       return;
    }
    public a0 createRTCCall(f p0){
       IMRTCCenter obj = PatchProxy.applyOneRefs(p0, this, IMRTCCenter.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mRtcClient;
       if (this.mHasInit != null && obj != null) {
          return c.a(false).G(m.a).r(new s(obj)).H(b.b).u(new e(this, p0));
       }
       c.c("IMRTCCenter", "createRTCCall has not init");
       return a0.s(new KwaiIMException(0x7ffffffe, a1.p(0x7f1018f2)));
    }
    public final e createVideoWrapperIfNeed(){
       g obj = PatchProxy.apply(null, this, IMRTCCenter.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mVideoWrapper == null) {
          c.g("IMRTCCenter", "createVideoWrapper");
          obj = new g();
          this.mVideoWrapper = obj;
          obj.d(new d(this));
       }
       return this.mVideoWrapper;
    }
    public void dialTimeOutClose(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMRTCCenter.class, "29")) {
          return;
       }
       c.g("IMRTCCenter", "dialTimeOutClose roomId="+p0);
       this.mStateMachine.d(new a(16, p0));
       this.realCloseRTCCall(p0, 3, null);
       return;
    }
    public final void disposeAll(){
       if (PatchProxy.applyVoid(null, this, IMRTCCenter.class, "8")) {
          return;
       }
       IMRTCCenter tmDisposable = this.mDisposables;
       if (tmDisposable != null) {
          tmDisposable.dispose();
          this.mDisposables = null;
       }
       return;
    }
    public a0 enableCamera(String p0,boolean p1){
       IMRTCCenter iMRTCCenter = IMRTCCenter.class;
       if (PatchProxy.isSupport(iMRTCCenter)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, iMRTCCenter, "42");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       String str = "IMRTCCenter";
       c.g(str, "enableCamera roomId="+p0+" enable="+p1);
       if (("IDLE").equals(this.getCurState())) {
          c.c(str, "enableCamera, not in calling now");
          return a0.B(Boolean.FALSE);
       }else {
          this.enableDeviceCamera(p1);
          c uoc = new c();
          uoc.b(p1);
          uoc.d(this.mDeviceState.b());
          uoc.c(this.mDeviceState.a());
          a0 uoa0 = this.updateRTCCallDetail(p0, uoc);
          return uoa0.C(new h(p1)).I(new g(this, this.isCameraRunning()));
       }
    }
    public void enableDeviceCamera(boolean p0){
       IMRTCCenter iMRTCCenter = IMRTCCenter.class;
       if (PatchProxy.isSupport(iMRTCCenter) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, iMRTCCenter, "43")) {
          return;
       }
       if (("IDLE").equals(this.getCurState())) {
          c.c("IMRTCCenter", "enableDeviceCamera, not in calling now");
          return;
       }else {
          c.g("IMRTCCenter", "enableDeviceCamera enable="+p0);
          iMRTCCenter = this.mVideoWrapper;
          if (iMRTCCenter == null) {
             c.c("IMRTCCenter", "enableDeviceCamera, no videoWrapper instance");
             return;
          }else if(p0){
             iMRTCCenter.y();
          }else {
             iMRTCCenter.stopCapture();
          }
          return;
       }
    }
    public boolean enableMicro(boolean p0){
       IMRTCCenter iMRTCCenter = IMRTCCenter.class;
       if (PatchProxy.isSupport(iMRTCCenter)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, iMRTCCenter, "38");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       String str = "IMRTCCenter";
       c.g(str, "enableMicro "+p0);
       iMRTCCenter = this.mRtcClient;
       if (iMRTCCenter == null) {
          c.g(str, "enableMicro failed, rtcClient is null");
          return false;
       }else {
          this.mDeviceState.d(p0);
          iMRTCCenter.c((p0 ^ 1));
          return 1;
       }
    }
    public boolean enableSpeaker(boolean p0){
       IMRTCCenter iMRTCCenter = IMRTCCenter.class;
       if (PatchProxy.isSupport(iMRTCCenter)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, iMRTCCenter, "40");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       String str = "IMRTCCenter";
       c.g(str, "enableSpeaker "+p0);
       iMRTCCenter = this.mRtcClient;
       if (iMRTCCenter == null) {
          c.g(str, "enableSpeaker failed, rtcClient is null");
          return false;
       }else {
          this.mDeviceState.e(p0);
          iMRTCCenter.h(p0);
          return true;
       }
    }
    public a0 fetchRTCCall(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, IMRTCCenter.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       c.g("IMRTCCenter", "fetchRTCCall roomId="+p0);
       return a0.k(new m(this, p0));
    }
    public a0 fetchRTCCallAndReenterIfNeed(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, IMRTCCenter.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       c.g("IMRTCCenter", "checkRTCCallAndReenterIfNeed roomId="+p0);
       return this.fetchRTCCall(p0).r(new p(this));
    }
    public final b getCurRTCCallDetail(){
       Object obj = PatchProxy.apply(null, this, IMRTCCenter.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mStateMachine.g;
    }
    public final String getCurState(){
       Object obj = PatchProxy.apply(null, this, IMRTCCenter.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mStateMachine.a();
    }
    public e getIMVideoWrapper(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       IMRTCCenter obj = PatchProxy.apply(objArray, this, IMRTCCenter.class, "51");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.mVideoWrapper;
       if (obj == null) {
          c.g("IMRTCCenter", "getIMVideoWrapper return null");
          return objArray;
       }else {
          Objects.requireNonNull(obj);
          g og = PatchProxy.apply(objArray, obj, g.class, "11");
          if (og != patchProxyRe) {
          }else {
             StringBuilder str = "getRealVideoWrapper mVideoWrapper ";
             boolean b = (obj.b == null)? true: false;
             c.g("IMRTCVideoWrapperProxy", str+b);
             og = obj.b;
          }
          return og;
       }
    }
    public final String getLastRoomId(){
       Object obj = PatchProxy.apply(null, this, IMRTCCenter.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a.getString(b.d("user")+"im_rtc_last_room_id", "");
    }
    public void hangUpRTCCall(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMRTCCenter.class, "26")) {
          return;
       }
       c.g("IMRTCCenter", "hangUpRTCCall roomId="+p0);
       this.mStateMachine.d(new a(5, p0));
       this.realCloseRTCCall(p0, 1, null);
       return;
    }
    public final void init(){
       e1 a;
       if (PatchProxy.applyVoid(null, this, IMRTCCenter.class, "4")) {
          return;
       }
       if (this.mHasInit != null) {
          return;
       }
       c.g("IMRTCCenter", "init");
       String str = (h.r() || h.s())? "3960305413": "9576064061";
       e uoe = new e(str, a.w, a.m, QCurrentUser.me().getId(), a.a, 5000);
       IMRTCCenter tmRtcClient = this.mRtcClient;
       if (tmRtcClient == null || this.elastic_task_opt_enable == null) {
          tmRtcClient = new a();
          this.mRtcClient = tmRtcClient;
       }
       tmRtcClient.d = v1;
       IMRTCCenter tmIMRtcListe = this.mIMRtcListener;
       if (!PatchProxy.applyVoidOneRefs(tmIMRtcListe, tmRtcClient, a.class, "19") && tmIMRtcListe != null) {
          tmRtcClient.g.add(tmIMRtcListe);
       }
       j1.a().a = tmRtcClient;
       String str1 = "KwaiIMVoiceCallManagerRx";
       b.i(str1, "init finish");
       IMRTCCenter tmVoiceCallE = this.mVoiceCallEventHandler;
       a = q0.U().a.a;
       if (a == null) {
          b.e(str1, " registerVoiceCallListener failed", new Throwable("mVoiceHandler is null"));
       }else if(tmVoiceCallE == null){
          b.d(str1, " registerVoiceCallListener listener is null");
       }else {
          a.e.a.add(tmVoiceCallE);
       }
       this.mStateMachine.i = new IMRTCCenter$b(this);
       b.a(-711209703).f();
       this.addToAutoDisposables(this.mStateCalibrateSubject.distinctUntilChanged().filter(c.b).throttleLast(1, TimeUnit.SECONDS).observeOn(m.a).subscribe(new q(this), Functions.d()));
       this.mHasInit = true;
       c.g("IMRTCCenter", "init finish");
       return;
    }
    public void interruptRTCCall(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMRTCCenter.class, "32")) {
          return;
       }
       c.g("IMRTCCenter", "interruptRTCCall roomId="+p0);
       this.mStateMachine.d(new a(15, p0));
       this.realCloseRTCCall(p0, 5, null);
       return;
    }
    public a0 interruptRTCCallWithSubscribe(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, IMRTCCenter.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a0.k(new l(this, p0));
    }
    public boolean isCameraRunning(){
       Object obj = PatchProxy.apply(null, this, IMRTCCenter.class, "44");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       IMRTCCenter tmVideoWrapp = this.mVideoWrapper;
       if (tmVideoWrapp != null) {
          b = tmVideoWrapp.isCameraRunning();
       }
       c.g("IMRTCCenter", "isCameraRunning="+b);
       return b;
    }
    public boolean isFrontCamera(){
       Object obj = PatchProxy.apply(null, this, IMRTCCenter.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       IMRTCCenter tmVideoWrapp = this.mVideoWrapper;
       if (tmVideoWrapp != null) {
          b = tmVideoWrapp.isFrontCamera();
       }
       c.g("IMRTCCenter", "isFrontCamera="+b);
       return b;
    }
    public final boolean isIMRTCCallBusy(){
       Object obj = PatchProxy.apply(null, this, IMRTCCenter.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ((this.mStateMachine.a()).equals("IDLE") ^ 0x01);
    }
    public boolean isMicroOn(){
       Object obj = PatchProxy.apply(null, this, IMRTCCenter.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mDeviceState.a();
    }
    public boolean isSpeakerOn(){
       Object obj = PatchProxy.apply(null, this, IMRTCCenter.class, "41");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.mDeviceState.b();
    }
    public void linkTimeOutClose(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMRTCCenter.class, "28")) {
          return;
       }
       c.g("IMRTCCenter", "linkTimeOutClose roomId="+p0);
       this.mStateMachine.d(new a(18, p0));
       this.realCloseRTCCall(p0, 5, null);
       return;
    }
    public void onCallStateEventChange(int p0,String p1,b p2){
       if (PatchProxy.isSupport(IMRTCCenter.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, IMRTCCenter.class, "9")) {
          return;
       }
       String str = "IMRTCCenter";
       c.g(str, "onCallStateChanged event="+p0+" state="+p1+" callDetail="+p2);
       if (("IDLE").equals(p1)) {
          if (this.mVideoWrapper != null) {
             c.g(str, "release videoWrapper");
             this.mVideoWrapper.release();
             this.mVideoWrapper = null;
          }
          if (this.mVideoPipe != null) {
             c.g(str, "release videoPipe");
             this.mVideoPipe.release();
             this.mVideoPipe = null;
          }
       }else {
          this.createVideoWrapperIfNeed();
          if (this.mVideoPipe == null) {
             this.mVideoPipe = new d();
          }
       }
       Iterator iterator = this.mListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0, p1, p2);
       }
       return;
    }
    public void onCallStateSwitch(int p0,String p1,String p2,b p3){
       if (PatchProxy.isSupport(IMRTCCenter.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, p3, this, IMRTCCenter.class, "10")) {
          return;
       }
       c.g("IMRTCCenter", "onCallStateSwitch event="+p0+" lastState="+p1+"curState="+p2+" callDetail="+p3);
       Iterator iterator = this.mListeners.iterator();
       while (iterator.hasNext()) {
          iterator.next().b(p0, p1, p2, p3);
       }
       Objects.requireNonNull(p2);
       if (p2.equals("CALLING")) {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putString(b.d("user")+"im_rtc_last_room_id", p3.f());
          g.a(uEditor);
       }
       return;
    }
    public void onConnectStateChange(int p0){
       boolean b1;
       IMRTCCenter iMRTCCenter = IMRTCCenter.class;
       if (PatchProxy.isSupport(iMRTCCenter) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, iMRTCCenter, "12")) {
          return;
       }
       IMConfigInfo obj = PatchProxy.apply(null, null, IMConfigUtil.class, "19");
       boolean b = false;
       if (obj != PatchProxyResult.class) {
          b1 = obj.booleanValue();
       }else {
          obj = IMConfigUtil.i.r();
          b1 = (obj != null)? obj.mCallResetStateWhenNetworkRecovery: null;
       }
       if (b1 != null) {
          c.g("IMRTCCenter", "onConnectStateChange state="+p0);
          if (!p0) {
             b = true;
          }
          this.mStateCalibrateSubject.onNext(Boolean.valueOf(b));
       }
       return;
    }
    public void onLogin(){
       if (PatchProxy.applyVoid(null, this, IMRTCCenter.class, "3")) {
          return;
       }
       c.g("IMRTCCenter", "onLogin");
       IMRTCCenter.mInitScheduler.d(new i(this));
       return;
    }
    public void onLogout(){
       if (PatchProxy.applyVoid(null, this, IMRTCCenter.class, "5")) {
          return;
       }
       c.g("IMRTCCenter", "onLogout");
       IMRTCCenter.mInitScheduler.d(new j(this));
       return;
    }
    public void pushTimeOutClose(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMRTCCenter.class, "31")) {
          return;
       }
       c.g("IMRTCCenter", "pushTimeOutClose roomId="+p0);
       this.mStateMachine.d(new a(20, p0));
       this.realCloseRTCCall(p0, 3, null);
       return;
    }
    public final a0 realAcceptRTCCall(String p0,boolean p1,boolean p2,boolean p3){
       c obj;
       if (PatchProxy.isSupport(IMRTCCenter.class)) {
          obj = PatchProxy.applyFourRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), Boolean.valueOf(p3), this, IMRTCCenter.class, "23");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       c.g("IMRTCCenter", "realAcceptRTCCall roomId="+p0);
       this.mDeviceState.d(p1);
       this.mDeviceState.e(p2);
       this.mDeviceState.c(p3);
       obj = new c();
       obj.g(p1);
       obj.h(p2);
       obj.e(p3);
       return a0.k(new n(this, p0, obj));
    }
    public final void realCloseRTCCall(String p0,int p1,String p2){
       if (PatchProxy.isSupport(IMRTCCenter.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, IMRTCCenter.class, "34")) {
          return;
       }
       q0.U().T(p0, p1, p2, new IMRTCCenter$g(this));
       return;
    }
    public final a0 realCreateRTCCall(f p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, IMRTCCenter.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       c.g("IMRTCCenter", "realCreateRTCCall");
       this.mDeviceState.d(p0.e);
       this.mDeviceState.e(p0.f);
       this.mDeviceState.c(p0.g);
       return a0.k(new k(this, new d(p0.b, p0.a), p0));
    }
    public void registerIMRTCListener(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMRTCCenter.class, "14")) {
          return;
       }
       if (p0 != null && !this.mListeners.contains(p0)) {
          this.mListeners.add(p0);
       }
       return;
    }
    public void registerVideoFrameListener(String p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, IMRTCCenter.class, "49")) {
          return;
       }
       c.g("IMRTCCenter", "registerVideoFrameListener userId="+p0);
       IMRTCCenter tmVideoPipe = this.mVideoPipe;
       if (tmVideoPipe == null) {
          return;
       }
       tmVideoPipe.registerVideoFrameListener(p0, p1);
       return;
    }
    public void registerVideoView(d p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, IMRTCCenter.class, "47")) {
          return;
       }
       c.g("IMRTCCenter", "registerVideoView userId="+p1+" extraKey="+p2);
       IMRTCCenter tmVideoPipe = this.mVideoPipe;
       if (tmVideoPipe == null) {
          return;
       }
       tmVideoPipe.registerVideoView(p0, p1, p2);
       return;
    }
    public void rejectRTCCall(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMRTCCenter.class, "24")) {
          return;
       }
       c.g("IMRTCCenter", "rejectRTCCall roomId="+p0);
       this.mStateMachine.d(new a(9, p0));
       q0 oq0 = q0.U();
       q0 a = oq0.a;
       Objects.requireNonNull(a);
       oq0.V(j1.a().b().flatMap(new d1(p0)).flatMap(new r0(a)), new IMRTCCenter$e(this));
       return;
    }
    public void requestedTimeOutClose(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMRTCCenter.class, "30")) {
          return;
       }
       c.g("IMRTCCenter", "requestedTimeOutClose roomId="+p0);
       this.mStateMachine.d(new a(17, p0));
       this.realCloseRTCCall(p0, 3, null);
       return;
    }
    public boolean switchCamera(){
       IMRTCCenter obj = PatchProxy.apply(null, this, IMRTCCenter.class, "45");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       c.g("IMRTCCenter", "switchCamera");
       obj = this.mVideoWrapper;
       if (obj == null) {
          return false;
       }
       obj.switchCamera();
       return true;
    }
    public final void unInit(){
       IMRTCCenter tmIMRtcListe;
       e1 a;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, IMRTCCenter.class, "6")) {
          return;
       }
       if (this.mHasInit == null) {
          return;
       }
       this.mHasInit = false;
       c.g("IMRTCCenter", "unInit");
       if (this.getCurRTCCallDetail() != null) {
          this.interruptRTCCall(this.getCurRTCCallDetail().f());
       }
       IMRTCCenter tmRtcClient = this.mRtcClient;
       if (tmRtcClient != null) {
          tmIMRtcListe = this.mIMRtcListener;
          if (!PatchProxy.applyVoidOneRefs(tmIMRtcListe, tmRtcClient, a.class, "20")) {
             tmRtcClient.g.remove(tmIMRtcListe);
          }
       }
       tmIMRtcListe = this.mVoiceCallEventHandler;
       a = q0.U().a.a;
       String str = "KwaiIMVoiceCallManagerRx";
       if (a == null) {
          b.e(str, " unregisterVoiceCallListener failed", new Throwable("mVoiceHandler is null"));
       }else if(tmIMRtcListe == null){
          b.d(str, " unregisterVoiceCallListener listener is null");
       }else {
          a.e.a.remove(tmIMRtcListe);
       }
       b.i(str, "unInit begin");
       j1 oj1 = j1.a();
       j1 a1 = oj1.a;
       if (a1 != null) {
          a1.clear();
       }
       oj1.a = objArray;
       Iterator iterator = e1.b.all().iterator();
       while (iterator.hasNext()) {
          e1 uoe1 = iterator.next();
          e1 a2 = uoe1.a;
          if (a2 != null) {
             a2.c.j(a2.h);
             o0 f = a2.f;
             f.d(f.d).unregisterSignalListener(f.a);
             x1 e = f.e;
             if (e != null) {
                e.dispose();
             }
             f = a2.d;
             f.d.c();
             f.e.b();
             f.f.a();
             a2.e.a();
             uoe1.a = objArray;
          }
       }
       e1.b.clear();
       b.i(str, "unInit finish");
       q0.b.clear();
       tmIMRtcListe = this.mStateMachine;
       Objects.requireNonNull(tmIMRtcListe);
       if (!PatchProxy.applyVoid(objArray, tmIMRtcListe, d.class, "1")) {
          if (Looper.myLooper() == tmIMRtcListe.e.getLooper()) {
             tmIMRtcListe.c();
          }else {
             tmIMRtcListe.e.post(new b(tmIMRtcListe));
          }
       }
       b.a(-711209703).c();
       this.disposeAll();
       c.g("IMRTCCenter", "unInit finish");
       return;
    }
    public void unregisterIMRTCListener(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMRTCCenter.class, "15")) {
          return;
       }
       if (p0 != null) {
          this.mListeners.remove(p0);
       }
       return;
    }
    public void unregisterVideoFrameListener(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMRTCCenter.class, "50")) {
          return;
       }
       c.g("IMRTCCenter", "unregisterVideoFrameListener userId="+p0);
       IMRTCCenter tmVideoPipe = this.mVideoPipe;
       if (tmVideoPipe == null) {
          return;
       }
       tmVideoPipe.unregisterVideoFrameListener(p0);
       return;
    }
    public void unregisterVideoView(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, IMRTCCenter.class, "48")) {
          return;
       }
       c.g("IMRTCCenter", "unregisterVideoView userId="+p0+" extraKey="+p1);
       IMRTCCenter tmVideoPipe = this.mVideoPipe;
       if (tmVideoPipe == null) {
          return;
       }
       tmVideoPipe.unregisterVideoView(p0, p1);
       return;
    }
    public final a0 updateRTCCallDetail(String p0,c p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c obj = PatchProxy.applyTwoRefs(p0, p1, this, IMRTCCenter.class, "37");
       if (obj != patchProxyRe) {
          return obj;
       }
       c.g("IMRTCCenter", "updateRTCCallDetail roomId="+p0+" callParam="+p1);
       obj = PatchProxy.applyOneRefs(p1, null, h.class, "5");
       if (obj != patchProxyRe) {
       }else {
          obj = new c();
          obj.e(p1.a());
          obj.g(p1.a);
          obj.h(p1.b);
          obj.f(p1.d);
       }
       return a0.k(new o(this, p0, obj));
    }
}
