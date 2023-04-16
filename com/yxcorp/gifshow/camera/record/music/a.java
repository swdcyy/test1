package com.yxcorp.gifshow.camera.record.music.a;
import com.kwai.video.player.IMediaPlayer$OnErrorListener;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import j8c.a;
import java.lang.StringBuilder;
import java.lang.String;
import w46.b;

public final class a implements IMediaPlayer$OnErrorListener	// class@000e6d
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final boolean onError(IMediaPlayer p0,int p1,int p2){
       Object[] objArray = new Object[0];
       a.D().t("Record_KwaiAudioPlayer", "onError what:"+p1+" extra:"+p2, objArray);
       return 0;
    }
}
