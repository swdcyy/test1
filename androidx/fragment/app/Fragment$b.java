package androidx.fragment.app.Fragment$b;
import java.lang.Runnable;
import androidx.fragment.app.Fragment;
import java.lang.Object;

public class Fragment$b implements Runnable	// class@00077b
{
    public final Fragment b;

    public void Fragment$b(Fragment p0){
       this.b = p0;
       super();
    }
    public void run(){
       this.b.callStartTransitionListener();
    }
}
