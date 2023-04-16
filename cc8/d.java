package cc8.d;
import android.view.View$OnClickListener;
import com.mini.js.jsapi.ui.nativeui.a;
import java.lang.Object;
import android.view.View;
import android.app.Dialog;
import com.mini.js.jsapi.ui.nativeui.a$b;

public final class d implements View$OnClickListener	// class@0003e4
{
    public final a b;

    public void d(a p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       d tb = this.b;
       tb.dismiss();
       a g = tb.g;
       if (g != null) {
          g.onCancel();
          tb.g.onComplete();
       }
       return;
    }
}
