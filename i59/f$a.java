package i59.f$a;
import com.yxcorp.gifshow.util.span.a;
import i59.f$b;
import msd.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.text.TextPaint;

public class f$a extends a	// class@002634
{
    public final f$b c;
    public final a d;

    public void f$a(f$b p0,a p1){
       super();
       this.c = p0;
       this.d = p1;
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "1")) {
          return;
       }
       this.d.invoke();
       return;
    }
    public void updateDrawState(TextPaint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "2")) {
          return;
       }
       f$b a = this.c.a;
       p0.linkColor = a;
       p0.setColor(a);
       p0.setUnderlineText(false);
       return;
    }
}
