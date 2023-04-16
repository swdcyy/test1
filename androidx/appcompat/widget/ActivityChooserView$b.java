package androidx.appcompat.widget.ActivityChooserView$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import androidx.appcompat.widget.ActivityChooserView;
import java.lang.Object;
import android.view.ViewGroup;
import androidx.appcompat.widget.ListPopupWindow;
import a2.b;

public class ActivityChooserView$b implements ViewTreeObserver$OnGlobalLayoutListener	// class@0005d8
{
    public final ActivityChooserView b;

    public void ActivityChooserView$b(ActivityChooserView p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (this.b.b()) {
          if (!this.b.isShown()) {
             this.b.getListPopupWindow().dismiss();
          }else {
             this.b.getListPopupWindow().show();
             ActivityChooserView k = this.b.k;
             if (k != null) {
                k.k(true);
             }
          }
       }
       return;
    }
}
