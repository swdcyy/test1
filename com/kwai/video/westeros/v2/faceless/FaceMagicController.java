package com.kwai.video.westeros.v2.faceless.FaceMagicController;
import com.kwai.video.westeros.v2.WesterosGlProcessor;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArraySet;
import zz7.a;
import java.lang.Boolean;
import com.kuaishou.android.security.KSecurity;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$1;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicLoadEffectFailedListener;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import com.kwai.video.westeros.v2.faceless.FacelessResourceVersion;
import com.kwai.robust.PatchProxyResult;
import java.io.File;
import java.lang.Integer;
import java.util.Iterator;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicBodySlimmingListener;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicPoliticDetectListener;
import com.kwai.video.westeros.models.BodySlimmingAdjustType;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicBeautifyStatusChangedListener;
import com.kwai.video.westeros.models.EffectCommand$Builder;
import com.kwai.video.westeros.models.EffectCommand;
import com.kwai.video.westeros.models.EffectCommandType;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.lang.Number;
import com.kwai.video.westeros.helpers.ValidationChecker;
import com.kwai.video.westeros.models.EffectSlot;
import com.kwai.video.westeros.models.EffectResource;
import com.google.protobuf.AbstractMessageLite;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicLiveinteractiveResourceListener;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$Image;
import android.graphics.Bitmap;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicStickerCallback;
import sxd.a;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicNeedCaptureListener;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicPickingServerMediaListener;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicDepthFinishListener;
import com.kwai.video.westeros.models.EffectDescription;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicListener;
import java.io.IOException;
import com.kwai.video.westeros.models.EffectErrorCode;
import com.kwai.video.westeros.models.EffectHint;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicEnvironmentUnsafeListener;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicUserInfoListener;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicInputTextRequestListener;
import com.kwai.video.westeros.models.TriggerInputTextConfig;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicInputTextRequestWithConfigListener;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicInputTextsRequestListener;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicRecordingControlListener;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicPortraitListener;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicBokehListener;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicBoomGameListener;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicEffectDetectListener;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicEffectInitStatusListener;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicExpressionListener;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicLockExposureListener;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicMagicAlbumListener;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicRemovelListener;
import java.nio.ByteBuffer;
import java.nio.Buffer;
import android.graphics.Bitmap$Config;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicMemojiListener;
import com.kwai.video.westeros.models.ServerMediaRequest;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicPickFaceImageListener;
import com.kwai.video.westeros.models.EffectError;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicReportBeautifyLogListener;
import com.kwai.video.westeros.models.BatchEffectCommand;
import java.util.List;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$2;
import java.lang.Enum;
import com.kwai.video.westeros.models.EffectType;
import com.kwai.video.westeros.models.UserInfo;
import com.kwai.video.westeros.models.EffectControl;

public class FaceMagicController extends WesterosGlProcessor	// class@0010e6
{
    public FaceMagicController$FaceMagicBeautifyStatusChangedListener beautifyStatusChangedListener;
    public FaceMagicController$FaceMagicBodySlimmingListener bodySlimmingListener;
    public FaceMagicController$FaceMagicBokehListener bokehListener;
    public FaceMagicController$FaceMagicBoomGameListener boomGameListener;
    public FaceMagicController$FaceMagicNeedCaptureListener captureListener;
    public final ValidationChecker checker;
    public FaceMagicController$FaceMagicDepthFinishListener depthFinishListener;
    public FaceMagicController$FaceMagicEffectDetectListener effectDetectListener;
    public FaceMagicController$FaceMagicEffectInitStatusListener effectInitStatusListener;
    public FaceMagicController$FaceMagicExpressionListener expressionListener;
    public FaceMagicController$FaceMagicEnvironmentUnsafeListener faceMagicEnvironmentUnsafeListener;
    public FaceMagicController$FaceMagicListener faceMagicListener;
    public FaceMagicController$FaceMagicInputTextRequestListener inputTextRequestListener;
    public FaceMagicController$FaceMagicInputTextRequestWithConfigListener inputTextRequestWithConfigListener;
    public FaceMagicController$FaceMagicInputTextsRequestListener inputTextsRequestListener;
    public FaceMagicController$FaceMagickKSwitchConfigListener kSwitchConfigListener;
    public FaceMagicController$FaceMagicLiveinteractiveResourceListener liveInteractiveListener;
    public FaceMagicController$FaceMagicLockExposureListener lockExposureListener;
    public final byte[] mListenerLock;
    public long m_securityID;
    public FaceMagicController$FaceMagicMagicAlbumListener magicAlbumListener;
    public FaceMagicController$FaceMagicRemovelListener magicRemovelListener;
    public FaceMagicController$FaceMagicMemojiListener memojiListener;
    public long nativeController;
    public FaceMagicController$FaceMagicPickFaceImageListener pickFaceImageListener;
    public FaceMagicController$FaceMagicPickingServerMediaListener pickingServerMediaListener;
    public FaceMagicController$FaceMagicPoliticDetectListener politicDetectListener;
    public FaceMagicController$FaceMagicPortraitListener portraitListener;
    public FaceMagicController$FaceMagicRecordingControlListener recordingControlListener;
    public FaceMagicController$FaceMagicReportBeautifyLogListener reportBeautifyLogListener;
    public FaceMagicController$FaceMagicStickerCallback stickerTextureLoadCb;
    public FaceMagicController$FaceMagicUserInfoListener userInfoListener;
    public static final Object LOCK;
    public static FaceMagicController$FaceMagicLoadEffectFailedListener sFaceMagicLoadEffectFailedListener;
    public static Set sFaceMagicLoadEffectFailedListeners;

    static {
       FaceMagicController.LOCK = new Object();
       FaceMagicController.sFaceMagicLoadEffectFailedListeners = new CopyOnWriteArraySet();
    }
    public void FaceMagicController(long p0,boolean p1){
       super();
       byte[] uobyteArray = new byte[0];
       this.mListenerLock = uobyteArray;
       long l = 0;
       this.m_securityID = l;
       this.m_securityID = (a.b.booleanValue())? l: KSecurity.getKSBridgeFuncAddr();
       p0 = this.nativeInitController(p0, p1, this.m_securityID);
       this.nativeController = p0;
       if (!p1) {
          this.nativeProcessor = this.nativeGetGlProcessor(p0);
       }
       this.checker = new FaceMagicController$1(this);
       return;
    }
    public static void addFaceMagicLoadEffectFailedListener(FaceMagicController$FaceMagicLoadEffectFailedListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, FaceMagicController.class, "16")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       Object lOCK = FaceMagicController.LOCK;
       _monitor_enter(lOCK);
       FaceMagicController.sFaceMagicLoadEffectFailedListeners.add(p0);
       _monitor_exit(lOCK);
       return;
    }
    public static void enableAlertBox(boolean p0){
       FaceMagicController uFaceMagicCo = FaceMagicController.class;
       if (PatchProxy.isSupport(uFaceMagicCo) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, uFaceMagicCo, "34")) {
          return;
       }
       FaceMagicController.nativeEnableAlertBox(p0);
       return;
    }
    public static void enableMagicFileCheckCallback(){
       if (PatchProxy.applyVoid(null, null, FaceMagicController.class, "88")) {
          return;
       }
       FaceMagicController.nativeEnableMagicFileCheckCallback();
       return;
    }
    public static int getDeformLiquifyIDBase(){
       return 0x2710;
    }
    public static int getSupport3DVersion(){
       return FacelessResourceVersion.SUPPORT_3D_VERSION;
    }
    public static int getSupportMakeupVersion(){
       return FacelessResourceVersion.SUPPORT_MAKEUP_VERSION;
    }
    public static int getSupportMaxVersion(){
       return FacelessResourceVersion.SUPPORT_MAX_VERSION;
    }
    public static int[] getUnSupportMakeupVersion(){
       return FacelessResourceVersion.UNSUPPORT_MAKEUP_VERSION;
    }
    public static int[] getUnSupportVersion(){
       return FacelessResourceVersion.UNSUPPORT_VERSION;
    }
    public static boolean isResourceValid(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, FaceMagicController.class, "89");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return new File(p0, "params.txt").exists();
    }
    public static native int nativeCurrentInteractiveBoxResource(long p0);
    public static native void nativeEnableAlertBox(boolean p0);
    public static native void nativeEnableEffectDetect(long p0,boolean p1);
    public static native void nativeEnableMagicFileCheckCallback();
    public static native boolean nativeGetEffectDetectResult(long p0);
    public static native void nativeLoadInteractiveBoxResource(long p0,byte[] p1,boolean p2);
    public static native void nativeSetAioSafe(long p0,boolean p1);
    public static native void nativeSetBeautifyExternalBuiltinPath(String p0);
    public static native void nativeSetRecordingSpeed(long p0,float p1);
    public static native void nativeSetRunningKeyandValue(String p0,String p1);
    public static native void nativeSetTimeControl(long p0,boolean p1);
    public static void onLoadFileError(String p0,int p1){
       FaceMagicController uFaceMagicCo = FaceMagicController.class;
       if (PatchProxy.isSupport(uFaceMagicCo) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, uFaceMagicCo, "66")) {
          return;
       }
       FaceMagicController$FaceMagicLoadEffectFailedListener sFaceMagicLo = FaceMagicController.sFaceMagicLoadEffectFailedListener;
       if (sFaceMagicLo != null) {
          sFaceMagicLo.onLoadFileError(p0, p1);
       }
       Iterator iterator = FaceMagicController.sFaceMagicLoadEffectFailedListeners.iterator();
       while (iterator.hasNext()) {
          FaceMagicController$FaceMagicLoadEffectFailedListener uFaceMagicLo = iterator.next();
          if (uFaceMagicLo != null) {
             uFaceMagicLo.onLoadFileError(p0, p1);
          }
       }
       return;
    }
    public static void removeFaceMagicLoadEffectFailedListener(FaceMagicController$FaceMagicLoadEffectFailedListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, FaceMagicController.class, "17")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       Object lOCK = FaceMagicController.LOCK;
       _monitor_enter(lOCK);
       if (FaceMagicController.sFaceMagicLoadEffectFailedListeners.contains(p0)) {
          FaceMagicController.sFaceMagicLoadEffectFailedListeners.remove(p0);
       }
       _monitor_exit(lOCK);
       return;
    }
    public static void setBeautifyExternalBuiltinPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, FaceMagicController.class, "49")) {
          return;
       }
       FaceMagicController.nativeEnableMagicFileCheckCallback();
       if (p0 == null) {
          p0 = "";
       }
       FaceMagicController.nativeSetBeautifyExternalBuiltinPath(p0);
       return;
    }
    public static void setFaceMagicLoadEffectFailedListener(FaceMagicController$FaceMagicLoadEffectFailedListener p0){
       FaceMagicController.sFaceMagicLoadEffectFailedListener = p0;
    }
    public static void setRunningKeyandValue(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, FaceMagicController.class, "47")) {
          return;
       }
       FaceMagicController.nativeEnableMagicFileCheckCallback();
       if (p0 == null) {
          p0 = "";
       }
       if (p1 == null) {
          p1 = "";
       }
       FaceMagicController.nativeSetRunningKeyandValue(p0, p1);
       return;
    }
    public final void OnBodySlimmingRenderStatus(boolean p0){
       FaceMagicController uFaceMagicCo = FaceMagicController.class;
       if (PatchProxy.isSupport(uFaceMagicCo) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uFaceMagicCo, "72")) {
          return;
       }
       uFaceMagicCo = this.bodySlimmingListener;
       if (uFaceMagicCo != null) {
          uFaceMagicCo.OnBodySlimmingRenderStatus(p0);
       }
       return;
    }
    public final void OnBodySlimmingStatusChanged(boolean p0){
       FaceMagicController uFaceMagicCo = FaceMagicController.class;
       if (PatchProxy.isSupport(uFaceMagicCo) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uFaceMagicCo, "71")) {
          return;
       }
       uFaceMagicCo = this.bodySlimmingListener;
       if (uFaceMagicCo != null) {
          uFaceMagicCo.OnBodySlimmingStatusChanged(p0);
       }
       return;
    }
    public final void OnPoliticDetectResult(int p0){
       FaceMagicController uFaceMagicCo = FaceMagicController.class;
       if (PatchProxy.isSupport(uFaceMagicCo) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uFaceMagicCo, "74")) {
          return;
       }
       uFaceMagicCo = this.politicDetectListener;
       if (uFaceMagicCo != null) {
          uFaceMagicCo.OnPoliticDetectResult(p0);
       }
       return;
    }
    public final void OnSingleBodySlimmingStatusChanged(int p0,boolean p1){
       FaceMagicController uFaceMagicCo = FaceMagicController.class;
       if (PatchProxy.isSupport(uFaceMagicCo) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, uFaceMagicCo, "73")) {
          return;
       }
       uFaceMagicCo = this.bodySlimmingListener;
       if (uFaceMagicCo != null) {
          uFaceMagicCo.OnSingleBodySlimmingStatusChanged(BodySlimmingAdjustType.forNumber(p0), p1);
       }
       return;
    }
    public void beautifyStatusChanged(int p0,int p1){
       FaceMagicController uFaceMagicCo = FaceMagicController.class;
       if (PatchProxy.isSupport(uFaceMagicCo) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uFaceMagicCo, "112")) {
          return;
       }
       uFaceMagicCo = this.beautifyStatusChangedListener;
       if (uFaceMagicCo != null) {
          uFaceMagicCo.beautifyStatusChanged(p0, p1);
       }
       return;
    }
    public void closeMagicAudio(){
       if (PatchProxy.applyVoid(null, this, FaceMagicController.class, "42")) {
          return;
       }
       this.sendEffectCommand(EffectCommand.newBuilder().setCommandType(EffectCommandType.kCloseMagicAudio).build());
       return;
    }
    public void closeMagicAudioSync(){
       if (PatchProxy.applyVoid(null, this, FaceMagicController.class, "43")) {
          return;
       }
       this.sendEffectCommandSync(EffectCommand.newBuilder().setCommandType(EffectCommandType.kCloseMagicAudio).build());
       return;
    }
    public long createNativeProcessor(){
       return 0;
    }
    public int currentInteractiveBoxResource(){
       Object obj = PatchProxy.apply(null, this, FaceMagicController.class, "110");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.checker.isValid()) {
          return FaceMagicController.nativeCurrentInteractiveBoxResource(this.nativeController);
       }
       return -1;
    }
    public void disableEffectAtSlot(EffectSlot p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FaceMagicController.class, "29")) {
          return;
       }
       if (this.checker.isValid()) {
          this.nativeDisableEffect(this.nativeController, p0.getNumber());
       }
       return;
    }
    public void disableEffectAtSlot(EffectSlot p0,EffectResource p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FaceMagicController.class, "30")) {
          return;
       }
       if (this.checker.isValid()) {
          if (p1 == null) {
             this.nativeDisableEffect2(this.nativeController, p0.getNumber(), null);
          }else {
             this.nativeDisableEffect2(this.nativeController, p0.getNumber(), p1.toByteArray());
          }
       }
       return;
    }
    public void enableEffectDetect(boolean p0){
       FaceMagicController uFaceMagicCo = FaceMagicController.class;
       if (PatchProxy.isSupport(uFaceMagicCo) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uFaceMagicCo, "105")) {
          return;
       }
       if (this.checker.isValid()) {
          FaceMagicController.nativeEnableEffectDetect(this.nativeController, p0);
       }
       return;
    }
    public void enablePerfMonitor(boolean p0){
       FaceMagicController uFaceMagicCo = FaceMagicController.class;
       if (PatchProxy.isSupport(uFaceMagicCo) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uFaceMagicCo, "91")) {
          return;
       }
       if (this.checker.isValid()) {
          this.nativeEnablePerfMonitor(this.nativeController, p0);
       }
       return;
    }
    public boolean getEffectDetectResult(){
       Object obj = PatchProxy.apply(null, this, FaceMagicController.class, "106");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.checker.isValid()) {
          return FaceMagicController.nativeGetEffectDetectResult(this.nativeController);
       }
       return false;
    }
    public String getFaceMagicInfo(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FaceMagicController.class, "93");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.checker.isValid()) {
          return this.nativeGetFaceMagicInfo(this.nativeController, p0);
       }
       return "";
    }
    public double getRedPacketScore(){
       double d;
       FaceMagicController obj = PatchProxy.apply(null, this, FaceMagicController.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       obj = 0x4049000000000000;
       if (this.checker.isValid()) {
          d = this.nativeGetRedPacketScore(this.nativeController);
       }
       return d;
    }
    public String getSDKPerformanceData(){
       Object obj = PatchProxy.apply(null, this, FaceMagicController.class, "92");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.checker.isValid()) {
          return this.nativeGetSDKPerformanceData(this.nativeController);
       }
       return "";
    }
    public void loadInteractiveBoxResource(EffectResource p0,FaceMagicController$FaceMagicLiveinteractiveResourceListener p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FaceMagicController.class, "107")) {
          return;
       }
       if (this.checker.isValid()) {
          this.liveInteractiveListener = p1;
          FaceMagicController tnativeContr = this.nativeController;
          byte[] uobyteArray = p0.toByteArray();
          boolean b = (p1 != null)? true: false;
          FaceMagicController.nativeLoadInteractiveBoxResource(tnativeContr, uobyteArray, b);
       }
       return;
    }
    public FaceMagicController$Image loadStickerTextureFromNative(String p0,String p1){
       FaceMagicController$Image obj = PatchProxy.applyTwoRefs(p0, p1, this, FaceMagicController.class, "101");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new FaceMagicController$Image();
       FaceMagicController tstickerText = this.stickerTextureLoadCb;
       if (tstickerText != null) {
          Bitmap uBitmap = tstickerText.loadStickerTexture(p0, p1);
          if (uBitmap == null) {
             obj.type = 0;
             return obj;
          }else {
             obj.type = 1;
             obj.width = uBitmap.getWidth();
             obj.height = uBitmap.getHeight();
             obj.textureId = a.d(uBitmap);
          }
       }
       return obj;
    }
    public native final void nativeDestroyController(long p0);
    public native final void nativeDisableEffect(long p0,int p1);
    public native final void nativeDisableEffect2(long p0,int p1,byte[] p2);
    public native void nativeEnablePerfMonitor(long p0,boolean p1);
    public native String nativeGetFaceMagicInfo(long p0,String p1);
    public native final long nativeGetGlProcessor(long p0);
    public native final double nativeGetRedPacketScore(long p0);
    public native String nativeGetSDKPerformanceData(long p0);
    public native final long nativeInitController(long p0,boolean p1,long p2);
    public native final void nativeSendBatchEffectCommand(long p0,byte[] p1);
    public native final void nativeSendEffectCommand(long p0,byte[] p1);
    public native final void nativeSendEffectCommandSync(long p0,byte[] p1);
    public native void nativeSetABTestJson(long p0,String p1);
    public native final void nativeSetAppKey(long p0,String p1);
    public native void nativeSetBeautifyStatusChangedCallback(long p0,boolean p1);
    public native final void nativeSetDynamicRunningKeyandValue(String p0,String p1);
    public native final void nativeSetEffect(long p0,byte[] p1,int p2,int p3,long p4);
    public native final void nativeSetEffectEnable(long p0,int p1,boolean p2);
    public native final void nativeSetEnableDeformGradient(long p0,boolean p1);
    public native final void nativeSetExternalBuiltinPath(long p0,String p1);
    public native void nativeSetExtraCommand(long p0,String p1);
    public native final void nativeSetGiftEffect(long p0,byte[] p1,int p2,int p3,boolean p4,long p5);
    public native final void nativeSetInitialVideoFrameSize(long p0,int p1,int p2);
    public native void nativeSetIsValidPortraitCallback(long p0,boolean p1);
    public native void nativeSetOnExpressionChangedCallback(long p0,String p1,boolean p2);
    public native final void nativeSetPickedFaceImage(long p0,String p1);
    public native void nativeSetReportBeautifyLogCallback(long p0,boolean p1);
    public native final void nativeSetUserInfo(long p0,byte[] p1);
    public native final void nativeUpdateEffectControl(long p0,byte[] p1);
    public native final void nativeUpdateEffectUsingFramePts(long p0,boolean p1);
    public void onCallCaptureTexture(){
       if (PatchProxy.applyVoid(null, this, FaceMagicController.class, "98")) {
          return;
       }
       FaceMagicController tcaptureList = this.captureListener;
       if (tcaptureList != null) {
          tcaptureList.faceMagicNeedCapture();
       }
       return;
    }
    public final void onCancelServerRequestWithKey(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FaceMagicController.class, "87")) {
          return;
       }
       FaceMagicController tpickingServ = this.pickingServerMediaListener;
       if (tpickingServ != null) {
          tpickingServ.onCancelServerTaskWithKey(p0);
       }
       return;
    }
    public final void onDepthFinishCallback(){
       if (PatchProxy.applyVoid(null, this, FaceMagicController.class, "79")) {
          return;
       }
       FaceMagicController tdepthFinish = this.depthFinishListener;
       if (tdepthFinish != null) {
          tdepthFinish.faceMagicDepthFinish();
       }
       return;
    }
    public final void onEffectDescriptionFromNative(byte[] p0,int p1){
       FaceMagicController uFaceMagicCo = FaceMagicController.class;
       if (PatchProxy.isSupport(uFaceMagicCo) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uFaceMagicCo, "53")) {
          return;
       }
       try{
          uFaceMagicCo = this.mListenerLock;
          _monitor_enter(uFaceMagicCo);
          FaceMagicController tuFaceMagicC = this.faceMagicListener;
          if (tuFaceMagicC != null) {
             if (p0 != null) {
                this.faceMagicListener.onEffectDescriptionUpdated(EffectDescription.parseFrom(p0), EffectSlot.forNumber(p1));
             }else {
                tuFaceMagicC.onEffectDescriptionUpdated(null, EffectSlot.forNumber(p1));
             }
          }
          _monitor_exit(uFaceMagicCo);
       }catch(com.google.protobuf.InvalidProtocolBufferException e4){
          e4.printStackTrace();
       }
       return;
    }
    public final void onEffectDescriptionFromNative(byte[] p0,int p1,byte[] p2,boolean p3){
       if (PatchProxy.isSupport(FaceMagicController.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, Boolean.valueOf(p3), this, FaceMagicController.class, "54")) {
          return;
       }
       try{
          FaceMagicController tmListenerLo = this.mListenerLock;
          _monitor_enter(tmListenerLo);
          if (this.faceMagicListener != null) {
             EffectResource uEffectResou = null;
             EffectDescription uEffectDescr = (p0 != null)? EffectDescription.parseFrom(p0): uEffectResou;
             if (p2 != null) {
                uEffectResou = EffectResource.parseFrom(p2);
             }
             if (!p3) {
                if (uEffectDescr.getRenderCode() == EffectErrorCode.kSuccess) {
                   this.faceMagicListener.onEffectDescriptionUpdated(uEffectDescr, EffectSlot.forNumber(p1), uEffectResou);
                }else {
                   this.faceMagicListener.onEffectDescriptionUpdatedOnError(uEffectDescr, EffectSlot.forNumber(p1), uEffectResou);
                }
             }else {
                this.faceMagicListener.onEffectDescriptionUpdatedOnCancel(uEffectDescr, EffectSlot.forNumber(p1), uEffectResou);
             }
          }
          _monitor_exit(tmListenerLo);
       }catch(com.google.protobuf.InvalidProtocolBufferException e9){
          e9.printStackTrace();
       }
       return;
    }
    public final void onEffectHintFromNative(byte[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FaceMagicController.class, "55")) {
          return;
       }
       FaceMagicController tmListenerLo = this.mListenerLock;
       _monitor_enter(tmListenerLo);
       if (this.faceMagicListener != null) {
          try{
             this.faceMagicListener.onEffectHintUpdated(EffectHint.parseFrom(p0));
          }catch(com.google.protobuf.InvalidProtocolBufferException e3){
             e3.printStackTrace();
          }
       }
    }
    public final void onEffectPlayCompleted(int p0,int p1){
       FaceMagicController uFaceMagicCo = FaceMagicController.class;
       if (PatchProxy.isSupport(uFaceMagicCo) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uFaceMagicCo, "58")) {
          return;
       }
       uFaceMagicCo = this.mListenerLock;
       _monitor_enter(uFaceMagicCo);
       FaceMagicController tuFaceMagicC = this.faceMagicListener;
       if (tuFaceMagicC != null) {
          tuFaceMagicC.onEffectPlayCompleted(EffectSlot.forNumber(p0), p1);
       }
       _monitor_exit(uFaceMagicCo);
       return;
    }
    public final void onFaceMagicEnvironmentUnsafe(int p0){
       FaceMagicController uFaceMagicCo = FaceMagicController.class;
       if (PatchProxy.isSupport(uFaceMagicCo) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uFaceMagicCo, "67")) {
          return;
       }
       uFaceMagicCo = this.mListenerLock;
       _monitor_enter(uFaceMagicCo);
       FaceMagicController tuFaceMagicC = this.faceMagicEnvironmentUnsafeListener;
       if (tuFaceMagicC != null) {
          tuFaceMagicC.onFaceMagicEnvironmentUnsafe(p0);
       }
       _monitor_exit(uFaceMagicCo);
       return;
    }
    public final void onGetUserInfoFromNative(){
       if (PatchProxy.applyVoid(null, this, FaceMagicController.class, "56")) {
          return;
       }
       FaceMagicController tmListenerLo = this.mListenerLock;
       _monitor_enter(tmListenerLo);
       FaceMagicController tuserInfoLis = this.userInfoListener;
       if (tuserInfoLis != null) {
          tuserInfoLis.onGetUserInfo();
       }
       _monitor_exit(tmListenerLo);
       return;
    }
    public final void onInputTextRequest(int p0,String p1){
       FaceMagicController uFaceMagicCo = FaceMagicController.class;
       if (PatchProxy.isSupport(uFaceMagicCo) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uFaceMagicCo, "83")) {
          return;
       }
       uFaceMagicCo = this.inputTextRequestListener;
       if (uFaceMagicCo != null) {
          uFaceMagicCo.onInputTextRequest(p0, p1);
       }
       return;
    }
    public final void onInputTextRequestWithConfig(int p0,String p1,byte[] p2){
       if (PatchProxy.isSupport(FaceMagicController.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, FaceMagicController.class, "84")) {
          return;
       }
       if (this.inputTextRequestWithConfigListener != null) {
          TriggerInputTextConfig triggerInput = null;
          if (p2 != null) {
             try{
                triggerInput = TriggerInputTextConfig.parseFrom(p2);
             }catch(com.google.protobuf.InvalidProtocolBufferException e10){
                e10.printStackTrace();
             }
          }
       }
       return;
    }
    public final void onInputTextsRequest(int p0){
       FaceMagicController uFaceMagicCo = FaceMagicController.class;
       if (PatchProxy.isSupport(uFaceMagicCo) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uFaceMagicCo, "85")) {
          return;
       }
       uFaceMagicCo = this.inputTextsRequestListener;
       if (uFaceMagicCo != null) {
          uFaceMagicCo.onInputTextsRequest(p0);
       }
       return;
    }
    public void onLiveinteractiveResource(boolean p0,String p1){
       FaceMagicController uFaceMagicCo = FaceMagicController.class;
       if (PatchProxy.isSupport(uFaceMagicCo) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uFaceMagicCo, "109")) {
          return;
       }
       uFaceMagicCo = this.mListenerLock;
       _monitor_enter(uFaceMagicCo);
       FaceMagicController tliveInterac = this.liveInteractiveListener;
       if (tliveInterac != null) {
          tliveInterac.onLiveinterativeBoxResource(p0, p1);
       }
       _monitor_exit(uFaceMagicCo);
       return;
    }
    public final void onLoadGroupEffect(byte[] p0,int p1,String p2){
       if (PatchProxy.isSupport(FaceMagicController.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, FaceMagicController.class, "65")) {
          return;
       }
       FaceMagicController tmListenerLo = this.mListenerLock;
       _monitor_enter(tmListenerLo);
       if (this.faceMagicListener != null) {
          EffectDescription uEffectDescr = null;
          if (p0 != null) {
             try{
                uEffectDescr = EffectDescription.parseFrom(p0);
             }catch(com.google.protobuf.InvalidProtocolBufferException e8){
                e8.printStackTrace();
             }
          }
       }
       _monitor_exit(tmListenerLo);
       return;
    }
    public final void onReceiveRecordingControl(int p0){
       FaceMagicController uFaceMagicCo = FaceMagicController.class;
       if (PatchProxy.isSupport(uFaceMagicCo) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uFaceMagicCo, "77")) {
          return;
       }
       uFaceMagicCo = this.recordingControlListener;
       if (uFaceMagicCo != null) {
          uFaceMagicCo.onReceiveRecordingControl(p0);
       }
       return;
    }
    public void onReceiveValidPortrait(boolean p0){
       FaceMagicController uFaceMagicCo = FaceMagicController.class;
       if (PatchProxy.isSupport(uFaceMagicCo) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uFaceMagicCo, "100")) {
          return;
       }
       uFaceMagicCo = this.portraitListener;
       if (uFaceMagicCo != null) {
          uFaceMagicCo.onReceiveValidPortrait(p0);
       }
       return;
    }
    public final void onReceivedBokehMask(byte[] p0,int p1,int p2){
       if (PatchProxy.isSupport(FaceMagicController.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, FaceMagicController.class, "63")) {
          return;
       }
       FaceMagicController tbokehListen = this.bokehListener;
       if (tbokehListen != null) {
          tbokehListen.onReceivedBokehMask(p0, p1, p2);
       }
       return;
    }
    public final void onReceivedBokehStatus(int p0){
       FaceMagicController uFaceMagicCo = FaceMagicController.class;
       if (PatchProxy.isSupport(uFaceMagicCo) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uFaceMagicCo, "62")) {
          return;
       }
       uFaceMagicCo = this.bokehListener;
       if (uFaceMagicCo != null) {
          uFaceMagicCo.onReceivedBokehStatus(p0);
       }
       return;
    }
    public final void onReceivedBoomGameInfo(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FaceMagicController.class, "75")) {
          return;
       }
       FaceMagicController tboomGameLis = this.boomGameListener;
       if (tboomGameLis != null) {
          tboomGameLis.onReceivedBoomGameInfo(p0);
       }
       return;
    }
    public final void onReceivedBoomGameInfoWithTextureGL(String p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(FaceMagicController.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, FaceMagicController.class, "76")) {
          return;
       }
       if (this.boomGameListener != null) {
          this.boomGameListener.onReceivedBoomGameInfoWithBitmap(p0, a.f(p1, p2, p3));
       }
       return;
    }
    public void onReceivedEffectDetect(boolean p0){
       FaceMagicController uFaceMagicCo = FaceMagicController.class;
       if (PatchProxy.isSupport(uFaceMagicCo) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uFaceMagicCo, "104")) {
          return;
       }
       uFaceMagicCo = this.effectDetectListener;
       if (uFaceMagicCo != null) {
          uFaceMagicCo.onReceivedEffectDetect(p0);
       }
       return;
    }
    public final void onReceivedEffectInitStatus(boolean p0){
       FaceMagicController uFaceMagicCo = FaceMagicController.class;
       if (PatchProxy.isSupport(uFaceMagicCo) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uFaceMagicCo, "64")) {
          return;
       }
       uFaceMagicCo = this.effectInitStatusListener;
       if (uFaceMagicCo != null) {
          uFaceMagicCo.onReceivedEffectInitStatus(p0);
       }
       return;
    }
    public void onReceivedExpressionChanged(String p0,boolean p1){
       FaceMagicController uFaceMagicCo = FaceMagicController.class;
       if (PatchProxy.isSupport(uFaceMagicCo) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uFaceMagicCo, "99")) {
          return;
       }
       uFaceMagicCo = this.expressionListener;
       if (uFaceMagicCo != null) {
          uFaceMagicCo.onReceivedExpressionChanged(p0, p1);
       }
       return;
    }
    public final void onReceivedLockExposure(){
       if (PatchProxy.applyVoid(null, this, FaceMagicController.class, "78")) {
          return;
       }
       FaceMagicController tlockExposur = this.lockExposureListener;
       if (tlockExposur != null) {
          tlockExposur.onReceivedLockExposure();
       }
       return;
    }
    public void onReceivedMagicAlbumTextureInfo(int p0,int p1,int p2){
       if (PatchProxy.isSupport(FaceMagicController.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, FaceMagicController.class, "102")) {
          return;
       }
       if (this.magicAlbumListener != null) {
          this.magicAlbumListener.onReceivedMagicAlbumImage(a.f(p0, p1, p2));
       }
       return;
    }
    public final void onReceivedMagicRemovelStatus(int p0){
       FaceMagicController uFaceMagicCo = FaceMagicController.class;
       if (PatchProxy.isSupport(uFaceMagicCo) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uFaceMagicCo, "61")) {
          return;
       }
       uFaceMagicCo = this.magicRemovelListener;
       if (uFaceMagicCo != null) {
          uFaceMagicCo.onReceivedMagicRemovelStatus(p0);
       }
       return;
    }
    public final void onReceivedMemojiIcon(ByteBuffer p0,int p1,int p2){
       if (PatchProxy.isSupport(FaceMagicController.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, FaceMagicController.class, "60")) {
          return;
       }
       FaceMagicController tmListenerLo = this.mListenerLock;
       _monitor_enter(tmListenerLo);
       if (this.memojiListener != null) {
          p0.position(0);
          Bitmap uBitmap = Bitmap.createBitmap(p1, p2, Bitmap$Config.ARGB_8888);
          uBitmap.copyPixelsFromBuffer(p0);
          this.memojiListener.onReceivedMemojiIcon(uBitmap);
       }
       _monitor_exit(tmListenerLo);
       return;
    }
    public final void onReceivedMemojiUserConfigJsonNative(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FaceMagicController.class, "59")) {
          return;
       }
       FaceMagicController tmListenerLo = this.mListenerLock;
       _monitor_enter(tmListenerLo);
       FaceMagicController tmemojiListe = this.memojiListener;
       if (tmemojiListe != null) {
          tmemojiListe.onReceivedMemojiUserConfigJson(p0);
       }
       _monitor_exit(tmListenerLo);
       return;
    }
    public final void onReceivedServerMediaRequest(byte[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FaceMagicController.class, "86")) {
          return;
       }
       if (this.pickingServerMediaListener != null) {
          ServerMediaRequest serverMediaR = null;
          if (p0 != null) {
             try{
                serverMediaR = ServerMediaRequest.parseFrom(p0);
             }catch(com.google.protobuf.InvalidProtocolBufferException e3){
                e3.printStackTrace();
             }
          }
       }
       return;
    }
    public final void onRequestPickImageFromNative(){
       if (PatchProxy.applyVoid(null, this, FaceMagicController.class, "57")) {
          return;
       }
       FaceMagicController tmListenerLo = this.mListenerLock;
       _monitor_enter(tmListenerLo);
       FaceMagicController tpickFaceIma = this.pickFaceImageListener;
       if (tpickFaceIma != null) {
          tpickFaceIma.onRequestPickFaceImage();
       }
       _monitor_exit(tmListenerLo);
       return;
    }
    public final void onSetEffectFailed(byte[] p0,int p1,byte[] p2){
       EffectResource uEffectResou;
       if (PatchProxy.isSupport(FaceMagicController.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, FaceMagicController.class, "69")) {
          return;
       }
       if (this.faceMagicListener != null) {
          EffectError uEffectError = null;
          if (p0 != null) {
             try{
                uEffectResou = EffectResource.parseFrom(p0);
             label_002b :
                if (p2 != null) {
                   try{
                      uEffectError = EffectError.parseFrom(p2);
                   }catch(com.google.protobuf.InvalidProtocolBufferException e10){
                      e10.printStackTrace();
                   }
                }
             }catch(com.google.protobuf.InvalidProtocolBufferException e8){
                e8.printStackTrace();
             }
             uEffectResou = uEffectError;
             goto label_002b ;
          }else {
             goto label_002a ;
          }
       }
       return;
    }
    public void onStickerExportResult(int p0,int p1,int p2,String p3){
       if (PatchProxy.isSupport(FaceMagicController.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), p3, this, FaceMagicController.class, "103")) {
          return;
       }
       if (this.stickerTextureLoadCb != null) {
          this.stickerTextureLoadCb.onStickerExportResult(a.f(p0, p1, p2), p3);
       }
       return;
    }
    public void pause(){
       if (PatchProxy.applyVoid(null, this, FaceMagicController.class, "38")) {
          return;
       }
       this.sendEffectCommand(EffectCommand.newBuilder().setCommandType(EffectCommandType.kPause).build());
       return;
    }
    public void pauseSync(){
       if (PatchProxy.applyVoid(null, this, FaceMagicController.class, "39")) {
          return;
       }
       this.sendEffectCommandSync(EffectCommand.newBuilder().setCommandType(EffectCommandType.kPause).build());
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, FaceMagicController.class, "52")) {
          return;
       }
       super.release();
       this.nativeDestroyController(this.nativeController);
       this.nativeController = 0;
       return;
    }
    public void reportBeautifyLog(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FaceMagicController.class, "111")) {
          return;
       }
       FaceMagicController treportBeaut = this.reportBeautifyLogListener;
       if (treportBeaut != null) {
          treportBeaut.reportBeautifyLog(p0, p1);
       }
       return;
    }
    public void reset(){
       if (PatchProxy.applyVoid(null, this, FaceMagicController.class, "41")) {
          return;
       }
       this.sendEffectCommand(EffectCommand.newBuilder().setCommandType(EffectCommandType.kReset).build());
       return;
    }
    public void resume(){
       if (PatchProxy.applyVoid(null, this, FaceMagicController.class, "40")) {
          return;
       }
       this.sendEffectCommand(EffectCommand.newBuilder().setCommandType(EffectCommandType.kResume).build());
       return;
    }
    public void resumeMagicAudio(){
       if (PatchProxy.applyVoid(null, this, FaceMagicController.class, "44")) {
          return;
       }
       this.sendEffectCommand(EffectCommand.newBuilder().setCommandType(EffectCommandType.kResumeMagicAudio).build());
       return;
    }
    public void resumeMagicAudioSync(){
       if (PatchProxy.applyVoid(null, this, FaceMagicController.class, "45")) {
          return;
       }
       this.sendEffectCommandSync(EffectCommand.newBuilder().setCommandType(EffectCommandType.kResumeMagicAudio).build());
       return;
    }
    public void sendBatchEffectCommand(BatchEffectCommand p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FaceMagicController.class, "25")) {
          return;
       }
       if (this.checker.isValid()) {
          Iterator iterator = p0.getCommandsList().iterator();
          while (iterator.hasNext()) {
             int i = FaceMagicController$2.$SwitchMap$com$kwai$video$westeros$models$EffectCommandType[iterator.next().getCommandType().ordinal()];
             if (i != 1 && (i != 2 && i != 3)) {
                continue ;
             }
             FaceMagicController.nativeEnableMagicFileCheckCallback();
          }
          this.nativeSendBatchEffectCommand(this.nativeController, p0.toByteArray());
       }
       return;
    }
    public void sendEffectCommand(EffectCommand p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FaceMagicController.class, "23")) {
          return;
       }
       if (this.checker.isValid()) {
          int i = FaceMagicController$2.$SwitchMap$com$kwai$video$westeros$models$EffectCommandType[p0.getCommandType().ordinal()];
          if (i == 1 || (i == 2 || i == 3)) {
             FaceMagicController.nativeEnableMagicFileCheckCallback();
          }
          this.nativeSendEffectCommand(this.nativeController, p0.toByteArray());
       }
       return;
    }
    public void sendEffectCommandSync(EffectCommand p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FaceMagicController.class, "24")) {
          return;
       }
       if (this.checker.isValid()) {
          this.nativeSendEffectCommandSync(this.nativeController, p0.toByteArray());
       }
       return;
    }
    public void setABTestJson(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FaceMagicController.class, "90")) {
          return;
       }
       if (this.checker.isValid()) {
          this.nativeSetABTestJson(this.nativeController, p0);
       }
       return;
    }
    public void setAioSafe(boolean p0){
       FaceMagicController uFaceMagicCo = FaceMagicController.class;
       if (PatchProxy.isSupport(uFaceMagicCo) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uFaceMagicCo, "68")) {
          return;
       }
       if (this.checker.isValid()) {
          FaceMagicController.nativeSetAioSafe(this.nativeController, p0);
       }
       return;
    }
    public void setAppKey(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FaceMagicController.class, "70")) {
          return;
       }
       if (this.checker.isValid()) {
          this.nativeSetAppKey(this.nativeController, p0);
       }
       return;
    }
    public void setBeautifyStatusChangedListener(FaceMagicController$FaceMagicBeautifyStatusChangedListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FaceMagicController.class, "96")) {
          return;
       }
       if (this.checker.isValid()) {
          this.beautifyStatusChangedListener = p0;
          FaceMagicController tnativeContr = this.nativeController;
          boolean b = (p0 != null)? true: false;
          this.nativeSetBeautifyStatusChangedCallback(tnativeContr, b);
       }
       return;
    }
    public void setDynamicRunningKeyandValue(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FaceMagicController.class, "48")) {
          return;
       }
       FaceMagicController.nativeEnableMagicFileCheckCallback();
       if (p0 == null) {
          p0 = "";
       }
       if (p1 == null) {
          p1 = "";
       }
       this.nativeSetDynamicRunningKeyandValue(p0, p1);
       return;
    }
    public void setEffectAtSlot(EffectResource p0,EffectSlot p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FaceMagicController.class, "26")) {
          return;
       }
       if (this.checker.isValid()) {
          if (p1 == EffectSlot.kEffectSlotMain) {
             FaceMagicController.nativeEnableMagicFileCheckCallback();
          }
          this.setEffectAtSlot(p0, p1, 0);
       }
       return;
    }
    public void setEffectAtSlot(EffectResource p0,EffectSlot p1,int p2){
       if (PatchProxy.isSupport(FaceMagicController.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, FaceMagicController.class, "27")) {
          return;
       }
       if (this.checker.isValid()) {
          this.nativeSetEffect(this.nativeController, p0.toByteArray(), p1.getNumber(), p2, this.m_securityID);
       }
       return;
    }
    public void setEffectAtSlot(EffectResource p0,EffectSlot p1,int p2,boolean p3){
       if (PatchProxy.isSupport(FaceMagicController.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Boolean.valueOf(p3), this, FaceMagicController.class, "28")) {
          return;
       }
       if (this.checker.isValid()) {
          this.nativeSetGiftEffect(this.nativeController, p0.toByteArray(), p1.getNumber(), p2, p3, this.m_securityID);
       }
       return;
    }
    public void setEffectEnable(EffectType p0,boolean p1){
       FaceMagicController uFaceMagicCo = FaceMagicController.class;
       if (PatchProxy.isSupport(uFaceMagicCo) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uFaceMagicCo, "22")) {
          return;
       }
       if (this.checker.isValid()) {
          this.nativeSetEffectEnable(this.nativeController, p0.getNumber(), p1);
       }
       return;
    }
    public void setEnableDeformGradient(boolean p0){
       FaceMagicController uFaceMagicCo = FaceMagicController.class;
       if (PatchProxy.isSupport(uFaceMagicCo) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uFaceMagicCo, "7")) {
          return;
       }
       if (this.checker.isValid()) {
          this.nativeSetEnableDeformGradient(this.nativeController, p0);
       }
       return;
    }
    public void setExternalBuiltinPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FaceMagicController.class, "46")) {
          return;
       }
       FaceMagicController tnativeContr = this.nativeController;
       if (p0 == null) {
          p0 = "";
       }
       this.nativeSetExternalBuiltinPath(tnativeContr, p0);
       return;
    }
    public void setExtraCommand(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FaceMagicController.class, "51")) {
          return;
       }
       this.nativeSetExtraCommand(this.nativeController, p0);
       return;
    }
    public void setFaceMagicBodySlimmingListener(FaceMagicController$FaceMagicBodySlimmingListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FaceMagicController.class, "10")) {
          return;
       }
       if (this.checker.isValid()) {
          this.bodySlimmingListener = p0;
       }
       return;
    }
    public void setFaceMagicBokehListener(FaceMagicController$FaceMagicBokehListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FaceMagicController.class, "3")) {
          return;
       }
       if (this.checker.isValid()) {
          this.bokehListener = p0;
       }
       return;
    }
    public void setFaceMagicBoomGameListener(FaceMagicController$FaceMagicBoomGameListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FaceMagicController.class, "12")) {
          return;
       }
       if (this.checker.isValid()) {
          this.boomGameListener = p0;
       }
       return;
    }
    public void setFaceMagicDepthFinishListener(FaceMagicController$FaceMagicDepthFinishListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FaceMagicController.class, "18")) {
          return;
       }
       if (this.checker.isValid()) {
          this.depthFinishListener = p0;
       }
       return;
    }
    public void setFaceMagicEffectDetectListener(FaceMagicController$FaceMagicEffectDetectListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FaceMagicController.class, "37")) {
          return;
       }
       if (this.checker.isValid()) {
          this.effectDetectListener = p0;
       }
       return;
    }
    public void setFaceMagicEffectInitStatusListener(FaceMagicController$FaceMagicEffectInitStatusListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FaceMagicController.class, "4")) {
          return;
       }
       if (this.checker.isValid()) {
          this.effectInitStatusListener = p0;
       }
       return;
    }
    public void setFaceMagicEnvironmentUnsafeListener(FaceMagicController$FaceMagicEnvironmentUnsafeListener p0){
       this.faceMagicEnvironmentUnsafeListener = p0;
    }
    public void setFaceMagicExpressionListener(String p0,FaceMagicController$FaceMagicExpressionListener p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FaceMagicController.class, "94")) {
          return;
       }
       if (this.checker.isValid()) {
          this.expressionListener = p1;
          FaceMagicController tnativeContr = this.nativeController;
          boolean b = (p1 != null)? true: false;
          this.nativeSetOnExpressionChangedCallback(tnativeContr, p0, b);
       }
       return;
    }
    public void setFaceMagicListener(FaceMagicController$FaceMagicListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FaceMagicController.class, "1")) {
          return;
       }
       if (this.checker.isValid()) {
          FaceMagicController tmListenerLo = this.mListenerLock;
          _monitor_enter(tmListenerLo);
          this.faceMagicListener = p0;
          _monitor_exit(tmListenerLo);
       }
       return;
    }
    public void setFaceMagicLockExposureListener(FaceMagicController$FaceMagicLockExposureListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FaceMagicController.class, "14")) {
          return;
       }
       if (this.checker.isValid()) {
          this.lockExposureListener = p0;
       }
       return;
    }
    public void setFaceMagicMagicAlbumListener(FaceMagicController$FaceMagicMagicAlbumListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FaceMagicController.class, "36")) {
          return;
       }
       if (this.checker.isValid()) {
          this.magicAlbumListener = p0;
       }
       return;
    }
    public void setFaceMagicNeedCaptureListener(FaceMagicController$FaceMagicNeedCaptureListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FaceMagicController.class, "15")) {
          return;
       }
       if (this.checker.isValid()) {
          this.captureListener = p0;
       }
       return;
    }
    public void setFaceMagicPickFaceImageListener(FaceMagicController$FaceMagicPickFaceImageListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FaceMagicController.class, "8")) {
          return;
       }
       if (this.checker.isValid()) {
          this.pickFaceImageListener = p0;
       }
       return;
    }
    public void setFaceMagicPickingServerEffectListener(FaceMagicController$FaceMagicPickingServerMediaListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FaceMagicController.class, "19")) {
          return;
       }
       if (this.checker.isValid()) {
          this.pickingServerMediaListener = p0;
       }
       return;
    }
    public void setFaceMagicPoliticDetectListener(FaceMagicController$FaceMagicPoliticDetectListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FaceMagicController.class, "11")) {
          return;
       }
       if (this.checker.isValid()) {
          this.politicDetectListener = p0;
       }
       return;
    }
    public void setFaceMagicPortraitListener(FaceMagicController$FaceMagicPortraitListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FaceMagicController.class, "97")) {
          return;
       }
       if (this.checker.isValid()) {
          this.portraitListener = p0;
          FaceMagicController tnativeContr = this.nativeController;
          boolean b = (p0 != null)? true: false;
          this.nativeSetIsValidPortraitCallback(tnativeContr, b);
       }
       return;
    }
    public void setFaceMagicRecodingControlListener(FaceMagicController$FaceMagicRecordingControlListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FaceMagicController.class, "13")) {
          return;
       }
       if (this.checker.isValid()) {
          this.recordingControlListener = p0;
       }
       return;
    }
    public void setFaceMagicRemovelListener(FaceMagicController$FaceMagicRemovelListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FaceMagicController.class, "2")) {
          return;
       }
       if (this.checker.isValid()) {
          this.magicRemovelListener = p0;
       }
       return;
    }
    public void setFaceMagicStickerTextureLoadCallback(FaceMagicController$FaceMagicStickerCallback p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FaceMagicController.class, "20")) {
          return;
       }
       if (this.checker.isValid()) {
          this.stickerTextureLoadCb = p0;
       }
       return;
    }
    public void setFaceMagicUserInfoListener(FaceMagicController$FaceMagicUserInfoListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FaceMagicController.class, "5")) {
          return;
       }
       if (this.checker.isValid()) {
          this.userInfoListener = p0;
       }
       return;
    }
    public void setInitialVideoFrameSize(int p0,int p1){
       FaceMagicController uFaceMagicCo = FaceMagicController.class;
       if (PatchProxy.isSupport(uFaceMagicCo) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uFaceMagicCo, "6")) {
          return;
       }
       if (this.checker.isValid()) {
          this.nativeSetInitialVideoFrameSize(this.nativeController, p0, p1);
       }
       return;
    }
    public void setInputTextRequestListener(FaceMagicController$FaceMagicInputTextRequestListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FaceMagicController.class, "80")) {
          return;
       }
       if (this.checker.isValid()) {
          this.inputTextRequestListener = p0;
       }
       return;
    }
    public void setInputTextRequestWithConfigListener(FaceMagicController$FaceMagicInputTextRequestWithConfigListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FaceMagicController.class, "81")) {
          return;
       }
       if (this.checker.isValid()) {
          this.inputTextRequestWithConfigListener = p0;
       }
       return;
    }
    public void setInputTextsRequestListener(FaceMagicController$FaceMagicInputTextsRequestListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FaceMagicController.class, "82")) {
          return;
       }
       if (this.checker.isValid()) {
          this.inputTextsRequestListener = p0;
       }
       return;
    }
    public void setMemojiListener(FaceMagicController$FaceMagicMemojiListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FaceMagicController.class, "9")) {
          return;
       }
       if (this.checker.isValid()) {
          this.memojiListener = p0;
       }
       return;
    }
    public void setPickedFaceImage(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FaceMagicController.class, "32")) {
          return;
       }
       if (this.checker.isValid()) {
          this.nativeSetPickedFaceImage(this.nativeController, p0);
       }
       return;
    }
    public void setReportBeautifyLogListener(FaceMagicController$FaceMagicReportBeautifyLogListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FaceMagicController.class, "95")) {
          return;
       }
       if (this.checker.isValid()) {
          this.reportBeautifyLogListener = p0;
          FaceMagicController tnativeContr = this.nativeController;
          boolean b = (p0 != null)? true: false;
          this.nativeSetReportBeautifyLogCallback(tnativeContr, b);
       }
       return;
    }
    public void setTimeControl(boolean p0){
       FaceMagicController uFaceMagicCo = FaceMagicController.class;
       if (PatchProxy.isSupport(uFaceMagicCo) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uFaceMagicCo, "50")) {
          return;
       }
       FaceMagicController.nativeSetTimeControl(this.nativeController, p0);
       return;
    }
    public void setUserInfo(UserInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FaceMagicController.class, "31")) {
          return;
       }
       if (this.checker.isValid()) {
          this.nativeSetUserInfo(this.nativeController, p0.toByteArray());
       }
       return;
    }
    public void unloadInteractiveBoxResource(FaceMagicController$FaceMagicLiveinteractiveResourceListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FaceMagicController.class, "108")) {
          return;
       }
       if (this.checker.isValid()) {
          this.liveInteractiveListener = p0;
          FaceMagicController tnativeContr = this.nativeController;
          boolean b = (p0 != null)? true: false;
          FaceMagicController.nativeLoadInteractiveBoxResource(tnativeContr, null, b);
       }
       return;
    }
    public void updateEffectControl(EffectControl p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FaceMagicController.class, "21")) {
          return;
       }
       if (this.checker.isValid()) {
          this.nativeUpdateEffectControl(this.nativeController, p0.toByteArray());
       }
       return;
    }
    public void updateEffectUsingFramePts(boolean p0){
       FaceMagicController uFaceMagicCo = FaceMagicController.class;
       if (PatchProxy.isSupport(uFaceMagicCo) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uFaceMagicCo, "35")) {
          return;
       }
       if (this.checker.isValid()) {
          this.nativeUpdateEffectUsingFramePts(this.nativeController, p0);
       }
       return;
    }
}
