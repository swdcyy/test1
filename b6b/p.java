package b6b.p;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import b6b.a;
import b6b.g;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import b6b.h;
import b6b.i;
import b6b.j;
import b6b.k;
import b6b.l;
import b6b.m;
import b6b.n;
import b6b.o;
import b6b.b;
import b6b.c;
import b6b.d;
import b6b.e;
import b6b.f;
import java.lang.Class;
import mm8.a;

public final class p implements b	// class@000378
{

    public void p(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("PHOTO_MAP_DATA_REFRESH", new g(this, p1));
       p0.i("PHOTO_MAP_MAP_FILTER_ACTION", new h(this, p1));
       p0.i("FRAGMENT", new i(this, p1));
       p0.i("PHOTO_MAP_MAP_DATA_UPDATE", new j(this, p1));
       p0.i("PHOTO_MAP_MAP_FEED_DATA_MANAGER", new k(this, p1));
       p0.i("PHOTO_MAP_MAP_LOCATION_BUTTON_CLICK", new l(this, p1));
       p0.i("PHOTO_MAP_MAP_LOCATION_UPDATE", new m(this, p1));
       p0.i("PHOTO_MAP_MAP_PAGE_STATE", new n(this, p1));
       p0.i("PHOTO_MAP_MAP_TITLE_UPDATE", new o(this, p1));
       p0.i("PHOTO_MAP_MAP_MOMENT_CONTROL", new b(this, p1));
       p0.i("PHOTO_MAP_MY_ROLE_ANIMATION_MANAGER", new c(this, p1));
       p0.i("nearby_roam_panel_action_behavior", new d(this, p1));
       e uoe = new e(this, p1);
       String str = "PHOTO_MAP_FEED_PAGE_LIST";
       try{
          p0.i(str, uoe);
          p0.h(a.class, new f(this, p1));
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
