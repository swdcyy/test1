package ba3.e;
import java.lang.Runnable;
import android.view.View;
import com.kuaishou.live.lite.comment.view.item.SimpleCommentMessageViewController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.comment.view.ItemViewControllerFactory$a;
import ba3.a;
import s93.b;

public final class e implements Runnable	// class@000341
{
    public final View b;
    public final SimpleCommentMessageViewController c;

    public void e(View p0,SimpleCommentMessageViewController p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.c.V2().f().a();
       return;
    }
}
