package com.yxcorp.gifshow.designercreation.widget.VideoPlayerView$b;
import ub.b;
import com.yxcorp.gifshow.designercreation.widget.VideoPlayerView;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.Animatable;
import bd.f;

public final class VideoPlayerView$b implements b	// class@00131d
{
    public final VideoPlayerView a;

    public void VideoPlayerView$b(VideoPlayerView p0){
       this.a = p0;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VideoPlayerView$b.class, "2")) {
          return;
       }
       this.a.c(true);
       return;
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, VideoPlayerView$b.class, "1")) {
       }else {
          this.a.c(false);
       }
       return;
    }
    public void onIntermediateImageFailed(String p0,Throwable p1){
    }
    public void onIntermediateImageSet(String p0,Object p1){
    }
    public void onRelease(String p0){
    }
    public void onSubmit(String p0,Object p1){
    }
}
