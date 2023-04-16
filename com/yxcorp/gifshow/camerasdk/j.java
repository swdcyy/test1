package com.yxcorp.gifshow.camerasdk.j;
import ui9.h;
import com.yxcorp.gifshow.camerasdk.q;
import cj9.a;
import android.content.Context;
import qi9.f1;
import com.yxcorp.gifshow.camerasdk.j$r;
import java.lang.String;
import com.yxcorp.gifshow.camerasdk.magicface.a;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import com.yxcorp.gifshow.camerasdk.d;
import com.yxcorp.gifshow.camerasdk.e;
import com.kwai.camerasdk.models.Business;
import java.lang.Object;
import si9.c;
import com.yxcorp.gifshow.camerasdk.j$g;
import com.yxcorp.gifshow.camerasdk.j$h;
import com.yxcorp.gifshow.camerasdk.j$i;
import com.yxcorp.gifshow.camerasdk.i;
import qi9.q1;
import q87.c;
import qi9.b1;
import qi9.i1;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.os.HandlerThread;
import android.os.Looper;
import java.lang.Thread;
import android.os.Handler;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.camerasdk.r;
import android.app.Application;
import o56.a;
import com.yxcorp.gifshow.util.PermissionUtils;
import com.kwai.camerasdk.videoCapture.CameraController;
import qi9.c;
import qi9.g1;
import com.kwai.camerasdk.Daenerys$LogParam;
import com.yxcorp.gifshow.camerasdk.l;
import com.kwai.camerasdk.Daenerys;
import com.kwai.video.westeros.Westeros;
import qi9.d;
import com.kwai.video.westeros.v2.ycnn.YcnnSoLoader;
import xf6.g;
import com.kwai.video.westeros.v2.faceless.FacelessPlugin;
import com.kwai.camerasdk.models.Page;
import com.yxcorp.gifshow.media.model.CameraConfig;
import cj9.b;
import com.yxcorp.gifshow.camerasdk.g;
import org.wysaid.nativePort.CGEEventLogger$ILogger;
import org.wysaid.nativePort.CGEEventLogger;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.westeros.WesterosPlugin;
import zi9.f;
import com.kwai.video.westeros.v2.yar.YarPlugin;
import com.kwai.camerasdk.FrameRateAdapterCallback;
import java.lang.Boolean;
import com.yxcorp.gifshow.camerasdk.recorder.b;
import aj9.d;
import java.util.List;
import ui9.k;
import com.yxcorp.gifshow.util.resource.MagicEmojiResourceHelper;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.camerasdk.magicface.b;
import qi9.i0;
import qi9.p1;
import ui9.f;
import qi9.z;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.camerasdk.recorder.a;
import java.lang.Integer;
import java.nio.ByteBuffer;
import java.nio.Buffer;
import com.kwai.camerasdk.videoCapture.FrameBuffer;
import java.util.concurrent.TimeUnit;
import java.lang.System;
import com.kwai.camerasdk.video.VideoFrame;
import com.kwai.camerasdk.DaenerysLayoutManager;
import com.kwai.camerasdk.models.SubLayoutIndex;
import qi9.n;
import v16.b;
import j65.c;
import j65.g;
import ui9.j;
import qi9.a0;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import si9.b;
import kuaishou.perf.page.impl.d;
import com.kwai.camerasdk.face.FaceDetectorContext;
import com.yxcorp.gifshow.camerasdk.j$k;
import com.kwai.camerasdk.stats.StatsListener;
import com.kwai.camerasdk.stats.StatsHolder;
import brd.a0;
import t45.d;
import brd.z;
import qi9.h;
import com.yxcorp.gifshow.camerasdk.b;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import java.util.Collection;
import ekd.q;
import j8c.b;
import java.util.Iterator;
import xi9.n;
import m65.f;
import qi9.v;
import qi9.w;
import qi9.f;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicRecordingControlListener;
import qi9.x;
import ui9.f$d;
import qi9.t;
import java.lang.Float;
import e65.a;
import com.kwai.camerasdk.models.FaceDetectConfig;
import com.kwai.camerasdk.models.FaceDetectConfig$b;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.yxcorp.gifshow.media.model.CameraPageConfig;
import com.yxcorp.gifshow.camerasdk.stability.StabilityType;
import com.kwai.camerasdk.models.CameraApiVersion;
import com.kwai.camerasdk.models.DaenerysCaptureStabilizationMode;
import com.kwai.camerasdk.models.CameraStreamType;
import qi9.g0;
import com.yxcorp.gifshow.camerasdk.j$p;
import com.kwai.camerasdk.log.Log;
import java.lang.ref.WeakReference;
import com.kwai.camerasdk.a;
import i65.b;
import i65.c;
import j65.h;
import b65.m;
import com.kwai.camerasdk.models.DaenerysCaptureConfig;
import com.kwai.video.westeros.v2.ycnn.YcnnPlugin;
import com.kwai.camerasdk.render.VideoTextureView;
import com.kwai.camerasdk.render.VideoViewListener;
import lnc.a1;
import qi9.q;
import qi9.u1;
import com.kwai.video.westeros.v2.ycnn.YcnnPlugin$OnYcnnGeneralRecogDetectionListener;
import com.yxcorp.gifshow.camerasdk.h;
import qi9.r;
import xi9.b;
import java.util.Map;
import qi9.b;
import qi9.t1;
import ri9.a;
import com.kwai.camerasdk.audioCapture.AudioController;
import com.kwai.camerasdk.videoCapture.cameras.FlashController$FlashMode;
import com.kwai.camerasdk.videoCapture.cameras.FlashController;
import com.kwai.camerasdk.mediarecorder.MediaRecorderImpl;
import com.kwai.video.westeros.models.FeatureType;
import qi9.g;
import com.kwai.video.westeros.Westeros$OnLowLightDetectionListener;
import com.kwai.video.westeros.v2.faceless.FaceMagicController;
import com.kwai.camerasdk.videoCapture.CameraController$CameraState;
import zi9.f$a;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicLoadEffectFailedListener;
import com.kwai.video.westeros.Westeros$OnWesterosEventListener;
import com.kwai.camerasdk.face.FaceDetectorContext$b;
import com.kwai.camerasdk.models.VideoSourceLayout;
import com.google.protobuf.AbstractMessageLite;
import com.kwai.video.westeros.v2.ykitplugin.YKitPlugin;
import com.kwai.video.westeros.mmuplugin.MmuPlugin;
import qi9.h0;
import com.yxcorp.gifshow.camerasdk.TakePictureSource;
import com.yxcorp.gifshow.camerasdk.j$f;
import java.lang.Enum;
import qi9.p;
import xo4.a;
import com.kwai.video.westeros.models.RecordSubBusiness;
import qi9.o1;
import com.yxcorp.gifshow.camerasdk.j$a;
import com.kwai.camerasdk.models.DataExtractType;
import com.kwai.camerasdk.models.DataExtractTriggerMode;
import com.kwai.camerasdk.preprocess.DataExtractProcessor;
import com.kwai.camerasdk.models.GlProcessorGroup;
import l65.a;
import gxc.c;
import android.graphics.RectF;
import com.kwai.plugin.dva.Dva;
import com.kwai.video.westeros.customplugin.CustomPlugin;
import com.kwai.video.westeros.models.ResourceType;
import qi9.k1;
import com.kwai.video.westeros.processors.WesterosFrameAttributesDumpProcessor;
import com.yxcorp.gifshow.camerasdk.n;
import com.kwai.video.westeros.processors.WesterosFrameAttributesDumpProcessor$OnFacesArrayListener;
import com.yxcorp.gifshow.camerasdk.p;
import com.yxcorp.gifshow.camerasdk.o;
import com.kwai.camerasdk.preprocess.AudioProcessor;
import b65.f;
import yi9.a;
import android.os.SystemClock;
import com.kwai.camerasdk.preprocess.CropAndFlipProcessor;
import qr4.i;
import qr4.k$j;
import v16.a;
import j65.d;
import com.kwai.camerasdk.models.RecordMode;
import java.lang.Number;
import java.lang.Math;
import com.kwai.sdk.switchconfig.a;
import j65.e;
import java.lang.AssertionError;
import java.util.HashMap;
import m65.g;
import com.kwai.camerasdk.c;
import com.kwai.camerasdk.preprocess.DynamicExtractFrameProcessor;
import qi9.j;
import qi9.s1;
import com.kwai.camerasdk.videoCapture.CameraController$d;
import o56.c;
import org.wysaid.nativePort.CGEAlertBoxUtil$CGEAlertBoxListener;
import org.wysaid.nativePort.CGEAlertBoxUtil;
import com.kwai.camerasdk.render.VideoSurfaceView;
import com.kwai.video.westeros.WesterosStatsListener;
import qi9.d0;
import com.kwai.camerasdk.render.OpengGL.EglBase;
import com.yxcorp.gifshow.util.resource.Category;
import boc.b;
import com.kwai.camerasdk.a$e;
import com.kwai.camerasdk.models.DisplayLayout;
import com.kwai.camerasdk.models.CaptureImageMode;
import p65.b;
import com.kwai.camerasdk.ErrorCode$Result;
import com.yxcorp.gifshow.camerasdk.c;
import qi9.u;
import p65.g;
import com.kwai.camerasdk.models.TakePictureStats;
import qi9.a;
import android.graphics.Bitmap;
import p65.d;
import qi9.p0;
import qi9.n0;
import com.kwai.camerasdk.videoCapture.cameras.AFAEController;
import com.kwai.camerasdk.videoCapture.cameras.AFAEController$AFAEMode;
import android.hardware.Camera;
import n65.k;
import com.kwai.camerasdk.models.CaptureDeviceType;
import q65.h;
import c65.a;
import com.yxcorp.gifshow.camerasdk.j$b;
import com.kwai.camerasdk.render.OpengGL.EglBase$Context;
import com.yxcorp.gifshow.camerasdk.j$c;
import b65.b;
import b65.u;
import com.kwai.camerasdk.config.CameraConfig;
import com.kwai.camerasdk.config.CaptureConfig;
import com.kwai.camerasdk.models.CameraOutputDataType;
import com.kwai.camerasdk.models.DaenerysCaptureConfig$b;
import com.kwai.camerasdk.DaenerysConfigBuilder;
import com.kwai.camerasdk.config.ExtendConfig;
import com.kwai.camerasdk.videoCapture.MultiCameraControllerImpl;
import com.kwai.camerasdk.videoCapture.CameraController$g;
import com.kwai.camerasdk.videoCapture.CameraController$b;
import com.kwai.camerasdk.videoCapture.CameraController$f;
import com.kwai.camerasdk.videoCapture.CameraControllerImpl;
import com.kwai.camerasdk.videoCapture.CameraController$c;
import com.yxcorp.gifshow.camerasdk.j$d;
import java.lang.Long;
import si9.f;
import com.kwai.video.westeros.veplugin.VEPlugin$OnDirtyLensDetectionListener;
import com.kwai.video.westeros.veplugin.VEPlugin;
import wi9.l;
import qi9.s;
import p65.c;
import qi9.o0;
import com.kwai.camerasdk.b;
import p65.a;
import com.kwai.video.westeros.models.VEFeatureType;
import com.kwai.video.westeros.models.VEFeatureParams;
import yi9.b;
import java.lang.Exception;
import qi9.m;
import lnc.h1;
import si9.a;
import com.kwai.video.westeros.ResourceManager;
import ui9.b;
import com.yxcorp.gifshow.camerasdk.j$m;
import ui9.c;
import qi9.j0;
import com.yxcorp.gifshow.camerasdk.magicface.ILiveImageHelper;
import ui9.e;
import com.yxcorp.gifshow.camerasdk.j$n;
import qi9.r1;
import com.yxcorp.gifshow.camerasdk.j$o;
import com.kwai.video.westeros.Westeros$OnBacklightDetectListener;
import lnc.s6;
import android.graphics.Rect;
import com.kwai.camerasdk.videoCapture.CameraController$WhiteBalanceMode;
import com.kwai.camerasdk.monitor.FrameMonitor;
import android.app.Activity;
import q65.h$a;
import qi9.v1;
import com.yxcorp.gifshow.camerasdk.p$a;
import com.yxcorp.gifshow.camerasdk.p$c;
import com.yxcorp.gifshow.camerasdk.f;
import t45.c;
import com.kwai.camerasdk.models.DaenerysConfig;
import qi9.o;
import com.kwai.camerasdk.videoCapture.CameraController$e;
import com.kwai.camerasdk.models.PreviewStats;
import com.yxcorp.gifshow.camerasdk.p$b;
import java.lang.ClassLoader;
import com.kwai.camerasdk.d;
import com.kwai.plugin.dva.work.c;
import aj9.f;
import com.kwai.camerasdk.models.MediaRecorderCallbackFrameType;
import com.yxcorp.gifshow.camerasdk.j$e;
import java.util.Set;
import brd.t;
import qi9.e0;
import java.util.concurrent.Callable;
import xf6.l;
import com.kwai.video.westeros.aiedit.AIEditPlugin;
import com.kwai.video.westeros.audioplugin.AudioPlugin;
import com.kwai.video.westeros.stentorplugin.StentorPlugin;
import qi9.y;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicEnvironmentUnsafeListener;
import qi9.f0;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicReportBeautifyLogListener;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicBeautifyStatusChangedListener;
import com.yxcorp.gifshow.camerasdk.j$l;
import vo4.a;
import xo4.b;
import com.yxcorp.gifshow.camerasdk.j$j;
import wo4.c;
import com.kwai.video.westeros.veplugin.VEPlugin$OnFrameColorListener;

public final class j extends q implements h	// class@00102c
{
    public boolean A;
    public boolean A0;
    public boolean B;
    public Business B0;
    public boolean C;
    public int C0;
    public a D;
    public DevicePersonaConfig D0;
    public t1 E;
    public String E0;
    public String F;
    public boolean F0;
    public c G;
    public final Object G0;
    public c H;
    public final c H0;
    public f I;
    public boolean I0;
    public VideoTextureView J;
    public boolean J0;
    public final List K;
    public final f$a K0;
    public List L;
    public final VideoViewListener L0;
    public List M;
    public final FaceMagicController$FaceMagicBeautifyStatusChangedListener M0;
    public boolean N;
    public Map N0;
    public boolean O;
    public s1 O0;
    public boolean P;
    public boolean Q;
    public boolean R;
    public f S;
    public VideoFrame T;
    public final i1 U;
    public o1 V;
    public VideoViewListener W;
    public boolean X;
    public String Y;
    public u1 Z;
    public Westeros a;
    public DataExtractProcessor a0;
    public f b;
    public CropAndFlipProcessor b0;
    public f c;
    public CropAndFlipProcessor c0;
    public f d;
    public CropAndFlipProcessor d0;
    public f e;
    public CropAndFlipProcessor e0;
    public FacelessPlugin f;
    public int f0;
    public f g;
    public int g0;
    public f h;
    public VideoContext h0;
    public f i;
    public String i0;
    public f j;
    public String j0;
    public CustomPlugin k;
    public String k0;
    public a l;
    public EglBase l0;
    public Daenerys m;
    public EglBase$Context m0;
    public boolean n;
    public boolean n0;
    public CameraController o;
    public k1 o0;
    public a p;
    public p p0;
    public b q;
    public p$a q0;
    public j r;
    public p$b r0;
    public final Context s;
    public p$c s0;
    public final f1 t;
    public f$a t0;
    public final j$r u;
    public b1 u0;
    public Long v;
    public Boolean v0;
    public Long w;
    public boolean w0;
    public final List x;
    public Runnable x0;
    public j$q y;
    public Runnable y0;
    public boolean z;
    public r z0;
    public static boolean P0;
    public static boolean Q0;
    public static boolean R0;
    public static boolean S0;
    public static boolean T0;

    static {
       a.a();
    }
    public void j(Context p0,f1 p1,j$r p2,String p3){
       super();
       this.r = new a();
       this.x = new ArrayList();
       this.z = true;
       this.K = new CopyOnWriteArrayList();
       this.L = new ArrayList();
       this.M = new ArrayList();
       boolean b = false;
       this.O = b;
       this.X = b;
       String str = null;
       this.Y = str;
       this.f0 = b;
       this.g0 = b;
       this.x0 = new d(this);
       this.y0 = new e(this);
       this.B0 = Business.kVideoRecord;
       this.C0 = b;
       this.D0 = str;
       this.F0 = b;
       this.G0 = new Object();
       this.H0 = new c();
       this.K0 = new j$g(this);
       this.L0 = new j$h(this);
       this.M0 = new j$i(this);
       this.O0 = new i(this);
       Object[] objArray = new Object[b];
       q1.C().w("CameraSDK", "CameraSDK create", objArray);
       this.s = p0;
       this.t = p1;
       this.u = p2;
       this.u0 = new b1();
       this.U = new i1(p0);
       j tu0 = this.u0;
       Objects.requireNonNull(tu0);
       if (PatchProxy.applyVoid(str, tu0, b1.class, "1")) {
       }else if(tu0.a == null){
          tu0.a = new HandlerThread("CameraSDKThread");
       }
       if (!tu0.a.isAlive()) {
          tu0.a.setPriority(Looper.getMainLooper().getThread().getPriority());
          tu0.a.start();
          tu0.b = new Handler(tu0.a.getLooper());
          Object[] objArray1 = new Object[b];
          q1.C().w("CameraSDKThread", "CameraSDKThread start "+tu0.a.getThreadId(), objArray1);
       }
       this.z0 = new r(p3, "YTECH_STAT_INFO");
       return;
    }
    public static synchronized void W1(){
       _monitor_enter(j.class);
       if (PatchProxy.applyVoid(null, null, j.class, "197")) {
          _monitor_exit(j.class);
          return;
       }else if(!j.T0 && PermissionUtils.a(a.b(), "android.permission.CAMERA")){
          Object[] objArray = new Object[0];
          q1.C().w("CameraSDK", "startAuthenticationRequest", objArray);
          j.T0 = true;
          CameraController.startAuthenticationRequest(a.b());
       }
       _monitor_exit(j.class);
       return;
    }
    public static synchronized void x1(j p0,c p1){
       boolean b;
       _monitor_enter(j.class);
       Object obj = null;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, obj, j.class, "196")) {
          _monitor_exit(j.class);
          return;
       }else if(!j.R0){
          int i = 0;
          Object[] objArray = new Object[i];
          q1.C().w("CameraSDK", "initSDK", objArray);
          if (!PatchProxy.applyVoid(obj, obj, g1.class, "2")) {
             Daenerys$LogParam logParam = new Daenerys$LogParam();
             logParam.isConsoleEnable = true;
             logParam.isFileEnable = i;
             logParam.logLevel = 1;
             logParam.logCb = l.a;
             logParam.nativeLogFunctionPtr = 0;
             Daenerys.G(logParam);
             Westeros.setLogParam(logParam);
          }
          d.a();
          if (p0 != null && p0.z1()) {
             _monitor_exit(j.class);
             return;
          }else {
             Westeros.preloadLibrarys(a.b());
             if (p0 != null && p0.z1()) {
                _monitor_exit(j.class);
                return;
             }else {
                YcnnSoLoader.loadNative();
                if (p0 != null && p0.z1()) {
                   _monitor_exit(j.class);
                   return;
                }else if(g.g1()){
                   Object[] objArray1 = new Object[i];
                   q1.C().s("CameraSDK", "loading faceMagic Library On SDCard", objArray1);
                   FacelessPlugin.enableLibraryLoadingOnSDCard(g.g1());
                }
                FacelessPlugin.init(a.b());
                if (p0 != null && p0.z1()) {
                   _monitor_exit(j.class);
                   return;
                }else if(p1 != null){
                   b = p1.e();
                }else {
                   b = b.a(Page.kCommonPage).getEnableCameraUnit();
                }
                if (b) {
                   j.W1();
                }
                if (p0 != null && p0.z1()) {
                   _monitor_exit(j.class);
                   return;
                }else {
                   CGEEventLogger.setLogger(g.a);
                   j.R0 = true;
                }
             }
          }
       }
       _monitor_exit(j.class);
       return;
    }
    public String A(){
       j obj = PatchProxy.apply(null, this, j.class, "222");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       WesterosPlugin westerosPlug = (obj != null)? obj.a(): null;
       if (westerosPlug != null) {
          return westerosPlug.collectPerfData();
       }else {
          return null;
       }
    }
    public void A0(FrameRateAdapterCallback p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "159")) {
          return;
       }
       if (this.z == null && this.m != null) {
          this.m.F(p0);
       }
       return;
    }
    public final void A1(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "198")) {
          return;
       }
       if (this.z == null && p0 != null) {
          p0.c();
       }
       return;
    }
    public boolean B(){
       Object obj = PatchProxy.apply(null, this, j.class, "174");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.q == null || (this.q.B() || this.w0 != null))? true: false;
       return b;
    }
    public void B0(boolean p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oj, "127")) {
          return;
       }
       Object[] objArray = new Object[0];
       q1.C().w("CameraSDK", "setFrameResolutionLocked\(\) called with: locked = ["+p0+"]", objArray);
       return;
    }
    public final void B1(){
       if (PatchProxy.applyVoid(null, this, j.class, "202")) {
          return;
       }
       this.A1(this.b);
       this.A1(this.i);
       this.A1(this.j);
       return;
    }
    public d C(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       j obj = PatchProxy.apply(objArray, this, j.class, "178");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (this.p1() != null) {
          obj = this.q;
          Objects.requireNonNull(obj);
          Object obj1 = PatchProxy.apply(objArray, obj, b.class, "26");
          if (obj1 != patchProxyRe) {
             objArray = obj1;
          }else {
             b h = obj.h;
             if (h == null) {
                if (!obj.i.isEmpty()) {
                   h = obj.i;
                   h = h.get((h.size() - 1));
                }
             }
             objArray = h;
          }
       }
       return objArray;
    }
    public void C0(boolean p0){
       this.w0 = p0;
    }
    public final void C1(Context p0,k p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j.class, "189")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       q1.C().w("CameraSDK", "makeImageHelper", objArray);
       j tr = this.r;
       if (tr == null || tr instanceof a) {
          Object[] objArray1 = new Object[i];
          q1.C().w("CameraSDK", "initmMagicFace\(\) called with: context = ["+p0+"]", objArray1);
          tr = this.i0;
          if (!TextUtils.x(tr)) {
             this.E0(tr);
          }
          j tU = this.U;
          Objects.requireNonNull(tU);
          b uob = new b(p0, this.f, this.h, this, p1, new i0(tU));
          this.r = tr;
          this.L();
          j tS = this.S;
          if (tS != null && tS.a()) {
             Object[] objArray2 = new Object[i];
             q1.C().w("CameraSDK", "needRestore : "+p1.e+", ResotreEffects\n"+tS, objArray2);
             if (tS.a == null || p1.e == null) {
                this.S = null;
             }else {
                this.B1();
             }
             k1.o(new z(this, tS));
          }
       }else {
          Object[] objArray3 = new Object[i];
          q1.C().t("CameraSDK", "setupMagicFace: mImageHelper has been created", objArray3);
       }
       return;
    }
    public a D(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, j.class, "177");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.p1() != null) {
          objArray = this.q.D();
       }
       return objArray;
    }
    public void D0(byte[] p0,int p1,int p2){
       if (PatchProxy.isSupport(j.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, j.class, "156")) {
          return;
       }
       ByteBuffer uByteBuffer = ByteBuffer.allocateDirect(p0.length);
       uByteBuffer.position(0);
       uByteBuffer.put(p0);
       VideoFrame videoFrame = VideoFrame.fromCpuFrame(new FrameBuffer(uByteBuffer), p1, p2, 0, TimeUnit.NANOSECONDS.toMillis(System.nanoTime()));
       this.T = videoFrame;
       if (this.z != null || this.m == null) {
          Object[] objArray = new Object[0];
          q1.C().w("CameraSDK", "Daenerys is not prepared!", objArray);
          return;
       }else {
          this.m.n().a(videoFrame, SubLayoutIndex.kLayoutIndex1);
          return;
       }
    }
    public void D1(){
       if (PatchProxy.applyVoid(null, this, j.class, "188")) {
          return;
       }
       this.R = true;
       j.P0 = (this.isFrontCamera())? this.N(this.s): this.N(this.s);
       k1.o(new n(this));
       return;
    }
    public void E(boolean p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oj, "49")) {
          return;
       }
       String str = "]";
       int i = 0;
       Object[] objArray = new Object[i];
       q1.C().w("CameraSDK", "stopRecording, cancelAll = ["+p0+str, objArray);
       if (p0) {
          this.w0 = i;
       }
       if (this.p1() != null) {
          b uob = this.p1();
          Objects.requireNonNull(uob);
          b uob1 = b.class;
          if (!PatchProxy.isSupport(uob1) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), uob, uob1, "4")) {
             Object[] objArray1 = new Object[i];
             q1.C().w("RecorderHelper", "cancelRecording\(\) called with: cancelAll = ["+p0+str, objArray1);
             b.m();
             uob.m(true);
             uob.n = i;
             b h = uob.h;
             int i1 = -1;
             if (h != null) {
                d a = h.a;
                if (a != i1) {
                   uob.b(a);
                   uob.h.a();
                   uob.k();
                }
             }
             if (p0 || uob.i.size() == 1) {
                uob.n();
                uob.b(i1);
                uob.k();
             }else if(!uob.i.isEmpty()){
                int i2 = uob.i.size() - true;
                uob.h = uob.i.remove(i2);
                uob.b(i2);
                h = uob.h;
                if (h != null) {
                   h.a();
                }
             }
             if (!uob.w.isEmpty()) {
                h = uob.w;
                h.remove((h.size() - true));
             }
             uob.k();
          }
       }
       if (this.z != null) {
          return;
       }else if(this.m != null && this.m.o() != null){
          this.m.o().stopRecording(true);
       }
       if (this.p1() != null) {
          oj = this.r;
          if (p0 || !this.B()) {
             i = true;
          }
          oj.I0(i);
       }
       return;
    }
    public void E0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "112")) {
          return;
       }
       if (this.z != null) {
          return;
       }
       this.u0.c(new a0(this, p0));
       return;
    }
    public synchronized final void E1(VideoContext p0,c p1,k p2){
       c p0;
       z c;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, j.class, "13")) {
          return;
       }
       j tH0 = this.H0;
       Objects.requireNonNull(tH0);
       if (!PatchProxy.applyVoid(null, tH0, c.class, "2")) {
          k1.o(new b(tH0));
       }
       d.d("postCameraSDKOpenMonitor").n();
       if (this.a == null) {
          return;
       }else {
          this.w = null;
          this.v = null;
          int i = 0;
          if (this.z == null) {
             Object[] objArray = new Object[i];
             q1.C().w("CameraSDK", "camera alrady opened", objArray);
             this.H1(p1);
             return;
          }else {
             long l = k1.i();
             Object[] objArray1 = new Object[]{Integer.valueOf(p1.j()),Integer.valueOf(p1.h()),Boolean.valueOf(p1.b)};
             objArray1 = new Object[i];
             q1.C().w("CameraSDK", String.format("open camera w:%d h:%d hw:%s", objArray1), objArray1);
             if (this.A != null) {
                return;
             }else {
                j.x1(this, p1);
                if (this.A != null || !j.R0) {
                   return;
                }else {
                   this.H = p1;
                   if (this.A != null) {
                      return;
                   }else {
                      this.h0 = p0;
                      this.z = i;
                      Object[] objArray2 = new Object[i];
                      q1.C().w("CameraSDK", "initPlugins", objArray2);
                      this.w1(p1);
                      if (this.A != null) {
                         return;
                      }else {
                         this.U.a(this.B0, p1.i0);
                         this.v1();
                         this.a.setFaceDetectorContext(this.U.d());
                         j toj = this.f0;
                         if (toj != null) {
                            tH0 = this.g0;
                            if (tH0 != null) {
                               this.h1(toj, tH0);
                            }
                         }
                         this.B = i;
                         this.C = i;
                         this.m.M(new j$k(this));
                         StatsHolder statsHolder = this.m.q();
                         boolean b = (this.E != null)? true: false;
                         statsHolder.setPreviewStatsCallbackEnabled(b);
                         if (this.A != null) {
                            return;
                         }else {
                            p0 = p1.p0;
                            boolean b1 = (p0 == Page.kRecordPage || (p0 == Page.kPhotoPage && (p1.l0 == Business.kVideoRecord && p1.m0 == 1)))? true: false;
                            p2.d = b1;
                            this.C1(a.b(), p2);
                            this.G = p1;
                            Object[] objArray3 = new Object[i];
                            q1.C().t("CameraSDK", "open cost "+k1.t(l), objArray3);
                            if (this.A != null) {
                               return;
                            }else {
                               c = d.c;
                               a0 uoa0 = a0.Y(2000, TimeUnit.MILLISECONDS).T(c).G(c);
                               uoa0.R(new h(this, this.a), b.b);
                               this.J1(p1.j);
                               if (!this.M.isEmpty()) {
                                  this.O1(1, i);
                               }else if(!this.L.isEmpty()){
                                  this.O1(1, 1);
                               }
                               this.R1();
                               d.d("postCameraSDKOpenMonitor").c();
                               return;
                            }
                         }
                      }
                   }
                }
             }
          }
       }
    }
    public void F(int p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oj, "180")) {
          return;
       }
       if (this.p1() != null) {
          this.q.F(p0);
       }
       return;
    }
    public void F0(MagicEmoji$MagicFace p0,String p1){
       j tc1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j.class, "30")) {
          return;
       }
       String str = "CameraSDK";
       if (this.z != null || this.r == null) {
          b.d(str, "CameraSDK ÒÑ¾­¹Ø±Õ!");
          return;
       }else if(p0 != null){
          j tc = this.c;
          if (tc != null && this.d != null) {
             tc.c();
             this.d.c();
          }
       }
       if (p0 != null && p0.mPassThroughParams != null) {
          MagicBaseConfig mDependSo = p0.mDependSo;
          if (!q.f(mDependSo)) {
             b.d(str, "setMagicFace with load depend so: "+mDependSo.toString());
             Iterator iterator = mDependSo.iterator();
             while (iterator.hasNext()) {
                str = iterator.next();
                Objects.requireNonNull(str);
                int i = -1;
                switch (str.hashCode()){
                    case 0xbea0452e:
                      if (str.equals("ykit_module")) {
                         i = 0;
                      }
                      break;
                    case 0xc3d373c1:
                      if (str.equals("ai_edit")) {
                         i = 1;
                      }
                      break;
                    case 0xc5b068ce:
                      if (str.equals("audio_recognition")) {
                         i = 2;
                      }
                      break;
                    case 0xe4968fc0:
                      if (str.equals("stentorplugin")) {
                         i = 3;
                      }
                      break;
                    case 3121:
                      if (str.equals("ar")) {
                         i = 4;
                      }
                      break;
                    case 0x1a6d5:
                      if (str.equals("mmu")) {
                         i = 5;
                      }
                      break;
                    case 0x50672f2e:
                      if (str.equals("ycnn_pre")) {
                         i = 6;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                    case 6:
                      tc1 = this.c;
                      if (tc1 != null) {
                         tc1.c();
                      }
                      tc1 = this.d;
                      if (tc1 != null) {
                         tc1.c();
                      }
                      tc1 = this.b;
                      if (tc1 != null) {
                         tc1.c();
                      }
                      tc1 = this.h;
                      if (tc1 != null) {
                         tc1.c();
                      }
                      tc1 = this.g;
                      if (tc1 != null) {
                         tc1.c();
                      }
                      break;
                    case 1:
                      tc1 = this.g;
                      if (tc1 != null) {
                         tc1.c();
                      }
                      break;
                    case 2:
                      tc1 = this.i;
                      if (tc1 != null) {
                         tc1.c();
                      }
                      break;
                    case 3:
                      tc1 = this.j;
                      if (tc1 != null) {
                         tc1.c();
                      }
                      break;
                    case 4:
                      tc1 = this.b;
                      if (tc1 != null) {
                         tc1.c();
                      }
                      break;
                    case 5:
                      tc1 = this.h;
                      if (tc1 != null) {
                         tc1.c();
                      }
                      break;
                    default:
                }
             }
          }
       }
       this.r.j(p0, p1);
       return;
    }
    public void F1(f p0,VideoContext p1,c p2,k p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, j.class, "6")) {
          return;
       }
       this.f0(p2.l0);
       this.h0(p2.m0);
       if (p0 == null) {
          v ov = new v(this, p0, p2, p1, p3);
          this.u0.c(v7);
       }else {
          this.t1(p0, p2);
          this.u0.c(new w(this, p1, p2, p3));
       }
       return;
    }
    public void G(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "57")) {
          return;
       }
       if (this.q != null) {
          this.q.G(p0);
       }
       if (!this.K.contains(p0)) {
          this.K.add(p0);
       }
       return;
    }
    public void G0(FaceMagicController$FaceMagicRecordingControlListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "113")) {
          return;
       }
       if (this.z != null) {
          return;
       }
       this.u0.c(new x(this, p0));
       return;
    }
    public final void G1(){
       if (PatchProxy.applyVoid(null, this, j.class, "26")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       q1.C().w("CameraSDK", "pause called", objArray);
       if (this.z != null) {
          return;
       }
       if (this.n0 != null) {
          Object[] objArray1 = new Object[i];
          q1.C().w("CameraSDK", "resume state, pause return", objArray1);
          return;
       }else {
          this.L1();
          this.stopPreview();
          if (this.r.w() || (this.r.O0().a != null && this.r.O0().a.n != null)) {
             i = 1;
          }
          if (this.a != null && !i) {
             this.u0.b(new t(this));
          }
          if (this.m != null) {
             this.m.q().pause();
             this.m.u();
          }
          return;
       }
    }
    public void H(int p0,int p1){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, oj, "179")) {
          return;
       }
       if (this.p1() != null) {
          b uob = this.p1();
          uob.r = p0;
          uob.s = p1;
       }
       return;
    }
    public void H0(float p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, oj, "152")) {
          return;
       }
       if (this.z != null) {
          return;
       }
       FaceDetectConfig$b uob = FaceDetectConfig.newBuilder(this.m.l().c());
       uob.a(p0);
       this.m.l().a(uob.build());
       return;
    }
    public void H1(c p0){
       j to;
       boolean b1;
       String str3;
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "4")) {
          return;
       }
       if (this.A == null && this.z == null) {
          int i = 0;
          Object[] objArray = new Object[i];
          String str = "CameraSDK";
          String str1 = "resetCameraController";
          q1.C().w(str, str1, objArray);
          this.f0(p0.l0);
          this.h0(p0.m0);
          this.J1(p0.j);
          this.y1(p0);
          boolean b = true;
          if (this.G != null && (p0.a().isSameResolutionConfig(this.G.a()) && p0.d() == this.G.d())) {
             StabilityType stabilityTyp = p0.n();
             StabilityType stabilityTyp1 = this.G.n();
             StabilityType sUPER = StabilityType.SUPER;
             g1 og1 = (stabilityTyp == sUPER || stabilityTyp == StabilityType.SUPER_PRO)? 1: null;
             String str2 = (stabilityTyp1 == sUPER || stabilityTyp1 == StabilityType.SUPER_PRO)? 1: null;
             CameraApiVersion uCameraApiVe = (!og1 && (!str2 || (og1 == str2 && stabilityTyp == stabilityTyp1)))? 1: null;
             if (uCameraApiVe && (p0.k(b) == this.G.k(b) && p0.s0 == this.G.s0)) {
                Object[] objArray1 = new Object[i];
                q1.C().w(str, "cameraParameters sameconfig", objArray1);
                c a = p0.a;
                j tG = this.G;
                c a1 = (tG.s0 != null)? tG.a: this.isFrontCamera();
                if (a != a1) {
                   if (this.I0 == null) {
                      this.resumePreview();
                   }
                   this.d1();
                }
                to = this.o;
                j tG1 = this.G;
                CameraPageConfig obj = PatchProxy.applyThreeRefs(to, tG1, p0, null, g1.class, "5");
                if (obj != PatchProxyResult.class) {
                   b1 = obj.booleanValue();
                }else {
                   obj = tG1.a();
                   CameraPageConfig uCameraPageC = p0.a();
                   to.beginConfiguration();
                   if (tG1.b() != p0.b() || g1.a(p0) != g1.a(tG1)) {
                      to.setCameraStreamTypeAndVideoStabilizationMode(g1.d(p0.b()), g1.a(p0), i);
                      Object[] objArray2 = new Object[i];
                      q1.C().w("DaenerysLog", "StreamTypeForBack update", objArray2);
                      str3 = 1;
                   }else {
                      str3 = null;
                   }
                   if (tG1.c() != p0.c() || g1.e(obj.mCaptureStabilizationModeForFrontCamera) != g1.e(uCameraPageC.mCaptureStabilizationModeForFrontCamera)) {
                      to.setCameraStreamTypeAndVideoStabilizationMode(g1.d(p0.c()), g1.e(uCameraPageC.mCaptureStabilizationModeForFrontCamera), b);
                      objArray1 = new Object[i];
                      q1.C().w("DaenerysLog", "StreamTypeForFront update", objArray1);
                      str3 = 1;
                   }
                   a1 = p0.R;
                   if (a1 != tG1.R) {
                      to.setUseYuvOutputForCamera2TakePicture(a1);
                      Object[] objArray3 = new Object[i];
                      q1.C().w("DaenerysLog", "UseYuv update", objArray3);
                   }else {
                      b = str3;
                   }
                   to.commitConfiguration();
                   b1 = b;
                }
                if (b1) {
                   this.f(new g0(this));
                }
                this.G = p0;
                return;
             }
          }
       label_0176 :
          Object[] objArray4 = new Object[i];
          q1.C().w(str, str1, objArray4);
          to = this.G;
          if (to != null && p0.s0 != to.s0) {
             objArray4 = new Object[i];
             q1.C().w(str, "MultiCamera changed, change MultiCamera to "+p0.s0, objArray4);
             this.n = i;
          }
          Long longx = null;
          this.w = longx;
          this.v = longx;
          this.G = p0;
          this.H = p0;
          j tm = this.m;
          Objects.requireNonNull(tm);
          if (!PatchProxy.applyVoid(longx, tm, Daenerys.class, "5")) {
             Log.i("Daenerys", "removeCameraMediaSource");
             Daenerys m = tm.m;
             if (m != null) {
                CameraController uCameraContr = m.get();
                if (uCameraContr != null) {
                   tm.v.d(longx);
                   uCameraContr.removeSink(tm);
                   tm.g.setStatesListener(longx);
                   tm.h.setStatesListener(longx);
                   uCameraContr.setStats(longx);
                   tm.y(new m(tm));
                }
             }
          }
          this.o.dispose();
          to = this.G;
          tm = this.N;
          if (this.O == null && p0.s0 == null) {
             b = false;
          }
          this.o = this.i1(g1.f(to, tm, b), this.G);
          this.I1();
          if (!this.m.r() && p0.s0 != null) {
             Object[] objArray5 = new Object[i];
             q1.C().w(str, "createSubPipeline", objArray5);
             this.m.g();
          }
          this.m.A(this.o);
       }
       return;
    }
    public void I(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "58")) {
          return;
       }
       if (this.q != null) {
          this.q.I(p0);
       }
       this.K.remove(p0);
       return;
    }
    public void I0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "54")) {
          return;
       }
       j tm = this.m;
       if (tm == null) {
          return;
       }
       tm.I(p0);
       return;
    }
    public final void I1(){
       if (PatchProxy.applyVoid(null, this, j.class, "19")) {
          return;
       }
       j tG = this.G;
       if (tG != null && tG.z != null) {
          StabilityType stabilityTyp = (tG != null && tG.n() != null)? this.G.n(): StabilityType.DISABLED;
          this.P0(stabilityTyp.getRenderFps());
          this.O0(stabilityTyp.getRecorderFps(b.a(Page.kRecordPage)));
       }
       return;
    }
    public String J(){
       j obj = PatchProxy.apply(null, this, j.class, "223");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       WesterosPlugin westerosPlug = (obj != null)? obj.a(): null;
       if (westerosPlug != null) {
          return westerosPlug.collectPerfData();
       }else {
          return null;
       }
    }
    public void J0(f p0,VideoTextureView p1){
       boolean i;
       Object[] objArray1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j.class, "52")) {
          return;
       }
       Object[] objArray = new Object[0];
       q1.C().w("CameraSDK", "setMultiSurfaceView:", objArray);
       j tG0 = this.G0;
       _monitor_enter(tG0);
       if (p0 != null) {
          i = 0x7f0619d6;
          if (this.I != p0) {
             if (this.I != null) {
                this.I.setListener(null);
             }
             p0.setListener(this.L0);
             this.I = p0;
             this.n = false;
             this.U1(p0, a1.a(i));
          }
          if (this.J != p1) {
             this.J = p1;
             this.n = false;
             this.U1(p1, a1.a(i));
          }
       }
       if (this.I == null) {
          objArray1 = new Object[0];
          q1.C().w("CameraSDK", "mSurfaceView is null", objArray1);
          _monitor_exit(tG0);
          return;
       }else if(this.m != null && this.n == null){
          j tm = this.m;
          j tI = this.I;
          i = true;
          int i1 = (this.n().a != null)? 0: 1;
          tm.L(tI, i1);
          tm = this.m;
          tI = this.J;
          i1 = (this.n().a != null)? 1: 0;
          tm.L(tI, i1);
          if (g.f1() && this.I != null) {
             k1.o(new q(this));
          }
          this.I.resume();
          this.J.resume();
          if (this.o != null) {
             this.o.setMainDeviceWithSourceId(this.m.s(this.I));
          }
          this.n = i;
          objArray1 = new Object[0];
          q1.C().w("CameraSDK", "Daenerys setMultiSurfaceView", objArray1);
       }else {
          objArray1 = new Object[0];
          q1.C().w("CameraSDK", "Daenerys is"+this.m+" mDaenerysSurfaceSetted:"+this.n, objArray1);
       }
       _monitor_exit(tG0);
       return;
    }
    public void J1(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "5")) {
          return;
       }
       if (this.A == null && this.z == null) {
          Object[] objArray = new Object[0];
          q1.C().w("CameraSDK", "resetTaskid "+p0, objArray);
          j tG = this.G;
          if (tG != null && TextUtils.n(tG.j, p0)) {
             Object[] objArray1 = new Object[0];
             q1.C().w("CameraSDK", "resetTaskid equals", objArray1);
             return;
          }else if(this.m != null && this.m.q() != null){
             this.m.q().setSessionId(p0);
          }
       }
       return;
    }
    public boolean K(){
       j obj = PatchProxy.apply(null, this, j.class, "210");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.e;
       if (obj == null) {
          return false;
       }
       return obj.b();
    }
    public void K0(u1 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "215")) {
          return;
       }
       Object[] objArray = new Object[0];
       q1.C().s("CameraSDK", "setOnYcnnGeneralRecogListner", objArray);
       this.Z = p0;
       j tc = this.c;
       if (tc != null && tc.a() instanceof YcnnPlugin) {
          if (p0 == null) {
             this.c.a().setOnYcnnGeneralRecogDetectionListener(null);
          }else {
             this.c.a().setOnYcnnGeneralRecogDetectionListener(new h(p0));
          }
       }
       return;
    }
    public final void K1(){
       j oj = j.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oj, "28")) {
          return;
       }
       int i = 0;
       Object[] objArray1 = new Object[i];
       q1.C().w("CameraSDK", "resume called", objArray1);
       if (this.z != null) {
          return;
       }
       if (this.n0 == null) {
          objArray = new Object[i];
          q1.C().w("CameraSDK", "pause state, resume return", objArray);
          return;
       }else if(this.Q != null){
          objArray = new Object[i];
          q1.C().w("CameraSDK", "DisableResumePreview!", objArray);
          return;
       }else {
          this.resumePreview();
          if (this.m != null) {
             this.m.q().resume();
             this.m.v();
          }
          if (this.a != null && this.U.e()) {
             Object[] objArray2 = new Object[i];
             q1.C().w("CameraSDK", "set FaceDetectorContext", objArray2);
             if (!PatchProxy.applyVoid(objArray, this, oj, "29")) {
                this.u0.c(new r(this));
             }
          }
          return;
       }
    }
    public void L(){
       if (PatchProxy.applyVoid(null, this, j.class, "160")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       q1.C().w("CameraSDK", "initMagicResource", objArray);
       if (this.r == null || this.z != null) {
          Object[] objArray1 = new Object[i];
          q1.C().A("CameraSDK", "initMagicResource, or camera sdk disposed", objArray1);
          return;
       }else {
          this.r.b0(MagicEmojiResourceHelper.d());
          this.r.S(MagicEmojiResourceHelper.e());
          this.r.P(this.q1());
          this.v1();
          return;
       }
    }
    public void L0(boolean p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oj, "226")) {
          return;
       }
       Object[] objArray = new Object[0];
       q1.C().w("CameraSDK", "setPerformMonitorEnable:"+p0, objArray);
       this.T1(p0);
       return;
    }
    public final void L1(){
       if (PatchProxy.applyVoid(null, this, j.class, "195")) {
          return;
       }
       if (this.I != null && (this.R() && !b.a())) {
          this.I.a();
          Object[] objArray = new Object[0];
          q1.C().w("CameraSDK", "saveVideoFrameForSurfaceCreated cost "+k1.t(k1.i()), objArray);
       }
    label_0046 :
       return;
    }
    public boolean M(){
       Object obj = PatchProxy.apply(null, this, j.class, "169");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.R() || this.isRecording())? true: false;
       return b;
    }
    public void M0(t1 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "158")) {
          return;
       }
       this.E = p0;
       if (this.z == null && (this.m != null && this.m.q() != null)) {
          StatsHolder statsHolder = this.m.q();
          boolean b = (this.E != null)? true: false;
          statsHolder.setPreviewStatsCallbackEnabled(b);
       }
    label_002d :
       return;
    }
    public final void M1(boolean p0,boolean p1){
       Object[] objArray2;
       a uoa = a.class;
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, oj, "186")) {
          return;
       }
       Object[] objArray = new Object[0];
       q1.C().w("CameraSDK", "setAudioCaptureEnableImpl, enable:"+p0+", force:"+p1, objArray);
       oj = this.z;
       j tp = this.p;
       int i = (tp == null)? 1: 0;
       if (oj | i) {
          return;
       }else if(p0){
          oj = this.G;
          if (oj != null) {
             tp.b(oj.D);
          }
       }
       if (p0 != this.B || p1) {
          Object[] objArray1 = null;
          if (p0) {
             objArray = new Object[0];
             q1.C().w("CameraSDK", "startAudioCapture", objArray);
             tp = this.p;
             Objects.requireNonNull(tp);
             if (!PatchProxy.applyVoid(objArray1, tp, uoa, "2")) {
                if (tp.d == null) {
                   tp.b(tp.e);
                }
                tp.d.startCapture();
                objArray2 = new Object[0];
                q1.C().w("AudioControllerBridge", "startCapture "+tp.d.getClass().getSimpleName(), objArray2);
             }
          }else {
             objArray = new Object[0];
             q1.C().w("CameraSDK", "stopAudioCapture", objArray);
             tp = this.p;
             Objects.requireNonNull(tp);
             if (!PatchProxy.applyVoid(objArray1, tp, uoa, "3")) {
                uoa = tp.d;
                if (uoa != null) {
                   uoa.stopCapture();
                   objArray2 = new Object[0];
                   q1.C().w("AudioControllerBridge", "stopCapture "+tp.d.getClass().getSimpleName(), objArray2);
                }
             }
          }
          this.B = p0;
       }
       return;
    }
    public boolean N(Context p0){
       p0 = PatchProxy.applyOneRefs(p0, this, j.class, "175");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       j to = this.o;
       if (to == null || (this.z == null && this.A == null)) {
          FlashController$FlashMode[] supportedFla = to.getSupportedFlashModes();
          int len = supportedFla.length;
          int i = 0;
          while (i < len) {
             if (supportedFla[i] == FlashController$FlashMode.FLASH_MODE_TORCH) {
                return true;
             }
             i = i + 1;
          }
       }
       return false;
    }
    public void N0(VideoContext p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "56")) {
          return;
       }
       if (p0 != null && this.q == null) {
          Object[] objArray = new Object[0];
          q1.C().w("CameraSDK", "setRecordVideoContext", objArray);
          this.h0 = p0;
       }
       return;
    }
    public void N1(boolean p0){
       this.P = p0;
    }
    public boolean O(int p0,int p1,int p2){
       j obj;
       if (PatchProxy.isSupport(j.class)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, j.class, "111");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (this.z == null && this.M()) {
          obj = this.G;
          if (obj != null && (obj.j() == p0 && (this.G.h() != p1 || this.G.i() != p2))) {
             b = true;
          }
       }
       return b;
    }
    public void O0(int p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oj, "87")) {
          return;
       }
       if (this.z == null && (this.m != null && this.m.o() != null)) {
          Object[] objArray = new Object[0];
          q1.C().s("CameraSDK", "set record fps to "+p0, objArray);
          g og = this.m.o();
          Objects.requireNonNull(og);
          g og1 = g.class;
          if (!PatchProxy.isSupport(og1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), og, og1, "13")) {
             og.a.setTargetFps(p0);
          }
       }
       return;
    }
    public final void O1(boolean p0,boolean p1){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, oj, "216")) {
          return;
       }
       if (!p0) {
          this.v0 = null;
       }
       if (this.z == null && this.o != null) {
          j tG = this.G;
          tG = (tG != null && (tG.I != null || tG.L != null))? 1: 0;
          if (p1 && !tG) {
             return;
          }else {
             j ta = this.a;
             if (ta != null) {
                if (p0) {
                   ta.updateLowlightThreshold(15);
                   this.a.setFeatureEnabled(FeatureType.kLowLightDetection, true);
                   this.a.setOnLowLightDetectionListener(new g(this));
                }else {
                   ta.setFeatureEnabled(FeatureType.kLowLightDetection, false);
                   this.a.setOnLowLightDetectionListener(null);
                }
             }
          }
       }
    label_0064 :
       return;
    }
    public boolean P(){
       if (this.z == null) {
          j tG = this.G;
          if (tG != null) {
             return tG.b;
          }
       }
       return false;
    }
    public void P0(int p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oj, "86")) {
          return;
       }
       if (this.z == null && this.m != null) {
          Object[] objArray = new Object[0];
          q1.C().s("CameraSDK", "set render target fps to "+p0, objArray);
          this.m.N(p0);
       }
       return;
    }
    public void P1(boolean p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oj, "3")) {
          return;
       }
       this.U.e = p0;
       return;
    }
    public boolean Q(){
       return this.A0;
    }
    public void Q0(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j.class, "163")) {
          return;
       }
       j tf = this.f;
       if (tf != null && (tf.getFaceMagicController() != null && !TextUtils.x(p0))) {
          tf.getFaceMagicController();
          FaceMagicController.setRunningKeyandValue(p0, p1);
       }
    label_0021 :
       return;
    }
    public void Q1(boolean p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oj, "229")) {
          return;
       }
       oj = this.a;
       if (oj != null) {
          oj.setFeatureEnabled(FeatureType.kLocalRegionBlur, p0);
       }
       return;
    }
    public final boolean R(){
       Object obj = PatchProxy.apply(null, this, j.class, "165");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.o != null && this.o.getState() == CameraController$CameraState.PreviewState)? true: false;
       return b;
    }
    public void R0(f$a p0){
       this.t0 = p0;
    }
    public final void R1(){
       if (PatchProxy.applyVoid(null, this, j.class, "190")) {
          return;
       }
       if (this.r == null || (this.a == null || (this.U != null && this.z == null))) {
          this.r.A0(this.u.b());
          this.a.setOnEventListener(this.u.a());
          j tU = this.U;
          FaceDetectorContext$b uob = this.u.c();
          Objects.requireNonNull(tU);
          if (PatchProxy.applyVoidOneRefs(uob, tU, i1.class, "5") || (tU.d == null && tU.c == null)) {
             FaceDetectorContext uFaceDetecto = tU.d();
             if (uFaceDetecto != null) {
                uFaceDetecto.setModelMissingListener(uob);
             }
          }
          FaceMagicController.addFaceMagicLoadEffectFailedListener(this.u.b());
       }
    label_0064 :
       return;
    }
    public final boolean S(){
       Object obj = PatchProxy.apply(null, this, j.class, "166");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.o != null && this.o.getState() == CameraController$CameraState.IdleState)? true: false;
       return b;
    }
    public void S0(VideoSourceLayout p0){
       j oj = j.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oj, "155")) {
          return;
       }
       if (this.z == null && this.m != null) {
          DaenerysLayoutManager uDaenerysLay = this.m.n();
          Objects.requireNonNull(uDaenerysLay);
          if (!PatchProxy.applyVoidOneRefs(p0, uDaenerysLay, DaenerysLayoutManager.class, "3")) {
             if (p0 != null) {
                uDaenerysLay.nativeSetVideoSourceLayout(uDaenerysLay.a, p0.toByteArray());
             }else {
                uDaenerysLay.nativeSetVideoSourceLayout(uDaenerysLay.a, null);
             }
          }
          j tT = this.T;
          if (PatchProxy.applyVoidOneRefs(tT, this, oj, "157") || (this.z != null || (this.m != null && tT != null))) {
             this.m.n().a(tT, SubLayoutIndex.kLayoutIndex1);
          }
       }
    label_005b :
       return;
    }
    public void S1(int p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oj, "230")) {
          return;
       }
       FaceDetectorContext uFaceDetecto = this.n1();
       if (uFaceDetecto != null) {
          uFaceDetecto.setActivityRequestedOrientation(p0);
       }
       return;
    }
    public boolean T(){
       boolean b = (this.n0 != null && this.z == null)? true: false;
       return b;
    }
    public void T0(VideoViewListener p0){
       this.W = p0;
    }
    public final void T1(boolean p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oj, "227")) {
          return;
       }
       int i = this.z ^ 0x01;
       j td = this.d;
       int i1 = 0;
       if (td == null || !td.b()) {
          i = false;
       }
       td = this.h;
       if (td == null || !td.b()) {
          i = false;
       }
       td = this.c;
       if (td == null || !td.b()) {
          i = false;
       }
       td = this.b;
       if (td == null || !td.b()) {
          i = false;
       }
       Object[] objArray = new Object[i1];
       q1.C().w("CameraSDK", "enable result:"+i, objArray);
       if (i) {
          this.y = null;
          this.d.a().enablePerfMonitor(p0);
          this.h.a().enablePerfMonitor(p0);
          this.c.a().enablePerfMonitor(p0);
          this.b.a().enablePerfMonitor(p0);
          if (this.o() != null) {
             this.o().enablePerfMonitor(p0);
          }
       }else {
          this.y = new h0(this, p0);
       }
       return;
    }
    public boolean U(TakePictureSource p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "132");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = j$f.b[p0.ordinal()];
       boolean b = true;
       if (i == b) {
          return b;
       }
       if (i == 2) {
          return false;
       }
       j tG = this.G;
       if (tG == null || tG.q == null) {
          b = false;
       }
       return b;
    }
    public void U0(f p0){
       Object[] objArray1;
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "51")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       q1.C().w("CameraSDK", "setSurfaceView:"+p0, objArray);
       j tG0 = this.G0;
       _monitor_enter(tG0);
       VideoViewListener videoViewLis = null;
       if (p0 != null && this.I != p0) {
          if (this.I != null) {
             this.I.setListener(videoViewLis);
          }
          p0.setListener(this.L0);
          this.I = p0;
          this.n = i;
          this.U1(p0, a1.a(R.color.arg_RES_7f0619d6));
       }
       if (this.I == null) {
          objArray1 = new Object[i];
          q1.C().w("CameraSDK", "mSurfaceView is null", objArray1);
          _monitor_exit(tG0);
          return;
       }else if(this.m != null && this.n == null){
          this.J = videoViewLis;
          this.m.K(this.I);
          if (g.f1() && this.I != null) {
             k1.o(new p(this));
          }
          this.I.resume();
          this.n = true;
          objArray1 = new Object[i];
          q1.C().w("CameraSDK", "Daenerys setSurfaceView", objArray1);
       }else {
          objArray1 = new Object[i];
          q1.C().w("CameraSDK", "Daenerys is"+this.m+" mDaenerysSurfaceSetted:"+this.n, objArray1);
       }
       _monitor_exit(tG0);
       return;
    }
    public final void U1(f p0,int p1){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oj, "14")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       p0.setBackgroundColor(((float)((0xff0000 & p1) >> 16) / 0x437f0000), ((float)((0xff00 & p1) >> 8) / 0x437f0000), ((float)(p1 & 0x00ff) / 0x437f0000), ((float)((0xff000000 & p1) >> 24) / 0x437f0000));
       return;
    }
    public boolean V(){
       j obj = PatchProxy.apply(null, this, j.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.l;
       boolean b = false;
       if (obj != null && obj.getState() == 3) {
          b = true;
       }
       return b;
    }
    public void V0(){
       if (PatchProxy.applyVoid(null, this, j.class, "59")) {
          return;
       }
       if (this.z == null) {
          this.C = true;
          this.M1(true, false);
       }
       return;
    }
    public final void V1(){
       if (PatchProxy.applyVoid(null, this, j.class, "7")) {
          return;
       }
       j ta = this.a;
       if (ta != null) {
          j tC0 = this.C0;
          if (tC0 == 3) {
             ta.setRecordSubBusiness(RecordSubBusiness.KDuet);
          }else if(tC0 > null){
             ta.setRecordSubBusiness(RecordSubBusiness.KNormal);
          }
       }
       return;
    }
    public void W(){
       if (PatchProxy.applyVoid(null, this, j.class, "22")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       q1.C().w("CameraSDK", "onPause", objArray);
       this.n0 = i;
       this.u0.d(this.x0);
       if (!this.u0.a() && Looper.getMainLooper() == Looper.myLooper()) {
          this.G1();
       }else {
          Object[] objArray1 = new Object[i];
          q1.C().w("CameraSDK", "post pause", objArray1);
          this.u0.d(this.y0);
          this.u0.b(this.y0);
       }
       return;
    }
    public void W0(o1 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "133")) {
          return;
       }
       if (this.z != null) {
          return;
       }
       if (this.a0 == null) {
          j$a uoa = new j$a(this, DataExtractType.kDataExtractTypeBitmap);
          this.a0 = uoa;
          uoa.setTriggerMode(DataExtractTriggerMode.kTriggerModeAlways);
          this.m.d(this.a0, GlProcessorGroup.kPreviewGroup, true);
       }
       this.V = p0;
       this.a0.extractOneFrame();
       return;
    }
    public void X(){
       if (PatchProxy.applyVoid(null, this, j.class, "27")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       q1.C().w("CameraSDK", "onResume", objArray);
       this.n0 = true;
       this.u0.d(this.y0);
       if (!this.u0.a() && Looper.getMainLooper() == Looper.myLooper()) {
          this.K1();
       }else {
          Object[] objArray1 = new Object[i];
          q1.C().w("CameraSDK", "post resume", objArray1);
          this.u0.b(this.x0);
       }
       return;
    }
    public void X0(c p0,RectF p1){
       Object[] objArray;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j.class, "194")) {
          return;
       }
       String str = "CameraSDK";
       int i = 0;
       if (this.m == null || this.z != null) {
          objArray = new Object[i];
          q1.C().w(str, "face frame no daenerys or disposed", objArray);
          return;
       }else if(this.k == null){
          if (!Dva.instance().isLoaded("customplugin")) {
             objArray = new Object[i];
             q1.C().w(str, "CUSTOM_PLUGIN not loaded", objArray);
             return;
          }else {
             this.k = new CustomPlugin();
             if (this.A != null) {
                return;
             }else {
                this.a.applyPlugin(this.k);
             }
          }
       }
       j tk = this.k;
       if (tk != null) {
          tk.startConsume(ResourceType.kFace);
       }
       if (this.o0 == null) {
          this.o0 = new k1(p1);
          this.m.f(this.o0.a(), GlProcessorGroup.kPreviewGroup);
          tk = this.o0;
          Objects.requireNonNull(tk);
          if (!PatchProxy.applyVoid(null, tk, k1.class, "1")) {
             q1 oq1 = q1.C();
             StringBuilder str1 = "start ";
             k1 d = tk.d;
             String str2 = (d != null)? d.toShortString(): "null";
             Object[] objArray1 = new Object[i];
             oq1.s("FacesDetectTracer", str1+str2, objArray1);
             tk.a.setFacesArrayListener(new n(tk));
             tk.a.start();
          }
       }
       this.o0.b(p0, p1);
       return;
    }
    public final void X1(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, j.class, "89")) {
          return;
       }
       int i = 0;
       if (this.m == null) {
          objArray = new Object[i];
          q1.C().w("CameraSDK", "face frame no daenerys", objArray);
          return;
       }else if(this.p0 == null && (this.r0 != null || this.q0 != null)){
          this.p0 = new p(this);
          this.m.f(this.p0.b(), GlProcessorGroup.kMainGroup);
          j tp0 = this.p0;
          Objects.requireNonNull(tp0);
          if (!PatchProxy.applyVoid(objArray, tp0, p.class, "1")) {
             Object[] objArray1 = new Object[i];
             q1.C().s("FaceTracer", "start", objArray1);
             tp0.b.setFacesArrayListener(new o(tp0));
             tp0.b.start();
          }
       }
       return;
    }
    public void Y(){
       if (PatchProxy.applyVoid(null, this, j.class, "35")) {
          return;
       }
       _monitor_enter(this);
       j tl = this.l;
       if (tl != null) {
          tl.release();
          this.l = null;
       }
       _monitor_exit(this);
       return;
    }
    public void Y0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "213")) {
          return;
       }
       Object[] objArray = new Object[0];
       q1.C().s("CameraSDK", "startProvideGeneralRecog: "+p0, objArray);
       this.Y = p0;
       j tc = this.c;
       if (tc != null && tc.a() instanceof YcnnPlugin) {
          this.c.a().startProvideGeneralRecog(p0);
       }
       return;
    }
    public final void Y1(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, j.class, "90")) {
          return;
       }
       if (this.m == null) {
          objArray = new Object[0];
          q1.C().w("CameraSDK", "face frame no daenerys", objArray);
          return;
       }else {
          j tp0 = this.p0;
          if (tp0 != null) {
             tp0.f();
             this.p0.c();
             this.p0 = objArray;
          }
          return;
       }
    }
    public void Z(AudioProcessor p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "154")) {
          return;
       }
       if (this.m != null && p0 != null) {
          j tm = this.m;
          Objects.requireNonNull(tm);
          if (!PatchProxy.applyVoidOneRefs(p0, tm, Daenerys.class, "27")) {
             Log.i("Daenerys", "removeExternalAudioProcessor");
             if (tm.k == null) {
                tm.y(new f(tm, p0));
             }
          }
       }
       return;
    }
    public boolean Z0(a p0){
       Object[] obj2;
       int i2;
       int i3;
       a j;
       CropAndFlipProcessor uCropAndFlip = this;
       String str = p0;
       a uoa = a.class;
       Object obj = PatchProxy.applyOneRefs(str, uCropAndFlip, j.class, "47");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       long l = SystemClock.uptimeMillis();
       String str1 = "], duration = [";
       String str2 = "], speedRate = [";
       StringBuilder str3 = "]";
       int i = 0;
       Object[] objArray = new Object[i];
       q1.C().w("CameraSDK", "startRecordingWithAudio, enableAudio = ["+p0.g()+"], cacheDir = ["+p0.a()+str1+p0.b()+str2+p0.e()+"], rotation = ["+p0.d()+"], startRecordDelayMs = ["+p0.f()+str3, objArray);
       if (uCropAndFlip.z != null) {
          return i;
       }
       a h = str.h;
       boolean i1 = p0.d();
       if (!PatchProxy.isSupport(j.class) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(h), Integer.valueOf(i1), uCropAndFlip, j.class, "140")) {
          if (h == null && uCropAndFlip.d0 == null) {
             uCropAndFlip.d0 = new CropAndFlipProcessor();
             uCropAndFlip.m.c(uCropAndFlip.d0, GlProcessorGroup.kRecorderGroup);
          }
          uCropAndFlip.c2(h, i1, uCropAndFlip.d0);
       }
       uCropAndFlip.M1(p0.g(), true);
       b uob = this.p1();
       boolean b = uob.B();
       j r = uCropAndFlip.r;
       String str4 = (r == null)? null: r.getFaceMagicEncodeProfile();
       str.m = str4;
       b obj1 = PatchProxy.applyOneRefs(str, uob, b.class, "2");
       boolean b1 = b;
       if (obj1 != PatchProxyResult.class) {
          i1 = obj1.booleanValue();
       }else {
          obj2 = new Object[0];
          str2 = "RecorderHelper";
          q1.C().w(str2, "startRecording\(\) called with: cacheDir = ["+p0.a()+str1+p0.b()+str2+p0.e()+str3, obj2);
          if (p0.a() != null && (p0.b() > 0 && p0.e() - null > 0)) {
             if (uob.l()) {
                obj2 = new Object[0];
                q1.C().t(str2, "Last recording activity is not finished, busy.", obj2);
                i1 = false;
             }else {
                uob.n = true;
                if (!uob.a) {
                   uob.n();
                   uob.a = System.currentTimeMillis();
                }
                uob.m(false);
                uob.b = p0.b();
                if (uob.h == null) {
                   uob.h = new d();
                }
                i1 = uob.i.size();
                b h1 = uob.h;
                h1.a = i1;
                h1.b = p0.e();
                obj1 = uob.v;
                uob.v = obj1 + 1;
                str3 = p0.a()+"/"+uob.a+"_"+i1+"_"+obj1;
                uob.h.c = str3+".mp4";
                uob.h.k = p0.d();
                uob.h.j = str.l;
                j = str.j;
                uob.u = j;
                if (j > null) {
                   uob.k();
                }
                if (!uob.i.isEmpty()) {
                   obj1 = uob.i;
                   d uod1 = obj1.get((obj1.size() - 1));
                   h1 = uob.h;
                   h1.d = uod1.d;
                   h1.e = uod1.e;
                   Object[] objArray1 = new Object[0];
                   q1.C().w(str2, "startRecording, last recorded duration: "+uob.h.e, objArray1);
                }
                uob.f = true;
                obj1 = uob.j;
                Objects.requireNonNull(obj1);
                if (PatchProxy.apply(null, obj1, VideoContext.class, "124") != PatchProxyResult.class) {
                }else {
                   VideoContext.b();
                   int i4 = obj1.a.c.c + 1;
                   if (PatchProxy.isSupport(VideoContext.class) && PatchProxy.applyOneRefs(Integer.valueOf(i4), obj1, VideoContext.class, "123") != PatchProxyResult.class) {
                   }else {
                      VideoContext.b();
                      obj1.a.c.c = i4;
                   }
                }
                if (!PatchProxy.applyVoid(null, null, b.class, "16")) {
                   a.l(true);
                }
                obj1 = uob.j;
                str1 = (uob.g != null)? "hardware_encode": "software_encode";
                Objects.requireNonNull(obj1);
                if (PatchProxy.applyOneRefs(str1, obj1, VideoContext.class, "144") != PatchProxyResult.class) {
                }else {
                   VideoContext.b();
                   if (!TextUtils.x(str1)) {
                      obj1.a.c.R = str1;
                   }
                }
                j = str.m;
                if (j != null) {
                   uob.w.add(j);
                }
                i1 = true;
             }
          }else {
             throw new AssertionError();
          }
       }
       if (i1) {
          obj1 = uob.h;
          d uod = new d(obj1.c, this.P());
          if (!b1) {
             uod.e = true;
          }
          uod.h(obj1.b);
          uod.g(p0.d());
          uod.e(str.k);
          if (p0.c() != null && p0.c().length > 0) {
             uod.m = p0.c();
          }
          if (str.i != null || p0.g()) {
             uod.f(RecordMode.kDefault);
          }else {
             uod.f(RecordMode.kVideoOnly);
          }
          j p = uCropAndFlip.p;
          if (p != null) {
             Objects.requireNonNull(p);
             obj2 = PatchProxy.apply(null, p, uoa, "6");
             if (obj2 != PatchProxyResult.class) {
                i1 = obj2.intValue();
             }else if(p.e != null){
                i1 = 0xac44;
             }else {
                i1 = p.c.getSampleRate();
             }
             uod.k = i1;
             p = uCropAndFlip.p;
             Objects.requireNonNull(p);
             Object obj3 = PatchProxy.apply(null, p, uoa, "5");
             if (obj3 != PatchProxyResult.class) {
                i2 = obj3.intValue();
             }else if(p.e != null){
                i2 = 2;
             }else {
                i2 = p.c.getChannelCount();
             }
             uod.l = i2;
          }
          if (p0.f() > 0) {
             uod.g = Math.max(0, ((long)p0.f() - (SystemClock.uptimeMillis() - l)));
          }
          boolean b2 = a.t().d("CameraSendAudioEmptyPacket", false);
          if (b2) {
             uod.h = b2;
          }
          Object obj4 = PatchProxy.applyTwoRefs(uod, uob, uCropAndFlip, j.class, "187");
          if (obj4 != PatchProxyResult.class) {
             b2 = obj4.booleanValue();
          }else if(uCropAndFlip.z == null && uCropAndFlip.m.o().startRecordingWithConfig(uod, uob)){
             i3 = 1;
          }else {
             i3 = 0;
          }
          b2 = i3;
          i = (b2)? 1: 0;
          if (i) {
             uCropAndFlip.r.J0(b1);
          }
          i1 = i;
       }
       return i1;
    }
    public final void Z1(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, j.class, "66")) {
          return;
       }
       int i = 0;
       Object[] objArray1 = new Object[i];
       q1.C().w("CameraSDK", "switchMultiCamera", objArray1);
       j to = this.o;
       j tm = this.m;
       if (tm == null || to == null) {
          Object[] objArray2 = new Object[i];
          q1.C().w("CameraSDK", "camera is closed", objArray2);
          return;
       }else {
          Daenerys uDaenerys = Daenerys.class;
          if (!PatchProxy.applyVoid(objArray, tm, uDaenerys, "16")) {
             Log.i("Daenerys", "switchMainAndSubVideoSurfaceView");
             if (!PatchProxy.applyVoid(objArray, tm, uDaenerys, "22")) {
                Log.i("Daenerys", "switchMainViewAndSubView");
                if (tm.k == null) {
                   Daenerys p = tm.p;
                   _monitor_enter(p);
                   if (tm.q != null) {
                      Log.i("Daenerys", "switchMainViewAndSubView renderThreadDisposed");
                      _monitor_exit(p);
                   }else if(tm.n.get(Integer.valueOf(i)) != null && tm.n.get(Integer.valueOf(1)) != null){
                      tm.n.get(Integer.valueOf(i)).release();
                      tm.n.remove(Integer.valueOf(i));
                      tm.o.remove(Integer.valueOf(i));
                      tm.n.get(Integer.valueOf(1)).release();
                      tm.n.remove(Integer.valueOf(1));
                      tm.o.remove(Integer.valueOf(1));
                      tm.L(tm.o.get(Integer.valueOf(i)), 1);
                      tm.L(tm.o.get(Integer.valueOf(1)), i);
                      _monitor_exit(p);
                   }else {
                      Log.i("Daenerys", "did not find pipeline0\'s view or pipeline1\'s view");
                      _monitor_exit(p);
                   }
                }
             }
          }
          to.setMainDeviceWithSourceId(tm.s(this.I));
          return;
       }
    }
    public void a(AudioProcessor p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "153")) {
          return;
       }
       if (this.m != null && p0 != null) {
          j tm = this.m;
          Objects.requireNonNull(tm);
          if (!PatchProxy.applyVoidOneRefs(p0, tm, Daenerys.class, "25")) {
             tm.y(new c(tm, p0));
          }
       }
       return;
    }
    public void a0(DynamicExtractFrameProcessor p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "219")) {
          return;
       }
       if (this.m == null) {
          return;
       }
       if (p0 != null) {
          this.m.w(p0, GlProcessorGroup.kMainGroup);
       }
       return;
    }
    public void a1(){
       if (PatchProxy.applyVoid(null, this, j.class, "60")) {
          return;
       }
       if (this.z == null) {
          this.C = false;
          this.M1(false, false);
       }
       return;
    }
    public void a2(){
       if (PatchProxy.applyVoid(null, this, j.class, "228")) {
          return;
       }
       j tr = this.r;
       if (tr != null) {
          tr.S0();
       }
       return;
    }
    public void b(j$p p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "204")) {
          return;
       }
       if (this.u0.a() || Thread.currentThread() != this.u0.a) {
          this.u0.b(new j(p0));
       }else {
          p0.run();
       }
       return;
    }
    public void b0(){
       if (PatchProxy.applyVoid(null, this, j.class, "50")) {
          return;
       }
       this.E(false);
       return;
    }
    public void b1(){
       if (PatchProxy.applyVoid(null, this, j.class, "134")) {
          return;
       }
       if (this.z == null && this.a0 != null) {
          if (this.m != null) {
             this.m.x(this.a0, GlProcessorGroup.kPreviewGroup);
          }
          this.a0.release();
          this.a0 = null;
       }
       this.V = null;
       return;
    }
    public final void b2(boolean p0,int p1){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, oj, "139")) {
          return;
       }
       if (!p0 && this.e0 == null) {
          this.e0 = new CropAndFlipProcessor();
          this.m.c(this.e0, GlProcessorGroup.kCaptureImageGroup);
       }
       this.c2(p0, p1, this.e0);
       return;
    }
    public void beginConfiguration(){
       if (PatchProxy.applyVoid(null, this, j.class, "167")) {
          return;
       }
       if (this.z == null && this.o != null) {
          this.o.beginConfiguration();
       }
       return;
    }
    public Westeros c(){
       return this.a;
    }
    public void c0(s1 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "184")) {
          return;
       }
       if (this.L.isEmpty()) {
          return;
       }
       this.L.remove(p0);
       if (this.L.isEmpty() && this.M.isEmpty()) {
          this.O1(false, false);
       }
       return;
    }
    public void c1(){
       if (PatchProxy.applyVoid(null, this, j.class, "214")) {
          return;
       }
       Object[] objArray = new Object[0];
       q1.C().s("CameraSDK", "stopProvideGeneralRecog", objArray);
       this.Y = null;
       j tc = this.c;
       if (tc != null && tc.a() instanceof YcnnPlugin) {
          this.c.a().stopProvideGeneralRecog();
       }
       return;
    }
    public final void c2(boolean p0,int p1,CropAndFlipProcessor p2){
       if (PatchProxy.isSupport(j.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Integer.valueOf(p1), p2, this, j.class, "141")) {
          return;
       }
       if (p2 != null) {
          if ((Math.abs((p1 / 90)) % 2) == 1) {
             p2.d(true, true);
             p2.f((p0 ^ true), true);
          }else {
             p2.d(p0, true);
             p2.f(false, true);
          }
       }
       return;
    }
    public void closeSubCamera(){
       if (PatchProxy.applyVoid(null, this, j.class, "78")) {
          return;
       }
       this.O = false;
       j tG = this.G;
       if (tG != null && tG.s0 != null) {
          return;
       }
       if (this.z == null && this.o != null) {
          this.o.closeSubCamera();
       }
       return;
    }
    public void commitConfiguration(){
       if (PatchProxy.applyVoid(null, this, j.class, "168")) {
          return;
       }
       if (this.z == null && this.o != null) {
          this.o.commitConfiguration();
       }
       return;
    }
    public boolean d(){
       return this.P;
    }
    public void d0(CameraController$d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "105")) {
          return;
       }
       this.x.remove(p0);
       return;
    }
    public void d1(){
       if (PatchProxy.applyVoid(null, this, j.class, "64")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       q1.C().w("CameraSDK", "switchCamera", objArray);
       if (this.z == null && (this.G != null && this.o != null)) {
          if (this.isMultiCamera()) {
             this.Z1();
             return;
          }else {
             int i1 = this.isFrontCamera() ^ 0x01;
             Object[] objArray1 = new Object[i];
             q1.C().w("CameraSDK", "switch to front:"+i1, objArray1);
             this.o.switchCamera(i1);
          }
       }
       return;
    }
    public void dispose(){
       Object[] objArray;
       Object[] objArray1;
       j j;
       boolean b = this;
       k1 ok1 = k1.class;
       if (PatchProxy.applyVoid(null, b, j.class, "21")) {
          return;
       }
       boolean b1 = true;
       b.A = b1;
       this.Y();
       if (b.m != null && b.p0 != null) {
          b.m.x(b.p0.b(), GlProcessorGroup.kMainGroup);
          b.p0.f();
          b.p0.c();
          b.p0 = null;
       }
       if (b.m != null && b.o0 != null) {
          b.m.x(b.o0.a(), GlProcessorGroup.kPreviewGroup);
          j o0 = b.o0;
          Objects.requireNonNull(o0);
          if (!PatchProxy.applyVoid(null, o0, ok1, "2")) {
             objArray = new Object[0];
             q1.C().s("FacesDetectTracer", "stop", objArray);
             o0.a.setFacesArrayListener(null);
             o0.a.stop();
          }
          b.o0.b(null, null);
          o0 = b.o0;
          Objects.requireNonNull(o0);
          if (!PatchProxy.applyVoid(null, o0, ok1, "3")) {
             objArray1 = new Object[0];
             q1.C().s("FacesDetectTracer", "release", objArray1);
             o0.a.release();
          }
          b.o0 = null;
       }
       if (b.m != null) {
          b.m.F(null);
       }
       objArray = new Object[0];
       q1.C().w("CameraSDK", "dispose", objArray);
       b.H = null;
       b.w = null;
       b.v = null;
       _monitor_enter(this);
       this.I1();
       b.z = b1;
       b.I0 = false;
       j r = b.r;
       if (r != null) {
          r.release();
          b.r = new a();
       }
       if (b.o != null) {
          b.o.dispose();
          b.o = null;
       }
       r = b.p;
       if (r != null) {
          Objects.requireNonNull(r);
          if (!PatchProxy.applyVoid(null, r, a.class, "4")) {
             r.a(r.d);
             r.d = null;
          }
          b.p = null;
       }
       r = b.f;
       if (r != null && r.getFaceMagicController() != null) {
          FaceMagicController.removeFaceMagicLoadEffectFailedListener(b.u.b());
       }
       if (a.a().c() && b.f != null) {
          FaceMagicController.enableAlertBox(0);
          CGEAlertBoxUtil.setCGEAlertBoxListener(null);
       }
       if (b.a != null) {
          objArray1 = new Object[0];
          q1.C().w("CameraSDK", "mWesteros.dispose\(\)", objArray1);
          b.a.getDaenerys().J(null);
          b.a.setStatsListener(null);
          b.a.setOnEventListener(null);
          j f = b.f;
          j b2 = b.b;
          j k = b.k;
          j c = b.c;
          j d = b.d;
          j h = b.h;
          r = b.i;
          j e = b.e;
          j g = b.g;
          j = b.j;
          b.f = null;
          b.i0 = b.j0;
          b.j0 = null;
          b.b = null;
          b.k = null;
          b.c = null;
          b.d = null;
          b.h = null;
          b.y = null;
          b.i = null;
          b.e = null;
          b.g = null;
          b.j = null;
          b.a.setFaceDetectorContext(null);
          d0 uod0 = objArray1;
          d0 uod01 = new d0(j, f, g, b2, k, c, d, h, r, e);
          b.a.dispose(uod0);
          b.a = null;
          b.m = null;
          b.n = false;
          if (!PatchProxy.applyVoid(null, b, j.class, "25")) {
             b.m0 = null;
             r = b.l0;
             if (r != null) {
                r.l();
                b.l0 = null;
             }
          }
       }
       b.U.c();
       r = b.a0;
       if (r != null) {
          r.release();
          b.a0 = null;
       }
       r = b.b0;
       if (r != null) {
          r.release();
          b.b0 = null;
       }
       r = b.e0;
       if (r != null) {
          r.release();
          b.e0 = null;
       }
       r = b.c0;
       if (r != null) {
          r.release();
          b.c0 = null;
       }
       r = b.d0;
       if (r != null) {
          r.release();
          b.d0 = null;
       }
       b.A = false;
       _monitor_exit(this);
       return;
    }
    public f e(){
       return this.I;
    }
    public void e0(){
       if (PatchProxy.applyVoid(null, this, j.class, "162")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       q1.C().w("CameraSDK", "setBeautifyExternalModelPath", objArray);
       if (Category.MAGIC_YCNN_SKIN_COLOR_DETECTION_V2.f() && (this.r == null || this.z != null)) {
          Object[] objArray1 = new Object[i];
          q1.C().A("CameraSDK", "setYlabMap, isResourceFileExist false or camera sdk disposed", objArray1);
          return;
       }else {
          this.r.P(this.q1());
          return;
       }
    }
    public void e1(a$e p0,int p1,int p2,DisplayLayout p3,TakePictureSource p4,CaptureImageMode p5,int p6,boolean p7){
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),p3,p4,p5,Integer.valueOf(p6),Boolean.valueOf(p7)};
          if (PatchProxy.applyVoid(objArray, this, oj, "130")) {
             return;
          }
       }
       if (this.z != null || !this.isMultiCamera()) {
          p0.a(ErrorCode$Result.kCameraDisconnectError);
          return;
       }else {
          this.b2(p7, p6);
          if (p1 < 0 || p2 < 0) {
             p1 = 0;
             p2 = 0;
          }
          Object[] objArray1 = new Object[0];
          q1.C().w("CameraSDK", "ÅÄÕÕ£¬width = "+p1+", height = "+p2+", displayLayout = "+p3+", source = "+p4+", captureImageMode = "+p5, objArray1);
          b uob = new b(p1, p2, p3);
          if (this.X != null) {
             uob.d = 3;
          }
          uob.e = true;
          this.m.k().a(uob, p0);
          return;
       }
    }
    public void f(j$p p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "203")) {
          return;
       }
       if (this.u0.a() || Looper.getMainLooper() != Looper.myLooper()) {
          this.u0.b(new c(p0));
       }else {
          p0.run();
       }
       return;
    }
    public void f0(Business p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "220")) {
          return;
       }
       q1 oq1 = q1.C();
       StringBuilder str = "setBusiness to ";
       String str1 = (p0 == null)? "null": p0.name();
       Object[] objArray = new Object[0];
       oq1.w("CameraSDK", str+str1, objArray);
       this.B0 = p0;
       this.u0.c(new u(this, p0));
       return;
    }
    public boolean f1(g p0,int p1,int p2,DisplayLayout p3,TakePictureSource p4,CaptureImageMode p5,int p6){
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),p3,p4,p5,Integer.valueOf(p6)};
          Object obj = PatchProxy.apply(objArray, this, oj, "128");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }else {
          int i = this;
       }
       return this.g1(p0, p1, p2, p3, p4, p5, p6, true);
    }
    public void fallbackPictureCaptureConfig(TakePictureStats p0){
    }
    public void finalize(){
       if (PatchProxy.applyVoid(null, this, j.class, "185")) {
          return;
       }
       super.finalize();
       Object[] objArray = new Object[0];
       q1.C().w("CameraSDK", "CameraSDK finalize", objArray);
       return;
    }
    public void g(DynamicExtractFrameProcessor p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "218")) {
          return;
       }
       if (this.m == null) {
          return;
       }
       if (p0 != null) {
          this.m.b(p0, GlProcessorGroup.kMainGroup);
       }
       return;
    }
    public void g0(a p0){
       this.D = p0;
    }
    public boolean g1(g p0,int p1,int p2,DisplayLayout p3,TakePictureSource p4,CaptureImageMode p5,int p6,boolean p7){
       int i4;
       int i5;
       int i6;
       b obj2;
       boolean b;
       Object obj = this;
       object oobject = p0;
       object oobject1 = p3;
       object oobject2 = p4;
       object oobject3 = p5;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       j oj = j.class;
       int i = 5;
       int i1 = 4;
       int i2 = 3;
       int i3 = 2;
       if (PatchProxy.isSupport(oj)) {
          Object[] objArray = new Object[]{oobject,Integer.valueOf(p1),Integer.valueOf(p2),oobject1,oobject2,oobject3,Integer.valueOf(p6),Boolean.valueOf(p7)};
          Object obj1 = PatchProxy.apply(objArray, obj, oj, "129");
          if (obj1 != patchProxyRe) {
             return obj1.booleanValue();
          }
       }
       Bitmap uBitmap = null;
       if (obj.z != null) {
          oobject.b(uBitmap);
          return 0;
       }else {
          obj.b2(p7, p6);
          if (p1 < 0 || p2 < 0) {
             i4 = 0;
             i5 = 0;
          }else {
             i5 = p1;
             i4 = p2;
          }
          Object[] objArray1 = new Object[0];
          q1.C().w("CameraSDK", "ÅÄÕÕ£¬width = "+i5+", height = "+i4+", displayLayout = "+oobject1+", source = "+oobject2+", captureImageMode = "+oobject3, objArray1);
          if (obj.U(oobject2)) {
             if (PatchProxy.isSupport(oj)) {
                i6 = i4;
                if (!PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(i5), Integer.valueOf(i4), p3, this, j.class, "137")) {
                }
             }else {
                i6 = i4;
             }
          }else {
             i6 = i4;
             if (PatchProxy.isSupport(oj)) {
                Object[] objArray3 = new Object[i];
                objArray3[0] = oobject;
                objArray3[1] = Integer.valueOf(i5);
                objArray3[2] = Integer.valueOf(i6);
                objArray3[3] = oobject1;
                objArray3[4] = oobject3;
                obj2 = PatchProxy.apply(objArray3, obj, oj, "135");
                if (obj2 != patchProxyRe) {
                   b = obj2.booleanValue();
                label_016d :
                   if (!b) {
                      oobject.b(null);
                      return 0;
                   }
                }
             }
             Object[] objArray2 = new Object[0];
             q1.C().w("CameraSDK", "½ØÆÁÅÄÕÕ£¬ width "+i5+"£¬ height "+i6, objArray2);
             obj2 = new b(i5, i6, oobject1);
             if (obj.X != null) {
                obj2.d = 3;
             }
             obj.m.k().a(obj2, new n0(obj, oobject));
             b = true;
             goto label_016d ;
          }
       label_0174 :
          return 1;
       }
    }
    public float getAECompensation(){
       Object obj = PatchProxy.apply(null, this, j.class, "147");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       if (this.z != null || this.o == null) {
          return 0;
       }
       return this.o.getAECompensation();
    }
    public AFAEController$AFAEMode getAFAEMode(){
       Object obj = PatchProxy.apply(null, this, j.class, "142");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.z != null || this.o == null) {
          return AFAEController$AFAEMode.Auto;
       }
       return this.o.getAFAEMode();
    }
    public Camera getCamera(){
       Object obj = PatchProxy.apply(null, this, j.class, "73");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.z == null && this.o != null) {
          return this.o.getCamera();
       }
       return null;
    }
    public CameraApiVersion getCameraApiVersion(){
       Object obj = PatchProxy.apply(null, this, j.class, "95");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.z != null || this.o == null) {
          return null;
       }
       return this.o.getCameraApiVersion();
    }
    public k getCameraCaptureSize(){
       Object obj = PatchProxy.apply(null, this, j.class, "96");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.z != null || this.o == null) {
          return null;
       }
       return this.o.getCameraCaptureSize();
    }
    public int getCameraOrientation(){
       Object obj = PatchProxy.apply(null, this, j.class, "63");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.z != null || this.o == null) {
          return 0;
       }
       return this.o.getCameraOrientation();
    }
    public CaptureDeviceType getCaptureDeviceType(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, j.class, "69");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.z == null && this.o != null) {
          objArray = this.o.getCaptureDeviceType();
       }
       if (objArray == null) {
          objArray = CaptureDeviceType.kCaptureDeviceTypeBuiltInWideAngleCamera;
       }
       return objArray;
    }
    public DaenerysCaptureConfig getConfig(){
       Object obj = PatchProxy.apply(null, this, j.class, "101");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.z != null || this.o == null) {
          return null;
       }
       return this.o.getConfig();
    }
    public DaenerysCaptureConfig getDaenerysCaptureConfig(){
       Object obj = PatchProxy.apply(null, this, j.class, "108");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.z == null && this.o != null) {
          return this.o.getDaenerysCaptureConfig();
       }
       return null;
    }
    public boolean getEnableHdr(){
       Object obj = PatchProxy.apply(null, this, j.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.z != null) {
          return b;
       }
       if (this.o != null && this.o.getEnableHdr()) {
          b = true;
       }
       return b;
    }
    public float getExposureValueStep(){
       Object obj = PatchProxy.apply(null, this, j.class, "150");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       if (this.z != null || this.o == null) {
          return 0;
       }
       return this.o.getExposureValueStep();
    }
    public FlashController$FlashMode getFlashMode(){
       FlashController$FlashMode obj = PatchProxy.apply(null, this, j.class, "118");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.z != null || this.o == null)? FlashController$FlashMode.FLASH_MODE_OFF: this.o.getFlashMode();
       return obj;
    }
    public float getFocalLength(){
       Object obj = PatchProxy.apply(null, this, j.class, "102");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       if (this.z != null || this.o == null) {
          return 0;
       }
       return this.o.getFocalLength();
    }
    public float getHorizontalViewAngle(){
       Object obj = PatchProxy.apply(null, this, j.class, "103");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       if (this.z != null || this.o == null) {
          return 0;
       }
       return this.o.getHorizontalViewAngle();
    }
    public boolean getLowLightBoostEnabled(){
       Object obj = PatchProxy.apply(null, this, j.class, "80");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.z == null && this.o != null) {
          return this.o.getLowLightBoostEnabled();
       }
       return false;
    }
    public int getMaxAECompensation(){
       Object obj = PatchProxy.apply(null, this, j.class, "148");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.z != null || this.o == null) {
          return 0;
       }
       return this.o.getMaxAECompensation();
    }
    public float getMaxZoom(){
       Object obj = PatchProxy.apply(null, this, j.class, "121");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       if (this.z != null || this.o == null) {
          return 0x3f800000;
       }
       return this.o.getMaxZoom();
    }
    public int getMaxZoomSteps(){
       Object obj = PatchProxy.apply(null, this, j.class, "120");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.z != null || this.o == null) {
          return 1;
       }
       return this.o.getMaxZoomSteps();
    }
    public int getMinAECompensation(){
       Object obj = PatchProxy.apply(null, this, j.class, "149");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.z != null || this.o == null) {
          return 0;
       }
       return this.o.getMinAECompensation();
    }
    public float getMinZoom(){
       Object obj = PatchProxy.apply(null, this, j.class, "122");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       if (this.z != null || this.o == null) {
          return 0x3f800000;
       }
       return this.o.getMinZoom();
    }
    public long getNativeCameraController(){
       Object obj = PatchProxy.apply(null, this, j.class, "72");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (this.z == null && this.o != null) {
          return this.o.getNativeCameraController();
       }
       return 0;
    }
    public k getPictureSize(){
       Object obj = PatchProxy.apply(null, this, j.class, "99");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.z != null || this.o == null) {
          return null;
       }
       return this.o.getPictureSize();
    }
    public k[] getPictureSizes(){
       k[] obj = PatchProxy.apply(null, this, j.class, "100");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.z == null && this.o != null) {
          return this.o.getPictureSizes();
       }
       obj = new k[0];
       return obj;
    }
    public k getPreviewSize(){
       Object obj = PatchProxy.apply(null, this, j.class, "94");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.z != null || this.o == null) {
          return null;
       }
       return this.o.getPreviewSize();
    }
    public k[] getPreviewSizes(){
       k[] obj = PatchProxy.apply(null, this, j.class, "97");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.z == null && this.o != null) {
          return this.o.getPreviewSizes();
       }
       obj = new k[0];
       return obj;
    }
    public k[] getRecordingSizes(){
       k[] obj = PatchProxy.apply(null, this, j.class, "98");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.z == null && this.o != null) {
          return this.o.getRecordingSizes();
       }
       obj = new k[0];
       return obj;
    }
    public CameraController$CameraState getState(){
       Object obj = PatchProxy.apply(null, this, j.class, "181");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.z != null || this.o == null) {
          return CameraController$CameraState.ClosingState;
       }
       return this.o.getState();
    }
    public FlashController$FlashMode[] getSupportedFlashModes(){
       FlashController$FlashMode[] obj = PatchProxy.apply(null, this, j.class, "116");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.z == null && this.o != null) {
          return this.o.getSupportedFlashModes();
       }
       obj = new FlashController$FlashMode[0];
       return obj;
    }
    public DaenerysCaptureStabilizationMode getVideoStabilizationMode(){
       Object obj = PatchProxy.apply(null, this, j.class, "85");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.z == null && this.o != null) {
          return this.o.getVideoStabilizationMode();
       }
       return DaenerysCaptureStabilizationMode.kStabilizationModeOff;
    }
    public float getZoom(){
       Object obj = PatchProxy.apply(null, this, j.class, "123");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       if (this.z != null || this.o == null) {
          return 0x3f800000;
       }
       return this.o.getZoom();
    }
    public void h(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "43")) {
          return;
       }
       if (this.z != null) {
          return;
       }
       this.m.c(p0, GlProcessorGroup.kMainGroup);
       return;
    }
    public void h0(int p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oj, "232")) {
          return;
       }
       this.C0 = p0;
       if (this.m != null) {
          oj = this.m;
          Objects.requireNonNull(oj);
          Daenerys uDaenerys = Daenerys.class;
          if (!PatchProxy.isSupport(uDaenerys) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), oj, uDaenerys, "54") && oj.k == null)) {
             oj.nativeSetSubBusiness(oj.c, p0);
          }
       }
       this.V1();
       return;
    }
    public void h1(int p0,int p1){
       j tc0;
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, oj, "110")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       q1.C().w("CameraSDK", "updateCropSize width "+p0+" height "+p1+",isPreviewLayerFaceMagicSelected:"+this.J0, objArray);
       if (this.z == null && this.m != null) {
          if (!p0 || !p1) {
             i = 1;
          }
          if (!i) {
             if (this.J0 == null) {
                if (this.b0 == null) {
                   this.b0 = new CropAndFlipProcessor();
                   this.m.f(this.b0, GlProcessorGroup.kMainGroup);
                }
                this.b0.c(((float)p1 / (float)p0));
             }else if(this.c0 == null){
                this.c0 = new CropAndFlipProcessor();
                this.m.f(this.c0, GlProcessorGroup.kPreviewGroup);
             }
             if (this.d0 == null) {
                this.d0 = new CropAndFlipProcessor();
                this.m.f(this.d0, GlProcessorGroup.kRecorderGroup);
             }
             float f = (float)p1 / (float)p0;
             this.c0.c(f);
             this.d0.c(f);
          }
          if (i || this.J0 == null) {
             tc0 = this.c0;
             if (tc0 != null) {
                tc0.e(true);
             }
             tc0 = this.d0;
             if (tc0 != null) {
                tc0.e(true);
             }
          }
          if (i || this.J0 != null) {
             tc0 = this.b0;
             if (tc0 != null) {
                tc0.e(true);
             }
          }
       }
    label_00cf :
       this.f0 = p0;
       this.g0 = p1;
       return;
    }
    public boolean hasFlash(){
       Object obj = PatchProxy.apply(null, this, j.class, "119");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.z == null && (this.o != null && this.o.hasFlash()))? true: false;
       return b;
    }
    public void i(s1 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "183")) {
          return;
       }
       this.r1(p0, false);
       return;
    }
    public void i0(String p0){
       this.k0 = p0;
    }
    public final CameraController i1(DaenerysCaptureConfig p0,c p1){
       Object[] obj4;
       Object obj5;
       DaenerysCaptureConfig uDaenerysCap;
       object oobject;
       boolean b1;
       CameraApiVersion kAndroidCame;
       int b2;
       Object[] obj = this;
       Object obj1 = p0;
       Object obj2 = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       j obj3 = PatchProxy.applyTwoRefs(obj1, obj2, obj, j.class, "192");
       if (obj3 != patchProxyRe) {
          return obj3;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       q1.C().s("CameraSDK", "createCameraController apiVersion: "+p0.getCameraApiVersion(), objArray);
       obj3 = obj.s;
       j b0 = obj.B0;
       j c0 = obj.C0;
       j n = obj.N;
       int i1 = 1;
       boolean b = (obj.O != null || obj2.s0 != null)? true: false;
       a uoa = g1.b(obj2, b0, c0, n, b);
       j$b uob = new j$b(obj, obj2);
       EglBase$Context uContext = obj.m1(obj2.h0);
       j$c uoc = new j$c(obj);
       b uob1 = b.class;
       int i2 = 3;
       int i3 = 2;
       boolean i4 = 6;
       if (PatchProxy.isSupport(uob1)) {
          Object[] objArray1 = new Object[i4];
          objArray1[i] = obj3;
          objArray1[i1] = obj1;
          objArray1[i3] = uoa;
          objArray1[i2] = uob;
          objArray1[4] = uContext;
          objArray1[5] = uoc;
          obj4 = null;
          obj5 = PatchProxy.apply(objArray1, obj4, uob1, "3");
          if (obj5 != patchProxyRe) {
          label_040b :
             if (obj2.t0 != null) {
                obj5.setCameraFirstFrameUndroppable(true);
             }
             obj5.setOnCameraInitTimeCallback(new j$d(this));
             return obj5;
          }
       }else {
          obj4 = null;
       }
       obj5 = PatchProxy.applyTwoRefs(uoa, obj1, obj4, u.class, "5");
       if (obj5 != patchProxyRe) {
          uDaenerysCap = obj5;
       }else {
          a a = uoa.a;
          String str = "DaenerysParameterUtils";
          Log.i(str, "getDaenerysConfig from page "+a.toString());
          if (u.c && (a != Page.kLivePushPage && (a == Page.kLivePreviewPage || a == Page.kDefaultPage))) {
             Log.i(str, "use origin DaenerysCaptureConfig");
             uDaenerysCap = obj1;
          }else if(u.b.get(a).mCaptureConfig.mEnableRecordingHint == i1){
             if (u.b.get(a).mCaptureConfig.mRecordingHintCameraType == null) {
                b1 = true;
             }else if(u.b.get(a).mCaptureConfig.mRecordingHintCameraType == i1){
                b1 = true;
             label_0109 :
                i4 = false;
             label_010a :
                CameraOutputDataType kCameraOutpu = CameraOutputDataType.kCameraOutputDataTypeYuv;
                CaptureConfig mCameraOutpu = u.b.get(a).mCaptureConfig.mCameraOutputDataType;
                if (mCameraOutpu != null) {
                   if (mCameraOutpu != i1) {
                      if (mCameraOutpu == i3) {
                         kCameraOutpu = CameraOutputDataType.kCameraOutputDataTypeBothYuvAndTexture;
                      }
                   }else {
                      kCameraOutpu = CameraOutputDataType.kCameraOutputDataTypeTexture;
                   }
                }
                CameraOutputDataType uCameraOutpu = kCameraOutpu;
                a w = uoa.w;
                if (w != i1) {
                   if (w != i3) {
                      if (w != 3) {
                         if (w != 4) {
                            if (w != 5) {
                               kAndroidCame = (w != 100)? CameraApiVersion.kAndroidCamera1: CameraApiVersion.kAndroidCameraAuto;
                            }else {
                               kAndroidCame = CameraApiVersion.kAndroidCameraVivo;
                            }
                         }else {
                            kAndroidCame = CameraApiVersion.kAndroidCameraUnit;
                         }
                      }else {
                         kAndroidCame = CameraApiVersion.kAndroidCameraKit;
                      }
                   }else {
                      kAndroidCame = CameraApiVersion.kAndroidCamera2;
                   }
                }else {
                   kAndroidCame = CameraApiVersion.kAndroidCamera1;
                }
                DaenerysCaptureConfig$b uob2 = DaenerysConfigBuilder.defaultCaptureConfigBuilder();
                uob2.a(kAndroidCame);
                uob2.F(uoa.x);
                uob2.D(uoa.y);
                uob2.J(uoa.m);
                w = uoa.z;
                if (w <= null) {
                   b2 = Math.max(uoa.x, uoa.y);
                }
                uob2.E(w);
                uob2.s(b1);
                uob2.r(i4);
                uob2.h(u.d(uoa.E));
                uob2.g(u.d(uoa.F));
                uob2.d(u.c(uoa.C));
                uob2.c(u.c(uoa.D));
                uob2.i(uoa.p);
                uob2.K(uoa.q);
                uob2.G(true);
                uob2.l(uoa.r);
                uob2.z(uoa.s);
                uob2.b(uCameraOutpu);
                uob2.w(uoa.t);
                uob2.o(uoa.u);
                b1 = -1;
                if (u.b.get(a).mCaptureConfig.mEnableOppoFrontVideoMode != b1) {
                   b2 = (u.b.get(a).mCaptureConfig.mEnableOppoFrontVideoMode == 1)? true: false;
                   uob2.q(b2);
                }
                if (u.b.get(a).mCaptureConfig.mCamera2StabilizationResetImagerReader != b1) {
                   b2 = (u.b.get(a).mCaptureConfig.mCamera2StabilizationResetImagerReader == 1)? true: false;
                   uob2.copyOnWrite();
                   uob2.instance.setCamera2StabilizationResetImagerReader(b2);
                }
                if (u.b.get(a).mCaptureConfig.mEnableCameraFallback1v2 != b1) {
                   b2 = (u.b.get(a).mCaptureConfig.mEnableCameraFallback1v2 == 1)? true: false;
                   uob2.copyOnWrite();
                   uob2.instance.setEnableCameraFallback1V2(b2);
                }
                if (u.b.get(a).mExtendConfig.mOppoStartPreviewWaitTimeMs != b1) {
                   uob2.A(u.b.get(a).mExtendConfig.mOppoStartPreviewWaitTimeMs);
                }
                w = uoa.n;
                if (w > null) {
                   uob2.H(w);
                }
                if (uoa.d == Business.kLiveStream) {
                   if (uoa.o != null) {
                      uob2.u(true);
                      w = uoa.A;
                      if (w <= null) {
                         b2 = 0;
                      }
                      uob2.f(w);
                      w = uoa.B;
                      if (w <= null) {
                         b2 = 0;
                      }
                      uob2.e(w);
                   }else {
                      uob2.u(false);
                   }
                }else {
                   w = uoa.A;
                   if (w <= null) {
                      b2 = 0;
                   }
                   uob2.f(w);
                   w = uoa.B;
                   if (w <= null) {
                      b2 = 0;
                   }
                   uob2.e(w);
                }
                if (u.b.get(a).mExtendConfig.mEnableHdr != b1) {
                   b2 = (u.b.get(a).mExtendConfig.mEnableHdr == 1)? true: false;
                   uob2.p(b2);
                }
                if (u.b.get(a).mCaptureConfig.mDisableFaceDetectAutoExposure != b1) {
                   b2 = (u.b.get(a).mCaptureConfig.mDisableFaceDetectAutoExposure == null)? true: false;
                   uob2.n(b2);
                }
                if (u.b.get(a).mExtendConfig.mEnableZeroShutterLagTakePicture != b1) {
                   b2 = (u.b.get(a).mExtendConfig.mEnableZeroShutterLagTakePicture == 1)? true: false;
                   uob2.m(b2);
                }
                if (u.b.get(a).mExtendConfig.mDisableSetAdaptedCameraFps != b1) {
                   b2 = (u.b.get(a).mExtendConfig.mDisableSetAdaptedCameraFps == 1)? true: false;
                   uob2.k(b2);
                }
                if (u.b.get(a).mExtendConfig.mEnableTimeStampCorrect != b1) {
                   b2 = (u.b.get(a).mExtendConfig.mEnableTimeStampCorrect == 1)? true: false;
                   uob2.v(b2);
                }
                if (u.b.get(a).mCaptureConfig.mTargetMinFps != b1) {
                   uob2.I(u.b.get(a).mCaptureConfig.mTargetMinFps);
                }
                uDaenerysCap = 1;
                b2 = (u.b.get(a).mExtendConfig.mEnableCameraUnit == uDaenerysCap && u.b.get(a).mExtendConfig.mEnableSATCamera == uDaenerysCap)? true: false;
                uob2.t(b2);
                uob2.j(u.d);
                uDaenerysCap = uob2.build();
             }else if(u.b.get(a).mCaptureConfig.mRecordingHintCameraType == i3){
                b1 = false;
             }
             i4 = true;
             goto label_010a ;
          }
          b1 = false;
          goto label_0109 ;
       }
       if (PatchProxy.isSupport(uob1)) {
          obj4 = new Object[]{obj3,obj1,uDaenerysCap,uob,uContext,uoc};
          obj = PatchProxy.apply(obj4, null, uob1, "4");
          if (obj != patchProxyRe) {
          }else if(PatchProxy.isSupport(uob1)){
             obj = new Object[]{obj3,obj1,uDaenerysCap,uob,uContext,uoc,oobject};
             oobject = null;
             MultiCameraControllerImpl multiCameraC = PatchProxy.apply(obj, oobject, uob1, "6");
             if (multiCameraC != patchProxyRe) {
             }
          }
          if (b.c(obj3, uDaenerysCap)) {
             MultiCameraControllerImpl multiCameraC1 = new MultiCameraControllerImpl(obj3, p0, uDaenerysCap, uob, uoc, null);
          }else {
             CameraControllerImpl uCameraContr = new CameraControllerImpl(obj3, p0, uDaenerysCap, uob, 0, uContext, 0, uoc, 0);
          }
       }else {
          goto label_03bf ;
       }
       obj5 = obj;
       goto label_040b ;
    }
    public boolean isClosed(){
       return this.z;
    }
    public boolean isFrontCamera(){
       j obj = PatchProxy.apply(null, this, j.class, "170");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.m;
       j to = this.o;
       int i = 0;
       if (this.z == null && (to != null && obj != null)) {
          if (this.isMultiCamera()) {
             if (this.I != null) {
                Object[] objArray = new Object[i];
                q1.C().w("CameraSDK", "isFrontCamera isMultiCamera, mSurfaceView != null", objArray);
                if (!obj.s(this.I)) {
                   i = true;
                }
                return i;
             }else {
                c uoc = this.n();
                Object[] objArray1 = new Object[i];
                q1.C().w("CameraSDK", "isFrontCamera isMultiCamera, parameters is "+uoc, objArray1);
                if (uoc != null && uoc.a != null) {
                   i = true;
                }
                return i;
             }
          }else {
             Object[] objArray2 = new Object[i];
             q1.C().w("CameraSDK", "isFrontCamera single camera", objArray2);
             return to.isFrontCamera();
          }
       }else {
          Object[] objArray3 = new Object[i];
          q1.C().w("CameraSDK", "isFrontCamera default false", objArray3);
          return i;
       }
    }
    public boolean isMultiCamera(){
       Object obj = PatchProxy.apply(null, this, j.class, "53");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.z != null || (this.o != null && (this.o.isMultiCamera() && this.n().s0 != null))) {
          b = true;
       }
    label_002f :
       return b;
    }
    public final boolean isRecording(){
       Object obj = PatchProxy.apply(null, this, j.class, "164");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.q != null && this.q.l())? true: false;
       return b;
    }
    public boolean isZoomSupported(){
       Object obj = PatchProxy.apply(null, this, j.class, "173");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.z == null && (this.o != null && this.o.isZoomSupported()))? true: false;
       return b;
    }
    public void j(CameraController$d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "104")) {
          return;
       }
       if (!this.x.contains(p0)) {
          this.x.add(p0);
          j tv = this.v;
          if (this.z == null && tv != null) {
             p0.O(tv.longValue());
             j tw = this.w;
             if (tw != null) {
                f.c.a("stage_first_frame", System.currentTimeMillis());
                p0.N(tv.longValue(), tw.longValue());
             }
          }
       }
       return;
    }
    public void j0(VEPlugin$OnDirtyLensDetectionListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "207")) {
          return;
       }
       j te = this.e;
       if (te == null) {
          return;
       }
       WesterosPlugin westerosPlug = te.a();
       if (westerosPlug instanceof VEPlugin) {
          westerosPlug.setDirtyLensDetectListener(p0);
       }
       return;
    }
    public void j1(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, j.class, "17")) {
          return;
       }
       this.l();
       l.j = objArray;
       this.u0.c(new s(this));
       return;
    }
    public boolean k(g p0,int p1,int p2,DisplayLayout p3,CaptureImageMode p4){
       int i3;
       int i4;
       boolean b;
       Object obj = this;
       object oobject = p0;
       object oobject1 = p3;
       object oobject2 = p4;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       j oj = j.class;
       int i = 4;
       int i1 = 3;
       int i2 = 5;
       if (PatchProxy.isSupport(oj)) {
          Object[] objArray = new Object[i2];
          objArray[0] = oobject;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[i1] = oobject1;
          objArray[i] = oobject2;
          Object obj1 = PatchProxy.apply(objArray, obj, oj, "131");
          if (obj1 != patchProxyRe) {
             return obj1.booleanValue();
          }
       }
       if (obj.z != null) {
          oobject.b(null);
          return 0;
       }else if(p1 < 0 || p2 < 0){
          i3 = 0;
          i4 = 0;
       }else {
          i3 = p1;
          i4 = p2;
       }
       if (!PatchProxy.applyVoid(null, obj, oj, "138")) {
          obj.b2(1, 0);
       }
       if (PatchProxy.isSupport(oj)) {
          Object[] objArray1 = new Object[i2];
          objArray1[0] = oobject;
          objArray1[1] = Integer.valueOf(i3);
          objArray1[2] = Integer.valueOf(i4);
          objArray1[i1] = oobject1;
          objArray1[i] = oobject2;
          Object obj2 = PatchProxy.apply(objArray1, obj, oj, "136");
          if (obj2 != patchProxyRe) {
             b = obj2.booleanValue();
          }else if(obj.z != null){
             oobject.b(null);
          }else if(i3 < 0 || i4 < 0){
             i3 = 0;
             i4 = 0;
          }
          Object[] objArray2 = new Object[0];
          q1.C().w("CameraSDK", "captureScreenshot£¬ width "+i3+"£¬ height "+i4, objArray2);
          c uoc = new c(i3, i4, oobject1, oobject2);
          if (obj.m == null) {
             Object[] objArray3 = new Object[0];
             q1.C().t("CameraSDK", "mDaenerys is null!", objArray3);
             oobject.b(null);
          }else {
             a uoa = obj.m.k();
             o0 oo0 = new o0(obj, oobject);
             Objects.requireNonNull(uoa);
             if (!PatchProxy.applyVoidTwoRefs(uoc, oo0, uoa, a.class, "7")) {
                a c = uoa.c;
                if (c == null) {
                   oo0.a(ErrorCode$Result.kTakePictureNoMediaRecorder);
                }else if(!c.a(new b(uoa, oo0), uoc.c(), uoc.b(), uoc.a(), uoc.d, false)){
                   oo0.a(ErrorCode$Result.kTakePictureNativeError);
                }
             }
             b = true;
          }
          b = false;
       }else {
          goto label_0086 ;
       }
       if (!b) {
          oobject.b(null);
          return 0;
       }else {
          return 1;
       }
    }
    public void k0(boolean p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oj, "205")) {
          return;
       }
       oj = this.e;
       if (oj == null) {
          return;
       }
       if (!p0 && !oj.b()) {
          return;
       }
       WesterosPlugin westerosPlug = oj.a();
       if (westerosPlug instanceof VEPlugin) {
          westerosPlug.setFeatureEnabledAndParams(VEFeatureType.kDirtylensDetection, p0, null);
       }
       return;
    }
    public final void k1(){
       b1 b1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, j.class, "20")) {
          return;
       }
       boolean b = true;
       this.A = b;
       j tG = this.G;
       if (tG != null) {
          c uoc = tG.f0;
          if (uoc != null && uoc.a != null) {
             this.Y();
          }
       }
       this.r.stop();
       this.z = b;
       j tu0 = this.u0;
       Objects.requireNonNull(tu0);
       if (!PatchProxy.applyVoid(objArray, tu0, b1.class, "7")) {
          b1 = tu0.b;
          if (b1 != null) {
             try{
                b1.removeCallbacksAndMessages(objArray);
             }catch(java.lang.Exception e0){
                Object[] objArray1 = new Object[0];
                q1.C().t("CameraSDKThread", e0.getMessage(), objArray1);
             }
          }
       }
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, j.class, "16")) {
          return;
       }
       Object[] objArray = new Object[0];
       q1.C().w("CameraSDK", "onDestroy\(\) called", objArray);
       this.A = true;
       this.W = null;
       j tG0 = this.G0;
       _monitor_enter(tG0);
       this.I = null;
       this.J = null;
       _monitor_exit(tG0);
       if (this.q != null && this.q.j != null) {
          this.q.j.a2();
       }
       this.q = null;
       this.T = null;
       this.S = null;
       h1.d(null);
       this.k1();
       tG0 = this.H0;
       Objects.requireNonNull(tG0);
       if (!PatchProxy.applyVoid(null, tG0, c.class, "3")) {
          k1.o(new a(tG0));
       }
       return;
    }
    public boolean l0(String p0){
       j obj = PatchProxy.applyOneRefs(p0, this, j.class, "206");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a;
       if (obj == null) {
          return false;
       }
       ResourceManager resourceMana = obj.getResourceManager();
       if (resourceMana == null) {
          return false;
       }
       resourceMana.setDirtyLensDetectModelPath(p0);
       return true;
    }
    public Daenerys l1(){
       return this.m;
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, j.class, "18")) {
          return;
       }
       if (this.z != null) {
          return;
       }
       Object[] objArray = new Object[0];
       q1.C().w("CameraSDK", "closeCameraAndStoreStatus", objArray);
       this.L1();
       this.stopPreview();
       this.S = this.r.O0();
       this.k1();
       return;
    }
    public void m0(boolean p0){
       this.Q = p0;
    }
    public final EglBase$Context m1(EglBase$Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          this.m0 = p0;
       }
       j tm0 = this.m0;
       if (tm0 != null) {
          return tm0;
       }else if(this.l0 == null){
          this.l0 = EglBase.b(null);
       }
       tm0 = this.l0.i();
       this.m0 = tm0;
       return tm0;
    }
    public void markNextFramesToCapture(long p0,int p1){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Integer.valueOf(p1), this, oj, "76")) {
          return;
       }
       if (this.z == null && this.o != null) {
          this.o.markNextFramesToCapture(p0, p1);
       }
       return;
    }
    public boolean mirrorFrontCamera(){
       Object obj = PatchProxy.apply(null, this, j.class, "171");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.o.mirrorFrontCamera();
    }
    public c n(){
       j tG = this.G;
       if (tG != null) {
       }else {
          tG = this.H;
       }
       return tG;
    }
    public void n0(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "33")) {
          return;
       }
       j tr = this.r;
       if (tr == null) {
          return;
       }
       tr.Y0(new j$m(this, p0));
       return;
    }
    public FaceDetectorContext n1(){
       Object obj = PatchProxy.apply(null, this, j.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.U.d();
    }
    public FaceMagicController o(){
       Object[] objArray = null;
       j obj = PatchProxy.apply(objArray, this, j.class, "231");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.z == null) {
          obj = this.f;
          if (obj != null) {
             objArray = obj.getFaceMagicController();
          }
       }
       return objArray;
    }
    public void o0(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "39")) {
          return;
       }
       j tr = this.r;
       if (tr == null) {
          return;
       }
       tr.Z0(new j0(this, p0));
       return;
    }
    public ILiveImageHelper o1(){
       return this.r;
    }
    public void openSubCamera(){
       if (PatchProxy.applyVoid(null, this, j.class, "77")) {
          return;
       }
       this.O = true;
       if (this.z == null && (this.o != null && this.m != null)) {
          if (!this.m.r()) {
             this.m.g();
          }
          this.o.openSubCamera();
       }
    label_0031 :
       return;
    }
    public String p(){
       FaceMagicController obj = PatchProxy.apply(null, this, j.class, "221");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.o();
       if (obj != null) {
          return obj.getSDKPerformanceData();
       }
       return null;
    }
    public void p0(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "40")) {
          return;
       }
       j tr = this.r;
       if (tr == null) {
          return;
       }
       tr.G0(new j$n(this, p0));
       return;
    }
    public final b p1(){
       j obj = PatchProxy.apply(null, this, j.class, "199");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.q == null && this.z == null) {
          obj = this.G;
          if (obj != null && obj.u != null) {
             this.q = new b(this.h0, obj.j(), this.G.h());
             Object[] objArray = new Object[0];
             q1.C().w("CameraSDK", "new RecorderHelper "+this.h0.hashCode(), objArray);
             Iterator iterator = this.K.iterator();
             while (iterator.hasNext()) {
                this.q.G(iterator.next());
             }
             this.q.g = this.G.b;
          }
       }
       return this.q;
    }
    public j q(){
       return this.r;
    }
    public void q0(boolean p0,r1 p1){
       boolean b;
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, oj, "114")) {
          return;
       }
       if (this.o != null) {
          oj = this.G;
          if (oj != null && oj.k(true) == this.getCameraApiVersion()) {
             oj = this.G;
             Objects.requireNonNull(oj);
             Object obj = PatchProxy.apply(null, oj, c.class, "2");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else if(oj.L != null && oj.k(true) == CameraApiVersion.kAndroidCameraUnit){
                b = true;
             }else {
                b = false;
             }
             if (b && this.G.b0 != null) {
                oj = this.a;
                if (oj != null) {
                   if (p0) {
                      oj.setFeatureEnabled(FeatureType.kBacklightDetection, true);
                      this.a.setOnBacklightDetectListener(new j$o(this, p1));
                   }else {
                      oj.setFeatureEnabled(FeatureType.kBacklightDetection, false);
                      this.a.setOnLowLightDetectionListener(null);
                   }
                }
             }
          }
       }
    label_007b :
       return;
    }
    public final Map q1(){
       Category mAGIC_YCNN_S;
       String str;
       d uod = d.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       j obj = PatchProxy.apply(objArray, this, j.class, "161");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (!s6.G()) {
          Map map = PatchProxy.apply(objArray, objArray, uod, "6");
          if (map != patchProxyRe) {
          }else {
             map = MagicEmojiResourceHelper.m();
             mAGIC_YCNN_S = Category.MAGIC_YCNN_SKIN_COLOR_DETECTION_V2;
             if (mAGIC_YCNN_S.f()) {
                map.put(mAGIC_YCNN_S.getResourceName(), mAGIC_YCNN_S.getResourceDir());
             }
          }
          return map;
       }else if(this.N0 == null){
          this.N0 = new HashMap();
       }
       obj = this.N0;
       HashMap hashMap = PatchProxy.applyOneRefs(obj, objArray, uod, "7");
       if (hashMap != patchProxyRe) {
       }else {
          hashMap = new HashMap();
          Iterator iterator = MagicEmojiResourceHelper.a.values().iterator();
          while (iterator.hasNext()) {
             b uob = iterator.next();
             String resourceName = uob.getResourceName();
             if (obj.get(resourceName) != null) {
                str = obj.get(resourceName);
             }else if(uob.f()){
                str = uob.getResourceDir();
             }else {
                str = objArray;
             }
             if (!TextUtils.x(str)) {
                hashMap.put(resourceName, str);
             }
          }
          mAGIC_YCNN_S = Category.MAGIC_YCNN_SKIN_COLOR_DETECTION_V2;
          if (obj.get(mAGIC_YCNN_S.getResourceName()) != null || mAGIC_YCNN_S.f()) {
             hashMap.put(mAGIC_YCNN_S.getResourceName(), mAGIC_YCNN_S.getResourceDir());
          }
       }
       this.N0 = hashMap;
       return hashMap;
    }
    public void r(s1 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "182")) {
          return;
       }
       this.r1(p0, true);
       return;
    }
    public void r0(boolean p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oj, "55")) {
          return;
       }
       oj = this.m;
       if (oj == null) {
          return;
       }
       oj.C(p0);
       return;
    }
    public final void r1(s1 p0,boolean p1){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, oj, "217")) {
          return;
       }
       oj = (p1)? this.M: this.L;
       if (oj.contains(p0)) {
          return;
       }else if(this.M.isEmpty() && this.L.isEmpty()){
          this.v0 = null;
       }
       j tv0 = this.v0;
       if (p1 && tv0 != null) {
          p0.onLowLightDetectorResult(tv0.booleanValue());
          return;
       }else {
          oj.add(p0);
          this.O1(true, (p1 ^ 0x01));
          if (!p1 && tv0 != null) {
             p0.onLowLightDetectorResult(tv0.booleanValue());
          }
          return;
       }
    }
    public void resumePreview(){
       if (PatchProxy.applyVoid(null, this, j.class, "44")) {
          return;
       }
       Object[] objArray = new Object[0];
       q1.C().w("CameraSDK", "resumePreview", objArray);
       if (this.z != null) {
          return;
       }
       j tl = this.l;
       if (tl == null || !tl.e()) {
          this.I0 = true;
          this.startPreviewImpl();
       }
       return;
    }
    public void resumePreview(boolean p0){
       if (PatchProxy.isSupport(j.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, j.class, "45")) {
          return;
       }
       this.resumePreview();
       return;
    }
    public b s(){
       return this.m;
    }
    public void s0(boolean p0){
       this.X = p0;
    }
    public boolean s1(){
       boolean b = (this.S != null)? true: false;
       return b;
    }
    public void setAECompensation(float p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, oj, "146")) {
          return;
       }
       if (this.z == null && this.o != null) {
          this.o.setAECompensation(p0);
       }
       return;
    }
    public void setAFAEAutoMode(boolean p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oj, "143")) {
          return;
       }
       if (this.z == null && this.o != null) {
          this.o.setAFAEAutoMode(p0);
       }
       return;
    }
    public void setAFAEMeteringRegions(Rect[] p0,int[] p1,int p2,int p3,DisplayLayout p4){
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, this, oj, "145")) {
             return;
          }
       }
       if (this.z == null && this.o != null) {
          this.o.setAFAEMeteringRegions(p0, p1, p2, p3, p4);
       }
       return;
    }
    public void setAFAETapMode(){
       if (PatchProxy.applyVoid(null, this, j.class, "144")) {
          return;
       }
       if (this.z == null && this.o != null) {
          this.o.setAFAETapMode();
       }
       return;
    }
    public void setAWBMode(CameraController$WhiteBalanceMode p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "93")) {
          return;
       }
       if (this.z == null && this.o != null) {
          this.o.setAWBMode(p0);
       }
       return;
    }
    public boolean setAutoExposureLock(boolean p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, oj, "151");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.z != null || this.o == null) {
          return false;
       }else {
          return this.o.setAutoExposureLock(p0);
       }
    }
    public void setCameraFirstFrameUndroppable(boolean p0){
    }
    public void setCameraStreamTypeAndVideoStabilizationMode(CameraStreamType p0,DaenerysCaptureStabilizationMode p1,boolean p2){
       if (PatchProxy.isSupport(j.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, j.class, "84")) {
          return;
       }
       if (this.o != null) {
          this.o.setCameraStreamTypeAndVideoStabilizationMode(p0, p1, p2);
       }
       return;
    }
    public void setCaptureDeviceType(CaptureDeviceType p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "68")) {
          return;
       }
       if (this.z == null && this.o != null) {
          Object[] objArray = new Object[0];
          q1.C().w("CameraSDK", "Set captureDeviceType: "+p0, objArray);
          this.o.setCaptureDeviceType(p0);
       }
       return;
    }
    public void setDisableStabilization(boolean p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oj, "67")) {
          return;
       }
       if (this.z == null && this.o != null) {
          Object[] objArray = new Object[0];
          q1.C().w("CameraSDK", "setDisableStabilization = "+p0, objArray);
          this.o.setDisableStabilization(p0);
       }
       return;
    }
    public void setEnableHdr(boolean p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oj, "31")) {
          return;
       }
       if (this.z != null) {
          return;
       }
       if (this.o != null) {
          this.o.setEnableHdr(p0);
       }
       return;
    }
    public void setEnableLowLightBoost(boolean p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oj, "79")) {
          return;
       }
       if (this.z == null && this.o != null) {
          this.o.setEnableLowLightBoost(p0);
       }
       return;
    }
    public void setFlashMode(FlashController$FlashMode p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "117")) {
          return;
       }
       if (this.z == null && this.o != null) {
          this.o.setFlashMode(p0);
       }
       return;
    }
    public void setFrameMonitor(FrameMonitor p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "71")) {
          return;
       }
       if (this.z == null && this.o != null) {
          this.o.setFrameMonitor(p0);
       }
       return;
    }
    public boolean setLowLightStrategyEnabled(Activity p0,boolean p1){
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, oj, "115");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.z == null && this.o != null) {
          this.A0 = p1;
          return this.o.setLowLightStrategyEnabled(p0, p1);
       }else {
          return false;
       }
    }
    public void setMainDeviceWithSourceId(int p0){
    }
    public void setMirrorFrontCamera(boolean p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oj, "172")) {
          return;
       }
       if (this.z == null && this.o != null) {
          this.o.setMirrorFrontCamera(p0);
       }
       return;
    }
    public void setOnCameraInitTimeCallback(CameraController$d p0){
       this.j(p0);
    }
    public void setOnZoomListener(h$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "126")) {
          return;
       }
       if (this.z == null && this.o != null) {
          this.o.setOnZoomListener(p0);
       }
       return;
    }
    public void setPreviewCallback(){
       if (PatchProxy.applyVoid(null, this, j.class, "74")) {
          return;
       }
       if (this.z == null && this.o != null) {
          this.o.setPreviewCallback();
       }
       return;
    }
    public void setStats(StatsHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "70")) {
          return;
       }
       if (this.z == null && this.o != null) {
          this.o.setStats(p0);
       }
       return;
    }
    public void setUseYuvOutputForCamera2TakePicture(boolean p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oj, "82")) {
          return;
       }
       if (this.o != null) {
          this.o.setUseYuvOutputForCamera2TakePicture(p0);
       }
       return;
    }
    public void setVideoStabilizationMode(DaenerysCaptureStabilizationMode p0,boolean p1){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, oj, "83")) {
          return;
       }
       if (this.z == null && this.o != null) {
          Object[] objArray = new Object[0];
          q1.C().w("CameraSDK", "setDisableStabilizationMode = "+p0, objArray);
          this.o.setVideoStabilizationMode(p0, p1);
       }
       return;
    }
    public void setZeroShutterLagIfSupportEnabled(boolean p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oj, "88")) {
          return;
       }
       if (this.z == null && this.o != null) {
          this.o.setZeroShutterLagIfSupportEnabled(p0);
       }
       return;
    }
    public void setZoom(float p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, oj, "124")) {
          return;
       }
       if (this.z == null && this.o != null) {
          this.o.setZoom(p0);
       }
       return;
    }
    public void setZoom(int p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oj, "125")) {
          return;
       }
       if (this.z == null && this.o != null) {
          this.o.setZoom(p0);
       }
       return;
    }
    public void startPreviewImpl(){
       if (PatchProxy.applyVoid(null, this, j.class, "191")) {
          return;
       }
       if (this.z == null && this.o != null) {
          this.o.resumePreview();
       }
       return;
    }
    public void stopPreview(){
       if (PatchProxy.applyVoid(null, this, j.class, "46")) {
          return;
       }
       this.I0 = false;
       if (this.z != null) {
          return;
       }
       j tl = this.l;
       if (tl == null || !tl.d()) {
          this.o.stopPreview();
       }
       return;
    }
    public void stopRecording(){
       if (PatchProxy.applyVoid(null, this, j.class, "48")) {
          return;
       }
       Object[] objArray = new Object[0];
       q1.C().w("CameraSDK", "stopRecording", objArray);
       if (this.z != null) {
          return;
       }
       if (this.isRecording()) {
          this.m.o().stopRecording(true);
          this.p1().stopRecording();
          j tC = this.C;
          if (this.B != tC) {
             this.M1(tC, 0);
          }
          this.r.M0();
       }
       return;
    }
    public boolean supportLowLightBoost(){
       Object obj = PatchProxy.apply(null, this, j.class, "81");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.z == null && this.o != null) {
          return this.o.supportLowLightBoost();
       }
       return false;
    }
    public boolean supportTakePicture(){
       Object obj = PatchProxy.apply(null, this, j.class, "75");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.z == null && this.o != null) {
          return this.o.supportTakePicture();
       }
       return false;
    }
    public void switchCamera(boolean p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oj, "65")) {
          return;
       }
       String str = "switchCamera "+p0;
       Object[] objArray = new Object[0];
       q1.C().w("CameraSDK", str, objArray);
       if (this.z == null && (this.G != null && (this.isFrontCamera() != p0 && this.o != null))) {
          oj = this.G;
          oj.a = p0;
          str.a(oj).a = p0;
          if (this.isMultiCamera()) {
             this.Z1();
             return;
          }else {
             this.o.switchCamera(p0);
          }
       }
       return;
    }
    public String t(){
       j obj = PatchProxy.apply(null, this, j.class, "224");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.h;
       WesterosPlugin westerosPlug = (obj != null)? obj.a(): null;
       if (westerosPlug != null) {
          return westerosPlug.collectPerfData();
       }else {
          return null;
       }
    }
    public void t0(p$a p0,p$c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j.class, "92")) {
          return;
       }
       if (this.z != null) {
          Object[] objArray = new Object[0];
          q1.C().t("CameraSDK", "setFaceFrameTraceCallBackForFemale error, camerasdk  is dispose", objArray);
          return;
       }else {
          this.q0 = p0;
          this.s0 = p1;
          if (p0 == null && this.r0 == null) {
             this.Y1();
             return;
          }else if(this.p0 == null && this.m != null){
             this.X1();
          }
          j tp0 = this.p0;
          if (tp0 != null) {
             tp0.d(this.q0);
             this.p0.e(this.s0);
          }
          return;
       }
    }
    public final void t1(f p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j.class, "8")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       q1.C().w("CameraSDK", "initDaenerys", objArray);
       if (this.a != null) {
          if (p1.s0 == null) {
             this.U0(p0);
          }
          return;
       }else {
          _monitor_enter(this);
          if (this.a != null) {
             _monitor_exit(this);
             return;
          }else {
             long l = System.currentTimeMillis();
             if (!j.T0 && p1.e()) {
                c.a(f.b);
             }
             this.u1(p1);
             Object[] objArray1 = new Object[i];
             q1.C().w("CameraSDK", "initDanerysExtend cost "+(System.currentTimeMillis() - l), objArray1);
             c uoc = objArray1.a(p1);
             boolean b = true;
             boolean b1 = (this.O != null || p1.s0 != null)? true: false;
             DaenerysCaptureConfig uDaenerysCap = g1.f(uoc, i, b1);
             this.o = this.i1(uDaenerysCap, p1);
             if (p1.j0 != null) {
                this.o.resumePreview();
                Object[] objArray2 = new Object[i];
                q1.C().w("CameraSDK", "CameraController resumePreview", objArray2);
             }
             j ts = this.s;
             DaenerysConfig uDaenerysCon = g1.g(b1.a(p1), this.B0, this.C0);
             j tB0 = this.B0;
             j tC0 = this.C0;
             if (this.O == null && p1.s0 == null) {
                b = false;
             }
             Westeros westeros = new Westeros(ts, uDaenerysCon, g1.b(p1, tB0, tC0, i, b), this.m1(p1.h0));
             this.n = i;
             this.m = westeros.getDaenerys();
             this.m.q().enablePerSecondUploadJsonStats(p1.S);
             this.m.A(this.o);
             if (this.m != null) {
                this.m.q().resume();
                this.m.v();
             }
             if (p1.s0 == null) {
                this.U0(p0);
             }
             Object[] objArray3 = new Object[i];
             q1.C().w("CameraSDK", "new Westeros", objArray3);
             this.a = westeros;
             this.V1();
             this.a.setStatsListener(new o(this));
             this.p = new a(this.s, this.m, uDaenerysCap);
             _monitor_exit(this);
             if (this.q0 != null) {
                this.X1();
                this.p0.d(this.q0);
                this.p0.e(this.s0);
             }
             this.y1(p1);
             return;
          }
       }
    }
    public void takePicture(CameraController$e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "61")) {
          return;
       }
       Object[] objArray = new Object[0];
       q1.C().t("CameraSDK", "takePicture do not use currently", objArray);
       return;
    }
    public void takePicture(CameraController$e p0,boolean p1){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, oj, "62")) {
          return;
       }
       Object[] objArray = new Object[0];
       q1.C().t("CameraSDK", "takePicture do not use currently", objArray);
       return;
    }
    public final PreviewStats u(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, j.class, "176");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.m != null) {
          objArray = this.m.q().collectPreviewStats();
       }
       return objArray;
    }
    public void u0(p$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "91")) {
          return;
       }
       if (this.z != null) {
          Object[] objArray = new Object[0];
          q1.C().t("CameraSDK", "setFaceFrameTraceCallBackForMale error, camerasdk  is dispose", objArray);
          return;
       }else {
          this.r0 = p0;
          if (this.q0 == null && p0 == null) {
             this.Y1();
             return;
          }else {
             j tp0 = this.p0;
             if (tp0 == null && this.m != null) {
                this.X1();
             }
             if (tp0 != null) {
                tp0.c = this.r0;
             }
             return;
          }
       }
    }
    public final void u1(c p0){
       Object[] objArray2;
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "9")) {
          return;
       }
       int i = 0;
       if (!j.S0) {
          boolean b = true;
          CameraApiVersion uCameraApiVe = p0.k(b);
          Object[] objArray = new Object[i];
          q1.C().w("CameraSDK", "DaenerysExtend CameraApiVersion is "+uCameraApiVe, objArray);
          if (uCameraApiVe != CameraApiVersion.kAndroidCameraUnit && (uCameraApiVe == CameraApiVersion.kAndroidCameraVivo || uCameraApiVe == CameraApiVersion.kAndroidCameraKit)) {
             if (h1.b()) {
                Object[] objArray1 = new Object[i];
                q1.C().w("CameraSDK", "DaenerysExtend setDVAClassLoader", objArray1);
                d.b = a.b().getClassLoader();
                j.S0 = b;
                objArray2 = new Object[i];
                q1.C().w("CameraSDK", "DaenerysExtend setDVAClassLoader success", objArray2);
             }else {
                objArray2 = new Object[i];
                q1.C().w("CameraSDK", "DaenerysExtend load async", objArray2);
                h1.c();
             }
          }
       }else {
          objArray2 = new Object[i];
          q1.C().w("CameraSDK", "DaenerysExtend already Loaded", objArray2);
       }
       h1.d(Boolean.valueOf(j.S0));
       return;
    }
    public void updateDaenerysCaptureConfig(DaenerysCaptureConfig p0){
    }
    public void updatePreviewResolution(k p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "106")) {
          return;
       }
       if (this.z == null && this.o != null) {
          this.o.updatePreviewResolution(p0);
       }
       return;
    }
    public void updatePreviewScale(k p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "107")) {
          return;
       }
       if (this.z == null && this.o != null) {
          this.o.updatePreviewScale(p0);
       }
       return;
    }
    public void updateResolutionCaptureConfig(int p0,int p1,int p2){
       if (PatchProxy.isSupport(j.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, j.class, "109")) {
          return;
       }
       if (!this.O(p0, p1, p2)) {
          return;
       }
       Object[] objArray = new Object[0];
       q1.C().w("CameraSDK", "updateResolutionCaptureConfig, width="+p0+" , height="+p1+" , MaxPreviewSize="+p2, objArray);
       this.G.s(p0);
       this.G.q(p1);
       this.G.r(p2);
       this.o.updateResolutionCaptureConfig(p0, p1, p2);
       return;
    }
    public f v(){
       return this.S;
    }
    public boolean v0(Rect p0,int p1,int p2){
       int[] this;
       if (PatchProxy.isSupport(j.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, j.class, "41");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.z != null) {
          return false;
       }else {
          Rect[] rectArray = new Rect[]{p0};
          this = new int[]{1000};
          this.setAFAETapMode();
          this.setAFAEMeteringRegions(rectArray, this, p1, p2, DisplayLayout.FIX_WIDTH_HEIGHT);
          return 1;
       }
    }
    public final void v1(){
       if (PatchProxy.applyVoid(null, this, j.class, "193")) {
          return;
       }
       this.U.g();
       if (this.S != null && this.S.c()) {
          Object[] objArray = new Object[0];
          q1.C().w("CameraSDK", "restore effects, needFaceDetect prepareFaceDetect", objArray);
          this.U.f();
       }
       return;
    }
    public void w(f p0,MediaRecorderCallbackFrameType p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j.class, "211")) {
          return;
       }
       b uob = this.p1();
       j$e uoe = new j$e(this, p1, p0, uob);
       Objects.requireNonNull(uob);
       if (!PatchProxy.applyVoidOneRefs(uoe, uob, b.class, "19")) {
          uob.l.add(uoe);
       }
       return;
    }
    public t w0(Rect p0,int p1,int p2){
       if (PatchProxy.isSupport(j.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, j.class, "42");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return t.fromCallable(new e0(this, p0, p1, p2));
    }
    public final void w1(c p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "15")) {
          return;
       }
       j tK0 = this.K0;
       String[] stringArray = new String[]{"ar"};
       this.b = new f(tK0, YarPlugin.class, stringArray);
       stringArray = new String[]{"mmu"};
       this.h = new f(tK0, MmuPlugin.class, stringArray);
       if (this.A != null) {
          return;
       }
       this.A1(this.h);
       String str = "ycnn_pre";
       String str1 = "ykit_module";
       String[] stringArray1 = new String[]{str,str1};
       this.c = new f(this.K0, YcnnPlugin.class, stringArray1);
       if (this.A != null) {
          return;
       }
       this.A1(this.c);
       stringArray = new String[]{str,str1};
       this.d = new f(this.K0, YKitPlugin.class, stringArray);
       if (this.A != null) {
          return;
       }
       this.A1(this.d);
       stringArray = new String[]{"visionengine"};
       f uof = new f(this.K0, VEPlugin.class, stringArray);
       this.e = uof;
       this.A1(uof);
       this.a.updateABTestKeyValuesJson(d.a());
       String str2 = "1";
       if (a.a().c()) {
          j ta = this.a;
          String obj = PatchProxy.apply(null, null, b.class, "3");
          if (obj != PatchProxyResult.class) {
             i = obj.intValue();
          }else if(a.a().c()){
             i = g.p0();
             if (i != 1) {
                if (i == 2) {
                   i = 1;
                }
             }else {
                i = 0;
             }
          }
          i = -1;
          ta.setRenderUseNewModel(i);
          ta = this.a;
          obj = (l.c("magicFaceMockError", false))? str2: "0";
          ta.setDebugKeyValue("mockError", obj);
          this.a.setDebugKeyValue("debugAssert", Integer.toString(l.e("magicFaceDebugAssert", 1)));
       }
       this.f = new FacelessPlugin(this.s);
       String[] stringArray2 = new String[]{"ai_edit"};
       this.g = new f(this.K0, AIEditPlugin.class, stringArray2);
       if (this.A != null) {
          return;
       }else {
          this.A1(this.e);
          if (this.A != null) {
             return;
          }else {
             this.A1(this.g);
             if (this.A != null) {
                return;
             }else {
                this.a.applyPlugin(this.f);
                if (this.A != null) {
                   return;
                }else {
                   j tK01 = this.K0;
                   stringArray2 = new String[]{"audio_recognition"};
                   this.i = new f(tK01, AudioPlugin.class, stringArray2);
                   stringArray2 = new String[]{"stentorplugin"};
                   this.j = new f(tK01, StentorPlugin.class, stringArray2);
                   this.f.getFaceMagicController().setInitialVideoFrameSize(p0.j(), p0.h());
                   this.f.getFaceMagicController().setFaceMagicEnvironmentUnsafeListener(new y(this));
                   this.f.getFaceMagicController().setReportBeautifyLogListener(new f0(this));
                   this.f.getFaceMagicController().setBeautifyStatusChangedListener(this.M0);
                   this.f.getFaceMagicController();
                   if (!s6.f()) {
                      str2 = "0";
                   }
                   FaceMagicController.setRunningKeyandValue("enableBeautityPredownlaod1104", str2);
                   if (a.a().c()) {
                      FaceMagicController.enableAlertBox((l.c("closeMagicFaceFailDialog", false) ^ 1));
                      CGEAlertBoxUtil.setCGEAlertBoxListener(new j$l(this));
                   }
                   return;
                }
             }
          }
       }
    }
    public a x(){
       return this.l;
    }
    public void x0(boolean p0){
       this.F0 = p0;
    }
    public VideoContext y(){
       b j = (this.q != null)? this.q.j: this.h0;
       return j;
    }
    public void y0(boolean p0,VEFeatureParams p1){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, oj, "209")) {
          return;
       }
       oj = this.e;
       if (oj == null) {
          return;
       }
       if (!p0 && !oj.b()) {
          return;
       }
       WesterosPlugin westerosPlug = oj.a();
       if (westerosPlug instanceof VEPlugin) {
          Object[] objArray = new Object[0];
          q1.C().w("CameraSDK", "setFrameColorPickEnabled sdk set : "+p0, objArray);
          westerosPlug.setFeatureEnabledAndParams(VEFeatureType.kColorPick, p0, p1);
       }
       return;
    }
    public final void y1(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "10")) {
          return;
       }
       c uoc = p0.f0;
       int i = 0;
       if (uoc == null || uoc.a == null) {
          Object[] objArray = new Object[i];
          q1.C().w("CameraSDK", "initUvcCameraController false", objArray);
          _monitor_enter(this);
          j tl = this.l;
          if (tl != null) {
             tl.g(i);
             this.l.release();
             this.l = null;
          }
          _monitor_exit(this);
          return;
       }else {
          Object[] objArray1 = new Object[i];
          q1.C().w("CameraSDK", "initUvcCameraController true", objArray1);
          _monitor_enter(this);
          if (this.l == null) {
             a uoa = a.f();
             uoa.k(this.m);
             uoa.h(this.s);
             uoa.m(p0.j());
             uoa.i(p0.h());
             uoa = uoa.g(p0.f0.c).l(p0.f0.b);
             uoa.j(p0.g());
             a uoa1 = b.a(uoa);
             this.l = uoa1.l(new j$j(this));
          }
          this.l.g(true);
          _monitor_exit(this);
          return;
       }
    }
    public String z(){
       j obj = PatchProxy.apply(null, this, j.class, "225");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       WesterosPlugin westerosPlug = (obj != null)? obj.a(): null;
       if (westerosPlug != null) {
          return westerosPlug.collectPerfData();
       }else {
          return null;
       }
    }
    public void z0(VEPlugin$OnFrameColorListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "208")) {
          return;
       }
       j te = this.e;
       if (te == null) {
          return;
       }
       WesterosPlugin westerosPlug = te.a();
       if (westerosPlug instanceof VEPlugin) {
          westerosPlug.setFrameColorPickListener(p0);
       }
       return;
    }
    public boolean z1(){
       return this.A;
    }
}
