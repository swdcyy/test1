package aq3.p;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.live.tuna.presenter.LiveAudienceTunaRequestPresenter;
import aq3.l;
import aq3.n;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import aq3.o;
import mm8.a;

public final class p implements b	// class@0002ab
{

    public void p(){
       super();
    }
    public void a(a p0,Object p1){
       l ol = l.class;
       n on = new n(this, p1);
       try{
          p0.h(ol, on);
          p0.h(LiveAudienceTunaRequestPresenter.class, new o(this, p1));
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
