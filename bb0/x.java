package bb0.x;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.gifshow.smartalbum.ui.horizontal.SmartAlbumHorizontalListFragment;
import bb0.o;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import bb0.p;
import bb0.q;
import bb0.r;
import bb0.s;
import w69.e;
import bb0.t;
import java.lang.Class;
import bb0.u;
import bb0.v;
import bb0.w;
import bb0.h;
import bb0.i;
import bb0.j;
import bb0.k;
import bb0.l;
import bb0.m;
import bb0.n;
import mm8.a;

public final class x implements b	// class@00026e
{

    public void x(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("smartalbum_horizontal_adapter", new o(this, p1));
       p0.i("smartalbum_click_action", new p(this, p1));
       p0.i("smartalbum_click_album_publisher", new q(this, p1));
       p0.i("smartalbum_container_view", new r(this, p1));
       p0.i("smartalbum_expand_when_get_new", new s(this, p1));
       p0.h(e.class, new t(this, p1));
       p0.i("FRAGMENT", new u(this, p1));
       p0.i("smartalbum_has_new_wehnentern", new v(this, p1));
       p0.i("smartalbum_init_with_hide", new w(this, p1));
       p0.i("smartalbum_on_header_scroll", new h(this, p1));
       p0.i("pre_album_pause_publisher", new i(this, p1));
       p0.i("smartalbum_set_tabtype", new j(this, p1));
       p0.i("smartalbum_show_when_album_expanded", new k(this, p1));
       p0.i("smartalbum_task_id", new l(this, p1));
       m om = new m(this, p1);
       String str = "smartalbum_thumbnail_show";
       try{
          p0.i(str, om);
          p0.h(SmartAlbumHorizontalListFragment.class, new n(this, p1));
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
