package com.kwai.sdk.eve.internal.pack.download.EvePackageDownloader$download$downloadItem$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.sdk.eve.internal.pack.download.EvePackageDownloader;
import com.kwai.sdk.eve.internal.pack.download.IPackageDownloader$a;
import com.kwai.sdk.eve.internal.pack.download.IPackageDownloader$DownloadItem;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class EvePackageDownloader$download$downloadItem$1 extends Lambda implements a	// class@001597
{
    public final IPackageDownloader$a $callback;
    public final IPackageDownloader$DownloadItem $downloadItem;
    public final EvePackageDownloader this$0;

    public void EvePackageDownloader$download$downloadItem$1(EvePackageDownloader p0,IPackageDownloader$a p1,IPackageDownloader$DownloadItem p2){
       this.this$0 = p0;
       this.$callback = p1;
       this.$downloadItem = p2;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, EvePackageDownloader$download$downloadItem$1.class, "1")) {
          return;
       }
       this.this$0.b(this.$callback, this.$downloadItem, 1, "DOWNLOAD_PARAMS_CHECK_FAIL");
       return;
    }
}
