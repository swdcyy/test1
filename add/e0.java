package add.e0;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.plugin.search.result.a;
import add.t;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import add.w;
import add.x;
import add.y;
import add.z;
import add.a0;
import add.b0;
import add.c0;
import add.d0;
import add.j;
import add.k;
import add.l;
import add.m;
import add.n;
import tdd.f0;
import add.o;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessors;
import add.p;
import add.q;
import add.r;
import add.s;
import add.u;
import add.v;
import mm8.a;

public final class e0 implements b	// class@0000e1
{

    public void e0(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("SEARCH_HOT_TAG_FONT_TYPE", new t(this, p1));
       p0.i("AUTO_ALIAS_CALLER_CONTEXT", new w(this, p1));
       p0.i("CLICK_LIVE_TAB_COMMODITY_PENDANT", new x(this, p1));
       p0.i("feedCoversubject", new y(this, p1));
       p0.i("SEARCH_SWIPE_DETECTOR", new z(this, p1));
       p0.i("SLIDE_ENABLE_EXIT_SHRINK", new a0(this, p1));
       p0.i("SEARCH_FEED_BUTTON_SUBJECT", new b0(this, p1));
       p0.i("SEARCH_ITEM_SUBJECT", new c0(this, p1));
       p0.i("SEARCH_ITEM_WIDGET_SUBJECT", new d0(this, p1));
       p0.i("SEARCH_FRAGMENT_DELEGATE", new j(this, p1));
       p0.i("ENABLE_SLIDE_POSIIION_CHANGE_EVENT", new k(this, p1));
       p0.i("SEARCH_LIST_SCROLL_STATE", new l(this, p1));
       p0.i("AD_SEARCH_LIVE_CLICK_INTERCEPT", new m(this, p1));
       p0.i("LIVE_STREAM_CLICK_LISTENER", new n(this, p1));
       p0.h(f0.class, new o(this, p1));
       if (p1.t != null) {
          Accessors.d().b(p1.t).a(p0, p1.t);
       }
       p0.i("PHOTO_CLICK_LISTENER", new p(this, p1));
       p0.i("SEARCH_PLAY_RECOMMEND_CONTROLLER", new q(this, p1));
       p0.i("SEARCH_PAGE", new r(this, p1));
       p0.i("SEARCH_RESULT_DELEGATE", new s(this, p1));
       u ou = new u(this, p1);
       String str = "SEARCH_MUSIC_PLAYER";
       try{
          p0.i(str, ou);
          p0.h(a.class, new v(this, p1));
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
