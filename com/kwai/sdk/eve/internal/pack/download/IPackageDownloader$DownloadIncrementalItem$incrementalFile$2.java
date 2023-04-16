package com.kwai.sdk.eve.internal.pack.download.IPackageDownloader$DownloadIncrementalItem$incrementalFile$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.sdk.eve.internal.pack.download.IPackageDownloader$DownloadIncrementalItem;
import java.io.File;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class IPackageDownloader$DownloadIncrementalItem$incrementalFile$2 extends Lambda implements a	// class@00159c
{
    public final IPackageDownloader$DownloadIncrementalItem this$0;

    public void IPackageDownloader$DownloadIncrementalItem$incrementalFile$2(IPackageDownloader$DownloadIncrementalItem p0){
       this.this$0 = p0;
       super(0);
    }
    public final File invoke(){
       Object obj = PatchProxy.apply(null, this, IPackageDownloader$DownloadIncrementalItem$incrementalFile$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new File(this.this$0.m);
    }
    public Object invoke(){
       return this.invoke();
    }
}
