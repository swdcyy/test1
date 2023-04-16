package eq4.a;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import d0c.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel;
import java.lang.Boolean;

public abstract class a extends RecyclerView$ViewHolder	// class@00207a
{
    public boolean a;

    public void a(View p0){
       a.p(p0, "itemView");
       super(p0);
    }
    public abstract View a();
    public void b(int p0,d p1){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, a.class, "2")) {
          return;
       }
       a.p(p1, "item");
       return;
    }
    public void c(int p0,d p1,List p2,FontViewModel p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, p3, this, a.class, "4")) {
          return;
       }
       a.p(p1, "item");
       a.p(p2, "payloads");
       a.p(p3, "fontVM");
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, a.class, "3")) {
          a.p(p1, "item");
          a.p(p2, "payloads");
          this.b(p0, p1);
       }
       return;
    }
    public final void d(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "1")) {
          return;
       }
       if (this.a == p0) {
          return;
       }
       this.a = p0;
       this.a().setSelected(p0);
       return;
    }
}
