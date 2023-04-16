package q90.f$h;
import java.lang.Runnable;
import com.kuaishou.gifshow.kuaishan.ui.feed.KSFeedListFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.kuaishou.gifshow.kuaishan.ui.feed.KSStaggeredGridLayoutManager;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$a;
import qvb.i;
import t90.c;

public final class f$h implements Runnable	// class@00298f
{
    public final KSFeedListFragment b;

    public void f$h(KSFeedListFragment p0){
       this.b = p0;
       super();
    }
    public final void run(){
       int firstChildPo;
       RecyclerView recyclerView;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f$h.class, "1")) {
          return;
       }
       f$h tb = this.b;
       Objects.requireNonNull(tb);
       RecyclerView obj = PatchProxy.apply(objArray, tb, KSFeedListFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          obj.booleanValue();
       }else if(TextUtils.x(tb.F)){
          obj = tb.h0();
          a.o(obj, "recyclerView");
          if (obj.getLayoutManager() instanceof KSStaggeredGridLayoutManager) {
             obj = tb.h0();
             a.o(obj, "recyclerView");
             RecyclerView$LayoutManager layoutManage = obj.getLayoutManager();
             Objects.requireNonNull(layoutManage, "null cannot be cast to non-null type com.kuaishou.gifshow.kuaishan.ui.feed.KSStaggeredGridLayoutManager");
             firstChildPo = layoutManage.getFirstChildPosition();
          }else {
             firstChildPo = -1;
          }
          if (firstChildPo <= 0) {
             firstChildPo = KSDataManager.q.a().A0(tb.F);
             if (firstChildPo > 0) {
                i oi = tb.q();
                a.o(oi, "pageList");
                if (firstChildPo < oi.getCount()) {
                   recyclerView = tb.h0();
                   a.o(recyclerView, "recyclerView");
                   i oi1 = tb.q();
                   a.o(oi1, "pageList");
                   c.a.a(firstChildPo, false, recyclerView, oi1);
                }
             }
          }
       }
       return;
    }
}
