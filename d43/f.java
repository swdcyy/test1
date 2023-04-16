package d43.f;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import d43.a;
import d43.b;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import d43.c;
import p43.c;
import d43.d;
import java.lang.Class;
import d43.e;
import mm8.a;

public final class f implements b	// class@002445
{

    public void f(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("GAME_INTERACTIVE_ROOM_STATUS_IDS", new b(this, p1));
       p0.i("LIVE_SLIDE_PLAY_SERVICE", new c(this, p1));
       c uoc = c.class;
       d uod = new d(this, p1);
       try{
          p0.h(uoc, uod);
          p0.h(a.class, new e(this, p1));
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
