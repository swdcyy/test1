package m0a.g;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import m0a.c;
import i0a.k;
import m0a.d;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.smile.gifshow.annotation.provider.v2.Accessors;
import m0a.e;
import java.lang.String;
import m0a.f;
import mm8.a;

public final class g implements b	// class@002ef8
{

    public void g(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(k.class, new d(this, p1));
       if (p1.m != null) {
          Accessors.d().b(p1.m).a(p0, p1.m);
       }
       e uoe = new e(this, p1);
       String str = "DETAIL_ACTION_BAR_PARAM";
       try{
          p0.i(str, uoe);
          p0.h(c.class, new f(this, p1));
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
