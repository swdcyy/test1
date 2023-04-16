package g7a.s0;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import g7a.j0;
import g7a.k0;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import g7a.l0;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import g7a.m0;
import java.lang.Class;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import g7a.n0;
import yy6.c;
import g7a.o0;
import g7a.p0;
import g7a.q0;
import g7a.r0;
import mm8.a;

public final class s0 implements b	// class@0023f8
{

    public void s0(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("LOG_LISTENER", new k0(this, p1));
       p0.i("DETAIL_LOGGER", new l0(this, p1));
       p0.h(NasaBizParam.class, new m0(this, p1));
       p0.h(PhotoDetailParam.class, new n0(this, p1));
       p0.h(c.class, new o0(this, p1));
       p0.i("TAG_SHOW_PACKAGE_LIST_HELPER", new p0(this, p1));
       q0 oq0 = new q0(this, p1);
       String str = "NASA_BOTTOM_EDITOR_UPDATE_AT_BUTTON_ALPHA_OBSERVER";
       try{
          p0.i(str, oq0);
          p0.h(j0.class, new r0(this, p1));
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
