package g6a.r;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.NasaGrootRecommendUserFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import g6a.k;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.e;
import g6a.l;
import g6a.m;
import java.lang.String;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import g6a.n;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.c;
import g6a.o;
import g6a.p;
import g6a.q;
import mm8.a;

public final class r implements b	// class@0023c2
{

    public void r(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(BaseFragment.class, new k(this, p1));
       p0.h(e.class, new l(this, p1));
       p0.i("FOLLOW_STATUS_CHANGE", new m(this, p1));
       p0.h(NasaBizParam.class, new n(this, p1));
       p0.h(c.class, new o(this, p1));
       p op = new p(this, p1);
       String str = "ITEM_CARD_PRE_PAGE_COUNT";
       try{
          p0.i(str, op);
          p0.h(NasaGrootRecommendUserFragment.class, new q(this, p1));
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
