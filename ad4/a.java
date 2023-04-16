package ad4.a;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ad4.h;
import com.kuaishou.merchant.transaction.base.detail.guesslike.model.a;
import java.lang.Object;
import com.kuaishou.merchant.feed.model.CommodityFeed;
import com.kuaishou.merchant.feed.model.BaseFeed;
import com.kuaishou.merchant.feed.model.CardStyle;

public class a extends Accessor	// class@000092
{
    public final a c;
    public final h d;

    public void a(h p0,a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       BaseFeed mCardStyle;
       a c = this.c.c;
       if (c instanceof CommodityFeed) {
          mCardStyle = c.mCardStyle;
          if (mCardStyle != null) {
          label_0011 :
             return mCardStyle;
          }
       }
       mCardStyle = CardStyle.EMPTY;
       goto label_0011 ;
    }
}
