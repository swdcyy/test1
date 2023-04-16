package bx9.i$b;
import ik9.f;
import com.yxcorp.gifshow.comment.CommentParams;
import bx9.i$c;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;
import ik9.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kx9.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lx9.a;
import java.util.List;
import java.util.ArrayList;
import jx9.a;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.entity.QPhoto;

public class i$b extends f	// class@000504
{
    public final CommentParams b;
    public final i$c c;

    public void i$b(CommentParams p0,i$c p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public e a(CommentsFragment p0){
       p0 = PatchProxy.applyOneRefs(p0, this, i$b.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       e uoe = new e();
       e b = uoe.b;
       b.U7(new b());
       b.U7(new a());
       return uoe;
    }
    public List b(CommentsFragment p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, i$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add(new a(p0, this.b.mQPhoto));
       i$b tc = this.c;
       if (tc != null) {
          obj.add(tc);
       }
       return obj;
    }
}
