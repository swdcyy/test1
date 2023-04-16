package j0a.n;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import j0a.f;
import j0a.g;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import j0a.h;
import j0a.i;
import j0a.j;
import j0a.k;
import j0a.l;
import j0a.m;
import java.lang.Class;
import mm8.a;

public final class n implements b	// class@0028eb
{

    public void n(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("NASA_BOTTOM_TAG_BAR_VIEW_STUB", new g(this, p1));
       p0.i("NASA_BOTTOM_TAG_BAR_VIEW_SHOW_OBSERVABLE", new h(this, p1));
       p0.i("NASA_BOTTOM_TAG_BAR_VIEW_SHOW_OBSERVER", new i(this, p1));
       p0.i("NASA_BOTTOM_COMMENT_VIEW_STUB", new j(this, p1));
       p0.i("NASA_DETAIL_SPECIAL_CAMERA_OBSERVABLE", new k(this, p1));
       l ol = new l(this, p1);
       String str = "NASA_DETAIL_SPECIAL_CAMERA_OBSERVER";
       try{
          p0.i(str, ol);
          p0.h(f.class, new m(this, p1));
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
