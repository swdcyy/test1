package gg9.d;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.permission.b;
import java.lang.Object;
import androidx.constraintlayout.widget.ConstraintLayout;
import gg9.a;

public final class d implements Runnable	// class@002476
{
    public final b b;

    public void d(b p0){
       this.b = p0;
    }
    public final void run(){
       d tb = this.b;
       b w = tb.w;
       if (w != null) {
          b p = tb.p;
          if (p != null) {
             w.c(p);
          }
       }
       return;
    }
}
