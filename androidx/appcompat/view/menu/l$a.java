package androidx.appcompat.view.menu.l$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import androidx.appcompat.view.menu.l;
import java.lang.Object;
import androidx.appcompat.widget.ListPopupWindow;
import android.view.View;

public class l$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@0005b7
{
    public final l b;

    public void l$a(l p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (this.b.d() && !this.b.j.x()) {
          l o = this.b.o;
          if (o == null || !o.isShown()) {
             this.b.dismiss();
          }else {
             this.b.j.show();
          }
       }
       return;
    }
}
