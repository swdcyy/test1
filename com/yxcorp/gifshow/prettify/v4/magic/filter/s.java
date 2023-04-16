package com.yxcorp.gifshow.prettify.v4.magic.filter.s;
import erd.g;
import com.yxcorp.gifshow.prettify.v4.magic.filter.z;
import java.lang.Object;
import java.lang.Boolean;
import java.util.List;
import d1c.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xyb.a;
import o1c.w0;
import com.yxcorp.gifshow.prettify.v4.magic.filter.j;
import com.yxcorp.gifshow.prettify.v4.magic.filter.PrettifyConfigView;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import o1c.g1;
import java.lang.Runnable;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.yxcorp.gifshow.prettify.v4.magic.filter.p;
import com.kwai.feature.post.api.widget.ScrollToCenterRecyclerView;
import com.yxcorp.gifshow.prettify.v4.magic.filter.q;
import o1c.e1;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import p0c.c;
import android.view.ViewTreeObserver;
import o1c.n1;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import n1c.l;
import o1c.i1;
import java.lang.Iterable;
import ok.o;
import qk.y;
import java.lang.Math;

public final class s implements g	// class@0011d0
{
    public final z b;

    public void s(z p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       s tb = this.b;
       p0 = z.class;
       if (tb.M.g().size() > 0) {
          tb.X8();
          tb.Y8();
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, tb, p0, "17")) {
             Object[] objArray1 = new Object[0];
             a.D().E("FilterPresenter", "[filter][keypath][data] ", "refreshList", objArray1);
             w0 ow0 = tb.F.j1();
             if (ow0 == null) {
                tb.z.g();
             }else {
                FilterConfig uFilterConfi = ow0.a();
                tb.z.o();
                if (ow0.k()) {
                   uFilterConfi = ow0.f();
                }
                tb.z.post(new g1(tb, uFilterConfi));
             }
             tb.F.k0();
          }
          if (!PatchProxy.applyVoid(objArray, tb, p0, "8")) {
             z c = tb.C;
             if (c != null) {
                c.setAdapter(tb.I);
                tb.C.setLayoutManager(new LinearLayoutManager(tb.getContext(), 0, 0));
                p op = new p(tb.z, tb.F, tb.C, tb.I, tb.M);
                tb.G = c;
                tb.z.n();
                tb.A.setOnClickListener(new e1(tb));
             }
          }
          tb.h9();
          if (!PatchProxy.applyVoid(objArray, tb, p0, "11") && tb.r.b()) {
             tb.z.getViewTreeObserver().addOnGlobalLayoutListener(new n1(tb));
          }
          tb.k9();
          if (!PatchProxy.applyVoid(objArray, tb, p0, "10") && (tb.I.Z0() < 0 && (!tb.E.isEmpty() && (tb.D.b() && tb.G != null)))) {
             p0 = tb.M.a();
             if (p0 != null && (p0.a() == null || p0.a().isEmptyFilter())) {
                tb.G.a(tb.E.get(0).c(), tb.E.get(0).b());
             }else {
                tb.G.a(p0.c(), p0.b());
                if (tb.z != null) {
                   tb.z.m(Math.max(y.o(tb.E, new i1(p0)), 0));
                }
             }
          }
       }else {
          tb.X8();
          tb.j9();
       }
    label_0153 :
       return;
    }
}
