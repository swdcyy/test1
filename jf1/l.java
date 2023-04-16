package jf1.l;
import android.text.style.ClickableSpan;
import jf1.m;
import com.kuaishou.live.common.core.component.comments.model.LiveFansTopHelpBuyMessage;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o81.f;

public class l extends ClickableSpan	// class@002b75
{
    public final LiveFansTopHelpBuyMessage b;
    public final m c;

    public void l(m p0,LiveFansTopHelpBuyMessage p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
          return;
       }
       m a = this.c.a;
       if (a != null) {
          a.b(this.b, p0);
       }
       return;
    }
}
