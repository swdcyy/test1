package dl9.m$d;
import android.text.style.ClickableSpan;
import dl9.m;
import com.kuaishou.android.model.mix.QComment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.text.TextPaint;

public class m$d extends ClickableSpan	// class@001f7d
{
    public final QComment b;
    public final m c;

    public void m$d(m p0,QComment p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$d.class, "2")) {
          return;
       }
       this.c.c9(this.b, true);
       return;
    }
    public void updateDrawState(TextPaint p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$d.class, "1")) {
          return;
       }
       p0.setColor(this.c.y);
       return;
    }
}
