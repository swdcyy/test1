package gka.c;
import com.yxcorp.gifshow.fragment.f;
import com.kwai.library.widget.refresh.RefreshLayout;
import y8c.q;
import g9c.d;
import qvb.i;
import hka.l;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class c extends f	// class@002b07
{
    public int l;

    public void c(RefreshLayout p0,q p1,int p2){
       super(p0, p1.ia(), p1.q(), p1.S1());
       this.l = p2;
    }
    public void c(RecyclerFragment p0){
       super(p0, 1);
    }
    public void c(RecyclerFragment p0,int p1){
       super(p0);
       this.l = p1;
    }
    public KwaiEmptyStateView$a a(){
       KwaiEmptyStateView$a obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.a();
       obj.q(this.l);
       return obj;
    }
    public KwaiEmptyStateView$a c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       KwaiEmptyStateView$a uoa = super.c(p0);
       uoa.q(this.l);
       return uoa;
    }
}
