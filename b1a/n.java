package b1a.n;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import b1a.e;
import b1a.f;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import b1a.g;
import b1a.h;
import b1a.i;
import b1a.j;
import b1a.k;
import b1a.l;
import b1a.m;
import java.lang.Class;
import mm8.a;

public final class n implements b	// class@000351
{

    public void n(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("NASA_BOTTOM_DANMAKU_VIEW_STUB", new f(this, p1));
       p0.i("NASA_BOTTOM_TAG_BAR_VIEW_STUB", new g(this, p1));
       p0.i("NASA_BOTTOM_TAG_BAR_VIEW_SHOW_OBSERVABLE", new h(this, p1));
       p0.i("NASA_BOTTOM_TAG_BAR_VIEW_SHOW_OBSERVER", new i(this, p1));
       p0.i("NASA_BOTTOM_COMMENT_VIEW_STUB", new j(this, p1));
       p0.i("NASA_DETAIL_SPECIAL_CAMERA_OBSERVABLE", new k(this, p1));
       l ol = new l(this, p1);
       String str = "NASA_DETAIL_SPECIAL_CAMERA_OBSERVER";
       try{
          p0.i(str, ol);
          p0.h(e.class, new m(this, p1));
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
