package etb.w;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import etb.w$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import e9c.e;
import androidx.recyclerview.widget.RecyclerView$r;

public class w extends PresenterV2	// class@002811
{
    public e p;
    public RecyclerFragment q;
    public RecyclerView$r r;

    public void w(){
       super();
       this.r = new w$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, w.class, "2")) {
          return;
       }
       RecyclerView recyclerView = this.q.h0();
       if (this.p == null) {
          this.p = new e(recyclerView);
       }
       recyclerView.addOnScrollListener(this.r);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, w.class, "3")) {
          return;
       }
       this.q.h0().removeOnScrollListener(this.r);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, w.class, "1")) {
          return;
       }
       this.q = this.r8("NOTICE_BOX_FRAGMENT");
       this.p = this.t8("LOAD_MORE_HELPER");
       return;
    }
}
