package ced.y0;
import erd.g;
import com.yxcorp.plugin.search.result.hashtag.presenters.v;
import androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.util.Objects;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import com.google.android.material.appbar.ReboundBehavior;

public final class y0 implements g	// class@000590
{
    public final v b;
    public final CoordinatorLayout$LayoutParams c;

    public void y0(v p0,CoordinatorLayout$LayoutParams p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       y0 tb = this.b;
       y0 tc = this.c;
       Objects.requireNonNull(tb);
       if (p0 == FragmentEvent.RESUME) {
          p0 = tc.f();
          if (p0 instanceof ReboundBehavior) {
             tb.v = p0;
             p0.T(true);
          }
       }
       return;
    }
}
