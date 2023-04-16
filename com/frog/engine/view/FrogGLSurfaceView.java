package com.frog.engine.view.FrogGLSurfaceView;
import android.opengl.GLSurfaceView;
import java.util.concurrent.atomic.AtomicInteger;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import com.frog.engine.view.FrogRender;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.frog.engine.keyboard.FrogKeyBoard;
import com.frog.engine.FrogCanvasDelegate;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import qg.b;
import java.lang.Runnable;
import android.view.SurfaceHolder;
import com.frog.engine.view.FrogEGLConfigChooser;
import android.opengl.GLSurfaceView$EGLConfigChooser;
import com.frog.engine.view.FrogGLSurfaceView$g;
import com.frog.engine.view.FrogGLSurfaceView$k;
import com.frog.engine.view.FrogGLSurfaceView$a;
import com.frog.engine.view.FrogGLSurfaceView$i;
import qg.a;
import com.frog.engine.view.FrogGLSurfaceView$h;
import java.lang.Integer;
import java.lang.StringBuilder;
import com.frog.engine.internal.FrogLog;
import com.frog.engine.view.FrogGLSurfaceView$j;
import android.view.MotionEvent;
import com.frog.engine.view.FrogGLSurfaceView$c;
import com.frog.engine.view.FrogGLSurfaceView$l;
import com.frog.engine.view.FrogGLSurfaceView$e;
import com.frog.engine.view.FrogGLSurfaceView$f;
import com.frog.engine.view.FrogGLSurfaceView$n;
import com.frog.engine.view.FrogGLSurfaceView$b;
import com.frog.engine.view.FrogGLSurfaceView$d;
import com.frog.engine.view.FrogGLSurfaceView$m;
import android.opengl.GLSurfaceView$Renderer;

public class FrogGLSurfaceView extends GLSurfaceView	// class@001592
{
    public int firstH;
    public int firstW;
    public FrogCanvasDelegate mDelegate;
    public FrogKeyBoard mFrogKeyBoard;
    public FrogRender mFrogRender;
    public boolean mHasDestroy;
    public Handler mMainThreadHandler;
    public boolean mMultipleTouchEnabled;
    public String mUniqueId;
    public boolean openConvertPointAfterSizeChange;
    public float xRatio;
    public float yRatio;
    public static AtomicInteger sAtomicInteger;

    static {
       FrogGLSurfaceView.sAtomicInteger = new AtomicInteger(1);
    }
    public void FrogGLSurfaceView(Context p0){
       super(p0);
       this.mMainThreadHandler = new Handler(Looper.getMainLooper());
       this.mMultipleTouchEnabled = true;
       this.mHasDestroy = false;
       this.firstW = -1;
       this.firstH = -1;
       this.xRatio = 0xbf800000;
       this.yRatio = 0xbf800000;
       this.openConvertPointAfterSizeChange = false;
       this.initView();
    }
    public void FrogGLSurfaceView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.mMainThreadHandler = new Handler(Looper.getMainLooper());
       this.mMultipleTouchEnabled = true;
       this.mHasDestroy = false;
       this.firstW = -1;
       this.firstH = -1;
       this.xRatio = 0xbf800000;
       this.yRatio = 0xbf800000;
       this.openConvertPointAfterSizeChange = false;
       this.initView();
    }
    public static void a(FrogGLSurfaceView p0,boolean p1){
       p0.lambda$handleAudioMute$1(p1);
    }
    public static void access$001(FrogGLSurfaceView p0){
       super.onDetachedFromWindow();
    }
    public static FrogRender access$202(FrogGLSurfaceView p0,FrogRender p1){
       p0.mFrogRender = p1;
       return p1;
    }
    public static boolean access$302(FrogGLSurfaceView p0,boolean p1){
       p0.mHasDestroy = p1;
       return p1;
    }
    public static void b(FrogGLSurfaceView p0){
       p0.lambda$onRestart$0();
    }
    private void lambda$handleAudioMute$1(boolean p0){
       FrogGLSurfaceView tmFrogRender = this.mFrogRender;
       if (tmFrogRender != null) {
          tmFrogRender.handleAudioMute(p0);
       }
       return;
    }
    private void lambda$onRestart$0(){
       FrogGLSurfaceView tmFrogRender = this.mFrogRender;
       if (tmFrogRender != null) {
          tmFrogRender.onRestart();
       }
       return;
    }
    public void createKeyBoradListener(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrogGLSurfaceView.class, "5")) {
          return;
       }
       if (p0 instanceof Activity) {
          this.mFrogKeyBoard = new FrogKeyBoard(p0);
       }
       return;
    }
    public FrogCanvasDelegate getDelegate(){
       return this.mDelegate;
    }
    public FrogKeyBoard getFrogKeyBoard(){
       return this.mFrogKeyBoard;
    }
    public FrogRender getFrogRender(){
       return this.mFrogRender;
    }
    public float getRealX(float p0){
       if (this.openConvertPointAfterSizeChange == null) {
          return p0;
       }
       FrogGLSurfaceView txRatio = this.xRatio;
       if (txRatio <= 0) {
          return p0;
       }
       return (txRatio * p0);
    }
    public float[] getRealXs(float[] p0){
       float[] obj = PatchProxy.applyOneRefs(p0, this, FrogGLSurfaceView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.openConvertPointAfterSizeChange == null) {
          return p0;
       }
       if (this.xRatio > 0 && (p0 == null || p0.length <= 0)) {
          return p0;
       }
       obj = new float[p0.length];
       for (int i = 0; i < p0.length; i = i + 1) {
          obj[i] = this.getRealX(p0[i]);
       }
       return obj;
    }
    public float getRealY(float p0){
       if (this.openConvertPointAfterSizeChange == null) {
          return p0;
       }
       FrogGLSurfaceView tyRatio = this.yRatio;
       if (tyRatio <= 0) {
          return p0;
       }
       return (tyRatio * p0);
    }
    public float[] getRealYs(float[] p0){
       float[] obj = PatchProxy.applyOneRefs(p0, this, FrogGLSurfaceView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.openConvertPointAfterSizeChange == null) {
          return p0;
       }
       if (this.yRatio > 0 && (p0 == null || p0.length <= 0)) {
          return p0;
       }
       obj = new float[p0.length];
       for (int i = 0; i < p0.length; i = i + 1) {
          obj[i] = this.getRealY(p0[i]);
       }
       return obj;
    }
    public String getUniqueId(){
       return this.mUniqueId;
    }
    public void handleAudioMute(boolean p0){
       if (PatchProxy.isSupport(FrogGLSurfaceView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, FrogGLSurfaceView.class, "15")) {
          return;
       }
       this.queueEvent(new b(this, p0));
       return;
    }
    public void initView(){
       if (PatchProxy.applyVoid(null, this, FrogGLSurfaceView.class, "4")) {
          return;
       }
       this.mUniqueId = String.valueOf(FrogGLSurfaceView.sAtomicInteger.incrementAndGet());
       this.setEGLContextClientVersion(2);
       this.setFocusableInTouchMode(true);
       this.requestFocus();
       this.getHolder().setFormat(-3);
       this.setPreserveEGLContextOnPause(true);
       this.setBackgroundColor(0);
       this.setEGLConfigChooser(new FrogEGLConfigChooser(new int[6]{8,8,8,8,24,8}));
       return;
    }
    public void onActivityFinishCall(){
       if (PatchProxy.applyVoid(null, this, FrogGLSurfaceView.class, "7")) {
          return;
       }
       this.onDestroy(null);
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, FrogGLSurfaceView.class, "10")) {
          return;
       }
       super.onAttachedToWindow();
       this.queueEvent(new FrogGLSurfaceView$g(this));
       FrogGLSurfaceView tmDelegate = this.mDelegate;
       if (tmDelegate != null) {
          tmDelegate.onWillStart();
       }
       return;
    }
    public final void onDestroy(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrogGLSurfaceView.class, "1")) {
          return;
       }
       this.queueEvent(new FrogGLSurfaceView$k(this, p0));
       FrogGLSurfaceView tmFrogKeyBoa = this.mFrogKeyBoard;
       if (tmFrogKeyBoa != null) {
          tmFrogKeyBoa.destroy();
          this.mFrogKeyBoard = null;
       }
       this.mDelegate = null;
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, FrogGLSurfaceView.class, "8")) {
          return;
       }
       if (this.mHasDestroy != null) {
          super.onDetachedFromWindow();
       }else {
          this.onDestroy(new FrogGLSurfaceView$a(this));
       }
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, FrogGLSurfaceView.class, "13")) {
          return;
       }
       super.onPause();
       this.queueEvent(new FrogGLSurfaceView$i(this));
       this.setRenderMode(0);
       return;
    }
    public void onRestart(){
       if (PatchProxy.applyVoid(null, this, FrogGLSurfaceView.class, "12")) {
          return;
       }
       super.onResume();
       this.setRenderMode(1);
       this.queueEvent(new a(this));
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, FrogGLSurfaceView.class, "11")) {
          return;
       }
       super.onResume();
       this.setRenderMode(1);
       this.queueEvent(new FrogGLSurfaceView$h(this));
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(FrogGLSurfaceView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, FrogGLSurfaceView.class, "16")) {
          return;
       }
       FrogLog.d("FrogGLSurfaceView", "onSizeChanged +w:"+p0+"  h:"+p1+"  oldw:"+p2+"  oldH"+p3);
       if (!this.isInEditMode()) {
          FrogGLSurfaceView tmFrogRender = this.mFrogRender;
          if (tmFrogRender != null) {
             tmFrogRender.setScreenWidth(p0);
             this.mFrogRender.setScreenHeight(p1);
          }
       }
       if (this.firstH <= null || this.firstW <= null) {
          this.firstH = p1;
          this.firstW = p0;
       }
       this.xRatio = (float)this.firstW / (float)p0;
       this.yRatio = (float)this.firstH / (float)p1;
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, FrogGLSurfaceView.class, "14")) {
          return;
       }
       super.onPause();
       this.queueEvent(new FrogGLSurfaceView$j(this));
       this.setRenderMode(0);
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       int i1;
       float[] uofloatArray2;
       int[] obj = PatchProxy.applyOneRefs(p0, this, FrogGLSurfaceView.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int pointerCount = p0.getPointerCount();
       int[] ointArray = new int[pointerCount];
       float[] uofloatArray = new float[pointerCount];
       float[] uofloatArray1 = new float[pointerCount];
       for (int i = 0; i < pointerCount; i = i + 1) {
          ointArray[i] = p0.getPointerId(i);
          uofloatArray[i] = p0.getX(i);
          uofloatArray1[i] = p0.getY(i);
       }
       i = p0.getAction() & 0x00ff;
       if (i) {
          if (i != 1) {
             if (i != 2) {
                if (i != 3) {
                   if (i != 5) {
                      if (i == 6) {
                         pointerCount = p0.getAction() >> 8;
                         if (this.mMultipleTouchEnabled != null || !pointerCount) {
                            this.queueEvent(new FrogGLSurfaceView$c(this, p0.getPointerId(pointerCount), p0.getX(pointerCount), p0.getY(pointerCount)));
                         }
                      }
                   }else {
                      pointerCount = p0.getAction() >> 8;
                      if (this.mMultipleTouchEnabled != null || !pointerCount) {
                         this.queueEvent(new FrogGLSurfaceView$l(this, p0.getPointerId(pointerCount), p0.getX(pointerCount), p0.getY(pointerCount)));
                      }
                   }
                }else if(this.mMultipleTouchEnabled == null){
                   i1 = 0;
                   while (i1 < pointerCount) {
                      if (!ointArray[i1]) {
                         obj = new int[true];
                         obj[0] = 0;
                         uofloatArray2 = new float[true];
                         uofloatArray2[0] = uofloatArray[i1];
                         uofloatArray = new float[true];
                         uofloatArray[0] = uofloatArray1[i1];
                         this.queueEvent(new FrogGLSurfaceView$e(this, obj, uofloatArray2, uofloatArray));
                         break ;
                      }
                      i1++;
                   }
                }else {
                   this.queueEvent(new FrogGLSurfaceView$f(this, ointArray, uofloatArray, uofloatArray1));
                }
             }else if(this.mMultipleTouchEnabled == null){
                i1 = 0;
                while (i1 < pointerCount) {
                   if (!ointArray[i1]) {
                      obj = new int[true];
                      obj[0] = 0;
                      uofloatArray2 = new float[true];
                      uofloatArray2[0] = uofloatArray[i1];
                      uofloatArray = new float[true];
                      uofloatArray[0] = uofloatArray1[i1];
                      this.queueEvent(new FrogGLSurfaceView$n(this, obj, uofloatArray2, uofloatArray));
                      break ;
                   }
                   i1++;
                }
             }else {
                this.queueEvent(new FrogGLSurfaceView$b(this, ointArray, uofloatArray, uofloatArray1));
             }
          }else {
             this.queueEvent(new FrogGLSurfaceView$d(this, p0.getPointerId(0), uofloatArray[0], uofloatArray1[0]));
          }
       }else {
          this.queueEvent(new FrogGLSurfaceView$m(this, p0.getPointerId(0), uofloatArray[0], uofloatArray1[0]));
       }
       return true;
    }
    public void setConvertPointAfterSizeChangeSwitch(boolean p0){
       this.openConvertPointAfterSizeChange = p0;
    }
    public void setDelegate(FrogCanvasDelegate p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrogGLSurfaceView.class, "9")) {
          return;
       }
       this.mDelegate = p0;
       FrogGLSurfaceView tmFrogRender = this.mFrogRender;
       if (tmFrogRender != null) {
          tmFrogRender.setDelegate(p0);
       }
       return;
    }
    public void setMultipleTouchEnabled(boolean p0){
       this.mMultipleTouchEnabled = p0;
    }
    public void setRenderer(FrogRender p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FrogGLSurfaceView.class, "6")) {
          return;
       }
       this.mFrogRender = p0;
       super.setRenderer(p0);
       FrogGLSurfaceView tmDelegate = this.mDelegate;
       if (tmDelegate != null) {
          this.mFrogRender.setDelegate(tmDelegate);
       }
       return;
    }
}
