package em1.h;
import io.reactivex.g;
import em1.q;
import java.lang.Object;
import brd.v;
import d61.l0;
import com.kuaishou.live.common.core.component.gift.giftstore.api.GiftListResponse;
import brd.g;

public final class h implements g	// class@0021b8
{
    public final q b;

    public void h(q p0){
       this.b = p0;
    }
    public final void subscribe(v p0){
       GiftListResponse giftListResp = this.b.d.b(null);
       if (giftListResp != null) {
          p0.onNext(giftListResp);
       }
       p0.onComplete();
       return;
    }
}
