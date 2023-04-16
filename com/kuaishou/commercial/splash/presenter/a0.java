package com.kuaishou.commercial.splash.presenter.a0;
import erd.g;
import com.kuaishou.commercial.splash.presenter.b0;
import java.lang.Object;
import android.view.ViewGroup;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.commercial.splash.presenter.n0;
import gz.u2;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View$OnTouchListener;
import gz.v2;
import android.view.View$OnClickListener;

public final class a0 implements g	// class@0015da
{
    public final b0 b;

    public void a0(b0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, b0.class, "5")) {
       }else {
          p0 = tb.A;
          if (p0 != null && p0.W != 2) {
             p0 = tb.m8().findViewById(R.id.splash_action_bar);
             tb.M = p0;
             if (p0 != null) {
                p0.setOnTouchListener(tb.K);
                tb.M.setOnClickListener(new v2(tb));
             }
          }
       }
       return;
    }
}
