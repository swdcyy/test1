package go2.l$a;
import java.lang.Object;
import nsd.u;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.widget.ImageView;
import android.graphics.Rect;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import android.graphics.drawable.BitmapDrawable;
import android.content.res.Resources;
import xb.t$b;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Integer;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public final class l$a	// class@002b64
{

    public void l$a(){
       super();
    }
    public void l$a(u p0){
       super();
    }
    public final void a(KwaiImageView p0,float p1,Drawable p2){
       float f1;
       if (PatchProxy.isSupport(l$a.class) && PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(p1), p2, this, l$a.class, "1")) {
          return;
       }
       a.p(p0, "kwaiImageView");
       Drawable drawable = p0.getDrawable();
       if (drawable != null) {
          Rect bounds = drawable.getBounds();
          a.o(bounds, "drawable.bounds");
          int i = bounds.width();
          int i1 = bounds.height();
          if (i > 0 && i1 > 0) {
             float f = 0x3f800000;
             if (i < i1) {
                f1 = (float)i1;
                if (f1 - p1 > 0) {
                   i1 = (int)p1;
                   f = p1 / f1;
                   i = (int)((float)i * f);
                }
             }else {
                f1 = (float)i;
                if (f1 - p1 > 0) {
                   i = (int)p1;
                   f = p1 / f1;
                   i1 = (int)((float)i1 * f);
                }
             }
             Bitmap uBitmap = Bitmap.createBitmap(i, i1, Bitmap$Config.RGB_565);
             Canvas uCanvas = new Canvas(uBitmap);
             Matrix matrix = new Matrix();
             matrix.setScale(f, f);
             uCanvas.setMatrix(matrix);
             drawable.draw(uCanvas);
             a hierarchy = p0.getHierarchy();
             if (hierarchy != null) {
                hierarchy.G(new BitmapDrawable(p0.getResources(), uBitmap), t$b.i);
             }
             b.d0(LiveLogTag.LIVE_VOICE_PARTY, "setPlaceHolderBeforeBindUrl", "w", Integer.valueOf(i), "h", Integer.valueOf(i1));
          }else {
             p0.setPlaceHolderImage(p2);
          }
       }else {
          p0.setPlaceHolderImage(p2);
       }
       return;
    }
}
