package ad4.d;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ad4.h;
import com.kuaishou.merchant.transaction.base.detail.guesslike.model.a;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.kuaishou.merchant.transaction.base.detail.guesslike.model.MerchantRecommendInfoModel;
import java.util.ArrayList;
import com.kuaishou.merchant.api.core.model.Commodity$IconLabel;
import java.util.Collection;
import java.util.Collections;
import com.kuaishou.merchant.feed.model.CommodityFeed;

public class d extends Accessor	// class@000095
{
    public final a c;
    public final h d;

    public void d(h p0,a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       d tc = this.c;
       Objects.requireNonNull(tc);
       ArrayList uArrayList = PatchProxy.apply(null, tc, a.class, "1");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          a c = tc.c;
          if (c instanceof MerchantRecommendInfoModel) {
             uArrayList = new ArrayList();
             Collections.addAll(uArrayList, tc.c.getBottomTagList());
          }else if(c instanceof CommodityFeed){
             uArrayList = c.mMarketingTagList;
          }else {
             uArrayList = Collections.emptyList();
          }
       }
       return uArrayList;
    }
}
