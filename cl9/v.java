package cl9.v;
import erd.g;
import cl9.y;
import java.lang.Object;
import nk9.l;
import com.yxcorp.gifshow.entity.QPhoto;

public final class v implements g	// class@000677
{
    public final y b;

    public void v(y p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       v tb = this.b;
       if (tb.A != null && tb.q.isAllowComment()) {
          tb.R8();
       }
       return;
    }
}
