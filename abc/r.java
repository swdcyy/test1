package abc.r;
import erd.g;
import com.yxcorp.gifshow.relation.intimate.dialog.k;
import com.yxcorp.gifshow.relation.intimate.dialog.s;
import java.lang.Object;
import java.lang.Integer;
import java.util.Objects;
import g9c.a;
import com.yxcorp.gifshow.model.IntimateRelationInfo;

public final class r implements g	// class@0000dd
{
    public final k b;
    public final s c;

    public void r(k p0,s p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       r tb = this.b;
       Objects.requireNonNull(tb);
       p0 = this.c.N0(p0.intValue());
       if (p0 != null) {
          tb.n = p0.mType;
          tb.B();
       }
       return;
    }
}
