package g12.u;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import g12.q;
import g12.s;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import g12.t;
import java.lang.Class;
import mm8.a;

public final class u implements b	// class@002a3c
{

    public void u(){
       super();
    }
    public void a(a p0,Object p1){
       s os = new s(this, p1);
       String str = "live_root_view_swipe_service";
       try{
          p0.i(str, os);
          p0.h(q.class, new t(this, p1));
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
