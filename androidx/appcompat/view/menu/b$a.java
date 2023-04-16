package androidx.appcompat.view.menu.b$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import androidx.appcompat.view.menu.b;
import java.lang.Object;
import java.util.List;
import androidx.appcompat.view.menu.b$d;
import androidx.appcompat.widget.ListPopupWindow;
import android.view.View;
import java.util.Iterator;

public class b$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@0005a1
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (this.b.d() && (this.b.j.size() > 0 && !this.b.j.get(0).a.x())) {
          b q = this.b.q;
          if (q == null || !q.isShown()) {
             this.b.dismiss();
          }else {
             Iterator iterator = this.b.j.iterator();
             while (iterator.hasNext()) {
                iterator.next().a.show();
             }
          }
       }
       return;
    }
}
