package jq9.e1;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.corona.common.model.TubeHomeLocalFeed;
import com.kuaishou.android.model.mix.AggregateTemplateMeta;
import jq9.z0;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.android.model.mix.CommonMeta;
import jq9.a1;
import com.kuaishou.android.model.mix.CoverMeta;
import jq9.b1;
import com.kuaishou.android.model.mix.ExtMeta;
import jq9.c1;
import jq9.d1;
import mm8.a;

public final class e1 implements b	// class@002b3f
{

    public void e1(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(AggregateTemplateMeta.class, new z0(this, p1));
       p0.h(CommonMeta.class, new a1(this, p1));
       p0.h(CoverMeta.class, new b1(this, p1));
       ExtMeta uExtMeta = ExtMeta.class;
       c1 uoc1 = new c1(this, p1);
       try{
          p0.h(uExtMeta, uoc1);
          p0.h(TubeHomeLocalFeed.class, new d1(this, p1));
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
