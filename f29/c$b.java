package f29.c$b;
import qvb.q;
import f29.c;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import qvb.i;
import com.yxcorp.gifshow.model.response.CommentResponse;
import com.yxcorp.gifshow.entity.QPhoto;
import qp7.x0;
import qp7.b;
import ks7.h0;

public class c$b implements q	// class@00228e
{
    public final c b;

    public void c$b(c p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
    }
    public void Z1(boolean p0,boolean p1){
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       c$b uob = c$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uob, "1")) {
          return;
       }
       if (this.b.u.L0() != null) {
          c$b tb = this.b;
          tb.t.setNumberOfComments(tb.u.L0().mCommentCount);
          this.b.E().h(this.b.t.numberOfComments(), this.b.n0());
       }
       return;
    }
}
