package q90.u;
import erd.g;
import q90.q;
import java.lang.Object;
import com.trello.rxlifecycle3.android.ActivityEvent;

public final class u implements g	// class@0029a1
{
    public final q b;

    public void u(q p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (p0 == ActivityEvent.DESTROY) {
          p0.s = null;
       }
       return;
    }
}
