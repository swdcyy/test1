package m99.e;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import m99.f$a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import m99.a;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.smile.gifshow.annotation.provider.v2.Accessors;
import m99.b;
import java.lang.String;
import n89.a;
import m99.c;
import m99.d;
import mm8.a;

public final class e implements b	// class@002e2c
{

    public void e(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(PhotoDetailParam.class, new a(this, p1));
       if (p1.h != null) {
          Accessors.d().b(p1.h).a(p0, p1.h);
       }
       p0.i("IS_NONET_TOAST_SHOWED", new b(this, p1));
       p0.h(a.class, new c(this, p1));
       if (p1.i != null) {
          Accessors.d().b(p1.i).a(p0, p1.i);
       }
       try{
          p0.h(f$a.class, new d(this, p1));
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
