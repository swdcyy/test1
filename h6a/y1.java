package h6a.y1;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.NasaGrootVerticalDetailVMFragment;
import w85.a;
import h6a.v1;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import h6a.w1;
import h6a.x1;
import mm8.a;

public final class y1 implements b	// class@0025d2
{

    public void y1(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(a.class, new v1(this, p1));
       NasaBizParam nasaBizParam = NasaBizParam.class;
       w1 ow1 = new w1(this, p1);
       try{
          p0.h(nasaBizParam, ow1);
          p0.h(NasaGrootVerticalDetailVMFragment.class, new x1(this, p1));
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
