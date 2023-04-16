package ap8.a;
import java.lang.Runnable;
import com.tachikoma.core.component.input.a;
import android.view.inputmethod.InputMethodManager;
import java.lang.Object;
import android.widget.EditText;

public final class a implements Runnable	// class@0002fb
{
    public final a b;
    public final InputMethodManager c;

    public void a(a p0,InputMethodManager p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       a tc = this.c;
       this.b.a.requestFocus();
       if (tc != null) {
          tc.toggleSoftInput(2, 2);
       }
       return;
    }
}
