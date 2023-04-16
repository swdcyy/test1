package f12.n;
import androidx.lifecycle.LifecycleEventObserver;
import f12.o;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import java.util.Objects;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayFragment;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import pw6.a;

public final class n implements LifecycleEventObserver	// class@002840
{
    public final o b;

    public void n(o p0){
       this.b = p0;
    }
    public final void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       n tb = this.b;
       Objects.requireNonNull(tb);
       if (p1 == Lifecycle$Event.ON_RESUME && (tb.i == null && tb.h.eh())) {
          if (tb.h.getParentFragment() instanceof BaseFragment && tb.h.getParentFragment().Vg().c()) {
             tb.d = true;
          }
          tb.i = true;
       }
    label_0036 :
       return;
    }
}
