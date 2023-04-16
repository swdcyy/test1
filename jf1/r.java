package jf1.r;
import android.text.style.ClickableSpan;
import jf1.s;
import com.kuaishou.live.core.show.gift.GiftMessage;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.comments.b$a;

public class r extends ClickableSpan	// class@002b7c
{
    public final GiftMessage b;
    public final s c;

    public void r(s p0,GiftMessage p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "1")) {
          return;
       }
       this.c.a.a(this.b);
       return;
    }
}
