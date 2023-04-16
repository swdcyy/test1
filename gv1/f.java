package gv1.f;
import androidx.recyclerview.widget.RecyclerView$n;
import gv1.f$a;
import nsd.u;
import lnc.a1;
import com.kuaishou.live.common.core.component.newpendant.top.tempplay.v2.container.TempPlayPendantAdapter;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import ls5.a;

public final class f extends RecyclerView$n	// class@002590
{
    public final TempPlayPendantAdapter a;
    public static final int b;
    public static final int c;
    public static final f$a d;

    static {
       f.d = new f$a(null);
       f.b = a1.e(8.00f);
       f.c = a1.e(10.00f);
    }
    public void f(TempPlayPendantAdapter p0){
       a.p(p0, "adapter");
       super();
       this.a = p0;
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, f.class, "2")) {
          return;
       }
       a.p(p0, "outRect");
       a.p(p1, "view");
       a.p(p2, "parent");
       a.p(p3, "state");
       int childAdapter = p2.getChildAdapterPosition(p1);
       p0.left = (!childAdapter)? f.b: f.b / 2;
       if (childAdapter == (this.a.getItemCount() - 1)) {
          childAdapter = PatchProxy.apply(null, this, f.class, "1");
          if (childAdapter != PatchProxyResult.class) {
             childAdapter = childAdapter.intValue();
          }else if(CollectionsKt___CollectionsKt.Y2(this.a.L0()).c()){
             childAdapter = 0;
          }else {
             childAdapter = f.c;
          }
          p0.right = childAdapter;
       }else {
          p0.right = f.b / 2;
       }
       return;
    }
}
