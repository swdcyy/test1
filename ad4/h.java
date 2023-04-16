package ad4.h;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.merchant.transaction.base.detail.guesslike.model.a;
import com.kuaishou.merchant.feed.model.CardStyle;
import ad4.a;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.merchant.feed.model.CommodityFeed;
import ad4.b;
import ad4.c;
import java.lang.String;
import com.kuaishou.merchant.transaction.base.detail.guesslike.model.b;
import ad4.d;
import zc4.a;
import ad4.e;
import xc4.c;
import ad4.f;
import ad4.g;
import mm8.a;

public final class h implements b	// class@000099
{

    public void h(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(CardStyle.class, new a(this, p1));
       p0.h(CommodityFeed.class, new b(this, p1));
       p0.i("ONLINE_NUMBER", new c(this, p1));
       p0.i("MARKETING_SERVICE_TITLE_LIST", new b(this, p1));
       p0.i("MARKETING_TAG_LIST", new d(this, p1));
       p0.h(a.class, new e(this, p1));
       c uoc = c.class;
       f uof = new f(this, p1);
       try{
          p0.h(uoc, uof);
          p0.h(a.class, new g(this, p1));
          return;
       }catch(java.lang.IllegalArgumentException e0){
       }
    }
    public a b(Object p0){
       return a.a(this, p0);
    }
    public b init(){
       return a.b(this);
    }
}
