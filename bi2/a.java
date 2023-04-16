package bi2.a;
import erd.g;
import bi2.c;
import java.lang.Object;
import com.kuaishou.live.core.show.redpacket.richcard.http.RichCardInfoResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.redpacket.richcard.core.LiveRichCardStateManager;
import pp.c;
import java.util.List;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.show.redpacket.richcard.http.RichCardInfoResponseData;
import com.kuaishou.live.common.core.component.gift.base.model.Model;

public final class a implements g	// class@0003f3
{
    public final c b;

    public void a(c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          b.S(LiveRichCardStateManager.h.f().appendTag("LiveFetchRichCardInfoModel"), "[LiveFetchRichCardInfoModel][fetchRichCardInfo]", "data", p0);
          this.b.d("fetchRichCardInfo", p0.getData());
       }
       return;
    }
}
