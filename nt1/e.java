package nt1.e;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multipk.game.vc.mvp.LiveMultiPkMvpVC;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.multipk.game.vc.mvp.LiveMultiPkMvpTopScoreUserView;
import ht1.a;

public final class e implements Observer	// class@0033ca
{
    public final LiveMultiPkMvpVC b;

    public void e(LiveMultiPkMvpVC p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
       }else {
          e tb = this.b;
          LiveMultiPkMvpVC k = tb.k;
          if (k == null) {
             a.S("selfMvpUserView");
          }
          tb.V2(p0, k, this.b.p);
       }
       return;
    }
}
