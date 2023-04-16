package fx9.a;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import fx9.b;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.util.Objects;

public final class a implements IMediaPlayer$OnInfoListener	// class@002363
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final boolean onInfo(IMediaPlayer p0,int p1,int p2){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (p1 != 0x2775) {
       }else {
          tb.s = tb.s + 1;
       }
       return false;
    }
}
