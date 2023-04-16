package h6a.d0;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.NasaGrootDetailVMFragment;
import w85.a;
import h6a.a0;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import h6a.b0;
import h6a.c0;
import mm8.a;

public final class d0 implements b	// class@00257d
{

    public void d0(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(a.class, new a0(this, p1));
       NasaBizParam nasaBizParam = NasaBizParam.class;
       b0 uob0 = new b0(this, p1);
       try{
          p0.h(nasaBizParam, uob0);
          p0.h(NasaGrootDetailVMFragment.class, new c0(this, p1));
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
