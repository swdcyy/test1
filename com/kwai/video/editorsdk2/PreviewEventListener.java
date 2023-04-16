package com.kwai.video.editorsdk2.PreviewEventListener;
import com.kwai.video.editorsdk2.PreviewPlayer;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$AnimatedSubAssetRenderData;
import android.graphics.Bitmap;
import java.lang.String;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$PreviewPassedData;

public interface abstract PreviewEventListener	// class@001c79
{

    void onAnimatedSubAssetsRender(PreviewPlayer p0,double p1,EditorSdk2$AnimatedSubAssetRenderData[] p2);
    void onAttached(PreviewPlayer p0);
    void onDetached(PreviewPlayer p0);
    void onEnd(PreviewPlayer p0);
    void onEndNoFaceWarning(PreviewPlayer p0);
    void onError(PreviewPlayer p0);
    void onFrameRender(PreviewPlayer p0,double p1,long[] p2);
    void onHasDumpedFrame(Bitmap p0,int p1,String p2,long p3);
    void onHasNoFaceWarning(PreviewPlayer p0);
    void onLoadedData(PreviewPlayer p0);
    void onPassedData(PreviewPlayer p0,EditorSdk2$PreviewPassedData p1);
    void onPause(PreviewPlayer p0);
    void onPlay(PreviewPlayer p0);
    void onPlaying(PreviewPlayer p0);
    void onSeeked(PreviewPlayer p0);
    void onSeeking(PreviewPlayer p0);
    void onSlideShowReady(PreviewPlayer p0);
    void onTimeUpdate(PreviewPlayer p0,double p1);
    void onWaiting(PreviewPlayer p0);
}
