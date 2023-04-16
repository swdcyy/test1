package gqa.b;
import erd.g;
import com.yxcorp.gifshow.growth.publicdomainguide.c;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$r;

public final class b implements g	// class@002b65
{
    public final c b;

    public void b(c p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.booleanValue()) {
          tb.P8();
       }else {
          k1.m(tb.G);
          p0 = tb.s;
          if (p0 instanceof RecyclerFragment) {
             p0.h0().removeOnScrollListener(tb.H);
          }
          tb.F.run();
       }
       return;
    }
}
