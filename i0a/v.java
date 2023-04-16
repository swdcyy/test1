package i0a.v;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import i0a.k;
import i0a.m;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import i0a.n;
import i0a.o;
import i0a.p;
import i0a.q;
import i0a.r;
import i0a.s;
import i0a.t;
import i0a.u;
import i0a.l;
import java.lang.Class;
import mm8.a;

public final class v implements b	// class@00275b
{

    public void v(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("NASA_DETAIL_CAMERA_BTN_DELEGATE", new m(this, p1));
       p0.i("NASA_BOTTOM_DANMAKU_VIEW_STUB", new n(this, p1));
       p0.i("NASA_BOTTOM_TAG_BAR_VIEW_STUB", new o(this, p1));
       p0.i("NASA_BOTTOM_TAG_BAR_VIEW_SHOW_OBSERVABLE", new p(this, p1));
       p0.i("NASA_BOTTOM_TAG_BAR_VIEW_SHOW_OBSERVER", new q(this, p1));
       p0.i("NASA_BOTTOM_VIEWERS_VIEW_STUB", new r(this, p1));
       p0.i("NASA_BOTTOM_COMMENT_VIEW_STUB", new s(this, p1));
       p0.i("NASA_DETAIL_SPECIAL_CAMERA_OBSERVABLE", new t(this, p1));
       u ou = new u(this, p1);
       String str = "NASA_DETAIL_SPECIAL_CAMERA_OBSERVER";
       try{
          p0.i(str, ou);
          p0.h(k.class, new l(this, p1));
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
