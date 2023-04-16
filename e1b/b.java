package e1b.b;
import nl8.a;
import e1b.b$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import g1b.a;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.listcomponent.module.b;
import y0b.n;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Integer;

public class b extends a	// class@0025e8
{
    public n u;
    public RecyclerView v;
    public a w;
    public int x;
    public final RecyclerView$r y;

    public void b(){
       super();
       this.y = new b$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       if (this.w == null) {
          this.w = new a(this.v);
       }
       this.v.removeOnScrollListener(this.y);
       this.v.addOnScrollListener(this.y);
       return;
    }
    public int Y8(){
       return this.x;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.u = this.R8();
       this.v = this.q8(RecyclerView.class);
       this.x = this.v8("LOAD_MORE_OFFSET", Integer.class).intValue();
       return;
    }
}
