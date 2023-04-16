package h52.e$a;
import h52.i;
import h52.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.closepage.audience.feed.recommand.LivePlayClosedV2RecommendLiveResponse;
import java.util.List;
import h52.c;
import t02.a0;
import m52.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;

public class e$a implements i	// class@002c51
{
    public final e a;

    public void e$a(e p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, e$a.class, "1")) {
          return;
       }
       e$a ta = this.a;
       e w = ta.w;
       if (w == null) {
          return;
       }
       e$a ta1 = this.a;
       this.a.t = new c(ta1.q, ta1.r, ta1.v);
       this.a.t.W0(ta.P8(w, ta.p));
       ta = this.a;
       ta.s.setAdapter(ta.t);
       return;
    }
}
