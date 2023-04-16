package g82.l;
import java.lang.Runnable;
import g82.v;
import android.view.View;
import java.lang.Object;
import java.util.Objects;
import android.graphics.Rect;
import android.widget.FrameLayout;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.utility.n;
import android.view.TouchDelegate;

public final class l implements Runnable	// class@002aa9
{
    public final v b;
    public final View c;

    public void l(v p0,View p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       l tb = this.b;
       Objects.requireNonNull(tb);
       Rect rect = new Rect();
       tb.J.getHitRect(rect);
       rect.right = rect.right + n.c(tb.getContext(), 5.00f);
       rect.left = rect.left - n.c(tb.getContext(), 20.00f);
       rect.top = rect.top - n.c(tb.getContext(), 5.00f);
       rect.bottom = rect.bottom + n.c(tb.getContext(), 5.00f);
       this.c.setTouchDelegate(new TouchDelegate(rect, tb.J));
    }
}
