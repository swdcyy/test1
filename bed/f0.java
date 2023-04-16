package bed.f0;
import erd.o;
import bed.q0;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Object;
import ixc.c;
import java.util.Objects;
import bed.b0;
import io.reactivex.g;
import brd.t;

public final class f0 implements o	// class@000407
{
    public final q0 b;
    public final MagicEmoji$MagicFace c;

    public void f0(q0 p0,MagicEmoji$MagicFace p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       f0 tb = this.b;
       Objects.requireNonNull(tb);
       return t.create(new b0(tb, p0, this.c));
    }
}
