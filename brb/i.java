package brb.i;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import brb.e;
import arb.a;
import brb.f;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.smile.gifshow.annotation.provider.v2.Accessors;
import pr6.d;
import brb.g;
import brb.h;
import mm8.a;

public final class i implements b	// class@000441
{

    public void i(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(a.class, new f(this, p1));
       if (p1.h != null) {
          Accessors.d().b(p1.h).a(p0, p1.h);
       }
       d uod = d.class;
       g og = new g(this, p1);
       try{
          p0.h(uod, og);
          p0.h(e.class, new h(this, p1));
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
