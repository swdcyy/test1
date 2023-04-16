package com.yxcorp.gifshow.growth.halfscreenfollow.h;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import tna.k;

public final class h implements IMediaPlayer$OnInfoListener	// class@00138e
{
    public static final h b;

    static {
       h.b = new h();
    }
    public void h(){
       super();
    }
    public final boolean onInfo(IMediaPlayer p0,int p1,int p2){
       if (p1 == 0x2775) {
          k.a();
       }
       return false;
    }
}
