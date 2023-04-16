package b1a.d;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import b1a.a;
import b1a.e;
import b1a.b;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.smile.gifshow.annotation.provider.v2.Accessors;
import b1a.c;
import mm8.a;

public final class d implements b	// class@000347
{

    public void d(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(e.class, new b(this, p1));
       if (p1.m != null) {
          Accessors.d().b(p1.m).a(p0, p1.m);
       }
       try{
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
