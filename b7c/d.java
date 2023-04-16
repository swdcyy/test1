package b7c.d;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import b7c.a;
import com.kwai.framework.model.user.RecoUser;
import b7c.b;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import b7c.c;
import mm8.a;

public final class d implements b	// class@0003c5
{

    public void d(){
       super();
    }
    public void a(a p0,Object p1){
       RecoUser recoUser = RecoUser.class;
       b uob = new b(this, p1);
       try{
          p0.h(recoUser, uob);
          p0.h(a.class, new c(this, p1));
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
