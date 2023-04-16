package c42.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import c42.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView;
import android.app.Activity;
import android.view.View;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import z32.a;
import b42.b;

public class a extends PresenterV2	// class@0004ae
{
    public b p;
    public LiveBizParam q;
    public RecyclerView r;
    public final RecyclerView$r s;
    public static String sLivePresenterClassName = "LiveChainSideBarLoadMorePresenter";

    public void a(){
       super();
       this.s = new a$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       this.r.addOnScrollListener(this.s);
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.r = this.getActivity().findViewById(0x7f0a303e);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       this.r.removeOnScrollListener(this.s);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.q = this.q8(LiveBizParam.class);
       this.p = a.a().b(this.q);
       return;
    }
}
