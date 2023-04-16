package i21.f;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import i21.g;
import com.kuaishou.live.audience.component.multipk.LiveAudienceMultiPkPresenter;
import java.lang.Object;

public class f extends Accessor	// class@002814
{
    public final LiveAudienceMultiPkPresenter c;
    public final g d;

    public void f(g p0,LiveAudienceMultiPkPresenter p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c;
    }
}
