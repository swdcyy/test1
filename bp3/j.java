package bp3.j;
import java.lang.Runnable;
import com.kuaishou.live.rerank.f$c;
import java.lang.Object;
import java.util.Objects;
import com.kuaishou.live.rerank.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.live.rerank.LiveRerankLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Set;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.live.rerank.d;

public final class j implements Runnable	// class@000414
{
    public final f$c b;
    public final boolean c;

    public void j(f$c p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       j tc = this.c;
       f$c b = this.b.b;
       Objects.requireNonNull(b);
       f uof = f.class;
       if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(tc), b, uof, "4")) {
          if (tc != null) {
             b.P(LiveRerankLogTag.LIVE_RERANK.appendTag("LiveRerankPresenter"), "onFinishLoading");
             b.t.clear();
             if (b.r.Y0() > 0) {
                b.P8(b.r.T0(0));
             }
             b.s.c();
          }
          if (b.S8()) {
             b.s.d();
          }
       }
       return;
    }
}
