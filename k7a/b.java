package k7a.b;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import k7a.d;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.util.Objects;
import uw9.o;
import java.lang.StringBuilder;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import q87.c;

public final class b implements IMediaPlayer$OnInfoListener	// class@002c07
{
    public final d b;

    public void b(d p0){
       this.b = p0;
    }
    public final boolean onInfo(IMediaPlayer p0,int p1,int p2){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (p1 != 3) {
       }else {
          Object[] objArray = new Object[false];
          o.C().t("SlidePreloadEmitter", "first frame ready "+tb.p.getUserName(), objArray);
          tb.D = true;
       }
       return false;
    }
}
