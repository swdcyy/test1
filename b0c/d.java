package b0c.d;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import b0c.e;
import brd.v;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.g;
import android.graphics.Bitmap;
import m0d.l;

public class d implements ImageCallback	// class@000381
{
    public final v b;
    public final e c;

    public void d(e p0,v p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onCompleted(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       int i = 0;
       if (p0 != null) {
          Drawable[] uDrawableArr = new Drawable[]{p0};
          this.b.onNext(uDrawableArr);
       }else {
          Drawable[] uDrawableArr1 = new Drawable[i];
          this.b.onNext(uDrawableArr1);
       }
       this.b.onComplete();
       return;
    }
    public void onCompletedBitmap(Bitmap p0){
       l.b(this, p0);
    }
    public void onProgress(float p0){
       l.c(this, p0);
    }
}
