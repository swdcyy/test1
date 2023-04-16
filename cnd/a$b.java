package cnd.a$b;
import com.yxcorp.gifshow.widget.UserTouchRecyclerView$a;
import cnd.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.action.SubtitleListScrollAction;
import java.util.Objects;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.view.CalculateIndexRecyclerView;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.view.OffsetLinearLayoutManager;
import android.util.SparseIntArray;
import kotlin.jvm.internal.a;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import java.lang.IllegalStateException;

public final class a$b implements UserTouchRecyclerView$a	// class@000340
{
    public final a a;

    public void a$b(a p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0,int p1,int p2){
       int i;
       RecyclerView$Adapter adapter;
       if (PatchProxy.isSupport(a$b.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, a$b.class, "1")) {
          return;
       }
       if (p0) {
          a$b ta = this.a;
          a c = ta.c;
          a d = ta.d;
          Objects.requireNonNull(d);
          if (PatchProxy.isSupport(CalculateIndexRecyclerView.class)) {
             Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p2), d, CalculateIndexRecyclerView.class, "5");
             if (obj != PatchProxyResult.class) {
                i = obj.intValue();
             label_0093 :
                c.t0(new SubtitleListScrollAction(i));
             }
          }
          if (d.getAdapter() != null) {
             int i1 = 0;
             RecyclerView$LayoutManager layoutManage = d.getLayoutManager();
             Objects.requireNonNull(layoutManage, "null cannot be cast to non-null type com.yxcrop.gifshow.v3.editor.subtitle_v2.ui.view.OffsetLinearLayoutManager");
             SparseIntArray sparseIntArr = layoutManage.W0();
             adapter = d.getAdapter();
             a.m(adapter);
             a.o(adapter, "adapter!!");
             while (i1 < adapter.getItemCount() && p2 >= 0) {
                p2 = p2 - sparseIntArr.get(i1);
                i1 = i1 + 1;
             }
             i1 = i1 - 1;
             RecyclerView$Adapter adapter1 = d.getAdapter();
             a.m(adapter1);
             a.o(adapter1, "adapter!!");
             if (i1 >= adapter1.getItemCount()) {
                i1 = i1 - 1;
             }
             i = i1;
             goto label_0093 ;
          }else {
             throw new IllegalStateException("adapter cannot be null");
          }
       }
       return;
    }
    public void b(boolean p0,int p1){
    }
}
