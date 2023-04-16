package eja.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import eja.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView$i;

public class a extends PresenterV2	// class@0026b0
{
    public RecyclerFragment p;
    public final RecyclerView$i q;

    public void a(){
       super();
       this.q = new a$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.p.h0().getAdapter().F0(this.q);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       this.p.h0().getAdapter().I0(this.q);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       return;
    }
}
