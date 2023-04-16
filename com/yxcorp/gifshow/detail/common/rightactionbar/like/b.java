package com.yxcorp.gifshow.detail.common.rightactionbar.like.b;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.common.rightactionbar.like.LikeElement;
import java.lang.Object;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.OppoPreventBurnInHelper;
import pz9.g;
import qp7.t0;
import qp7.b;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import e8a.e1;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;

public final class b implements Runnable	// class@0014a6
{
    public final LikeElement b;

    public void b(LikeElement p0){
       this.b = p0;
    }
    public final void run(){
       b tb = this.b;
       OppoPreventBurnInHelper oppoPreventB = new OppoPreventBurnInHelper(new g(tb), tb.H(), tb.A, tb.C);
       tb.F = oppoPreventB;
       oppoPreventB.a();
    }
}
