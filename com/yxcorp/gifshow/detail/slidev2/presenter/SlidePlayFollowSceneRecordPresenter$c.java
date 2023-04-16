package com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayFollowSceneRecordPresenter$c;
import erd.r;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayFollowSceneRecordPresenter;
import java.lang.Object;
import uic.a0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class SlidePlayFollowSceneRecordPresenter$c implements r	// class@0018c7
{
    public final SlidePlayFollowSceneRecordPresenter b;

    public void SlidePlayFollowSceneRecordPresenter$c(SlidePlayFollowSceneRecordPresenter p0){
       this.b = p0;
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, SlidePlayFollowSceneRecordPresenter$c.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "it");
          p0 = this.b.s;
          if (p0 == null) {
             a.S("mFragment");
          }
          b = p0.Vg().a();
       }
       return b;
    }
}
