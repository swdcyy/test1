package cia.p;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.follow.slide.detail.data.FollowSlideDetailGlobalParams;
import cia.g;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import cia.h;
import cia.i;
import cia.j;
import cia.k;
import cia.l;
import cia.m;
import cia.n;
import cia.o;
import cia.a;
import cia.b;
import cia.c;
import cia.d;
import cia.e;
import cia.f;
import java.lang.Class;
import mm8.a;

public final class p implements b	// class@000512
{

    public void p(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("NIRVANA_CREATE_TIME_STATE", new g(this, p1));
       p0.i("NIRVANA_FOLLOW_SCREEN_STATE", new h(this, p1));
       p0.i("FOLLOW_VERSION", new i(this, p1));
       p0.i("NIRVANA_FOLLOW_VIEW_PAGER_STATE", new j(this, p1));
       p0.i("NIRVANA_SELECTED_ITEM", new k(this, p1));
       p0.i("NIRVANA_FOLLOW_LIVE_TIPS_ENTRANCE_STATE", new l(this, p1));
       p0.i("FOLLOW_LIVE_TIPS_SHOW", new m(this, p1));
       p0.i("PYMI_CONTAINER_COLLAPSE", new n(this, p1));
       p0.i("PYMI_CONTAINER_EXPAND", new o(this, p1));
       p0.i("NIRVANA_PYMI_CONTAINER_PADDING", new a(this, p1));
       p0.i("PYMI_CONTAINER_VISIBLE", new b(this, p1));
       p0.i("PYMI_RESPONSE_DATA", new c(this, p1));
       p0.i("NIRVANA_SWIPE_PROFILE", new d(this, p1));
       e uoe = new e(this, p1);
       String str = "NIRVANA_VIEWPAGER_TRANSLATION_Y_OFFSET";
       try{
          p0.i(str, uoe);
          p0.h(FollowSlideDetailGlobalParams.class, new f(this, p1));
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
