package dl9.k1;
import erd.g;
import dl9.u1;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import com.kuaishou.android.model.mix.QComment;
import com.yxcorp.gifshow.entity.QPhoto;

public final class k1 implements g	// class@001f73
{
    public final u1 b;

    public void k1(u1 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       k1 tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.booleanValue() && tb.v.mLiked != null) {
          tb.P8(tb.z);
       }
       return;
    }
}
