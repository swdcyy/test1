package cy1.p;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.live.common.core.component.topbar.topuser.i;
import cy1.l;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import cy1.m;
import cy1.n;
import cy1.o;
import java.lang.Class;
import mm8.a;

public final class p implements b	// class@001eb9
{

    public void p(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("AUDIENCE_NUMBER_FETCH_SERVICE", new l(this, p1));
       p0.i("LIVE_TOP_USER_BASIC_SERVICE", new m(this, p1));
       n on = new n(this, p1);
       String str = "LIVE_TOP_USER_SERVICE";
       try{
          p0.i(str, on);
          p0.h(i.class, new o(this, p1));
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
