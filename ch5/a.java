package ch5.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import z1.k;
import ch5.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$r;
import yg5.b0;

public class a extends PresenterV2	// class@0006c1
{
    public k p;
    public b0 q;
    public RecyclerView$r r;

    public void a(k p0){
       super();
       this.r = new a$a(this);
       this.p = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       if (this.p.get() != null) {
          this.p.get().addOnScrollListener(this.r);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       if (this.p.get() != null) {
          this.p.get().removeOnScrollListener(this.r);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.q = this.q8(b0.class);
       return;
    }
}
