package fg2.c;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.quiz.notice.LiveQuizNoticeDialog;
import com.kuaishou.live.core.show.quiz.model.LiveQuizNoticeInfoResponse;
import java.lang.Object;
import android.view.View;
import z1.a;

public final class c implements View$OnClickListener	// class@002951
{
    public final LiveQuizNoticeDialog b;
    public final LiveQuizNoticeInfoResponse c;

    public void c(LiveQuizNoticeDialog p0,LiveQuizNoticeInfoResponse p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       this.b.v.accept(this.c.mQuizStrategyUrl);
    }
}
