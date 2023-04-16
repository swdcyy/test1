package bu2.p;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import bu2.l;
import bu2.l$c;
import bu2.n;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import bu2.o;
import mm8.a;

public final class p implements b	// class@000467
{

    public void p(){
       super();
    }
    public void a(a p0,Object p1){
       l$c uoc = l$c.class;
       n on = new n(this, p1);
       try{
          p0.h(uoc, on);
          p0.h(l.class, new o(this, p1));
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
