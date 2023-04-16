package com.yxcorp.gifshow.featured.detail.featured.presenter.k$b;
import qvb.q;
import com.yxcorp.gifshow.featured.detail.featured.presenter.k;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.library.widget.popup.common.c;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import qvb.i;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.featured.detail.featured.t;
import com.yxcorp.gifshow.refresh.RefreshType;
import java.lang.Math;
import java.util.List;
import kda.f;
import java.util.Collection;
import java.util.ArrayList;
import kotlin.jvm.internal.a;
import qvb.p;

public class k$b implements q	// class@000f7b
{
    public final k b;

    public void k$b(k p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p0.t = false;
    }
    public void Z1(boolean p0,boolean p1){
       k$b uob = k$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uob, "1")) {
          return;
       }
       if (p0 && !p1) {
          k v = this.b.v;
          if (v != null) {
             v.o();
          }
          k$b tb = this.b;
          Objects.requireNonNull(tb);
          RefreshType obj = PatchProxy.apply(null, tb, k.class, "9");
          int i = 0;
          if (obj != PatchProxyResult.class) {
             obj = obj.booleanValue();
          }else if(tb.q.X0() instanceof t){
             obj = tb.q.X0().u2();
             if (obj != RefreshType.BOTTOM_TAB_CLICK && (obj != RefreshType.BACK_CLICK && (obj == RefreshType.PULL_DOWN || obj == RefreshType.TAB_CLICK))) {
                obj = true;
             }
          }
          obj = false;
          tb.u = obj;
          if (this.b.R8()) {
             int i1 = this.b.q.a0() + 1;
             int i2 = Math.max(i, (i1 - this.b.S8()));
             this.b.s.clear();
             f.a();
             if (this.b.q.e0() != null && (this.b.q.e0().size() > 0 && (i1 >= i2 && i1 <= this.b.q.e0().size()))) {
                k$b tb1 = this.b;
                tb1.s.addAll(tb1.q.e0().subList(i2, i1));
                v = this.b.s;
                if (!PatchProxy.applyVoidOneRefs(v, null, f.class, "1")) {
                   a.p(v, "histories");
                   f.a.addAll(v);
                }
                v.t = true;
             }
          }
       }
    label_00eb :
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(k$b.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, k$b.class, "2")) {
          return;
       }
       this.b.X8();
       return;
    }
}
