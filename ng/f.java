package ng.f;
import java.lang.Runnable;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.lang.Object;

public final class f implements Runnable	// class@002707
{
    public final ProgressFragment b;

    public void f(ProgressFragment p0){
       this.b = p0;
       super();
    }
    public final void run(){
       this.b.dismiss();
    }
}
