package a67.p;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import a67.l;
import a67.l$c;
import a67.n;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import a67.o;
import mm8.a;

public final class p implements b	// class@000066
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
