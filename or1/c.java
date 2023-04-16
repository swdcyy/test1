package or1.c;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.LiveAudienceMultiLineGiftBattleDataBinding;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import tr1.b;
import com.kuaishou.protobuf.livestream.nano.LiveScoreLineChatColorInfo;

public final class c implements Observer	// class@003560
{
    public final LiveAudienceMultiLineGiftBattleDataBinding b;

    public void c(LiveAudienceMultiLineGiftBattleDataBinding p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else {
          a.o(p0, "colorInfo");
          p0 = p0.entrySet().iterator();
          while (p0.hasNext()) {
             Map$Entry uEntry = p0.next();
             this.b.h(uEntry.getKey()).f(uEntry.getValue());
          }
       }
       return;
    }
}
