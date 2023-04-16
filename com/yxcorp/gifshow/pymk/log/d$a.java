package com.yxcorp.gifshow.pymk.log.d$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.pymk.log.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import java.util.Objects;
import a7c.h;
import e7c.b;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import g9c.d;
import g7c.l;
import g7c.m;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import gc5.b;
import ec5.h;
import ec5.f;
import g7c.k;
import gc5.f;
import com.yxcorp.gifshow.pymk.log.b;
import z1.i;
import fc5.b;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kwai.component.list.exposed.behavior.ItemExposedBehavior;
import com.yxcorp.gifshow.pymk.log.a;
import g9c.a;
import ec5.q$a;
import android.view.View;
import android.graphics.Rect;
import com.yxcorp.utility.n;
import tnc.b;
import a7c.e;
import com.yxcorp.gifshow.pymk.log.c;
import ec5.q$b;
import ec5.q;
import ec5.g;
import g7c.j;
import gc5.d;

public class d$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@0016c7
{
    public final d b;

    public void d$a(d p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d$a.class, "1")) {
          return;
       }
       this.b.c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       d$a tb = this.b;
       d d = tb.d;
       d c = tb.c;
       d e = tb.e;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidThreeRefs(d, c, e, tb, d.class, "3")) {
          h oh = e.r1();
          if (d instanceof RecyclerFragment) {
             objArray = new l(e, d.ia());
          }
          h oh1 = f.a(c, d, new m(tb));
          oh1.e(new k(e));
          q$a uoa = new q$a("pymk");
          uoa.e(n.B(c, true));
          uoa.b(objArray);
          uoa.c((oh.p().a() ^ true));
          uoa.d(c.a);
          oh1.c(b.a).b(new b(tb.c.getAdapter())).b(new a(tb.c, tb.e.R0())).d(uoa.a()).a(new j(tb, oh)).start();
       }
       return;
    }
}
