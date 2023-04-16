package ab5.p;
import e9c.h$b;
import com.kwai.component.homepage_interface.homeitemfragment.HomeItemFragment;
import java.lang.Object;
import com.yxcorp.gifshow.refresh.RefreshType;
import com.kwai.component.homepage_interface.homeitemfragment.a;
import on5.b;
import com.kwai.kcube.TabIdentifier;
import gsa.i0;

public final class p implements h$b	// class@000057
{
    public final HomeItemFragment a;

    public void p(HomeItemFragment p0){
       this.a = p0;
    }
    public final boolean a(){
       p ta = this.a;
       boolean b = (ta.G.e() != RefreshType.INIT && (ta.G.e() != RefreshType.RETAIN_FIRST_PAGE && (ta.G.e() != RefreshType.FOREGROUND2 && (b.b.equals(ta.Ua()) || (!b.d.equals(ta.Ua()) || ta.G.e() != RefreshType.RESUME)))))? true: false;
       return b;
    }
}
