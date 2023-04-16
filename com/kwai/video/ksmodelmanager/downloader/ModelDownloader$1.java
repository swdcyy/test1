package com.kwai.video.ksmodelmanager.downloader.ModelDownloader$1;
import gb7.c;
import com.kwai.video.ksmodelmanager.downloader.ModelDownloader;
import com.kwai.video.ksmodelmanager.downloader.ModelDownloadListener;
import java.lang.String;
import com.kwai.video.ksmodelmanager.config.ModelConfig$ModelInfo;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import java.lang.Throwable;
import java.lang.Long;

public class ModelDownloader$1 implements c	// class@00091e
{
    public final ModelDownloader this$0;
    public final ModelDownloadListener val$listener;
    public final ModelConfig$ModelInfo val$modelInfo;
    public final String val$modelType;
    public final long val$startTime;

    public void ModelDownloader$1(ModelDownloader p0,ModelDownloadListener p1,String p2,long p3,ModelConfig$ModelInfo p4){
       this.this$0 = p0;
       this.val$listener = p1;
       this.val$modelType = p2;
       this.val$startTime = p3;
       this.val$modelInfo = p4;
       super();
    }
    public void onCancel(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ModelDownloader$1.class, "4")) {
          return;
       }
       this.val$listener.onCancel(p0, p1);
       return;
    }
    public void onCompleted(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ModelDownloader$1.class, "3")) {
          return;
       }
       System.currentTimeMillis();
       ModelDownloader$1 tval$modelIn = this.val$modelInfo;
       this.val$listener.onCompleted(this.val$modelType, p1, p2, true, tval$modelIn.modelVersion, tval$modelIn.deviceLevel);
       return;
    }
    public void onFailed(String p0,Throwable p1,String p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, ModelDownloader$1.class, "2")) {
          return;
       }
       this.val$listener.onFailed(this.val$modelType, p1, p3);
       return;
    }
    public void onProgress(String p0,long p1,long p2){
       if (PatchProxy.isSupport(ModelDownloader$1.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, ModelDownloader$1.class, "1")) {
          return;
       }
       ModelDownloader$1 tval$listene = this.val$listener;
       ModelDownloader$1 tval$modelTy = this.val$modelType;
       float f = (!p2)? 0: (float)p1 / (float)p2;
       tval$listene.onProgress(tval$modelTy, f);
       return;
    }
}
