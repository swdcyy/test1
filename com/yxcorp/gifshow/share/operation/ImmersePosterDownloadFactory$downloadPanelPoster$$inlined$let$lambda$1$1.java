package com.yxcorp.gifshow.share.operation.ImmersePosterDownloadFactory$downloadPanelPoster$$inlined$let$lambda$1$1;
import yic.r0;
import brd.v;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.share.operation.ImmersePosterDownloadFactory$downloadPanelPoster$1$1$1$onRepeatDownload$1;
import msd.a;
import tb7.b;
import brd.g;
import com.yxcorp.gifshow.photo.download.api.response.DownloadPhotoInfoResponse;
import com.yxcorp.gifshow.photo.download.task.b;
import java.lang.Throwable;
import com.yxcorp.gifshow.share.operation.ImmersePosterDownloadFactory$downloadPanelPoster$1$1$1$onError$1;
import com.yxcorp.gifshow.share.operation.ImmersePosterDownloadFactory$downloadPanelPoster$$inlined$let$lambda$1$1$1;
import java.lang.Float;
import com.yxcorp.gifshow.share.operation.ImmersePosterDownloadFactory$downloadPanelPoster$1$1$1$onSuccess$1;

public final class ImmersePosterDownloadFactory$downloadPanelPoster$$inlined$let$lambda$1$1 implements r0	// class@001bf1
{
    public final v a;

    public void ImmersePosterDownloadFactory$downloadPanelPoster$$inlined$let$lambda$1$1(v p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoidWithListener(null, this, ImmersePosterDownloadFactory$downloadPanelPoster$$inlined$let$lambda$1$1.class, "3")) {
          return;
       }
       b.j(ImmersePosterDownloadFactory$downloadPanelPoster$1$1$1$onRepeatDownload$1.INSTANCE);
       this.a.onComplete();
       PatchProxy.onMethodExit(ImmersePosterDownloadFactory$downloadPanelPoster$$inlined$let$lambda$1$1.class, "3");
       return;
    }
    public void b(DownloadPhotoInfoResponse p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, ImmersePosterDownloadFactory$downloadPanelPoster$$inlined$let$lambda$1$1.class, "7")) {
          return;
       }
       PatchProxy.onMethodExit(ImmersePosterDownloadFactory$downloadPanelPoster$$inlined$let$lambda$1$1.class, "7");
       return;
    }
    public void c(b p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, ImmersePosterDownloadFactory$downloadPanelPoster$$inlined$let$lambda$1$1.class, "8")) {
          return;
       }
       PatchProxy.onMethodExit(ImmersePosterDownloadFactory$downloadPanelPoster$$inlined$let$lambda$1$1.class, "8");
       return;
    }
    public void onCancel(){
       if (PatchProxy.applyVoidWithListener(null, this, ImmersePosterDownloadFactory$downloadPanelPoster$$inlined$let$lambda$1$1.class, "6")) {
          return;
       }
       PatchProxy.onMethodExit(ImmersePosterDownloadFactory$downloadPanelPoster$$inlined$let$lambda$1$1.class, "6");
       return;
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, ImmersePosterDownloadFactory$downloadPanelPoster$$inlined$let$lambda$1$1.class, "2")) {
          return;
       }
       b.j(ImmersePosterDownloadFactory$downloadPanelPoster$1$1$1$onError$1.INSTANCE);
       if (p0 != null) {
          ImmersePosterDownloadFactory$downloadPanelPoster$$inlined$let$lambda$1$1$1 uodownloadPa = new ImmersePosterDownloadFactory$downloadPanelPoster$$inlined$let$lambda$1$1$1(this.a);
       }
       PatchProxy.onMethodExit(ImmersePosterDownloadFactory$downloadPanelPoster$$inlined$let$lambda$1$1.class, "2");
       return;
    }
    public void onProgress(float p0){
       if (PatchProxy.isSupport2(ImmersePosterDownloadFactory$downloadPanelPoster$$inlined$let$lambda$1$1.class, "5") && PatchProxy.applyVoidOneRefsWithListener(Float.valueOf(p0), this, ImmersePosterDownloadFactory$downloadPanelPoster$$inlined$let$lambda$1$1.class, "5")) {
          return;
       }
       PatchProxy.onMethodExit(ImmersePosterDownloadFactory$downloadPanelPoster$$inlined$let$lambda$1$1.class, "5");
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoidWithListener(null, this, ImmersePosterDownloadFactory$downloadPanelPoster$$inlined$let$lambda$1$1.class, "4")) {
          return;
       }
       PatchProxy.onMethodExit(ImmersePosterDownloadFactory$downloadPanelPoster$$inlined$let$lambda$1$1.class, "4");
       return;
    }
    public void onSuccess(){
       if (PatchProxy.applyVoidWithListener(null, this, ImmersePosterDownloadFactory$downloadPanelPoster$$inlined$let$lambda$1$1.class, "1")) {
          return;
       }
       b.j(ImmersePosterDownloadFactory$downloadPanelPoster$1$1$1$onSuccess$1.INSTANCE);
       this.a.onComplete();
       PatchProxy.onMethodExit(ImmersePosterDownloadFactory$downloadPanelPoster$$inlined$let$lambda$1$1.class, "1");
       return;
    }
}
