package n5a.f;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import n5a.c;
import n5a.b;
import n5a.d;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.smile.gifshow.annotation.provider.v2.Accessors;
import n5a.e;
import mm8.a;

public final class f implements b	// class@0030e8
{

    public void f(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(b.class, new d(this, p1));
       if (p1.p != null) {
          Accessors.d().b(p1.p).a(p0, p1.p);
       }
       try{
          p0.h(c.class, new e(this, p1));
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
