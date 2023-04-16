package g01.e;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import g01.b;
import g01.c;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import g01.d;
import java.lang.Class;
import mm8.a;

public final class e implements b	// class@0023f5
{

    public void e(){
       super();
    }
    public void a(a p0,Object p1){
       c uoc = new c(this, p1);
       String str = "LIVE_AUDIENCE_GIFT_BOX_COMBO_SEND_SERVICE";
       try{
          p0.i(str, uoc);
          p0.h(b.class, new d(this, p1));
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
