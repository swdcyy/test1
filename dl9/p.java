package dl9.p;
import com.yxcorp.gifshow.comment.e$b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.comment.e;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.QComment;
import ek9.c1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import dl9.p$a;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.comment.e$g;
import java.lang.Throwable;

public final class p extends PresenterV2 implements e$b	// class@001f94
{
    public final int p;
    public e q;
    public final CommentsFragment r;

    public void p(CommentsFragment p0){
       a.p(p0, "mFragment");
       super();
       this.r = p0;
       this.p = 10;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, p.class, "2")) {
          return;
       }
       p tq = this.q;
       if (tq == null) {
          a.S("mCommentHelper");
       }
       tq.b(this);
       return;
    }
    public void H5(QPhoto p0,QComment p1){
       boolean b;
       p op = p.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, op, "3")) {
          return;
       }
       c1.e(this, p0, p1);
       p0 = PatchProxy.apply(null, this, op, "4");
       if (p0 != PatchProxyResult.class) {
          b = p0.booleanValue();
       }else {
          i oi = this.r.q();
          a.o(oi, "mFragment.pageList");
          b = (oi.getCount() <= this.p)? true: false;
       }
       if (b) {
          k1.r(new p$a(this), 100);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, p.class, "6")) {
          return;
       }
       p tq = this.q;
       if (tq == null) {
          a.S("mCommentHelper");
       }
       tq.j(this);
       return;
    }
    public void N1(QPhoto p0,QComment p1){
       c1.b(this, p0, p1);
    }
    public void P1(QPhoto p0,QComment p1,e$g p2){
       c1.c(this, p0, p1, p2);
    }
    public void c6(QPhoto p0,QComment p1,Throwable p2){
       c1.a(this, p0, p1, p2);
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, p.class, "1")) {
          return;
       }
       Object obj = this.r8("COMMENT_HELPER");
       a.o(obj, "inject\(CommentAccessIds.COMMENT_HELPER\)");
       this.q = obj;
       return;
    }
    public void n7(QPhoto p0,QComment p1,Throwable p2){
       c1.f(this, p0, p1, p2);
    }
    public void t1(QPhoto p0,QComment p1,Throwable p2){
       c1.d(this, p0, p1, p2);
    }
}
