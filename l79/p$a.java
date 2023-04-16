package l79.p$a;
import java.lang.Runnable;
import l79.p;
import android.graphics.Bitmap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ga9.b;
import ia9.d;
import com.yxcorp.gifshow.album.viewbinder.AbsSelectedItemViewBinder;
import com.yxcorp.gifshow.album.imageloader.CompatImageView;
import l79.o;

public final class p$a implements Runnable	// class@002ccc
{
    public final float b;
    public final p c;
    public final Bitmap d;

    public void p$a(float p0,p p1,Bitmap p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, p$a.class, "1")) {
          return;
       }
       CompatImageView uCompatImage = this.c.c.b().n();
       if (uCompatImage != null) {
          uCompatImage.q0(this.c.c.d, this.b);
       }
       PatchProxy.onMethodExit(p$a.class, "1");
       return;
    }
}
