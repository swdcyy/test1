package j6a.g;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.location.NasaLocationPermissionFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import j6a.d;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import j6a.e;
import j6a.f;
import mm8.a;

public final class g implements b	// class@002919
{

    public void g(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(BaseFragment.class, new d(this, p1));
       NasaBizParam nasaBizParam = NasaBizParam.class;
       e uoe = new e(this, p1);
       try{
          p0.h(nasaBizParam, uoe);
          p0.h(NasaLocationPermissionFragment.class, new f(this, p1));
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
