package com.yxcorp.gifshow.relation.explore.search.d$b;
import qvb.q;
import com.yxcorp.gifshow.relation.explore.search.d;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import qvb.a;
import android.view.ViewGroup;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.os.IBinder;
import android.widget.EditText;
import com.yxcorp.utility.n;
import java.util.Objects;
import com.yxcorp.gifshow.relation.explore.search.c;
import com.yxcorp.gifshow.relation.explore.search.a;
import java.lang.Integer;
import lnc.i3;
import k2b.e0;
import k2b.u1;

public class d$b implements q	// class@001878
{
    public final d b;

    public void d$b(d p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       d$b uob = d$b.class;
       String str = "1";
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uob, str)) {
          return;
       }
       if (this.b.p.isEmpty()) {
          this.b.w.setVisibility(4);
       }else {
          this.b.w.setVisibility(0);
          if (p0) {
             this.b.s.N1();
          }
          n.E(this.b.getContext(), this.b.u.getWindowToken());
          d$b tb = this.b;
          Objects.requireNonNull(tb);
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, tb, d.class, "10") && tb.t == null) {
             tb.t = true;
             d p = tb.p;
             c q = p.q;
             int count = p.getCount();
             if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidTwoRefs(q, Integer.valueOf(count), objArray, a.class, str)) {
                i3 oi3 = i3.f();
                String str1 = (count > 5)? "NORMAL": "LESS";
                oi3.d("resultnum_type", str1);
                a.a = oi3.e();
                a.b = q;
             }
             u1.L0(tb.s);
          }
       }
       return;
    }
}
