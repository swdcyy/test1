package g6a.i;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.NasaGrootRecommendUserCardFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import g6a.b;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.e;
import g6a.c;
import g6a.d;
import java.lang.String;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import g6a.e;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.c;
import g6a.f;
import g6a.g;
import g6a.h;
import mm8.a;

public final class i implements b	// class@0023b9
{

    public void i(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(BaseFragment.class, new b(this, p1));
       p0.h(e.class, new c(this, p1));
       p0.i("FOLLOW_STATUS_CHANGE", new d(this, p1));
       p0.h(NasaBizParam.class, new e(this, p1));
       p0.h(c.class, new f(this, p1));
       g og = new g(this, p1);
       String str = "ITEM_CARD_PRE_PAGE_COUNT";
       try{
          p0.i(str, og);
          p0.h(NasaGrootRecommendUserCardFragment.class, new h(this, p1));
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
