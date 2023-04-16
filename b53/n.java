package b53.n;
import erd.g;
import com.kuaishou.live.gzone.barrage.h;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;

public final class n implements g	// class@00031a
{
    public final h b;

    public void n(h p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       n tb = this.b;
       Objects.requireNonNull(tb);
       tb.p = p0.booleanValue();
    }
}
