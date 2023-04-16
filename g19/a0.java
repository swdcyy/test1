package g19.a0;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.yxcorp.gifshow.ad.detail.presenter.side.SlidePlayAutoPlayNextPresenter;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.util.Objects;
import tkd.b;
import tkd.d;
import cm5.a;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import cm5.c;

public final class a0 implements IMediaPlayer$OnInfoListener	// class@0023ac
{
    public final SlidePlayAutoPlayNextPresenter b;

    public void a0(SlidePlayAutoPlayNextPresenter p0){
       this.b = p0;
    }
    public final boolean onInfo(IMediaPlayer p0,int p1,int p2){
       a0 tb = this.b;
       Objects.requireNonNull(tb);
       if (p1 == 0x2775) {
          d.a(0x5f78d73).Mp(tb.x.getPhotoId());
          if (tb.b9() && tb.R == null) {
             tb.Y = true;
             tb.d9();
          }
       }
       return false;
    }
}
