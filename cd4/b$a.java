package cd4.b$a;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Bitmap;
import m0d.l;

public class b$a implements ImageCallback	// class@0004f6
{
    public final ImageCallback b;

    public void b$a(ImageCallback p0){
       this.b = p0;
       super();
    }
    public void onCompleted(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       if (p0 != null && p0.getIntrinsicHeight()) {
          this.b.onCompleted(p0);
       }
       return;
    }
    public void onCompletedBitmap(Bitmap p0){
       l.b(this, p0);
    }
    public void onProgress(float p0){
       l.c(this, p0);
    }
}
