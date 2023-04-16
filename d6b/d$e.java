package d6b.d$e;
import com.kwai.library.widget.refresh.RefreshLayout$h;
import d6b.d;
import java.lang.Object;
import o17.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class d$e implements RefreshLayout$h	// class@00245a
{
    public final d a;

    public void d$e(d p0){
       this.a = p0;
       super();
    }
    public void a(float p0,float p1,boolean p2){
       i.a(this, p0, p1, p2);
    }
    public void b(){
       i.d(this);
    }
    public void pullToRefresh(){
       i.b(this);
    }
    public void refreshComplete(){
       if (PatchProxy.applyVoid(null, this, d$e.class, "1")) {
          return;
       }
       d$e ta = this.a;
       if (ta.C != null) {
          ta.C = false;
          ta.J = true;
          ta.V8(ta.A);
       }
       return;
    }
    public void releaseToRefresh(){
       i.e(this);
    }
}
