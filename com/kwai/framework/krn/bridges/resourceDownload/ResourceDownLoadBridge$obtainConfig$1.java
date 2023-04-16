package com.kwai.framework.krn.bridges.resourceDownload.ResourceDownLoadBridge$obtainConfig$1;
import com.kwai.middleware.resourcemanager.download.config.DownloadConfig;
import com.kwai.framework.krn.bridges.resourceDownload.ResourceDownLoadBridge;
import com.kwai.middleware.resourcemanager.material.cache.model.MaterialDetailInfo;
import java.lang.String;
import jb7.a;
import com.kwai.framework.krn.bridges.resourceDownload.ResourceDownLoadBridge$obtainConfig$1$fileFolder$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.framework.krn.bridges.resourceDownload.ResourceDownLoadBridge$obtainConfig$1$fileName$2;
import com.kwai.framework.krn.bridges.resourceDownload.ResourceDownLoadBridge$obtainConfig$1$unzipFolder$2;
import com.yxcorp.download.DownloadTask$DownloadBizExtra;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import java.io.File;
import java.util.List;

public final class ResourceDownLoadBridge$obtainConfig$1 extends DownloadConfig	// class@0015d2
{
    public final p a;
    public final p b;
    public final p c;
    public final ResourceDownLoadBridge d;
    public final MaterialDetailInfo e;
    public final String f;
    public final a g;

    public void ResourceDownLoadBridge$obtainConfig$1(ResourceDownLoadBridge p0,MaterialDetailInfo p1,String p2,a p3){
       this.d = p0;
       this.e = p1;
       this.f = p2;
       this.g = p3;
       super();
       this.a = s.c(new ResourceDownLoadBridge$obtainConfig$1$fileFolder$2(this));
       this.b = s.c(new ResourceDownLoadBridge$obtainConfig$1$fileName$2(this));
       this.c = s.c(new ResourceDownLoadBridge$obtainConfig$1$unzipFolder$2(this));
    }
    public DownloadTask$DownloadBizExtra getBizExtra(){
       Object obj = PatchProxy.apply(null, this, ResourceDownLoadBridge$obtainConfig$1.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.getBizExtra(this.f);
    }
    public String getBizType(){
       return "kds_face_magic_resource";
    }
    public DownloadTask$DownloadTaskType getDownloadPriority(){
       return DownloadTask$DownloadTaskType.INIT_DOWNLOAD;
    }
    public File getFileFolder(){
       Object obj = PatchProxy.apply(null, this, ResourceDownLoadBridge$obtainConfig$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public String getFileName(){
       Object obj = PatchProxy.apply(null, this, ResourceDownLoadBridge$obtainConfig$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public String getProjectName(){
       return ":ks-features:ft-platform:krn-common-bridges";
    }
    public List getResourceUrls(){
       Object obj = PatchProxy.apply(null, this, ResourceDownLoadBridge$obtainConfig$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.getResourceUrls();
    }
    public File getUnzipFolder(){
       Object obj = PatchProxy.apply(null, this, ResourceDownLoadBridge$obtainConfig$1.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getValue();
    }
}
