package oe1.l;
import android.view.View$OnTouchListener;
import com.kuaishou.live.common.core.component.comments.combo.LiveComboCommentView;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.util.Objects;
import android.animation.AnimatorSet;

public final class l implements View$OnTouchListener	// class@0034d5
{
    public final LiveComboCommentView b;

    public void l(LiveComboCommentView p0){
       this.b = p0;
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       l tb = this.b;
       Objects.requireNonNull(tb);
       int action = p1.getAction();
       if (action) {
          if (action == 1 || action == 3) {
             tb.n.cancel();
             tb.o.start();
          }
       }else {
          tb.o.cancel();
          tb.n.start();
       }
       return false;
    }
}
