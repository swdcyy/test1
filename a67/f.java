package a67.f;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import java.lang.Object;
import android.view.View;
import android.animation.Animator$AnimatorListener;
import a67.h;
import android.view.ViewPropertyAnimator;

public final class f implements PopupInterface$c	// class@000057
{
    public static final f a;

    static {
       f.a = new f();
    }
    public void f(){
       super();
    }
    public final void a(View p0,Animator$AnimatorListener p1){
       p0.setAlpha(0);
       p0.animate().alpha(0x3f800000).setDuration(200).setListener(p1);
    }
}
