package b4d.v0$f;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import b4d.v0;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Runnable;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import m0d.l;
import android.graphics.Bitmap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import b4d.y0;
import android.widget.ImageView;
import b4d.z0;

public class v0$f implements ImageCallback	// class@000399
{
    public final KwaiImageView b;
    public final Runnable c;
    public final CDNUrl[] d;
    public final v0 e;

    public void v0$f(v0 p0,KwaiImageView p1,Runnable p2,CDNUrl[] p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void onCompleted(Drawable p0){
       l.a(this, p0);
    }
    public void onCompletedBitmap(Bitmap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v0$f.class, "1")) {
          return;
       }
       if (p0 != null) {
          v0$f tb = this.b;
          tb.post(new y0(this, tb, p0, this.c));
       }else {
          v0$f tb1 = this.b;
          tb1.post(new z0(this, tb1, this.d, this.c));
       }
       return;
    }
    public void onProgress(float p0){
       l.c(this, p0);
    }
}
