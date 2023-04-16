package b8c.h;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import b8c.b;
import b8c.c;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import b8c.d;
import b8c.e;
import b8c.f;
import b8c.g;
import java.lang.Class;
import mm8.a;

public final class h implements b	// class@0003d7
{

    public void h(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("CURRENT_PLAY_HOT_RANK_GATHER_INFO_ID", new c(this, p1));
       p0.i("PLAY_RANK_GATHER_CHANGE_OBSERVABLE", new d(this, p1));
       p0.i("RANK_GATHER_FEED_PAGE_LIST", new e(this, p1));
       f uof = new f(this, p1);
       String str = "USE_BLACK_TIP_GUIDE";
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
