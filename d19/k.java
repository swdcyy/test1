package d19.k;
import erd.g;
import com.yxcorp.gifshow.ad.detail.presenter.player.i;
import java.lang.Object;
import java.lang.Integer;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import java.lang.StringBuilder;
import com.kwai.framework.player.ui.impl.PlayerKitContentFrame;

public final class k implements g	// class@002031
{
    public final i b;

    public void k(i p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       k tb = this.b;
       if (tb.getActivity() == null) {
       }else if(tb.z != null){
          int i = p0.intValue();
          i oi = i.class;
          if (!PatchProxy.isSupport(oi) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), tb, oi, "6")) {
             tb.P8(" current Swipe "+i);
             i p = tb.p;
             boolean b = true;
             if (i == 3) {
                p.setDisableFrame(b);
             }else if(i == b){
                p.u();
             }else if(i == 4){
                p.A();
             }
          }
       }else {
          tb.R8(p0.intValue());
       }
       return;
    }
}
