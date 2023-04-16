package dca.g;
import erd.g;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import java.lang.Object;
import android.graphics.Bitmap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import com.yxcorp.gifshow.image.KwaiImageView;
import kotlin.jvm.internal.a;
import android.widget.ImageView;

public final class g implements g	// class@001ef3
{
    public final VideoSDKPlayerView b;

    public void g(VideoSDKPlayerView p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          a.D().w("AICutStyleLoadingViewBinder", "releasePlayer: get frame bitmap", objArray);
          KwaiImageView coverView = this.b.getCoverView();
          a.o(coverView, "previewPlayer.coverView");
          coverView.setVisibility(0);
          this.b.getCoverView().setImageBitmap(p0);
       }
       return;
    }
}
