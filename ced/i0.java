package ced.i0;
import erd.g;
import com.yxcorp.plugin.search.result.hashtag.presenters.o;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.util.Objects;

public final class i0 implements g	// class@00055c
{
    public final o b;

    public void i0(o p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       i0 tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 == FragmentEvent.PAUSE) {
          tb.S8();
       }
       return;
    }
}
