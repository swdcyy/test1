package o31.r;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import o31.o;
import o31.p;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import o31.q;
import java.lang.Class;
import mm8.a;

public final class r implements b	// class@00346f
{

    public void r(){
       super();
    }
    public void a(a p0,Object p1){
       p op = new p(this, p1);
       String str = "LIVE_AUDIENCE_STATUS_OBTAIN_SERVICE";
       try{
          p0.i(str, op);
          p0.h(o.class, new q(this, p1));
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
