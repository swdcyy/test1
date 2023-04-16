package mx9.a;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import mx9.f;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.util.Objects;

public final class a implements IMediaPlayer$OnInfoListener	// class@00308d
{
    public final f b;

    public void a(f p0){
       this.b = p0;
    }
    public final boolean onInfo(IMediaPlayer p0,int p1,int p2){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (p1 == 0x2775) {
          tb.b();
       }
       return false;
    }
}
