package com.yxcorp.gifshow.album.widget.preview.KsAlbumVideoSDKPlayerController$a;
import com.kwai.video.editorsdk2.PreviewEventListenerV2;
import com.yxcorp.gifshow.album.widget.preview.KsAlbumVideoSDKPlayerController;
import java.lang.Object;
import com.kwai.video.editorsdk2.PreviewPlayer;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$AnimatedSubAssetRenderData;
import com.kwai.video.editorsdk2.PreviewEventListener;
import jv7.k;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.album.widget.preview.a;
import java.util.Collection;
import java.util.Map;
import java.util.Iterator;
import com.yxcorp.gifshow.album.widget.preview.a$a;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$EditorSdkError;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$EditorSdkStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$EditorSdkErrorStats;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$EditorSdkPreviewPlayerStats;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.yxcorp.utility.TextUtils;
import g79.a;
import w69.x;
import java.lang.Double;
import com.yxcorp.gifshow.album.widget.preview.KsAlbumVideoSDKPlayerController$c;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import com.yxcorp.gifshow.album.imageloader.CompatImageView;
import com.yxcorp.gifshow.album.widget.preview.KsAlbumVideoPlayerView;
import android.widget.ImageView;
import android.graphics.Bitmap;
import bc7.a;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import java.lang.Number;
import kotlin.jvm.internal.a;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import com.kwai.video.editorsdk2.EditorSdk2Utils$PreviewSizeLimitation;
import w69.l;
import java.lang.Throwable;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$PreviewPassedData;
import java.util.concurrent.CountDownLatch;
import com.kwai.video.editorsdk2.RenderPosDetail;
import jv7.l;

public class KsAlbumVideoSDKPlayerController$a implements PreviewEventListenerV2	// class@001b25
{
    public final KsAlbumVideoSDKPlayerController a;

    public void KsAlbumVideoSDKPlayerController$a(KsAlbumVideoSDKPlayerController p0){
       this.a = p0;
       super();
    }
    public void onAnimatedSubAssetsRender(PreviewPlayer p0,double p1,EditorSdk2$AnimatedSubAssetRenderData[] p2){
    }
    public void onAttached(PreviewPlayer p0){
       k.b(this, p0);
    }
    public void onDetached(PreviewPlayer p0){
       k.c(this, p0);
    }
    public void onEnd(PreviewPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsAlbumVideoSDKPlayerController$a.class, "8")) {
          return;
       }
       Iterator iterator = this.a.c.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().a();
       }
       return;
    }
    public void onEndNoFaceWarning(PreviewPlayer p0){
       k.d(this, p0);
    }
    public void onError(PreviewPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsAlbumVideoSDKPlayerController$a.class, "6")) {
          return;
       }
       EditorSdk2$EditorSdkError error = p0.getError();
       if (error == null) {
          return;
       }
       Iterator iterator = this.a.c.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().b(error.message());
       }
       KsAlbumVideoSDKPlayerController$a ta = this.a;
       Objects.requireNonNull(ta);
       ClientStat$StatPackage statPackage = PatchProxy.applyOneRefs(error, ta, KsAlbumVideoSDKPlayerController.class, "32");
       if (statPackage != PatchProxyResult.class) {
       }else {
          statPackage = new ClientStat$StatPackage();
          ClientStat$EditorSdkStatEvent uEditorSdkSt = new ClientStat$EditorSdkStatEvent();
          statPackage.editorSdkStatEvent = uEditorSdkSt;
          ClientStat$EditorSdkErrorStats[] uEditorSdkEr = new ClientStat$EditorSdkErrorStats[]{new ClientStat$EditorSdkErrorStats()};
          uEditorSdkSt.errorStats = uEditorSdkEr;
          statPackage.editorSdkStatEvent.errorStats[0].errorCode = error.code();
          statPackage.editorSdkStatEvent.errorStats[0].errorMessage = error.message();
          error.previewPlayerStats = ta.r();
          error.urlPackage = new ClientEvent$UrlPackage();
          error.page = ta.t();
          error.statsSessionId = TextUtils.k(ta.n);
       }
       a.c.f().j(statPackage);
       return;
    }
    public void onFrameRender(PreviewPlayer p0,double p1,long[] p2){
       if (PatchProxy.isSupport(KsAlbumVideoSDKPlayerController$a.class) && PatchProxy.applyVoidThreeRefs(p0, Double.valueOf(p1), p2, this, KsAlbumVideoSDKPlayerController$a.class, "2")) {
          return;
       }
       Iterator iterator = this.a.c.values().iterator();
       while (iterator.hasNext()) {
          a$a uoa = iterator.next();
          if (uoa instanceof KsAlbumVideoSDKPlayerController$c) {
             uoa.g(p1);
          }
       }
       String u = KsAlbumVideoSDKPlayerController.u;
       Log.b(u, "onFrameRender\(\) called with: previewPlayer = ["+p0+"], v = ["+p1+"], longs = ["+p2+"]");
       if (this.a.a.getCoverView() != null && this.a.a.getCoverView().isShown()) {
          Log.b(u, "player onFrameRender, hide cover "+this.a);
          this.a.a.getCoverView().setVisibility(8);
       }
       return;
    }
    public void onHasDumpedFrame(Bitmap p0,int p1,String p2,long p3){
       k.e(this, p0, p1, p2, p3);
    }
    public void onHasNoFaceWarning(PreviewPlayer p0){
       k.f(this, p0);
    }
    public void onLoadedData(PreviewPlayer p0){
       int i;
       int i1;
       Iterator iterator;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       String str = "3";
       if (PatchProxy.applyVoidOneRefs(p0, this, KsAlbumVideoSDKPlayerController$a.class, str)) {
          return;
       }
       String u = KsAlbumVideoSDKPlayerController.u;
       StringBuilder str1 = "player onLoadedData previewComputedWidth:"+a.b(this.a.v())+",previewComputedHeight:"+a.a(this.a.v())+",exportComputedWidth:";
       EditorSdk2V2$VideoEditorProject videoEditorP = this.a.v();
       EditorSdk2V2$VideoEditorProject obj = PatchProxy.applyOneRefs(videoEditorP, null, uoa, str);
       if (obj != patchProxyRe) {
          i = obj.intValue();
       }else {
          a.q(videoEditorP, "project");
          i = (EditorSdk2UtilsV2.isSingleImageProject(videoEditorP))? EditorSdk2UtilsV2.getComputedWidth(videoEditorP): EditorSdk2UtilsV2.getLimitedWidth(EditorSdk2UtilsV2.getComputedWidth(videoEditorP), EditorSdk2UtilsV2.getComputedHeight(videoEditorP), EditorSdk2Utils$PreviewSizeLimitation.PREVIEW_SIZE_LIMITATION_720P);
       }
       str1 = str1+i+",exportComputedHeight:";
       obj = this.a.v();
       Object obj1 = PatchProxy.applyOneRefs(obj, null, uoa, "4");
       if (obj1 != patchProxyRe) {
          i1 = obj1.intValue();
       }else {
          a.q(obj, "project");
          i1 = (EditorSdk2UtilsV2.isSingleImageProject(obj))? EditorSdk2UtilsV2.getComputedHeight(obj): EditorSdk2UtilsV2.getLimitedHeight(EditorSdk2UtilsV2.getComputedWidth(obj), EditorSdk2UtilsV2.getComputedHeight(obj), EditorSdk2Utils$PreviewSizeLimitation.PREVIEW_SIZE_LIMITATION_720P);
       }
       Log.g(u, str1+i1+",limitation:"+this.a.s);
       p0 = p0.mProject;
       if (p0 != null) {
          try{
             this.a.o = EditorSdk2UtilsV2.getDisplayDuration(p0);
          }catch(java.lang.Exception e10){
             a.c.c().onException(e10);
          }
       }
    }
    public void onPassedData(PreviewPlayer p0,EditorSdk2$PreviewPassedData p1){
       k.g(this, p0, p1);
    }
    public void onPause(PreviewPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsAlbumVideoSDKPlayerController$a.class, "5")) {
          return;
       }
       Log.b(KsAlbumVideoSDKPlayerController.u, "player onPause "+this.a);
       Iterator iterator = this.a.c.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().d();
       }
       return;
    }
    public void onPlay(PreviewPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsAlbumVideoSDKPlayerController$a.class, "4")) {
          return;
       }
       Log.b(KsAlbumVideoSDKPlayerController.u, "player onPlay "+this.a);
       Iterator iterator = this.a.c.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().e();
       }
       return;
    }
    public void onPlaying(PreviewPlayer p0){
    }
    public void onSeeked(PreviewPlayer p0){
    }
    public void onSeeking(PreviewPlayer p0){
    }
    public void onSlideShowReady(PreviewPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsAlbumVideoSDKPlayerController$a.class, "9")) {
          return;
       }
       Log.b(KsAlbumVideoSDKPlayerController.u, "player onSlideShowReady "+this.a);
       KsAlbumVideoSDKPlayerController$a ta = this.a;
       if (ta.k != null) {
          ta.k = false;
          KsAlbumVideoSDKPlayerController l = ta.l;
          if (l != null && l.getCount() > 0) {
             this.a.l.countDown();
          }
       }
       return;
    }
    public void onTimeUpdate(PreviewPlayer p0,double p1){
       KsAlbumVideoSDKPlayerController$a uoa = KsAlbumVideoSDKPlayerController$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Double.valueOf(p1), this, uoa, "7")) {
          return;
       }
       Iterator iterator = this.a.c.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().f(p1);
       }
       return;
    }
    public void onTimeUpdateWithRenderPosDetail(PreviewPlayer p0,RenderPosDetail p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KsAlbumVideoSDKPlayerController$a.class, "1")) {
          return;
       }
       p0 = p0.mProject;
       if (p0 != null) {
          KsAlbumVideoSDKPlayerController$a ta = this.a;
          if (ta.o <= 0) {
             try{
                ta.o = EditorSdk2UtilsV2.getDisplayDuration(p0);
             }catch(java.lang.ArrayIndexOutOfBoundsException e6){
                a.c.c().onException(e6);
             }
          }
       }
    }
    public void onUpdatePCMData(byte[] p0,double p1,double p2){
       l.b(this, p0, p1, p2);
    }
    public void onWaiting(PreviewPlayer p0){
    }
}
