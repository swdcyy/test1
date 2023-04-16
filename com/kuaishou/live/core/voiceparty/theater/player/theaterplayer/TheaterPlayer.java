package com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.TheaterPlayer;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.video.waynelive.quality.LiveQualityItem;
import msd.l;
import msd.p;
import java.util.List;
import android.graphics.Point;
import yw2.k;
import java.lang.String;
import ht.c;

public interface abstract TheaterPlayer	// class@0019c5
{

    IKwaiMediaPlayer a();
    void b(LiveQualityItem p0);
    void c(float p0);
    void d(l p0);
    void e();
    void f(p p0);
    boolean g();
    long getCurrentPosition();
    long getDuration();
    List getQualityList();
    Point getVideoSize();
    void h(k p0);
    boolean i();
    void j(boolean p0);
    void k(long p0);
    void l();
    void m(l p0);
    void n(l p0);
    LiveQualityItem o();
    c p(String p0);
    void pause();
    void q();
    boolean r();
    void release();
    void resume();
    void seekTo(long p0);
    void stop();
}
