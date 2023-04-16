package dlc.y0;
import erd.g;
import dlc.a1;
import java.lang.Object;
import xkc.a;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.TrendingInfo;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import xh7.b;
import qh7.b;
import qh7.a;
import dlc.z0;
import java.lang.Runnable;
import ekd.k1;

public final class y0 implements g	// class@00227c
{
    public final a1 b;

    public void y0(a1 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       y0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, a1.class, "4")) {
       }else if(p0 != null){
          a a = p0.a;
          if (a != null) {
             if (a.isTopicTrending()) {
                a.b(b.j(tb.getActivity(), p0.a.mLinkUrl), null);
             }else {
                z0 oz0 = new z0(tb, p0);
                tb.p = oz0;
                k1.r(oz0, 300);
             }
          }
       }
       return;
    }
}
