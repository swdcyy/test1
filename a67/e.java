package a67.e;
import y8c.g;
import android.util.SparseBooleanArray;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import y8c.f;
import android.view.ViewGroup;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import i2b.a;
import a67.e$a;
import ml8.c;
import g9c.a;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$b;

public class e extends g	// class@000056
{
    public BaseEditorFragment$b w;
    public SparseBooleanArray x;

    public void e(){
       super();
       this.x = new SparseBooleanArray();
    }
    public void B0(RecyclerView$ViewHolder p0){
       this.k1(p0);
    }
    public f h1(ViewGroup p0,int p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoe, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f(a.i(p0, 0x7f0d0b91), new e$a(this));
    }
    public void k1(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       super.k1(p0);
       int adapterPosit = p0.getAdapterPosition();
       if (this.w != null && !this.x.get(adapterPosit)) {
          this.x.put(adapterPosit, true);
          this.w.b(adapterPosit, this.N0(adapterPosit));
       }
       return;
    }
}
