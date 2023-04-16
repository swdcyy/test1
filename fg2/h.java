package fg2.h;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.quiz.notice.LiveQuizQuitNoticeDialog;
import java.lang.Object;
import android.view.View;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;

public final class h implements View$OnClickListener	// class@002956
{
    public final LiveQuizQuitNoticeDialog b;

    public void h(LiveQuizQuitNoticeDialog p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       h tb = this.b;
       tb.dismissAllowingStateLoss();
       LiveQuizQuitNoticeDialog s = tb.s;
       if (s != null) {
          s.onClick(p0);
       }
       return;
    }
}
