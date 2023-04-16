package elb.r;
import java.lang.Runnable;
import com.yxcorp.gifshow.model.h;
import java.lang.Object;
import java.util.Objects;
import mca.a;
import java.lang.Boolean;
import io.reactivex.subjects.SingleSubject;

public final class r implements Runnable	// class@002766
{
    public final h b;

    public void r(h p0){
       this.b = p0;
    }
    public final void run(){
       r tb = this.b;
       Objects.requireNonNull(tb);
       a.u();
       h b = tb.b;
       if (b != null) {
          b.onSuccess(Boolean.TRUE);
       }
       return;
    }
}
