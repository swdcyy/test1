package j7a.l;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import j7a.i;
import j7a.j;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import j7a.k;
import java.lang.Class;
import mm8.a;

public final class l implements b	// class@002934
{

    public void l(){
       super();
    }
    public void a(a p0,Object p1){
       j oj = new j(this, p1);
       String str = "DETAIL_SURFACE_LISTENERS";
       try{
          p0.i(str, oj);
          p0.h(i.class, new k(this, p1));
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
