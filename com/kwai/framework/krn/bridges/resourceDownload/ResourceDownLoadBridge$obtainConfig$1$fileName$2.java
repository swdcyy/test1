package com.kwai.framework.krn.bridges.resourceDownload.ResourceDownLoadBridge$obtainConfig$1$fileName$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.framework.krn.bridges.resourceDownload.ResourceDownLoadBridge$obtainConfig$1;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import mb7.a;
import java.util.List;
import com.kwai.middleware.resourcemanager.material.cache.model.MaterialDetailInfo;

public final class ResourceDownLoadBridge$obtainConfig$1$fileName$2 extends Lambda implements a	// class@0015d0
{
    public final ResourceDownLoadBridge$obtainConfig$1 this$0;

    public void ResourceDownLoadBridge$obtainConfig$1$fileName$2(ResourceDownLoadBridge$obtainConfig$1 p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       Object obj = PatchProxy.apply(null, this, ResourceDownLoadBridge$obtainConfig$1$fileName$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.c.c(this.this$0.e.getResourceUrls());
    }
}
