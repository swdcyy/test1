package com.kwai.sdk.eve.internal.pack.download.EvePackageDownloader$fullDownload$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import com.kwai.sdk.eve.internal.pack.download.EvePackageDownloader;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.eve.internal.pack.download.IPackageDownloader$DownloadItem;
import com.kwai.sdk.eve.internal.pack.download.IPackageDownloader$a;

public final class EvePackageDownloader$fullDownload$1 extends ContinuationImpl	// class@001598
{
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public Object L$9;
    public int label;
    public Object result;
    public final EvePackageDownloader this$0;

    public void EvePackageDownloader$fullDownload$1(EvePackageDownloader p0,c p1){
       this.this$0 = p0;
       super(p1);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EvePackageDownloader$fullDownload$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.result = p0;
       this.label = this.label | Integer.MIN_VALUE;
       return this.this$0.e(0, null, null, null, this);
    }
}
