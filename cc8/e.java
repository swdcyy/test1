package cc8.e;
import android.view.View$OnClickListener;
import com.mini.js.jsapi.ui.nativeui.a;
import java.lang.Object;
import android.view.View;
import android.app.Dialog;
import com.mini.js.jsapi.ui.nativeui.a$b;

public final class e implements View$OnClickListener	// class@0003e5
{
    public final a b;

    public void e(a p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       e tb = this.b;
       tb.dismiss();
       a g = tb.g;
       if (g != null) {
          g.onConfirm();
          tb.g.onComplete();
       }
       return;
    }
}
