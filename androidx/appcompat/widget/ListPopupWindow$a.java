package androidx.appcompat.widget.ListPopupWindow$a;
import java.lang.Runnable;
import androidx.appcompat.widget.ListPopupWindow;
import java.lang.Object;
import android.view.View;
import android.os.IBinder;

public class ListPopupWindow$a implements Runnable	// class@000605
{
    public final ListPopupWindow b;

    public void ListPopupWindow$a(ListPopupWindow p0){
       this.b = p0;
       super();
    }
    public void run(){
       View view = this.b.t();
       if (view != null && view.getWindowToken() != null) {
          this.b.show();
       }
       return;
    }
}
