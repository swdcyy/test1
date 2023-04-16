package j99.g;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import j99.r$a;
import j99.a;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import j99.b;
import j99.c;
import j99.d;
import j99.e;
import j99.f;
import java.lang.Class;
import mm8.a;

public final class g implements b	// class@0027c5
{

    public void g(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("ATLAS_LOAD_HELPER", new a(this, p1));
       p0.i("COVER_SHOWED_LIST", new b(this, p1));
       p0.i("FRAGMENT_VIEW", new c(this, p1));
       p0.i("IS_NONET_TOAST_SHOWED", new d(this, p1));
       e uoe = new e(this, p1);
       String str = "ATLAS_ADAPTER_POSITION";
       try{
          p0.i(str, uoe);
          p0.h(r$a.class, new f(this, p1));
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
