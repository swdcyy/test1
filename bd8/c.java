package bd8.c;
import java.lang.Runnable;
import com.mini.js.jscomponent.keyboard.KeyboardHeightCalculatePopupWindow;
import android.view.View;
import java.lang.Object;
import android.widget.PopupWindow;

public final class c implements Runnable	// class@00032d
{
    public final KeyboardHeightCalculatePopupWindow b;
    public final View c;

    public void c(KeyboardHeightCalculatePopupWindow p0,View p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.showAtLocation(this.c, 0, 0, 0);
    }
}
