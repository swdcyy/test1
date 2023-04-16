package ap8.b;
import java.lang.Runnable;
import com.tachikoma.core.component.input.a;
import android.view.inputmethod.InputMethodManager;
import java.lang.Object;
import android.view.View;
import android.widget.EditText;
import android.os.IBinder;

public final class b implements Runnable	// class@0002fc
{
    public final a b;
    public final InputMethodManager c;

    public void b(a p0,InputMethodManager p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       b tb = this.b;
       b tc = this.c;
       tb.a(tb.a);
       tb.a.clearFocus();
       if (tc != null) {
          tc.hideSoftInputFromWindow(tb.a.getWindowToken(), 0);
       }
       return;
    }
}
