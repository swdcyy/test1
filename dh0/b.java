package dh0.b;
import wj3.b;
import java.lang.Object;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.house.live.consult.LiveHouseConsultPendantPresenter;

public final class b implements b	// class@001f95
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final PresenterV2 build(){
       return new LiveHouseConsultPendantPresenter();
    }
}
