package com.kwai.video.ksmodelmanager.downloader.ModelDownloader;
import android.content.Context;
import java.lang.Object;
import eb7.a;
import c0d.a;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.middleware.resourcemanager.download.BaseResourceDownloadHelper;
import com.kwai.video.ksmodelmanager.config.ModelConfig$ModelInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.video.ksmodelmanager.CachePolicy;
import com.kwai.video.ksmodelmanager.downloader.ModelDownloadListener;
import com.kwai.video.ksmodelmanager.config.ModelConfigManager;
import java.lang.Throwable;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kwai.video.ksmodelmanager.config.CacheModelInfo;
import com.kwai.video.ksmodelmanager.ModelRepo;
import java.io.File;
import java.lang.System;
import com.kwai.video.ksmodelmanager.downloader.ModelDownloadConfig;
import com.kwai.video.ksmodelmanager.downloader.ModelDownloader$1;
import com.kwai.middleware.resourcemanager.download.config.DownloadConfig;
import gb7.c;

public class ModelDownloader	// class@00091f
{
    public a downloader;

    public void ModelDownloader(Context p0){
       super();
       this.downloader = new a(p0, null);
    }
    public void cancel(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ModelDownloader.class, "5")) {
          return;
       }
       this.downloader.b(p0);
       return;
    }
    public void cancelAll(){
       if (PatchProxy.applyVoid(null, this, ModelDownloader.class, "6")) {
          return;
       }
       this.downloader.c();
       return;
    }
    public final boolean checkModelInfo(ModelConfig$ModelInfo p0){
       boolean b;
       ModelConfig$ModelInfo obj = PatchProxy.applyOneRefs(p0, this, ModelDownloader.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null) {
          obj = p0.url;
          if (obj != null && (!obj.isEmpty() && (p0.modelVersion != -1 && p0.deviceLevel != -1))) {
             b = true;
          label_002b :
             return b;
          }
       }
    label_002a :
       b = false;
       goto label_002b ;
    }
    public String download(String p0,CachePolicy p1,CachePolicy p2,ModelDownloadListener p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, ModelDownloader.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ModelConfig$ModelInfo modelConfig = ModelConfigManager.getInstance().getModelConfig(p0);
       if (modelConfig != null) {
          return this.downloadInternal(p0, p1, p2, p3, modelConfig);
       }
       p3.onFailed(p0, new Throwable("get ModelInfo failed"), null);
       return null;
    }
    public void downloadAll(CachePolicy p0,CachePolicy p1,ModelDownloadListener p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ModelDownloader.class, "2")) {
          return;
       }
       Map modelConfig = ModelConfigManager.getInstance().getModelConfig();
       if (modelConfig == null) {
          return;
       }
       Iterator iterator = modelConfig.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          this.downloadInternal(uEntry.getKey(), p0, p1, p2, uEntry.getValue());
       }
       return;
    }
    public final String downloadInternal(String p0,CachePolicy p1,CachePolicy p2,ModelDownloadListener p3,ModelConfig$ModelInfo p4){
       ModelDownloader modelDownloa = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p4;
       ModelDownloader modelDownloa1 = ModelDownloader.class;
       int i = 1;
       int i1 = 0;
       if (PatchProxy.isSupport(modelDownloa1)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,p3,oobject3};
          Object obj = PatchProxy.apply(objArray, this, modelDownloa1, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       String str = null;
       if (!this.checkModelInfo(oobject3)) {
          return str;
       }else {
          CacheModelInfo modelFile = ModelRepo.getModelFile(p0, oobject3.modelVersion, oobject3.deviceLevel, p1, oobject2);
          if (modelFile != null && modelFile.cacheFile.exists()) {
             ModelDownloader modelDownloa2 = (modelFile.deviceLevel == oobject3.deviceLevel && modelFile.modelVersion == oobject3.modelVersion)? 1: null;
             p3.onCompleted(p0, modelFile.cacheFile.getAbsolutePath(), "localCache", modelDownloa2, modelFile.modelVersion, modelFile.deviceLevel);
             if (modelDownloa2) {
                return str;
             }
          }
       label_006f :
          ModelDownloadConfig modelDownloa3 = new ModelDownloadConfig(p0, oobject3);
          ModelDownloader$1 u1 = new ModelDownloader$1(this, p3, p0, System.currentTimeMillis(), p4);
          modelDownloa.downloader.d(modelDownloa3, v12);
          return modelDownloa3.getId();
       }
    }
}
