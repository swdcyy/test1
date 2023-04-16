package cb5.q;
import java.lang.Runnable;
import com.kwai.component.homepage_interface.homeitemfragment.presenter.e;
import java.lang.Object;
import java.util.Objects;
import g9c.d;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import pkd.a;
import java.lang.IllegalStateException;
import java.lang.Throwable;

public final class q implements Runnable	// class@000454
{
    public final e b;

    public void q(e p0){
       this.b = p0;
    }
    public final void run(){
       q tb = this.b;
       try{
          Objects.requireNonNull(tb);
          tb.q.ia().k0();
       }catch(java.lang.Exception e0){
          if (a.a) {
          label_0015 :
             throw new IllegalStateException(e0);
          }
       }
       return;
    }
}
