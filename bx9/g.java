package bx9.g;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import bx9.i$c;
import android.app.Activity;
import bx9.b;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import bx9.c;
import com.smile.gifshow.annotation.provider.v2.Accessors;
import com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailBizParam;
import bx9.d;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import bx9.e;
import bx9.f;
import mm8.a;

public final class g implements b	// class@000501
{

    public void g(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(Activity.class, new b(this, p1));
       p0.h(Object.class, new c(this, p1));
       if (p1.b != null) {
          Accessors.d().b(p1.b).a(p0, p1.b);
       }
       p0.h(NormalDetailBizParam.class, new d(this, p1));
       PhotoDetailParam photoDetailP = PhotoDetailParam.class;
       e uoe = new e(this, p1);
       try{
          p0.h(photoDetailP, uoe);
          p0.h(i$c.class, new f(this, p1));
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
