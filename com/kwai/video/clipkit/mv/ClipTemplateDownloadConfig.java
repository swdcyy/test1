package com.kwai.video.clipkit.mv.ClipTemplateDownloadConfig;
import java.lang.Object;
import com.kwai.video.ksspark.NewSparkDownloadConfig;
import java.lang.Boolean;

public class ClipTemplateDownloadConfig	// class@001ab5
{
    public String bizType;
    public String fileName;
    public String fileSaveFolder;
    public String md5;
    public Boolean needUnzip;
    public List resourceCdnUrls;
    public String unzipFolder;

    public void ClipTemplateDownloadConfig(){
       super();
    }
    public void ClipTemplateDownloadConfig(NewSparkDownloadConfig p0){
       super();
       this.resourceCdnUrls = p0.resourceCdnUrls;
       this.fileSaveFolder = p0.fileSaveFolder;
       this.fileName = p0.fileName;
       this.needUnzip = Boolean.valueOf(p0.needUnzip);
       this.unzipFolder = p0.unzipFolder;
       this.md5 = p0.md5;
       this.bizType = p0.bizType;
    }
}
