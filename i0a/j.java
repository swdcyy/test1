package i0a.j;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import i0a.e;
import i0a.k;
import i0a.f;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.smile.gifshow.annotation.provider.v2.Accessors;
import i0a.g;
import java.lang.String;
import i0a.h;
import i0a.i;
import mm8.a;

public final class j implements b	// class@00274f
{

    public void j(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(k.class, new f(this, p1));
       if (p1.m != null) {
          Accessors.d().b(p1.m).a(p0, p1.m);
       }
       p0.i("DETAIL_ACTION_BAR_PARAM", new g(this, p1));
       h oh = new h(this, p1);
       String str = "SLIDE_PLAY_FETCHER_ID";
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
