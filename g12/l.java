package g12.l;
import erd.g;
import g12.m;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.util.Objects;
import tc5.b;

public final class l implements g	// class@002a30
{
    public final m b;

    public void l(m p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       l tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 == FragmentEvent.PAUSE) {
          tb.v.F(false);
       }else if(p0 == FragmentEvent.RESUME){
          tb.v.F(true);
       }
       return;
    }
}
