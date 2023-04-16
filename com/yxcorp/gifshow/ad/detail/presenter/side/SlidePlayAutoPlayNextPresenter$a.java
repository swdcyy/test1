package com.yxcorp.gifshow.ad.detail.presenter.side.SlidePlayAutoPlayNextPresenter$a;
import d6a.a;
import com.yxcorp.gifshow.ad.detail.presenter.side.SlidePlayAutoPlayNextPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.BitSet;
import com.yxcorp.gifshow.ad.detail.presenter.side.SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus;
import java.lang.Boolean;
import im8.f;
import com.yxcorp.gifshow.ad.detail.presenter.side.j;
import lnc.c3$a;
import lnc.c3;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.util.Objects;

public class SlidePlayAutoPlayNextPresenter$a extends a	// class@001698
{
    public final SlidePlayAutoPlayNextPresenter b;

    public void SlidePlayAutoPlayNextPresenter$a(SlidePlayAutoPlayNextPresenter p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, SlidePlayAutoPlayNextPresenter$a.class, "2")) {
          return;
       }
       SlidePlayAutoPlayNextPresenter$a tb = this.b;
       tb.M = -1;
       tb.L = false;
       tb.S = 0;
       tb.T.clear();
       tb = this.b;
       tb.W = SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus.ENABLE;
       Boolean fALSE = Boolean.FALSE;
       tb.D.set(fALSE);
       this.b.e9();
       SlidePlayAutoPlayNextPresenter j = this.b.J;
       if (j != null) {
          j.set(fALSE);
       }
       return;
    }
    public void i2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SlidePlayAutoPlayNextPresenter$a.class, "1")) {
          return;
       }
       SlidePlayAutoPlayNextPresenter$a tb = this.b;
       tb.L = true;
       tb.T.clear();
       c3.c(this.b.r, j.a);
       tb = this.b;
       tb.W = SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus.ENABLE;
       tb.O = objArray;
       if (tb.b9()) {
          tb = this.b;
          if (tb.R != null) {
             tb.d9();
          }
          tb = this.b;
          tb.X = tb.V0.z();
       }
       Objects.requireNonNull(this.b);
       return;
    }
}
