package ca3.b;
import android.view.View$OnClickListener;
import com.kuaishou.live.lite.comment.view.item.gift.GiftSentMessageViewController;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ca3.c;
import ca3.c$b$a;
import ca3.c$b;

public final class b implements View$OnClickListener	// class@0004d3
{
    public final GiftSentMessageViewController b;

    public void b(GiftSentMessageViewController p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.b.Y2().u0(new c$b$a());
       return;
    }
}
