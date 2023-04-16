package k59.z2;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import k59.u2;
import k59.w2;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import k59.x2;
import k59.y2;
import java.lang.Class;
import mm8.a;

public final class z2 implements b	// class@002b3e
{

    public void z2(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("REPLACE_TITLE_HEIGHT", new w2(this, p1));
       x2 ox2 = new x2(this, p1);
       String str = "REPLACE_VIEW";
       try{
          p0.i(str, ox2);
          p0.h(u2.class, new y2(this, p1));
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
