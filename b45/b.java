package b45.b;
import java.lang.Runnable;
import android.app.Activity;
import java.lang.Object;
import com.kwai.android.common.utils.ActivityStack;

public final class b implements Runnable	// class@000342
{
    public final Activity b;

    public void b(Activity p0){
       this.b = p0;
    }
    public final void run(){
       ActivityStack.b(this.b);
    }
}
