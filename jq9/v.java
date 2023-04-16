package jq9.v;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.corona.common.model.CoronaSubChannelFeed;
import com.kuaishou.android.model.mix.CommonMeta;
import jq9.p;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.android.model.mix.CoronaInfo;
import jq9.q;
import com.yxcorp.gifshow.corona.common.model.CoronaSubChannelCommon;
import jq9.r;
import com.yxcorp.gifshow.corona.common.model.CoronaSubChannelContent;
import jq9.s;
import com.kuaishou.android.model.mix.CoverMeta;
import jq9.t;
import jq9.u;
import mm8.a;

public final class v implements b	// class@002b62
{

    public void v(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(CommonMeta.class, new p(this, p1));
       p0.h(CoronaInfo.class, new q(this, p1));
       p0.h(CoronaSubChannelCommon.class, new r(this, p1));
       p0.h(CoronaSubChannelContent.class, new s(this, p1));
       CoverMeta uCoverMeta = CoverMeta.class;
       t ot = new t(this, p1);
       try{
          p0.h(uCoverMeta, ot);
          p0.h(CoronaSubChannelFeed.class, new u(this, p1));
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
