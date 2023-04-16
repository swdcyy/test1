package nz9.d0;
import java.lang.Runnable;
import nz9.z0;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import nz9.l;
import com.yxcorp.gifshow.entity.QPhoto;
import androidx.lifecycle.Observer;
import zz5.d;

public final class d0 implements Runnable	// class@003217
{
    public final z0 b;

    public void d0(z0 p0){
       this.b = p0;
    }
    public final void run(){
       d0 tb = this.b;
       if (tb.G.isAdded()) {
          d.b(tb.u, tb.G, new l(tb));
       }
       return;
    }
}
