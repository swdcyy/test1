package bbc.w;
import erd.g;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import ji5.b;
import ekd.k1;
import java.lang.StringBuilder;
import cbc.a;

public final class w implements g	// class@00043d
{
    public final ProgressFragment b;
    public final g c;

    public void w(ProgressFragment p0,g p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       w tc = this.c;
       b.c(p0, "/rest/n/intimate/relation/detail", "intimate");
       k1.n("loading");
       this.b.dismiss();
       a.a("request dialog detail failed: "+p0);
       if (tc != null) {
          tc.accept(p0);
       }
       return;
    }
}
