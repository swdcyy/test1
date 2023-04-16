package h6a.c1;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.NasaGrootHorizontalDetailVMFragment;
import w85.a;
import h6a.z0;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import h6a.a1;
import h6a.b1;
import mm8.a;

public final class c1 implements b	// class@00257a
{

    public void c1(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(a.class, new z0(this, p1));
       NasaBizParam nasaBizParam = NasaBizParam.class;
       a1 uoa1 = new a1(this, p1);
       try{
          p0.h(nasaBizParam, uoa1);
          p0.h(NasaGrootHorizontalDetailVMFragment.class, new b1(this, p1));
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
