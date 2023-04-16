package dk.madslee.imageCapInsets.RCTImageCapInsetView$a;
import wpd.a;
import dk.madslee.imageCapInsets.RCTImageCapInsetView;
import vpd.a;
import java.lang.String;
import java.lang.Object;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.content.res.Resources;
import android.widget.ImageView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import android.graphics.drawable.NinePatchDrawable;
import android.graphics.drawable.Drawable;
import java.util.HashMap;

public class RCTImageCapInsetView$a implements a	// class@000cce
{
    public final a a;
    public final String b;
    public final RCTImageCapInsetView c;

    public void RCTImageCapInsetView$a(RCTImageCapInsetView p0,a p1,String p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(Bitmap p0){
       if (p0 == null) {
          return;
       }
       RCTImageCapInsetView$a tc = this.c;
       RCTImageCapInsetView$a tc1 = this.c;
       RCTImageCapInsetView$a tc2 = this.c;
       tc2 = this.c;
       ByteBuffer uByteBuffer = ByteBuffer.allocate(84).order(ByteOrder.nativeOrder());
       uByteBuffer.put(1);
       uByteBuffer.put(2);
       uByteBuffer.put(2);
       uByteBuffer.put(9);
       uByteBuffer.putInt(0);
       uByteBuffer.putInt(0);
       uByteBuffer.putInt(0);
       uByteBuffer.putInt(0);
       uByteBuffer.putInt(0);
       uByteBuffer.putInt(0);
       uByteBuffer.putInt(0);
       uByteBuffer.putInt(tc2.a((float)tc2.b.left));
       uByteBuffer.putInt((p0.getWidth() - tc1.a((float)tc1.b.right)));
       uByteBuffer.putInt(tc.a((float)tc.b.top));
       uByteBuffer.putInt((p0.getHeight() - tc2.a((float)tc2.b.bottom)));
       uByteBuffer.putInt(1);
       uByteBuffer.putInt(1);
       uByteBuffer.putInt(1);
       uByteBuffer.putInt(1);
       uByteBuffer.putInt(1);
       uByteBuffer.putInt(1);
       uByteBuffer.putInt(1);
       uByteBuffer.putInt(1);
       uByteBuffer.putInt(1);
       NinePatchDrawable ninePatchDra = new NinePatchDrawable(this.c.getResources(), p0, uByteBuffer.array(), new Rect(), null);
       this.c.setBackground(tc);
       this.a.a.put(this.b, tc);
       return;
    }
}
