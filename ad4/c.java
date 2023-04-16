package ad4.c;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ad4.h;
import com.kuaishou.merchant.transaction.base.detail.guesslike.model.a;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.feed.model.CommodityFeed;
import com.kuaishou.merchant.feed.model.BaseFeed;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class c extends Accessor	// class@000094
{
    public final a c;
    public final h d;

    public void c(h p0,a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       c tc = this.c;
       Objects.requireNonNull(tc);
       BaseFeed uBaseFeed = PatchProxy.apply(null, tc, a.class, "3");
       if (uBaseFeed != PatchProxyResult.class) {
       }else {
          a c = tc.c;
          if (c instanceof CommodityFeed) {
             uBaseFeed = c.mOnlineNum;
             if (TextUtils.x(uBaseFeed)) {
             }
          }else {
          }
       }
       return uBaseFeed;
    }
}
