package ba3.c;
import android.view.View$OnClickListener;
import com.kuaishou.live.lite.comment.view.item.SimpleCommentMessageViewController;
import ba3.i$d;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ba3.i;
import ba3.i$b$a;
import ba3.i$b;
import s93.r;
import com.kuaishou.live.lite.comment.view.ItemViewControllerFactory$a;
import ba3.a;
import xp5.i;
import androidx.lifecycle.LiveData;
import java.lang.Integer;
import kotlin.jvm.internal.a;

public final class c implements View$OnClickListener	// class@00033f
{
    public final SimpleCommentMessageViewController b;
    public final i$d c;

    public void c(SimpleCommentMessageViewController p0,i$d p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       this.b.Z2().v0(i$b$a.a);
       r a = r.a;
       i oi = this.b.V2().e();
       i$d a1 = this.c.a;
       Integer value = this.b.W2().getValue();
       if (value == null) {
          value = Integer.valueOf(-1);
       }
       a.o(value, "position.value ?: -1");
       a.b(oi, a1, value.intValue());
       return;
    }
}
