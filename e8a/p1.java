package e8a.p1;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.SlideVerticalAtlasExpandPresenter;
import e8a.n1;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import e8a.o1;
import java.lang.Class;
import mm8.a;

public final class p1 implements b	// class@0020cc
{

    public void p1(){
       super();
    }
    public void a(a p0,Object p1){
       n1 on1 = new n1(this, p1);
       String str = "DETAIL_LONG_ATLAS_LONG_PRESS";
       try{
          p0.i(str, on1);
          p0.h(SlideVerticalAtlasExpandPresenter.class, new o1(this, p1));
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
