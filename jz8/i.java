package jz8.i;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import jz8.b;
import jz8.c;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jz8.d;
import al9.a;
import jz8.e;
import java.lang.Class;
import jz8.f;
import jz8.g;
import com.smile.gifshow.annotation.provider.v2.Accessors;
import jz8.h;
import mm8.a;

public final class i implements b	// class@002a12
{

    public void i(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("SLIDE_PLAY_COMMENT_PANEL_STATE_LISTENER_LIST", new c(this, p1));
       p0.i("COMMENT_GLOBAL_ACTION", new d(this, p1));
       p0.h(a.class, new e(this, p1));
       p0.i("NASA_COMMENT_TAB_SUPPLIER_REF", new f(this, p1));
       p0.h(Object.class, new g(this, p1));
       if (p1.d != null) {
          Accessors.d().b(p1.d).a(p0, p1.d);
       }
       try{
          p0.h(b.class, new h(this, p1));
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
