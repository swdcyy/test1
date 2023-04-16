package o4a.h;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.yxcorp.gifshow.detail.plc.presenter.b;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.util.Objects;

public final class h implements IMediaPlayer$OnInfoListener	// class@003288
{
    public final b b;

    public void h(b p0){
       this.b = p0;
    }
    public final boolean onInfo(IMediaPlayer p0,int p1,int p2){
       h tb = this.b;
       Objects.requireNonNull(tb);
       if (p1 == 0x2775) {
          tb.S = tb.S + 1;
       }
       return false;
    }
}
