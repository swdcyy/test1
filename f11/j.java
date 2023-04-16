package f11.j;
import erd.g;
import f11.m;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveUserStatusResponse;
import java.util.Objects;
import ho1.b;

public final class j implements g	// class@002276
{
    public final m b;

    public void j(m p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.mDisableLike != null) {
          tb.F.b();
       }
       return;
    }
}
