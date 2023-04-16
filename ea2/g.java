package ea2.g;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ea2.i;
import com.kuaishou.live.core.show.hourlytrank.ranklist.LiveHourlyRankListDialogPresenter;
import java.lang.Object;
import jt5.b;

public class g extends Accessor	// class@0026ce
{
    public final LiveHourlyRankListDialogPresenter c;
    public final i d;

    public void g(i p0,LiveHourlyRankListDialogPresenter p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.L;
    }
    public void set(Object p0){
       this.c.L = p0;
    }
}
