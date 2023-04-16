package k21.u;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import k21.r;
import k21.s;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import k21.t;
import java.lang.Class;
import mm8.a;

public final class u implements b	// class@002c7a
{

    public void u(){
       super();
    }
    public void a(a p0,Object p1){
       s os = new s(this, p1);
       String str = "LIVE_SLIDE_SCREEN_ORIENTATION_SERVICE";
       try{
          p0.i(str, os);
          p0.h(r.class, new t(this, p1));
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
