package gfd.h;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import gfd.a;
import gfd.b;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import gfd.c;
import gfd.d;
import gfd.e;
import gfd.f;
import gfd.g;
import java.lang.Class;
import mm8.a;

public final class h implements b	// class@000f0e
{

    public void h(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("AUTO_PLAY_VIDEO_CONFIG", new b(this, p1));
       p0.i("SEARCH_PLAY_IMAGE_ENABLE_PLAY", new c(this, p1));
       p0.i("SEARCH_PLAY_PLAYER_MODULE", new d(this, p1));
       p0.i("SEARCH_PLAY_PHOTO_WRAPPER", new e(this, p1));
       f uof = new f(this, p1);
       String str = "AUTO_PLAY_VIDEO_MODULE";
       try{
          p0.i(str, uof);
          p0.h(a.class, new g(this, p1));
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
