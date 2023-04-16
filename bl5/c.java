package bl5.c;
import android.view.View$OnClickListener;
import bl5.g;
import java.lang.Object;
import android.view.View;
import android.view.KeyEvent;
import android.widget.EditText;

public final class c implements View$OnClickListener	// class@0004ce
{
    public final g b;

    public void c(g p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       g p = this.b.p;
       if (p != null) {
          p.dispatchKeyEvent(new KeyEvent(0, 67));
       }
       return;
    }
}
