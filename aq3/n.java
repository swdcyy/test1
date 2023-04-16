package aq3.n;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import aq3.p;
import com.kuaishou.live.tuna.presenter.LiveAudienceTunaRequestPresenter;
import java.lang.Object;
import aq3.l;

public class n extends Accessor	// class@0002a9
{
    public final LiveAudienceTunaRequestPresenter c;
    public final p d;

    public void n(p p0,LiveAudienceTunaRequestPresenter p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.a9();
    }
}
