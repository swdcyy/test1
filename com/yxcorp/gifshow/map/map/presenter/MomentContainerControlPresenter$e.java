package com.yxcorp.gifshow.map.map.presenter.MomentContainerControlPresenter$e;
import erd.g;
import com.yxcorp.gifshow.map.map.presenter.MomentContainerControlPresenter;
import java.lang.Object;
import com.kuaishou.krn.event.KrnLifeCycleEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class MomentContainerControlPresenter$e implements g	// class@001cba
{
    public final MomentContainerControlPresenter b;

    public void MomentContainerControlPresenter$e(MomentContainerControlPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MomentContainerControlPresenter$e.class, "1")) {
       }else {
          this.b.onReceivedKrnLifeCycleEvent(p0);
       }
       return;
    }
}
