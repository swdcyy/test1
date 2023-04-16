package com.yxcorp.gifshow.map.map.presenter.MomentContainerControlPresenter$f;
import erd.g;
import com.yxcorp.gifshow.map.map.presenter.MomentContainerControlPresenter;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public final class MomentContainerControlPresenter$f implements g	// class@001cbb
{
    public final MomentContainerControlPresenter b;

    public void MomentContainerControlPresenter$f(MomentContainerControlPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MomentContainerControlPresenter$f.class, "1")) {
       }else {
          int i = 3;
          if (p0 != null) {
             boolean b = true;
             if (p0.intValue() == b) {
                p0 = this.b;
                p0.z = "NOW_BTN";
                p0.S8(b);
                p0 = this.b.w;
                if (p0 != null) {
                   p0.setState(i);
                }
             }
          }
          int i1 = 2;
          if (p0 != null && p0.intValue() == i1) {
             p0 = this.b.w;
             if (p0 != null) {
                p0.setState(5);
             }
             this.b.S8(false);
          }else if(p0 != null && p0.intValue() == i){
             this.b.X8();
          }else if(p0 == null){
             p0.intValue();
          }
       }
       return;
    }
}
