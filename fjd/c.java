package fjd.c;
import java.lang.Runnable;
import com.yxcorp.retrofit.idc.c$c;
import java.lang.Object;
import java.util.Objects;
import com.yxcorp.utility.NetworkUtilsCached;
import com.yxcorp.retrofit.idc.c;

public final class c implements Runnable	// class@000e48
{
    public final c$c b;

    public void c(c$c p0){
       this.b = p0;
    }
    public final void run(){
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (NetworkUtilsCached.k()) {
          tb.b.q();
       }
       return;
    }
}
