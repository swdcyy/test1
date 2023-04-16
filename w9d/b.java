package w9d.b;
import qvb.f;
import w9d.b$a;
import qvb.q;
import qvb.a;
import java.lang.Object;
import java.util.List;
import la6.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public abstract class b extends f	// class@004141
{
    public boolean p;
    public int q;
    public int r;
    public q s;

    public void b(boolean p0,int p1){
       super();
       b$a uoa = new b$a(this);
       this.s = uoa;
       this.p = p0;
       this.q = p1;
       this.h(uoa);
    }
    public void M1(Object p0,List p1){
       this.d2(p0, p1);
    }
    public void d2(b p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "1")) {
          return;
       }
       super.d2(p0, p1);
       this.r = this.r + 1;
       return;
    }
    public void h2(boolean p0,boolean p1){
    }
}
