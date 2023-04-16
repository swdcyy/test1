package com.kuaishou.krn.bridges.download.KrnDownloadBridge$a;
import hk0.d;
import com.kuaishou.krn.bridges.download.KrnDownloadBridge;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Integer;
import java.io.File;
import qkd.b;
import lk0.b;
import java.lang.Throwable;

public class KrnDownloadBridge$a extends d	// class@00080d
{
    public final boolean a;
    public final KrnDownloadBridge b;

    public void KrnDownloadBridge$a(KrnDownloadBridge p0,boolean p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, KrnDownloadBridge$a.class, "4")) {
          return;
       }
       this.b.notifyDownloadState2Js("download_cancel", "download canceled");
       return;
    }
    public void b(long p0,long p1){
       KrnDownloadBridge$a uoa = KrnDownloadBridge$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, uoa, "2")) {
          return;
       }
       this.b.notifyDownloadState2Js("download_progress", Integer.valueOf((int)((p0 * 100) / p1)));
       return;
    }
    public void c(File p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnDownloadBridge$a.class, "3")) {
          return;
       }
       KrnDownloadBridge$a tb = this.b;
       String absolutePath = (p0 != null)? p0.getAbsolutePath(): "";
       tb.notifyDownloadState2Js("download_complete", absolutePath);
       if (this.a != null && b.K(p0.getName())) {
          b.b(p0.getAbsolutePath());
       }
       return;
    }
    public void error(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnDownloadBridge$a.class, "5")) {
          return;
       }
       KrnDownloadBridge$a tb = this.b;
       String str = (p0 != null)? p0.toString(): "";
       tb.notifyDownloadState2Js("download_error", str);
       return;
    }
    public void start(){
       if (PatchProxy.applyVoid(null, this, KrnDownloadBridge$a.class, "1")) {
          return;
       }
       this.b.notifyDownloadState2Js("download_start", "download started");
       return;
    }
}
