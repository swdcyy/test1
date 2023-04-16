package h92.z;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import h92.s;
import h92.t;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import h92.s$c;
import h92.u;
import java.lang.Class;
import h92.v;
import h92.s$d;
import h92.w;
import h92.x;
import h92.y;
import mm8.a;

public final class z implements b	// class@002d2e
{

    public void z(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("explicitGiftSupplierAccessId", new t(this, p1));
       p0.h(s$c.class, new u(this, p1));
       p0.i("giftGuideInfoSupplierAccessId", new v(this, p1));
       p0.h(s$d.class, new w(this, p1));
       x ox = new x(this, p1);
       String str = "SEND_GUIDE_GIFT_RESULT_OBSERVABLE_ACCESS_ID";
       try{
          p0.i(str, ox);
          p0.h(s.class, new y(this, p1));
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
