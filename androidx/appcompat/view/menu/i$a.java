package androidx.appcompat.view.menu.i$a;
import android.widget.PopupWindow$OnDismissListener;
import androidx.appcompat.view.menu.i;
import java.lang.Object;

public class i$a implements PopupWindow$OnDismissListener	// class@0005b1
{
    public final i b;

    public void i$a(i p0){
       this.b = p0;
       super();
    }
    public void onDismiss(){
       this.b.e();
    }
}
