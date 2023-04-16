package cy0.g;
import android.widget.PopupWindow;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import i2b.a;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;

public class g extends PopupWindow	// class@001ea7
{

    public void g(Context p0){
       super(p0);
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
       }else {
          this.setContentView(a.a(p0, R.layout.arg_RES_7f0d0a1f));
          this.setBackgroundDrawable(new ColorDrawable(0));
          this.setOutsideTouchable(true);
          this.setFocusable(0);
       }
       return;
    }
}
