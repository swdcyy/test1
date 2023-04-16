package com.yxcorp.gifshow.photo.download.task.l$b;
import com.kwai.middleware.resourcemanager.download.config.DownloadConfig;
import com.yxcorp.gifshow.photo.download.task.l;
import java.io.File;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.photo.download.model.config.NebulaDownloadRedPacketConfig;
import qrd.l1;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class l$b extends DownloadConfig	// class@000f07
{
    public final l a;
    public final File b;

    public void l$b(l p0,File p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public String getProjectName(){
       return ":ks-components:photo-download";
    }
    public List getResourceUrls(){
       CDNUrl uCDNUrl;
       CDNUrl[] obj = PatchProxy.apply(null, this, l$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new CDNUrl[]{uCDNUrl};
       uCDNUrl = new CDNUrl();
       uCDNUrl.mUrl = this.a.b.mTemplate;
       return CollectionsKt__CollectionsKt.r(obj);
    }
    public File getUnzipFolder(){
       return this.b;
    }
}
