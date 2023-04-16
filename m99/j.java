package m99.j;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import m99.k$a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import m99.g;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.smile.gifshow.annotation.provider.v2.Accessors;
import m99.h;
import java.lang.String;
import m99.i;
import mm8.a;

public final class j implements b	// class@002e32
{

    public void j(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(PhotoDetailParam.class, new g(this, p1));
       if (p1.h != null) {
          Accessors.d().b(p1.h).a(p0, p1.h);
       }
       h oh = new h(this, p1);
       String str = "DETAIL_FRAGMENT";
       try{
          p0.i(str, oh);
          p0.h(k$a.class, new i(this, p1));
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
