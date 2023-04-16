package go1.v;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.live.common.core.component.like.i;
import lo1.l;
import go1.t;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import go1.u;
import mm8.a;

public final class v implements b	// class@002544
{

    public void v(){
       super();
    }
    public void a(a p0,Object p1){
       l ol = l.class;
       t ot = new t(this, p1);
       try{
          p0.h(ol, ot);
          p0.h(i.class, new u(this, p1));
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
