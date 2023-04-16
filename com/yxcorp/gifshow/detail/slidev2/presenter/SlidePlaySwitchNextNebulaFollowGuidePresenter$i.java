package com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlaySwitchNextNebulaFollowGuidePresenter$i;
import erd.r;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlaySwitchNextNebulaFollowGuidePresenter;
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

public final class SlidePlaySwitchNextNebulaFollowGuidePresenter$i implements r	// class@0018e5
{
    public final SlidePlaySwitchNextNebulaFollowGuidePresenter b;

    public void SlidePlaySwitchNextNebulaFollowGuidePresenter$i(SlidePlaySwitchNextNebulaFollowGuidePresenter p0){
       this.b = p0;
       super();
    }
    public boolean test(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, SlidePlaySwitchNextNebulaFollowGuidePresenter$i.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          a.p(p0, "it");
          p0 = this.b.r;
          if (p0 == null) {
             a.S("mFragment");
          }
          b = p0.Vg().a();
       }
       return b;
    }
}
