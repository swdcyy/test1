package ea2.i;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.live.core.show.hourlytrank.ranklist.LiveHourlyRankListDialogPresenter;
import ea2.g;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ea2.h;
import java.lang.Class;
import mm8.a;

public final class i implements b	// class@0026d0
{

    public void i(){
       super();
    }
    public void a(a p0,Object p1){
       g og = new g(this, p1);
       String str = "LIVE_HOURLY_RANK_LIST_SERVICE";
       try{
          p0.i(str, og);
          p0.h(LiveHourlyRankListDialogPresenter.class, new h(this, p1));
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
