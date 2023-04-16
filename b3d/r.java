package b3d.r;
import erd.g;
import com.yxcorp.login.util.h;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.login.util.h$a;

public final class r implements g	// class@000342
{
    public final h b;

    public void r(h p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       h b = this.b.b;
       if (b != null) {
          b.onError(p0);
       }
       return;
    }
}
