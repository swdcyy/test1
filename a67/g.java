package a67.g;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import java.lang.Object;
import android.view.View;
import android.animation.Animator$AnimatorListener;
import a67.h;
import android.view.ViewPropertyAnimator;

public final class g implements PopupInterface$c	// class@000058
{
    public static final g a;

    static {
       g.a = new g();
    }
    public void g(){
       super();
    }
    public final void a(View p0,Animator$AnimatorListener p1){
       p0.animate().alpha(0).setDuration(200).setListener(p1);
    }
}
