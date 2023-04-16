package androidx.fragment.app.Fragment$a;
import java.lang.Runnable;
import androidx.fragment.app.Fragment;
import java.lang.Object;

public class Fragment$a implements Runnable	// class@00077a
{
    public final Fragment b;

    public void Fragment$a(Fragment p0){
       this.b = p0;
       super();
    }
    public void run(){
       this.b.startPostponedEnterTransition();
    }
}
