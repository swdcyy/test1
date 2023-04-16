package fg2.i;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.quiz.notice.LiveQuizQuitNoticeDialog;
import java.lang.Object;
import android.view.View;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;

public final class i implements View$OnClickListener	// class@002957
{
    public final LiveQuizQuitNoticeDialog b;

    public void i(LiveQuizQuitNoticeDialog p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       i tb = this.b;
       tb.dismissAllowingStateLoss();
       LiveQuizQuitNoticeDialog t = tb.t;
       if (t != null) {
          t.onClick(p0);
       }
       return;
    }
}
