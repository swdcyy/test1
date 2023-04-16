package ki9.a;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.widget.AnimCameraView;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.camera.record.widget.AnimCameraView$a;
import java.lang.Object;
import x8c.a;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.System;
import q87.c;
import android.widget.FrameLayout;
import android.widget.ImageView;

public final class a implements Runnable	// class@002c8e
{
    public final AnimCameraView b;
    public final int c;
    public final long d;
    public final Bitmap e;
    public final AnimCameraView$a f;

    public void a(AnimCameraView p0,int p1,long p2,Bitmap p3,AnimCameraView$a p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void run(){
       a tb = this.b;
       a td = this.d;
       a te = this.e;
       a tf = this.f;
       if (this.c == tb.f) {
          Object[] objArray = new Object[0];
          a.D().w("AnimCameraView", "blurBitmap success, total cost "+(System.currentTimeMillis() - td)+" , blurBitmap: "+te, objArray);
          if (te != null) {
             tb.d.setVisibility(0);
             tb.e.setImageBitmap(te);
          }
          if (tf != null) {
             tf.a();
          }
       }else {
          Object[] objArray1 = new Object[0];
          a.D().w("AnimCameraView", "commandId changed", objArray1);
       }
       return;
    }
}
