package a64.c;
import erd.g;
import a64.g;
import java.lang.Object;
import com.kuaishou.merchant.live.bubble.model.CommodityBubbleModel;
import java.util.Objects;
import ks3.r;
import com.kuaishou.merchant.live.bubble.model.CommodityBubbleModel$BubbleItemInfo;
import java.lang.String;
import ks3.a0;
import wkd.b;
import a64.g$a;

public final class c implements g	// class@00002d
{
    public final g b;

    public void c(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       CommodityBubbleModel mLiveAction = p0.mLiveAction;
       if (mLiveAction != 1) {
          if (mLiveAction == 2 && tb.p.c()) {
             p0 = p0.mBubbleItemInfo;
             if (p0 != null) {
                tb.p.j(p0.mId);
             }else {
                tb.p.f();
             }
          }
       }else if(p0.mBubbleItemInfo != null){
          p0.mLiveStreamId = tb.q.getLiveStreamId();
          b.a(-2102382998).a(p0);
       }
       return;
    }
}
