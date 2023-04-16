package bz8.s;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import bz8.o;
import com.yxcorp.gifshow.entity.QPhoto;
import bz8.p;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import n49.o;
import bz8.q;
import bz8.r;
import mm8.a;

public final class s implements b	// class@0004a6
{

    public void s(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(QPhoto.class, new p(this, p1));
       o oo = o.class;
       q oq = new q(this, p1);
       try{
          p0.h(oo, oq);
          p0.h(o.class, new r(this, p1));
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
