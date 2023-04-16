package l8a.h;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import l8a.d;
import l8a.e;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import l8a.f;
import l8a.g;
import java.lang.Class;
import mm8.a;

public final class h implements b	// class@002d6a
{

    public void h(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("MERCHANT_SLIDE_PLAY_INTENT_URL", new e(this, p1));
       f uof = new f(this, p1);
       String str = "MERCHANT_SLIDE_PLAY_SERVICE";
       try{
          p0.i(str, uof);
          p0.h(d.class, new g(this, p1));
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
