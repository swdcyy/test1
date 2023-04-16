package ab0.j;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.gifshow.smartalbum.ui.grid.SmartAlbumGridListFragment;
import ab0.a;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ab0.b;
import ab0.c;
import ab0.d;
import ab0.e;
import ab0.f;
import ab0.g;
import ab0.h;
import ab0.i;
import java.lang.Class;
import mm8.a;

public final class j implements b	// class@000040
{

    public void j(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("smartalbum_horizontal_adapter", new a(this, p1));
       p0.i("smartalbum_back_icon_style", new b(this, p1));
       p0.i("smartalbum_click_restart_button", new c(this, p1));
       p0.i("smartalbum_finish_setting", new d(this, p1));
       p0.i("smartalbum_hide_setting", new e(this, p1));
       p0.i("smartalbum_is_from_tag", new f(this, p1));
       p0.i("smartalbum_recycler_view", new g(this, p1));
       h oh = new h(this, p1);
       String str = "smartalbum_task_id";
       try{
          p0.i(str, oh);
          p0.h(SmartAlbumGridListFragment.class, new i(this, p1));
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
