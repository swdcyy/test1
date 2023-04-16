package com.yxcorp.gifshow.prettify.v4.magic.filter.o;
import o0c.e;
import com.yxcorp.gifshow.prettify.v4.magic.filter.p;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.feature.post.api.widget.ScrollToCenterRecyclerView;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterGroup$a;
import com.yxcorp.gifshow.prettify.v4.magic.filter.q;
import com.yxcorp.gifshow.prettify.v4.magic.filter.j;
import com.kwai.robust.PatchProxyResult;
import o1c.w0;
import java.util.Iterator;
import java.util.List;
import o1c.f;
import ok.o;
import com.google.common.base.Optional;
import com.google.common.collect.Iterators;
import android.view.View;
import com.yxcorp.gifshow.prettify.v4.magic.filter.PrettifyConfigView;
import android.view.ViewGroup;
import xyb.a;
import w46.b;

public final class o implements e	// class@0011ca
{
    public final p a;

    public void o(p p0){
       this.a = p0;
    }
    public final void a(int p0){
       p e;
       o ta = this.a;
       Objects.requireNonNull(ta);
       p op = p.class;
       if (!PatchProxy.isSupport(op) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), ta, op, "2")) {
          ta.c.x(p0);
          ta.b();
          op = ta.a;
          FilterGroup$a uoa = ta.d.X0(p0);
          Objects.requireNonNull(op);
          Object obj = PatchProxy.applyOneRefs(uoa, op, j.class, "29");
          if (obj != PatchProxyResult.class) {
          }else {
             obj = Iterators.t(op.g.iterator(), new f(uoa)).orNull();
          }
          int i = 8;
          int i1 = 0;
          if (obj == null) {
             if (!p0) {
                e = ta.e;
                if (e != null) {
                   e.setVisibility(i1);
                }
                ta.b.getFilterItemList().setVisibility(i);
             }
             Object[] objArray = new Object[i1];
             a.D().t("FilterGroupCtr", "No Child should not happen!", objArray);
          }else {
             e = ta.e;
             if (e != null) {
                e.setVisibility(i);
             }
             ta.b.getFilterItemList().setVisibility(i1);
             ta.b.j(obj.e());
          }
       }
       return;
    }
}
