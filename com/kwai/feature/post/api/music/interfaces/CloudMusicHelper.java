package com.kwai.feature.post.api.music.interfaces.CloudMusicHelper;
import com.kwai.video.player.IMediaPlayer$OnVideoSizeChangedListener;
import androidx.fragment.app.Fragment;
import io.reactivex.subjects.PublishSubject;
import com.kuaishou.android.model.music.Music;
import com.kwai.feature.post.api.music.interfaces.CloudMusicHelper$a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.post.api.music.interfaces.CloudMusicHelper$MusicState;
import android.view.Surface;

public interface abstract CloudMusicHelper	// class@00141a
{

    void a(IMediaPlayer$OnVideoSizeChangedListener p0);
    void c(IMediaPlayer$OnVideoSizeChangedListener p0);
    void d(Fragment p0);
    PublishSubject e();
    Music f();
    void g(CloudMusicHelper$a p0);
    long getDuration();
    QPhoto h();
    long i(int p0);
    boolean isPlaying();
    CloudMusicHelper$MusicState j(int p0);
    boolean k(QPhoto p0,Music p1);
    boolean l(Music p0,boolean p1);
    long m(int p0);
    void n(CloudMusicHelper$a p0);
    void pause();
    void release();
    void reset();
    void setSurface(Surface p0);
    void start();
    void stop();
}
