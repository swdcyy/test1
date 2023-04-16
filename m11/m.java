package m11.m;
import com.kwai.video.player.IMediaPlayer$OnVideoSizeChangedListener;
import m11.p;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.util.Objects;
import m11.o;
import java.lang.String;
import java.lang.Runnable;
import e93.f;

public final class m implements IMediaPlayer$OnVideoSizeChangedListener	// class@003106
{
    public final p b;

    public void m(p p0){
       this.b = p0;
    }
    public final void onVideoSizeChanged(IMediaPlayer p0,int p1,int p2,int p3,int p4){
       m tb = this.b;
       Objects.requireNonNull(tb);
       f.i("OnVideoSizeChangedListener.handleLiveStreamTypeChanged", new o(tb), tb);
    }
}
