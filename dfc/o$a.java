package dfc.o$a;
import qvb.q;
import dfc.o;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import im8.f;
import java.lang.Long;
import bfc.i;
import dfc.a;
import brd.y;
import java.util.Objects;
import android.view.View;
import android.view.ViewGroup;
import i2b.a;
import lnc.i3;
import k2b.u1;
import com.smile.gifmaker.mvps.presenter.a;

public class o$a implements q	// class@0021ac
{
    public boolean b;
    public final o c;

    public void o$a(o p0){
       this.c = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void Z1(boolean p0,boolean p1){
       o$a uoa = o$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       if (!p0) {
          return;
       }
       p0 = this.c.v.get().booleanValue();
       this.b = p0;
       if (p0 && this.c.s.get().longValue() - false > 0) {
          this.c.t.onNext(a.a("Request load entrance data as auto refresh.", 2, i.b()));
       }
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       o$a tc;
       o w;
       o oo = o.class;
       o$a uoa = o$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "2")) {
          return;
       }
       if (!p0) {
          return;
       }
       Object[] objArray = null;
       if (this.b != null) {
          this.c.R8();
          tc = this.c;
          Objects.requireNonNull(tc);
          if (!PatchProxy.applyVoid(objArray, tc, oo, "6")) {
             try{
                o x = tc.x;
                if (x != null) {
                   if (tc.w == null) {
                      View view = x.findViewById(R.id.news_entrance);
                      tc.w = view;
                      if (view == null) {
                         tc.w = a.k(tc.x, 0x7f0d10a3, true);
                      }
                      tc.P8(false);
                   }
                   w = tc.w;
                   if (w != null) {
                      w.setVisibility(false);
                   }
                }
             }catch(java.lang.Exception e0){
                i3 oi3 = i3.f();
                oi3.d("reason", "Can not inflate xml!");
                u1.R("reminder_detail_flow", oi3.e(), 13);
             }
          }
       }else {
          tc = this.c;
          Objects.requireNonNull(tc);
          if (!PatchProxy.applyVoid(objArray, tc, oo, "7") && tc.x != null) {
             w = tc.w;
             if (w != null) {
                w.setVisibility(8);
             }
          }
       }
    }
}
