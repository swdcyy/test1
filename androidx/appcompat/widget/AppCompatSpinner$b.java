package androidx.appcompat.widget.AppCompatSpinner$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import androidx.appcompat.widget.AppCompatSpinner;
import java.lang.Object;
import androidx.appcompat.widget.AppCompatSpinner$f;
import android.view.ViewTreeObserver;
import android.widget.Spinner;

public class AppCompatSpinner$b implements ViewTreeObserver$OnGlobalLayoutListener	// class@0005ef
{
    public final AppCompatSpinner b;

    public void AppCompatSpinner$b(AppCompatSpinner p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (!this.b.getInternalPopup().d()) {
          this.b.b();
       }
       ViewTreeObserver viewTreeObse = this.b.getViewTreeObserver();
       if (viewTreeObse != null) {
          viewTreeObse.removeOnGlobalLayoutListener(this);
       }
       return;
    }
}
