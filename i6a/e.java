package i6a.e;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.interest.InterestLabelsFragment;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import i6a.c;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import i6a.d;
import mm8.a;

public final class e implements b	// class@00278f
{

    public void e(){
       super();
    }
    public void a(a p0,Object p1){
       NasaBizParam nasaBizParam = NasaBizParam.class;
       c uoc = new c(this, p1);
       try{
          p0.h(nasaBizParam, uoc);
          p0.h(InterestLabelsFragment.class, new d(this, p1));
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
