package cb5.l;
import erd.g;
import com.kwai.component.homepage_interface.homeitemfragment.presenter.e;
import java.lang.Object;
import cda.d;

public final class l implements g	// class@00044f
{
    public final e b;

    public void l(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.onEventMainThread(p0);
    }
}
