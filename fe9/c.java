package fe9.c;
import io.reactivex.g;
import fe9.f;
import java.lang.Object;
import brd.v;
import java.util.Objects;
import z3b.a0;
import z3b.f;
import fe9.e;
import java.lang.String;
import com.yxcorp.gifshow.model.MagicBaseConfig;

public final class c implements g	// class@002305
{
    public final f b;

    public void c(f p0){
       this.b = p0;
    }
    public final void subscribe(v p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       f[] uofArray = new f[]{new e(tb, p0)};
       a0.o().a("record", "taken_in_resource", tb.a, uofArray);
    }
}
