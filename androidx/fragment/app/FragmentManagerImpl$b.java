package androidx.fragment.app.FragmentManagerImpl$b;
import java.lang.Runnable;
import androidx.fragment.app.FragmentManagerImpl;
import java.lang.Object;

public class FragmentManagerImpl$b implements Runnable	// class@000784
{
    public final FragmentManagerImpl b;

    public void FragmentManagerImpl$b(FragmentManagerImpl p0){
       this.b = p0;
       super();
    }
    public void run(){
       this.b.execPendingActions();
    }
}
