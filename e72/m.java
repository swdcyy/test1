package e72.m;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import e72.c;
import e72.d;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import e72.e;
import e72.f;
import e72.g;
import e72.h;
import e72.i;
import e72.j;
import e72.k;
import e72.l;
import java.lang.Class;
import mm8.a;

public final class m implements b	// class@00268d
{

    public void m(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("AUTO_PLAY_LIVE_CONFIG", new d(this, p1));
       p0.i("ENABLE_AUTO_PLAY", new e(this, p1));
       p0.i("LIVE_CLICK_SUBJECT", new f(this, p1));
       p0.i("LIVE_EXPLORE_PARAM", new g(this, p1));
       p0.i("LIVE_EXPLORE_PHOTO_REDUCE_DETECTOR", new h(this, p1));
       p0.i("AUTO_PLAY_LIVE_MODULE", new i(this, p1));
       p0.i("PLAYER_REUSE_SESSION_ID", new j(this, p1));
       k ok = new k(this, p1);
       String str = "SHOULD_CACHE_LIVE_PLAYER_CONTROLLER";
       try{
          p0.i(str, ok);
          p0.h(c.class, new l(this, p1));
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
