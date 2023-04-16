package i21.g;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.live.audience.component.multipk.LiveAudienceMultiPkPresenter;
import rs1.b;
import i21.e;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import i21.f;
import mm8.a;

public final class g implements b	// class@002815
{

    public void g(){
       super();
    }
    public void a(a p0,Object p1){
       b uob = b.class;
       e uoe = new e(this, p1);
       try{
          p0.h(uob, uoe);
          p0.h(LiveAudienceMultiPkPresenter.class, new f(this, p1));
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
