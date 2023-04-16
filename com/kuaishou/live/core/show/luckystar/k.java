package com.kuaishou.live.core.show.luckystar.k;
import java.lang.Runnable;
import com.kuaishou.live.core.show.luckystar.c$b;
import java.lang.Object;
import u07.t$a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.String;
import lnc.a1;
import java.lang.CharSequence;
import yb2.f;
import u07.u;
import u07.t;
import u07.j;

public final class k implements Runnable	// class@000ccd
{
    public final c$b b;

    public void k(c$b p0){
       this.b = p0;
    }
    public final void run(){
       k tb = this.b;
       t$a uoa = new t$a(tb.a.getActivity());
       uoa.W0(R.string.arg_RES_7f102514);
       uoa.z0(a1.p(R.string.arg_RES_7f102519));
       uoa.S0(R.string.arg_RES_7f100f8f);
       uoa.Q0(R.string.cancel);
       uoa.u0(new f(tb));
       j.d(uoa);
    }
}
