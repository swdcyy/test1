package n9a.g;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import n9a.c;
import n9a.d;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import n9a.e;
import n9a.f;
import java.lang.Class;
import mm8.a;

public final class g implements b	// class@00310e
{

    public void g(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("FOLLOW_GUIDE_DETAIL_PARAM", new d(this, p1));
       e uoe = new e(this, p1);
       String str = "FOLLOW_GUIDE_PHOTO";
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
