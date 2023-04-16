package clc.e;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import clc.f;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import com.yxcorp.gifshow.entity.QPhoto;
import e1a.p;
import p5a.e;
import de5.a;
import com.kwai.framework.player.core.b;

public final class e implements IMediaPlayer$OnPreparedListener	// class@0005cb
{
    public final f b;

    public void e(f p0){
       this.b = p0;
    }
    public final void onPrepared(IMediaPlayer p0){
       e tb = this.b;
       long l = p.b(tb.p);
       if (l > 0) {
          tb.q.getPlayer().seekTo(l);
       }
       return;
    }
}
