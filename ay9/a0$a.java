package ay9.a0$a;
import android.text.style.ClickableSpan;
import ay9.a0;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qp7.x0;
import qp7.b;
import com.kwai.slide.play.detail.information.caption.l;
import android.text.TextPaint;
import lnc.a1;

public class a0$a extends ClickableSpan	// class@0002e9
{
    public final a0 b;

    public void a0$a(a0 p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a0$a.class, "1")) {
          return;
       }
       this.b.E().m();
       return;
    }
    public void updateDrawState(TextPaint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a0$a.class, "2")) {
          return;
       }
       p0.setUnderlineText(false);
       p0.setColor(a1.a(R.color.arg_RES_7f061e5a));
       return;
    }
}
