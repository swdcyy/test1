package hg9.r;
import p65.g;
import com.yxcorp.gifshow.camera.record.photo.h$a;
import java.lang.Object;
import android.graphics.Bitmap;
import java.util.Objects;
import x8c.a;
import java.lang.String;
import q87.c;
import va9.a;
import java.util.concurrent.Semaphore;
import com.yxcorp.gifshow.camera.record.photo.h;
import com.yxcorp.gifshow.camerasdk.TakePictureSource;
import com.yxcorp.gifshow.camerasdk.q;
import java.lang.ref.WeakReference;
import k2b.e0;
import o56.c;
import o56.a;
import android.app.Application;
import java.io.File;
import android.content.Context;
import hg9.s;
import java.lang.StringBuilder;

public final class r implements g	// class@002674
{
    public final h$a a;

    public void r(h$a p0){
       this.a = p0;
    }
    public final void b(Bitmap p0){
       r ta = this.a;
       Objects.requireNonNull(ta);
       String str = "[photo]";
       int i = 2;
       int i1 = 1;
       if (p0 != null) {
          Object[] objArray = new Object[0];
          String str1 = "capture bitmap getted";
          a.D().w("PictureCapture", str1, objArray);
          Object[] objArray1 = new Object[i];
          objArray1[0] = str;
          objArray1[i1] = str1;
          a.b(objArray1);
          ta.C = p0;
          ta.A = i1;
          ta.p.release();
          h$a y = ta.y;
          if (y != null) {
             h$a d = ta.D;
             int i2 = s.b("post_camera_burst", p0, y, d.b, d.c, ta.t, ta.q.U(ta.w), ta.z.get(), a.a().a());
             if (i2) {
                i1 = false;
             }
             ta.A = i1;
             Object[] objArray2 = new Object[0];
             a.D().w("PictureCapture", "capture picture saved:"+ta.A, objArray2);
             if (ta.A == null) {
                ta.B = i2;
                if (ta.y.exists()) {
                   ta.y.delete();
                }
             }
          }
       }else {
          ta.B = i;
          Object[] objArray3 = new Object[i1];
          objArray3[0] = str;
          a.a("capture get null", objArray3);
          ta.p.release();
       }
       ta.p.release();
       return;
    }
}
