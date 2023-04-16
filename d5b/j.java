package d5b.j;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.magic.ui.magicemoji.search.panel.MagicSearchFragment;
import d5b.c;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import d5b.d;
import d5b.e;
import d5b.f;
import d5b.g;
import d5b.h;
import d5b.i;
import java.lang.Class;
import mm8.a;

public final class j implements b	// class@002445
{

    public void j(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("magic_page_id", new c(this, p1));
       p0.i("magic_search_bar_subject", new d(this, p1));
       p0.i("magic_search_panel_fragment", new e(this, p1));
       p0.i("magic_source", new f(this, p1));
       p0.i("search_keyword_confirm_listener", new g(this, p1));
       h oh = new h(this, p1);
       String str = "magic_panel_search_result_changed_subject";
       try{
          p0.i(str, oh);
          p0.h(MagicSearchFragment.class, new i(this, p1));
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
