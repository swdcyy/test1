package e7a.i;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import e7a.d;
import e7a.g;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import e7a.h;
import java.lang.Class;
import mm8.a;

public final class i implements b	// class@002089
{

    public void i(){
       super();
    }
    public void a(a p0,Object p1){
       g og = new g(this, p1);
       String str = "DanmakuDebugInfo";
       try{
          p0.i(str, og);
          p0.h(d.class, new h(this, p1));
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
