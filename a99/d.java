package a99.d;
import erd.g;
import a99.g;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.util.Objects;
import android.widget.ImageView;

public final class d implements g	// class@00005d
{
    public final g b;

    public void d(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 == FragmentEvent.RESUME && tb.F != null) {
          tb.r.setVisibility(0);
          tb.b9();
       }
       return;
    }
}
