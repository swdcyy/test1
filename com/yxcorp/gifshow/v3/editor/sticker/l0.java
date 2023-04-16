package com.yxcorp.gifshow.v3.editor.sticker.l0;
import erd.g;
import com.yxcorp.gifshow.v3.editor.sticker.p0;
import java.lang.Object;
import java.lang.Boolean;
import lnc.a1;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import com.yxcorp.utility.n;
import android.view.ViewPropertyAnimator;
import android.view.View;
import itc.e2;
import java.lang.Runnable;

public final class l0 implements g	// class@001268
{
    public final p0 b;

    public void l0(p0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       float f;
       l0 tb = this.b;
       if (tb.M == null) {
       }else if(tb.N != null){
          f = 300.00f;
       }else {
          f = 360.00f;
       }
       tb.q.animate().translationY((float)(a1.e(f) + n.q(tb.getActivity()))).setDuration(300).withEndAction(new e2(tb)).start();
       return;
    }
}
