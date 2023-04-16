package com.kwai.video.krtc.AryaAudioEngineProxyImp;
import com.kwai.video.krtc.a;
import java.lang.String;
import com.kwai.video.krtc.utils.Log;
import android.os.HandlerThread;
import android.os.Handler;
import android.os.Looper;
import com.kwai.video.stannis.Stannis;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import android.content.Context;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$b;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$d;
import com.kwai.video.stannis.observers.DataReadyObserver;
import com.kwai.video.stannis.observers.StannisNotifyObserver;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$114;
import java.lang.Runnable;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$116;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$122;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$127;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$129;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$132;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$133;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$3;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$4;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$7;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$34;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$36;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$37;
import java.util.regex.Pattern;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.lang.StringBuilder;
import java.lang.AssertionError;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$c;
import com.kwai.video.stannis.QosInfo;
import com.kwai.video.stannis.StannisDeviceInfo;
import com.kwai.video.krtc.Arya$AryaDeviceInfo;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$61;
import java.util.Timer;
import java.lang.Float;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$56;
import java.lang.Integer;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$44;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$66;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$27;
import com.kwai.video.krtc.a$a;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$13;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$35;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$20;
import java.lang.Long;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$10;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$33;
import com.kwai.video.krtc.a$c;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$111;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$112;
import com.kwai.video.stannis.observers.KaraokeScoreObserver;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$1;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$50;
import java.util.TimerTask;
import com.kwai.video.krtc.Arya$AryaAudioDeviceStatusListener;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$63;
import com.kwai.video.krtc.Arya$AryaAudioRouteListener;
import com.kwai.video.stannis.Stannis$AudioRouteListener;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$92;
import com.kwai.video.krtc.Arya$AryaConfig;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$104;
import com.kwai.video.krtc.AryaContext;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$125;
import com.kwai.video.krtc.AudioServerConfig;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$2;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$24;
import com.kwai.video.krtc.observers.AryaRawAudioFrameObserver;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$26;
import com.kwai.video.krtc.observers.AudioSceneObserver;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$87;
import com.kwai.video.krtc.observers.RawAudioObserver;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$126;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$6;
import org.json.JSONObject;
import android.text.TextUtils;
import com.kwai.video.krtc.utils.b;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$94;
import org.json.JSONException;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$54;
import com.kwai.video.krtc.observers.a;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$101;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$102;
import com.kwai.video.stannis.observers.BgmObserver;
import com.kwai.video.krtc.observers.AudioSegmentPlayerObserver;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$108;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$17;
import com.kwai.video.krtc.observers.AudioBufferPlayObserver;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$128;
import java.util.ArrayList;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$18;
import com.kwai.video.krtc.a$b;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$64;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$65;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$115;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$41;
import com.kwai.video.stannis.Stannis$KWStannisAudioEffectParam;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$31;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$76;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$62;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$86;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$38;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$22;
import android.media.projection.MediaProjection;
import java.lang.Number;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$72;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$119;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$23;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$28;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$21;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$45;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$88;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$55;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$78;
import com.kwai.video.krtc.AryaAudioConfigQosInfo;
import com.kwai.video.stannis.MicrophoneInfo;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$83;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$53;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$29;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$30;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$46;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$79;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$57;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$47;
import java.util.concurrent.Callable;
import com.kwai.video.stannis.utils.ThreadUtils;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$93;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$48;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$81;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$58;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$91;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$49;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$89;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$59;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$a;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$71;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$51;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$99;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$118;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$73;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$52;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$121;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$120;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$105;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$117;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$131;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$60;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$5;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$77;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$25;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$75;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$32;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$82;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$39;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$80;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$85;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$84;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$95;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$90;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$96;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$74;
import com.kwai.video.krtc.Arya$AryaMicrophoneInfo;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$98;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$106;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$67;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$110;
import java.util.List;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$68;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$124;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$69;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$8;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$130;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$70;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$9;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$97;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$11;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$107;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$100;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$12;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$16;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$103;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$14;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$19;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$109;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$15;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$40;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$113;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$42;
import com.kwai.video.krtc.AryaAudioEngineProxyImp$123;

public class AryaAudioEngineProxyImp extends a	// class@00072a
{
    public AryaAudioConfigQosInfo A;
    public Timer B;
    public QosInfo C;
    public QosInfo D;
    public ReadWriteLock E;
    public Lock F;
    public Lock G;
    public HashMap H;
    public Stannis$KWStannisConfig a;
    public Stannis$KWStannisServerConfig b;
    public Stannis c;
    public long d;
    public AryaAudioEngineProxyImp$b e;
    public AryaAudioEngineProxyImp$d f;
    public HandlerThread g;
    public Handler h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public long n;
    public long o;
    public HashMap p;
    public HashMap q;
    public ReadWriteLock r;
    public Lock s;
    public Lock t;
    public String u;
    public DataReadyObserver v;
    public int w;
    public float x;
    public Context y;
    public StannisNotifyObserver z;

    public void AryaAudioEngineProxyImp(){
       super();
       this.c = null;
       this.d = -1;
       this.e = null;
       this.f = null;
       this.g = null;
       this.h = null;
       this.i = false;
       this.j = false;
       this.k = true;
       this.l = 512;
       this.m = 0;
       this.n = 0;
       this.o = 0;
       this.p = null;
       this.r = null;
       this.s = null;
       this.t = null;
       this.u = "";
       this.v = null;
       this.w = 0;
       this.x = 0x3f800000;
       this.y = null;
       this.z = null;
       this.a = null;
       this.b = null;
       this.A = null;
       this.B = null;
       this.C = null;
       this.D = null;
       this.E = null;
       this.H = null;
       Log.i("AryaAudioEngineProxyImp", "init audio engine");
       HandlerThread handlerThrea = new HandlerThread("AryaCallStannis");
       this.g = handlerThrea;
       handlerThrea.start();
       this.h = new Handler(this.g.getLooper());
       this.c = Stannis.getInstance();
       this.p = new HashMap();
       this.q = new HashMap();
       ReentrantReadWriteLock reentrantRea = new ReentrantReadWriteLock();
       this.r = reentrantRea;
       this.s = reentrantRea.readLock();
       this.t = this.r.writeLock();
       this.H = new HashMap();
       this.R();
       reentrantRea = new ReentrantReadWriteLock();
       this.E = reentrantRea;
       this.F = reentrantRea.readLock();
       this.G = this.E.writeLock();
    }
    public static float a(AryaAudioEngineProxyImp p0,float p1){
       p0.x = p1;
       return p1;
    }
    public static int a(AryaAudioEngineProxyImp p0,int p1){
       p0.m = p1;
       return p1;
    }
    public static long a(AryaAudioEngineProxyImp p0){
       return p0.nativeCreateStannisDataReceiver();
    }
    public static long a(AryaAudioEngineProxyImp p0,long p1){
       p0.n = p1;
       return p1;
    }
    public static Context a(AryaAudioEngineProxyImp p0,Context p1){
       p0.y = p1;
       return p1;
    }
    public static AryaAudioEngineProxyImp$b a(AryaAudioEngineProxyImp p0,AryaAudioEngineProxyImp$b p1){
       p0.e = p1;
       return p1;
    }
    public static AryaAudioEngineProxyImp$d a(AryaAudioEngineProxyImp p0,AryaAudioEngineProxyImp$d p1){
       p0.f = p1;
       return p1;
    }
    public static DataReadyObserver a(AryaAudioEngineProxyImp p0,DataReadyObserver p1){
       p0.v = p1;
       return p1;
    }
    public static StannisNotifyObserver a(AryaAudioEngineProxyImp p0,StannisNotifyObserver p1){
       p0.z = p1;
       return p1;
    }
    public static String a(AryaAudioEngineProxyImp p0,String p1){
       p0.u = p1;
       return p1;
    }
    public static void a(AryaAudioEngineProxyImp p0,long p1,long p2){
       p0.nativeStannisDataReceiverAddVoip(p1, p2);
    }
    public static boolean a(AryaAudioEngineProxyImp p0,boolean p1){
       p0.k = p1;
       return p1;
    }
    public static int b(AryaAudioEngineProxyImp p0,int p1){
       p0.l = p1;
       return p1;
    }
    public static int b(AryaAudioEngineProxyImp p0,String p1){
       return p0.k(p1);
    }
    public static long b(AryaAudioEngineProxyImp p0){
       return p0.nativeCreateStannisDataProvider();
    }
    public static long b(AryaAudioEngineProxyImp p0,long p1){
       p0.o = p1;
       return p1;
    }
    public static void b(AryaAudioEngineProxyImp p0,long p1,long p2){
       p0.nativeStannisDataProviderAddVoip(p1, p2);
    }
    public static boolean b(AryaAudioEngineProxyImp p0,boolean p1){
       p0.i = p1;
       return p1;
    }
    public static int c(AryaAudioEngineProxyImp p0,int p1){
       p0.w = p1;
       return p1;
    }
    public static long c(AryaAudioEngineProxyImp p0,long p1){
       p0.d = p1;
       return p1;
    }
    public static HashMap c(AryaAudioEngineProxyImp p0){
       return p0.p;
    }
    public static void c(AryaAudioEngineProxyImp p0,long p1,long p2){
       p0.nativeStannisDataReceiverRemoveVoip(p1, p2);
    }
    public static boolean c(AryaAudioEngineProxyImp p0,boolean p1){
       p0.j = p1;
       return p1;
    }
    public static Handler d(AryaAudioEngineProxyImp p0){
       return p0.h;
    }
    public static void d(AryaAudioEngineProxyImp p0,long p1){
       p0.nativeDestroyStannisDataReceiver(p1);
    }
    public static void d(AryaAudioEngineProxyImp p0,long p1,long p2){
       p0.nativeStannisDataProviderRemoveVoip(p1, p2);
    }
    public static long e(AryaAudioEngineProxyImp p0){
       return p0.d;
    }
    public static void e(AryaAudioEngineProxyImp p0,long p1){
       p0.nativeDestroyStannisDataProvider(p1);
    }
    public static Stannis f(AryaAudioEngineProxyImp p0){
       return p0.c;
    }
    public static StannisNotifyObserver g(AryaAudioEngineProxyImp p0){
       return p0.z;
    }
    public static void h(AryaAudioEngineProxyImp p0){
       p0.T();
    }
    public static HashMap i(AryaAudioEngineProxyImp p0){
       return p0.H;
    }
    public static long j(AryaAudioEngineProxyImp p0){
       return p0.n;
    }
    public static long k(AryaAudioEngineProxyImp p0){
       return p0.o;
    }
    public static boolean l(AryaAudioEngineProxyImp p0){
       return p0.k;
    }
    public static boolean m(AryaAudioEngineProxyImp p0){
       return p0.j;
    }
    public static int n(AryaAudioEngineProxyImp p0){
       return p0.l;
    }
    public static Lock o(AryaAudioEngineProxyImp p0){
       return p0.s;
    }
    public static HashMap p(AryaAudioEngineProxyImp p0){
       return p0.q;
    }
    public static float q(AryaAudioEngineProxyImp p0){
       return p0.x;
    }
    public static Context r(AryaAudioEngineProxyImp p0){
       return p0.y;
    }
    public static boolean s(AryaAudioEngineProxyImp p0){
       return p0.i;
    }
    public static DataReadyObserver t(AryaAudioEngineProxyImp p0){
       return p0.v;
    }
    public static int u(AryaAudioEngineProxyImp p0){
       return p0.w;
    }
    public static void v(AryaAudioEngineProxyImp p0){
       p0.S();
    }
    public static Lock w(AryaAudioEngineProxyImp p0){
       return p0.t;
    }
    public static int x(AryaAudioEngineProxyImp p0){
       return p0.m;
    }
    public static AryaAudioEngineProxyImp$b y(AryaAudioEngineProxyImp p0){
       return p0.e;
    }
    public static AryaAudioEngineProxyImp$d z(AryaAudioEngineProxyImp p0){
       return p0.f;
    }
    public void A(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp.class, "98")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$114(this));
       return;
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp.class, "99")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$116(this));
       return;
    }
    public void C(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp.class, "105")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$122(this));
       return;
    }
    public void D(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp.class, "111")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$127(this));
       return;
    }
    public void E(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp.class, "113")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$129(this));
       return;
    }
    public void F(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp.class, "116")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$132(this));
       return;
    }
    public void G(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp.class, "117")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$133(this));
       return;
    }
    public void H(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp.class, "118")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$3(this));
       return;
    }
    public void I(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp.class, "120")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$4(this));
       return;
    }
    public boolean J(){
       Object obj = PatchProxy.apply(null, this, AryaAudioEngineProxyImp.class, "85");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.c.isSupportHeadphoneMonitor();
    }
    public void K(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp.class, "87")) {
          return;
       }
       this.c.disableHeadphoneMonitor();
       return;
    }
    public void L(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp.class, "123")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$7(this));
       return;
    }
    public boolean M(){
       Object obj = PatchProxy.apply(null, this, AryaAudioEngineProxyImp.class, "127");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.c.isSpeakerOn();
    }
    public void N(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp.class, "153")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$34(this));
       return;
    }
    public void O(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp.class, "154")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$36(this));
       return;
    }
    public void P(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp.class, "155")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$37(this));
       return;
    }
    public float[] Q(){
       Object obj = PatchProxy.apply(null, this, AryaAudioEngineProxyImp.class, "157");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getSongSectionScore();
    }
    public final void R(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp.class, "1")) {
          return;
       }
       String stannisVersi = this.c.getStannisVersion();
       Pattern pattern = Pattern.compile("[A-za-z]*[0-9]+\\.[0-9]+\\.");
       String str = "AryaAudioEngineProxyImp";
       if (pattern != null) {
          Matcher matcher = pattern.matcher(stannisVersi);
          String str1 = (matcher.find())? matcher.group(): stannisVersi;
          Log.i(str, "stannis main version: "+str1);
          if (!("r5.15.0.3.0.88b8d97e8").startsWith(str1)) {
             throw new AssertionError("stannis version not match, expected ver: r5.15.0.3.0.88b8d97e8, runtime ver: "+stannisVersi);
          }
       }else {
          Log.w(str, "stannis version checking, pattern compile failed");
       }
       Log.i(str, "stannis version match, expected version: r5.15.0.3.0.88b8d97e8, runtime ver: "+stannisVersi);
       return;
    }
    public final void S(){
       AryaAudioEngineProxyImp uAryaAudioEn;
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp.class, "12")) {
          return;
       }
       Iterator iterator = this.p.entrySet().iterator();
       while (true) {
          if (iterator.hasNext()) {
             if (iterator.next().getValue().a == null) {
                uAryaAudioEn = null;
             }
          }else {
             uAryaAudioEn = 1;
          }
          if (uAryaAudioEn) {
             this.c.pause();
             this.i = true;
             break ;
          }
          break ;
       }
       return;
    }
    public final void T(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp.class, "164")) {
          return;
       }
       this.G.lock();
       this.C = this.c.getQosInfo(0);
       this.D = this.c.getQosInfo(1);
       this.G.unlock();
       return;
    }
    public Arya$AryaDeviceInfo a(StannisDeviceInfo p0){
       Arya$AryaDeviceInfo obj = PatchProxy.applyOneRefs(p0, this, AryaAudioEngineProxyImp.class, "162");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       obj = new Arya$AryaDeviceInfo();
       obj.id = p0.getId();
       obj.name = p0.getName();
       obj.routeType = p0.getRouteType();
       return obj;
    }
    public final String a(QosInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AryaAudioEngineProxyImp.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "{\"stnsVer\":\""+p0.sdkVersion+"\",\"aScene\":\""+p0.audioScene+"\",\"atxRecSr\":"+p0.audioTxRecordedSampleRate+",\"atxRecCh\":"+p0.audioTxRecordedChannelNum+",\"atxRecItr\":"+p0.audioTxRecordedInterval+",\"atxRecItrMx\":"+p0.audioTxRecordedIntervalMax+",\"atxRecGain\":"+p0.audioTxRecordedGain+",\"atxRecGainMx\":"+p0.audioTxRecordedGainMax+",\"atxRecBytes\":"+p0.audioTxRecordBytes+",\"atx3aGainMx\":"+p0.audioTxAft3aGainMax+",\"atxNearDly\":"+p0.audioTxNearEndDelay+",\"atxNearDlyMx\":"+p0.audioTxNearEndDelayMax+",\"atxStrmBytes\":"+p0.audioTxLiveStreamOutputBytes+",\"atxStrmSr\":"+p0.audioTxLiveStreamSampleRate+",\"atxStrmCh\":"+p0.audioTxLiveStreamChannelNum+",\"atxChatBytes\":"+p0.audioTxLiveChatOutputBytes+",\"atxChatSr\":"+p0.audioTxLiveChatSampleRate+",\"atxChatCh\":"+p0.audioTxLiveChatChannelNum+",\"atxLiveMixBgmInside\":"+p0.audioTxLiveStreamMixBgmInside+",\"atxInputState\":\""+p0.audioTxInputSourceState+"\",\"lMicMute\":"+p0.audioIsLocalMicMuted+",\"aDevHead\":"+p0.audioDeviceConnectHeadphone+",\"aDevBlue\":"+p0.audioDeviceConnectBluetooth+",\"aDevUsb\":"+p0.audioDeviceConnectUSB+",\"aDevIn\":\""+p0.audioDeviceInputPort+"\",\"aDevOut\":\""+p0.audioDeviceOutputPort+"\",\"aDevMod\":\""+p0.audioDeviceMode+"\",\"aDevEffect\":\""+p0.audioEffect+"\",\"aDevVAD\":"+p0.audioVAD+",\"arxInBytes\":"+p0.audioRxInputBytes+",\"arxInSr\":"+p0.audioRxStreamInSampleRate+",\"arxInCh\":"+p0.audioRxStreamInChannelNum+",\"arxPlyGain\":"+p0.audioRxPlaybackGain+",\"arxPlyGainMax\":"+p0.audioRxPlaybackGainMax+",\"arxPlyItr\":"+p0.audioRxPlaybackInterval+",\"arxPlyItrMx\":"+p0.audioRxPlaybackIntervalMax+",\"arxNumber\":"+p0.audioRxNumber+",\"arxSpkDevVol\":\""+p0.audioRxSpkDevVol+"\",\"aHowling\":"+p0.howlingDetected+",\"aAecSoft\":"+p0.audioAecSoft+",\"aAecNlp\":"+p0.audioAecNlp+",\"aAecErle\":\""+p0.audioAecErle+"\",\"aAecHQ\":"+p0.audioAecHQ+",\"aForceAec\":"+p0.audioForceAec+",\"aLtcSet\":"+p0.audioLatencySetting+",\"aLtcBuf\":\""+p0.audioLatencyBuffer+"\",\"aLiteMode\":"+p0.audioLiteMode+"
    ,\"aAgcOn\":"+p0.audioAgcOn+",\"aCommonNS\":"+p0.audioCommonNS+",\"aSnrState\":\""+p0.audioNoiseSnrState+"\"}";
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp.class, "3")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$61(this));
       AryaAudioEngineProxyImp tB = this.B;
       if (tB != null) {
          tB.cancel();
          this.B = null;
       }
       return;
    }
    public void a(float p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uAryaAudioEn, "37")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$56(this, p0));
       return;
    }
    public void a(int p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAryaAudioEn, "17")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$44(this, p0));
       return;
    }
    public void a(int p0,int p1){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uAryaAudioEn, "45")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$66(this, p0, p1));
       return;
    }
    public void a(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(AryaAudioEngineProxyImp.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, AryaAudioEngineProxyImp.class, "144")) {
          return;
       }
       AryaAudioEngineProxyImp$27 u27 = new AryaAudioEngineProxyImp$27(this, p0, p1, p2, p3);
       this.h.post(v7);
       return;
    }
    public void a(int p0,a$a p1,int p2){
       if (PatchProxy.isSupport(AryaAudioEngineProxyImp.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Integer.valueOf(p2), this, AryaAudioEngineProxyImp.class, "11")) {
          return;
       }
       Log.i("AryaAudioEngineProxyImp", "start "+p1);
       this.h.post(new AryaAudioEngineProxyImp$13(this, p1, p0));
       return;
    }
    public void a(int p0,a$a p1,int p2,int p3,String p4){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,Integer.valueOf(p2),Integer.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, this, uAryaAudioEn, "14")) {
             return;
          }
       }
       this.a(p0, p1, p2, p3, p4, false, false, 0);
       return;
    }
    public void a(int p0,a$a p1,int p2,int p3,String p4,boolean p5,int p6){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,Integer.valueOf(p2),Integer.valueOf(p3),p4,Boolean.valueOf(p5),Integer.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, this, uAryaAudioEn, "15")) {
             return;
          }
       }else {
          int i = this;
       }
       this.a(p0, p1, p2, p3, p4, true, p5, p6);
       return;
    }
    public final void a(int p0,a$a p1,int p2,int p3,String p4,boolean p5,boolean p6,int p7){
       AryaAudioEngineProxyImp uAryaAudioEn = this;
       AryaAudioEngineProxyImp uAryaAudioEn1 = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn1)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,Integer.valueOf(p2),Integer.valueOf(p3),p4,Boolean.valueOf(p5),Boolean.valueOf(p6),Integer.valueOf(p7)};
          if (PatchProxy.applyVoid(objArray, this, uAryaAudioEn1, "16")) {
             return;
          }
       }
       AryaAudioEngineProxyImp$35 u35 = new AryaAudioEngineProxyImp$35(this, p2, p3, p4, p0, p5, p6, p7);
       uAryaAudioEn.h.post(v11);
       return;
    }
    public void a(int p0,boolean p1){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, uAryaAudioEn, "138")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$20(this, p0, p1));
       return;
    }
    public void a(int p0,byte[] p1,int p2,int p3,int p4,long p5){
       AryaAudioEngineProxyImp uAryaAudioEn = this;
       AryaAudioEngineProxyImp uAryaAudioEn1 = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn1)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Long.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, uAryaAudioEn1, "126")) {
             return;
          }
       }
       AryaAudioEngineProxyImp$10 u10 = new AryaAudioEngineProxyImp$10(this, p0, p1, p2, p3, p4, p5);
       uAryaAudioEn.h.post(v11);
       return;
    }
    public void a(int p0,byte[] p1,long p2){
       if (PatchProxy.isSupport(AryaAudioEngineProxyImp.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Long.valueOf(p2), this, AryaAudioEngineProxyImp.class, "152")) {
          return;
       }
       AryaAudioEngineProxyImp$33 u33 = new AryaAudioEngineProxyImp$33(this, p0, p1, p2);
       this.h.post(v7);
       return;
    }
    public void a(long p0,String p1,String p2,String p3,String p4,String p5,int p6,int p7,a$c p8){
       AryaAudioEngineProxyImp uAryaAudioEn = this;
       object oobject = p2;
       object oobject1 = p8;
       AryaAudioEngineProxyImp uAryaAudioEn1 = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn1)) {
          Object[] objArray = new Object[9];
          objArray[0] = Long.valueOf(p0);
          objArray[1] = p1;
          objArray[2] = oobject;
          objArray[3] = p3;
          objArray[4] = p4;
          objArray[5] = p5;
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = oobject1;
          if (PatchProxy.applyVoid(objArray, this, uAryaAudioEn1, "92")) {
             return;
          }
       }
       AryaAudioEngineProxyImp$112 u112 = new AryaAudioEngineProxyImp$112(this, p0, p1, p2, p3, p4, p5, p6, p7, new AryaAudioEngineProxyImp$111(this, oobject1, oobject));
       uAryaAudioEn.h.post(v14);
       return;
    }
    public void a(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AryaAudioEngineProxyImp.class, "2")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$1(this, p0));
       if (this.B == null) {
          Timer timer = new Timer();
          this.B = timer;
          timer.schedule(new AryaAudioEngineProxyImp$50(this), 2, 2000);
       }
       return;
    }
    public void a(Arya$AryaAudioDeviceStatusListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AryaAudioEngineProxyImp.class, "43")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$63(this, p0));
       return;
    }
    public void a(Arya$AryaAudioRouteListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AryaAudioEngineProxyImp.class, "72")) {
          return;
       }
       if (p0 == null) {
          this.c.setAudioRouteListener(null);
       }else {
          this.c.setAudioRouteListener(new AryaAudioEngineProxyImp$92(this, p0));
       }
       return;
    }
    public void a(Arya$AryaConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AryaAudioEngineProxyImp.class, "7")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$104(this, p0));
       return;
    }
    public void a(AryaContext p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AryaAudioEngineProxyImp.class, "109")) {
          return;
       }
       Log.i("AryaAudioEngineProxyImp", "reconfig");
       this.h.post(new AryaAudioEngineProxyImp$125(this, p0));
       return;
    }
    public void a(AudioServerConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AryaAudioEngineProxyImp.class, "10")) {
          return;
       }
       this.x(p0.liveStreamStereo);
       this.h.post(new AryaAudioEngineProxyImp$2(this, p0));
       return;
    }
    public void a(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AryaAudioEngineProxyImp.class, "13")) {
          return;
       }
       Log.i("AryaAudioEngineProxyImp", "stop "+p0);
       this.h.post(new AryaAudioEngineProxyImp$24(this, p0));
       return;
    }
    public void a(AryaRawAudioFrameObserver p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AryaAudioEngineProxyImp.class, "143")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$26(this, p0));
       return;
    }
    public void a(AudioSceneObserver p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AryaAudioEngineProxyImp.class, "66")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$87(this, p0));
       return;
    }
    public void a(RawAudioObserver p0,int p1){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uAryaAudioEn, "110")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$126(this, p0, p1));
       return;
    }
    public void a(DataReadyObserver p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AryaAudioEngineProxyImp.class, "122")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$6(this, p0));
       return;
    }
    public void a(String p0){
       String str1;
       String str = "dump_path";
       if (PatchProxy.applyVoidOneRefs(p0, this, AryaAudioEngineProxyImp.class, "6")) {
          return;
       }
       Log.i("AryaAudioEngineProxyImp", "setParameters");
       int i = 0;
       try{
          int i1 = 0;
          JSONObject jSONObject = new JSONObject(p0);
          if (jSONObject.has("dump_flag")) {
             i = jSONObject.getInt("dump_flag");
          label_0027 :
             if (jSONObject.has(str)) {
                str1 = jSONObject.getString(str);
             }
             Log.i("AryaAudioEngineProxyImp", "setParameters update dumpFlag : "+i+" path : "+str1);
             if (i && (!TextUtils.isEmpty(str1) && b.a(str1))) {
                this.h.post(new AryaAudioEngineProxyImp$94(this, i, str1));
             }
          }else {
             goto label_0027 ;
          }
       }catch(org.json.JSONException e7){
          Log.w("AryaAudioEngineProxyImp", "setParameters parse failed! "+e7.toString());
          e7.printStackTrace();
       }
       return;
    }
    public void a(String p0,float p1){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, uAryaAudioEn, "35")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$54(this, p0, p1));
       return;
    }
    public void a(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AryaAudioEngineProxyImp.class, "81")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$102(this, p0, new AryaAudioEngineProxyImp$101(this, p1)));
       return;
    }
    public void a(String p0,String p1,AudioSegmentPlayerObserver p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, AryaAudioEngineProxyImp.class, "89")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$108(this, p0, p1, p2));
       return;
    }
    public void a(String p0,boolean p1,float p2){
       if (PatchProxy.isSupport(AryaAudioEngineProxyImp.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Float.valueOf(p2), this, AryaAudioEngineProxyImp.class, "135")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$17(this, p0, p1, p2));
       return;
    }
    public void a(String p0,byte[] p1,float p2,boolean p3,AudioBufferPlayObserver p4){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn)) {
          Object[] objArray = new Object[]{p0,p1,Float.valueOf(p2),Boolean.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, this, uAryaAudioEn, "112")) {
             return;
          }
       }
       AryaAudioEngineProxyImp$128 u128 = new AryaAudioEngineProxyImp$128(this, p0, p1, p2, p3, p4);
       this.h.post(v8);
       return;
    }
    public void a(ArrayList p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AryaAudioEngineProxyImp.class, "136")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$18(this, p0));
       return;
    }
    public void a(ArrayList p0,ArrayList p1,boolean p2,int p3,a$b p4){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Integer.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, this, uAryaAudioEn, "44")) {
             return;
          }
       }
       AryaAudioEngineProxyImp$65 u65 = new AryaAudioEngineProxyImp$65(this, p0, p2, p3, new AryaAudioEngineProxyImp$64(this, p4), p1);
       this.h.post(uAryaAudioEn);
       return;
    }
    public void a(boolean p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAryaAudioEn, "8")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$115(this, p0));
       return;
    }
    public void a(boolean p0,int p1,int p2){
       if (PatchProxy.isSupport(AryaAudioEngineProxyImp.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, AryaAudioEngineProxyImp.class, "160")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$41(this, p0, p1, p2));
       return;
    }
    public void a(boolean p0,Stannis$KWStannisAudioEffectParam p1){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uAryaAudioEn, "150")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$31(this, p0, p1));
       return;
    }
    public void a(boolean p0,String p1){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uAryaAudioEn, "54")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$76(this, p0, p1));
       return;
    }
    public void a(boolean p0,boolean p1){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uAryaAudioEn, "42")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$62(this, p0, p1));
       return;
    }
    public void a(byte[] p0,int p1,int p2,int p3,long p4){
       AryaAudioEngineProxyImp uAryaAudioEn = this;
       AryaAudioEngineProxyImp uAryaAudioEn1 = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn1)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Long.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uAryaAudioEn1, "65")) {
             return;
          }
       }
       AryaAudioEngineProxyImp$86 u86 = new AryaAudioEngineProxyImp$86(this, p0, p1, p2, p3, p4);
       uAryaAudioEn.h.post(v10);
       return;
    }
    public void a(int[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AryaAudioEngineProxyImp.class, "156")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$38(this, p0));
       return;
    }
    public void a(int[] p0,float[] p1,float[] p2,float[] p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, AryaAudioEngineProxyImp.class, "140")) {
          return;
       }
       AryaAudioEngineProxyImp$22 u22 = new AryaAudioEngineProxyImp$22(this, p0, p1, p2, p3);
       this.h.post(v7);
       return;
    }
    public boolean a(MediaProjection p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AryaAudioEngineProxyImp.class, "148");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.c.startAudioInnerCap(p0);
    }
    public Arya$AryaDeviceInfo[] a(StannisDeviceInfo[] p0){
       Arya$AryaDeviceInfo[] obj = PatchProxy.applyOneRefs(p0, this, AryaAudioEngineProxyImp.class, "163");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       obj = new Arya$AryaDeviceInfo[p0.length];
       for (int i = 0; i != p0.length; i = i + 1) {
          obj[i] = this.a(p0[i]);
       }
       return obj;
    }
    public int b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AryaAudioEngineProxyImp.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.c.getVoiceEnergy(this.k(p0));
    }
    public String b(int p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uAryaAudioEn, "26");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.D == null || this.C == null) {
          this.T();
       }
       this.F.lock();
       String str = (p0 == 1)? this.a(this.D): this.a(this.C);
       this.F.unlock();
       return str;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp.class, "4")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$72(this));
       return;
    }
    public void b(float p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uAryaAudioEn, "102")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$119(this, p0));
       return;
    }
    public void b(int p0,int p1){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uAryaAudioEn, "141")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$23(this, p0, p1));
       return;
    }
    public void b(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(AryaAudioEngineProxyImp.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, AryaAudioEngineProxyImp.class, "145")) {
          return;
       }
       AryaAudioEngineProxyImp$28 u28 = new AryaAudioEngineProxyImp$28(this, p0, p1, p2, p3);
       this.h.post(v7);
       return;
    }
    public void b(int p0,boolean p1){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, uAryaAudioEn, "139")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$21(this, p0, p1));
       return;
    }
    public void b(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AryaAudioEngineProxyImp.class, "18")) {
          return;
       }
       Log.i("AryaAudioEngineProxyImp", "pause "+p0);
       this.h.post(new AryaAudioEngineProxyImp$45(this, p0));
       return;
    }
    public void b(AudioSceneObserver p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AryaAudioEngineProxyImp.class, "67")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$88(this, p0));
       return;
    }
    public void b(boolean p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAryaAudioEn, "36")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$55(this, p0));
       return;
    }
    public void b(boolean p0,String p1){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uAryaAudioEn, "56")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$78(this, p0, p1));
       return;
    }
    public void b(byte[] p0,int p1,int p2,int p3,long p4){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Long.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uAryaAudioEn, "108")) {
             return;
          }
       }
       this.c.inputRawAudio(p0, p1, p2, p3, p4);
       return;
    }
    public AryaAudioConfigQosInfo c(int p0){
       String str;
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uAryaAudioEn, "28");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.A == null) {
          this.A = new AryaAudioConfigQosInfo();
       }
       if (this.D == null || this.C == null) {
          this.T();
       }
       this.F.lock();
       int i = 1;
       AryaAudioEngineProxyImp tD = (p0 == i)? this.D: this.C;
       AryaAudioEngineProxyImp tA = this.A;
       tA.captureVolume = tD.audioTxRecordedGainMax;
       tA.agcGainVolume = tD.audioTxAft3aGainMax;
       tA.playbackVolume = tD.audioRxPlaybackGainMax;
       int b = (!tD.audioAgcOn - 1)? true: false;
       tA.enableAGC = b;
       if ((tD.audioDeviceMode).length() > i) {
          String[] stringArray = (tD.audioDeviceMode).split(" ");
          b = stringArray.length - i;
          while (true) {
             if (b >= 0) {
                if ((stringArray[b]).contains("userset")) {
                   str = (stringArray[b]).substring(((stringArray[b]).length() - i));
                }else {
                   b = b - 1;
                }
             }else {
                str = "";
             }
          }
       }else {
          str = tD.audioDeviceMode;
       }
       this.A.audioDeviceMode = str;
       if ((tD.audioTxInputSourceState).equals("NO_INPUT")) {
          this.A.audio_input_state = 0;
       }else if((tD.audioTxInputSourceState).equals("ZERO_INPUT")){
          this.A.audio_input_state = 1;
       }else if((tD.audioTxInputSourceState).equals("NON_ZERO_INPUT")){
          this.A.audio_input_state = 2;
       }else {
          this.A.audio_input_state = 255;
       }
       tA = this.A;
       tA.audioDeviceConnectHeadphone = tD.audioDeviceConnectHeadphone;
       tA.audioDeviceConnectBluetooth = tD.audioDeviceConnectBluetooth;
       tA.audioDeviceConnectUSB = tD.audioDeviceConnectUSB;
       tA.audioDeviceInputPort = tD.audioDeviceInputPort;
       tA.audioDeviceOutputPort = tD.audioDeviceOutputPort;
       tA.inputSourceState = tD.audioTxInputSourceState;
       tA.recordedGain = tD.audioTxRecordedGain;
       tA.recordedInterval = tD.audioTxRecordedInterval;
       tA.recordedIntervalMax = tD.audioTxRecordedIntervalMax;
       tA.audioEffect = tD.audioEffect;
       if (tD.audioVAD - 1) {
          i = false;
       }
       tA.enableVAD = i;
       tA.nearEndDelay = tD.audioTxNearEndDelay;
       tA.nearEndDelayMax = tD.audioTxNearEndDelayMax;
       tA.playbackGain = tD.audioRxPlaybackGain;
       tA.playbackInterval = tD.audioRxPlaybackInterval;
       tA.playbackIntervalMax = tD.audioRxPlaybackIntervalMax;
       tA.micphoneVolume = (long)this.c.getStannisMicrophoneInfo().getSysVolume();
       this.A.speakerVolume = (long)this.c.getSpeakerDeviceVolume();
       uAryaAudioEn = this.A;
       uAryaAudioEn.audioInputVolume = tD.audioInputVolume;
       uAryaAudioEn.audioBgmLocalVolume = tD.audioBgmLocalVolume;
       uAryaAudioEn.audioBgmRemoteVolume = tD.audioBgmRemoteVolume;
       this.F.unlock();
       return this.A;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp.class, "5")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$83(this));
       return;
    }
    public void c(float p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uAryaAudioEn, "34")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$53(this, p0));
       return;
    }
    public void c(int p0,int p1){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uAryaAudioEn, "146")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$29(this, p0, p1));
       return;
    }
    public void c(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(AryaAudioEngineProxyImp.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, AryaAudioEngineProxyImp.class, "147")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$30(this));
       return;
    }
    public void c(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AryaAudioEngineProxyImp.class, "19")) {
          return;
       }
       Log.i("AryaAudioEngineProxyImp", "resume "+p0);
       this.h.post(new AryaAudioEngineProxyImp$46(this, p0));
       return;
    }
    public void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AryaAudioEngineProxyImp.class, "57")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$79(this, p0));
       return;
    }
    public void c(boolean p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAryaAudioEn, "38")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$57(this, p0));
       return;
    }
    public void c(byte[] p0,int p1,int p2,int p3,long p4){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Long.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uAryaAudioEn, "119")) {
             return;
          }
       }
       this.c.inputPcmPlay(p0, p1, p2, p3, p4);
       return;
    }
    public int d(){
       Object obj = PatchProxy.apply(null, this, AryaAudioEngineProxyImp.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ThreadUtils.invokeAtFrontUninterruptibly(this.h, new AryaAudioEngineProxyImp$47(this)).intValue();
    }
    public void d(float p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uAryaAudioEn, "74")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$93(this, p0));
       return;
    }
    public void d(int p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAryaAudioEn, "30")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$48(this, p0));
       return;
    }
    public void d(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AryaAudioEngineProxyImp.class, "59")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$81(this));
       return;
    }
    public void d(boolean p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAryaAudioEn, "39")) {
          return;
       }
       Log.i("AryaAudioEngineProxyImp", "setEnableRecording:"+p0);
       this.h.post(new AryaAudioEngineProxyImp$58(this, p0));
       return;
    }
    public void e(float p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uAryaAudioEn, "70")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$91(this, p0));
       return;
    }
    public void e(int p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAryaAudioEn, "31")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$49(this, p0));
       return;
    }
    public void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AryaAudioEngineProxyImp.class, "68")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$89(this, p0));
       return;
    }
    public void e(boolean p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAryaAudioEn, "40")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$59(this, p0));
       return;
    }
    public String[] e(){
       ArrayList obj = PatchProxy.apply(null, this, AryaAudioEngineProxyImp.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       int[] activeSpeake = this.c.getActiveSpeakers();
       this.s.lock();
       int len = activeSpeake.length;
       int i = 0;
       while (i < len) {
          int i1 = activeSpeake[i];
          if (!i1 || i1 == 1) {
             obj.add(this.u);
          }else {
             AryaAudioEngineProxyImp$a uoa = this.q.get(Integer.valueOf(i1));
             if (uoa != null) {
                obj.add(uoa.c);
             }
          }
          i = i + 1;
       }
       this.s.unlock();
       String[] stringArray = new String[0];
       return obj.toArray(stringArray);
    }
    public int f(){
       Object obj = PatchProxy.apply(null, this, AryaAudioEngineProxyImp.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.c.getSpeakerDeviceVolume();
    }
    public void f(float p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uAryaAudioEn, "50")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$71(this, p0));
       return;
    }
    public void f(int p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAryaAudioEn, "32")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$51(this, p0));
       return;
    }
    public void f(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AryaAudioEngineProxyImp.class, "79")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$99(this, p0));
       return;
    }
    public void f(boolean p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAryaAudioEn, "101")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$118(this, p0));
       return;
    }
    public String g(){
       Object obj = PatchProxy.apply(null, this, AryaAudioEngineProxyImp.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getTips();
    }
    public void g(float p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uAryaAudioEn, "51")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$73(this, p0));
       return;
    }
    public void g(int p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAryaAudioEn, "33")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$52(this, p0));
       return;
    }
    public void g(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AryaAudioEngineProxyImp.class, "104")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$121(this, p0));
       return;
    }
    public void g(boolean p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAryaAudioEn, "103")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$120(this, p0));
       return;
    }
    public String h(){
       Object obj = PatchProxy.apply(null, this, AryaAudioEngineProxyImp.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getStannisVersion();
    }
    public void h(float p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uAryaAudioEn, "83")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$105(this, p0));
       return;
    }
    public void h(int p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAryaAudioEn, "100")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$117(this, p0));
       return;
    }
    public void h(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AryaAudioEngineProxyImp.class, "115")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$131(this, p0));
       return;
    }
    public void h(boolean p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAryaAudioEn, "41")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$60(this, p0));
       return;
    }
    public void i(float p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uAryaAudioEn, "121")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$5(this, p0));
       return;
    }
    public void i(int p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAryaAudioEn, "55")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$77(this, p0));
       return;
    }
    public void i(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AryaAudioEngineProxyImp.class, "142")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$25(this, p0));
       return;
    }
    public void i(boolean p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAryaAudioEn, "53")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$75(this, p0));
       return;
    }
    public boolean i(){
       return true;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp.class, "149")) {
          return;
       }
       this.c.stopInnerCap();
       return;
    }
    public void j(float p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uAryaAudioEn, "151")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$32(this, p0));
       return;
    }
    public void j(int p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAryaAudioEn, "60")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$82(this, p0));
       return;
    }
    public void j(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AryaAudioEngineProxyImp.class, "158")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$39(this, p0));
       return;
    }
    public void j(boolean p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAryaAudioEn, "58")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$80(this, p0));
       return;
    }
    public int k(){
       Object obj = PatchProxy.apply(null, this, AryaAudioEngineProxyImp.class, "61");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.c.getOutputType();
    }
    public final int k(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AryaAudioEngineProxyImp.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       this.s.lock();
       Iterator iterator = this.q.keySet().iterator();
       while (iterator.hasNext()) {
          int i1 = iterator.next().intValue();
          if (this.q.get(Integer.valueOf(i1)).c == p0) {
             i = i1;
             break ;
          }
       }
       this.s.unlock();
       return i;
    }
    public void k(int p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAryaAudioEn, "64")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$85(this, p0));
       return;
    }
    public void k(boolean p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAryaAudioEn, "63")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$84(this, p0));
       return;
    }
    public void l(int p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAryaAudioEn, "75")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$95(this, p0));
       return;
    }
    public void l(boolean p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAryaAudioEn, "69")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$90(this, p0));
       return;
    }
    public int[] l(){
       Object obj = PatchProxy.apply(null, this, AryaAudioEngineProxyImp.class, "62");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getOutputTypes();
    }
    public int m(){
       Object obj = PatchProxy.apply(null, this, AryaAudioEngineProxyImp.class, "71");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.c.getAudioOutputRouting();
    }
    public void m(int p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAryaAudioEn, "76")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$96(this, p0));
       return;
    }
    public void m(boolean p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAryaAudioEn, "52")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$74(this, p0));
       return;
    }
    public Arya$AryaMicrophoneInfo n(){
       MicrophoneInfo obj = PatchProxy.apply(null, this, AryaAudioEngineProxyImp.class, "73");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c.getStannisMicrophoneInfo();
       Arya$AryaMicrophoneInfo uAryaMicroph = new Arya$AryaMicrophoneInfo();
       uAryaMicroph.mute = obj.isMute();
       uAryaMicroph.energy = obj.getEnergy();
       uAryaMicroph.vad = obj.getVad();
       uAryaMicroph.sysVolume = obj.getSysVolume();
       uAryaMicroph.suggestedSysVolume = obj.getSuggestedSysVolume();
       return uAryaMicroph;
    }
    public void n(int p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAryaAudioEn, "78")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$98(this, p0));
       return;
    }
    public void n(boolean p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAryaAudioEn, "84")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$106(this, p0));
       return;
    }
    public native final long nativeCreateStannisDataProvider();
    public native final long nativeCreateStannisDataReceiver();
    public native final void nativeDestroyStannisDataProvider(long p0);
    public native final void nativeDestroyStannisDataReceiver(long p0);
    public native final void nativeStannisDataProviderAddVoip(long p0,long p1);
    public native final void nativeStannisDataProviderRemoveVoip(long p0,long p1);
    public native final void nativeStannisDataReceiverAddVoip(long p0,long p1);
    public native final void nativeStannisDataReceiverRemoveVoip(long p0,long p1);
    public void o(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp.class, "46")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$67(this));
       return;
    }
    public void o(boolean p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAryaAudioEn, "91")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$110(this, p0));
       return;
    }
    public boolean o(int p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uAryaAudioEn, "97");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.c.setKaraokeScorePitch(p0);
    }
    public List p(int p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uAryaAudioEn, "106");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.c.getKaraokeVadDurationResult(p0);
    }
    public void p(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp.class, "47")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$68(this));
       return;
    }
    public void p(boolean p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAryaAudioEn, "107")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$124(this, p0));
       return;
    }
    public void q(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp.class, "48")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$69(this));
       return;
    }
    public void q(int p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAryaAudioEn, "124")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$8(this, p0));
       return;
    }
    public void q(boolean p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAryaAudioEn, "114")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$130(this, p0));
       return;
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp.class, "49")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$70(this));
       return;
    }
    public void r(int p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAryaAudioEn, "125")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$9(this, p0));
       return;
    }
    public boolean r(boolean p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uAryaAudioEn, "86");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.c.enableHeadphoneMonitor(p0);
    }
    public void s(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp.class, "77")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$97(this));
       return;
    }
    public void s(int p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAryaAudioEn, "128")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$11(this, p0));
       return;
    }
    public void s(boolean p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAryaAudioEn, "88")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$107(this, p0));
       return;
    }
    public void t(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp.class, "80")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$100(this));
       return;
    }
    public void t(int p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAryaAudioEn, "129")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$12(this, p0));
       return;
    }
    public void t(boolean p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAryaAudioEn, "134")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$16(this, p0));
       return;
    }
    public void u(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp.class, "82")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$103(this));
       return;
    }
    public void u(int p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAryaAudioEn, "130")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$14(this, p0));
       return;
    }
    public void u(boolean p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAryaAudioEn, "137")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$19(this, p0));
       return;
    }
    public void v(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp.class, "90")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$109(this));
       return;
    }
    public void v(int p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uAryaAudioEn, "131")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$15(this, p0));
       return;
    }
    public void v(boolean p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAryaAudioEn, "159")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$40(this, p0));
       return;
    }
    public Arya$AryaDeviceInfo w(int p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uAryaAudioEn, "132");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.a(this.c.getCurrentDevice(p0));
    }
    public void w(){
       if (PatchProxy.applyVoid(null, this, AryaAudioEngineProxyImp.class, "93")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$113(this));
       return;
    }
    public void w(boolean p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAryaAudioEn, "161")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$42(this, p0));
       return;
    }
    public int x(){
       Object obj = PatchProxy.apply(null, this, AryaAudioEngineProxyImp.class, "94");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.c.getKaraokeTotalScore();
    }
    public void x(boolean p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAryaAudioEn, "9")) {
          return;
       }
       this.h.post(new AryaAudioEngineProxyImp$123(this, p0));
       return;
    }
    public Arya$AryaDeviceInfo[] x(int p0){
       AryaAudioEngineProxyImp uAryaAudioEn = AryaAudioEngineProxyImp.class;
       if (PatchProxy.isSupport(uAryaAudioEn)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uAryaAudioEn, "133");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.a(this.c.getDevices(p0));
    }
    public int y(){
       Object obj = PatchProxy.apply(null, this, AryaAudioEngineProxyImp.class, "95");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.c.getKaraokeScorePitch();
    }
    public int z(){
       Object obj = PatchProxy.apply(null, this, AryaAudioEngineProxyImp.class, "96");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.c.getKaraokeAverageScore();
    }
}
