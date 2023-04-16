package c01.k;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import c01.e;
import c01.i;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import c01.j;
import java.lang.Class;
import mm8.a;

public final class k implements b	// class@000446
{

    public void k(){
       super();
    }
    public void a(a p0,Object p1){
       i oi = new i(this, p1);
       String str = "LIVE_AUDIENCE_GIFT_BOX_RECEIVER_SERVICE";
       try{
          p0.i(str, oi);
          p0.h(e.class, new j(this, p1));
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
