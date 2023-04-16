package m3a.n;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import m3a.d;
import m3a.e;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import m3a.f;
import m3a.g;
import m3a.h;
import m3a.i;
import m3a.j;
import m3a.k;
import m3a.l;
import m3a.m;
import java.lang.Class;
import mm8.a;

public final class n implements b	// class@002f1a
{

    public void n(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("ENABLE_PICTURE_IN_PICTURE_MODE_OBSERVABLE", new e(this, p1));
       p0.i("ENABLE_PICTURE_IN_PICTURE_MODE_OBSERVER", new f(this, p1));
       p0.i("PIP_MODE_PLAY_INFO_LISTENER_OBSERVABLE", new g(this, p1));
       p0.i("PIP_MODE_PLAY_INFO_LISTENER_OBSERVER", new h(this, p1));
       p0.i("PREPARE_PICTURE_IN_PICTURE_MODE_OBSERVABLE", new i(this, p1));
       p0.i("PREPARE_PICTURE_IN_PICTURE_MODE_OBSERVER", new j(this, p1));
       p0.i("PIP_MODE_SYNC_PLAYER_PROGRESS_OBSERVABLE", new k(this, p1));
       l ol = new l(this, p1);
       String str = "PIP_MODE_SYNC_PLAYER_PROGRESS_OBSERVER";
       try{
          p0.i(str, ol);
          p0.h(d.class, new m(this, p1));
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
