package dz8.e;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import dz8.a;
import dz8.b;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import dz8.c;
import dz8.d;
import java.lang.Class;
import mm8.a;

public final class e implements b	// class@002109
{

    public void e(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("HALF_LANDING_PAGE_COVER_HEIGHT", new b(this, p1));
       c uoc = new c(this, p1);
       String str = "HALF_LANDING_PAGE_COVER_WIDTH";
       try{
          p0.i(str, uoc);
          p0.h(a.class, new d(this, p1));
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