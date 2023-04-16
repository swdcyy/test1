package g1b.a;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView;
import y0b.s;
import z0b.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import y0b.n;
import y0b.h;
import g1b.b;
import java.util.ArrayList;
import java.util.List;

public class a	// class@002a67
{
    public final String a;
    public RecyclerView b;
    public boolean c;
    public boolean d;

    public void a(){
       super();
       this.a = "LoadDataHelper";
    }
    public void a(RecyclerView p0){
       super();
       this.a = "LoadDataHelper";
       this.b = p0;
       this.c = false;
       this.d = false;
    }
    public void a(s p0,c p1,int p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, a.class, "1")) {
          return;
       }
       RecyclerView$LayoutManager layoutManage = this.b.getLayoutManager();
       if (layoutManage == null || (p1 != null && layoutManage.getChildCount() > 0)) {
          int itemCount = (this.d != null)? p1.getItemCount(): layoutManage.getItemCount();
          RecyclerView$LayoutParams layoutParams = layoutManage.getChildAt((layoutManage.getChildCount() - 1)).getLayoutParams();
          int viewLayoutPo = (this.c != null)? layoutParams.getViewLayoutPosition(): layoutParams.getViewAdapterPosition();
          if (viewLayoutPo >= ((itemCount - p2) - 1) && !p0.f().P()) {
             new b(p0, p0.f().M()).c();
          }
       }
    label_0074 :
       return;
    }
}
