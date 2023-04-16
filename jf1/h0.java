package jf1.h0;
import android.text.style.ClickableSpan;
import jf1.i0;
import com.kuaishou.live.common.core.component.comments.model.RichTextMessageOld;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o81.f;

public class h0 extends ClickableSpan	// class@002b6a
{
    public final RichTextMessageOld b;
    public final i0 c;

    public void h0(i0 p0,RichTextMessageOld p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h0.class, "1")) {
          return;
       }
       i0 a = this.c.a;
       if (a != null) {
          a.b(this.b, p0);
       }
       return;
    }
}
