package com.kuaishou.commercial.splash.presenter.l0;
import erd.g;
import com.kuaishou.commercial.splash.presenter.n0;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View$OnTouchListener;
import gz.c4;
import msd.l;
import lnc.y0;

public final class l0 implements g	// class@0015f7
{
    public final n0 b;

    public void l0(n0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       l0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, n0.class, "21")) {
       }else {
          p0.setOnTouchListener(tb.K);
          y0.a(p0, new c4(tb));
       }
       return;
    }
}
