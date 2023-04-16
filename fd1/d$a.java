package fd1.d$a;
import com.yxcorp.gifshow.widget.m;
import fd1.d;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.questionnaire.LiveQuestionnaire;
import fd1.d$c;

public class d$a extends m	// class@0022ed
{
    public final d c;

    public void d$a(d p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "1")) {
          return;
       }
       d$a tc = this.c;
       d b = tc.b;
       tc.c.b(b.mQuestionnaireId, b.mQuestionId, "", b.mIsSubmitAnswer, b.mRouteUrl);
       return;
    }
}
