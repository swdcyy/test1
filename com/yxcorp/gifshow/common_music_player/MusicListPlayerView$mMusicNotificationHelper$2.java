package com.yxcorp.gifshow.common_music_player.MusicListPlayerView$mMusicNotificationHelper$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.common_music_player.notification.MusicNotificationHelper;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MusicListPlayerView$mMusicNotificationHelper$2 extends Lambda implements a	// class@001189
{
    public static final MusicListPlayerView$mMusicNotificationHelper$2 INSTANCE;

    static {
       MusicListPlayerView$mMusicNotificationHelper$2.INSTANCE = new MusicListPlayerView$mMusicNotificationHelper$2();
    }
    public void MusicListPlayerView$mMusicNotificationHelper$2(){
       super(0);
    }
    public final MusicNotificationHelper invoke(){
       Object obj = PatchProxy.apply(null, this, MusicListPlayerView$mMusicNotificationHelper$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new MusicNotificationHelper();
    }
    public Object invoke(){
       return this.invoke();
    }
}
