package com.kwai.sdk.eve.internal.pack.download.IPackageDownloader$a;
import java.lang.Object;
import com.kwai.sdk.eve.internal.pack.download.IPackageDownloader$DownloadItem;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import kotlin.jvm.internal.a;

public abstract class IPackageDownloader$a	// class@0015a1
{

    public void IPackageDownloader$a(){
       super();
    }
    public void a(IPackageDownloader$DownloadItem p0,int p1,String p2){
       if (PatchProxy.isSupport(IPackageDownloader$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, IPackageDownloader$a.class, "1")) {
          return;
       }
       a.p(p0, "downloadItem");
       a.p(p2, "errMsg");
       return;
    }
    public abstract void b(IPackageDownloader$DownloadItem p0,boolean p1);
}
