package k19.y;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import k19.t$a;
import k19.u;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import k19.v;
import k19.w;
import k19.x;
import java.lang.Class;
import mm8.a;

public final class y implements b	// class@002a9c
{

    public void y(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("AD_MERCHANDISE_SUBJECT", new u(this, p1));
       p0.i("AD_MERCHANDISE_LIST_DATA", new v(this, p1));
       w ow = new w(this, p1);
       String str = "AD_MERCHANDISE_PHOTO";
       try{
          p0.i(str, ow);
          p0.h(t$a.class, new x(this, p1));
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
