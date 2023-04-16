package g82.n0;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import g82.v;
import g82.l0;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import g82.m0;
import java.lang.Class;
import mm8.a;

public final class n0 implements b	// class@002aac
{

    public void n0(){
       super();
    }
    public void a(a p0,Object p1){
       l0 ol0 = new l0(this, p1);
       String str = "LIVE_FANS_GROUP_SERVICE";
       try{
          p0.i(str, ol0);
          p0.h(v.class, new m0(this, p1));
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
