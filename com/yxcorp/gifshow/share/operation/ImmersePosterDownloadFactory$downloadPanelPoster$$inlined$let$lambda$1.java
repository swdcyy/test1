package com.yxcorp.gifshow.share.operation.ImmersePosterDownloadFactory$downloadPanelPoster$$inlined$let$lambda$1;
import io.reactivex.g;
import com.kwai.sharelib.model.PainterModel;
import oic.k;
import uo7.k;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import fg6.a;
import com.kwai.sharelib.model.PainterModel$VideoContent;
import com.yxcorp.gifshow.entity.QPhoto;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import com.yxcorp.gifshow.photo.download.model.StatModel;
import com.yxcorp.gifshow.photo.download.task.n0;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.share.operation.ImmersePosterDownloadFactory$downloadPanelPoster$$inlined$let$lambda$1$1;
import exb.b;
import com.yxcorp.gifshow.photo.download.task.b;

public final class ImmersePosterDownloadFactory$downloadPanelPoster$$inlined$let$lambda$1 implements g	// class@001bf2
{
    public final PainterModel b;
    public final k c;
    public final k d;

    public void ImmersePosterDownloadFactory$downloadPanelPoster$$inlined$let$lambda$1(PainterModel p0,k p1,k p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void subscribe(v p0){
       Gson a;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, ImmersePosterDownloadFactory$downloadPanelPoster$$inlined$let$lambda$1.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       a = a.a;
       PainterModel mVideoConten = this.b.mVideoContent;
       PainterModel$VideoContent mQPhotoJsonE = (mVideoConten != null)? mVideoConten.mQPhotoJsonElement: null;
       new n0(this.c.b, a.c(mQPhotoJsonE, QPhoto.class), new StatModel("POPUP_DOWNLOAD"), new ImmersePosterDownloadFactory$downloadPanelPoster$$inlined$let$lambda$1$1(p0)).start();
       PatchProxy.onMethodExit(ImmersePosterDownloadFactory$downloadPanelPoster$$inlined$let$lambda$1.class, "1");
       return;
    }
}
