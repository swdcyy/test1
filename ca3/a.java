package ca3.a;
import android.text.style.ClickableSpan;
import com.kuaishou.live.lite.comment.view.item.gift.GiftSentMessageViewController;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ca3.c;
import ca3.c$b$a;
import ca3.c$b;

public final class a extends ClickableSpan	// class@0004d2
{
    public final GiftSentMessageViewController b;

    public void a(GiftSentMessageViewController p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a.p(p0, "widget");
       this.b.Y2().u0(new c$b$a());
       return;
    }
}
