package com.yxcorp.gifshow.relation.explore.presenter.gallery.m;
import erd.g;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.n;
import java.lang.Object;
import java.lang.Integer;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import bac.p;
import iac.x0;
import java.lang.Runnable;
import android.view.ViewGroup;

public final class m implements g	// class@001849
{
    public final n b;

    public void m(n p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       m tb = this.b;
       int i = p0.intValue();
       Objects.requireNonNull(tb);
       n on = n.class;
       if (PatchProxy.isSupport(on) && (!PatchProxy.applyVoidOneRefs(Integer.valueOf(i), tb, on, "5") && i < (tb.x.getItemCount() - 1))) {
          i++;
          tb.y.postDelayed(new x0(tb, i), 500);
       }
       return;
    }
}
