package com.kwai.video.kstmf.support.KSTMFFirstFrame$2;
import java.lang.Runnable;
import com.kwai.video.kstmf.support.KSTMFFirstFrame;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import java.lang.System;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.lang.Exception;
import android.graphics.Bitmap$Config;
import com.kwai.video.kstmf.support.KSTMFFirstFrame$KSTMFFirstFrameState;
import com.kwai.video.kstmf.support.KSTMFFirstFrame$OnFirstFrameListener;

public class KSTMFFirstFrame$2 implements Runnable	// class@000945
{
    public final KSTMFFirstFrame this$0;

    public void KSTMFFirstFrame$2(KSTMFFirstFrame p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       Bitmap uBitmap;
       Object[] objArray1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KSTMFFirstFrame$2.class, "1")) {
          return;
       }
       KSTMFFirstFrame$2 tthis$0 = this.this$0;
       if (tthis$0.cancel != null) {
          return;
       }
       Object obj = tthis$0.mUrlList.get(tthis$0.index);
       tthis$0 = this.this$0;
       int i = 1;
       tthis$0.index = tthis$0.index + i;
       tthis$0.nativeHandler = tthis$0.nativeCreateFirstFrameParser(obj, tthis$0.mResourceType);
       long l = this.this$0.endTime - System.currentTimeMillis();
       tthis$0 = this.this$0;
       if (tthis$0.cancel == null) {
          KSTMFFirstFrame nativeHandle = tthis$0.nativeHandler;
          int i1 = 0;
          if (nativeHandle - i1 > 0 && l - i1 >= 0) {
             int i2 = tthis$0.nativeStartParseFirstFrame(nativeHandle, (l * 1000));
             KSTMFFirstFrame$2 tthis$01 = this.this$0;
             tthis$01.errorCode = i2;
             if (tthis$01.mResourceType == i) {
                try{
                   uBitmap = BitmapFactory.decodeFile(obj);
                label_0065 :
                   if (i2 >= 0) {
                      tthis$0 = this.this$0;
                      if (tthis$0.mResourceType == null) {
                         Bitmap uBitmap1 = Bitmap.createBitmap(tthis$0.mWidth, tthis$0.mHeight, Bitmap$Config.ARGB_8888);
                         if (uBitmap1 != null) {
                            tthis$01 = this.this$0;
                            int i3 = tthis$01.nativeRenderFrame(tthis$01.nativeHandler, uBitmap1);
                            this.this$0.errorCode = i3;
                            if (i3 < 0) {
                               uBitmap1.recycle();
                               objArray1 = objArray;
                            }
                         }
                         objArray1 = uBitmap1;
                      }else {
                      label_008e :
                         objArray1 = uBitmap;
                      }
                   }else {
                      goto label_008e ;
                   }
                   if (objArray1 != null) {
                      this.this$0.internalCancel(false, false);
                      tthis$0 = this.this$0;
                      tthis$0.firstFrameState = KSTMFFirstFrame$KSTMFFirstFrameState.KSTMFFirstFrameState_Complete;
                      KSTMFFirstFrame onFirstFrame = tthis$0.onFirstFrameListener;
                      if (onFirstFrame != null) {
                         onFirstFrame.onFirstFrameParseResult(objArray1, tthis$0.readBytes, tthis$0.mNals, obj, 0);
                      }
                   }else {
                      tthis$0 = this.this$0;
                      if (tthis$0.cancel != null) {
                         return;
                      }else {
                         tthis$0.releaseNativeHandler();
                         this.this$0.recursionParse();
                      }
                   }
                   return;
                }catch(java.lang.Exception e2){
                   e2.printStackTrace();
                }
                uBitmap = objArray;
                goto label_0065 ;
             }else {
                goto label_0064 ;
             }
          }
       }
       tthis$0.releaseNativeHandler();
       this.this$0.recursionParse();
       return;
    }
}
