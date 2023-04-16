package d82.q;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import d82.n;
import d82.n$c;
import d82.o;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import d82.p;
import mm8.a;

public final class q implements b	// class@00249d
{

    public void q(){
       super();
    }
    public void a(a p0,Object p1){
       n$c uoc = n$c.class;
       o oo = new o(this, p1);
       try{
          p0.h(uoc, oo);
          p0.h(n.class, new p(this, p1));
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
