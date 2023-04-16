package ii9.a0;
import java.lang.Runnable;
import ii9.v$e;
import android.graphics.Bitmap;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.base.d;
import androidx.fragment.app.Fragment;
import ii9.v;
import com.yxcorp.gifshow.camerasdk.q;
import com.yxcorp.gifshow.camera.record.widget.RecordSwitchCameraView;
import eg9.a;
import com.yxcorp.gifshow.camera.record.base.b;

public final class a0 implements Runnable	// class@00282d
{
    public final v$e b;
    public final boolean c;
    public final Bitmap d;

    public void a0(v$e p0,boolean p1,Bitmap p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       a0 tb = this.b;
       a0 td = this.d;
       if (this.c != null) {
          v$e c = tb.c;
          if (c.h != null && c.f.isAdded()) {
             c = tb.c;
             c.E = td;
             if (c.k2()) {
                c = tb.c;
                if (c.x != null) {
                   c.h.d1();
                   tb.c.x.b();
                   tb.c.d.m(new a(true));
                }
             }
             tb.c.g2();
          }
       }else {
          v$e c1 = tb.c;
          c1.F = td;
          c1.g2();
       }
       return;
    }
}
