package hk9.c$a$e;
import qvb.q;
import hk9.c$a;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import hk9.c$a$e$a;
import java.lang.Runnable;
import ekd.k1;

public final class c$a$e implements q	// class@00269a
{
    public final c$a b;

    public void c$a$e(c$a p0){
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
       c$a$e uoa$e = c$a$e.class;
       if (PatchProxy.isSupport(uoa$e) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa$e, "1")) {
          return;
       }
       p.b(this, p0, p1);
       k1.r(new c$a$e$a(this), 1);
       return;
    }
}
