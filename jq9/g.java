package jq9.g;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.corona.common.model.CoronaBannerFeed;
import com.kuaishou.android.model.mix.CommonMeta;
import jq9.a;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.corona.common.model.CoronaBannerCommon;
import jq9.b;
import com.yxcorp.gifshow.corona.common.model.CoronaBannerContent;
import jq9.c;
import com.kuaishou.android.model.mix.CoronaInfo;
import jq9.d;
import com.kuaishou.android.model.mix.CoverMeta;
import jq9.e;
import jq9.f;
import mm8.a;

public final class g implements b	// class@002b44
{

    public void g(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(CommonMeta.class, new a(this, p1));
       p0.h(CoronaBannerCommon.class, new b(this, p1));
       p0.h(CoronaBannerContent.class, new c(this, p1));
       p0.h(CoronaInfo.class, new d(this, p1));
       CoverMeta uCoverMeta = CoverMeta.class;
       e uoe = new e(this, p1);
       try{
          p0.h(uCoverMeta, uoe);
          p0.h(CoronaBannerFeed.class, new f(this, p1));
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
