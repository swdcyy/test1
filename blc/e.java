package blc.e;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import blc.b;
import tkc.e;
import blc.c;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.smile.gifshow.annotation.provider.v2.Accessors;
import blc.d;
import mm8.a;

public final class e implements b	// class@000497
{

    public void e(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(e.class, new c(this, p1));
       if (p1.n != null) {
          Accessors.d().b(p1.n).a(p0, p1.n);
       }
       try{
          p0.h(b.class, new d(this, p1));
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
