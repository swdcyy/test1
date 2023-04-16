package ng.g;
import java.lang.Runnable;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import og.k;
import java.lang.Object;
import java.lang.String;

public final class g implements Runnable	// class@002708
{
    public final ProgressFragment b;
    public final k c;

    public void g(ProgressFragment p0,k p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       this.b.dismiss();
       this.c.f("data error");
    }
}
