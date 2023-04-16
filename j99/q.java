package j99.q;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import j99.t$a;
import j99.h;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import j99.i;
import j99.j;
import de5.a;
import j99.k;
import java.lang.Class;
import j99.l;
import j99.m;
import j99.n;
import j99.o;
import j99.p;
import mm8.a;

public final class q implements b	// class@0027cf
{

    public void q(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("ATLAS_LOAD_HELPER", new h(this, p1));
       p0.i("COVER_SHOWED_LIST", new i(this, p1));
       p0.i("DETAIL_INNER_ATLAS_GESTURE_CONFLICT_HELPER", new j(this, p1));
       p0.h(a.class, new k(this, p1));
       p0.i("DETAIL_DOUBLE_CLICK_LISTENERS", new l(this, p1));
       p0.i("DETAIL_DOUBLE_CLICK_LIKE", new m(this, p1));
       p0.i("DETAIL_ATLAS_OUTER_DOUBLE_CLICK_LISTENERS", new n(this, p1));
       o oo = new o(this, p1);
       String str = "ATLAS_ADAPTER_POSITION";
       try{
          p0.i(str, oo);
          p0.h(t$a.class, new p(this, p1));
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
