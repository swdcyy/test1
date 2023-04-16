package d12.o;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import d12.g;
import d12.h;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import d12.i;
import d12.j;
import d12.k;
import d12.l;
import d12.m;
import d12.n;
import java.lang.Class;
import mm8.a;

public final class o implements b	// class@002423
{

    public void o(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("FANS_TOP_AWARD_LIVE_WATCHING_MS", new h(this, p1));
       p0.i("FANS_TOP_AWARD_LIVE_GAME_REDEEM_OVER", new i(this, p1));
       p0.i("LIVE_SQUARE_REPLACE_PAGE_LIST_PUBLISHER", new j(this, p1));
       p0.i("LIVE_SQUARE_REPLACE_SOURCE_FEED_PUBLISHER", new k(this, p1));
       p0.i("DETAIL_ON_CONFIGURATION_CHANGED_EVENT", new l(this, p1));
       m om = new m(this, p1);
       String str = "LIVE_SIDE_BAR_SWIPE_MOVEMENT";
       try{
          p0.i(str, om);
          p0.h(g.class, new n(this, p1));
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
