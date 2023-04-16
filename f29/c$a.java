package f29.c$a;
import com.yxcorp.gifshow.comment.e$b;
import f29.c;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.QComment;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.comment.e$g;
import hy.e;
import java.util.Objects;
import qp7.x0;
import qp7.b;
import ks7.h0;
import java.lang.Throwable;
import ek9.c1;

public class c$a implements e$b	// class@00228d
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public void H5(QPhoto p0,QComment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c$a.class, "4")) {
          return;
       }
       this.a(p0);
       return;
    }
    public void N1(QPhoto p0,QComment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c$a.class, "1")) {
          return;
       }
       this.a(p0);
       return;
    }
    public void P1(QPhoto p0,QComment p1,e$g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c$a.class, "2")) {
          return;
       }
       this.a(p0);
       e uoe = e.G();
       Objects.requireNonNull(uoe);
       if (!PatchProxy.applyVoid(null, uoe, e.class, "23") && uoe.F()) {
          uoe.u = 1;
       }
       return;
    }
    public final void a(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "6")) {
          return;
       }
       if (!this.b.t.equals(p0)) {
          return;
       }
       c$a tb = this.b;
       tb.t = p0;
       tb.E().h(this.b.t.numberOfComments(), this.b.n0());
       return;
    }
    public void c6(QPhoto p0,QComment p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c$a.class, "3")) {
          return;
       }
       this.a(p0);
       return;
    }
    public void n7(QPhoto p0,QComment p1,Throwable p2){
       c1.f(this, p0, p1, p2);
    }
    public void t1(QPhoto p0,QComment p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c$a.class, "5")) {
          return;
       }
       this.a(p0);
       return;
    }
}
