package dta.h0;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.homepage.kcube.presenter.a;
import dta.f0;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import dta.g0;
import java.lang.Class;
import mm8.a;

public final class h0 implements b	// class@002533
{

    public void h0(){
       super();
    }
    public void a(a p0,Object p1){
       f0 uof0 = new f0(this, p1);
       String str = "ACTION_BAR_CONTROLLER_PROVIDER";
       try{
          p0.i(str, uof0);
          p0.h(a.class, new g0(this, p1));
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