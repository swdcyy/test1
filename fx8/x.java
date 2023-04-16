package fx8.x;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import fx8.t;
import fx8.u;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import fx8.v;
import fx8.w;
import java.lang.Class;
import mm8.a;

public final class x implements b	// class@002399
{

    public void x(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("topic_item_click", new u(this, p1));
       v ov = new v(this, p1);
       String str = "topic_item_show";
       try{
          p0.i(str, ov);
          p0.h(t.class, new w(this, p1));
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
