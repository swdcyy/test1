package eia.v;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import eia.q;
import eia.a;
import eia.r;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.smile.gifshow.annotation.provider.v2.Accessors;
import eia.s;
import java.lang.String;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import eia.t;
import eia.u;
import mm8.a;

public final class v implements b	// class@00269e
{

    public void v(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(a.class, new r(this, p1));
       if (p1.m != null) {
          Accessors.d().b(p1.m).a(p0, p1.m);
       }
       p0.i("DETAIL_ACTION_BAR_PARAM", new s(this, p1));
       NasaBizParam nasaBizParam = NasaBizParam.class;
       t ot = new t(this, p1);
       try{
          p0.h(nasaBizParam, ot);
          p0.h(q.class, new u(this, p1));
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
