package l11.h;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import l11.b;
import no1.j;
import l11.c;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import m11.l;
import l11.d;
import la2.a;
import l11.e;
import l11.j;
import l11.f;
import l11.g;
import mm8.a;

public final class h implements b	// class@002e5c
{

    public void h(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(j.class, new c(this, p1));
       p0.h(l.class, new d(this, p1));
       p0.h(a.class, new e(this, p1));
       j oj = j.class;
       f uof = new f(this, p1);
       try{
          p0.h(oj, uof);
          p0.h(b.class, new g(this, p1));
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
