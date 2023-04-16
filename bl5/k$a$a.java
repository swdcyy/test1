package bl5.k$a$a;
import androidx.recyclerview.widget.RecyclerView$r;
import bl5.k$a;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import bl5.k;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.kwai.emotionsdk.panel.EmotionPanelConfig;
import android.view.View;
import android.view.ViewGroup;
import el5.f;
import yk5.f;

public class k$a$a extends RecyclerView$r	// class@0004db
{
    public final k$a a;

    public void k$a$a(k$a p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       k$a$a uoa$a = k$a$a.class;
       if (PatchProxy.isSupport(uoa$a) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa$a, "1")) {
          return;
       }
       if (!p1) {
          k$a b = this.a.b;
          Objects.requireNonNull(b);
          if (PatchProxy.applyVoid(null, b, k.class, "5") || (b.p.getLayoutManager() == null || (b.p.getLayoutManager() instanceof LinearLayoutManager && b.t.isShowRecordIndex()))) {
             p1 = b.p.getLayoutManager().i0();
             View view = b.p.getLayoutManager().findViewByPosition(p1);
             if (view != null) {
                f.b().c(b.s.b(), p1, (view.getTop() - b.p.getTop()));
             }
          }
       }
       return;
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(k$a$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, k$a$a.class, "2")) {
          return;
       }
       this.a.b.S8();
       return;
    }
}
