package com.yxcorp.gifshow.relation.explore.presenter.gallery.o;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import java.util.Objects;
import iac.y0;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import gc5.b;
import ec5.h;
import ec5.f;
import iac.t0;
import gc5.f;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.k;
import z1.i;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.h;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kwai.component.list.exposed.behavior.ItemExposedBehavior;
import ec5.q$a;
import android.view.View;
import android.graphics.Rect;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.relation.explore.presenter.gallery.l;
import ec5.q$b;
import ec5.q;
import ec5.g;
import iac.s0;
import gc5.d;

public class o implements ViewTreeObserver$OnGlobalLayoutListener	// class@00184c
{
    public final n b;

    public void o(n p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, o.class, "1")) {
          return;
       }
       this.b.y.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       o tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, n.class, "15")) {
          h oh = f.a(tb.y, tb.w, new y0(tb));
          oh.e(new t0(tb));
          q$a uoa = new q$a("pymk");
          uoa.e(n.B(tb.y, false));
          uoa.c(false);
          uoa.d(l.a);
          oh.c(k.a).b(new h(tb.y, tb.x)).d(uoa.a()).a(new s0(tb)).start();
       }
       return;
    }
}
