package b8a.e0;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.i;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.util.Objects;

public final class e0 implements g	// class@00039d
{
    public final i b;

    public void e0(i p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e0 tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 == FragmentEvent.RESUME) {
          tb.P8();
       }
       return;
    }
}
