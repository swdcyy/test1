package gqb.p$a;
import android.database.DataSetObserver;
import gqb.p;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.util.List;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public final class p$a extends DataSetObserver	// class@002b85
{
    public final p a;

    public void p$a(p p0){
       this.a = p0;
       super();
    }
    public void onChanged(){
       if (PatchProxy.applyVoid(null, this, p$a.class, "1")) {
          return;
       }
       super.onChanged();
       p$a ta = this.a;
       p s = ta.s;
       if (s != null) {
          s.W0(p.P8(ta).V0());
       }
       p s1 = this.a.s;
       if (s1 != null) {
          s1.k0();
       }
       return;
    }
}
