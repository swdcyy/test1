package b45.c;
import java.lang.Runnable;
import android.app.Activity;
import java.lang.Object;
import com.kwai.android.common.utils.ActivityStack;

public final class c implements Runnable	// class@000343
{
    public final Activity b;

    public void c(Activity p0){
       this.b = p0;
    }
    public final void run(){
       ActivityStack.e(this.b);
    }
}
