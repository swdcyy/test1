package gpb.h;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.music.cloudmusic.search.panel.MusicSearchPanelFragment;
import gpb.b;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import gpb.c;
import gpb.d;
import gpb.e;
import gpb.f;
import gpb.g;
import java.lang.Class;
import mm8.a;

public final class h implements b	// class@002b5c
{

    public void h(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("MUSIC_SEARCH_PANEL_FRAGMENT", new b(this, p1));
       p0.i("music_search_handler", new c(this, p1));
       p0.i("MUSIC_SEARCH_PANEL_ORIGIN_LOG_PAGE", new d(this, p1));
       p0.i("MUSIC_SEARCH_PANEL_INTERACTION", new e(this, p1));
       f uof = new f(this, p1);
       String str = "MUSIC_SEARCH_FRAGMENT";
       try{
          p0.i(str, uof);
          p0.h(MusicSearchPanelFragment.class, new g(this, p1));
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
