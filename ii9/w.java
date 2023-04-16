package ii9.w;
import java.lang.Runnable;
import ii9.y;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.base.d;
import androidx.fragment.app.Fragment;
import ii9.v;

public final class w implements Runnable	// class@00284e
{
    public final y b;

    public void w(y p0){
       this.b = p0;
    }
    public final void run(){
       w tb = this.b;
       if (tb.a.f.isAdded()) {
          y a = tb.a;
          if (a.E != null && a.F != null) {
             a.g2();
          }
       }
       return;
    }
}
