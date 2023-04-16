package androidx.fragment.app.FragmentManagerImpl$c$a;
import java.lang.Runnable;
import androidx.fragment.app.FragmentManagerImpl$c;
import java.lang.Object;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManagerImpl;

public class FragmentManagerImpl$c$a implements Runnable	// class@000785
{
    public final FragmentManagerImpl$c b;

    public void FragmentManagerImpl$c$a(FragmentManagerImpl$c p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (this.b.c.getAnimatingAway() != null) {
          this.b.c.setAnimatingAway(null);
          FragmentManagerImpl$c$a tb = this.b;
          FragmentManagerImpl$c c = tb.c;
          tb.d.moveToState(c, c.getStateAfterAnimating(), 0, 0, false);
       }
       return;
    }
}
