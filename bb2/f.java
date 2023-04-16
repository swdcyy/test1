package bb2.f;
import erd.g;
import bb2.g;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.util.Objects;
import tc5.b;

public final class f implements g	// class@0003c7
{
    public final g b;

    public void f(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 == FragmentEvent.PAUSE) {
          tb.x.F(false);
       }else if(p0 == FragmentEvent.RESUME){
          tb.x.F(true);
       }
       return;
    }
}
