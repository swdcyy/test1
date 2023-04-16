package j8a.k;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.b;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.util.Objects;
import java.lang.Runnable;
import ekd.k1;

public final class k implements g	// class@002961
{
    public final b b;

    public void k(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       k tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 == FragmentEvent.PAUSE) {
          k1.m(tb.I);
       }
       return;
    }
}
