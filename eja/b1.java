package eja.b1;
import erd.g;
import com.yxcorp.gifshow.follow.stagger.presenter.b0;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import jb5.d;
import com.yxcorp.gifshow.follow.stagger.container.HomeFollowFragment;
import com.yxcorp.gifshow.refresh.RefreshType;
import com.kwai.component.homepage_interface.homeitemfragment.HomeItemFragment;

public final class b1 implements g	// class@0026b5
{
    public final b0 b;

    public void b1(b0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b1 tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.booleanValue() && tb.w != null) {
          boolean b = false;
          tb.w = b;
          if (tb.r.h0() != null) {
             tb.r.h0().scrollToPosition(b);
          }
          if (tb.r.Qh() != null) {
             tb.r.J3(RefreshType.INIT);
          }
       }
    label_0034 :
       return;
    }
}
