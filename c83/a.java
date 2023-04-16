package c83.a;
import erd.g;
import c83.h;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import w73.s$a;
import java.lang.String;
import com.kuaishou.live.common.core.component.gift.base.model.Model;

public final class a implements g	// class@0004ec
{
    public final h b;

    public void a(h p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       tb.d("doOnError", s$a.a);
    }
}
