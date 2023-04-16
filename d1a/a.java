package d1a.a;
import yw6.j;
import java.util.List;
import qvb.i;
import ok.o;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yw6.g;
import qvb.d;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import yw6.c;
import yw6.b;
import java.lang.StringBuilder;
import lw6.a;
import java.util.Collection;
import ekd.q;
import fw6.b;
import qvb.o;

public class a extends j	// class@001e5f
{

    public void a(List p0,i p1,o p2,boolean p3){
       super(p0, p1, p2, p3);
    }
    public void C(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       g tg = this.g;
       if (!tg instanceof d) {
          return;
       }
       if (tg.r0()) {
          this.g.B1();
       }
       return;
    }
    public boolean T(){
       g obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.g;
       if (!obj instanceof d) {
          return b.a(this);
       }
       return obj.r0();
    }
    public boolean hasMore(){
       g obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.g;
       if (!obj instanceof d) {
          return super.hasMore();
       }
       return obj.Q0();
    }
    public boolean isLoading(){
       g obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.g;
       if (!obj instanceof d) {
          return super.isLoading();
       }
       return obj.isLoading();
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       g tg = this.g;
       if (!tg instanceof d) {
          return;
       }
       if (tg.Q0()) {
          this.g.B0();
       }
       return;
    }
    public void v2(boolean p0,boolean p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "6")) {
          return;
       }
       a.b("KwaiGrootTubeDataSource", "onFinishLoading firstPage = "+p0);
       if (p0) {
          List list = this.T0(this.g.getItems());
          if (q.f(list)) {
             return;
          }else {
             this.u0(list);
             this.V0(list);
          }
       }else if(this.g.x1() == 1){
          this.e(0, this.H0());
       }else {
          this.b(this.H0());
       }
       this.h.j(p0, p1);
       return;
    }
}
