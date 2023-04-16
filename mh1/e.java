package mh1.e;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import mh1.b;
import mh1.c;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import mh1.d;
import java.lang.Class;
import mm8.a;

public final class e implements b	// class@003179
{

    public void e(){
       super();
    }
    public void a(a p0,Object p1){
       c uoc = new c(this, p1);
       String str = "LIVE_GIFT_PANE_RIGHT_TOP_BANNER_GIFT_HINT_ENTRY";
       try{
          p0.i(str, uoc);
          p0.h(b.class, new d(this, p1));
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
