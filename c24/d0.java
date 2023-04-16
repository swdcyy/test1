package c24.d0;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import c24.a0;
import c24.b0;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import c24.c0;
import java.lang.Class;
import mm8.a;

public final class d0 implements b	// class@000471
{

    public void d0(){
       super();
    }
    public void a(a p0,Object p1){
       b0 uob0 = new b0(this, p1);
       String str = "LIVE_MERCHANT_LIVE_INTERNAL_ROUTER_SERVICE";
       try{
          p0.i(str, uob0);
          p0.h(a0.class, new c0(this, p1));
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
