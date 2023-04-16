package a72.f;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.live.core.show.divertpush.c;
import a72.d;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import a72.e;
import java.lang.Class;
import mm8.a;

public final class f implements b	// class@000076
{

    public void f(){
       super();
    }
    public void a(a p0,Object p1){
       d uod = new d(this, p1);
       String str = "LIVE_DIVERT_PUSH_SERVICE";
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
