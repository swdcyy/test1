package ekd.i0;
import java.lang.Runnable;
import com.yxcorp.utility.j$a;
import java.lang.Object;
import com.yxcorp.utility.j;
import android.view.View;
import android.view.Window;
import android.view.View$OnSystemUiVisibilityChangeListener;

public final class i0 implements Runnable	// class@000d50
{
    public final j$a b;

    public void i0(j$a p0){
       this.b = p0;
    }
    public final void run(){
       i0 tb = this.b;
       tb.b.b.getDecorView().setOnSystemUiVisibilityChangeListener(tb.b);
    }
}
