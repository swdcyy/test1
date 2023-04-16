package com.yxcorp.gifshow.map.map.presenter.MomentContainerControlPresenter$b;
import hka.a;
import com.yxcorp.gifshow.map.map.presenter.MomentContainerControlPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.yxcorp.gifshow.nearby.common.map.MapExperimentUtils;

public final class MomentContainerControlPresenter$b implements a	// class@001cb7
{
    public final MomentContainerControlPresenter b;

    public void MomentContainerControlPresenter$b(MomentContainerControlPresenter p0){
       this.b = p0;
       super();
    }
    public final boolean onBackPressed(){
       MomentContainerControlPresenter obj = PatchProxy.apply(null, this, MomentContainerControlPresenter$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b.w;
       if (obj == null || (obj.getState() != 3 || !MapExperimentUtils.g.e())) {
          return false;
       }
       obj = this.b.w;
       if (obj != null) {
          obj.setState(5);
       }
       this.b.S8(false);
       return true;
    }
}
