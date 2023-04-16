package ba3.b;
import android.text.style.ClickableSpan;
import com.kuaishou.live.lite.comment.view.item.SimpleCommentMessageViewController;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ba3.i;
import ba3.i$b$a;
import ba3.i$b;

public final class b extends ClickableSpan	// class@00033e
{
    public final SimpleCommentMessageViewController b;

    public void b(SimpleCommentMessageViewController p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       a.p(p0, "widget");
       this.b.Z2().v0(i$b$a.a);
       return;
    }
}
