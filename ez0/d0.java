package ez0.d0;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.k;
import ez0.b0;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ez0.c0;
import java.lang.Class;
import mm8.a;

public final class d0 implements b	// class@00223d
{

    public void d0(){
       super();
    }
    public void a(a p0,Object p1){
       b0 uob0 = new b0(this, p1);
       String str = "LIVE_AUDIENCE_GIFT_BOX_SERVICE";
       try{
          p0.i(str, uob0);
          p0.h(k.class, new c0(this, p1));
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
