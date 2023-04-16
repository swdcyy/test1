package cd8.c;
import android.widget.PopupWindow$OnDismissListener;
import cd8.e;
import java.lang.Object;
import java.util.Objects;
import com.mini.d;
import java.lang.String;
import cd8.f;
import cd8.f$a;

public final class c implements PopupWindow$OnDismissListener	// class@0003f4
{
    public final e b;

    public void c(e p0){
       this.b = p0;
    }
    public final void onDismiss(){
       e d;
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (d.f()) {
          d.a("#CustomKeyboard#", "自定义Keyboard 的onDismiss 回调。。");
       }
       d = tb.d;
       if (d != null) {
          d.h(tb);
       }
       return;
    }
}
