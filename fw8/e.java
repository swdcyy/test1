package fw8.e;
import erd.g;
import com.yxcorp.gifshow.activity.d;
import java.lang.Object;
import android.util.Pair;
import java.util.Objects;
import java.lang.Boolean;
import wkd.b;
import cta.e;

public final class e implements g	// class@00235b
{
    public final d b;

    public void e(d p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       boolean b = p0.first.booleanValue();
       boolean b1 = p0.second.booleanValue();
       int i = (b != tb.d || b1 != tb.e)? 1: 0;
       tb.d = b;
       tb.e = b1;
       if (i) {
          b.a(-920422449).g();
       }
       return;
    }
}
