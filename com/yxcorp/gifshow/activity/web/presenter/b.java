package com.yxcorp.gifshow.activity.web.presenter.b;
import erd.g;
import com.yxcorp.gifshow.activity.web.presenter.OperateWebViewPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import mx8.e;
import java.lang.Runnable;
import ekd.k1;

public final class b implements g	// class@0014c7
{
    public final OperateWebViewPresenter b;

    public void b(OperateWebViewPresenter p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.booleanValue() && tb.p.Vg().c()) {
          tb.S8();
          k1.r(new e(tb), 100);
       }else {
          tb.V8();
       }
       return;
    }
}
