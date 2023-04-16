package g6a.a0;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.NasaGrootRecommendUserVideoFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import g6a.t;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.e;
import g6a.u;
import g6a.v;
import java.lang.String;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import g6a.w;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.c;
import g6a.x;
import g6a.y;
import g6a.z;
import mm8.a;

public final class a0 implements b	// class@0023b0
{

    public void a0(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(BaseFragment.class, new t(this, p1));
       p0.h(e.class, new u(this, p1));
       p0.i("FOLLOW_STATUS_CHANGE", new v(this, p1));
       p0.h(NasaBizParam.class, new w(this, p1));
       p0.h(c.class, new x(this, p1));
       y oy = new y(this, p1);
       String str = "ITEM_CARD_PRE_PAGE_COUNT";
       try{
          p0.i(str, oy);
          p0.h(NasaGrootRecommendUserVideoFragment.class, new z(this, p1));
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
