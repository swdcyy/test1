package fl9.c;
import fl9.b;
import fl9.c$a;
import android.content.Context;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import androidx.recyclerview.widget.RecyclerView;
import g9c.d;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.ObservableLinearLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ObservableLinearLayoutManager$a;
import ek9.m1;
import q87.c;

public class c extends b	// class@00232e
{
    public RecyclerView b;
    public int c;
    public int d;
    public final ObservableLinearLayoutManager$a e;

    public void c(){
       super();
       this.c = -1;
       this.d = Integer.MIN_VALUE;
       this.e = new c$a(this);
    }
    public void a(Context p0,RecyclerFragment p1,int p2,int p3){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, c.class, "4")) {
          return;
       }
       this.b = p1.h0();
       this.c = p1.ia().b1() + p2;
       c tb = this.b;
       Object[] obj = PatchProxy.applyOneRefs(tb, this, uoc, "3");
       int i = (obj != PatchProxyResult.class)? obj.intValue(): (tb.getHeight() - tb.getPaddingBottom()) - tb.getPaddingTop();
       i--;
       this.d = i;
       if (p1.h0().getLayoutManager() instanceof ObservableLinearLayoutManager) {
          ObservableLinearLayoutManager layoutManage = p1.h0().getLayoutManager();
          layoutManage.scrollToPositionWithOffset(this.c, this.d);
          layoutManage.W0(this.e);
       }else {
          obj = new Object[0];
          m1.C().t("NormalAnchorCommentStrategy", " layoutManager is not  ObservableLinearLayoutManager!!", obj);
          p1.h0().scrollToPosition(this.c);
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, c.class, "5")) {
          return;
       }
       c tb = this.b;
       if (tb != null && tb.getLayoutManager() instanceof ObservableLinearLayoutManager) {
          this.b.getLayoutManager().X0(this.e);
       }
       this.c = -1;
       return;
    }
}
