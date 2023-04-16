package kz0.g;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.banner.f;
import kz0.e;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import kz0.f;
import java.lang.Class;
import mm8.a;

public final class g implements b	// class@002e30
{

    public void g(){
       super();
    }
    public void a(a p0,Object p1){
       e uoe = new e(this, p1);
       String str = "LIVE_GIFT_PANE_RIGHT_TOP_BANNER_ACTIVITY_ENTRY";
       try{
          p0.i(str, uoe);
          p0.h(f.class, new f(this, p1));
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
