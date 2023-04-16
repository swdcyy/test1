package ged.f;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import ged.b;
import ged.c;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ged.d;
import ged.e;
import java.lang.Class;
import mm8.a;

public final class f implements b	// class@002ac4
{

    public void f(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("SEARCH_REDUCE_EDIT_POPUP", new c(this, p1));
       d uod = new d(this, p1);
       String str = "SEARCH_REDUCE_EDIT_LISTENER_POPUP";
       try{
          p0.i(str, uod);
          p0.h(b.class, new e(this, p1));
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
