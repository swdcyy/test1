package gka.b;
import com.yxcorp.gifshow.fragment.e;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class b extends e	// class@002b05
{
    public int i;

    public void b(RecyclerFragment p0){
       super(p0, 1);
    }
    public void b(RecyclerFragment p0,int p1){
       super(p0);
       this.i = p1;
    }
    public KwaiEmptyStateView$a s(){
       KwaiEmptyStateView$a obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.s();
       obj.q(this.i);
       return obj;
    }
    public KwaiEmptyStateView$a t(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       KwaiEmptyStateView$a uoa = super.t(p0);
       uoa.q(this.i);
       return uoa;
    }
}
