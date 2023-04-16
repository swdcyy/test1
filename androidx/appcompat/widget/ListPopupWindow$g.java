package androidx.appcompat.widget.ListPopupWindow$g;
import java.lang.Runnable;
import androidx.appcompat.widget.ListPopupWindow;
import java.lang.Object;
import android.view.View;
import a2.i0;
import android.widget.ListView;
import android.widget.PopupWindow;

public class ListPopupWindow$g implements Runnable	// class@00060b
{
    public final ListPopupWindow b;

    public void ListPopupWindow$g(ListPopupWindow p0){
       this.b = p0;
       super();
    }
    public void run(){
       ListPopupWindow d = this.b.d;
       if (d != null && (i0.X(d) && this.b.d.getCount() > this.b.d.getChildCount())) {
          ListPopupWindow$g tb = this.b;
          if (this.b.d.getChildCount() <= tb.p) {
             tb.G.setInputMethodMode(2);
             this.b.show();
          }
       }
       return;
    }
}
