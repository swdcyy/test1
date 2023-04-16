package h0a.p;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.detail.fragments.NasaMilanoSlidePlayContainerFragment;
import qh.e;
import h0a.g;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import c95.a;
import h0a.h;
import h0a.i;
import java.lang.String;
import bf5.e;
import h0a.j;
import k2b.e0;
import h0a.k;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import h0a.l;
import h0a.m;
import c95.c;
import h0a.n;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import h0a.o;
import h0a.d;
import h0a.e;
import h0a.f;
import mm8.a;

public final class p implements b	// class@002538
{

    public void p(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(e.class, new g(this, p1));
       p0.h(a.class, new h(this, p1));
       p0.i("MILANO_ENABLE_PROFILE_SIDE_ON_CURRENT_PHOTO", new i(this, p1));
       p0.h(e.class, new j(this, p1));
       p0.h(e0.class, new k(this, p1));
       p0.h(LiveBizParam.class, new l(this, p1));
       p0.i("MILANO_ATTACH_LISTENER", new m(this, p1));
       p0.h(c.class, new n(this, p1));
       p0.h(NasaBizParam.class, new o(this, p1));
       p0.i("NASA_FOOTER_LOADING_DELEGATE", new d(this, p1));
       e uoe = new e(this, p1);
       String str = "MILANO_SLIDE_PLAY_VM_PROTOCOL";
       try{
          p0.i(str, uoe);
          p0.h(NasaMilanoSlidePlayContainerFragment.class, new f(this, p1));
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
