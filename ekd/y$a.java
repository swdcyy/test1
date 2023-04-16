package ekd.y$a;
import java.lang.Runnable;
import ekd.y;
import java.lang.Object;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import ekd.y$a$a;
import android.os.Handler;

public class y$a implements Runnable	// class@000d86
{
    public final y b;

    public void y$a(y p0){
       this.b = p0;
       super();
    }
    public void run(){
       Bitmap uBitmap = this.b.a();
       if (uBitmap != null) {
          this.b.a = new BitmapDrawable(uBitmap);
          y$a tb = this.b;
          tb.a.setBounds(tb.getBounds());
          if (uBitmap.getWidth() > 1) {
             this.b.b.post(new y$a$a(this));
          }
       }
       return;
    }
}
