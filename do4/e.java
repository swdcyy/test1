package do4.e;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import kotlin.collections.ArraysKt___ArraysKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.ViewGroup;

public abstract class e extends RecyclerView$r	// class@001f47
{
    public int a;

    public void e(int p0){
       super();
       this.a = p0;
    }
    public void a(RecyclerView p0,int p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoe, "1")) {
          return;
       }
       a.p(p0, "recyclerView");
       if (p1 == 1) {
          this.d(p0);
       }
       return;
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, e.class, "2")) {
          return;
       }
       a.p(p0, "recyclerView");
       if (p2 > 0) {
          this.d(p0);
       }
       return;
    }
    public abstract void c();
    public final void d(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "3")) {
          return;
       }
       RecyclerView$LayoutManager layoutManage = p0.getLayoutManager();
       if (layoutManage != null) {
          int i = -1;
          if (layoutManage instanceof StaggeredGridLayoutManager) {
             int[] ointArray = layoutManage.findLastVisibleItemPositions(null);
             a.o(ointArray, "layoutManager.findLastVisibleItemPositions\(null\)");
             Integer integer = ArraysKt___ArraysKt.tk(ointArray);
             if (integer != null) {
                i = integer.intValue();
             }
          }else if(layoutManage instanceof LinearLayoutManager){
             i = layoutManage.c();
          }
          if (p0.getChildCount() > 0) {
             a.o(layoutManage, "layoutManager");
             if ((i + this.a) >= (layoutManage.getItemCount() - 1)) {
                this.c();
             }
          }
       }
    label_0052 :
       return;
    }
}
