package l01.f;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import l01.c;
import l01.d;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import l01.e;
import java.lang.Class;
import mm8.a;

public final class f implements b	// class@002e46
{

    public void f(){
       super();
    }
    public void a(a p0,Object p1){
       d uod = new d(this, p1);
       String str = "LIVE_AUDIENCE_GIFT_BOX_SINGLE_SEND_SERVICE";
       try{
          p0.i(str, uod);
          p0.h(c.class, new e(this, p1));
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
