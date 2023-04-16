package com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView$a;
import com.kwai.video.editorsdk2.PreviewEventListenerV2;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import java.lang.Object;
import com.kwai.video.editorsdk2.PreviewPlayer;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$AnimatedSubAssetRenderData;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Double;
import java.lang.String;
import java.util.Collection;
import java.util.Map;
import java.util.Iterator;
import com.kwai.video.editorsdk2.PreviewEventListener;
import jv7.k;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$EditorSdkError;
import gq.a;
import java.lang.StringBuilder;
import q87.c;
import android.widget.ImageView;
import android.graphics.Bitmap;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import mca.a;
import wba.d0;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$PreviewPassedData;
import zxa.b;
import java.util.concurrent.CountDownLatch;
import com.kwai.video.editorsdk2.RenderPosDetail;
import w46.b;
import jv7.l;

public class VideoSDKPlayerView$a implements PreviewEventListenerV2	// class@001912
{
    public final VideoSDKPlayerView a;

    public void VideoSDKPlayerView$a(VideoSDKPlayerView p0){
       this.a = p0;
       super();
    }
    public void onAnimatedSubAssetsRender(PreviewPlayer p0,double p1,EditorSdk2$AnimatedSubAssetRenderData[] p2){
       if (PatchProxy.isSupport(VideoSDKPlayerView$a.class) && PatchProxy.applyVoidThreeRefs(p0, Double.valueOf(p1), p2, this, VideoSDKPlayerView$a.class, "14")) {
          return;
       }
       Iterator iterator = this.a.mPreviewEventListenersMap.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().onAnimatedSubAssetsRender(p0, p1, p2);
       }
       return;
    }
    public void onAttached(PreviewPlayer p0){
       k.b(this, p0);
    }
    public void onDetached(PreviewPlayer p0){
       k.c(this, p0);
    }
    public void onEnd(PreviewPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoSDKPlayerView$a.class, "12")) {
          return;
       }
       Iterator iterator = this.a.mPreviewEventListenersMap.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().onEnd(p0);
       }
       return;
    }
    public void onEndNoFaceWarning(PreviewPlayer p0){
       k.d(this, p0);
    }
    public void onError(PreviewPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoSDKPlayerView$a.class, "10")) {
          return;
       }
       Iterator iterator = this.a.mPreviewEventListenersMap.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().onError(p0);
       }
       EditorSdk2$EditorSdkError error = p0.getError();
       if (error == null) {
          return;
       }
       this.a.logErrorStatPackageOpt(error);
       return;
    }
    public void onFrameRender(PreviewPlayer p0,double p1,long[] p2){
       Object[] this;
       if (PatchProxy.isSupport(VideoSDKPlayerView$a.class) && PatchProxy.applyVoidThreeRefs(p0, Double.valueOf(p1), p2, this, VideoSDKPlayerView$a.class, "2")) {
          return;
       }
       this = new Object[0];
       a.D().s(VideoSDKPlayerView.DEBUG_TAG, "player onFrameRender "+this.a, this);
       Iterator iterator = this.a.mPreviewEventListenersMap.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().onFrameRender(p0, p1, p2);
       }
       VideoSDKPlayerView mCoverImageV = this.a.mCoverImageView;
       if (mCoverImageV != null && (mCoverImageV.isShown() && this.a.mHideCoverWhenPlay != null)) {
          Object[] objArray = new Object[0];
          a.D().s(VideoSDKPlayerView.DEBUG_TAG, "hide cover", objArray);
          this.a.mCoverImageView.setVisibility(8);
       }
    label_007d :
       VideoSDKPlayerView$a ta = this.a;
       if (ta.mPreviewView != null && ta.mGLNeedResetMaskColor != null) {
          ta.mGLNeedResetMaskColor = false;
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
       Iterator iterator;
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoSDKPlayerView$a.class, "3")) {
          return;
       }
       this.a.mLoadedData = true;
       Object[] objArray = new Object[0];
       a.D().w(VideoSDKPlayerView.DEBUG_TAG, "player onLoadedData previewComputedWidth:"+a.s(this.a.getVideoProject())+",previewComputedHeight:"+a.r(this.a.getVideoProject())+",exportComputedWidth:"+d0.l(this.a.getVideoProject())+",exportComputedHeight:"+d0.j(this.a.getVideoProject()), objArray);
       PreviewPlayer mProject = p0.mProject;
       if (mProject != null) {
          try{
             this.a.mDisplayDuration = EditorSdk2UtilsV2.getDisplayDuration(mProject);
          }catch(java.lang.Exception e0){
             ExceptionHandler.handleCaughtException(e0);
          }
       }
    }
    public void onPassedData(PreviewPlayer p0,EditorSdk2$PreviewPassedData p1){
       k.g(this, p0, p1);
    }
    public void onPause(PreviewPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoSDKPlayerView$a.class, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w(VideoSDKPlayerView.DEBUG_TAG, "player onPause "+this.a, objArray);
       Iterator iterator = this.a.mPreviewEventListenersMap.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().onPause(p0);
       }
       return;
    }
    public void onPlay(PreviewPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoSDKPlayerView$a.class, "4")) {
          return;
       }
       this.a.mTemplateExceptionLogHelper.b();
       Object[] objArray = new Object[0];
       a.D().w(VideoSDKPlayerView.DEBUG_TAG, "player onPlay "+this.a, objArray);
       Iterator iterator = this.a.mPreviewEventListenersMap.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().onPlay(p0);
       }
       return;
    }
    public void onPlaying(PreviewPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoSDKPlayerView$a.class, "7")) {
          return;
       }
       Iterator iterator = this.a.mPreviewEventListenersMap.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().onPlaying(p0);
       }
       return;
    }
    public void onSeeked(PreviewPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoSDKPlayerView$a.class, "9")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w(VideoSDKPlayerView.DEBUG_TAG, "player onSeeked "+this.a, objArray);
       Iterator iterator = this.a.mPreviewEventListenersMap.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().onSeeked(p0);
       }
       return;
    }
    public void onSeeking(PreviewPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoSDKPlayerView$a.class, "8")) {
          return;
       }
       Iterator iterator = this.a.mPreviewEventListenersMap.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().onSeeking(p0);
       }
       return;
    }
    public void onSlideShowReady(PreviewPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoSDKPlayerView$a.class, "13")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s(VideoSDKPlayerView.DEBUG_TAG, "player onSlideShowReady "+this.a, objArray);
       VideoSDKPlayerView$a ta = this.a;
       if (ta.mLoading != null) {
          ta.mLoading = false;
          VideoSDKPlayerView mLatch = ta.mLatch;
          if (mLatch != null && mLatch.getCount() > 0) {
             this.a.mLatch.countDown();
          }
       }
       Iterator iterator = this.a.mPreviewEventListenersMap.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().onSlideShowReady(p0);
       }
       return;
    }
    public void onTimeUpdate(PreviewPlayer p0,double p1){
       VideoSDKPlayerView$a uoa = VideoSDKPlayerView$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Double.valueOf(p1), this, uoa, "11")) {
          return;
       }
       Iterator iterator = this.a.mPreviewEventListenersMap.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().onTimeUpdate(p0, p1);
       }
       return;
    }
    public void onTimeUpdateWithRenderPosDetail(PreviewPlayer p0,RenderPosDetail p1){
       Iterator iterator;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VideoSDKPlayerView$a.class, "1")) {
          return;
       }
       PreviewPlayer mProject = p0.mProject;
       if (mProject != null) {
          VideoSDKPlayerView$a ta = this.a;
          if (ta.mDisplayDuration <= 0) {
             try{
                ta.mDisplayDuration = EditorSdk2UtilsV2.getDisplayDuration(mProject);
             }catch(java.lang.Exception e0){
                ExceptionHandler.handleCaughtException(e0);
             }
          }
       }
    }
    public void onUpdatePCMData(byte[] p0,double p1,double p2){
       l.b(this, p0, p1, p2);
    }
    public void onWaiting(PreviewPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoSDKPlayerView$a.class, "6")) {
          return;
       }
       Iterator iterator = this.a.mPreviewEventListenersMap.values().iterator();
       while (iterator.hasNext()) {
          iterator.next().onWaiting(p0);
       }
       return;
    }
}
