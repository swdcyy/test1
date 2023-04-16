package d19.g;
import erd.g;
import com.yxcorp.gifshow.ad.detail.presenter.player.f;
import java.lang.Object;
import rd5.i;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.ad.detail.presenter.player.b;

public final class g implements g	// class@00202d
{
    public final f b;

    public void g(f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, f.class, "7")) {
       }else {
          i a = p0.a;
          if (a != null) {
             tb.x.setImageBitmap(a);
          }else if(p0.b != null){
             tb.V8(tb.P8(), p0.b, false);
          }
       }
       return;
    }
}
