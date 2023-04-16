package com.kwai.library.kwaiplayerkit.domain.play.ui.impl.DefaultFrameViewModel$a;
import sc6.g;
import java.lang.Object;
import sc6.f;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import java.lang.String;
import kotlin.jvm.internal.a;
import sc6.g$a;
import android.view.Surface;
import android.graphics.SurfaceTexture;

public final class DefaultFrameViewModel$a implements g	// class@00085f
{

    public void DefaultFrameViewModel$a(){
       super();
    }
    public boolean a(){
       return f.b(this);
    }
    public void addOnInfoListener(IMediaPlayer$OnInfoListener p0){
       a.p(p0, "listener");
    }
    public void b(g$a p0){
       a.p(p0, "listener");
    }
    public String c(){
       return f.a(this);
    }
    public void enableMediacodecDummy(boolean p0){
    }
    public Surface getSurface(){
       return null;
    }
    public boolean isBuffering(){
       return false;
    }
    public boolean isPaused(){
       return false;
    }
    public boolean isPlaying(){
       return false;
    }
    public boolean isVideoRenderingStart(){
       return false;
    }
    public void removeOnInfoListener(IMediaPlayer$OnInfoListener p0){
       a.p(p0, "listener");
    }
    public void setSurface(Surface p0){
       a.p(p0, "surface");
    }
    public void setSurfaceTexture(SurfaceTexture p0){
       a.p(p0, "surfaceTexture");
    }
    public void setViewSize(int p0,int p1){
       f.c(this, p0, p1);
    }
    public void stepFrame(){
    }
}
