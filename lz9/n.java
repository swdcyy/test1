package lz9.n;
import java.lang.Runnable;
import lz9.b0;
import java.lang.Object;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.OppoPreventBurnInHelper;
import lz9.l;
import qp7.t0;
import qp7.b;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import e8a.e1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;

public final class n implements Runnable	// class@002ee4
{
    public final b0 b;

    public void n(b0 p0){
       this.b = p0;
    }
    public final void run(){
       n tb = this.b;
       OppoPreventBurnInHelper oppoPreventB = new OppoPreventBurnInHelper(new l(tb), tb.H(), tb.A, tb.y);
       tb.d1 = oppoPreventB;
       oppoPreventB.a();
    }
}
