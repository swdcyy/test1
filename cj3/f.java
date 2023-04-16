package cj3.f;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import com.kuaishou.live.playback.playmodule.log.LivePlaybackPhotoLogger;
import cj3.b;

public interface abstract f	// class@000574
{

    void a(QPhoto p0);
    void b();
    void c(String p0);
    void d(LivePlaybackPhotoLogger p0);
    void e(QPhoto p0,long p1);
    b getPlayer();
    void release();
}
