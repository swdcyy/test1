package fg2.e;
import android.os.CountDownTimer;
import com.kuaishou.live.core.show.quiz.notice.LiveQuizNoticeDialog;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Long;

public class e extends CountDownTimer	// class@002953
{
    public final LiveQuizNoticeDialog a;

    public void e(LiveQuizNoticeDialog p0,long p1,long p2){
       this.a = p0;
       super(p1, p2);
    }
    public void onFinish(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       this.a.yh(0);
       return;
    }
    public void onTick(long p0){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, e.class, "1")) {
          return;
       }
       this.a.yh(p0);
       return;
    }
}
