package com.kwai.roampanel.panel.RoamPanelManagePresenter$1;
import androidx.lifecycle.LifecycleObserver;
import com.kwai.roampanel.panel.RoamPanelManagePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class RoamPanelManagePresenter$1 implements LifecycleObserver	// class@0013d5
{
    public final RoamPanelManagePresenter b;

    public void RoamPanelManagePresenter$1(RoamPanelManagePresenter p0){
       this.b = p0;
       super();
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, RoamPanelManagePresenter$1.class, "1")) {
          return;
       }
       this.b.R8();
       RoamPanelManagePresenter$1 tb = this.b;
       if (tb.C != null && tb.x == null) {
          tb.P8();
       }
       return;
    }
}
