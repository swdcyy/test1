package com.kwai.video.westeros.Westeros;
import com.kwai.video.westeros.helpers.WesterosSoLoader;
import android.content.Context;
import com.kwai.camerasdk.Daenerys;
import java.lang.Object;
import com.kwai.video.westeros.Westeros$1;
import com.kwai.video.westeros.UIInteractionHandler;
import com.kwai.video.westeros.helpers.ValidationChecker;
import com.kwai.video.westeros.ResourceManager;
import java.util.HashSet;
import com.kwai.video.westeros.CacheManager;
import com.kwai.camerasdk.models.DaenerysConfig;
import com.kwai.camerasdk.render.OpengGL.EglBase$Context;
import c65.a;
import b65.u;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.Enum;
import com.kwai.camerasdk.log.Log;
import com.kwai.camerasdk.models.Page;
import com.kwai.camerasdk.models.DaenerysConfig$b;
import com.kwai.camerasdk.DaenerysConfigBuilder;
import com.kwai.camerasdk.models.GLSyncTestResult;
import com.kwai.camerasdk.models.Business;
import com.kwai.camerasdk.models.AudioProfile;
import java.util.Map;
import com.kwai.camerasdk.config.CameraConfig;
import com.kwai.camerasdk.config.ExtendConfig;
import com.kwai.camerasdk.config.RecorderConfig;
import com.kwai.camerasdk.config.RenderConfig;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.camerasdk.stats.StatsHolder;
import n65.a;
import com.kwai.camerasdk.Daenerys$LogParam;
import com.kwai.video.westeros.WesterosPlugin;
import java.util.Set;
import com.kwai.video.westeros.Westeros$3;
import java.lang.Runnable;
import java.lang.Boolean;
import com.kwai.video.westeros.Westeros$2;
import com.kwai.video.westeros.WesterosStatsListener;
import com.kwai.video.westeros.Westeros$OnBacklightDetectListener;
import com.kwai.video.westeros.Westeros$OnLowLightDetectionListener;
import com.kwai.video.westeros.Westeros$OnWesterosEventListener;
import com.kwai.camerasdk.face.FaceDetectorContext;
import java.lang.Integer;
import com.kwai.video.westeros.models.FeatureType;
import com.kwai.video.westeros.models.FeatureParams;
import com.google.protobuf.AbstractMessageLite;
import com.kwai.video.westeros.models.RecordSubBusiness;
import com.kwai.video.westeros.SensorUtils;

public class Westeros	// class@000e6d
{
    public Set allPlugins;
    public Westeros$OnBacklightDetectListener backlightDetectListener;
    public final CacheManager cacheManager;
    public Daenerys daenerys;
    public boolean disposed;
    public Object listenerLock;
    public Westeros$OnLowLightDetectionListener lowLightDetectionListener;
    public long nativeWesteros;
    public final ResourceManager resourceManager;
    public final UIInteractionHandler uiInteractionHandler;
    public ValidationChecker validationChecker;
    public Westeros$OnWesterosEventListener westerosEventListener;
    public long westerosEventToken;
    public static final String TAG = "Westeros";
    public static final String WESTEROS_EVENT_MODEL_MISSING = "WESTEROS_EVENT_MODEL_MISSING";

    static {
       WesterosSoLoader.loadNative();
    }
    public void Westeros(Context p0,Daenerys p1){
       super();
       this.listenerLock = new Object();
       this.validationChecker = new Westeros$1(this);
       long l = this.nativeCreateWesteros();
       this.nativeWesteros = l;
       this.daenerys = p1;
       this.nativeSetDaenerys(l, p1.p());
       this.nativeInit(this.nativeWesteros, p0);
       this.uiInteractionHandler = new UIInteractionHandler(this.nativeWesteros, this.validationChecker);
       this.initUiInteractionHandlerDelegate();
       this.resourceManager = new ResourceManager(this.nativeWesteros, this.validationChecker);
       this.allPlugins = new HashSet();
       this.cacheManager = new CacheManager(this.nativeWesteros, this.validationChecker);
    }
    public void Westeros(Context p0,DaenerysConfig p1){
       super(p0, p1, null);
    }
    public void Westeros(Context p0,DaenerysConfig p1,a p2,EglBase$Context p3){
       boolean b2;
       super();
       this.listenerLock = new Object();
       this.validationChecker = new Westeros$1(this);
       this.nativeWesteros = this.nativeCreateWesteros();
       if (p2 != null) {
          GeneratedMessageLite generatedMes = PatchProxy.applyTwoRefs(p2, p1, null, u.class, "4");
          if (generatedMes != PatchProxyResult.class) {
          }else {
             a a = p2.a;
             String str = "DaenerysParameterUtils";
             Log.i(str, "getDaenerysConfig from page "+a.toString());
             if (u.c && (a != Page.kLivePushPage && (a == Page.kLivePreviewPage || a == Page.kDefaultPage))) {
                Log.i(str, "use origin DaenerysConfig");
                generatedMes = p1;
             }else {
                DaenerysConfig$b uob = DaenerysConfigBuilder.defaultBuilder();
                uob.H(p2.b);
                uob.s(p2.c);
                boolean b = true;
                uob.w(b);
                uob.d(p2.d);
                uob.C(p2.e);
                uob.i(p2.f);
                uob.m(p2.g);
                uob.b(AudioProfile.kAacLow);
                uob.a(192);
                uob.v(p2.h);
                uob.A(p2.i);
                uob.u(p2.j);
                uob.z(p2.k);
                uob.D(p2.v);
                String str1 = -1;
                boolean b1 = false;
                if (u.b.get(a).mExtendConfig.mDisableAdaptiveResolution != str1) {
                   b2 = (u.b.get(a).mExtendConfig.mDisableAdaptiveResolution == null)? true: false;
                   uob.g(b2);
                }
                if (u.b.get(a).mRecorderConfig.mEnableAudioVideoMuxerInterval != str1) {
                   b2 = (u.b.get(a).mRecorderConfig.mEnableAudioVideoMuxerInterval == b)? true: false;
                   uob.h(b2);
                }
                if (u.b.get(a).mRecorderConfig.mEnablePrepareMediaRecorder != str1) {
                   b2 = (u.b.get(a).mRecorderConfig.mEnablePrepareMediaRecorder == b)? true: false;
                   uob.x(b2);
                }
                if (u.b.get(a).mExtendConfig.mEnableDelayEncodeFrame != str1) {
                   b2 = (u.b.get(a).mExtendConfig.mEnableDelayEncodeFrame == b)? true: false;
                   uob.j(b2);
                }
                if (u.b.get(a).mRecorderConfig.mHardwareEncoderAlignSize != str1) {
                   uob.t(u.b.get(a).mRecorderConfig.mHardwareEncoderAlignSize);
                }
                if (u.b.get(a).mRecorderConfig.mEnableHardwareEncoderColorSpaceSetting != str1) {
                   b2 = (u.b.get(a).mRecorderConfig.mEnableHardwareEncoderColorSpaceSetting == b)? true: false;
                   uob.n(b2);
                }
                if (u.b.get(a).mRecorderConfig.mEnableMediaCodecBitrateModeCbr != str1) {
                   b2 = (u.b.get(a).mRecorderConfig.mEnableMediaCodecBitrateModeCbr == b)? true: false;
                   uob.o(b2);
                }
                if (u.b.get(a).mExtendConfig.mSensorRate != str1) {
                   uob.y(u.b.get(a).mExtendConfig.mSensorRate);
                }
                if (u.b.get(a).mRenderConfig.mEnableRenderThread2 != str1) {
                   b2 = (u.b.get(a).mRenderConfig.mEnableRenderThread2 == b)? true: false;
                   uob.p(b2);
                }
                if (u.b.get(a).mRenderConfig.mUseEglimageTextureReader != str1) {
                   b2 = (u.b.get(a).mRenderConfig.mUseEglimageTextureReader == b)? true: false;
                   uob.G(b2);
                }
                if (u.b.get(a).mRenderConfig.mDisableSurfaceViewSaveVideoFrame > null) {
                   uob.copyOnWrite();
                   uob.instance.setDisableSurfaceViewSaveVideoFrame(b);
                }
                if (u.b.get(a).mRecorderConfig.mDisableFallbackSoftwareEncoder != str1) {
                   if (u.b.get(a).mRecorderConfig.mDisableFallbackSoftwareEncoder == null) {
                      b1 = true;
                   }
                   uob.k(b1);
                }
                if (!(u.b.get(a).mRecorderConfig.mVideoCodeConfig).equals("")) {
                   uob.J(u.b.get(a).mRecorderConfig.mVideoCodeConfig);
                }
                a l = p2.l;
                if (l != null && l.length()) {
                   uob.B(p2.l);
                }
                if (u.b.get(a).mRecorderConfig.mVideoBitrate > null) {
                   uob.I((u.b.get(a).mRecorderConfig.mVideoBitrate / 1000));
                }
                if (u.b.get(a).mEnableProcessorReport > null) {
                   uob.copyOnWrite();
                   uob.instance.setEnableProcessorReport(b);
                }
                uob.e(u.d);
                generatedMes = uob.build();
             }
          }
          Daenerys uDaenerys = new Daenerys(p0, generatedMes, p3);
          _monitor_enter(uDaenerys);
          int e = u.e;
          if (p1.getConfigIsDefault() && generatedMes.getConfigIsDefault()) {
             e = u.i;
          }else if(p1.getConfigIsDefault() && !generatedMes.getConfigIsDefault()){
             e = u.g;
          }else if(!p1.getConfigIsDefault() && generatedMes.getConfigIsDefault()){
             e = u.h;
          }else if(!p1.equals(generatedMes)){
             e = u.f;
             Log.i("Daenerys", "!!!daenerysConfig daenerys created not equal to origin!!!");
             Log.i("Daenerys", "daenerysConfig daenerys created : "+generatedMes);
             Log.i("Daenerys", "daenerysConfig origin: "+p1);
             uDaenerys.i.setDaenerysConfig(p1, generatedMes);
          }
          uDaenerys.i.setDaenerysConfigInfo(e);
          _monitor_exit(uDaenerys);
          this.daenerys = uDaenerys;
       }else {
          this.daenerys = new Daenerys(p0, p1, p3);
       }
       this.nativeSetDaenerys(this.nativeWesteros, this.daenerys.p());
       this.setBusiness(p1.getBusiness());
       this.setSensorRate(p1.getSensorRate());
       this.nativeInit(this.nativeWesteros, p0);
       this.uiInteractionHandler = new UIInteractionHandler(this.nativeWesteros, this.validationChecker);
       this.initUiInteractionHandlerDelegate();
       this.resourceManager = new ResourceManager(this.nativeWesteros, this.validationChecker);
       this.allPlugins = new HashSet();
       this.cacheManager = new CacheManager(this.nativeWesteros, this.validationChecker);
       return;
    }
    public void Westeros(Context p0,DaenerysConfig p1,EglBase$Context p2){
       super(p0, p1, null, p2);
    }
    public static void preloadLibrarys(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, Westeros.class, "1")) {
          return;
       }
       WesterosSoLoader.loadNative();
       a.b();
       return;
    }
    public static void setLogParam(Daenerys$LogParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, Westeros.class, "5")) {
          return;
       }
       Daenerys.G(p0);
       return;
    }
    public synchronized void applyPlugin(WesterosPlugin p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Westeros.class, "7")) {
          return;
       }
       if (p0 != null && (p0.isReleased() || !this.validationChecker.isValid())) {
          Log.e("Westeros", "applyPlugin error: plugin is invalid.");
          return;
       }else {
          this.nativeApplyPlugin(this.nativeWesteros, p0.getNativePlugin());
          this.allPlugins.add(p0);
          return;
       }
    }
    public void dispose(){
       if (PatchProxy.applyVoid(null, this, Westeros.class, "28")) {
          return;
       }
       this.dispose(new Westeros$3(this));
       return;
    }
    public synchronized void dispose(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Westeros.class, "29")) {
          return;
       }
       Log.i("Westeros", "Westeros dispose.");
       this.disposed = true;
       this.nativeUnsetDaenerys(this.nativeWesteros);
       this.daenerys.i(p0);
       this.nativeDestroyWesteros(this.nativeWesteros);
       this.uiInteractionHandler.dispose();
       Log.i("Westeros", "Destroy done.");
       return;
    }
    public Set getAllPlugins(){
       return this.allPlugins;
    }
    public CacheManager getCacheManager(){
       Object obj = PatchProxy.apply(null, this, Westeros.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.validationChecker.isValid()) {
          return this.cacheManager;
       }
       return null;
    }
    public Daenerys getDaenerys(){
       Object obj = PatchProxy.apply(null, this, Westeros.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.validationChecker.isValid()) {
          return this.daenerys;
       }
       return null;
    }
    public ResourceManager getResourceManager(){
       Object obj = PatchProxy.apply(null, this, Westeros.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.validationChecker.isValid()) {
          return this.resourceManager;
       }
       return null;
    }
    public UIInteractionHandler getUiInteractionHandler(){
       Object obj = PatchProxy.apply(null, this, Westeros.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.validationChecker.isValid()) {
          return this.uiInteractionHandler;
       }
       return null;
    }
    public void ignoreSensorUpdate(boolean p0){
       Westeros westeros = Westeros.class;
       if (PatchProxy.isSupport(westeros) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, westeros, "20")) {
          return;
       }
       if (this.validationChecker.isValid()) {
          this.nativeIgnoreSensorUpdate(this.nativeWesteros, p0);
       }
       return;
    }
    public final void initUiInteractionHandlerDelegate(){
       if (PatchProxy.applyVoid(null, this, Westeros.class, "2")) {
          return;
       }
       this.uiInteractionHandler.transformDelegate = new Westeros$2(this);
       return;
    }
    public native final void nativeApplyPlugin(long p0,long p1);
    public native final long nativeCreateWesteros();
    public native final void nativeDestroyWesteros(long p0);
    public native final void nativeIgnoreSensorUpdate(long p0,boolean p1);
    public native final void nativeInit(long p0,Object p1);
    public native final void nativeRemovePlugin(long p0,long p1);
    public native final void nativeSetBusiness(long p0,long p1);
    public native final void nativeSetDaenerys(long p0,long p1);
    public native final void nativeSetDebugKeyValue(long p0,String p1,String p2);
    public native final void nativeSetFaceDetectorContext(long p0,long p1,long p2,int p3);
    public native final void nativeSetFeatureEnabled(long p0,int p1,boolean p2,byte[] p3);
    public native final void nativeSetRecordSubBusiness(long p0,long p1);
    public native final void nativeSetRenderUseNewModel(long p0,int p1);
    public native final void nativeSetShouldApplyImageModeForImage(long p0,boolean p1);
    public native final void nativeSetStatsListener(long p0,WesterosStatsListener p1);
    public native final void nativeUnsetDaenerys(long p0);
    public native final void nativeUpdateABTestKeyValuesJson(long p0,String p1);
    public native final void nativeUpdateBacklightThreshold(long p0,int p1);
    public native final void nativeUpdateLowLightThreshold(long p0,int p1);
    public final void onBacklightData(boolean p0){
       Westeros westeros = Westeros.class;
       if (PatchProxy.isSupport(westeros) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, westeros, "26")) {
          return;
       }
       westeros = this.listenerLock;
       _monitor_enter(westeros);
       Westeros tbacklightDe = this.backlightDetectListener;
       if (tbacklightDe != null) {
          tbacklightDe.onBacklightDetectorResult(p0);
       }
       _monitor_exit(westeros);
       return;
    }
    public final void onLowLightData(boolean p0){
       Westeros westeros = Westeros.class;
       if (PatchProxy.isSupport(westeros) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, westeros, "25")) {
          return;
       }
       westeros = this.listenerLock;
       _monitor_enter(westeros);
       Westeros tlowLightDet = this.lowLightDetectionListener;
       if (tlowLightDet != null) {
          tlowLightDet.onLowLightDetectorResult(p0);
       }
       _monitor_exit(westeros);
       return;
    }
    public final void onWesterosEvent(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Westeros.class, "27")) {
          return;
       }
       Westeros tlistenerLoc = this.listenerLock;
       _monitor_enter(tlistenerLoc);
       Westeros twesterosEve = this.westerosEventListener;
       if (twesterosEve != null) {
          twesterosEve.onEvent(p0, p1);
       }
       _monitor_exit(tlistenerLoc);
       return;
    }
    public synchronized void removePlugin(WesterosPlugin p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Westeros.class, "8")) {
          return;
       }
       if (p0 != null && (p0.isReleased() || !this.validationChecker.isValid())) {
          Log.e("Westeros", "removePlugin error: plugin is invalid.");
          return;
       }else {
          this.nativeRemovePlugin(this.nativeWesteros, p0.getNativePlugin());
          this.allPlugins.remove(p0);
          return;
       }
    }
    public void setBusiness(Business p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Westeros.class, "10")) {
          return;
       }
       if (this.validationChecker.isValid()) {
          this.nativeSetBusiness(this.nativeWesteros, (long)p0.getNumber());
       }
       return;
    }
    public void setDebugKeyValue(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Westeros.class, "12")) {
          return;
       }
       if (this.validationChecker.isValid()) {
          this.nativeSetDebugKeyValue(this.nativeWesteros, p0, p1);
       }
       return;
    }
    public synchronized void setFaceDetectorContext(FaceDetectorContext p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Westeros.class, "3")) {
          return;
       }
       this.setFaceDetectorContext(p0, 0);
       return;
    }
    public synchronized void setFaceDetectorContext(FaceDetectorContext p0,int p1){
       Westeros westeros = Westeros.class;
       if (PatchProxy.isSupport(westeros) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, westeros, "4")) {
          return;
       }
       if (this.validationChecker.isValid()) {
          this.daenerys.E(p0, p1);
          if (p0 != null) {
             this.nativeSetFaceDetectorContext(this.nativeWesteros, p0.getNativeContext(), p0.getNativeSensorManager(), p1);
          }else {
             this.nativeSetFaceDetectorContext(this.nativeWesteros, 0, 0, p1);
          }
       }
       return;
    }
    public void setFeatureEnabled(FeatureType p0,boolean p1){
       Westeros westeros = Westeros.class;
       if (PatchProxy.isSupport(westeros) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, westeros, "18")) {
          return;
       }
       if (this.validationChecker.isValid()) {
          this.setFeatureEnabledAndParams(p0, p1, null);
       }
       return;
    }
    public void setFeatureEnabledAndParams(FeatureType p0,boolean p1,FeatureParams p2){
       if (PatchProxy.isSupport(Westeros.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, Westeros.class, "19")) {
          return;
       }
       if (this.validationChecker.isValid()) {
          if (p2 != null) {
             this.nativeSetFeatureEnabled(this.nativeWesteros, p0.getNumber(), p1, p2.toByteArray());
          }else {
             this.nativeSetFeatureEnabled(this.nativeWesteros, p0.getNumber(), p1, null);
          }
       }
       return;
    }
    public void setOnBacklightDetectListener(Westeros$OnBacklightDetectListener p0){
       Westeros tlistenerLoc = this.listenerLock;
       _monitor_enter(tlistenerLoc);
       this.backlightDetectListener = p0;
       _monitor_exit(tlistenerLoc);
    }
    public void setOnEventListener(Westeros$OnWesterosEventListener p0){
       Westeros tlistenerLoc = this.listenerLock;
       _monitor_enter(tlistenerLoc);
       this.westerosEventListener = p0;
       _monitor_exit(tlistenerLoc);
    }
    public void setOnLowLightDetectionListener(Westeros$OnLowLightDetectionListener p0){
       Westeros tlistenerLoc = this.listenerLock;
       _monitor_enter(tlistenerLoc);
       this.lowLightDetectionListener = p0;
       _monitor_exit(tlistenerLoc);
    }
    public void setRecordSubBusiness(RecordSubBusiness p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Westeros.class, "13")) {
          return;
       }
       if (this.validationChecker.isValid()) {
          this.nativeSetRecordSubBusiness(this.nativeWesteros, (long)p0.getNumber());
       }
       return;
    }
    public void setRenderUseNewModel(int p0){
       Westeros westeros = Westeros.class;
       if (PatchProxy.isSupport(westeros) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, westeros, "11")) {
          return;
       }
       if (this.validationChecker.isValid()) {
          this.nativeSetRenderUseNewModel(this.nativeWesteros, p0);
       }
       return;
    }
    public void setSensorRate(int p0){
       Westeros westeros = Westeros.class;
       if (PatchProxy.isSupport(westeros) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, westeros, "14")) {
          return;
       }
       SensorUtils.setRate(p0);
       return;
    }
    public void setShouldApplyImageModeForImage(boolean p0){
       Westeros westeros = Westeros.class;
       if (PatchProxy.isSupport(westeros) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, westeros, "23")) {
          return;
       }
       if (this.validationChecker.isValid()) {
          this.nativeSetShouldApplyImageModeForImage(this.nativeWesteros, p0);
       }
       return;
    }
    public void setStatsListener(WesterosStatsListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Westeros.class, "17")) {
          return;
       }
       if (this.validationChecker.isValid()) {
          this.nativeSetStatsListener(this.nativeWesteros, p0);
       }
       return;
    }
    public void updateABTestKeyValuesJson(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Westeros.class, "24")) {
          return;
       }
       if (this.validationChecker.isValid()) {
          this.nativeUpdateABTestKeyValuesJson(this.nativeWesteros, p0);
       }
       return;
    }
    public void updateBacklightThreshold(int p0){
       Westeros westeros = Westeros.class;
       if (PatchProxy.isSupport(westeros) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, westeros, "22")) {
          return;
       }
       if (this.validationChecker.isValid()) {
          this.nativeUpdateBacklightThreshold(this.nativeWesteros, p0);
       }
       return;
    }
    public void updateLowlightThreshold(int p0){
       Westeros westeros = Westeros.class;
       if (PatchProxy.isSupport(westeros) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, westeros, "21")) {
          return;
       }
       if (this.validationChecker.isValid()) {
          this.nativeUpdateLowLightThreshold(this.nativeWesteros, p0);
       }
       return;
    }
}
