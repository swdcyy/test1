package or1.b;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.LiveAudienceMultiLineGiftBattleDataBinding;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import pq1.a;
import tr1.b;
import ya1.n0;

public final class b implements Observer	// class@00355f
{
    public final LiveAudienceMultiLineGiftBattleDataBinding b;

    public void b(LiveAudienceMultiLineGiftBattleDataBinding p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else {
          a.o(p0, "giftLabelList");
          p0 = p0.iterator();
          while (p0.hasNext()) {
             a uoa = p0.next();
             this.b.h(uoa.a()).e(uoa.b());
          }
       }
       return;
    }
}
