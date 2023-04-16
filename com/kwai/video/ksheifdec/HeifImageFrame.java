package com.kwai.video.ksheifdec.HeifImageFrame;
import oc.c;
import java.lang.Object;
import android.graphics.Bitmap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.ksheifdec.KSHeifConfig;
import java.lang.Exception;
import java.lang.Integer;

public class HeifImageFrame implements c	// class@000f96
{
    public int index;
    public int mDurationInMs;
    public int mHeight;
    public long mNativeFrameHandle;
    public int mWidth;
    public int mXOffset;
    public int mYOffset;
    public static final String TAG = "HeifImageFrame";

    public void HeifImageFrame(long p0){
       super();
       this.mWidth = 0;
       this.mHeight = 0;
       this.mXOffset = 0;
       this.mYOffset = 0;
       this.mDurationInMs = 0;
       this.mNativeFrameHandle = 0;
       this.index = 0;
       this.mNativeFrameHandle = p0;
    }
    public static native void nativeDispose(long p0);
    public static native void nativeRenderFrame(long p0,int p1,int p2,Bitmap p3);
    public void dispose(){
       if (PatchProxy.applyVoid(null, this, HeifImageFrame.class, "1")) {
          return;
       }
       try{
          KSHeifConfig.ensureLoadDecodeLibrary();
          HeifImageFrame tmNativeFram = this.mNativeFrameHandle;
          if (tmNativeFram) {
             HeifImageFrame.nativeDispose(tmNativeFram);
             this.mNativeFrameHandle = 0;
          }
          this.mWidth = 0;
          this.mHeight = 0;
          this.mXOffset = 0;
          this.mYOffset = 0;
          this.mDurationInMs = 0;
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       return;
    }
    public int getDurationMs(){
       return this.mDurationInMs;
    }
    public int getHeight(){
       return this.mHeight;
    }
    public int getWidth(){
       return this.mWidth;
    }
    public int getXOffset(){
       return this.mXOffset;
    }
    public int getYOffset(){
       return this.mYOffset;
    }
    public void renderFrame(int p0,int p1,Bitmap p2){
       if (PatchProxy.isSupport(HeifImageFrame.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, HeifImageFrame.class, "2")) {
          return;
       }
       KSHeifConfig.ensureLoadDecodeLibrary();
       HeifImageFrame tmNativeFram = this.mNativeFrameHandle;
       if (tmNativeFram) {
          try{
             HeifImageFrame.nativeRenderFrame(tmNativeFram, p0, p1, p2);
          }catch(java.lang.Exception e8){
             e8.printStackTrace();
          }
       }
    }
}
