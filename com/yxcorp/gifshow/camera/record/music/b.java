package com.yxcorp.gifshow.camera.record.music.b;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import j8c.a;
import java.lang.String;
import q87.c;

public final class b implements IMediaPlayer$OnPreparedListener	// class@000e6e
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void onPrepared(IMediaPlayer p0){
       Object[] objArray = new Object[0];
       a.D().w("Record_KwaiAudioPlayer", "onPrepared", objArray);
    }
}
