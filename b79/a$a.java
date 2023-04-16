package b79.a$a;
import java.lang.Runnable;
import b79.a;
import android.graphics.Bitmap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumAssetItemViewBinder;
import b79.c;
import com.yxcorp.gifshow.album.imageloader.CompatImageView;

public final class a$a implements Runnable	// class@00037b
{
    public final float b;
    public final a c;
    public final Bitmap d;
    public final long e;

    public void a$a(float p0,a p1,Bitmap p2,long p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, a$a.class, "1")) {
          return;
       }
       CompatImageView uCompatImage = this.c.c.e().p();
       if (uCompatImage != null) {
          uCompatImage.q0(this.c.c.i, this.b);
       }
       PatchProxy.onMethodExit(a$a.class, "1");
       return;
    }
}
