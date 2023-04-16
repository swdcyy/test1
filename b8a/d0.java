package b8a.d0;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.i;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;

public final class d0 implements g	// class@000399
{
    public final i b;

    public void d0(i p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d0 tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.booleanValue()) {
          tb.P8();
       }
       return;
    }
}
