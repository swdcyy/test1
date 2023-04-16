package com.kwai.video.ksmemorykit.EditorEnhanceTask$1;
import java.lang.Runnable;
import com.kwai.video.ksmemorykit.EditorEnhanceTask;
import java.util.List;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.kve.LutEnhancerBuilder;
import com.kwai.kve.VisionEngine;
import java.util.ArrayList;
import com.kwai.kve.ErrorInfo$ErrorCode;
import com.kwai.video.editorsdk2.kve.EditorKveDecoder;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.kve.MediaOpenParam;
import com.kwai.kve.MediaOpenParamSkipPattern;
import android.graphics.Bitmap;
import com.kwai.kve.OpenResult;
import com.kwai.kve.ErrorInfo;
import com.kwai.video.ksmemorykit.EditorEnhanceTask$EventListener;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ProbedFile;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.kwai.video.editorsdk2.logger.EditorSdkLogger;
import com.kwai.kve.ReadFrameParam;
import com.kwai.kve.FrameResult;
import com.kwai.kve.CPUImageFrame;
import java.nio.ByteBuffer;
import java.util.Iterator;
import com.kwai.video.editorsdk2.AndroidPlatformImageLoader;
import java.nio.Buffer;
import com.kwai.kve.LutEnhancerConfig$EnhanceMethod;
import com.kwai.kve.LutEnhancer;
import com.kwai.video.ksmemorykit.EditorEnhanceTask$1$1;
import com.kwai.kve.LutEnhancer$EventListener;

public class EditorEnhanceTask$1 implements Runnable	// class@0008e6
{
    public final EditorEnhanceTask this$0;
    public final List val$decodedFrameList;
    public final EditorSdk2V2$VideoEditorProject val$project;
    public final String val$workspacePath;

    public void EditorEnhanceTask$1(EditorEnhanceTask p0,List p1,EditorSdk2V2$VideoEditorProject p2,String p3){
       this.this$0 = p0;
       this.val$decodedFrameList = p1;
       this.val$project = p2;
       this.val$workspacePath = p3;
       super();
    }
    public void run(){
       Object[] objArray;
       EditorEnhanceTask mEventListen;
       double trackAssetDi;
       int i1;
       Object obj = this;
       if (PatchProxy.applyVoid(null, obj, EditorEnhanceTask$1.class, "1")) {
          return;
       }
       LutEnhancerBuilder lutEnhancerB = VisionEngine.createEnhanceBuilder();
       obj.this$0.mCPUImageFrames = new ArrayList();
       EditorEnhanceTask$1 val$decodedF = obj.val$decodedFrameList;
       String str = 1;
       int i = 0;
       if (val$decodedF == null) {
          if (obj.val$project.trackAssetsSize() < str) {
             obj.this$0.callOnError(ErrorInfo$ErrorCode.INVALID_PARAMETER, "Failed to start enhance task. Invalid number of track assets.");
             return;
          }else {
             EditorKveDecoder uEditorKveDe = new EditorKveDecoder();
             String str1 = obj.val$project.trackAssets(i).assetPath();
             if (TextUtils.isEmpty(str1)) {
                objArray = new Object[str];
                objArray[i] = str1;
                obj.this$0.callOnError(ErrorInfo$ErrorCode.INVALID_PARAMETER, String.format("Failed to start enhance task. Asset path %s is empty.", objArray));
                if (uEditorKveDe.isOpened()) {
                   uEditorKveDe.close();
                }
                uEditorKveDe.release();
                return;
             }else {
                double d = 0;
                MediaOpenParam mediaOpenPar = new MediaOpenParam(str1, 720, 720, 2, false, null, new MediaOpenParamSkipPattern(d, -1));
                OpenResult openResult = uEditorKveDe.openWithParams(v5);
                if (openResult.getErrorInfo() != null && openResult.getErrorInfo().getErrorCode() != ErrorInfo$ErrorCode.OK) {
                   mEventListen = obj.this$0.mEventListener;
                   if (mEventListen != null) {
                      mEventListen.onError(openResult.getErrorInfo());
                   }
                   if (uEditorKveDe.isOpened()) {
                      uEditorKveDe.close();
                   }
                   uEditorKveDe.release();
                   return;
                }else {
                   EditorSdk2V2$TrackAsset trackAsset = obj.val$project.trackAssets(i);
                   if (trackAsset.probedAssetFile() == null) {
                      try{
                         trackAsset = EditorSdk2UtilsV2.loadProject(obj.val$project).trackAssets(i);
                      }catch(com.kwai.video.editorsdk2.EditorSdk2InternalErrorException e0){
                         EditorSdkLogger.e("EditorEnhanceTask", "error while opening track asset: "+trackAsset.assetPath(), e0);
                         obj.this$0.callOnError(ErrorInfo$ErrorCode.INVALID_PARAMETER, "Failed to start enhance task. Error while opening track asset:"+trackAsset.assetPath());
                         if (uEditorKveDe.isOpened()) {
                            uEditorKveDe.close();
                         }
                         uEditorKveDe.release();
                         return;
                      }
                   }
                   try{
                      trackAssetDi = EditorSdk2UtilsV2.getTrackAssetDisplayDuration(trackAsset);
                      if (trackAssetDi - d <= 0) {
                         objArray = new Object[str];
                         objArray[i] = obj.val$project.trackAssets(i).assetPath();
                         obj.this$0.callOnError(ErrorInfo$ErrorCode.INVALID_PARAMETER, String.format("Duration of the track %s is zero. Maybe the project has not loaded.", objArray));
                         if (uEditorKveDe.isOpened()) {
                            uEditorKveDe.close();
                         }
                         uEditorKveDe.release();
                         return;
                      }else {
                         double[] uodoubleArra = new double[]{0x3fb999999999999a * trackAssetDi,0x3fe0000000000000 * trackAssetDi,trackAssetDi * 0x3feccccccccccccd};
                         i1 = 0;
                         while (true) {
                            if (i1 < 3) {
                               if (obj.this$0.mCancelled != null) {
                                  _monitor_enter(this);
                                  mEventListen = obj.this$0.mEventListener;
                                  if (mEventListen != null) {
                                     mEventListen.onCancel();
                                  }
                                  _monitor_exit(this);
                                  if (uEditorKveDe.isOpened()) {
                                     uEditorKveDe.close();
                                     break ;
                                  }
                                  break ;
                               }else {
                                  ReadFrameParam readFramePar = new ReadFrameParam(false, false, 0, 0, uodoubleArra[i1], 2);
                                  FrameResult uFrameResult = uEditorKveDe.readFrame(mediaOpenPar);
                                  if (uFrameResult.getErrorInfo() != null && uFrameResult.getErrorInfo().getErrorCode() != ErrorInfo$ErrorCode.OK) {
                                     _monitor_enter(this);
                                     mEventListen = obj.this$0.mEventListener;
                                     if (mEventListen != null) {
                                        mEventListen.onError(uFrameResult.getErrorInfo());
                                     }
                                     _monitor_exit(this);
                                     if (uEditorKveDe.isOpened()) {
                                        uEditorKveDe.close();
                                     }
                                     uEditorKveDe.release();
                                     return;
                                  }else {
                                     CPUImageFrame uCPUImageFra = new CPUImageFrame();
                                     uCPUImageFra.setData(uFrameResult.getFrameData());
                                     uCPUImageFra.setWidth(uFrameResult.getDecodeWidth());
                                     uCPUImageFra.setHeight(uFrameResult.getDecodeHeight());
                                     uCPUImageFra.setLineSize(uFrameResult.getLineSizes());
                                     uCPUImageFra.setPixelFormat(i);
                                     obj.this$0.mCPUImageFrames.add(uCPUImageFra);
                                     i1 = i1 + 1;
                                  }
                               }
                            }else if(uEditorKveDe.isOpened()){
                               uEditorKveDe.close();
                            }
                            uEditorKveDe.release();
                         }
                         uEditorKveDe.release();
                         return;
                      }
                   }catch(java.lang.Exception e0){
                      EditorSdkLogger.e("EditorEnhanceTask", "error while get asset duration: "+trackAssetDi.assetPath(), e0);
                      obj.this$0.callOnError(ErrorInfo$ErrorCode.INVALID_PARAMETER, "Failed to start enhance task. Error while get asset duration. Path: "+trackAssetDi.assetPath());
                      if (uEditorKveDe.isOpened()) {
                         uEditorKveDe.close();
                      }
                      uEditorKveDe.release();
                      return;
                   }
                }
             }
          }
       }else {
          Iterator iterator = val$decodedF.iterator();
          while (true) {
             if (iterator.hasNext()) {
                String str2 = iterator.next();
                if (obj.this$0.mCancelled != null) {
                   _monitor_enter(this);
                   mEventListen = obj.this$0.mEventListener;
                   if (mEventListen != null) {
                      mEventListen.onCancel();
                      break ;
                   }
                   break ;
                }else if(TextUtils.isEmpty(str2)){
                   obj.this$0.callOnError(ErrorInfo$ErrorCode.INVALID_PARAMETER, "imagePath in decodedFrameList is empty");
                   return;
                }else {
                   Bitmap uBitmap = AndroidPlatformImageLoader.loadImage(str2, 720, 720, str);
                   if (uBitmap == null) {
                      obj.this$0.callOnError(ErrorInfo$ErrorCode.FRAME_FAIL, "Failed to start enhance task. Loaded image is null.");
                      return;
                   }else {
                      int i2 = uBitmap.getWidth() * 4;
                      i2 = i2 * uBitmap.getHeight();
                      ByteBuffer uByteBuffer = ByteBuffer.allocateDirect(i2);
                      uBitmap.copyPixelsToBuffer(uByteBuffer);
                      CPUImageFrame uCPUImageFra1 = new CPUImageFrame();
                      ByteBuffer[] uByteBufferA = new ByteBuffer[str];
                      uByteBufferA[i] = uByteBuffer;
                      uCPUImageFra1.setData(uByteBufferA);
                      uCPUImageFra1.setWidth(uBitmap.getWidth());
                      uCPUImageFra1.setHeight(uBitmap.getHeight());
                      int[] ointArray = new int[str];
                      i1 = uBitmap.getWidth() * 4;
                      ointArray[i] = i1;
                      uCPUImageFra1.setLineSize(ointArray);
                      uCPUImageFra1.setPixelFormat(i);
                      obj.this$0.mCPUImageFrames.add(uCPUImageFra1);
                   }
                }
             }
          }
          _monitor_exit(this);
          return;
       }
       lutEnhancerB.setEnhanceMethod(LutEnhancerConfig$EnhanceMethod.Lut);
       lutEnhancerB.enableDehaze(str);
       lutEnhancerB.setLutThreshold(100);
       LutEnhancer lutEnhancer = lutEnhancerB.build();
       lutEnhancer.setEventListener(new EditorEnhanceTask$1$1(obj));
       lutEnhancer.start(obj.this$0.mCPUImageFrames);
       obj.this$0.mLutEnhancer = lutEnhancer;
       return;
    }
}
