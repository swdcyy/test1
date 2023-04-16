package fz1.b$a;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import va1.r0;
import com.yxcorp.gifshow.util.rx.RxBus;
import ne1.k$a;
import android.graphics.Bitmap;
import m0d.l;

public class b$a implements ImageCallback	// class@0023ed
{
    public final String b;

    public void b$a(String p0){
       this.b = p0;
       super();
    }
    public void onCompleted(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       if (p0 != null) {
          r0.b((this.b).hashCode(), p0);
          RxBus.f.b(new k$a());
       }
       return;
    }
    public void onCompletedBitmap(Bitmap p0){
       l.b(this, p0);
    }
    public void onProgress(float p0){
    }
}
