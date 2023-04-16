package g19.j0;
import java.lang.Runnable;
import com.yxcorp.gifshow.ad.detail.presenter.side.l;
import java.lang.Object;
import rf5.u;

public final class j0 implements Runnable	// class@0023c1
{
    public final l b;

    public void j0(l p0){
       this.b = p0;
    }
    public final void run(){
       j0 tb = this.b;
       l m = tb.M;
       if (m != null && !m.v()) {
          tb.M.l();
       }
       return;
    }
}
