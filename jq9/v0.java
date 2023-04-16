package jq9.v0;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.corona.common.model.PadCoronaRankingListFeed;
import com.kuaishou.android.model.mix.CommonMeta;
import jq9.r0;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.android.model.mix.CoronaInfo;
import jq9.s0;
import com.yxcorp.gifshow.corona.common.model.PadCoronaRankingListMeta;
import jq9.t0;
import jq9.u0;
import mm8.a;

public final class v0 implements b	// class@002b61
{

    public void v0(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(CommonMeta.class, new r0(this, p1));
       p0.h(CoronaInfo.class, new s0(this, p1));
       PadCoronaRankingListMeta padCoronaRan = PadCoronaRankingListMeta.class;
       t0 ot0 = new t0(this, p1);
       try{
          p0.h(padCoronaRan, ot0);
          p0.h(PadCoronaRankingListFeed.class, new u0(this, p1));
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
