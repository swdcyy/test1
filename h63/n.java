package h63.n;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import h63.j;
import c77.q;
import h63.l;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import h63.m;
import mm8.a;

public final class n implements b	// class@002c91
{

    public void n(){
       super();
    }
    public void a(a p0,Object p1){
       q oq = q.class;
       l ol = new l(this, p1);
       try{
          p0.h(oq, ol);
          p0.h(j.class, new m(this, p1));
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
