package com.yxcorp.gifshow.detail.slidev2.presenter.g$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.detail.slidev2.presenter.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.view.View;
import com.yxcorp.gifshow.detail.slidev2.presenter.e;
import tkd.b;
import tkd.d;
import fp5.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Map;
import lnc.a1;

public class g$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@0019ad
{
    public final g b;

    public void g$a(g p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, g$a.class, "1")) {
          return;
       }
       this.b.I.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       if (!this.b.a9()) {
          return;
       }
       if (d.a(0x31a55ac8).s0(this.b.getActivity())) {
          return;
       }
       g$a tb = this.b;
       tb.B.remove(tb.I);
       tb = this.b;
       tb.B.remove(tb.G);
       tb = this.b;
       tb.B.remove(tb.K);
       tb = this.b;
       tb.B.remove(tb.Q);
       tb = this.b;
       tb.A.remove(tb.I);
       tb = this.b;
       tb.A.remove(tb.G);
       tb = this.b;
       tb.A.remove(tb.K);
       tb = this.b;
       tb.A.remove(tb.Q);
       this.b.E = (float)a1.h();
       tb = this.b;
       tb.R8(0x3f800000, tb.E, tb.F);
       return;
    }
}
