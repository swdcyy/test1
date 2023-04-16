package arb.f;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import arb.a;
import arb.b;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import arb.c;
import arb.d;
import arb.e;
import java.lang.Class;
import mm8.a;

public final class f implements b	// class@0002d3
{

    public void f(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("HOME_VIEW_PAGER", new b(this, p1));
       p0.i("ON_MULTI_WINDOW_MODE_CHANGED_EVENT", new c(this, p1));
       d uod = new d(this, p1);
       String str = "TAB_VIEW_TAP_LISTENERS";
       try{
          p0.i(str, uod);
          p0.h(a.class, new e(this, p1));
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
