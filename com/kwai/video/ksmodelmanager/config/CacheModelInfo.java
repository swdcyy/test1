package com.kwai.video.ksmodelmanager.config.CacheModelInfo;
import com.kwai.video.ksmodelmanager.config.ModelConfig$ModelInfo;
import java.io.File;
import java.lang.String;

public class CacheModelInfo extends ModelConfig$ModelInfo	// class@000915
{
    public File cacheFile;
    public String modelType;

    public void CacheModelInfo(File p0,String p1){
       super();
       this.cacheFile = p0;
       this.modelType = p1;
    }
}
