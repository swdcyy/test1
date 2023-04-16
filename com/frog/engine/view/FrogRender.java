package com.frog.engine.view.FrogRender;
import android.opengl.GLSurfaceView$Renderer;
import com.frog.engine.internal.CommandExpandFuncListener;
import java.util.HashMap;
import android.os.Handler;
import android.os.Looper;
import android.app.Application;
import com.frog.engine.data.FrogInitParam;
import com.frog.engine.keyboard.FrogKeyBoard;
import com.frog.engine.FrogCommonListener;
import com.frog.engine.FrogCanvasKVStorageProxy;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import com.frog.engine.storage.FrogStorageManager;
import com.frog.engine.storage.FrogStorageDefaultImpl;
import com.frog.engine.internal.BaseCommandHandler;
import com.frog.engine.network.perflogger.KsFrogPerfReportManager;
import java.lang.String;
import com.frog.engine.jsobject.FrogJSObject;
import android.util.Pair;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Exception;
import com.frog.engine.internal.FrogLog;
import android.content.Context;
import java.util.Map;
import java.lang.Integer;
import java.lang.Throwable;
import android.util.Log;
import org.json.JSONObject;
import org.json.JSONArray;
import com.frog.engine.jsobject.FrogLoggerObject;
import com.frog.engine.FrogCanvasDelegate;
import com.frog.engine.internal.FrogEngineInternal;
import com.frog.engine.FrogBaseRequestListener;
import com.frog.engine.view.FrogRender$k;
import java.lang.Runnable;
import com.frog.engine.FrogSyncRequestListener;
import com.frog.engine.view.RenderThreadCallBack;
import java.util.List;
import java.util.ArrayList;
import com.frog.engine.view.FrogRender$a;
import java.lang.Boolean;
import java.util.concurrent.CountDownLatch;
import com.frog.engine.view.FrogRender$j;
import java.util.concurrent.TimeUnit;
import com.frog.engine.view.FrogRender$i;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.frog.engine.view.FrogRender$h;
import com.frog.engine.view.FrogRender$f;
import com.frog.engine.view.FrogRender$g;
import java.lang.Number;
import android.os.SystemClock;
import com.frog.engine.view.FrogRender$b;
import java.lang.Thread;
import com.frog.engine.view.FrogRender$e;
import com.frog.engine.utils.ViewUtils;
import java.lang.Float;
import javax.microedition.khronos.opengles.GL10;
import com.frog.engine.FrogCallGameListener;
import java.lang.StringBuilder;
import javax.microedition.khronos.egl.EGLConfig;
import com.frog.engine.FrogCanvas;
import com.frog.engine.FrogGLVersionListener;
import com.frog.engine.constants.FrogConstants;
import com.frog.engine.view.FrogRender$d;
import com.frog.engine.view.FrogRender$c;
import java.util.Iterator;

public class FrogRender implements GLSurfaceView$Renderer, CommandExpandFuncListener	// class@0015a3
{
    public BaseCommandHandler mBaseCommandHandler;
    public FrogCommonListener mCommonListener;
    public Application mContext;
    public FrogCanvasDelegate mDelegate;
    public FrogStorageManager mFrogStorageManager;
    public long mGLThreadId;
    public boolean mHasCallCreate;
    public FrogInitParam mInitParam;
    public final Map mKsPath;
    public long mLastUpdateFrameTime;
    public int mScreenHeight;
    public int mScreenWidth;
    public String mUniqueId;
    public static Map mWaitingInitTask;
    public static Map sFrogRenders;
    public static Map sGLThreadHandler;
    public static Handler sMainThreadHandler;
    public static TelephonyManagerWrapper sTelephonyWrapper;

    static {
       FrogRender.sGLThreadHandler = new HashMap();
       FrogRender.mWaitingInitTask = new HashMap();
       FrogRender.sFrogRenders = new HashMap();
       FrogRender.sMainThreadHandler = new Handler(Looper.getMainLooper());
    }
    public void FrogRender(Application p0,FrogInitParam p1,FrogKeyBoard p2,FrogCommonListener p3,FrogCanvasKVStorageProxy p4){
       FrogStorageDefaultImpl uFrogStorage;
       super();
       this.mHasCallCreate = false;
       this.mKsPath = new ConcurrentHashMap();
       this.mInitParam = p1;
       this.mContext = p0;
       this.mCommonListener = p3;
       if (p4 == null) {
          uFrogStorage = new FrogStorageDefaultImpl();
       }
       FrogStorageManager uFrogStorage1 = new FrogStorageManager(uFrogStorage);
       this.mFrogStorageManager = uFrogStorage1;
       this.mBaseCommandHandler = new BaseCommandHandler(p0, p2, this, uFrogStorage1);
       KsFrogPerfReportManager.instance().init(this.mInitParam, p3);
       this.initTelephonyWrapper();
       return;
    }
    public static native void dispatchTouchesBegin(int p0,float p1,float p2,String p3);
    public static native void dispatchTouchesCancel(int[] p0,float[] p1,float[] p2,String p3);
    public static native void dispatchTouchesEnd(int p0,float p1,float p2,String p3);
    public static native void dispatchTouchesMove(int[] p0,float[] p1,float[] p2,String p3);
    public static native byte[] fileDataWithPath(String p0,String p1);
    public static Pair filterRealCommand(String p0,FrogJSObject p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, FrogRender.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1 != null && (("callNativeCommandSync").equals(p0) || ("callNativeCommandAsync").equals(p0))) {
          return Pair.create(p1.getString("cmd"), p1.getJSObject("data"));
       }
    }
    public static native boolean frogCanRead(String p0,String p1);
    public static native boolean frogCanWrite(String p0,String p1);
    public static native void frogDestroy(String p0);
    public static native void frogGameInit(Context p0,int p1,int p2,float p3,String[] p4,String[] p5,String p6,String p7,String p8,boolean p9,String p10,int p11,boolean p12,boolean p13,boolean p14,boolean p15,int p16,Map p17,String p18,String p19);
    public static void frogJSExceptionCall(String p0,String p1,String p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, FrogRender.class, "10")) {
          return;
       }
       if (FrogRender.sFrogRenders.get(p0) == null) {
          return;
       }
       FrogRender uFrogRender = FrogRender.sFrogRenders.get(p0);
       if (uFrogRender.mCommonListener != null) {
          String[] stringArray = p1.split(":");
          int i = 1;
          int i1 = 0;
          object oobject = (stringArray != null && stringArray.length >= i)? stringArray[i1]: "";
          object oobject1 = oobject;
          int i2 = (stringArray != null && stringArray.length >= 2)? Integer.parseInt(stringArray[i]): 0;
          int i3 = (stringArray != null && stringArray.length >= 3)? Integer.parseInt(stringArray[2]): 0;
          uFrogRender.mCommonListener.onJSException(oobject1, i2, i3, p2, p3);
       }
       return;
    }
    public static void frogJSLogCall(String p0,String p1,FrogJSObject p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, FrogRender.class, "11")) {
          return;
       }
       if (FrogRender.sFrogRenders.get(p0) == null) {
          return;
       }
       FrogRender uFrogRender = FrogRender.sFrogRenders.get(p0);
       if (uFrogRender.mCommonListener != null) {
          Object[] object = p2.getObject("log");
          if (object == null || object.length <= 0) {
             return;
          }else {
             JSONObject jSONObject = new JSONObject();
             FrogJSObject.toJSLog(p2, jSONObject);
             JSONArray jSONArray = jSONObject.optJSONArray("log");
             if (jSONArray != null) {
                uFrogRender = uFrogRender.mCommonListener;
                if (uFrogRender != null) {
                   uFrogRender.onLog(p1, jSONArray);
                }
             }
          }
       }
       return;
    }
    public static native void frogPause(String p0);
    public static native long frogResidueSizeOfDirectory(String p0,String p1);
    public static native void frogResize(float p0,float p1,String p2);
    public static native void frogRestart(String p0);
    public static native void frogResume(String p0);
    public static native void frogRunJavaScript(FrogJSObject p0,String p1);
    public static native void frogRunRealScript(String p0,String p1);
    public static native void frogRunScript(String p0,String p1,String p2);
    public static native void frogUpdateFrame(float p0,String p1);
    public static native String getFrogAbsFilePath(String p0,String p1);
    public static native String getFrogCacheDir(String p0);
    public static native String getFrogCodeDir(String p0);
    public static native String getFrogInternalDir(String p0);
    public static native String getFrogPluginDir(String p0);
    public static native String getFrogTempDir(String p0);
    public static native String getFrogUserDir(String p0);
    public static native void handleAudioMute(String p0,boolean p1);
    public static native boolean isAudioMute(String p0);
    public static void logPrint(int p0,String p1){
       if (PatchProxy.isSupport(FrogRender.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, null, FrogRender.class, "13")) {
          return;
       }
       if (!p0) {
          FrogLog.d("FrogCanvas", p1);
       }else if(p0 == 2){
          FrogLog.w("FrogCanvas", p1);
       }else if(p0 == 3){
          FrogLog.e("FrogCanvas", p1);
       }else {
          FrogLog.v("FrogCanvas", p1);
       }
       return;
    }
    public static void loggerFromNative(String p0,FrogLoggerObject p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, FrogRender.class, "12")) {
          return;
       }
       if (FrogRender.sFrogRenders.get(p0) == null) {
          return;
       }
       FrogRender mCommonListe = FrogRender.sFrogRenders.get(p0).mCommonListener;
       if (mCommonListe != null) {
          mCommonListe.onReport(p1);
       }
       return;
    }
    public static native void onCallResponse(String p0,int p1,FrogJSObject p2);
    public static void onFirstFrameRender(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, FrogRender.class, "7")) {
          return;
       }
       if (FrogRender.sFrogRenders.get(p0) != null && FrogRender.sFrogRenders.get(p0).getDelegate() != null) {
          FrogRender.sFrogRenders.get(p0).getDelegate().onFirstFrameRender();
       }
    label_003c :
       return;
    }
    public static native void onMemoryWaring(String p0,int p1);
    public static void onReceiveGameCommandAsync(String p0,int p1,String p2,FrogJSObject p3){
       if (PatchProxy.isSupport(FrogRender.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, null, FrogRender.class, "6")) {
          return;
       }
       Pair pair = FrogRender.filterRealCommand(p0, p3);
       if (FrogEngineInternal.canHandlerGameCommand(p2, pair.first)) {
          FrogBaseRequestListener gameCommandR = FrogEngineInternal.getGameCommandRequestListener(p2, pair.first);
          if (gameCommandR.isAsyncRequest()) {
             FrogRender.sMainThreadHandler.post(new FrogRender$k(gameCommandR, pair, p1, p2));
          }
          return;
       }else {
          FrogJSObject uFrogJSObjec = new FrogJSObject();
          FrogJSObject.fromJSObject(BaseCommandHandler.buildResponse(-10005, "", null), uFrogJSObjec);
          FrogRender.onCallResponse(p2, p1, uFrogJSObjec);
          return;
       }
    }
    public static FrogJSObject onReceiveGameCommandBySync(String p0,String p1,FrogJSObject p2){
       FrogJSObject uFrogJSObjec;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, FrogRender.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Pair pair = FrogRender.filterRealCommand(p0, p2);
       if (FrogEngineInternal.canHandlerGameCommand(p1, pair.first)) {
          FrogBaseRequestListener gameCommandR = FrogEngineInternal.getGameCommandRequestListener(p1, pair.first);
          if (!gameCommandR.isAsyncRequest()) {
             uFrogJSObjec = gameCommandR.onResponse(pair.second);
             if (uFrogJSObjec == null) {
                uFrogJSObjec = new FrogJSObject();
             }
             return uFrogJSObjec;
          }
       }
       uFrogJSObjec = new FrogJSObject();
       FrogJSObject.fromJSObject(BaseCommandHandler.buildResponse(-10005, "", null), uFrogJSObjec);
       return uFrogJSObjec;
    }
    public static void postGLRunnable(String p0,Runnable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, FrogRender.class, "9")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       if (FrogRender.sGLThreadHandler.get(p0) != null) {
          FrogRender.sGLThreadHandler.get(p0).run(p1);
       }else {
          Map mWaitingInit = FrogRender.mWaitingInitTask;
          _monitor_enter(mWaitingInit);
          List list = FrogRender.mWaitingInitTask.get(p0);
          if (list == null) {
             list = new ArrayList();
          }
          list.add(new FrogRender$a(p0, p1));
          FrogRender.mWaitingInitTask.put(p0, list);
          _monitor_exit(mWaitingInit);
       }
       return;
    }
    public boolean canRead(String p0){
       CountDownLatch obj = PatchProxy.applyOneRefs(p0, this, FrogRender.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.isGlThread()) {
          return FrogRender.frogCanRead(p0, this.mUniqueId);
       }
       obj = new CountDownLatch(1);
       Boolean[] uBooleanArra = new Boolean[]{Boolean.FALSE};
       FrogRender.postGLRunnable(this.mUniqueId, new FrogRender$j(this, uBooleanArra, p0, obj));
       try{
          int i = 1000;
          obj.await(i, TimeUnit.MILLISECONDS);
          return uBooleanArra[0].booleanValue();
       }catch(java.lang.Exception e0){
          return FrogRender.frogCanRead(p0, this.mUniqueId);
       }
    }
    public boolean canWrite(String p0){
       CountDownLatch obj = PatchProxy.applyOneRefs(p0, this, FrogRender.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.isGlThread()) {
          return FrogRender.frogCanWrite(p0, this.mUniqueId);
       }
       obj = new CountDownLatch(1);
       Boolean[] uBooleanArra = new Boolean[]{Boolean.FALSE};
       FrogRender.postGLRunnable(this.mUniqueId, new FrogRender$i(this, uBooleanArra, p0, obj));
       try{
          int i = 1000;
          obj.await(i, TimeUnit.MILLISECONDS);
          return uBooleanArra[0].booleanValue();
       }catch(java.lang.Exception e0){
          return FrogRender.frogCanWrite(p0, this.mUniqueId);
       }
    }
    public byte[] fileDataWithPath(String p0){
       CountDownLatch obj = PatchProxy.applyOneRefs(p0, this, FrogRender.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          return null;
       }
       if (this.isGlThread()) {
          return FrogRender.fileDataWithPath(p0, this.mUniqueId);
       }
       obj = new CountDownLatch(1);
       byte[][] uobyteArray = new byte[][1];
       FrogRender.postGLRunnable(this.mUniqueId, new FrogRender$h(this, uobyteArray, p0, obj));
       try{
          int i = 0x2710;
          obj.await(i, TimeUnit.MILLISECONDS);
          return uobyteArray[0];
       }catch(java.lang.Exception e0){
          return FrogRender.fileDataWithPath(p0, this.mUniqueId);
       }
    }
    public String findAbsPath(String p0){
       CountDownLatch obj = PatchProxy.applyOneRefs(p0, this, FrogRender.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          return null;
       }
       if (this.isGlThread()) {
          return FrogRender.getFrogAbsFilePath(p0, this.mUniqueId);
       }
       obj = new CountDownLatch(1);
       String[] stringArray = new String[]{""};
       FrogRender.postGLRunnable(this.mUniqueId, new FrogRender$f(this, stringArray, p0, obj));
       try{
          int i = 1000;
          obj.await(i, TimeUnit.MILLISECONDS);
          return stringArray[0];
       }catch(java.lang.Exception e0){
          return FrogRender.getFrogAbsFilePath(p0, this.mUniqueId);
       }
    }
    public FrogCanvasDelegate getDelegate(){
       return this.mDelegate;
    }
    public String getTempDir(){
       CountDownLatch obj = PatchProxy.apply(null, this, FrogRender.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.isGlThread()) {
          return FrogRender.getFrogTempDir(this.mUniqueId);
       }
       obj = new CountDownLatch(1);
       String[] stringArray = new String[]{""};
       FrogRender.postGLRunnable(this.mUniqueId, new FrogRender$g(this, stringArray, obj));
       try{
          int i = 1000;
          obj.await(i, TimeUnit.MILLISECONDS);
          return stringArray[0];
       }catch(java.lang.Exception e0){
          return FrogRender.getFrogTempDir(this.mUniqueId);
       }
    }
    public final float getTime(){
       Object obj = PatchProxy.apply(null, this, FrogRender.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       this.mLastUpdateFrameTime = SystemClock.elapsedRealtime();
       return ((float)(SystemClock.elapsedRealtime() - this.mLastUpdateFrameTime) / 1000.00f);
    }
    public void handleAudioMute(boolean p0){
       if (PatchProxy.isSupport(FrogRender.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, FrogRender.class, "26")) {
          return;
       }
       FrogRender.handleAudioMute(this.mUniqueId, p0);
       return;
    }
    public final void initKsPath(){
       if (PatchProxy.applyVoid(null, this, FrogRender.class, "2")) {
          return;
       }
       this.mKsPath.put(Integer.valueOf(1), FrogRender.getFrogCodeDir(this.mUniqueId));
       this.mKsPath.put(Integer.valueOf(2), FrogRender.getFrogPluginDir(this.mUniqueId));
       this.mKsPath.put(Integer.valueOf(3), FrogRender.getFrogTempDir(this.mUniqueId));
       this.mKsPath.put(Integer.valueOf(4), FrogRender.getFrogCacheDir(this.mUniqueId));
       this.mKsPath.put(Integer.valueOf(5), FrogRender.getFrogUserDir(this.mUniqueId));
       this.mKsPath.put(Integer.valueOf(6), FrogRender.getFrogInternalDir(this.mUniqueId));
       return;
    }
    public final void initTelephonyWrapper(){
       if (PatchProxy.applyVoid(null, this, FrogRender.class, "14")) {
          return;
       }
       FrogRender tmContext = this.mContext;
       if (tmContext != null && FrogRender.sTelephonyWrapper == null) {
          FrogRender.sTelephonyWrapper = new FrogRender$b(this, tmContext);
       }
       return;
    }
    public final boolean isGlThread(){
       Object obj = PatchProxy.apply(null, this, FrogRender.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!Thread.currentThread().getId() - this.mGLThreadId)? true: false;
       return b;
    }
    public String ksPath(int p0){
       if (PatchProxy.isSupport(FrogRender.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, FrogRender.class, "37");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.mKsPath.get(Integer.valueOf(p0));
    }
    public long lastSpace(String p0){
       CountDownLatch obj = PatchProxy.applyOneRefs(p0, this, FrogRender.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (this.isGlThread()) {
          return FrogRender.frogResidueSizeOfDirectory(p0, this.mUniqueId);
       }
       obj = new CountDownLatch(1);
       long[] olongArray = new long[]{0};
       FrogRender.postGLRunnable(this.mUniqueId, new FrogRender$e(this, olongArray, p0, obj));
       try{
          int i = 3000;
          obj.await(i, TimeUnit.MILLISECONDS);
          return olongArray[0];
       }catch(java.lang.Exception e0){
          return FrogRender.frogResidueSizeOfDirectory(p0, this.mUniqueId);
       }
    }
    public void onActionCancel(int[] p0,float[] p1,float[] p2){
       int this;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, FrogRender.class, "30")) {
          return;
       }
       float displayMetri = ViewUtils.getDisplayMetrics(this.mContext);
       float[] uofloatArray = new float[p1.length];
       int i = 0;
       for (this = 0; this < p1.length; this++) {
          float f = p1[this] / displayMetri;
          uofloatArray[this] = f;
       }
       p1 = new float[p2.length];
       for (; i < p2.length; i = i + 1) {
          float f1 = p2[i] / displayMetri;
          p1[i] = f1;
       }
       FrogRender.dispatchTouchesCancel(p0, uofloatArray, p1, this.mUniqueId);
       return;
    }
    public void onActionDown(int p0,float p1,float p2){
       if (PatchProxy.isSupport(FrogRender.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), this, FrogRender.class, "28")) {
          return;
       }
       float displayMetri = ViewUtils.getDisplayMetrics(this.mContext);
       p1 = p1 / displayMetri;
       p2 = p2 / displayMetri;
       FrogRender.dispatchTouchesBegin(p0, p1, p2, this.mUniqueId);
       return;
    }
    public void onActionMove(int[] p0,float[] p1,float[] p2){
       int this;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, FrogRender.class, "31")) {
          return;
       }
       float displayMetri = ViewUtils.getDisplayMetrics(this.mContext);
       float[] uofloatArray = new float[p1.length];
       int i = 0;
       for (this = 0; this < p1.length; this++) {
          float f = p1[this] / displayMetri;
          uofloatArray[this] = f;
       }
       p1 = new float[p2.length];
       for (; i < p2.length; i = i + 1) {
          float f1 = p2[i] / displayMetri;
          p1[i] = f1;
       }
       FrogRender.dispatchTouchesMove(p0, uofloatArray, p1, this.mUniqueId);
       return;
    }
    public void onActionUp(int p0,float p1,float p2){
       if (PatchProxy.isSupport(FrogRender.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), this, FrogRender.class, "29")) {
          return;
       }
       float displayMetri = ViewUtils.getDisplayMetrics(this.mContext);
       p1 = p1 / displayMetri;
       p2 = p2 / displayMetri;
       FrogRender.dispatchTouchesEnd(p0, p1, p2, this.mUniqueId);
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, FrogRender.class, "27")) {
          return;
       }
       FrogRender.sGLThreadHandler.remove(this.mUniqueId);
       FrogRender.sFrogRenders.remove(this.mUniqueId);
       FrogRender.frogDestroy(this.mUniqueId);
       FrogRender tmDelegate = this.mDelegate;
       if (tmDelegate != null) {
          tmDelegate.onWillStop();
          this.mDelegate = null;
       }
       this.mCommonListener = null;
       this.mFrogStorageManager = null;
       this.mBaseCommandHandler.clear();
       this.mBaseCommandHandler = null;
       return;
    }
    public void onDrawFrame(GL10 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrogRender.class, "22")) {
          return;
       }
       if (!this.mLastUpdateFrameTime) {
          this.mLastUpdateFrameTime = SystemClock.elapsedRealtime();
          FrogRender.frogUpdateFrame(0, this.mUniqueId);
       }else {
          FrogRender.frogUpdateFrame(this.getTime(), this.mUniqueId);
       }
       FrogRender tmDelegate = this.mDelegate;
       if (tmDelegate != null) {
          tmDelegate.onDrawFrame();
       }
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, FrogRender.class, "24")) {
          return;
       }
       FrogRender.frogPause(this.mUniqueId);
       this.sendCommandToNativeGame("ks.onHide", null, null);
       return;
    }
    public void onRestart(){
       if (PatchProxy.applyVoid(null, this, FrogRender.class, "25")) {
          return;
       }
       FrogRender.frogRestart(this.mUniqueId);
       FrogRender tmInitParam = this.mInitParam;
       JSONObject launchOption = (tmInitParam != null && tmInitParam.getLaunchOption() != null)? this.mInitParam.getLaunchOption(): null;
       FrogJSObject uFrogJSObjec = new FrogJSObject();
       if (launchOption != null) {
          FrogJSObject.fromJSObject(launchOption, uFrogJSObjec);
       }
       this.sendCommandToNativeGame("ks.onShow", uFrogJSObjec, null);
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, FrogRender.class, "23")) {
          return;
       }
       FrogRender.frogResume(this.mUniqueId);
       FrogRender tmInitParam = this.mInitParam;
       JSONObject launchOption = (tmInitParam != null && tmInitParam.getLaunchOption() != null)? this.mInitParam.getLaunchOption(): null;
       FrogJSObject uFrogJSObjec = new FrogJSObject();
       if (launchOption != null) {
          FrogJSObject.fromJSObject(launchOption, uFrogJSObjec);
       }
       this.sendCommandToNativeGame("ks.onShow", uFrogJSObjec, null);
       return;
    }
    public void onSurfaceChanged(GL10 p0,int p1,int p2){
       if (PatchProxy.isSupport(FrogRender.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, FrogRender.class, "21")) {
          return;
       }
       FrogLog.d("FrogRender", "onSurfaceChanged :"+p1+"  "+p2);
       float displayMetri = ViewUtils.getDisplayMetrics(this.mContext);
       FrogRender.frogResize((float)(int)((float)p1 / displayMetri), (float)(int)((float)p2 / displayMetri), this.mUniqueId);
       return;
    }
    public void onSurfaceCreated(GL10 p0,EGLConfig p1){
       FrogRender mInitParam;
       boolean b = this;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, b, FrogRender.class, "20")) {
          return;
       }
       this.setGLThreadId();
       if (b.mHasCallCreate != null && FrogCanvas.sFrogLogInterface != null) {
          FrogCanvas.sFrogGLVersionListener.onRenderReCreate();
       }
       boolean b1 = true;
       b.mHasCallCreate = b1;
       if (b.mInitParam != null) {
          FrogRender mBaseCommand = b.mBaseCommandHandler;
          if (mBaseCommand != null) {
             mBaseCommand.init(b.mScreenWidth, b.mScreenHeight, b.mInitParam);
             FrogEngineInternal.registerBaseCommands(b.mUniqueId, b.mBaseCommandHandler.getBaseCommands());
          }
          String[] supportSyncC = FrogEngineInternal.getSupportSyncCommands(b.mUniqueId);
          String[] stringArray = new String[(supportSyncC.length + b1)];
          for (int i = 0; i < supportSyncC.length; i = i + 1) {
             stringArray[i] = supportSyncC[i];
          }
          stringArray[supportSyncC.length] = "callNativeCommandSync";
          supportSyncC = FrogEngineInternal.getSupportAsyncCommands(b.mUniqueId);
          String[] stringArray1 = new String[(supportSyncC.length + b1)];
          for (i = 0; i < supportSyncC.length; i = i + 1) {
             stringArray1[i] = supportSyncC[i];
          }
          stringArray1[supportSyncC.length] = "callNativeCommandAsync";
          FrogRender mContext = b.mContext;
          int i1 = (int)((float)b.mScreenWidth / ViewUtils.getDisplayMetrics(mContext));
          int i2 = (int)((float)b.mScreenHeight / ViewUtils.getDisplayMetrics(b.mContext));
          float displayMetri = ViewUtils.getDisplayMetrics(b.mContext);
          String str = b.trimDir(b.mInitParam.getFileSystemRootDir());
          String str1 = b.trimDir(b.mInitParam.getGamePath());
          String str2 = b.trimDir(b.mInitParam.getJsPluginRootDir());
          boolean b2 = b.mInitParam.isEnableDebugger();
          String host = FrogConstants.getHost();
          mBaseCommand = b.mCommonListener;
          boolean b3 = (mBaseCommand != null && mBaseCommand.useConsoleMode())? true: false;
          mInitParam = b.mInitParam;
          FrogRender.frogGameInit(mContext, i1, i2, displayMetri, stringArray, stringArray1, str, str1, str2, b2, host, 6086, false, b3, mInitParam.useFfmpeg, mInitParam.reportPrefLogger, mInitParam.frogSourceType, mInitParam.frogSubPkgPathMap, mInitParam.frogConfigPath, b.mUniqueId);
          this.initKsPath();
          if (b.mFrogStorageManager != null) {
             b.mFrogStorageManager.init(FrogRender.getFrogAbsFilePath(b.ksPath(6), b.mUniqueId)+"/localStorage");
          }
          FrogRender.frogRunScript(b.mInitParam.getScriptName(), b.mInitParam.getJsPluginName(), b.mUniqueId);
       }
       mInitParam = b.mDelegate;
       if (mInitParam != null) {
          mInitParam.onDidStart();
       }
       return;
    }
    public void runJavaScript(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrogRender.class, "33")) {
          return;
       }
       FrogRender.postGLRunnable(this.mUniqueId, new FrogRender$d(this, p0));
       return;
    }
    public void sendCommandToNativeGame(String p0,FrogJSObject p1,FrogCallGameListener p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, FrogRender.class, "32")) {
          return;
       }
       FrogRender.postGLRunnable(this.mUniqueId, new FrogRender$c(this, p0, p1, p2));
       return;
    }
    public void setDelegate(FrogCanvasDelegate p0){
       this.mDelegate = p0;
    }
    public void setGLThreadId(){
       if (PatchProxy.applyVoid(null, this, FrogRender.class, "19")) {
          return;
       }
       this.mGLThreadId = Thread.currentThread().getId();
       return;
    }
    public void setScreenHeight(int p0){
       if (PatchProxy.isSupport(FrogRender.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, FrogRender.class, "16")) {
          return;
       }
       this.mScreenHeight = p0;
       FrogRender tmBaseComman = this.mBaseCommandHandler;
       if (tmBaseComman != null) {
          tmBaseComman.setWindowHeight(p0);
       }
       return;
    }
    public void setScreenWidth(int p0){
       if (PatchProxy.isSupport(FrogRender.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, FrogRender.class, "15")) {
          return;
       }
       this.mScreenWidth = p0;
       FrogRender tmBaseComman = this.mBaseCommandHandler;
       if (tmBaseComman != null) {
          tmBaseComman.setWindowWidth(p0);
       }
       return;
    }
    public void setUniqueId(String p0,RenderThreadCallBack p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FrogRender.class, "17")) {
          return;
       }
       this.mUniqueId = p0;
       FrogRender.sGLThreadHandler.put(p0, p1);
       FrogRender.sFrogRenders.put(p0, this);
       Map mWaitingInit = FrogRender.mWaitingInitTask;
       _monitor_enter(mWaitingInit);
       if (FrogRender.mWaitingInitTask.get(p0) != null) {
          Iterator iterator = FrogRender.mWaitingInitTask.get(p0).iterator();
          while (iterator.hasNext()) {
             iterator.next().run();
          }
       }
       _monitor_exit(mWaitingInit);
       return;
    }
    public final String trimDir(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FrogRender.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.isEmpty(p0) && p0.endsWith("/")) {
          p0 = p0.substring(0, (p0.length() - 1));
       }
       return p0;
    }
    public void updateLaunchOption(JSONObject p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrogRender.class, "18")) {
          return;
       }
       FrogRender tmInitParam = this.mInitParam;
       if (tmInitParam != null) {
          tmInitParam.setLaunchOption(p0);
       }
       return;
    }
}
