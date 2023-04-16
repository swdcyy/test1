package i8a.g$a;
import android.text.style.ClickableSpan;
import i8a.g;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View$OnClickListener;
import android.text.TextPaint;
import lnc.a1;

public class g$a extends ClickableSpan	// class@0027c6
{
    public final g b;

    public void g$a(g p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a.class, "1")) {
          return;
       }
       g u = this.b.u;
       if (u != null) {
          u.onClick(p0);
       }
       return;
    }
    public void updateDrawState(TextPaint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a.class, "2")) {
          return;
       }
       p0.setUnderlineText(false);
       p0.setColor(a1.a(R.color.arg_RES_7f061e5a));
       return;
    }
}
