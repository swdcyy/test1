package eva.h;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.hot.spot.fragment.HotSpotFragment;
import q99.a;
import eva.b;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.smile.gifshow.annotation.provider.v2.Accessors;
import eva.c;
import java.lang.String;
import eva.d;
import eva.e;
import eva.f;
import eva.g;
import mm8.a;

public final class h implements b	// class@00283e
{

    public void h(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(a.class, new b(this, p1));
       if (p1.di() != null) {
          Accessors.d().b(p1.di()).a(p0, p1.di());
       }
       p0.i("HOME_AUTO_SCROLL_TO_TOP_TYPE", new c(this, p1));
       p0.i("LOAD_MORE_HELPER", new d(this, p1));
       p0.i("PAGE_CARD_STYLE", new e(this, p1));
       f uof = new f(this, p1);
       String str = "REAL_ACTION_BIZ_TYPE";
       try{
          p0.i(str, uof);
          p0.h(HotSpotFragment.class, new g(this, p1));
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
