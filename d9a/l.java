package d9a.l;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import d9a.b;
import d9a.c;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import d9a.d;
import d9a.e;
import d9a.f;
import d9a.g;
import d9a.h;
import d9a.i;
import d9a.j;
import d9a.k;
import java.lang.Class;
import mm8.a;

public final class l implements b	// class@001ec4
{

    public void l(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("SERIAL_LAST_EPISODE_SWITCH_TO_FIRST_OBSERVABLE", new c(this, p1));
       p0.i("SERIAL_LAST_EPISODE_SWITCH_TO_FIRST_OBSERVER", new d(this, p1));
       p0.i("SIMILAR_PHOTO_BOTTOM_BAR_VISIBLE_OBSERVABLE", new e(this, p1));
       p0.i("SIMILAR_PHOTO_BOTTOM_BAR_VISIBLE_OBSERVER", new f(this, p1));
       p0.i("SIMILAR_PHOTO_DISABLE_AUTO_PLAY_NEXT_OBSERVABLE", new g(this, p1));
       p0.i("SIMILAR_PHOTO_DISABLE_AUTO_PLAY_NEXT_OBSERVER", new h(this, p1));
       p0.i("SIMILAR_PHOTO_PANEL_CLEAR_SCREEN_OBSERVABLE", new i(this, p1));
       j oj = new j(this, p1);
       String str = "SIMILAR_PHOTO_PANEL_PHOTO_CHANGED_OBSERVABLE";
       try{
          p0.i(str, oj);
          p0.h(b.class, new k(this, p1));
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
