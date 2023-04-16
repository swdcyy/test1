package k59.u;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import k59.d;
import k59.l;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import k59.m;
import k59.n;
import k59.o;
import k59.p;
import k59.h2;
import k59.q;
import java.lang.Class;
import k59.r;
import k59.s;
import k59.t;
import com.kuaishou.commercial.splash.presenter.h;
import k59.e;
import com.smile.gifshow.annotation.provider.v2.Accessors;
import k59.f;
import k59.g;
import k59.h;
import k59.i;
import k59.j;
import k59.k;
import mm8.a;

public final class u implements b	// class@002b26
{

    public void u(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("WEB_VISIBLE_CHANGED_LISTENER", new l(this, p1));
       p0.i("AD_WEB_ENABLE_PLAYABLE_POPUP", new m(this, p1));
       p0.i("AD_WEB_FRAGMENT", new n(this, p1));
       p0.i("IS_AD_LANDING_PAGE", new o(this, p1));
       p0.i("LAYOUT_TYPE", new p(this, p1));
       p0.h(h2.class, new q(this, p1));
       p0.i("PLAYABLE_FRAGMENT", new r(this, p1));
       p0.i("POPUP_HOLDER_VISIBLE_STATE_CHANGED", new s(this, p1));
       p0.i("AD_ADD_AVATAR_HEAD_INFO", new t(this, p1));
       p0.h(h.class, new e(this, p1));
       if (p1.h != null) {
          Accessors.d().b(p1.h).a(p0, p1.h);
       }
       p0.i("YODA_ACTION_BAR_DELEGATE", new f(this, p1));
       p0.i("WEB_ENTER_TIME", new g(this, p1));
       p0.i("WEB_REQUEST_INTERCEPTOR_LIST", new h(this, p1));
       p0.i("WEB_URL", new i(this, p1));
       j oj = new j(this, p1);
       String str = "YODA_CONTROLER";
       try{
          p0.i(str, oj);
          p0.h(d.class, new k(this, p1));
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
