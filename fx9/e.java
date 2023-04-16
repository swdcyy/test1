package fx9.e;
import ik9.f;
import g7a.j0;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;
import ik9.e;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fx9.i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import z4a.b;
import nx9.c;
import java.util.Objects;
import com.yxcorp.gifshow.comment.CommentParams;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.w;
import fx9.l;
import fx9.k;
import ch5.a;
import fx9.d;
import z1.k;
import lx9.a;
import cl9.q2;
import cl9.u1;
import java.util.List;
import java.util.Collections;

public class e extends f	// class@002370
{
    public final j0 b;
    public boolean c;

    public void e(j0 p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public e a(CommentsFragment p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e obj = PatchProxy.applyOneRefs(p0, this, e.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new e();
       e b = obj.b;
       b.U7(new i());
       b.U7(new b());
       if (c.f()) {
          Objects.requireNonNull(p0);
          CommentsFragment uCommentsFra = PatchProxy.apply(null, p0, CommentsFragment.class, "4");
          if (uCommentsFra != patchProxyRe) {
          }else {
             p0.Ph();
             uCommentsFra = p0.I;
          }
          if (w.e0(uCommentsFra.mQPhoto)) {
             b.U7(new l());
          }else if(!c.f()){
             b.U7(new l());
          }
       }else {
          goto label_0053 ;
       }
       b.U7(new k(this.c));
       Objects.requireNonNull(p0);
       b.U7(new a(new d(p0)));
       b.U7(new a());
       b.U7(new q2());
       b.U7(new u1());
       return obj;
    }
    public List b(CommentsFragment p0){
       p0 = PatchProxy.applyOneRefs(p0, this, e.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return Collections.singletonList(this.b);
    }
}
