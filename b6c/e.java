package b6c.e;
import erd.g;
import com.yxcorp.gifshow.profile.widget.a;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.util.Objects;

public final class e implements g	// class@0003bd
{
    public final a b;

    public void e(a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 == FragmentEvent.DESTROY_VIEW) {
          tb.f = true;
       }
       return;
    }
}
