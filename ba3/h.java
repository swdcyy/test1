package ba3.h;
import android.content.DialogInterface$OnDismissListener;
import com.kuaishou.live.lite.comment.view.item.SimpleCommentMessageViewController;
import java.lang.Object;
import android.content.DialogInterface;

public final class h implements DialogInterface$OnDismissListener	// class@000344
{
    public final SimpleCommentMessageViewController b;

    public void h(SimpleCommentMessageViewController p0){
       this.b = p0;
       super();
    }
    public final void onDismiss(DialogInterface p0){
       p0.s = null;
    }
}
