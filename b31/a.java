package b31.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import b31.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import yxb.b;
import android.app.Activity;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.yxcorp.gifshow.detail.slideplay.b;
import qvb.i;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import com.yxcorp.utility.n;
import android.content.res.Resources;

public class a extends PresenterV2	// class@00030e
{
    public LiveBizParam p;
    public i q;
    public RecyclerView r;
    public int s;
    public final RecyclerView$r t;
    public static String sLivePresenterClassName = "LivePhotoFeedSideBarLoadMoreDataPresenter";

    public void a(){
       super();
       this.t = new a$a(this);
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "3")) {
          return;
       }
       if (d.a(-430326918).cR(this.getActivity())) {
          a tp = this.p;
          if (tp != null) {
             objArray = b.e(tp.mSlidePlayId);
          }
          if (objArray != null) {
             this.q = objArray.M7();
          }
       }
       this.r.addOnScrollListener(this.t);
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.r = this.getActivity().findViewById(0x7f0a303e);
       this.s = (int)((double)((((float)n.t(this.getActivity()) - this.l8().getDimension(0x7f070c54)) - this.l8().getDimension(0x7f070c55)) / this.l8().getDimension(0x7f070c52)) * 0x3fe3333333333333);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       this.r.removeOnScrollListener(this.t);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.s8(LiveBizParam.class);
       return;
    }
}
