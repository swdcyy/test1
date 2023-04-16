package eja.x0;
import erd.r;
import com.yxcorp.gifshow.follow.stagger.presenter.x;
import java.lang.Object;
import com.trello.rxlifecycle3.android.ActivityEvent;
import java.util.Objects;
import w99.h;

public final class x0 implements r	// class@002704
{
    public final x b;

    public void x0(x p0){
       this.b = p0;
    }
    public final boolean test(Object p0){
       x0 tb = this.b;
       Objects.requireNonNull(tb);
       boolean b = (p0 == ActivityEvent.RESUME && tb.q.a())? true: false;
       return b;
    }
}
