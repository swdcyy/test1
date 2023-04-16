package led.l;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import led.m$a;
import led.h;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import led.i;
import led.j;
import led.k;
import java.lang.Class;
import mm8.a;

public final class l implements b	// class@001c27
{

    public void l(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("SEARCH_FRAGMENT_DELEGATE", new h(this, p1));
       p0.i("SEARCH_SLIDE_RECYCLERVIEW", new i(this, p1));
       j oj = new j(this, p1);
       String str = "SEARCH_RESULT_DELEGATE";
       try{
          p0.i(str, oj);
          p0.h(m$a.class, new k(this, p1));
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
