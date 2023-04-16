package k59.q2;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import k59.m2;
import k59.n2;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import k59.o2;
import k59.p2;
import java.lang.Class;
import mm8.a;

public final class q2 implements b	// class@002b07
{

    public void q2(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("REPLACE_TITLE_HEIGHT", new n2(this, p1));
       o2 oo2 = new o2(this, p1);
       String str = "REPLACE_VIEW";
       try{
          p0.i(str, oo2);
          p0.h(m2.class, new p2(this, p1));
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
