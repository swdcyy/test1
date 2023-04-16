package com.kwai.video.kstmf.support.KSTMFFirstFrame;
import java.util.List;
import java.lang.Object;
import com.kwai.video.kstmf.support.KSTMFFirstFrame$KSTMFFirstFrameState;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.video.kstmf.support.KSTMFFirstFrame$OnFirstFrameListener;
import com.kwai.video.kstmf.support.KSTMFFirstFrame$3;
import java.lang.Runnable;
import android.graphics.Bitmap;
import com.kwai.video.kstmf.support.KSTMFFirstFrame$2;
import android.os.Handler;
import java.lang.System;
import com.kwai.video.kstmf.support.KSTMFFirstFrame$1;

public class KSTMFFirstFrame	// class@00094b
{
    public boolean cancel;
    public long endTime;
    public int errorCode;
    public KSTMFFirstFrame$KSTMFFirstFrameState firstFrameState;
    public int index;
    public int mHeight;
    public long mMaxTimeout;
    public ArrayList mNals;
    public int mResourceType;
    public List mUrlList;
    public int mWidth;
    public long nativeHandler;
    public KSTMFFirstFrame$OnFirstFrameListener onFirstFrameListener;
    public Handler postDelayHandler;
    public long readBytes;
    public ExecutorService singleThreadExecutor;
    public Runnable timeoutRunnable;
    public static final int KSTMFCodec_ID_H264 = 27;
    public static final int KSTMFCodec_ID_H265 = 173;
    public static final int KSTMFFirstFrameResourceType_IMG = 1;
    public static final int KSTMFFirstFrameResourceType_URL;

    public void KSTMFFirstFrame(List p0,long p1,int p2){
       super();
       this.mUrlList = null;
       this.mMaxTimeout = 500;
       this.nativeHandler = 0;
       this.postDelayHandler = null;
       this.mWidth = 0;
       this.mHeight = 0;
       this.singleThreadExecutor = null;
       this.index = 0;
       this.cancel = false;
       this.timeoutRunnable = null;
       this.errorCode = 0;
       this.readBytes = 0;
       this.endTime = 0;
       this.firstFrameState = KSTMFFirstFrame$KSTMFFirstFrameState.KSTMFFirstFrameState_Idle;
       this.mResourceType = p2;
       this.mUrlList = p0;
       this.mMaxTimeout = p1;
       this.singleThreadExecutor = Executors.newSingleThreadExecutor();
    }
    public void cancel(){
       if (PatchProxy.applyVoid(null, this, KSTMFFirstFrame.class, "4")) {
          return;
       }
       this.internalCancel(false, true);
       return;
    }
    public final boolean enableParseNal(int p0,int p1,int p2){
       KSTMFFirstFrame obj;
       if (PatchProxy.isSupport(KSTMFFirstFrame.class)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, KSTMFFirstFrame.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.onFirstFrameListener;
       boolean b = false;
       if (obj != null) {
          if (p1 == 1) {
             b = true;
          }
          return obj.onEnableParseNal(p0, b, p2);
       }else {
          return b;
       }
    }
    public final boolean enableSplitNals(int p0){
       KSTMFFirstFrame kSTMFFirstFr = KSTMFFirstFrame.class;
       if (PatchProxy.isSupport(kSTMFFirstFr)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, kSTMFFirstFr, "8");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       kSTMFFirstFr = this.onFirstFrameListener;
       if (kSTMFFirstFr != null) {
          return kSTMFFirstFr.onEnableSplitNals(p0);
       }else {
          return false;
       }
    }
    public synchronized void internalCancel(boolean p0,boolean p1){
       KSTMFFirstFrame kSTMFFirstFr = KSTMFFirstFrame.class;
       if (PatchProxy.isSupport(kSTMFFirstFr) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, kSTMFFirstFr, "6")) {
          return;
       }
       if (this.cancel != null) {
          return;
       }
       this.cancel = true;
       kSTMFFirstFr = this.nativeHandler;
       if (kSTMFFirstFr > 0) {
          this.nativeParseCancel(kSTMFFirstFr);
       }
       this.removeTimer();
       this.singleThreadExecutor.execute(new KSTMFFirstFrame$3(this, p1, p0));
       return;
    }
    public native long nativeCreateFirstFrameParser(String p0,int p1);
    public native final void nativeParseCancel(long p0);
    public native final void nativeParseClose(long p0);
    public native int nativeRenderFrame(long p0,Bitmap p1);
    public native int nativeStartParseFirstFrame(long p0,long p1);
    public void recursionParse(){
       if (PatchProxy.applyVoid(null, this, KSTMFFirstFrame.class, "3")) {
          return;
       }
       if (this.cancel != null) {
          return;
       }
       if (this.index >= this.mUrlList.size()) {
          this.internalCancel(false, false);
          this.firstFrameState = KSTMFFirstFrame$KSTMFFirstFrameState.KSTMFFirstFrameState_Complete;
          KSTMFFirstFrame tonFirstFram = this.onFirstFrameListener;
          if (tonFirstFram != null) {
             tonFirstFram.onFirstFrameParseResult(null, this.readBytes, null, null, this.errorCode);
          }
          return;
       }else {
          this.singleThreadExecutor.execute(new KSTMFFirstFrame$2(this));
          return;
       }
    }
    public synchronized void releaseNativeHandler(){
       if (PatchProxy.applyVoid(null, this, KSTMFFirstFrame.class, "2")) {
          return;
       }
       KSTMFFirstFrame tnativeHandl = this.nativeHandler;
       if (tnativeHandl > 0) {
          this.nativeParseCancel(tnativeHandl);
          this.nativeParseClose(this.nativeHandler);
          this.nativeHandler = 0;
       }
       return;
    }
    public synchronized final void removeTimer(){
       if (PatchProxy.applyVoid(null, this, KSTMFFirstFrame.class, "5")) {
          return;
       }
       KSTMFFirstFrame tpostDelayHa = this.postDelayHandler;
       if (tpostDelayHa != null) {
          KSTMFFirstFrame ttimeoutRunn = this.timeoutRunnable;
          if (ttimeoutRunn != null) {
             tpostDelayHa.removeCallbacks(ttimeoutRunn);
             this.timeoutRunnable = null;
             this.postDelayHandler = null;
          }
       }
       return;
    }
    public void setOnFirstFrameListener(KSTMFFirstFrame$OnFirstFrameListener p0){
       this.onFirstFrameListener = p0;
    }
    public synchronized void startParse(){
       if (PatchProxy.applyVoid(null, this, KSTMFFirstFrame.class, "1")) {
          return;
       }
       if (this.firstFrameState == KSTMFFirstFrame$KSTMFFirstFrameState.KSTMFFirstFrameState_Idle && (!this.mUrlList.size() || this.cancel != null)) {
          return;
       }
       this.firstFrameState = KSTMFFirstFrame$KSTMFFirstFrameState.KSTMFFirstFrameState_Running;
       this.postDelayHandler = new Handler();
       this.endTime = System.currentTimeMillis() + this.mMaxTimeout;
       this.removeTimer();
       KSTMFFirstFrame$1 u1 = new KSTMFFirstFrame$1(this);
       this.timeoutRunnable = u1;
       this.postDelayHandler.postDelayed(u1, this.mMaxTimeout);
       this.recursionParse();
       return;
    }
}
