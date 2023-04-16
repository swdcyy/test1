package f52.k;
import erd.g;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.f;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;

public final class k implements g	// class@002890
{
    public final f b;

    public void k(f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       k tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.booleanValue()) {
          tb.S8();
       }else {
          tb.P8();
       }
       return;
    }
}
