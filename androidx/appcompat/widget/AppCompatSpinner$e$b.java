package androidx.appcompat.widget.AppCompatSpinner$e$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import androidx.appcompat.widget.AppCompatSpinner$e;
import java.lang.Object;
import android.view.View;
import androidx.appcompat.widget.ListPopupWindow;

public class AppCompatSpinner$e$b implements ViewTreeObserver$OnGlobalLayoutListener	// class@0005f3
{
    public final AppCompatSpinner$e b;

    public void AppCompatSpinner$e$b(AppCompatSpinner$e p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       AppCompatSpinner$e$b tb = this.b;
       if (!tb.P(tb.O)) {
          this.b.dismiss();
       }else {
          this.b.O();
          AppCompatSpinner$e.N(this.b);
       }
       return;
    }
}
