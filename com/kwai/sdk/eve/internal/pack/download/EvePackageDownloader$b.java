package com.kwai.sdk.eve.internal.pack.download.EvePackageDownloader$b;
import sn7.a;
import com.kwai.sdk.eve.internal.pack.download.EvePackageDownloader;
import com.kwai.sdk.eve.internal.pack.download.IPackageDownloader$DownloadItem;
import kotlin.jvm.internal.Ref$BooleanRef;
import com.kwai.sdk.eve.internal.pack.download.IPackageDownloader$a;
import kotlin.jvm.internal.Ref$ObjectRef;
import ptd.c;
import com.yxcorp.download.DownloadTask;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import com.yxcorp.download.b;
import com.kwai.sdk.eve.internal.common.models.EvePackageManagerException$DownloadException;
import java.lang.Throwable;
import nsd.u;
import java.io.File;
import com.kwai.sdk.eve.internal.common.utils.a;
import kotlin.jvm.internal.a;
import com.yxcorp.utility.Log;
import java.lang.Long;

public final class EvePackageDownloader$b extends a	// class@001596
{
    public final EvePackageDownloader c;
    public final IPackageDownloader$DownloadItem d;
    public final Ref$BooleanRef e;
    public final IPackageDownloader$a f;
    public final Ref$ObjectRef g;
    public final c h;

    public void EvePackageDownloader$b(EvePackageDownloader p0,IPackageDownloader$DownloadItem p1,Ref$BooleanRef p2,IPackageDownloader$a p3,Ref$ObjectRef p4,c p5){
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.g = p4;
       this.h = p5;
       super();
    }
    public void b(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EvePackageDownloader$b.class, "3")) {
          return;
       }
       EveLog.i$default("EPMDownloader#fullDownload : canceled = "+this.c.f(this.d), false, 2, null);
       if (p0 != null) {
          p0.removeListener(this);
       }
       EvePackageManagerException$DownloadException uDownloadExc = new EvePackageManagerException$DownloadException(4, "DOWNLOAD_CANCELED", null, 4, null);
       p0.element = v0;
       this.c.b(this.f, this.d, 4, "DOWNLOAD_CANCELED");
       EvePackageDownloader.h(this.c, this.h, null, 1, null);
       return;
    }
    public void c(DownloadTask p0){
       String str = "";
       if (PatchProxy.applyVoidOneRefs(p0, this, EvePackageDownloader$b.class, "1")) {
          return;
       }
       EveLog.i$default("EPMDownloader#fullDownload : completed = "+this.c.f(this.d), false, 2, null);
       if (p0 != null) {
          p0.removeListener(this);
       }
       p0.element = true;
       int i = 3;
       try{
          if (a.g(a.e(this.d.a()), this.d.g) ^ true) {
             this.e.element = false;
             this.c.b(this.f, this.d, i, str);
          }
       }catch(java.lang.Exception e2){
          this.e.element = false;
          String str1 = Log.f(e2);
          if (str1 != null) {
             str = str1;
          }
          EvePackageManagerException$DownloadException uDownloadExc = new EvePackageManagerException$DownloadException(3, str, null, 4, null);
          this.g.element = v11;
          this.c.b(this.f, this.d, i, str);
       }
       if (this.e.element != null) {
          this.c.c(this.f, this.d, false);
       }
       EvePackageDownloader.h(this.c, this.h, null, true, null);
       return;
    }
    public void e(DownloadTask p0,Throwable p1){
       String str;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EvePackageDownloader$b.class, "2")) {
          return;
       }
       EveLog.i$default("EPMDownloader#fullDownload : error = "+p1+", url = "+this.c.f(this.d), false, 2, null);
       if (p0 != null) {
          p0.removeListener(this);
       }
       if (p1 != null) {
          str = Log.f(p1);
          if (str != null) {
          label_0042 :
             this.g.element = new EvePackageManagerException$DownloadException(2, str, p1);
             this.c.b(this.f, this.d, 2, str);
             EvePackageDownloader.h(this.c, this.h, null, 1, null);
             return;
          }
       }
       str = "";
       goto label_0042 ;
    }
    public void k(DownloadTask p0,long p1,long p2){
       if (PatchProxy.isSupport(EvePackageDownloader$b.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, EvePackageDownloader$b.class, "4")) {
          return;
       }
       EveLog.i$default("EPMDownloader#fullDownload : progress = \("+p1+'/'+p2+"\), url = "+this.c.f(this.d), false, 2, null);
       return;
    }
}
