package kx8.o;
import java.lang.Runnable;
import com.yxcorp.gifshow.activity.web.OperateWebViewFragment;
import r97.g0;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class o implements Runnable	// class@002c45
{
    public final OperateWebViewFragment b;
    public final g0 c;

    public void o(OperateWebViewFragment p0,g0 p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       o tb = this.b;
       o tc = this.c;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(tc, tb, OperateWebViewFragment.class, "13")) {
       }else {
          tb.K = tc;
          if (tb.Vg().c()) {
             tb.Yg();
          }
       }
       return;
    }
}
