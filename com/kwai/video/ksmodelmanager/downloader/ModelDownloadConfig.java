package com.kwai.video.ksmodelmanager.downloader.ModelDownloadConfig;
import com.kwai.middleware.resourcemanager.download.config.DownloadConfig;
import java.lang.String;
import com.kwai.video.ksmodelmanager.config.ModelConfig$ModelInfo;
import java.io.File;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.ksmodelmanager.ModelRepo;
import java.lang.StringBuilder;
import java.util.List;
import com.yxcorp.gifshow.model.CDNUrl;
import java.util.Collections;

public class ModelDownloadConfig extends DownloadConfig	// class@00091c
{
    public final ModelConfig$ModelInfo modelInfo;
    public final String modelType;

    public void ModelDownloadConfig(String p0,ModelConfig$ModelInfo p1){
       super();
       this.modelType = p0;
       this.modelInfo = p1;
    }
    public File getFileFolder(){
       Object obj = PatchProxy.apply(null, this, ModelDownloadConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new File(ModelRepo.getModelFolder(), this.modelType);
    }
    public String getFileName(){
       Object obj = PatchProxy.apply(null, this, ModelDownloadConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ModelRepo.getModelFileName(this.modelInfo)+".zip";
    }
    public boolean getNeedUnzip(){
       return true;
    }
    public String getProjectName(){
       return "KSModelManager";
    }
    public List getResourceUrls(){
       CDNUrl obj = PatchProxy.apply(null, this, ModelDownloadConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new CDNUrl();
       obj.mUrl = this.modelInfo.url;
       return Collections.singletonList(obj);
    }
    public File getUnzipFolder(){
       Object obj = PatchProxy.apply(null, this, ModelDownloadConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new File(ModelRepo.getModelFolder(), this.modelType+File.separator+ModelRepo.getModelFileName(this.modelInfo));
    }
}
