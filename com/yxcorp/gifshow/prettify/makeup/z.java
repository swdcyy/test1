package com.yxcorp.gifshow.prettify.makeup.z;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.prettify.makeup.b0;
import com.yxcorp.gifshow.prettify.makeup.b0$d;
import com.kwai.feature.post.api.componet.prettify.makeup.model.RecoSuiteGroup;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import n1c.l;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.prettify.makeup.m;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.prettify.makeup.a;
import p0c.f;
import com.kwai.feature.post.api.widget.PrettifyLoadingView;
import com.yxcorp.gifshow.prettify.makeup.a$b;
import com.yxcorp.gifshow.prettify.v4.magic.filter.PrettifyTagView;
import java.lang.Boolean;
import n0c.c;
import com.yxcorp.gifshow.prettify.makeup.b0$c;
import brd.t;
import xyb.a;
import java.lang.StringBuilder;
import q87.c;
import n0c.c$a;
import java.util.ArrayList;
import java.util.List;
import t45.d;
import brd.z;
import f1c.k0;
import erd.g;
import f1c.t1;
import f1c.u1;
import crd.b;

public final class z implements View$OnClickListener	// class@0011a3
{
    public final b0 b;
    public final b0$d c;
    public final RecoSuiteGroup d;
    public final int e;

    public void z(b0 p0,b0$d p1,RecoSuiteGroup p2,int p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void onClick(View p0){
       Object[] obj;
       z tb = this.b;
       z tc = this.c;
       z td = this.d;
       z te = this.e;
       Objects.requireNonNull(tb);
       if (tc.getAdapterPosition() == -1) {
       }else if(tb.m.b()){
          tb.m.e();
       }else {
          boolean b = true;
          if (td.isEmptyRecoGroup()) {
             tb.j = te;
             if (!PatchProxy.applyVoidTwoRefs(tc, td, tb, b0.class, "11")) {
                a i = tb.i;
                if (i != null && (i.i() != null && !tb.q1())) {
                   b0$d i1 = tc.i;
                   if (i1 != null) {
                      i1.c();
                   }
                   tb.e1(tc.g, "", "", "", true);
                   b0 l = tb.l;
                   Object[] objArray = null;
                   if (l != null) {
                      m om = tb.i.i();
                      Objects.requireNonNull(om);
                      obj = PatchProxy.apply(objArray, om, m.class, "30");
                      if (obj != PatchProxyResult.class) {
                         b = obj.booleanValue();
                      }else {
                         om = om.g;
                         if (om == null || !om.a()) {
                            b = false;
                         }
                      }
                      l.t(b);
                   }
                   m om1 = tb.i.i();
                   Objects.requireNonNull(om1);
                   t ot = PatchProxy.apply(objArray, om1, m.class, "25");
                   if (ot != PatchProxyResult.class) {
                   }else {
                      obj = new Object[0];
                      a.D().w("MakeupModel", "getRecoSuites, mRecoRequest:"+om1.g, obj);
                      if (om1.g == null) {
                         ot = t.just(new c$a(new ArrayList()));
                      }else if(!om1.h.isEmpty()){
                         ot = t.just(new c$a(om1.h));
                      }else {
                         ot = om1.g.b().subscribeOn(d.c).doOnNext(new k0(om1)).observeOn(d.a);
                      }
                   }
                   tb.n = ot.observeOn(d.a).subscribe(new t1(tb, td, tc), new u1(tb, tc));
                }
             }
          }else if(tb.k == tc.getAdapterPosition()){
             b = false;
          }
          tb.p1(tc, te, td, b);
       }
       return;
    }
}
