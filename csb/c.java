package csb.c;
import java.lang.Runnable;
import com.yxcorp.gifshow.nearby.common.view.TipRefreshView;
import java.lang.Object;

public final class c implements Runnable	// class@0023a8
{
    public final TipRefreshView b;

    public void c(TipRefreshView p0){
       this.b = p0;
    }
    public final void run(){
       TipRefreshView.a(this.b);
    }
}
