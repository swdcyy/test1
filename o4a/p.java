package o4a.p;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.yxcorp.gifshow.detail.plc.presenter.PlcEntryLoggerImplPresenter;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.util.Objects;
import i4a.e;

public final class p implements IMediaPlayer$OnInfoListener	// class@003290
{
    public final PlcEntryLoggerImplPresenter b;

    public void p(PlcEntryLoggerImplPresenter p0){
       this.b = p0;
    }
    public final boolean onInfo(IMediaPlayer p0,int p1,int p2){
       p tb = this.b;
       Objects.requireNonNull(tb);
       if (p1 == 0x2775) {
          PlcEntryLoggerImplPresenter y = tb.y;
          if (y != null && y instanceof e) {
             y.o();
          }
       }
       return false;
    }
}
