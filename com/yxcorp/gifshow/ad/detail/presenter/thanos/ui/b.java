package com.yxcorp.gifshow.ad.detail.presenter.thanos.ui.b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.ui.c;
import java.lang.Object;
import android.view.View;
import com.yxcorp.gifshow.entity.QPhoto;
import yic.q0;
import java.lang.String;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import crd.b;
import w26.c;
import com.yxcorp.gifshow.util.LoadPolicy;
import java.lang.Class;
import brd.a0;
import lnc.y6;
import r19.h;
import erd.g;

public final class b implements View$OnClickListener	// class@0016d8
{
    public final c b;

    public void b(c p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       b tb = this.b;
       if (q0.a(tb.q)) {
          i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f100f0f));
       }else {
          c s = tb.s;
          if (s == null || s.isDisposed()) {
             tb.s = y6.s(c.class, LoadPolicy.DIALOG).K().Q(new h(tb));
          }
       }
       return;
    }
}
