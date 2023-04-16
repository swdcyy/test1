package com.yxcorp.gifshow.v3.editor.cover.r;
import erd.g;
import com.yxcorp.gifshow.v3.editor.cover.s;
import java.lang.Object;
import java.lang.Boolean;
import lnc.a1;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import com.yxcorp.utility.n;
import android.view.ViewPropertyAnimator;
import android.view.View;
import ppc.p;
import java.lang.Runnable;

public final class r implements g	// class@000eca
{
    public final s b;

    public void r(s p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       r tb = this.b;
       if (tb.M != null && tb.L != null) {
          tb.L.animate().translationY((float)(a1.e(300.00f) + n.q(tb.getActivity()))).setDuration(300).withEndAction(new p(tb)).start();
       }
       return;
    }
}
