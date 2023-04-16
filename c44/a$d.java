package c44.a$d;
import androidx.recyclerview.widget.RecyclerView$r;
import c44.a;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.View;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

public final class a$d extends RecyclerView$r	// class@0004a8
{
    public final a a;

    public void a$d(a p0){
       this.a = p0;
       super();
    }
    public void b(RecyclerView p0,int p1,int p2){
       int b;
       if (PatchProxy.isSupport(a$d.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, a$d.class, "1")) {
          return;
       }
       a p = this.a.p;
       if (p != null && !p.getVisibility()) {
          a$d ta = this.a;
          a x = ta.x;
          Objects.requireNonNull(ta);
          a obj = PatchProxy.applyOneRefs(x, ta, a.class, "9");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             obj = ta.s;
             if (obj == null) {
                a.S("mListView");
             }
             RecyclerView$LayoutManager layoutManage = obj.getLayoutManager();
             if (layoutManage != null) {
                b = ta.S8(x);
                if (b >= 0 && (layoutManage instanceof LinearLayoutManager && b <= layoutManage.c())) {
                   b = true;
                }
             }
             b = false;
          }
          if (b) {
             p = this.a.p;
             if (p != null) {
                p.setVisibility(8);
             }
             a.P8(this.a).removeOnScrollListener(this);
          }
       }
    label_007d :
       return;
    }
}
