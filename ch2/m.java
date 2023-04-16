package ch2.m;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.live.core.show.redpacket.krn.l;
import ch2.n;
import ch2.k;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ch2.l;
import mm8.a;

public final class m implements b	// class@00053e
{

    public void m(){
       super();
    }
    public void a(a p0,Object p1){
       n on = n.class;
       k ok = new k(this, p1);
       try{
          p0.h(on, ok);
          p0.h(l.class, new l(this, p1));
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
