package afd.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.yxcorp.gifshow.widget.LiveCoverIconView;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.yxcorp.plugin.search.utils.j0;
import android.view.View;
import ekd.m1;

public class d extends PresenterV2	// class@000022
{
    public LiveStreamFeed p;
    public LiveCoverIconView q;

    public void d(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       if (this.p == null) {
          this.q.setVisibility(8);
          return;
       }else {
          this.q.setVisibility(0);
          d tp = this.p;
          j0.b(this.q, tp, (r1.y1(tp) - 1));
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a268f);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.p = this.s8(LiveStreamFeed.class);
       return;
    }
}
