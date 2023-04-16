package g31.n;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.live.audience.component.topbar.d;
import g31.l;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import g31.m;
import java.lang.Class;
import mm8.a;

public final class n implements b	// class@002416
{

    public void n(){
       super();
    }
    public void a(a p0,Object p1){
       l ol = new l(this, p1);
       String str = "LIVE_AUDIENCE_TOP_SLIDE_BAR_SERVICE";
       try{
          p0.i(str, ol);
          p0.h(d.class, new m(this, p1));
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
