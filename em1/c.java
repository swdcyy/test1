package em1.c;
import ok.o;
import em1.q;
import java.lang.Object;
import com.yxcorp.gifshow.models.Gift;
import com.kuaishou.live.common.core.component.gift.giftstore.api.GiftListResponse;
import java.util.List;

public final class c implements o	// class@0021b3
{
    public final q b;

    public void c(q p0){
       this.b = p0;
    }
    public final boolean apply(Object p0){
       return (this.b.a.mGifts.contains(p0) ^ 0x01);
    }
}
