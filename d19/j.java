package d19.j;
import sd5.h;
import com.yxcorp.gifshow.ad.detail.presenter.player.i;
import java.lang.Object;
import android.graphics.Bitmap;
import com.kwai.feature.api.feed.detail.router.DetailPlayConfig;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.lang.String;
import com.kwai.framework.player.ui.impl.PlayerKitContentFrame;

public final class j implements h	// class@002030
{
    public final i a;

    public void j(i p0){
       this.a = p0;
    }
    public final Bitmap a(){
       Bitmap uBitmap;
       j ta = this.a;
       if (ta.s.getDetailPlayConfig().isSharePlayer()) {
          ta.P8("provide bitmap for share");
          uBitmap = ta.p.C();
       }else {
          uBitmap = null;
       }
       return uBitmap;
    }
}
