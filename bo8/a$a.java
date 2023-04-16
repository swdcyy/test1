package bo8.a$a;
import androidx.recyclerview.widget.RecyclerView$r;
import bo8.a;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.s;
import android.view.View;
import bo8.a$b;

public class a$a extends RecyclerView$r	// class@000437
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       s os;
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       uoa = this.a;
       if (uoa.h == null) {
          int i = 1;
          if (p1 == i) {
             uoa.h = i;
          }
       }
       if (!p1 && uoa.h != null) {
          boolean b = false;
          uoa.h = b;
          if (uoa.g == null) {
             return;
          }else {
             uoa.g = b;
             if (uoa.f == null) {
                return;
             }else {
                RecyclerView$LayoutManager layoutManage = p0.getLayoutManager();
                if (layoutManage == null) {
                   return;
                }else if(layoutManage.canScrollVertically()){
                   os = this.a.r(layoutManage);
                }else {
                   os = this.a.q(layoutManage);
                }
                if (os == null) {
                   return;
                }else {
                   View view = this.a.p(layoutManage, os);
                   if (view == null) {
                      return;
                   }else {
                      int childAdapter = p0.getChildAdapterPosition(view);
                      if (childAdapter >= 0 && childAdapter < layoutManage.getItemCount()) {
                         a$a ta = this.a;
                         if (ta.i != childAdapter) {
                            ta.i = childAdapter;
                            ta.f.onSnap(childAdapter);
                         }
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
