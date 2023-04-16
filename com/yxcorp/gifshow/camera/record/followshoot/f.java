package com.yxcorp.gifshow.camera.record.followshoot.f;
import com.yxcorp.gifshow.camera.record.followshoot.f$f;
import com.yxcorp.gifshow.camera.record.followshoot.f$e;
import com.yxcorp.gifshow.camera.record.followshoot.f$c;
import com.yxcorp.gifshow.camera.record.followshoot.f$a;
import com.yxcorp.gifshow.camera.record.followshoot.f$d;
import com.yxcorp.gifshow.camera.record.followshoot.f$g;
import com.yxcorp.gifshow.camera.record.followshoot.f$b;
import com.kwai.video.player.MediaInfo;
import android.view.Surface;

public interface abstract f	// class@000dd3
{

    void a(f$f p0);
    void b(f$e p0);
    void c(f$c p0);
    void d(f$a p0);
    void e(f$d p0);
    void f(f$g p0);
    void g(f$b p0);
    long getCurrentPosition();
    long getDuration();
    MediaInfo getMediaInfo();
    Surface getSurface();
    int getVideoHeight();
    int getVideoWidth();
    boolean isPlaying();
    void pause();
    void prepareAsync();
    void release();
    void reset();
    void seekTo(long p0);
    void setSpeed(float p0);
    void setSurface(Surface p0);
    void setVolume(float p0,float p1);
    void start();
}
