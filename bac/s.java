package bac.s;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import bac.p;
import bac.q;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import bac.r;
import java.lang.Class;
import mm8.a;

public final class s implements b	// class@00041c
{

    public void s(){
       super();
    }
    public void a(a p0,Object p1){
       q oq = new q(this, p1);
       String str = "FRAGMENT";
       try{
          p0.i(str, oq);
          p0.h(p.class, new r(this, p1));
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
