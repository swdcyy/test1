package ba3.g;
import android.content.DialogInterface$OnCancelListener;
import com.kuaishou.live.lite.comment.view.item.SimpleCommentMessageViewController;
import com.kuaishou.live.lite.comment.model.SimpleCommentMessage;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import s93.r;
import com.kuaishou.live.lite.comment.view.ItemViewControllerFactory$a;
import ba3.a;
import xp5.i;
import com.kuaishou.live.lite.comment.model.AbstractCommentMessage;
import lnc.a1;
import kotlin.jvm.internal.a;

public final class g implements DialogInterface$OnCancelListener	// class@000343
{
    public final SimpleCommentMessageViewController b;
    public final SimpleCommentMessage c;

    public void g(SimpleCommentMessageViewController p0,SimpleCommentMessage p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onCancel(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       String str = a1.p(R.string.cancel);
       a.o(str, "CommonUtil.string\(R.string.cancel\)");
       r.a.a(this.b.V2().e(), this.c.isAnonymous(), str);
       return;
    }
}
