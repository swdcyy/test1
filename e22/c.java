package e22.c;
import java.lang.Runnable;
import com.kuaishou.live.core.basic.widget.tabhost.LiveTabHostFragment;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class c implements Runnable	// class@002612
{
    public final LiveTabHostFragment b;
    public final int c;

    public void c(LiveTabHostFragment p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       Fragment uFragment = this.b.dh(this.c);
       if (uFragment instanceof BaseFragment) {
          uFragment.Yg();
       }
       return;
    }
}
