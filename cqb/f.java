package cqb.f;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import cqb.c;
import aqb.a;
import cqb.d;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.smile.gifshow.annotation.provider.v2.Accessors;
import cqb.e;
import mm8.a;

public final class f implements b	// class@002370
{

    public void f(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(a.class, new d(this, p1));
       if (p1.m != null) {
          Accessors.d().b(p1.m).a(p0, p1.m);
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
