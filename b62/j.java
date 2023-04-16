package b62.j;
import erd.g;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.i;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;

public final class j implements g	// class@000344
{
    public final i b;

    public void j(i p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j tb = this.b;
       Objects.requireNonNull(tb);
       tb.Z8(p0.booleanValue(), false);
    }
}
