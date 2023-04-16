package jq9.q0;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.corona.common.model.CoronaZoneFeed;
import com.kuaishou.android.model.mix.CommonMeta;
import jq9.k0;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.corona.common.model.CoronaZoneContent;
import jq9.l0;
import com.kuaishou.android.model.mix.CoronaInfo;
import jq9.m0;
import com.yxcorp.gifshow.corona.common.model.CoronaZoneCommon;
import jq9.n0;
import com.kuaishou.android.model.mix.CoverMeta;
import jq9.o0;
import jq9.p0;
import mm8.a;

public final class q0 implements b	// class@002b57
{

    public void q0(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(CommonMeta.class, new k0(this, p1));
       p0.h(CoronaZoneContent.class, new l0(this, p1));
       p0.h(CoronaInfo.class, new m0(this, p1));
       p0.h(CoronaZoneCommon.class, new n0(this, p1));
       CoverMeta uCoverMeta = CoverMeta.class;
       o0 oo0 = new o0(this, p1);
       try{
          p0.h(uCoverMeta, oo0);
          p0.h(CoronaZoneFeed.class, new p0(this, p1));
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
