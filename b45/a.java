package b45.a;
import java.lang.Runnable;
import android.app.Activity;
import java.lang.Object;
import com.kwai.android.common.utils.ActivityStack;

public final class a implements Runnable	// class@000341
{
    public final Activity b;

    public void a(Activity p0){
       this.b = p0;
    }
    public final void run(){
       ActivityStack.a(this.b);
    }
}
