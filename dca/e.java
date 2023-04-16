package dca.e;
import java.util.concurrent.Callable;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.graphics.Bitmap;

public final class e implements Callable	// class@001ef1
{
    public final VideoSDKPlayerView b;

    public void e(VideoSDKPlayerView p0){
       this.b = p0;
       super();
    }
    public Object call(){
       Bitmap uBitmap = PatchProxy.apply(null, this, e.class, "1");
       if (uBitmap != PatchProxyResult.class) {
       }else {
          for (uBitmap = this.b.dumpNextFrame(); uBitmap == null; uBitmap = this.b.dumpNextFrame()) {
          }
       }
       return uBitmap;
    }
}
