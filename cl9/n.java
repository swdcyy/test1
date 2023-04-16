package cl9.n;
import android.content.DialogInterface$OnShowListener;
import cl9.y;
import java.lang.Object;
import android.content.DialogInterface;
import android.view.View;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import com.yxcorp.utility.n;
import ek9.t0;
import java.util.List;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;
import java.util.Iterator;
import xk9.d;
import kk9.d;
import com.yxcorp.gifshow.comment.utils.e;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;

public final class n implements DialogInterface$OnShowListener	// class@00064e
{
    public final y b;

    public void n(y p0){
       this.b = p0;
    }
    public final void onShow(DialogInterface p0){
       n tb = this.b;
       n.Y(tb.G.b(R.id.comment_float_background), 0, true);
       tb.w.g();
       Iterator iterator = tb.M.Lh().iterator();
       while (iterator.hasNext()) {
          iterator.next().f(tb.F.e(), tb.F.g());
       }
       return;
    }
}
