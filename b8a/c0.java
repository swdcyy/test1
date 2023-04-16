package b8a.c0;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.i;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;

public final class c0 implements g	// class@000395
{
    public final i b;

    public void c0(i p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c0 tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.booleanValue()) {
          tb.P8();
       }
       return;
    }
}
