package com.yxcorp.gifshow.detail.slidev2.presenter.feature.OppoPreventBurnInRightButtonsPresenter$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.OppoPreventBurnInRightButtonsPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import ekd.k1;

public class OppoPreventBurnInRightButtonsPresenter$a implements Runnable	// class@001927
{
    public final OppoPreventBurnInRightButtonsPresenter b;

    public void OppoPreventBurnInRightButtonsPresenter$a(OppoPreventBurnInRightButtonsPresenter p0){
       this.b = p0;
       super();
    }
    public void run(){
       float f1;
       if (PatchProxy.applyVoid(null, this, OppoPreventBurnInRightButtonsPresenter$a.class, "1")) {
          return;
       }
       OppoPreventBurnInRightButtonsPresenter$a tb = this.b;
       OppoPreventBurnInRightButtonsPresenter r = tb.r;
       float f = 0;
       if (r != null) {
          f1 = (tb.w != null)? 0: (float)tb.v;
          r.setTranslationY(f1);
       }
       tb = this.b;
       r = tb.s;
       if (r != null) {
          f1 = (tb.w != null)? 0: (float)tb.v;
          r.setTranslationY(f1);
       }
       tb = this.b;
       r = tb.t;
       if (r != null) {
          if (tb.w == null) {
             f = (float)tb.v;
          }
          r.setTranslationY(f);
       }
       tb = this.b;
       tb.w = tb.w ^ 0x01;
       k1.r(tb.y, tb.u);
       return;
    }
}
