package an9.k;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import an9.f;
import an9.g;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import an9.h;
import an9.i;
import an9.j;
import java.lang.Class;
import mm8.a;

public final class k implements b	// class@00010c
{

    public void k(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("AUTO_PLAY_LIVE_CONFIG", new g(this, p1));
       p0.i("SHOULD_CACHE_LIVE_PLAYER_CONTROLLER", new h(this, p1));
       i oi = new i(this, p1);
       String str = "AUTO_PLAY_LIVE_MODULE";
       try{
          p0.i(str, oi);
          p0.h(f.class, new j(this, p1));
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
