package i6a.n;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.interest.InterestManagementV3Fragment;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import i6a.l;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import i6a.m;
import mm8.a;

public final class n implements b	// class@00279f
{

    public void n(){
       super();
    }
    public void a(a p0,Object p1){
       NasaBizParam nasaBizParam = NasaBizParam.class;
       l ol = new l(this, p1);
       try{
          p0.h(nasaBizParam, ol);
          p0.h(InterestManagementV3Fragment.class, new m(this, p1));
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
