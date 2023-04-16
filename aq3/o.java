package aq3.o;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import aq3.p;
import com.kuaishou.live.tuna.presenter.LiveAudienceTunaRequestPresenter;
import java.lang.Object;

public class o extends Accessor	// class@0002aa
{
    public final LiveAudienceTunaRequestPresenter c;
    public final p d;

    public void o(p p0,LiveAudienceTunaRequestPresenter p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c;
    }
}
