package jx8.a;
import erd.g;
import jx8.c;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.util.Objects;
import java.lang.Runnable;
import ekd.k1;

public final class a implements g	// class@0029cf
{
    public final c b;

    public void a(c p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 == FragmentEvent.RESUME) {
          k1.r(tb.t, 100);
       }
       return;
    }
}
