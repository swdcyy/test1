package ab5.s;
import java.lang.Runnable;
import com.kwai.component.homepage_interface.homeitemfragment.HomeItemFragment;
import java.lang.Object;
import com.yxcorp.gifshow.refresh.RefreshType;
import com.kwai.component.homepage_interface.homeitemfragment.a;

public final class s implements Runnable	// class@00005a
{
    public final HomeItemFragment b;

    public void s(HomeItemFragment p0){
       this.b = p0;
    }
    public final void run(){
       HomeItemFragment g = this.b.G;
       if (g != null) {
          g.f(RefreshType.TAB_CLICK);
       }
       return;
    }
}
