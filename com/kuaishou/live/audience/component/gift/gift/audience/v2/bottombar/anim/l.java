package com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.l;
import androidx.lifecycle.Observer;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.bottombar.anim.o;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import z1.k;
import android.view.View;
import com.yxcorp.utility.n;
import crd.b;
import lnc.b9;
import brd.t;
import ry1.b;
import gz0.b0;
import erd.g;
import io.reactivex.internal.functions.Functions;

public final class l implements Observer	// class@000b12
{
    public final o b;

    public void l(o p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       l tb = this.b;
       boolean b = p0.booleanValue();
       Objects.requireNonNull(tb);
       o oo = o.class;
       if (!PatchProxy.isSupport(oo) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tb, oo, "3")) {
          oo = tb.e;
          if (oo != null && !oo.get().booleanValue()) {
             if (b) {
                View[] viewArray = new View[]{tb.d};
                n.Z(8, viewArray);
             }else {
                b9.a(tb.c);
                tb.c = tb.b.W().subscribe(new b0(tb), Functions.d());
             }
          }
       }
       return;
    }
}
