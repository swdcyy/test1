package b5c.d;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.page.b;
import java.lang.Object;
import wca.q;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.util.rx.RxBus;
import java.lang.String;
import com.kwai.framework.model.user.User;
import eda.s;

public final class d implements g	// class@0003a7
{
    public final b b;

    public void d(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       if (!tb.t.Vg().a()) {
          RxBus.f.b(s.d(tb.r.getId(), "BLOCK_USER"));
       }
       return;
    }
}
