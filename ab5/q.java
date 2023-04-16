package ab5.q;
import e9c.h$d;
import com.kwai.component.homepage_interface.homeitemfragment.HomeItemFragment;
import java.lang.Object;
import hka.k;
import com.yxcorp.gifshow.refresh.RefreshType;
import com.kwai.component.homepage_interface.homeitemfragment.a;

public final class q implements h$d	// class@000058
{
    public final HomeItemFragment a;

    public void q(HomeItemFragment p0){
       this.a = p0;
    }
    public final boolean a(k p0){
       return this.a.G.g(RefreshType.PULL_DOWN, true);
    }
}
