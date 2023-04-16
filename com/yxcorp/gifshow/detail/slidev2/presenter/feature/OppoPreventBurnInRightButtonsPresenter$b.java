package com.yxcorp.gifshow.detail.slidev2.presenter.feature.OppoPreventBurnInRightButtonsPresenter$b;
import d6a.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.OppoPreventBurnInRightButtonsPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import ekd.k1;
import androidx.fragment.app.Fragment;

public class OppoPreventBurnInRightButtonsPresenter$b extends a	// class@001928
{
    public final OppoPreventBurnInRightButtonsPresenter b;

    public void OppoPreventBurnInRightButtonsPresenter$b(OppoPreventBurnInRightButtonsPresenter p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, OppoPreventBurnInRightButtonsPresenter$b.class, "2")) {
          return;
       }
       OppoPreventBurnInRightButtonsPresenter$b tb = this.b;
       tb.x = false;
       k1.m(tb.y);
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, OppoPreventBurnInRightButtonsPresenter$b.class, "1")) {
          return;
       }
       OppoPreventBurnInRightButtonsPresenter$b tb = this.b;
       tb.x = true;
       if (tb.p.isResumed()) {
          tb = this.b;
          k1.r(tb.y, tb.u);
       }
       return;
    }
}
