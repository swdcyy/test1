package cb5.i;
import java.lang.Runnable;
import com.kwai.component.homepage_interface.homeitemfragment.presenter.e;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.lang.Object;

public final class i implements Runnable	// class@00044c
{
    public final e b;
    public final StaggeredGridLayoutManager c;
    public final int d;

    public void i(e p0,StaggeredGridLayoutManager p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       this.c.scrollToPositionWithOffset((this.d + this.b.P8()), 0);
    }
}
