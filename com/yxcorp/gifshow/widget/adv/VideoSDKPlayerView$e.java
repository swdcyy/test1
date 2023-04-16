package com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView$e;
import com.kwai.video.editorsdk2.PreviewEventListenerV2;
import java.lang.Object;
import com.kwai.video.editorsdk2.PreviewPlayer;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$AnimatedSubAssetRenderData;
import com.kwai.video.editorsdk2.PreviewEventListener;
import jv7.k;
import android.graphics.Bitmap;
import java.lang.String;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$PreviewPassedData;
import com.kwai.video.editorsdk2.RenderPosDetail;
import jv7.l;

public abstract class VideoSDKPlayerView$e implements PreviewEventListenerV2	// class@001916
{

    public void VideoSDKPlayerView$e(){
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
    }
    public void onEndNoFaceWarning(PreviewPlayer p0){
       k.d(this, p0);
    }
    public void onError(PreviewPlayer p0){
    }
    public void onFrameRender(PreviewPlayer p0,double p1,long[] p2){
    }
    public void onHasDumpedFrame(Bitmap p0,int p1,String p2,long p3){
       k.e(this, p0, p1, p2, p3);
    }
    public void onHasNoFaceWarning(PreviewPlayer p0){
       k.f(this, p0);
    }
    public void onLoadedData(PreviewPlayer p0){
    }
    public void onPassedData(PreviewPlayer p0,EditorSdk2$PreviewPassedData p1){
       k.g(this, p0, p1);
    }
    public void onPause(PreviewPlayer p0){
    }
    public void onPlay(PreviewPlayer p0){
    }
    public void onPlaying(PreviewPlayer p0){
    }
    public void onSeeked(PreviewPlayer p0){
    }
    public void onSeeking(PreviewPlayer p0){
    }
    public void onSlideShowReady(PreviewPlayer p0){
    }
    public void onTimeUpdate(PreviewPlayer p0,double p1){
    }
    public void onTimeUpdateWithRenderPosDetail(PreviewPlayer p0,RenderPosDetail p1){
    }
    public void onUpdatePCMData(byte[] p0,double p1,double p2){
       l.b(this, p0, p1, p2);
    }
    public void onWaiting(PreviewPlayer p0){
    }
}
