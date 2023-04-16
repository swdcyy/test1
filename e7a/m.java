package e7a.m;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.yxcorp.gifshow.detail.slideplay.presenter.c;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.util.Objects;
import java.lang.String;

public final class m implements IMediaPlayer$OnInfoListener	// class@00208f
{
    public final c b;

    public void m(c p0){
       this.b = p0;
    }
    public final boolean onInfo(IMediaPlayer p0,int p1,int p2){
       m tb = this.b;
       Objects.requireNonNull(tb);
       if (p1 != 701) {
       }else {
          tb.P8("buffering", null);
       }
       return false;
    }
}
