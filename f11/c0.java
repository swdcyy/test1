package f11.c0;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import f11.w;
import f11.a0;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import f11.b0;
import java.lang.Class;
import mm8.a;

public final class c0 implements b	// class@00226d
{

    public void c0(){
       super();
    }
    public void a(a p0,Object p1){
       a0 uoa0 = new a0(this, p1);
       String str = "LIVE_AUDIENCE_LIKE_SERVICE";
       try{
          p0.i(str, uoa0);
          p0.h(w.class, new b0(this, p1));
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
