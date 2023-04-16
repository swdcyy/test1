package bed.x;
import erd.g;
import bed.y;
import qm6.b$a;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import uy5.a;
import java.lang.String;
import q87.c;

public final class x implements g	// class@000426
{
    public final y b;
    public final b$a c;

    public void x(y p0,b$a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       x tb = this.b;
       Objects.requireNonNull(tb);
       a.C().e("CameraButtonOperation", "getTopicRecommend error", p0);
       tb.l(this.c);
    }
}
