package fg2.d;
import erd.a;
import com.kuaishou.live.core.show.quiz.notice.LiveQuizNoticeDialog;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.refresh.KwaiLoadingView;

public final class d implements a	// class@002952
{
    public final LiveQuizNoticeDialog b;

    public void d(LiveQuizNoticeDialog p0){
       this.b = p0;
    }
    public final void run(){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, LiveQuizNoticeDialog.class, "13")) {
       }else {
          tb.E.setVisibility(8);
       }
       return;
    }
}
