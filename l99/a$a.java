package l99.a$a;
import androidx.recyclerview.widget.RecyclerView$r;
import m99.f;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.Math;
import android.util.SparseIntArray;

public final class a$a extends RecyclerView$r	// class@002cd3
{
    public final f a;

    public void a$a(f p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       a.p(p0, "recyclerView");
       if (!p1) {
          p0.removeOnScrollListener(this);
          this.a.t1(false);
          RecyclerView$LayoutManager layoutManage = p0.getLayoutManager();
          if (layoutManage instanceof LinearLayoutManager) {
             p1 = layoutManage.i0();
             int i = Math.min(layoutManage.c(), (this.a.s1() - 1));
             if (p1 <= i) {
                int i1 = this.a.r1().get(p1) + 1;
                this.a.r1().put(p1, i1);
                while (p1 != i) {
                   p1++;
                }
             }
          }
       }
       return;
    }
}
