package cl9.q2$a;
import androidx.recyclerview.widget.ObservableLinearLayoutManager$a;
import cl9.q2;
import java.lang.Object;
import androidx.recyclerview.widget.ObservableLinearLayoutManager;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yk9.f;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import java.util.Objects;
import u2.h;
import y8c.g;
import g9c.a;

public final class q2$a implements ObservableLinearLayoutManager$a	// class@000659
{
    public int a;
    public boolean b;
    public final q2 c;

    public void q2$a(q2 p0){
       this.c = p0;
       super();
    }
    public void a(ObservableLinearLayoutManager p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q2$a.class, "2")) {
          return;
       }
       if (this.a >= 5 && this.b != null) {
          q2.P8(this.c).b();
          RecyclerView recyclerView = q2.R8(this.c).h0();
          a.o(recyclerView, "mCommentsFragment.recyclerView");
          RecyclerView$LayoutManager layoutManage = recyclerView.getLayoutManager();
          Objects.requireNonNull(layoutManage, "null cannot be cast to non-null type androidx.recyclerview.widget.ObservableLinearLayoutManager");
          layoutManage.X0(this);
       }
       this.b = false;
       return;
    }
    public void b(ObservableLinearLayoutManager p0,int p1,int p2){
       h.c(this, p0, p1, p2);
    }
    public void c(ObservableLinearLayoutManager p0){
       g og;
       if (PatchProxy.applyVoidOneRefs(p0, this, q2$a.class, "1")) {
          return;
       }
       if (this.a == null) {
          og = q2.R8(this.c).g7();
          a.o(og, "mCommentsFragment.originAdapter");
          if (og.getItemCount() >= 5) {
             q2.P8(this.c).f();
             this.b = true;
          }
       }
       og = q2.R8(this.c).g7();
       a.o(og, "mCommentsFragment.originAdapter");
       this.a = og.getItemCount();
       return;
    }
}
