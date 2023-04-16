package mgd.h;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import mgd.b;
import mgd.c;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import mgd.d;
import mgd.e;
import mgd.f;
import mgd.g;
import java.lang.Class;
import mm8.a;

public final class h implements b	// class@001d1c
{

    public void h(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("FONT_SCALE_SETTINGS_FOLLOW_SYSTEM_SUBJECT", new c(this, p1));
       p0.i("FONT_SCALE_SETTINGS_FONT_SCALE_SELECT_SUBJECT", new d(this, p1));
       p0.i("FONT_SCALE_SETTINGS_FONT_SCALE_SUBJECT", new e(this, p1));
       f uof = new f(this, p1);
       String str = "FRAGMENT";
       try{
          p0.i(str, uof);
          p0.h(b.class, new g(this, p1));
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
