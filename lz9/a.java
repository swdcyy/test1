package lz9.a;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import lz9.b0;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;

public final class a implements IMediaPlayer$OnInfoListener	// class@002eca
{
    public final b0 b;

    public void a(b0 p0){
       this.b = p0;
    }
    public final boolean onInfo(IMediaPlayer p0,int p1,int p2){
       b0.n0(this.b, p0, p1, p2);
       return false;
    }
}
