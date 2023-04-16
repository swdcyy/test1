package jy9.a;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import jy9.d;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.util.Objects;

public final class a implements IMediaPlayer$OnInfoListener	// class@002b81
{
    public final d b;

    public void a(d p0){
       this.b = p0;
    }
    public final boolean onInfo(IMediaPlayer p0,int p1,int p2){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (p1 == 0x2775) {
          tb.p0();
       }
       return false;
    }
}
