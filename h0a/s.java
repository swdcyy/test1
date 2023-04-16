package h0a.s;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.detail.fragments.NormalDetailContainerFragment;
import com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailBizParam;
import h0a.q;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import h0a.r;
import mm8.a;

public final class s implements b	// class@00253b
{

    public void s(){
       super();
    }
    public void a(a p0,Object p1){
       NormalDetailBizParam normalDetail = NormalDetailBizParam.class;
       q oq = new q(this, p1);
       try{
          p0.h(normalDetail, oq);
          p0.h(NormalDetailContainerFragment.class, new r(this, p1));
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
