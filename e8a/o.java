package e8a.o;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.f;
import java.lang.Object;
import com.trello.rxlifecycle3.android.ActivityEvent;
import java.util.Objects;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.f$b;
import java.lang.Enum;

public final class o implements g	// class@0020c7
{
    public final f b;

    public void o(f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       o tb = this.b;
       Objects.requireNonNull(tb);
       int i = f$b.a[p0.ordinal()];
       boolean b = true;
       if (i != b) {
          if (i == 2) {
             tb.u = false;
             tb.P8();
          }
       }else {
          tb.u = b;
          tb.P8();
       }
       return;
    }
}
