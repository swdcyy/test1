package az0.n;
import erd.g;
import com.kuaishou.live.audience.component.gift.gift.LiveGiftReceiverListDialog$d;
import java.lang.Object;
import com.kuaishou.live.audience.component.gift.gift.LiveGiftReceiverListResponse;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import com.kuaishou.live.common.core.component.gift.gift.audience.LiveGiftReceiver;
import nf1.c;
import com.kuaishou.protobuf.livestream.nano.UserStateRichTextSegment;

public final class n implements g	// class@0002dc
{
    public final LiveGiftReceiverListDialog$d b;

    public void n(LiveGiftReceiverListDialog$d p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       n tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, LiveGiftReceiverListDialog$d.class, "4")) {
       }else if(q.f(p0.mItems)){
          p0 = p0.mItems.iterator();
          while (p0.hasNext()) {
             LiveGiftReceiver liveGiftRece = p0.next();
             liveGiftRece.mIconSegment = c.b.s1(liveGiftRece.mBase64Segments);
          }
       }
       return;
    }
}
