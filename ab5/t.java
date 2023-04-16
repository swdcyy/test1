package ab5.t;
import java.lang.Runnable;
import com.kwai.component.homepage_interface.homeitemfragment.HomeItemFragment;
import android.content.res.Configuration;
import java.lang.Object;

public final class t implements Runnable	// class@00005b
{
    public final HomeItemFragment b;
    public final Configuration c;

    public void t(HomeItemFragment p0,Configuration p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       HomeItemFragment.Gh(this.b, this.c);
    }
}
