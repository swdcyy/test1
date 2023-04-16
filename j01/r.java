package j01.r;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import j01.m;
import j01.m$b;
import j01.p;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import j01.q;
import mm8.a;

public final class r implements b	// class@002a08
{

    public void r(){
       super();
    }
    public void a(a p0,Object p1){
       m$b uob = m$b.class;
       p op = new p(this, p1);
       try{
          p0.h(uob, op);
          p0.h(m.class, new q(this, p1));
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
