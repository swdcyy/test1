package bl3.o;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import bl3.i;
import bl3.j;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import bl3.k;
import bl3.l;
import bl3.m;
import bl3.n;
import java.lang.Class;
import mm8.a;

public final class o implements b	// class@0003f5
{

    public void o(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("LIVE_PREVIEW_ENTER_LIVE_CLICK_STATUS", new j(this, p1));
       p0.i("LIVE_PREVIEW_PLAY_VIEW_SERVICE", new k(this, p1));
       p0.i("LIVE_PLAYER_REUSE_DELEGATE", new l(this, p1));
       m om = new m(this, p1);
       String str = "LIVE_PREVIEW_STOP_PLAY_FOR_WILL_SHOW_CANCELED";
       try{
          p0.i(str, om);
          p0.h(i.class, new n(this, p1));
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
