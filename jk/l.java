package jk.l;
import java.lang.Runnable;
import com.google.android.material.tabs.KCubeTabLayout;
import java.lang.Object;

public final class l implements Runnable	// class@002427
{
    public final KCubeTabLayout b;

    public void l(KCubeTabLayout p0){
       this.b = p0;
    }
    public final void run(){
       KCubeTabLayout.N(this.b);
    }
}
