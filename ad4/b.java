package ad4.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ad4.h;
import com.kuaishou.merchant.transaction.base.detail.guesslike.model.a;
import java.lang.Object;
import com.kuaishou.merchant.feed.model.CommodityFeed;

public class b extends Accessor	// class@000093
{
    public final a c;
    public final h d;

    public void b(h p0,a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       a c = this.c.c;
       if (c instanceof CommodityFeed) {
       }else {
          c = null;
       }
       return c;
    }
}
