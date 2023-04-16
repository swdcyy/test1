package nt1.f;
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

public final class f implements Observer	// class@0033cb
{
    public final LiveMultiPkMvpVC b;

    public void f(LiveMultiPkMvpVC p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
       }else {
          f tb = this.b;
          LiveMultiPkMvpVC l = tb.l;
          if (l == null) {
             a.S("opponentMvpUserView");
          }
          tb.V2(p0, l, this.b.p);
       }
       return;
    }
}
