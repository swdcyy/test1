package dlc.d0$a;
import qvb.q;
import dlc.d0;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import tkc.f;
import qvb.a;
import dlc.a0;
import java.lang.Runnable;
import ekd.k1;
import dlc.b0;
import sy6.a;
import dlc.c0;

public class d0$a implements q	// class@00223d
{
    public final d0 b;

    public void d0$a(d0 p0){
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
       d0$a uoa = d0$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       if (p0) {
          int i = this.b.q.m2();
          if (i >= (this.b.q.getCount() - 1)) {
             k1.r(new a0(this), 0);
          }
          if (i <= 1) {
             k1.r(new b0(this), 0);
          }
       }else if(!this.b.p.a0()){
          k1.r(new c0(this), 0);
       }
       return;
    }
}
