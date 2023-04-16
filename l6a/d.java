package l6a.d;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.entity.NasaRecommendUserFeed;
import com.kuaishou.android.model.mix.CommonMeta;
import l6a.a;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.entity.RecommendUserMeta;
import l6a.b;
import l6a.c;
import mm8.a;

public final class d implements b	// class@002d5a
{

    public void d(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(CommonMeta.class, new a(this, p1));
       RecommendUserMeta recommendUse = RecommendUserMeta.class;
       b uob = new b(this, p1);
       try{
          p0.h(recommendUse, uob);
          p0.h(NasaRecommendUserFeed.class, new c(this, p1));
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
