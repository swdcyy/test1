package eia.o;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import eia.a;
import eia.f;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.smile.gifshow.annotation.provider.v2.Accessors;
import eia.g;
import java.lang.String;
import eia.h;
import eia.i;
import eia.j;
import eia.k;
import eia.l;
import eia.m;
import eia.n;
import eia.b;
import eia.c;
import eia.d;
import eia.e;
import mm8.a;

public final class o implements b	// class@002697
{

    public void o(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(Object.class, new f(this, p1));
       if (p1.a() != null) {
          Accessors.d().b(p1.a()).a(p0, p1.a());
       }
       p0.i("NIRVANA_FOLLOW_SCREEN_STATE", new g(this, p1));
       p0.i("FOLLOW_VERSION", new h(this, p1));
       p0.i("NIRVANA_FOLLOW_VIEW_PAGER_STATE", new i(this, p1));
       p0.i("NIRVANA_SELECTED_ITEM", new j(this, p1));
       p0.i("NIRVANA_FOLLOW_LIVE_TIPS_ENTRANCE_STATE", new k(this, p1));
       p0.i("FOLLOW_LIVE_TIPS_SHOW", new l(this, p1));
       p0.i("NIRVANA_PYMI_CONTAINER_PADDING", new m(this, p1));
       p0.i("PYMI_CONTAINER_VISIBLE", new n(this, p1));
       p0.i("PYMI_RESPONSE_DATA", new b(this, p1));
       p0.i("NIRVANA_SWIPE_PROFILE", new c(this, p1));
       d uod = new d(this, p1);
       String str = "NIRVANA_VIEWPAGER_TRANSLATION_Y_OFFSET";
       try{
          p0.i(str, uod);
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
