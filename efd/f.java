package efd.f;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import efd.a;
import efd.b;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import efd.c;
import efd.d;
import efd.e;
import java.lang.Class;
import mm8.a;

public final class f implements b	// class@000d0f
{

    public void f(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("SEARCH_PLAY_PHOTO_WRAPPER", new b(this, p1));
       p0.i("SEARCH_PLAY_PLAYER_MODULE", new c(this, p1));
       d uod = new d(this, p1);
       String str = "SEARCH_PLAY_VIDEO_TEXTURE_PROXY";
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
