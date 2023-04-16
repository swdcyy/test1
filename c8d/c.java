package c8d.c;
import android.text.style.ClickableSpan;
import c8d.d;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.text.TextPaint;

public class c extends ClickableSpan	// class@0004f8
{
    public final int b;
    public final d c;

    public void c(d p0,int p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       this.c.W8();
       return;
    }
    public void updateDrawState(TextPaint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       p0.setColor(this.b);
       p0.setUnderlineText(false);
       return;
    }
}
