package com.yxcorp.gifshow.prettify.v4.magic.filter.p;
import com.yxcorp.gifshow.prettify.v4.magic.filter.PrettifyConfigView;
import com.yxcorp.gifshow.prettify.v4.magic.filter.j;
import com.kwai.feature.post.api.widget.ScrollToCenterRecyclerView;
import com.yxcorp.gifshow.prettify.v4.magic.filter.q;
import d1c.c;
import java.lang.Object;
import com.yxcorp.gifshow.prettify.v4.magic.filter.p$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.prettify.v4.magic.filter.o;
import android.view.View;
import android.widget.LinearLayout;
import o1c.u0;
import android.view.View$OnClickListener;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.List;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterGroup$a;
import xyb.a;
import java.lang.StringBuilder;
import q87.c;

public class p	// class@0011cc
{
    public final j a;
    public final PrettifyConfigView b;
    public final ScrollToCenterRecyclerView c;
    public final q d;
    public final View e;
    public final c f;
    public final RecyclerView$r g;

    public void p(PrettifyConfigView p0,j p1,ScrollToCenterRecyclerView p2,q p3,c p4){
       View view;
       super();
       p$a uoa = new p$a(this);
       this.g = uoa;
       this.b = p0;
       this.a = p1;
       this.c = p2;
       this.d = p3;
       this.f = p4;
       p0.c(uoa);
       p3.h = new o(this);
       this.e = p0.findViewById(0x7f0a2dd8);
       if (view != null) {
          view.setOnClickListener(new u0(this));
       }
       return;
    }
    public void a(int p0,String p1){
       p op = p.class;
       if (PatchProxy.isSupport(op) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, op, "3")) {
          return;
       }
       op = this.d;
       Objects.requireNonNull(op);
       q oq = q.class;
       boolean b = false;
       if (PatchProxy.isSupport(oq)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, op, oq, "7");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
          label_0038 :
             int i = 0;
             while (true) {
                if (i < op.g.size()) {
                   if (op.g.get(i).a(p0, p1)) {
                      b = op.a1(i, b);
                   }else {
                      i = i + 1;
                   }
                }else {
                   Object[] objArray = new Object[b];
                   a.D().s(q.k, "This should never happen: No group match "+p0+", "+p1, objArray);
                }
             }
          }
       }else {
          goto label_0038 ;
       }
       if (b) {
          this.c.x(this.d.Z0());
          this.b();
       }
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, p.class, "1")) {
          return;
       }
       boolean b = false;
       p op = (this.d.Z0() >= 0 && this.d.Y0().a == -111)? 1: null;
       if (op) {
          this.a.Z0(b);
       }
       p ta = this.a;
       List list = (op)? this.f.l(): this.f.g();
       ta.t1(list);
       return;
    }
}
