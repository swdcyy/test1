package elb.q;
import erd.g;
import com.yxcorp.gifshow.model.h;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import java.util.concurrent.ConcurrentHashMap;
import io.reactivex.subjects.SingleSubject;

public final class q implements g	// class@002763
{
    public final h b;
    public final String c;

    public void q(h p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       SingleSubject singleSubjec = this.b.a.remove(this.c);
       if (singleSubjec != null) {
          singleSubjec.onError(p0);
       }
       return;
    }
}
