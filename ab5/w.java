package ab5.w;
import erd.g;
import com.kwai.component.homepage_interface.homeitemfragment.a;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.util.Objects;
import hka.i;
import hka.k;

public final class w implements g	// class@00005e
{
    public final a b;

    public void w(a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       w tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 == FragmentEvent.DESTROY) {
          tb.b.w8(tb);
       }
       return;
    }
}
