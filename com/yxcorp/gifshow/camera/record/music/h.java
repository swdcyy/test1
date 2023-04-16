package com.yxcorp.gifshow.camera.record.music.h;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import j8c.a;
import java.lang.String;
import java.lang.Throwable;
import w46.b;

public final class h implements IMediaPlayer$OnPreparedListener	// class@000e80
{
    public static final h b;

    static {
       h.b = new h();
    }
    public void h(){
       super();
    }
    public final void onPrepared(IMediaPlayer p0){
       try{
          p0.pause();
          p0.setVolume(0x3f800000, 0x3f800000);
       }catch(java.lang.IllegalStateException e4){
          a.D().e("MusicPreviewController", "pause fail", e4);
       }
       return;
    }
}
