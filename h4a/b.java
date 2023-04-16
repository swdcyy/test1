package h4a.b;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.yxcorp.gifshow.detail.plc.mix.PLCLogHelper;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.util.Objects;
import i4a.e;

public final class b implements IMediaPlayer$OnInfoListener	// class@00255d
{
    public final PLCLogHelper b;

    public void b(PLCLogHelper p0){
       this.b = p0;
    }
    public final boolean onInfo(IMediaPlayer p0,int p1,int p2){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (p1 == 0x2775) {
          PLCLogHelper k = tb.k;
          if (k != null && k instanceof e) {
             k.o();
          }
       }
       return false;
    }
}
