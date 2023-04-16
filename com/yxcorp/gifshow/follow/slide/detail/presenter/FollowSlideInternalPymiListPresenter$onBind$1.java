package com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideInternalPymiListPresenter$onBind$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideInternalPymiListPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import eda.l;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;

public final class FollowSlideInternalPymiListPresenter$onBind$1 extends FunctionReferenceImpl implements l	// class@001122
{

    public void FollowSlideInternalPymiListPresenter$onBind$1(FollowSlideInternalPymiListPresenter p0){
       super(1, p0, FollowSlideInternalPymiListPresenter.class, "onLoginEvent", "onLoginEvent\(Lcom/yxcorp/gifshow/events/LoginEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowSlideInternalPymiListPresenter$onBind$1.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       this.receiver.onLoginEvent(p0);
       return;
    }
}
