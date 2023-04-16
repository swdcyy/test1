package cm2.j;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import cm2.e;
import cm2.f;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import cm2.g;
import cm2.h;
import cm2.i;
import java.lang.Class;
import mm8.a;

public final class j implements b	// class@000561
{

    public void j(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("LIVE_BASIC_CONTEXT", new f(this, p1));
       p0.i("VOTE_TIME_UPDATE_SUBJECT", new g(this, p1));
       h oh = new h(this, p1);
       String str = "VOTE_INFO_UPDATE_SUBJECT";
       try{
          p0.i(str, oh);
          p0.h(e.class, new i(this, p1));
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
