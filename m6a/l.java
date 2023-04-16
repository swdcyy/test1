package m6a.l;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.GrootMerchantRecommendUserFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import m6a.e;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import m6a.f;
import java.lang.String;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import m6a.g;
import m6a.h;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.MerchantRecommendUserManager;
import m6a.i;
import o6a.l;
import m6a.j;
import m6a.k;
import mm8.a;

public final class l implements b	// class@002f54
{

    public void l(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(BaseFragment.class, new e(this, p1));
       p0.i("FOLLOW_STATUS_CHANGE", new f(this, p1));
       p0.h(NasaBizParam.class, new g(this, p1));
       p0.i("ITEM_CARD_PRE_PAGE_COUNT", new h(this, p1));
       p0.h(MerchantRecommendUserManager.class, new i(this, p1));
       l ol = l.class;
       j oj = new j(this, p1);
       try{
          p0.h(ol, oj);
          p0.h(GrootMerchantRecommendUserFragment.class, new k(this, p1));
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
