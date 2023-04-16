package hg2.a$a;
import hg2.e;
import hg2.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import lp3.e;
import lp3.c;
import lp3.b;

public class a$a implements e	// class@002d92
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void Nh(long p0){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoa, "3")) {
          return;
       }
       this.b.b9(p0);
       return;
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
    public void hm(long p0){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoa, "1")) {
          return;
       }
       uoa = this.b;
       a k = uoa.K;
       uoa.K = (!k - -1)? p0: k + p0;
       return;
    }
    public void ma(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "2")) {
          return;
       }
       this.b.a9();
       return;
    }
}
