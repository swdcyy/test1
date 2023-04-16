package kx8.s;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.yxcorp.gifshow.activity.web.OperateWebViewFragment;
import kx8.p;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import kx8.q;
import kx8.r;
import java.lang.Class;
import mm8.a;

public final class s implements b	// class@002c49
{

    public void s(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("ACTIVITY_CONFIG", new p(this, p1));
       q oq = new q(this, p1);
       String str = "ON_MULTI_WINDOW_MODE_CHANGED_EVENT";
       try{
          p0.i(str, oq);
          p0.h(OperateWebViewFragment.class, new r(this, p1));
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
