package dwa.h;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import dwa.b;
import dwa.c;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import dwa.d;
import com.yxcorp.gifshow.entity.QPhoto;
import dwa.e;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessors;
import dwa.f;
import dwa.g;
import mm8.a;

public final class h implements b	// class@002591
{

    public void h(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("AUTO_PLAY_LIVE_MODULE", new c(this, p1));
       p0.i("AUTO_PLAY_LIVE_CONFIG", new d(this, p1));
       p0.h(QPhoto.class, new e(this, p1));
       if (p1.h != null) {
          Accessors.d().b(p1.h).a(p0, p1.h);
       }
       f uof = new f(this, p1);
       String str = "PLAYER_REUSE_SESSION_ID";
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
