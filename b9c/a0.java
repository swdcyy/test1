package b9c.a0;
import java.lang.Runnable;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragmentV2;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class a0 implements Runnable	// class@0003d9
{
    public final TabHostFragmentV2 b;
    public final int c;

    public void a0(TabHostFragmentV2 p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       Fragment uFragment = this.b.eh(this.c);
       if (uFragment instanceof BaseFragment) {
          uFragment.Yg();
       }
       return;
    }
}
