package ggd.u;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import ggd.n;
import ggd.o;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ggd.p;
import ggd.q;
import ggd.r;
import ggd.s;
import ggd.t;
import java.lang.Class;
import mm8.a;

public final class u implements b	// class@000f25
{

    public void u(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("NEWS_SETTING_ERROR_CONSUMER", new o(this, p1));
       p0.i("NEWS_SETTING_FRAGMENT", new p(this, p1));
       p0.i("NEWS_SETTING_CLICK_SUBJECT", new q(this, p1));
       p0.i("NEWS_SETTING_INIT_COUNT", new r(this, p1));
       s os = new s(this, p1);
       String str = "NEWS_SETTING_INIT_TYPE";
       try{
          p0.i(str, os);
          p0.h(n.class, new t(this, p1));
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
