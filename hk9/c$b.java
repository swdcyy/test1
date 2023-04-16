package hk9.c$b;
import yg5.a;
import hk9.c;
import ik9.i;
import java.lang.Object;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.comment.common.CommonCommentsFragment;
import ik9.c;

public final class c$b implements a	// class@00269c
{
    public final c a;
    public final i b;

    public void c$b(c p0,i p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void a(BaseFragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "1")) {
          return;
       }
       if (p0 instanceof CommonCommentsFragment) {
          p0.Sh(this.b);
       }
       c a = this.a.a;
       if (a != null) {
          a.a(p0);
       }
       return;
    }
}
