package go1.d;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import go1.a;
import go1.b;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import go1.c;
import java.lang.Class;
import mm8.a;

public final class d implements b	// class@002532
{

    public void d(){
       super();
    }
    public void a(a p0,Object p1){
       b uob = new b(this, p1);
       String str = "LIVE_HEART_PARTICLE_SERVICE";
       try{
          p0.i(str, uob);
          p0.h(a.class, new c(this, p1));
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
