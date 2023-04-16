package g19.b0;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.yxcorp.gifshow.ad.detail.presenter.side.SlidePlayAutoPlayNextPresenter;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;

public final class b0 implements IMediaPlayer$OnPreparedListener	// class@0023ae
{
    public final SlidePlayAutoPlayNextPresenter b;

    public void b0(SlidePlayAutoPlayNextPresenter p0){
       this.b = p0;
    }
    public final void onPrepared(IMediaPlayer p0){
       b0 tb = this.b;
       if (tb.b9()) {
          tb.d9();
       }
       return;
    }
}
