package i6a.j;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.interest.InterestManagementFragment;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import i6a.h;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import i6a.i;
import mm8.a;

public final class j implements b	// class@00279b
{

    public void j(){
       super();
    }
    public void a(a p0,Object p1){
       NasaBizParam nasaBizParam = NasaBizParam.class;
       h oh = new h(this, p1);
       try{
          p0.h(nasaBizParam, oh);
          p0.h(InterestManagementFragment.class, new i(this, p1));
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
