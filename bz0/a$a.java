package bz0.a$a;
import ht5.a;
import bz0.a;
import java.lang.Object;
import ht5.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.models.Gift;
import hg2.e;
import t02.a0;
import bz0.f;
import lp3.e;
import lp3.c;
import lp3.b;

public class a$a implements a	// class@000430
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void O1(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "2")) {
          return;
       }
       this.b.q.hm((long)(p0.a.mPrice * p0.b));
       f.c(p0, 1, this.b.p, 1);
       return;
    }
    public void Yh(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "3")) {
          return;
       }
       this.b.q.hm(0);
       f.c(p0, 2, this.b.p, false);
       return;
    }
    public void a7(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       this.b.q.hm((long)(p0.a.mPrice * p0.b));
       f.c(p0, 1, this.b.p, false);
       return;
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
}
