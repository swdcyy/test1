package b62.v;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import b62.s;
import b62.t;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import b62.u;
import java.lang.Class;
import mm8.a;

public final class v implements b	// class@000358
{

    public void v(){
       super();
    }
    public void a(a p0,Object p1){
       t ot = new t(this, p1);
       String str = "first-select-observable";
       try{
          p0.i(str, ot);
          p0.h(s.class, new u(this, p1));
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
