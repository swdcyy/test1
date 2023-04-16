package ol1.m;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import ol1.b;
import ol1.d;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ol1.e;
import ol1.f;
import ug1.p;
import ol1.g;
import java.lang.Class;
import mk1.h;
import ol1.h;
import p91.m;
import ol1.i;
import ug1.u;
import ol1.j;
import ol1.k;
import ol1.l;
import ol1.c;
import mm8.a;

public final class m implements b	// class@003536
{

    public void m(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("LIVE_GIFT_PANE_RIGHT_TOP_BANNER_ACTIVITY", new d(this, p1));
       p0.i("LIVE_GIFT_PANE_RIGHT_TOP_BANNER_SERVICE", new e(this, p1));
       p0.i("LIVE_GIFT_PANE_RIGHT_TOP_BANNER_IS_ANCHOR", new f(this, p1));
       p0.h(p.class, new g(this, p1));
       p0.h(h.class, new h(this, p1));
       p0.h(m.class, new i(this, p1));
       p0.h(u.class, new j(this, p1));
       p0.i("LIVE_SERVICE_MANAGER", new k(this, p1));
       l ol = new l(this, p1);
       String str = "LIVE_GIFT_PANE_RIGHT_TOP_BANNER_VIEW_CONTAINER";
       try{
          p0.i(str, ol);
          p0.h(b.class, new c(this, p1));
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
