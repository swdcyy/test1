package ac8.l;
import java.lang.Runnable;
import com.mini.js.jscomponent.navigationbar.NavigationView;
import java.lang.Object;
import com.mini.js.jscomponent.navigationbar.NavigationView$BackIcon;

public final class l implements Runnable	// class@00006a
{
    public final NavigationView b;

    public void l(NavigationView p0){
       this.b = p0;
    }
    public final void run(){
       this.b.setBackBtnStyle(NavigationView$BackIcon.INVISIBLE);
    }
}
