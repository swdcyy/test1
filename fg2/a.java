package fg2.a;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.quiz.notice.LiveQuizNoticeDialog;
import java.lang.Object;
import android.view.View;

public final class a implements View$OnClickListener	// class@00294f
{
    public final LiveQuizNoticeDialog b;

    public void a(LiveQuizNoticeDialog p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       this.b.xh();
    }
}
