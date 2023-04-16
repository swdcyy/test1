package com.kwai.framework.krn.bridges.resourceDownload.ResourceDownLoadBridge$obtainConfig$1$fileFolder$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.framework.krn.bridges.resourceDownload.ResourceDownLoadBridge$obtainConfig$1;
import java.io.File;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import mb7.a;
import jb7.a;
import pb7.a;

public final class ResourceDownLoadBridge$obtainConfig$1$fileFolder$2 extends Lambda implements a	// class@0015cf
{
    public final ResourceDownLoadBridge$obtainConfig$1 this$0;

    public void ResourceDownLoadBridge$obtainConfig$1$fileFolder$2(ResourceDownLoadBridge$obtainConfig$1 p0){
       this.this$0 = p0;
       super(0);
    }
    public final File invoke(){
       Object obj = PatchProxy.apply(null, this, ResourceDownLoadBridge$obtainConfig$1$fileFolder$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.c.b(this.this$0.g.c(), this.this$0.e);
    }
    public Object invoke(){
       return this.invoke();
    }
}
