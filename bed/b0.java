package bed.b0;
import io.reactivex.g;
import bed.q0;
import ixc.c;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Object;
import brd.v;
import java.util.Objects;
import z3b.a;
import z3b.f;
import bed.p0;
import com.yxcorp.gifshow.model.MagicBaseConfig;

public final class b0 implements g	// class@0003ff
{
    public final q0 b;
    public final c c;
    public final MagicEmoji$MagicFace d;

    public void b0(q0 p0,c p1,MagicEmoji$MagicFace p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void subscribe(v p0){
       b0 tb = this.b;
       Objects.requireNonNull(tb);
       f[] uofArray = new f[]{new p0(tb, p0)};
       this.c.H0().h(this.d, uofArray);
    }
}
