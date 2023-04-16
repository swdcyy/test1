package ctb.e;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import ctb.a;
import ctb.b;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.smile.gifshow.annotation.provider.v2.Accessors;
import ctb.c;
import ctb.d;
import java.lang.Class;
import mm8.a;

public final class e implements b	// class@0023c1
{

    public void e(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("NOTICE_BOX_ITEM_DATA", new b(this, p1));
       if (p1.b != null) {
          Accessors.d().b(p1.b).a(p0, p1.b);
       }
       c uoc = new c(this, p1);
       String str = "NOTICE_BOX_ITEM_PLATE_SETTING";
       try{
          p0.i(str, uoc);
          p0.h(a.class, new d(this, p1));
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
