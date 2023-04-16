package a64.b;
import erd.g;
import a64.g;
import java.lang.Object;
import com.kuaishou.merchant.live.bubble.model.CommodityBubbleModel;
import java.util.Objects;
import java.lang.String;
import ks3.a0;
import wkd.b;
import a64.g$a;

public final class b implements g	// class@00002c
{
    public final g b;

    public void b(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.mBubbleItemInfo == null) {
       }else {
          p0.mLiveStreamId = tb.q.getLiveStreamId();
          b.a(-2102382998).a(p0);
       }
       return;
    }
}
