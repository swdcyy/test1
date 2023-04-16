package androidx.appcompat.widget.AppCompatSpinner$e$c;
import android.widget.PopupWindow$OnDismissListener;
import androidx.appcompat.widget.AppCompatSpinner$e;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import java.lang.Object;
import android.view.ViewTreeObserver;
import android.widget.Spinner;

public class AppCompatSpinner$e$c implements PopupWindow$OnDismissListener	// class@0005f4
{
    public final ViewTreeObserver$OnGlobalLayoutListener b;
    public final AppCompatSpinner$e c;

    public void AppCompatSpinner$e$c(AppCompatSpinner$e p0,ViewTreeObserver$OnGlobalLayoutListener p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onDismiss(){
       ViewTreeObserver viewTreeObse = this.c.O.getViewTreeObserver();
       if (viewTreeObse != null) {
          viewTreeObse.removeGlobalOnLayoutListener(this.b);
       }
       return;
    }
}
