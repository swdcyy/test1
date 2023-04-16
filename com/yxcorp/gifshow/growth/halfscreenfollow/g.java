package com.yxcorp.gifshow.growth.halfscreenfollow.g;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import tna.k;

public final class g implements IMediaPlayer$OnInfoListener	// class@00138d
{
    public static final g b;

    static {
       g.b = new g();
    }
    public void g(){
       super();
    }
    public final boolean onInfo(IMediaPlayer p0,int p1,int p2){
       if (p1 == 0x2775) {
          k.a();
       }
       return false;
    }
}
