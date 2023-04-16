package nfd.d0;
import erd.g;
import com.yxcorp.plugin.search.utils.j;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.util.Objects;

public final class d0 implements g	// class@001d9a
{
    public final j b;

    public void d0(j p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d0 tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 == FragmentEvent.PAUSE) {
          tb.c();
       }
       return;
    }
}
