package bac.g;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import bac.i$a;
import bac.a;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import bac.b;
import bac.c;
import fac.b;
import bac.d;
import java.lang.Class;
import fac.c;
import bac.e;
import bac.f;
import mm8.a;

public final class g implements b	// class@000404
{

    public void g(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("ADAPTER", new a(this, p1));
       p0.i("relation_btn_click", new b(this, p1));
       p0.i("PYMK_ACCESS_IDSbigcard_btn", new c(this, p1));
       p0.h(b.class, new d(this, p1));
       c uoc = c.class;
       e uoe = new e(this, p1);
       try{
          p0.h(uoc, uoe);
          p0.h(i$a.class, new f(this, p1));
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
