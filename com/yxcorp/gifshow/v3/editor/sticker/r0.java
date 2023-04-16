package com.yxcorp.gifshow.v3.editor.sticker.r0;
import erd.g;
import com.yxcorp.gifshow.v3.editor.sticker.t0;
import java.lang.Object;
import java.lang.Boolean;
import lnc.a1;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import com.yxcorp.utility.n;
import android.view.ViewPropertyAnimator;
import android.view.View;
import itc.s2;
import java.lang.Runnable;

public final class r0 implements g	// class@001282
{
    public final t0 b;

    public void r0(t0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       float f;
       r0 tb = this.b;
       if (tb.H == null) {
       }else if(tb.I != null){
          f = 300.00f;
       }else {
          f = 360.00f;
       }
       tb.s.animate().translationY((float)(a1.e(f) + n.q(tb.getActivity()))).setDuration(300).withEndAction(new s2(tb)).start();
       return;
    }
}
