package ab5.o;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import ab5.a;
import ab5.f;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import db5.f;
import ab5.g;
import java.lang.Class;
import ab5.h;
import ab5.i;
import ab5.j;
import ab5.k;
import ab5.l;
import ab5.m;
import ab5.n;
import ab5.b;
import ab5.c;
import ab5.d;
import ab5.e;
import mm8.a;

public final class o implements b	// class@000056
{

    public void o(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("HOME_LOAD_SCAN_PADDING", new f(this, p1));
       p0.h(f.class, new g(this, p1));
       p0.i("RECYCLERVIEW_LAYOUT_COMPLETE", new h(this, p1));
       p0.i("HOME_ITEM_CLICK", new i(this, p1));
       p0.i("HOME_ONRESPONSELOAD_LISTENERS", new j(this, p1));
       p0.i("LAST_OPENED_PHOTO_POSITION", new k(this, p1));
       p0.i("HOME_ON_FEED_SCROLL_LISTENERS", new l(this, p1));
       p0.i("ON_MULTI_WINDOW_MODE_CHANGED_EVENT", new m(this, p1));
       p0.i("FRAGMENT_SELECT_LISTENER", new n(this, p1));
       p0.i("HOME_REFRESH_CONTROLLER", new b(this, p1));
       p0.i("HOME_RECYCLE_VIEW_SCROLL_STATE", new c(this, p1));
       d uod = new d(this, p1);
       String str = "SHOW_SCANNING_LOADING";
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
