package cl5.h$a;
import androidx.recyclerview.widget.RecyclerView$r;
import cl5.h;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.kwai.emotionsdk.panel.EmotionPanelConfig;
import android.view.View;
import android.view.ViewGroup;
import el5.f;
import yk5.f;

public class h$a extends RecyclerView$r	// class@0006f5
{
    public final h a;

    public void h$a(h p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       h$a uoa = h$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       if (!p1) {
          h$a ta = this.a;
          Objects.requireNonNull(ta);
          if (PatchProxy.applyVoid(null, ta, h.class, "6") || (ta.p.getLayoutManager() == null || (ta.p.getLayoutManager() instanceof LinearLayoutManager && ta.r.isShowRecordIndex()))) {
             p1 = ta.p.getLayoutManager().i0();
             View view = ta.p.getLayoutManager().findViewByPosition(p1);
             if (view != null) {
                f.b().c(ta.q.b(), p1, (view.getTop() - ta.p.getTop()));
             }
          }
       }
       return;
    }
}
