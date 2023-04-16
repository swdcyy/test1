package hk9.c$a$c;
import android.view.View$OnClickListener;
import hk9.c$a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.tabs.panel.h$b;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

public final class c$a$c implements View$OnClickListener	// class@002697
{
    public final c$a b;

    public void c$a$c(c$a p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a$c.class, "1")) {
          return;
       }
       if (!this.b.V8()) {
          this.b.a9();
       }else {
          h$b r = this.b.r;
          a.o(r, "mTabsPanelHostFragment");
          Fragment uFragment = r.t();
          if (uFragment instanceof CommentsFragment) {
             c$a$c tb = this.b;
             Objects.requireNonNull(tb);
             if (!PatchProxy.applyVoidOneRefs(uFragment, tb, c$a.class, "6")) {
                RecyclerView recyclerView = uFragment.h0();
                a.o(recyclerView, "commentsFragment.recyclerView");
                RecyclerView$LayoutManager layoutManage = recyclerView.getLayoutManager();
                if (layoutManage instanceof LinearLayoutManager) {
                   if (layoutManage.i0() > 10) {
                      recyclerView.scrollToPosition(10);
                   }
                   recyclerView.smoothScrollToPosition(0);
                }
             }
          }
       }
       return;
    }
}
